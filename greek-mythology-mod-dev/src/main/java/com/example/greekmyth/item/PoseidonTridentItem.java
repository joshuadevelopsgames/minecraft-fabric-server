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
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;

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

        // Check for infinite abilities near water
        boolean isNearWater = isNearWater(world, user.getBlockPos());
        boolean isInWater = user.isSubmergedInWater();
        boolean infinite = isNearWater || isInWater;
        
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
        
        // Handle different abilities based on sneak state
        if (user.isSneaking()) {
            // Storm at Sea - Weather control near water
            if (infinite || currentCharges > 0) {
                GreekMythologyMod.LOGGER.info("STORM AT SEA: Activating weather control");
                activateStormAtSea(serverWorld, user.getBlockPos());
                
                if (!infinite) {
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
        Vec3d direction = targetPos.subtract(startPos).normalize();
        
        // Create a water projectile entity (using snowball as base)
        SnowballEntity projectile = new SnowballEntity(world, user, new ItemStack(Items.WATER_BUCKET));
        projectile.setPosition(startPos);
        projectile.setVelocity(direction.multiply(1.5)); // Faster than normal snowball
        
        world.spawnEntity(projectile);
        
        // Play water sound
        world.playSound(null, startPos.x, startPos.y, startPos.z, 
            SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.PLAYERS, 1.0f, 1.2f);
        
        GreekMythologyMod.LOGGER.info("WATER PROJECTILE: Shot water blast at {}, {}, {}", 
            targetPos.x, targetPos.y, targetPos.z);
    }

    private void activateStormAtSea(ServerWorld world, BlockPos center) {
        // Check if there's water nearby
        boolean hasWaterNearby = false;
        for (int x = -STORM_RADIUS; x <= STORM_RADIUS; x += 10) {
            for (int z = -STORM_RADIUS; z <= STORM_RADIUS; z += 10) {
                BlockPos checkPos = center.add(x, 0, z);
                if (world.getBlockState(checkPos).getFluidState().isIn(FluidTags.WATER)) {
                    hasWaterNearby = true;
                    break;
                }
            }
        }
        
        if (hasWaterNearby) {
            // Create a storm in the area
            world.setWeather(0, 6000, true, true); // 5 minutes of rain and thunder
            
            // Create lightning strikes around the area
            for (int i = 0; i < 3; i++) {
                double angle = world.random.nextDouble() * 2 * Math.PI;
                double distance = world.random.nextDouble() * STORM_RADIUS;
                double x = center.getX() + Math.cos(angle) * distance;
                double z = center.getZ() + Math.sin(angle) * distance;
                
                // Find the highest block at this position
                BlockPos lightningPos = new BlockPos((int)x, 0, (int)z);
                for (int y = world.getTopY(net.minecraft.world.Heightmap.Type.WORLD_SURFACE, lightningPos); y > world.getBottomY(); y--) {
                    BlockPos checkPos = new BlockPos((int)x, y, (int)z);
                    if (!world.getBlockState(checkPos).isAir()) {
                        lightningPos = checkPos.up();
                        break;
                    }
                }
                
                // Create lightning using the same method as Zeus Bolt
                net.minecraft.entity.LightningEntity lightning = net.minecraft.entity.EntityType.LIGHTNING_BOLT.create(world, net.minecraft.entity.SpawnReason.NATURAL);
                if (lightning != null) {
                    lightning.refreshPositionAfterTeleport(lightningPos.getX(), lightningPos.getY(), lightningPos.getZ());
                    world.spawnEntity(lightning);
                }
            }
            
            GreekMythologyMod.LOGGER.info("STORM AT SEA: Created storm with lightning strikes");
        } else {
            GreekMythologyMod.LOGGER.info("STORM AT SEA: No water nearby, storm creation failed");
        }
        
        // Play thunder sound
        world.playSound(null, center.getX(), center.getY(), center.getZ(), 
            SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f);
    }
} 