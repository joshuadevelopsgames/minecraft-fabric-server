package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
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
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.random.Random;

public class InfernoPearlEntity extends ThrownItemEntity {
    
    public InfernoPearlEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    
    public InfernoPearlEntity(World world, LivingEntity owner) {
        super(GreekEntityTypes.INFERNO_PEARL, owner, world);
    }
    
    public InfernoPearlEntity(World world, double x, double y, double z) {
        super(GreekEntityTypes.INFERNO_PEARL, x, y, z, world);
    }
    
    @Override
    protected Item getDefaultItem() {
        return GreekItems.INFERNO_PEARL;
    }
    
    @Override
    protected void onCollision(HitResult hitResult) {
        // DO NOT call super.onCollision() - that causes teleportation!
        // Handle collision completely with our custom logic
        
        if (!this.getWorld().isClient) {
            // Get the impact position
            BlockPos impactPos = BlockPos.ofFloored(hitResult.getPos());
            
            // Play impact sound
            this.getWorld().playSound(null, impactPos, SoundEvents.ENTITY_GENERIC_EXPLODE, 
                SoundCategory.NEUTRAL, 1.0F, 1.0F);
            
            // Create fire particles at impact
            ServerWorld serverWorld = (ServerWorld) this.getWorld();
            for (int i = 0; i < 20; i++) {
                serverWorld.spawnParticles(ParticleTypes.FLAME, 
                    impactPos.getX() + this.random.nextDouble() - 0.5,
                    impactPos.getY() + 1 + this.random.nextDouble(),
                    impactPos.getZ() + this.random.nextDouble() - 0.5,
                    1, 0, 0, 0, 0.1);
            }
            
            // Corrupt the area around impact
            corruptArea(this.getWorld(), impactPos);
            
            GreekMythologyMod.LOGGER.info("INFERNO PEARL: Impact at {} - corrupting area", impactPos);
            
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
    
    private void corruptArea(World world, BlockPos center) {
        Random random = world.getRandom();
        int radius = 4; // Corruption radius
        
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = center.add(x, y, z);
                    BlockState currentState = world.getBlockState(pos);
                    
                    // Transform trees into crimson forest
                    if (isTreeBlock(currentState)) {
                        Block crimsonBlock = getCrimsonForestBlock(currentState, random);
                        world.setBlockState(pos, crimsonBlock.getDefaultState());
                    }
                    // Corrupt other replaceable blocks
                    else if (isReplaceable(currentState)) {
                        Block corruptedBlock = getRandomNetherBlock(random);
                        world.setBlockState(pos, corruptedBlock.getDefaultState());
                    }
                }
            }
        }
    }
    
    private boolean isTreeBlock(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.OAK_LOG ||
               block == Blocks.BIRCH_LOG ||
               block == Blocks.SPRUCE_LOG ||
               block == Blocks.JUNGLE_LOG ||
               block == Blocks.ACACIA_LOG ||
               block == Blocks.DARK_OAK_LOG ||
               block == Blocks.MANGROVE_LOG ||
               block == Blocks.CHERRY_LOG ||
               block == Blocks.OAK_LEAVES ||
               block == Blocks.BIRCH_LEAVES ||
               block == Blocks.SPRUCE_LEAVES ||
               block == Blocks.JUNGLE_LEAVES ||
               block == Blocks.ACACIA_LEAVES ||
               block == Blocks.DARK_OAK_LEAVES ||
               block == Blocks.MANGROVE_LEAVES ||
               block == Blocks.CHERRY_LEAVES ||
               block == Blocks.AZALEA_LEAVES ||
               block == Blocks.FLOWERING_AZALEA_LEAVES;
    }
    
    private Block getCrimsonForestBlock(BlockState originalState, Random random) {
        Block originalBlock = originalState.getBlock();
        
        // Transform logs to crimson stems
        if (originalBlock == Blocks.OAK_LOG || 
            originalBlock == Blocks.BIRCH_LOG || 
            originalBlock == Blocks.SPRUCE_LOG || 
            originalBlock == Blocks.JUNGLE_LOG || 
            originalBlock == Blocks.ACACIA_LOG || 
            originalBlock == Blocks.DARK_OAK_LOG ||
            originalBlock == Blocks.MANGROVE_LOG ||
            originalBlock == Blocks.CHERRY_LOG) {
            return Blocks.CRIMSON_STEM;
        }
        
        // Transform leaves to nether wart blocks (crimson forest leaves)
        if (originalBlock == Blocks.OAK_LEAVES || 
            originalBlock == Blocks.BIRCH_LEAVES || 
            originalBlock == Blocks.SPRUCE_LEAVES || 
            originalBlock == Blocks.JUNGLE_LEAVES || 
            originalBlock == Blocks.ACACIA_LEAVES || 
            originalBlock == Blocks.DARK_OAK_LEAVES ||
            originalBlock == Blocks.MANGROVE_LEAVES ||
            originalBlock == Blocks.CHERRY_LEAVES ||
            originalBlock == Blocks.AZALEA_LEAVES ||
            originalBlock == Blocks.FLOWERING_AZALEA_LEAVES) {
            return Blocks.NETHER_WART_BLOCK;
        }
        
        // Fallback to crimson nylium
        return Blocks.CRIMSON_NYLIUM;
    }
    
    private boolean isReplaceable(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || 
               block == Blocks.DIRT || 
               block == Blocks.STONE || 
               block == Blocks.SAND || 
               block == Blocks.GRAVEL ||
               block == Blocks.COBBLESTONE;
    }
    
    private Block getRandomNetherBlock(Random random) {
        Block[] netherBlocks = {
            Blocks.NETHERRACK,
            Blocks.MAGMA_BLOCK
        };
        
        return netherBlocks[random.nextInt(netherBlocks.length)];
    }
} 