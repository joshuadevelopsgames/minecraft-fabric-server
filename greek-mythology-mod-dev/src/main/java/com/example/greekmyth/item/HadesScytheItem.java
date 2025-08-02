package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Heightmap;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.RegistryKey;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.item.v1.FabricItem;

public class HadesScytheItem extends Item implements FabricItem {
    private static final Identifier COOLDOWN_ID = Identifier.of("greekmyth", "hades_scythe_cooldown");
    private static final int COOLDOWN_TICKS = 25 * 20; // 25 seconds
    private static final int MAX_CHARGES = 4;
    private static final double SOUL_HARVEST_RADIUS = 10.0;
    private static final double DEATH_MIST_RADIUS = 8.0;
    private static final int UNDERWORLD_PORTAL_RANGE = 50;

    public HadesScytheItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("HadesScytheItem constructor called - MAX_CHARGES: {}", MAX_CHARGES);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getDefaultStack() {
        return super.getDefaultStack();
    }

    // Add weapon damage functionality
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker.getWorld() instanceof ServerWorld serverWorld) {
            // Calculate soul-enhanced damage using NBT-stored values from the scythe
            float baseDamage = 4.0f;
            int soulBonus = getSoulDamageBonus(stack); // Use NBT-stored soul count from this scythe
            
            float totalDamage = baseDamage + soulBonus;
            
            GreekMythologyMod.LOGGER.info("HADES SCYTHE ATTACK: Base Damage: {}, Soul Bonus: {} (from NBT), Total Damage: {}", 
                baseDamage, soulBonus, totalDamage);
            
            target.damage(serverWorld, serverWorld.getDamageSources().generic(), totalDamage);
            
            // Check if this was a critical hit (player falling and not on ground)
            boolean isCriticalHit = false;
            if (attacker instanceof PlayerEntity player) {
                // Critical hit conditions: falling, not on ground, not in water, not climbing, not riding
                isCriticalHit = player.getVelocity().y < 0.0 && 
                               !player.isOnGround() && 
                               !player.isTouchingWater() && 
                               !player.isClimbing() && 
                               !player.hasVehicle();
            }
            
            // Only add wither effect on critical hits
            if (isCriticalHit) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 1)); // 3 seconds of Wither II on crit
                GreekMythologyMod.LOGGER.info("HADES SCYTHE: Critical hit! Applied wither effect");
                
                // Spawn special critical hit particles
                for (int i = 0; i < 10; i++) {
                    double x = target.getX() + (serverWorld.random.nextDouble() - 0.5) * 1.5;
                    double y = target.getY() + serverWorld.random.nextDouble() * 1.5;
                    double z = target.getZ() + (serverWorld.random.nextDouble() - 0.5) * 1.5;
                    serverWorld.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 1, 0, 0, 0, 0.1);
                }
            }
            
            // Transform skeletons into wither skeletons when hit with wither effect (only on critical hits now)
            if (target.getType() == EntityType.SKELETON && attacker instanceof ServerPlayerEntity && isCriticalHit) {
                // Transform skeleton into wither skeleton pet
                transformSkeletonToWitherSkeleton(serverWorld, target, (ServerPlayerEntity) attacker);
            }
        }
    }
    
        private void transformSkeletonToWitherSkeleton(ServerWorld world, LivingEntity skeleton, ServerPlayerEntity owner) {
        // Create a wolf entity that will be transformed into an Undead Warrior
        WolfEntity wolf = EntityType.WOLF.create(world, net.minecraft.entity.SpawnReason.NATURAL);
        if (wolf != null) {
            wolf.setPosition(skeleton.getPos());
            wolf.setYaw(skeleton.getYaw());
            wolf.setPitch(skeleton.getPitch());
            wolf.setVelocity(skeleton.getVelocity());

            // Set up the wolf as a pet
            wolf.setOwner(owner);
            wolf.setTamed(true, true);
            wolf.setCustomName(Text.literal("§6" + owner.getName().getString() + "'s Undead Warrior"));
            wolf.setCustomNameVisible(true);

            // Remove the original skeleton
            skeleton.discard();

            // Spawn the wolf
            world.spawnEntity(wolf);
            
            // Add a glowing effect to make it look more undead
            wolf.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0, false, false));
            
            // Add transformation effects
            for (int i = 0; i < 20; i++) {
                double x = skeleton.getX() + (world.random.nextDouble() - 0.5) * 2;
                double y = skeleton.getY() + world.random.nextDouble() * 2;
                double z = skeleton.getZ() + (world.random.nextDouble() - 0.5) * 2;
                world.spawnParticles(ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
                world.spawnParticles(ParticleTypes.SMOKE, x, y, z, 1, 0, 0, 0, 0.05);
            }
            
            // Play transformation sound
            world.playSound(null, skeleton.getX(), skeleton.getY(), skeleton.getZ(),
                SoundEvents.ENTITY_WITHER_AMBIENT, SoundCategory.PLAYERS, 1.0f, 1.2f);
            
            GreekMythologyMod.LOGGER.info("HADES SCYTHE: Transformed skeleton into Undead Warrior at ({}, {}, {}) for player {}",
                skeleton.getX(), skeleton.getY(), skeleton.getZ(), owner.getName().getString());
        }
    }
    
    private void makeWitherSkeletonPet(net.minecraft.entity.mob.WitherSkeletonEntity witherSkeleton, ServerPlayerEntity owner) {
        // Set custom name that's easy to identify
        witherSkeleton.setCustomName(Text.literal("§6" + owner.getName().getString() + "'s Enhanced Wither Skeleton"));
        witherSkeleton.setCustomNameVisible(true);
        
        // Clear current target and attacking state
        witherSkeleton.setTarget(null);
        witherSkeleton.setAttacking(false);
        
        // Make the wither skeleton persistent so it doesn't despawn
        witherSkeleton.setPersistent();
        
        // TEMPORARY: Make it peaceful until we get proper targeting working
        witherSkeleton.setSilent(true);
        
        // Tag the wither skeleton as a pet for the datapack system
        witherSkeleton.addCommandTag("GreekPet.Pet");
        witherSkeleton.addCommandTag("GreekPet.WitherSkeleton");
        
        GreekMythologyMod.LOGGER.info("HADES SCYTHE: Created enhanced wither skeleton pet for player {} (peaceful mode)", owner.getName().getString());
    }
    
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        GreekMythologyMod.LOGGER.info("=== HADES SCYTHE USE METHOD CALLED ===");
        GreekMythologyMod.LOGGER.info("World isClient: {}", world.isClient);
        GreekMythologyMod.LOGGER.info("Player: {}", user.getName().getString());
        GreekMythologyMod.LOGGER.info("Hand: {}", hand);
        GreekMythologyMod.LOGGER.info("Stack: {}", stack.toString());

        if (world.isClient) {
            GreekMythologyMod.LOGGER.info("Hades Scythe used on CLIENT side");
            return ActionResult.SUCCESS;
        }

        ServerPlayerEntity serverUser = (ServerPlayerEntity) user;
        ServerWorld serverWorld = (ServerWorld) world;

        // Check for infinite abilities in the Nether (Hades' domain)
        boolean isInNether = world.getRegistryKey().getValue().getNamespace().equals("minecraft") && 
                           world.getRegistryKey().getValue().getPath().equals("the_nether");
        boolean isNearLava = isNearLava(world, user.getBlockPos());
        boolean infinite = isInNether || isNearLava;

        // Get current state
        boolean isOnCooldown = user.getItemCooldownManager().isCoolingDown(stack);
        int currentDamage = stack.getDamage();

        // Fix the max damage issue - if maxDamage is wrong, reset the item
        if (stack.getMaxDamage() != 4) {
            GreekMythologyMod.LOGGER.info("HadesScytheItem use - fixing max damage from {} to 4", stack.getMaxDamage());
            stack.setDamage(0); // Reset to full charges
            currentDamage = 0;
        }

        // Check if cooldown has expired and reset charges if needed
        if (currentDamage >= MAX_CHARGES && !isOnCooldown) {
            GreekMythologyMod.LOGGER.info("COOLDOWN EXPIRED: Resetting charges from {} to 0", currentDamage);
            stack.setDamage(0); // Reset to full charges
            currentDamage = 0;
        }

        // Calculate charges correctly
        int currentCharges = MAX_CHARGES - currentDamage;

        // Log the actual damage and max damage values
        GreekMythologyMod.LOGGER.info("HadesScytheItem use - Damage: {}, MaxDamage: {}, Charges: {}/{}, Stack: {}",
            currentDamage, stack.getMaxDamage(), currentCharges, MAX_CHARGES, stack.toString());

        // Handle different abilities based on sneak state
        if (user.isSneaking()) {
            // Check if player has Inferno Pearl in inventory
            boolean hasInfernoPearl = false;
            for (int i = 0; i < user.getInventory().size(); i++) {
                ItemStack pearlStack = user.getInventory().getStack(i);
                if (pearlStack.isOf(GreekItems.INFERNO_PEARL)) {
                    hasInfernoPearl = true;
                    break;
                }
            }
            
            if (hasInfernoPearl) {
                // Consume one Inferno Pearl
                for (int i = 0; i < user.getInventory().size(); i++) {
                    ItemStack pearlStack = user.getInventory().getStack(i);
                    if (pearlStack.isOf(GreekItems.INFERNO_PEARL)) {
                        pearlStack.decrement(1);
                        break;
                    }
                }
                
                // Underworld Portal - Create a portal to the Nether
                GreekMythologyMod.LOGGER.info("UNDERWORLD PORTAL: Creating portal to the Nether with Inferno Pearl");
                createUnderworldPortal(serverWorld, user);
                return ActionResult.SUCCESS;
            } else {
                // No Inferno Pearl - show message
                if (!world.isClient()) {
                    user.sendMessage(Text.literal("§cThe scythe rejects your will — an Inferno Pearl is required."), false);
                }
                return ActionResult.FAIL;
            }
        } else {
            // Soul Harvest - Harvest souls from the target area (works anywhere)
            if (infinite || currentCharges > 0) {
                GreekMythologyMod.LOGGER.info("SOUL HARVEST: Harvesting souls from target area");
                harvestSouls(serverWorld, user, user.getPos());

                if (!infinite) {
                    consumeCharge(stack, currentDamage, user);
                }

                return ActionResult.SUCCESS;
            }
        }

        GreekMythologyMod.LOGGER.info("=== HADES SCYTHE COMPLETE ===");
        return ActionResult.SUCCESS;
    }

    private void consumeCharge(ItemStack stack, int currentDamage, PlayerEntity user) {
        int newDamage = currentDamage + 1;
        stack.setDamage(newDamage);
        GreekMythologyMod.LOGGER.info("Charge consumed (damage: {} -> {})", currentDamage, newDamage);

        // Set cooldown when we run out of charges
        if (newDamage >= MAX_CHARGES) {
            user.getItemCooldownManager().set(stack, COOLDOWN_TICKS);
            GreekMythologyMod.LOGGER.info("COOLDOWN SET: {} ticks (all charges used)", COOLDOWN_TICKS);
        }
    }

    private boolean isNearLava(World world, BlockPos pos) {
        // Check in a 8-block radius for lava
        for (int x = -8; x <= 8; x++) {
            for (int y = -4; y <= 4; y++) {
                for (int z = -8; z <= 8; z++) {
                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState state = world.getBlockState(checkPos);
                    if (state.getFluidState().isIn(FluidTags.LAVA)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void harvestSouls(ServerWorld world, PlayerEntity user, Vec3d targetPos) {
        // Find entities in the harvest radius
        Box harvestBox = new Box(
            targetPos.x - SOUL_HARVEST_RADIUS, targetPos.y - 2, targetPos.z - SOUL_HARVEST_RADIUS,
            targetPos.x + SOUL_HARVEST_RADIUS, targetPos.y + 4, targetPos.z + SOUL_HARVEST_RADIUS
        );

        for (net.minecraft.entity.Entity entity : world.getOtherEntities(user, harvestBox, entity ->
            entity instanceof LivingEntity && entity != user)) {
            LivingEntity livingEntity = (LivingEntity) entity;
            
            // Apply wither effect and damage
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 120, 2)); // 6 seconds of Wither III
            livingEntity.damage(world, world.getDamageSources().wither(), 4.0f);

            // Soul harvesting will happen on death via SoulDeathEvents
            // No need to harvest souls on hit - only on actual death

            // Create soul particle effects
            for (int i = 0; i < 10; i++) {
                double x = livingEntity.getX() + (world.random.nextDouble() - 0.5) * 2;
                double y = livingEntity.getY() + world.random.nextDouble() * 2;
                double z = livingEntity.getZ() + (world.random.nextDouble() - 0.5) * 2;
                world.spawnParticles(ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
                world.spawnParticles(ParticleTypes.SMOKE, x, y, z, 1, 0, 0, 0, 0.05);
            }

            GreekMythologyMod.LOGGER.info("SCYTHE WITHER: Applied wither effect to entity {}",
                livingEntity.getName().getString());
        }

        // Play soul harvest sound
        world.playSound(null, targetPos.x, targetPos.y, targetPos.z,
            SoundEvents.ENTITY_WITHER_AMBIENT, SoundCategory.PLAYERS, 1.0f, 0.8f);
    }
    


    private void createDeathMist(ServerWorld world, PlayerEntity user) {
        Vec3d userPos = user.getPos();

        // Create expanding death mist
        for (int wave = 1; wave <= 3; wave++) {
            double radius = DEATH_MIST_RADIUS * wave / 3.0;

            // Find entities in the mist radius
            Box mistBox = new Box(
                userPos.x - radius, userPos.y - 2, userPos.z - radius,
                userPos.x + radius, userPos.y + 4, userPos.z + radius
            );

            world.getOtherEntities(user, mistBox, entity ->
                entity instanceof LivingEntity && entity != user).forEach(entity -> {
                LivingEntity livingEntity = (LivingEntity) entity;
                
                // Apply wither effect and slow movement
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 80, 1)); // 4 seconds of Wither II
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1)); // 3 seconds of Slowness II

                GreekMythologyMod.LOGGER.info("DEATH MIST: Affected entity {} with wither and slowness",
                    livingEntity.getName().getString());
            });

            // Create death mist particle effects
            for (int i = 0; i < 30; i++) {
                double angle = world.random.nextDouble() * 2 * Math.PI;
                double distance = world.random.nextDouble() * radius;
                double x = userPos.x + Math.cos(angle) * distance;
                double z = userPos.z + Math.sin(angle) * distance;
                double y = userPos.y + world.random.nextDouble() * 3;

                world.spawnParticles(ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
                world.spawnParticles(ParticleTypes.SMOKE, x, y, z, 1, 0, 0, 0, 0.05);
            }
        }

        // Play death mist sound
        world.playSound(null, userPos.x, userPos.y, userPos.z,
            SoundEvents.ENTITY_WITHER_AMBIENT, SoundCategory.PLAYERS, 1.0f, 1.2f);
    }

    private void createUnderworldPortal(ServerWorld world, PlayerEntity user) {
        Vec3d userPos = user.getPos();
        ServerPlayerEntity serverUser = (ServerPlayerEntity) user;
        
        // Determine target dimension and position
        RegistryKey<World> targetDimension;
        Vec3d targetPos;
        String dimensionName;
        
        if (world.getRegistryKey().getValue().getPath().equals("the_nether")) {
            // Currently in Nether, teleport to Overworld
            targetDimension = World.OVERWORLD;
            targetPos = new Vec3d(userPos.x * 8, userPos.y, userPos.z * 8); // Scale coordinates
            dimensionName = "Overworld";
        } else {
            // Currently in Overworld, teleport to Nether
            targetDimension = World.NETHER;
            targetPos = new Vec3d(userPos.x / 8, userPos.y, userPos.z / 8); // Scale coordinates
            dimensionName = "Nether";
        }
        
        // Get the target world
        ServerWorld targetWorld = world.getServer().getWorld(targetDimension);
        if (targetWorld == null) {
            GreekMythologyMod.LOGGER.error("UNDERWORLD PORTAL: Could not get target world for dimension {}", targetDimension);
            return;
        }
        
        // Find a safe spawn position in the target world
        BlockPos targetBlockPos = new BlockPos((int) targetPos.x, (int) targetPos.y, (int) targetPos.z);
        BlockPos spawnPos = findSafeSpawnPosition(targetWorld, targetBlockPos);
        
        // Create portal particles at current location
        for (int i = 0; i < 50; i++) {
            double angle = world.random.nextDouble() * 2 * Math.PI;
            double distance = world.random.nextDouble() * 5;
            double x = userPos.x + Math.cos(angle) * distance;
            double z = userPos.z + Math.sin(angle) * distance;
            double y = userPos.y + world.random.nextDouble() * 4;

            world.spawnParticles(ParticleTypes.PORTAL, x, y, z, 1, 0, 0, 0, 0.1);
            world.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 1, 0, 0, 0, 0.1);
        }
        
        // Play portal sound
        world.playSound(null, userPos.x, userPos.y, userPos.z,
            SoundEvents.BLOCK_PORTAL_TRIGGER, SoundCategory.PLAYERS, 1.0f, 0.8f);
        
        // Teleport to the safe spawn position
        try {
            serverUser.teleport(targetWorld, 
                spawnPos.getX() + 0.5, 
                spawnPos.getY() + 1, 
                spawnPos.getZ() + 0.5, 
                java.util.Set.of(), 0.0f, 0.0f, true);
            
            GreekMythologyMod.LOGGER.info("UNDERWORLD PORTAL: Teleported {} to {} at safe position ({}, {}, {})", 
                user.getName().getString(), dimensionName, spawnPos.getX(), spawnPos.getY(), spawnPos.getZ());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("UNDERWORLD PORTAL: Failed to teleport player: {}", e.getMessage());
        }
        
        // Create arrival particles
        for (int i = 0; i < 30; i++) {
            double x = spawnPos.getX() + 0.5 + (world.random.nextDouble() - 0.5) * 3;
            double y = spawnPos.getY() + 1 + world.random.nextDouble() * 2;
            double z = spawnPos.getZ() + 0.5 + (world.random.nextDouble() - 0.5) * 3;
            
            targetWorld.spawnParticles(ParticleTypes.PORTAL, x, y, z, 1, 0, 0, 0, 0.1);
            targetWorld.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 1, 0, 0, 0, 0.1);
        }
        
        // Apply effects based on destination
        if (targetDimension == World.NETHER) {
            // Going to Nether - give fire resistance and night vision
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0)); // 30 seconds
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400, 0)); // 20 seconds
        } else {
            // Going to Overworld - give regeneration
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1)); // 10 seconds of Regen II
        }
        
        // Play arrival sound
        targetWorld.playSound(null, spawnPos.getX() + 0.5, spawnPos.getY() + 1, spawnPos.getZ() + 0.5,
            SoundEvents.BLOCK_PORTAL_TRAVEL, SoundCategory.PLAYERS, 1.0f, 1.2f);

        GreekMythologyMod.LOGGER.info("UNDERWORLD PORTAL: Teleported {} from {} to {} at position ({}, {}, {})", 
            user.getName().getString(), world.getRegistryKey().getValue().getPath(), 
            dimensionName, spawnPos.getX(), spawnPos.getY(), spawnPos.getZ());
    }
    
    private BlockPos findSafeSpawnPosition(ServerWorld world, BlockPos targetPos) {
        // If we're in the Overworld, find a good surface position
        if (world.getRegistryKey().getValue().getPath().equals("overworld")) {
            // Start from a reasonable height and work our way up
            BlockPos safePos = new BlockPos(targetPos.getX(), 64, targetPos.getZ());
            
            // Look for a safe position starting from Y=64
            while (safePos.getY() < 256) {
                BlockState blockState = world.getBlockState(safePos);
                BlockState aboveState = world.getBlockState(safePos.up());
                BlockState aboveAboveState = world.getBlockState(safePos.up(2));
                
                // Check if this position is safe (solid ground below, air above)
                if (blockState.isSolidBlock(world, safePos) && 
                    !blockState.getFluidState().isIn(FluidTags.LAVA) &&
                    aboveState.isAir() && 
                    aboveAboveState.isAir()) {
                    return safePos;
                }
                
                safePos = safePos.up();
            }
            
            // Fallback to a reasonable height
            return new BlockPos(targetPos.getX(), 64, targetPos.getZ());
        } else {
            // For Nether, find ground level starting from below
            BlockPos safePos = new BlockPos(targetPos.getX(), 120, targetPos.getZ());
            
            // Start from high up and work our way down to find ground
            while (safePos.getY() > 32) { // Don't go below Y=32 in Nether
                BlockState blockState = world.getBlockState(safePos);
                BlockState aboveState = world.getBlockState(safePos.up());
                BlockState aboveAboveState = world.getBlockState(safePos.up(2));
                
                // Check if this position is safe (solid ground below, air above)
                if (blockState.isSolidBlock(world, safePos) && 
                    !blockState.getFluidState().isIn(FluidTags.LAVA) &&
                    aboveState.isAir() && 
                    aboveAboveState.isAir()) {
                    return safePos;
                }
                
                safePos = safePos.down();
            }
            
            // Fallback to a reasonable Nether height
            return new BlockPos(targetPos.getX(), 64, targetPos.getZ());
        }
    }

    private int getSoulDamageBonus(ItemStack scytheStack) {
        // Use the same method as SoulItem - read bonus from damage value
        int currentDamage = scytheStack.getDamage();
        
        // If damage is in the soul bonus range (1000-1012), extract the bonus
        // Format: 1000 + soulBonus (e.g., 1001 = 1 soul bonus, 1012 = 12 soul bonus)
        if (currentDamage >= 1000 && currentDamage <= 1012) {
            return currentDamage - 1000;
        }
        
        return 0;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, net.minecraft.component.type.TooltipDisplayComponent displayComponent, java.util.function.Consumer<Text> tooltip, net.minecraft.item.tooltip.TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        float baseDamage = 4.0f;
        int currentSoulBonus = getSoulDamageBonus(stack);
        float totalDamage = baseDamage + currentSoulBonus;
        
        tooltip.accept(Text.literal(""));
        tooltip.accept(Text.literal("💀 The scythe of the Lord of the Underworld").formatted(net.minecraft.util.Formatting.GOLD, net.minecraft.util.Formatting.BOLD));
        tooltip.accept(Text.literal(""));
        
        // Live damage display showing actual combat values
        tooltip.accept(Text.literal("⚔️ BASE DAMAGE: " + String.format("%.1f", baseDamage)).formatted(net.minecraft.util.Formatting.RED, net.minecraft.util.Formatting.BOLD));
        
        // Soul consumption progress with visual indicator
        String soulProgressColor = currentSoulBonus >= 12 ? "§6" : "§5"; // Gold if maxed, Purple if not
        String maxIndicator = currentSoulBonus >= 12 ? " §6§l[MAX]" : "";
        tooltip.accept(Text.literal("💀 SOULS CONSUMED: " + soulProgressColor + currentSoulBonus + "/12" + maxIndicator).formatted(net.minecraft.util.Formatting.DARK_PURPLE, net.minecraft.util.Formatting.BOLD));
        
        tooltip.accept(Text.literal("💙 SOUL BONUS: +" + String.format("%.1f", (float)currentSoulBonus)).formatted(net.minecraft.util.Formatting.AQUA, net.minecraft.util.Formatting.BOLD));
        tooltip.accept(Text.literal("⚡ LIVE DAMAGE: " + String.format("%.1f", totalDamage) + " (actual combat damage)").formatted(net.minecraft.util.Formatting.GREEN, net.minecraft.util.Formatting.BOLD));
        tooltip.accept(Text.literal(""));
        tooltip.accept(Text.literal("Right-click to harvest souls from nearby entities").formatted(net.minecraft.util.Formatting.YELLOW));
        tooltip.accept(Text.literal("Sneak + Right-click to open underworld portal").formatted(net.minecraft.util.Formatting.YELLOW));
        tooltip.accept(Text.literal(""));
        tooltip.accept(Text.literal("💥 Critical hits apply Wither II").formatted(net.minecraft.util.Formatting.DARK_PURPLE));
        tooltip.accept(Text.literal("🐺 Critical hits transform skeletons into pets").formatted(net.minecraft.util.Formatting.GREEN));
        tooltip.accept(Text.literal(""));
        tooltip.accept(Text.literal("🍽️ Consume soul items to increase damage permanently").formatted(net.minecraft.util.Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Infinite abilities near lava or in the Nether").formatted(net.minecraft.util.Formatting.RED));
        tooltip.accept(Text.literal(""));
        tooltip.accept(Text.literal("Legendary Weapon").formatted(net.minecraft.util.Formatting.LIGHT_PURPLE, net.minecraft.util.Formatting.BOLD));
    }

} 