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

public class TartarusPortalBlock extends NetherPortalBlock {
    
    public static final RegistryKey<World> TARTARUS_WORLD = RegistryKey.of(RegistryKeys.WORLD, 
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_nether"));

    public TartarusPortalBlock(Settings settings) {
        super(settings);
        // The default state will be set by the parent class
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (world.isClient) {
            // Play portal ambient sound occasionally
            if (random.nextInt(100) == 0) {
                world.playSound(null, (double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, 
                    SoundEvents.BLOCK_PORTAL_AMBIENT, SoundCategory.BLOCKS, 0.5F, random.nextFloat() * 0.4F + 0.8F);
            }

            // Spawn red particles instead of purple
            for (int i = 0; i < 4; ++i) {
                double x = (double) pos.getX() + random.nextDouble();
                double y = (double) pos.getY() + random.nextDouble();
                double z = (double) pos.getZ() + random.nextDouble();
                double velocityX = ((double) random.nextFloat() - 0.5) * 0.5;
                double velocityY = ((double) random.nextFloat() - 0.5) * 0.5;
                double velocityZ = ((double) random.nextFloat() - 0.5) * 0.5;
                int j = random.nextInt(2) * 2 - 1;
                
                Direction.Axis axis = state.get(AXIS);
                if (axis == Direction.Axis.X) {
                    x = (double) pos.getX() + 0.5 + 0.25 * (double) j;
                    velocityX = (double) (random.nextFloat() * 2.0F * (float) j);
                } else {
                    z = (double) pos.getZ() + 0.5 + 0.25 * (double) j;
                    velocityZ = (double) (random.nextFloat() * 2.0F * (float) j);
                }

                // Red particles for Tartarus portal
                world.addParticle(ParticleTypes.FLAME, x, y, z, velocityX, velocityY, velocityZ);
                
                if (random.nextInt(3) == 0) {
                    world.addParticle(ParticleTypes.LAVA, x, y, z, velocityX * 0.5, velocityY * 0.5, velocityZ * 0.5);
                }
                
                if (random.nextInt(4) == 0) {
                    world.addParticle(ParticleTypes.SMALL_FLAME, x, y, z, velocityX * 0.2, velocityY * 0.2, velocityZ * 0.2);
                }
            }
        }
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && !entity.hasVehicle() && !entity.hasPassengers() && entity.canUsePortals(true) && 
            entity instanceof ServerPlayerEntity player) {
            
            GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Player {} entered Tartarus portal", player.getName().getString());
            
            ServerWorld serverWorld = (ServerWorld) world;
            ServerWorld targetWorld;
            
            if (serverWorld.getRegistryKey() == World.OVERWORLD) {
                targetWorld = serverWorld.getServer().getWorld(TARTARUS_WORLD);
                if (targetWorld == null) {
                    GreekMythologyMod.LOGGER.error("TARTARUS PORTAL: Tartarus world not found!");
                    player.sendMessage(net.minecraft.text.Text.literal("§cTartarus dimension not loaded!"), false);
                    return;
                }
                GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Teleporting {} to Tartarus", player.getName().getString());
            } else if (serverWorld.getRegistryKey() == TARTARUS_WORLD) {
                targetWorld = serverWorld.getServer().getOverworld();
                GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Teleporting {} back to Overworld", player.getName().getString());
            } else {
                targetWorld = serverWorld.getServer().getWorld(TARTARUS_WORLD);
                if (targetWorld == null) {
                    GreekMythologyMod.LOGGER.error("TARTARUS PORTAL: Tartarus world not found!");
                    player.sendMessage(net.minecraft.text.Text.literal("§cTartarus dimension not loaded!"), false);
                    return;
                }
                GreekMythologyMod.LOGGER.info("TARTARUS PORTAL: Teleporting {} from Nether to Tartarus", player.getName().getString());
            }
            
            double scale = targetWorld.getRegistryKey() == World.OVERWORLD ? 8.0 : 0.125;
            double targetX = entity.getX() * scale;
            double targetY = Math.max(targetWorld.getBottomY() + 1, entity.getY());
            double targetZ = entity.getZ() * scale;
            
            player.teleport(targetWorld, targetX, targetY, targetZ, Set.of(), entity.getYaw(), entity.getPitch(), true);
            
            targetWorld.playSound(null, targetX, targetY, targetZ, SoundEvents.BLOCK_PORTAL_TRAVEL, 
                SoundCategory.PLAYERS, 0.25F, world.random.nextFloat() * 0.4F + 0.8F);
        }
    }
} 