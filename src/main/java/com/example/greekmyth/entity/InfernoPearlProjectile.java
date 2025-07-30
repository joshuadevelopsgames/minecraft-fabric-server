package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class InfernoPearlProjectile extends ThrownItemEntity {
    
    public InfernoPearlProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    
    public InfernoPearlProjectile(World world, LivingEntity owner) {
        super(EntityType.SNOWBALL, owner, world);
    }
    
    @Override
    protected Item getDefaultItem() {
        return Items.ENDER_PEARL;
    }
    
    @Override
    protected void onCollision(HitResult hitResult) {
        // NO super.onCollision(hitResult) call - completely custom behavior
        
        if (!this.getWorld().isClient) {
            Vec3d landingPos = this.getPos();
            BlockPos landingBlockPos = new BlockPos((int)landingPos.x, (int)landingPos.y, (int)landingPos.z);
            
            // Check if we're near a nether portal
            boolean nearNetherPortal = false;
            for (int x = -3; x <= 3; x++) {
                for (int y = -3; y <= 3; y++) {
                    for (int z = -3; z <= 3; z++) {
                        BlockPos checkPos = landingBlockPos.add(x, y, z);
                        if (this.getWorld().getBlockState(checkPos).isOf(Blocks.NETHER_PORTAL)) {
                            nearNetherPortal = true;
                            break;
                        }
                    }
                    if (nearNetherPortal) break;
                }
                if (nearNetherPortal) break;
            }
            
            if (nearNetherPortal) {
                GreekMythologyMod.LOGGER.info("INFERNO PEARL: Landed near nether portal, allowing portal transformation");
                
                // Play portal transformation sound
                this.getWorld().playSound(null, landingPos.x, landingPos.y, landingPos.z, 
                    SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.NEUTRAL, 1.5F, 0.8F);
                
                // Spawn transformation particles
                if (this.getWorld() instanceof ServerWorld) {
                    ((ServerWorld) this.getWorld()).spawnParticles(ParticleTypes.FLAME, 
                        landingPos.x, landingPos.y, landingPos.z, 30, 1.0, 1.0, 1.0, 0.1);
                }
            } else {
                // Not near a portal - corrupt the area as normal
                corruptArea(this.getWorld(), landingBlockPos);
                
                // Play corruption sound
                this.getWorld().playSound(null, landingPos.x, landingPos.y, landingPos.z, 
                    SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 1.0F, 0.8F);
                
                // Spawn particles at landing location
                if (this.getWorld() instanceof ServerWorld) {
                    ((ServerWorld) this.getWorld()).spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, 
                        landingPos.x, landingPos.y, landingPos.z, 20, 0.5, 0.5, 0.5, 0.1);
                }
                
                GreekMythologyMod.LOGGER.info("INFERNO PEARL: Corrupted area at ({}, {}, {})", 
                    landingPos.x, landingPos.y, landingPos.z);
            }
        }
        
        // Always discard the projectile - NO TELEPORTATION
        this.discard();
    }
    
    private void corruptArea(World world, BlockPos center) {
        net.minecraft.util.math.random.Random random = world.getRandom();
        int radius = 4;
        
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = center.add(x, y, z);
                    net.minecraft.block.BlockState currentState = world.getBlockState(pos);
                    
                    // Transform trees into crimson forest
                    if (isTreeBlock(currentState)) {
                        net.minecraft.block.Block crimsonBlock = getCrimsonForestBlock(currentState, random);
                        world.setBlockState(pos, crimsonBlock.getDefaultState());
                    }
                    // Corrupt other replaceable blocks
                    else if (isReplaceable(currentState)) {
                        net.minecraft.block.Block corruptedBlock = getRandomNetherBlock(random);
                        world.setBlockState(pos, corruptedBlock.getDefaultState());
                    }
                }
            }
        }
    }
    
    private boolean isTreeBlock(net.minecraft.block.BlockState state) {
        return state.isOf(Blocks.OAK_LOG) || state.isOf(Blocks.OAK_LEAVES) ||
               state.isOf(Blocks.BIRCH_LOG) || state.isOf(Blocks.BIRCH_LEAVES) ||
               state.isOf(Blocks.SPRUCE_LOG) || state.isOf(Blocks.SPRUCE_LEAVES) ||
               state.isOf(Blocks.JUNGLE_LOG) || state.isOf(Blocks.JUNGLE_LEAVES) ||
               state.isOf(Blocks.ACACIA_LOG) || state.isOf(Blocks.ACACIA_LEAVES) ||
               state.isOf(Blocks.DARK_OAK_LOG) || state.isOf(Blocks.DARK_OAK_LEAVES);
    }
    
    private net.minecraft.block.Block getCrimsonForestBlock(net.minecraft.block.BlockState state, net.minecraft.util.math.random.Random random) {
        if (state.getBlock().getName().getString().contains("log")) {
            return Blocks.CRIMSON_STEM;
        } else if (state.getBlock().getName().getString().contains("leaves")) {
            return random.nextBoolean() ? Blocks.NETHER_WART_BLOCK : Blocks.CRIMSON_NYLIUM;
        }
        return Blocks.CRIMSON_NYLIUM;
    }
    
    private boolean isReplaceable(net.minecraft.block.BlockState state) {
        return state.isOf(Blocks.GRASS_BLOCK) || state.isOf(Blocks.DIRT) || 
               state.isOf(Blocks.STONE) || state.isOf(Blocks.SAND) ||
               state.isOf(Blocks.GRAVEL) || state.isOf(Blocks.CLAY);
    }
    
    private net.minecraft.block.Block getRandomNetherBlock(net.minecraft.util.math.random.Random random) {
        net.minecraft.block.Block[] netherBlocks = {
            Blocks.NETHERRACK, Blocks.SOUL_SAND, Blocks.SOUL_SOIL,
            Blocks.CRIMSON_NYLIUM, Blocks.WARPED_NYLIUM, Blocks.BLACKSTONE
        };
        return netherBlocks[random.nextInt(netherBlocks.length)];
    }
} 