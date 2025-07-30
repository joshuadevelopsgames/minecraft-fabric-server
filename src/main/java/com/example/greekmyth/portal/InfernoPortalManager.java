package com.example.greekmyth.portal;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InfernoPortalManager {
    
    private static final Set<String> infernoPortals = new HashSet<>();
    private static final Set<String> transformingPortals = new HashSet<>();
    
    public static final RegistryKey<net.minecraft.world.World> INFERNO_NETHER = RegistryKey.of(RegistryKeys.WORLD, 
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_nether"));
    
    public static void register() {
        GreekMythologyMod.LOGGER.info("Registering Inferno Portal Manager...");
        
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            if (world.getTime() % 20 == 0) {
                checkForInfernoPearls(world);
            }
            if (world.getTime() % 5 == 0) {
                spawnInfernoParticles(world);
            }
        });
    }
    
    private static void checkForInfernoPearls(ServerWorld world) {
        List<ItemEntity> pearls = world.getEntitiesByClass(ItemEntity.class, 
            new Box(-30000000, world.getBottomY(), -30000000, 30000000, world.getTopY(), 30000000),
            entity -> entity.getStack().isOf(GreekItems.INFERNO_PEARL));
        
        for (ItemEntity pearl : pearls) {
            BlockPos pos = pearl.getBlockPos();
            
            // Check if pearl is near a nether portal
            boolean nearPortal = false;
            for (int x = -2; x <= 2; x++) {
                for (int y = -2; y <= 2; y++) {
                    for (int z = -2; z <= 2; z++) {
                        if (world.getBlockState(pos.add(x, y, z)).isOf(Blocks.NETHER_PORTAL)) {
                            nearPortal = true;
                            break;
                        }
                    }
                    if (nearPortal) break;
                }
                if (nearPortal) break;
            }
            
            if (nearPortal) {
                // Mark portal as transforming to prevent teleportation
                markPortalAsTransforming(world, pos);
                convertToInfernoPortal(world, pos);
                pearl.discard();
                playTransformEffects(world, pos);
                
                // Schedule removal of transformation lock after 5 seconds
                scheduleTransformationComplete(world, pos);
            }
        }
    }
    
    private static void convertToInfernoPortal(ServerWorld world, BlockPos center) {
        String worldKey = world.getRegistryKey().getValue().toString();
        
        // Mark all nearby portal blocks as inferno portals
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos pos = center.add(x, y, z);
                    if (world.getBlockState(pos).isOf(Blocks.NETHER_PORTAL)) {
                        String key = worldKey + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ();
                        infernoPortals.add(key);
                    }
                }
            }
        }
        
        GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Converted portal at {} to inferno portal", center);
    }
    
    private static void spawnInfernoParticles(ServerWorld world) {
        String worldKey = world.getRegistryKey().getValue().toString();
        Set<String> toRemove = new HashSet<>();
        
        for (String portalKey : infernoPortals) {
            if (portalKey.startsWith(worldKey + ":")) {
                String coords = portalKey.substring(worldKey.length() + 1);
                String[] parts = coords.split(",");
                if (parts.length == 3) {
                    try {
                        int x = Integer.parseInt(parts[0]);
                        int y = Integer.parseInt(parts[1]);
                        int z = Integer.parseInt(parts[2]);
                        BlockPos pos = new BlockPos(x, y, z);
                        
                        if (world.getBlockState(pos).isOf(Blocks.NETHER_PORTAL)) {
                            // Spawn intense red particles to simulate red portal effect
                            double px = pos.getX() + world.random.nextDouble();
                            double py = pos.getY() + world.random.nextDouble();
                            double pz = pos.getZ() + world.random.nextDouble();
                            
                            // Dense red flame particles (like the texture pack color #D22B2B)
                            world.spawnParticles(ParticleTypes.FLAME, px, py, pz, 3, 0.1, 0.1, 0.1, 0.05);
                            
                            // Add some soul fire flames for deeper red effect
                            if (world.random.nextFloat() < 0.7f) {
                                world.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, px, py, pz, 2, 0.1, 0.1, 0.1, 0.03);
                            }
                            
                            // Occasional lava particles for intense red glow
                            if (world.random.nextFloat() < 0.3f) {
                                world.spawnParticles(ParticleTypes.LAVA, px, py, pz, 1, 0.05, 0.05, 0.05, 0.01);
                            }
                            
                            // Add crimson spore particles for mystical red effect
                            if (world.random.nextFloat() < 0.4f) {
                                world.spawnParticles(ParticleTypes.CRIMSON_SPORE, px, py, pz, 1, 0.2, 0.2, 0.2, 0.02);
                            }
                        } else {
                            toRemove.add(portalKey);
                        }
                    } catch (NumberFormatException e) {
                        toRemove.add(portalKey);
                    }
                }
            }
        }
        
        infernoPortals.removeAll(toRemove);
    }
    
    private static void playTransformEffects(ServerWorld world, BlockPos pos) {
        // EPIC red portal transformation effects
        for (int i = 0; i < 80; i++) {
            double x = pos.getX() + 0.5 + (world.random.nextGaussian() * 3);
            double y = pos.getY() + 0.5 + world.random.nextDouble() * 4;
            double z = pos.getZ() + 0.5 + (world.random.nextGaussian() * 3);
            
            // Intense red flame burst
            world.spawnParticles(ParticleTypes.FLAME, x, y, z, 8, 0.8, 0.8, 0.8, 0.15);
            
            // Soul fire for deep red effect
            world.spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 5, 0.6, 0.6, 0.6, 0.12);
            
            // Lava particles for molten red glow
            world.spawnParticles(ParticleTypes.LAVA, x, y, z, 4, 0.4, 0.4, 0.4, 0.08);
            
            // Crimson spores for mystical red energy
            world.spawnParticles(ParticleTypes.CRIMSON_SPORE, x, y, z, 3, 0.5, 0.5, 0.5, 0.06);
            
            // Warped spores for contrast
            if (world.random.nextFloat() < 0.3f) {
                world.spawnParticles(ParticleTypes.WARPED_SPORE, x, y, z, 2, 0.3, 0.3, 0.3, 0.04);
            }
        }
        
        // Enhanced sound effects for epic transformation
        world.playSound(null, pos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 3.0F, 0.4F);
        world.playSound(null, pos, SoundEvents.BLOCK_PORTAL_TRIGGER, SoundCategory.BLOCKS, 2.5F, 0.6F);
        world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE, SoundCategory.BLOCKS, 2.0F, 0.8F);
        world.playSound(null, pos, SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.BLOCKS, 1.5F, 0.5F);
    }
    
    public static boolean isInfernoPortal(ServerWorld world, BlockPos pos) {
        String key = world.getRegistryKey().getValue().toString() + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ();
        return infernoPortals.contains(key);
    }
    
    public static boolean handlePortalTeleport(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        // Check if portal is currently transforming - block teleportation during transformation
        if (isPortalTransforming(world, pos)) {
            return true; // Block teleportation, but return true to cancel normal portal behavior
        }
        
        if (!isInfernoPortal(world, pos)) {
            return false; // Not an inferno portal
        }
        
        GreekMythologyMod.LOGGER.info("INFERNO PORTAL: {} using inferno portal", player.getName().getString());
        
        ServerWorld target;
        if (world.getRegistryKey().equals(net.minecraft.world.World.OVERWORLD)) {
            target = world.getServer().getWorld(INFERNO_NETHER);
            if (target == null) {
                player.sendMessage(net.minecraft.text.Text.literal("§cInferno Nether not loaded!"), false);
                return true;
            }
        } else if (world.getRegistryKey().equals(INFERNO_NETHER)) {
            target = world.getServer().getOverworld();
        } else {
            // From regular nether
            target = world.getServer().getWorld(INFERNO_NETHER);
            if (target == null) {
                player.sendMessage(net.minecraft.text.Text.literal("§cInferno Nether not loaded!"), false);
                return true;
            }
        }
        
        // Calculate scaled coordinates for nether travel
        double scale = target.getRegistryKey().equals(net.minecraft.world.World.OVERWORLD) ? 8.0 : 0.125;
        double x = player.getX() * scale;
        double y = Math.max(target.getBottomY() + 1, player.getY());
        double z = player.getZ() * scale;
        
        player.teleport(target, x, y, z, java.util.Set.of(), player.getYaw(), player.getPitch(), true);
        
        target.playSound(null, x, y, z, SoundEvents.BLOCK_PORTAL_TRAVEL, 
            SoundCategory.PLAYERS, 0.25F, world.random.nextFloat() * 0.4F + 0.8F);
        
        return true;
    }
    
    private static void markPortalAsTransforming(ServerWorld world, BlockPos center) {
        String worldKey = world.getRegistryKey().getValue().toString();
        
        // Mark all nearby portal blocks as transforming
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos pos = center.add(x, y, z);
                    if (world.getBlockState(pos).isOf(Blocks.NETHER_PORTAL)) {
                        String key = worldKey + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ();
                        transformingPortals.add(key);
                    }
                }
            }
        }
    }
    
    private static boolean isPortalTransforming(ServerWorld world, BlockPos pos) {
        String key = world.getRegistryKey().getValue().toString() + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ();
        return transformingPortals.contains(key);
    }
    
    private static void scheduleTransformationComplete(ServerWorld world, BlockPos center) {
        // Use server scheduler to remove transformation lock after 5 seconds (100 ticks)
        world.getServer().execute(() -> {
            try {
                Thread.sleep(5000); // 5 seconds
                removeTransformationLock(world, center);
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Transformation complete, portal now usable at {}", center);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
    
    private static void removeTransformationLock(ServerWorld world, BlockPos center) {
        String worldKey = world.getRegistryKey().getValue().toString();
        
        // Remove transformation lock from all nearby portal blocks
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos pos = center.add(x, y, z);
                    String key = worldKey + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ();
                    transformingPortals.remove(key);
                }
            }
        }
    }
} 