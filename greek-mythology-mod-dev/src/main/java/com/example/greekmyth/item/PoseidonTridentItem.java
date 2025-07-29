package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import java.util.function.Consumer;

public class PoseidonTridentItem extends Item {
    private static final Identifier COOLDOWN_ID = Identifier.of("greekmyth", "poseidon_trident_cooldown");
    private static final int COOLDOWN_TICKS = 20 * 20; // 20 seconds
    private static final int MAX_CHARGES = 3;
    private static final double TIDAL_WAVE_RADIUS = 8.0;
    private static final double WATER_PROJECTILE_RANGE = 30.0;
    private static final int STORM_RADIUS = 50;

    public PoseidonTridentItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("PoseidonTridentItem constructor called - MAX_CHARGES: {}", MAX_CHARGES);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        // Calculate current charges
        int currentDamage = stack.getDamage();
        int currentCharges = MAX_CHARGES - currentDamage;
        if (currentCharges < 0) currentCharges = 0;
        if (currentCharges > MAX_CHARGES) currentCharges = MAX_CHARGES;
        
        GreekMythologyMod.LOGGER.info("POSEIDON TRIDENT TOOLTIP CALLED - Type: {}", type);
        
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("🌊 The trident of the Lord of the Seas").formatted(Formatting.GOLD, Formatting.BOLD));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Right-click to control water and create storms").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("Sneak + Right-click for storm at sea").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Charges: " + currentCharges + "/" + MAX_CHARGES + " (20s cooldown when empty)").formatted(Formatting.AQUA));
        tooltip.accept(Text.literal("Infinite charges near water or in rain").formatted(Formatting.AQUA));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Damage: 8.0 (enhanced in water)").formatted(Formatting.RED));
        tooltip.accept(Text.literal("Water breathing and night vision underwater").formatted(Formatting.RED));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Legendary Weapon").formatted(Formatting.LIGHT_PURPLE, Formatting.BOLD));
    }
    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = super.getDefaultStack();
        stack.setDamage(0); // Ensure new items start with full charges
        GreekMythologyMod.LOGGER.info("PoseidonTridentItem getDefaultStack called - setting damage to 0");
        return stack;
    }

    // Add weapon damage functionality
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Apply Netherite sword-level damage (8.0 damage)
        if (attacker.getWorld() instanceof ServerWorld serverWorld) {
            target.damage(serverWorld, serverWorld.getDamageSources().generic(), 8.0f);
        }
    }



    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        GreekMythologyMod.LOGGER.info("=== POSEIDON TRIDENT USE METHOD CALLED ===");
        GreekMythologyMod.LOGGER.info("World isClient: {}", world.isClient);
        GreekMythologyMod.LOGGER.info("Player: {}", user.getName().getString());
        GreekMythologyMod.LOGGER.info("Hand: {}", hand);
        GreekMythologyMod.LOGGER.info("Stack: {}", stack.toString());
        
        if (world.isClient) {
            GreekMythologyMod.LOGGER.info("Poseidon Trident used on CLIENT side");
            return ActionResult.SUCCESS;
        }

        ServerPlayerEntity serverUser = (ServerPlayerEntity) user;
        ServerWorld serverWorld = (ServerWorld) world;

        // Check for infinite abilities near water or in rain
        boolean isNearWater = isNearWater(world, user.getBlockPos());
        boolean isInWater = user.isSubmergedInWater();
        boolean isRaining = world.isRaining();
        boolean infinite = isNearWater || isInWater || isRaining;
        
        // Get current state
        boolean isOnCooldown = user.getItemCooldownManager().isCoolingDown(stack);
        int currentDamage = stack.getDamage();
        
        // Fix the max damage issue - if maxDamage is wrong, reset the item
        if (stack.getMaxDamage() != 3) {
            GreekMythologyMod.LOGGER.info("PoseidonTridentItem use - fixing max damage from {} to 3", stack.getMaxDamage());
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
        GreekMythologyMod.LOGGER.info("PoseidonTridentItem use - Damage: {}, MaxDamage: {}, Charges: {}/{}, Stack: {}", 
            currentDamage, stack.getMaxDamage(), currentCharges, MAX_CHARGES, stack.toString());
        GreekMythologyMod.LOGGER.info("PoseidonTridentItem use - Infinite abilities: NearWater={}, InWater={}, Raining={}, Infinite={}", 
            isNearWater, isInWater, isRaining, infinite);
        
        // Handle different abilities based on sneak state
        if (user.isSneaking()) {
            // Storm at Sea - Weather control near water
            if (infinite || currentCharges > 0) {
                GreekMythologyMod.LOGGER.info("STORM AT SEA: Activating weather control");
                boolean weatherControlSuccess = activateStormAtSea(serverWorld, user.getBlockPos());
                
                // Only consume charge if weather control was successful
                if (weatherControlSuccess && !infinite) {
                    consumeCharge(stack, currentDamage, user);
                }
                
                return ActionResult.SUCCESS;
            }
        } else {
            // Check if player is looking at a target for water projectile
            Vec3d start = user.getEyePos();
            Vec3d end = start.add(user.getRotationVecClient().multiply(WATER_PROJECTILE_RANGE));
            
            BlockHitResult hitResult = world.raycast(new RaycastContext(start, end, 
                RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, user));
            
            if (hitResult.getType() == HitResult.Type.BLOCK) {
                // Water Projectile - Shoot water blasts for ranged combat
                if (infinite || currentCharges > 0) {
                    GreekMythologyMod.LOGGER.info("WATER PROJECTILE: Shooting water blast");
                    shootWaterProjectile(serverWorld, user, hitResult.getPos());
                    
                    if (!infinite) {
                        consumeCharge(stack, currentDamage, user);
                    }
                    
                    return ActionResult.SUCCESS;
                }
            } else {
                // Tidal Waves - Create waves that push entities
                if (infinite || currentCharges > 0) {
                    GreekMythologyMod.LOGGER.info("TIDAL WAVES: Creating waves that push entities");
                    createTidalWaves(serverWorld, user);
                    
                    if (!infinite) {
                        consumeCharge(stack, currentDamage, user);
                    }
                    
                    return ActionResult.SUCCESS;
                }
            }
        }

        GreekMythologyMod.LOGGER.info("=== POSEIDON TRIDENT COMPLETE ===");
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

    private boolean isNearWater(World world, BlockPos pos) {
        // Check in a 5-block radius for water
        for (int x = -5; x <= 5; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -5; z <= 5; z++) {
                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState state = world.getBlockState(checkPos);
                    if (state.getFluidState().isIn(FluidTags.WATER)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void createTidalWaves(ServerWorld world, PlayerEntity user) {
        Vec3d userPos = user.getPos();
        
        // Create multiple expanding waves
        for (int wave = 1; wave <= 3; wave++) {
            double radius = TIDAL_WAVE_RADIUS * wave / 3.0;
            double force = 2.0 * wave; // Increasing force for each wave
            
            // Find entities in the wave radius
            Box waveBox = new Box(
                userPos.x - radius, userPos.y - 2, userPos.z - radius,
                userPos.x + radius, userPos.y + 4, userPos.z + radius
            );
            
            world.getOtherEntities(user, waveBox, entity -> 
                entity instanceof LivingEntity && entity != user).forEach(entity -> {
                LivingEntity livingEntity = (LivingEntity) entity;
                Vec3d entityPos = livingEntity.getPos();
                Vec3d direction = entityPos.subtract(userPos).normalize();
                
                // Apply push force
                Vec3d pushForce = direction.multiply(force);
                livingEntity.setVelocity(livingEntity.getVelocity().add(pushForce));
                livingEntity.velocityModified = true;
                
                // Apply some damage
                livingEntity.damage(world, world.getDamageSources().drown(), 2.0f);
                
                GreekMythologyMod.LOGGER.info("TIDAL WAVE: Pushed entity {} with force {}", 
                    livingEntity.getName().getString(), force);
            });
            
            // Create water particle effects
            for (int i = 0; i < 20; i++) {
                double angle = world.random.nextDouble() * 2 * Math.PI;
                double distance = world.random.nextDouble() * radius;
                double x = userPos.x + Math.cos(angle) * distance;
                double z = userPos.z + Math.sin(angle) * distance;
                double y = userPos.y + world.random.nextDouble() * 2;
                
                world.spawnParticles(ParticleTypes.SPLASH, x, y, z, 1, 0, 0, 0, 0.1);
            }
        }
        
        // Play water splash sound
        world.playSound(null, userPos.x, userPos.y, userPos.z, 
            SoundEvents.ENTITY_PLAYER_SPLASH, SoundCategory.PLAYERS, 1.0f, 0.8f);
    }

    private void shootWaterProjectile(ServerWorld world, PlayerEntity user, Vec3d targetPos) {
        Vec3d startPos = user.getEyePos();
        
        // Create a trident projectile entity
        TridentEntity trident = new TridentEntity(world, user, new ItemStack(Items.TRIDENT)) {
            @Override
            protected void onEntityHit(EntityHitResult entityHitResult) {
                super.onEntityHit(entityHitResult);
                // Despawn immediately after hitting an entity
                this.discard();
            }
            
            @Override
            protected void onBlockHit(BlockHitResult blockHitResult) {
                super.onBlockHit(blockHitResult);
                // Despawn immediately after hitting a block
                this.discard();
            }
        };
        
        trident.setPosition(startPos);
        
        // Use vanilla trident throwing method - this automatically handles orientation correctly
        // Parameters: user, pitch, yaw, roll, speed, divergence
        trident.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 2.0F, 0.0F);
        
        // Make it completely straight by disabling gravity
        trident.setNoGravity(true);
        
        world.spawnEntity(trident);
        
        // Play trident throw sound
        world.playSound(null, startPos.x, startPos.y, startPos.z, 
            SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.PLAYERS, 1.0f, 1.2f);
        
        GreekMythologyMod.LOGGER.info("TRIDENT PROJECTILE: Shot trident using vanilla throwing method");
    }

    private boolean activateStormAtSea(ServerWorld world, BlockPos center) {
        // Check if player is near water before allowing weather control
        if (!isNearWater(world, center)) {
            GreekMythologyMod.LOGGER.info("STORM AT SEA: No water nearby, weather control failed");
            // Play a failure sound
            world.playSound(null, center.getX(), center.getY(), center.getZ(), 
                SoundEvents.BLOCK_NOTE_BLOCK_BASS, SoundCategory.PLAYERS, 0.5f, 0.5f);
            return false; // Return false to indicate failure
        }
        
        // Check if it's already thundering - if so, clear the weather
        if (world.isThundering()) {
            world.setWeather(6000, 0, false, false); // 5 minutes of clear weather
            GreekMythologyMod.LOGGER.info("STORM AT SEA: Cleared weather - stopped rain and thunder");
            
            // Play a different sound for clearing weather
            world.playSound(null, center.getX(), center.getY(), center.getZ(), 
                SoundEvents.ENTITY_PLAYER_LEVELUP, SoundCategory.PLAYERS, 1.0f, 1.5f);
        } else {
            // Create a storm (water requirement satisfied)
            // Set weather to rain and thunder for 5 minutes
            world.setWeather(0, 6000, true, true); // 5 minutes of rain and thunder
            
            GreekMythologyMod.LOGGER.info("STORM AT SEA: Created storm with rain and thunder");
            
            // Play thunder sound
            world.playSound(null, center.getX(), center.getY(), center.getZ(), 
                SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f);
        }
        
        return true; // Return true to indicate success
    }
} 