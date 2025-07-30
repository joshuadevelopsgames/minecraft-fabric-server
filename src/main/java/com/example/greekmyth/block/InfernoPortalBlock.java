package com.example.greekmyth.block;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import java.util.Set;

/**
 * Inferno Portal Block - A red version of the nether portal that leads to the Inferno Nether dimension
 */
public class InfernoPortalBlock extends NetherPortalBlock {
    
    public static final RegistryKey<World> INFERNO_NETHER_WORLD = RegistryKey.of(RegistryKeys.WORLD, 
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_nether"));

    public InfernoPortalBlock(Settings settings) {
        super(settings);
        // Set default state with the AXIS property
        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.X));
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (world.isClient) {
            if (random.nextInt(100) == 0) {
                world.playSound(null, (double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, 
                    SoundEvents.BLOCK_PORTAL_AMBIENT, SoundCategory.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F);
            }

            for (int i = 0; i < 4; ++i) {
                double x = (double) pos.getX() + random.nextDouble();
                double y = (double) pos.getY() + random.nextDouble();
                double z = (double) pos.getZ() + random.nextDouble();
                double velocityX = ((double) random.nextFloat() - 0.5) * 0.5;
                double velocityY = ((double) random.nextFloat() - 0.5) * 0.5;
                double velocityZ = ((double) random.nextFloat() - 0.5) * 0.5;
                int j = random.nextInt(2) * 2 - 1;
                
                if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
                    x = (double) pos.getX() + 0.5 + 0.25 * (double) j;
                    velocityX = (double) (random.nextFloat() * 2.0F * (float) j);
                } else {
                    z = (double) pos.getZ() + 0.5 + 0.25 * (double) j;
                    velocityZ = (double) (random.nextFloat() * 2.0F * (float) j);
                }

                // Use FLAME particles for red effect instead of PORTAL
                world.addParticle(ParticleTypes.FLAME, x, y, z, velocityX, velocityY, velocityZ);
                if (random.nextInt(3) == 0) {
                    world.addParticle(ParticleTypes.LAVA, x, y, z, velocityX * 0.5, velocityY * 0.5, velocityZ * 0.5);
                }
            }
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && !entity.hasVehicle() && !entity.hasPassengers() && entity.canUsePortals(true) && 
            entity instanceof ServerPlayerEntity player) {
            
            GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Player {} entered inferno portal", player.getName().getString());
            
            ServerWorld serverWorld = (ServerWorld) world;
            ServerWorld targetWorld;
            
            // Determine target world (toggle between overworld and inferno nether)
            if (serverWorld.getRegistryKey() == World.OVERWORLD) {
                targetWorld = serverWorld.getServer().getWorld(INFERNO_NETHER_WORLD);
                if (targetWorld == null) {
                    GreekMythologyMod.LOGGER.error("INFERNO PORTAL: Inferno Nether world not found!");
                    return;
                }
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Teleporting {} to Inferno Nether", player.getName().getString());
            } else if (serverWorld.getRegistryKey() == INFERNO_NETHER_WORLD) {
                targetWorld = serverWorld.getServer().getOverworld();
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Teleporting {} back to Overworld", player.getName().getString());
            } else {
                // From regular nether, go to inferno nether
                targetWorld = serverWorld.getServer().getWorld(INFERNO_NETHER_WORLD);
                if (targetWorld == null) {
                    GreekMythologyMod.LOGGER.error("INFERNO PORTAL: Inferno Nether world not found!");
                    return;
                }
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Teleporting {} from Nether to Inferno Nether", player.getName().getString());
            }
            
            // Calculate target position (scaled for nether travel)
            double scale = targetWorld.getRegistryKey() == World.OVERWORLD ? 8.0 : 0.125;
            double targetX = entity.getX() * scale;
            double targetY = Math.max(targetWorld.getBottomY() + 1, entity.getY());
            double targetZ = entity.getZ() * scale;
            
            // Teleport the player using the correct API
            player.teleport(targetWorld, targetX, targetY, targetZ, Set.of(), entity.getYaw(), entity.getPitch(), true);
            
            // Play portal sound and effects
            targetWorld.playSound(null, targetX, targetY, targetZ, SoundEvents.BLOCK_PORTAL_TRAVEL, 
                SoundCategory.PLAYERS, 0.25F, world.random.nextFloat() * 0.4F + 0.8F);
        }
    }
} 