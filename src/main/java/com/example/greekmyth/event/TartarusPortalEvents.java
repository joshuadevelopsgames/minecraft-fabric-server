package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.block.TartarusBlocks;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import java.util.List;

public class TartarusPortalEvents {
    
    public static void register() {
        GreekMythologyMod.LOGGER.info("Registering Tartarus Portal transformation events...");
        
        // Check for inferno pearls near nether portals every tick
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            if (world.getTime() % 20 == 0) { // Check every second (20 ticks)
                checkForInfernoPearlsNearPortals(world);
            }
        });
        
        GreekMythologyMod.LOGGER.info("Tartarus Portal events registered successfully!");
    }
    
    private static void checkForInfernoPearlsNearPortals(ServerWorld world) {
        // Find all item entities that are inferno pearls
        List<ItemEntity> infernoPearls = world.getEntitiesByClass(ItemEntity.class, 
            new Box(-30000000, world.getBottomY(), -30000000, 30000000, world.getBottomY() + 384, 30000000),
            entity -> entity.getStack().getItem() == GreekItems.INFERNO_PEARL);
        
        for (ItemEntity pearl : infernoPearls) {
            BlockPos pearlPos = pearl.getBlockPos();
            
            // Check if the pearl is inside or very close to a nether portal
            if (isNearNetherPortal(world, pearlPos)) {
                GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Inferno pearl detected near nether portal at {}", pearlPos);
                transformNearbyNetherPortal(world, pearlPos);
                
                // Remove the pearl and create effects
                pearl.discard();
                createTransformationEffects(world, pearlPos);
            }
        }
    }
    
    private static boolean isNearNetherPortal(ServerWorld world, BlockPos pos) {
        // Check a 3x3x3 area around the pearl for nether portal blocks
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState state = world.getBlockState(checkPos);
                    if (state.getBlock() == Blocks.NETHER_PORTAL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private static void transformNearbyNetherPortal(ServerWorld world, BlockPos centerPos) {
        GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Transforming nether portal at {} to Tartarus portal", centerPos);
        
        // Find and replace all connected nether portal blocks in a reasonable area
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos checkPos = centerPos.add(x, y, z);
                    BlockState state = world.getBlockState(checkPos);
                    
                    if (state.getBlock() == Blocks.NETHER_PORTAL) {
                        // Copy the axis property from the original portal
                        Direction.Axis axis = state.get(NetherPortalBlock.AXIS);
                        BlockState tartarusPortalState = TartarusBlocks.TARTARUS_PORTAL.getDefaultState()
                            .with(NetherPortalBlock.AXIS, axis);
                        
                        world.setBlockState(checkPos, tartarusPortalState);
                        GreekMythologyMod.LOGGER.debug("TARTARUS PORTAL: Replaced nether portal block at {}", checkPos);
                    }
                }
            }
        }
    }
    
    private static void createTransformationEffects(ServerWorld world, BlockPos pos) {
        // Create dramatic transformation effects
        for (int i = 0; i < 50; i++) {
            double x = pos.getX() + 0.5 + (world.random.nextDouble() - 0.5) * 4;
            double y = pos.getY() + 0.5 + world.random.nextDouble() * 3;
            double z = pos.getZ() + 0.5 + (world.random.nextDouble() - 0.5) * 4;
            
            world.spawnParticles(ParticleTypes.FLAME, x, y, z, 5, 0.5, 0.5, 0.5, 0.1);
            world.spawnParticles(ParticleTypes.LAVA, x, y, z, 3, 0.3, 0.3, 0.3, 0.05);
            world.spawnParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 2, 0.2, 0.2, 0.2, 0.03);
        }
        
        // Play dramatic sound
        world.playSound(null, pos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 2.0F, 0.5F);
        world.playSound(null, pos, SoundEvents.BLOCK_PORTAL_TRIGGER, SoundCategory.BLOCKS, 1.0F, 0.8F);
        
        GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Transformation effects created at {}", pos);
    }
} 