package com.example.greekmyth.event;

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

public class InfernoPortalEvents {
    
    public static final RegistryKey<net.minecraft.world.World> TARTARUS_WORLD = RegistryKey.of(RegistryKeys.WORLD, 
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_nether"));
    
    public static void register() {
        GreekMythologyMod.LOGGER.info("Registering Inferno Portal events...");
        
        // Check for inferno pearls near nether portals every tick
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            if (world.getTime() % 20 == 0) { // Check every second (20 ticks)
                checkForInfernoPearlsNearPortals(world);
            }
            
            // Spawn red particles for inferno portals
            if (world.getTime() % 5 == 0) { // Every 5 ticks
                spawnInfernoPortalParticles(world);
            }
        });
        
        GreekMythologyMod.LOGGER.info("Inferno Portal events registered successfully!");
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
                GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Inferno pearl detected near nether portal at {}", pearlPos);
                markPortalAsInferno(world, pearlPos);
                
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
    
    private static void markPortalAsInferno(ServerWorld world, BlockPos centerPos) {
        GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Marking nether portal at {} as inferno portal", centerPos);
        
        InfernoPortalState state = InfernoPortalState.getServerState(world.getServer());
        
        // Find all connected nether portal blocks in a reasonable area
        for (int x = -10; x <= 10; x++) {
            for (int y = -10; y <= 10; y++) {
                for (int z = -10; z <= 10; z++) {
                    BlockPos checkPos = centerPos.add(x, y, z);
                    BlockState blockState = world.getBlockState(checkPos);
                    
                    if (blockState.getBlock() == Blocks.NETHER_PORTAL) {
                        // Mark this position as an inferno portal (don't change the block)
                        state.addInfernoPortal(world.getRegistryKey(), checkPos);
                        GreekMythologyMod.LOGGER.debug("INFERNO PORTAL: Marked portal block at {}", checkPos);
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
            // Check if there's still a portal block here
            if (world.getBlockState(pos).getBlock() == Blocks.NETHER_PORTAL) {
                // Spawn red particles instead of purple
                double x = pos.getX() + world.random.nextDouble();
                double y = pos.getY() + world.random.nextDouble();
                double z = pos.getZ() + world.random.nextDouble();
                double velocityX = (world.random.nextDouble() - 0.5) * 0.5;
                double velocityY = (world.random.nextDouble() - 0.5) * 0.5;
                double velocityZ = (world.random.nextDouble() - 0.5) * 0.5;
                
                // Spawn flame and lava particles for red effect
                world.spawnParticles(ParticleTypes.FLAME, x, y, z, 1, velocityX, velocityY, velocityZ, 0.1);
                if (world.random.nextInt(3) == 0) {
                    world.spawnParticles(ParticleTypes.LAVA, x, y, z, 1, velocityX * 0.5, velocityY * 0.5, velocityZ * 0.5, 0.05);
                }
            } else {
                // Portal block is gone, remove from our tracking
                state.removeInfernoPortal(world.getRegistryKey(), pos);
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
        
        GreekMythologyMod.LOGGER.info("INFERNO PORTAL: Transformation effects created at {}", pos);
    }
    
    // Check if a portal block is an inferno portal
    public static boolean isInfernoPortal(ServerWorld world, BlockPos pos) {
        InfernoPortalState state = InfernoPortalState.getServerState(world.getServer());
        return state.getInfernoPortals(world.getRegistryKey()).contains(pos);
    }
    
    // Get the tartarus world
    public static ServerWorld getTartarusWorld(ServerWorld currentWorld) {
        return currentWorld.getServer().getWorld(TARTARUS_WORLD);
    }
}

// Persistent state to track which portal blocks are inferno portals
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