package com.example.greekmyth.entity;

import net.minecraft.util.math.Vec3d;
import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;

public class InfernoPearlEntity extends ThrownItemEntity {
    
    public InfernoPearlEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    
    public InfernoPearlEntity(World world, LivingEntity owner) {
        super(GreekEntityTypes.INFERNO_PEARL, owner, world, new ItemStack(GreekItems.INFERNO_PEARL));
    }
    
    public InfernoPearlEntity(World world, double x, double y, double z) {
        super(GreekEntityTypes.INFERNO_PEARL, x, y, z, world, new ItemStack(GreekItems.INFERNO_PEARL));
    }
    
    @Override
    protected Item getDefaultItem() {
        return GreekItems.INFERNO_PEARL;
    }
    
    @Override
    protected void onCollision(HitResult hitResult) {
        // DO NOT call super.onCollision() - that causes teleportation!
        // Handle collision completely with our custom logic
        
        if (!this.getEntityWorld().isClient()) {
            // Get the impact position
            BlockPos impactPos = BlockPos.ofFloored(hitResult.getPos());
            
            // Play impact sound
            this.getEntityWorld().playSound(null, impactPos.getX(), impactPos.getY(), impactPos.getZ(), 
                SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 1.0F, 1.0F);
            
            // Create fire particles at impact
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
            
            // Remove the pearl entity
            this.discard();
        }
    }
    
    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        // DO NOT call super - that causes teleportation!
        // Just trigger our custom collision effects
        onCollision(entityHitResult);
    }
    
    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        // DO NOT call super - that causes teleportation!
        // Just trigger our custom collision effects
        onCollision(blockHitResult);
    }
    
    private void setAreaOnFire(World world, BlockPos center) {
        Random random = world.getRandom();
        int radius = 4; // Fire radius (same as original corruption radius)
        
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = center.add(x, y, z);
                    BlockState currentState = world.getBlockState(pos);
                    
                    // Check if we can place fire at this position
                    if (canPlaceFire(world, pos, currentState)) {
                        // Place fire block
                        world.setBlockState(pos, Blocks.FIRE.getDefaultState());
                        
                        // Add some randomness to make it look more natural
                        if (random.nextFloat() < 0.3f) { // 30% chance to skip some blocks
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    private boolean canPlaceFire(World world, BlockPos pos, BlockState currentState) {
        Block block = currentState.getBlock();
        
        // Can't place fire on fire
        if (block == Blocks.FIRE) {
            return false;
        }
        
        // Can't place fire on water or lava
        if (block == Blocks.WATER || block == Blocks.LAVA) {
            return false;
        }
        
        // Can't place fire on ice
        if (block == Blocks.ICE || block == Blocks.FROSTED_ICE || block == Blocks.BLUE_ICE || block == Blocks.PACKED_ICE) {
            return false;
        }
        
        // Can't place fire on obsidian or bedrock
        if (block == Blocks.OBSIDIAN || block == Blocks.BEDROCK) {
            return false;
        }
        
        // Can't place fire on netherrack (fire-resistant)
        if (block == Blocks.NETHERRACK) {
            return false;
        }
        
        // Check if the block below can support fire
        BlockPos below = pos.down();
        BlockState belowState = world.getBlockState(below);
        
        // Fire needs a solid block below it
        if (!belowState.isSolidBlock(world, below)) {
            return false;
        }
        
        // Can't place fire on leaves (they burn away)
        if (belowState.getBlock() instanceof net.minecraft.block.LeavesBlock) {
            return false;
        }
        
        return true;
    }
} 