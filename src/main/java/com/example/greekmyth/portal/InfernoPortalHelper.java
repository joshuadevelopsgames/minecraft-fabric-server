package com.example.greekmyth.portal;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.nbt.NbtCompound;
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
import net.minecraft.world.PersistentState;
import net.minecraft.world.PersistentStateManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InfernoPortalHelper {
    
    public static final RegistryKey<net.minecraft.world.World> TARTARUS_WORLD = RegistryKey.of(RegistryKeys.WORLD, 
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_nether"));
    
    public static void register() {
        GreekMythologyMod.LOGGER.info("Registering Inferno Portal helper...");
        
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            if (world.getTime() % 20 == 0) {
                checkForInfernoPearlsNearPortals(world);
            }
            if (world.getTime() % 10 == 0) {
                spawnInfernoPortalParticles(world);
            }
        });
    }
    
    private static void checkForInfernoPearlsNearPortals(ServerWorld world) {
        List<ItemEntity> infernoPearls = world.getEntitiesByClass(ItemEntity.class, 
            new Box(-30000000, world.getBottomY(), -30000000, 30000000, world.getBottomY() + 384, 30000000),
            entity -> entity.getStack().getItem() == GreekItems.INFERNO_PEARL);
        
        for (ItemEntity pearl : infernoPearls) {
            BlockPos pearlPos = pearl.getBlockPos();
            
            if (isNearNetherPortal(world, pearlPos)) {
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Converting portal to inferno at {}", pearlPos);
                markPortalAsInferno(world, pearlPos);
                pearl.discard();
                createTransformationEffects(world, pearlPos);
            }
        }
    }
    
    private static boolean isNearNetherPortal(ServerWorld world, BlockPos pos) {
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    BlockPos checkPos = pos.add(x, y, z);
                    if (world.getBlockState(checkPos).getBlock() == Blocks.NETHER_PORTAL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private static void markPortalAsInferno(ServerWorld world, BlockPos centerPos) {
        InfernoPortalState state = InfernoPortalState.getServerState(world.getServer());
        
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos checkPos = centerPos.add(x, y, z);
                    if (world.getBlockState(checkPos).getBlock() == Blocks.NETHER_PORTAL) {
                        state.addInfernoPortal(world.getRegistryKey(), checkPos);
                    }
                }
            }
        }
        state.markDirty();
    }
    
    private static void spawnInfernoPortalParticles(ServerWorld world) {
        InfernoPortalState state = InfernoPortalState.getServerState(world.getServer());
        Set<BlockPos> infernoPortals = state.getInfernoPortals(world.getRegistryKey());
        
        for (BlockPos pos : infernoPortals) {
            if (world.getBlockState(pos).getBlock() == Blocks.NETHER_PORTAL) {
                // Spawn red particles
                double x = pos.getX() + world.random.nextDouble();
                double y = pos.getY() + world.random.nextDouble();
                double z = pos.getZ() + world.random.nextDouble();
                double velocityX = (world.random.nextDouble() - 0.5) * 0.5;
                double velocityY = (world.random.nextDouble() - 0.5) * 0.5;
                double velocityZ = (world.random.nextDouble() - 0.5) * 0.5;
                
                world.spawnParticles(ParticleTypes.FLAME, x, y, z, 1, velocityX, velocityY, velocityZ, 0.1);
                if (world.random.nextInt(3) == 0) {
                    world.spawnParticles(ParticleTypes.LAVA, x, y, z, 1, velocityX * 0.5, velocityY * 0.5, velocityZ * 0.5, 0.05);
                }
            } else {
                state.removeInfernoPortal(world.getRegistryKey(), pos);
            }
        }
    }
    
    private static void createTransformationEffects(ServerWorld world, BlockPos pos) {
        for (int i = 0; i < 30; i++) {
            double x = pos.getX() + 0.5 + (world.random.nextDouble() - 0.5) * 3;
            double y = pos.getY() + 0.5 + world.random.nextDouble() * 2;
            double z = pos.getZ() + 0.5 + (world.random.nextDouble() - 0.5) * 3;
            
            world.spawnParticles(ParticleTypes.FLAME, x, y, z, 3, 0.3, 0.3, 0.3, 0.1);
            world.spawnParticles(ParticleTypes.LAVA, x, y, z, 2, 0.2, 0.2, 0.2, 0.05);
        }
        
        world.playSound(null, pos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.5F, 0.8F);
        world.playSound(null, pos, SoundEvents.BLOCK_PORTAL_TRIGGER, SoundCategory.BLOCKS, 1.0F, 1.2F);
    }
    
    public static boolean isInfernoPortal(ServerWorld world, BlockPos pos) {
        InfernoPortalState state = InfernoPortalState.getServerState(world.getServer());
        return state.getInfernoPortals(world.getRegistryKey()).contains(pos);
    }
    
    public static boolean handleInfernoPortalTeleport(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        if (!isInfernoPortal(world, pos)) {
            return false; // Not an inferno portal, let normal portal behavior handle it
        }
        
        GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Player {} using inferno portal", player.getName().getString());
        
        ServerWorld targetWorld;
        
        if (world.getRegistryKey() == net.minecraft.world.World.OVERWORLD) {
            targetWorld = world.getServer().getWorld(TARTARUS_WORLD);
            if (targetWorld == null) {
                player.sendMessage(net.minecraft.text.Text.literal("§cTartarus dimension not loaded!"), false);
                return true; // We handled it, even if it failed
            }
        } else if (world.getRegistryKey() == TARTARUS_WORLD) {
            targetWorld = world.getServer().getOverworld();
        } else {
            targetWorld = world.getServer().getWorld(TARTARUS_WORLD);
            if (targetWorld == null) {
                player.sendMessage(net.minecraft.text.Text.literal("§cTartarus dimension not loaded!"), false);
                return true;
            }
        }
        
        double scale = targetWorld.getRegistryKey() == net.minecraft.world.World.OVERWORLD ? 8.0 : 0.125;
        double targetX = player.getX() * scale;
        double targetY = Math.max(targetWorld.getBottomY() + 1, player.getY());
        double targetZ = player.getZ() * scale;
        
        player.teleport(targetWorld, targetX, targetY, targetZ, java.util.Set.of(), player.getYaw(), player.getPitch(), true);
        
        targetWorld.playSound(null, targetX, targetY, targetZ, SoundEvents.BLOCK_PORTAL_TRAVEL, 
            SoundCategory.PLAYERS, 0.25F, world.random.nextFloat() * 0.4F + 0.8F);
        
        return true; // We handled the teleportation
    }
}

// Simple persistent state to track inferno portals
class InfernoPortalState extends PersistentState {
    private Set<String> infernoPortals = new HashSet<>();
    
    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putInt("size", infernoPortals.size());
        int i = 0;
        for (String portal : infernoPortals) {
            nbt.putString("portal_" + i, portal);
            i++;
        }
        return nbt;
    }
    
    public static InfernoPortalState createFromNbt(NbtCompound nbt) {
        InfernoPortalState state = new InfernoPortalState();
        int size = nbt.getInt("size");
        for (int i = 0; i < size; i++) {
            String portal = nbt.getString("portal_" + i);
            if (!portal.isEmpty()) {
                state.infernoPortals.add(portal);
            }
        }
        return state;
    }
    
    public static InfernoPortalState getServerState(net.minecraft.server.MinecraftServer server) {
        PersistentStateManager persistentStateManager = server.getOverworld().getPersistentStateManager();
        return persistentStateManager.getOrCreate(
            InfernoPortalState::createFromNbt,
            InfernoPortalState::new,
            "inferno_portals"
        );
    }
    
    public void addInfernoPortal(RegistryKey<net.minecraft.world.World> worldKey, BlockPos pos) {
        infernoPortals.add(worldKey.getValue().toString() + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ());
        markDirty();
    }
    
    public void removeInfernoPortal(RegistryKey<net.minecraft.world.World> worldKey, BlockPos pos) {
        infernoPortals.remove(worldKey.getValue().toString() + ":" + pos.getX() + "," + pos.getY() + "," + pos.getZ());
        markDirty();
    }
    
    public Set<BlockPos> getInfernoPortals(RegistryKey<net.minecraft.world.World> worldKey) {
        Set<BlockPos> positions = new HashSet<>();
        String worldPrefix = worldKey.getValue().toString() + ":";
        
        for (String portal : infernoPortals) {
            if (portal.startsWith(worldPrefix)) {
                String coords = portal.substring(worldPrefix.length());
                String[] parts = coords.split(",");
                if (parts.length == 3) {
                    try {
                        int x = Integer.parseInt(parts[0]);
                        int y = Integer.parseInt(parts[1]);
                        int z = Integer.parseInt(parts[2]);
                        positions.add(new BlockPos(x, y, z));
                    } catch (NumberFormatException e) {
                        // Skip invalid entries
                    }
                }
            }
        }
        
        return positions;
    }
} 