package com.example.greekmyth.item;

import net.minecraft.util.math.Vec3d;
import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.random.Random;

public class InfernoPearlItem extends Item {
    
    public InfernoPearlItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("InfernoPearlItem constructor called");
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        
        // EXACT copy of vanilla ender pearl use method
        world.playSound(null, user.getX(), user.getY(), user.getZ(), 
            SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        
        if (!world.isClient()) {
            // Create vanilla ender pearl entity but override collision
            EnderPearlEntity infernoPearl = new EnderPearlEntity(world, user, new ItemStack(GreekItems.INFERNO_PEARL)) {
                @Override
                protected void onCollision(HitResult hitResult) {
                    // DON'T call super.onCollision() - that does teleportation!
                    // Instead, do our custom fire logic
                    
                    if (!this.getEntityWorld().isClient()) {
                        BlockPos impactPos = BlockPos.ofFloored(hitResult.getPos());
                        
                        // Play impact sound
                        this.getEntityWorld().playSound(null, impactPos.getX(), impactPos.getY(), impactPos.getZ(), 
                            SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        
                        // Create fire particles
                        ServerWorld serverWorld = (ServerWorld) this.getEntityWorld();
                        for (int i = 0; i < 20; i++) {
                            serverWorld.spawnParticles(ParticleTypes.FLAME, 
                                impactPos.getX() + this.random.nextDouble() - 0.5,
                                impactPos.getY() + 1 + this.random.nextDouble(),
                                impactPos.getZ() + this.random.nextDouble() - 0.5,
                                1, 0, 0, 0, 0.1);
                        }
                        
                        // Set the area around impact on fire
                        setAreaOnFire(this.getEntityWorld(), impactPos);
                        
                        GreekMythologyMod.LOGGER.info("INFERNO PEARL: Impact at {} - setting area on fire", impactPos);
                    }
                    
                    // Remove the entity (important: don't call super!)
                    this.discard();
                }
            };
            
            // Use exact same velocity settings as vanilla ender pearl
            infernoPearl.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(infernoPearl);
            
            GreekMythologyMod.LOGGER.info("INFERNO PEARL: Thrown by player {}", user.getName().getString());
        }
        
        // Exact same consumption and cooldown as vanilla
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        
        // TEMPORARILY DISABLED: user.getItemCooldownManager().set(this.getRegistryEntry().key().value(), 20);
        return ActionResult.SUCCESS;
    }
    
    private void setAreaOnFire(World world, BlockPos center) {
        Random random = world.getRandom();
        int radius = 4; // Fire radius
        
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                // Find the highest solid block at this x,z position
                BlockPos surfacePos = findSurfacePosition(world, center.add(x, 0, z));
                
                if (surfacePos != null) {
                    // Check if we can place fire on the surface
                    if (canPlaceFire(world, surfacePos, world.getBlockState(surfacePos))) {
                        // Place fire block on top of the surface
                        BlockPos firePos = surfacePos.up();
                        BlockState fireState = world.getBlockState(firePos);
                        
                        // Only place fire if the position is air (won't destroy anything)
                        if (fireState.isAir()) {
                            world.setBlockState(firePos, Blocks.FIRE.getDefaultState());
                            
                            // Add some randomness to make it look more natural
                            if (random.nextFloat() < 0.4f) { // 40% chance to skip some blocks
                                continue;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private BlockPos findSurfacePosition(World world, BlockPos xzPos) {
        // Start from a reasonable height and work down to find the surface
        int startY = Math.min(255, xzPos.getY() + 10);
        
        for (int y = startY; y >= 0; y--) {
            BlockPos pos = new BlockPos(xzPos.getX(), y, xzPos.getZ());
            BlockState state = world.getBlockState(pos);
            
            // Check if this is a solid surface block
            if (state.isSolidBlock(world, pos)) {
                // Check if the block above is air (so we can place fire)
                BlockPos above = pos.up();
                if (world.getBlockState(above).isAir()) {
                    return pos;
                }
            }
        }
        
        return null; // No suitable surface found
    }
    
    private boolean canPlaceFire(World world, BlockPos pos, BlockState currentState) {
        // Don't place fire on fire-resistant blocks
        if (currentState.getBlock() == Blocks.NETHERRACK || 
            currentState.getBlock() == Blocks.MAGMA_BLOCK ||
            currentState.getBlock() == Blocks.OBSIDIAN ||
            currentState.getBlock() == Blocks.CRYING_OBSIDIAN ||
            currentState.getBlock() == Blocks.BEDROCK ||
            currentState.getBlock() == Blocks.BARRIER) {
            return false;
        }
        
        // Don't place fire underwater
        if (world.getBlockState(pos.up()).getBlock() == Blocks.WATER) {
            return false;
        }
        
        // Don't place fire on non-solid blocks
        if (!currentState.isSolidBlock(world, pos)) {
            return false;
        }
        
        return true;
    }
}