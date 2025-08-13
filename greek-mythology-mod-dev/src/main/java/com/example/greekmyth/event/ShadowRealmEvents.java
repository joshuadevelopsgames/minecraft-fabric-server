package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.dimension.ShadowRealmDimensionManager;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.block.BlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ShadowRealmEvents {
    
    public static void register() {
        // Register block break events for one-way syncing
        PlayerBlockBreakEvents.AFTER.register(ShadowRealmEvents::onBlockBroken);
        
        // Register entity events for syncing
        ServerEntityEvents.ENTITY_LOAD.register(ShadowRealmEvents::onEntityLoad);
        
        // Register world events
        ServerWorldEvents.LOAD.register(ShadowRealmEvents::onWorldLoad);
        
        GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm events registered successfully");
    }
    
    /**
     * Handle block breaking in overworld - sync to shadow realm
     */
    private static void onBlockBroken(World world, net.minecraft.entity.player.PlayerEntity player, BlockPos pos, BlockState state, net.minecraft.block.entity.BlockEntity blockEntity) {
        // Only sync if this is the overworld
        if (!ShadowRealmDimensionManager.isOverworld(world)) {
            return;
        }
        
        // Get the shadow realm world
        if (world instanceof ServerWorld serverWorld) {
            ServerWorld shadowRealm = getShadowRealmWorld(serverWorld.getServer());
            if (shadowRealm == null) {
                return;
            }
            
            // Mirror the block change to shadow realm (set to air)
            try {
                shadowRealm.setBlockState(pos, net.minecraft.block.Blocks.AIR.getDefaultState());
                GreekMythologyMod.LOGGER.debug("SHADOW REALM SYNC: Block broken at {} synced to shadow realm", pos);
            } catch (Exception e) {
                GreekMythologyMod.LOGGER.warn("SHADOW REALM SYNC: Failed to sync block breaking at {}: {}", pos, e.getMessage());
            }
        }
    }
    
    /**
     * Handle entity loading - sync to shadow realm if needed
     */
    private static void onEntityLoad(net.minecraft.entity.Entity entity, ServerWorld world) {
        // Only sync if this is the overworld and entity is a player
        if (!ShadowRealmDimensionManager.isOverworld(world) || !(entity instanceof net.minecraft.entity.player.PlayerEntity)) {
            return;
        }
        
        // Get the shadow realm world
        ServerWorld shadowRealm = getShadowRealmWorld(world.getServer());
        if (shadowRealm == null) {
            return;
        }
        
        // TODO: Implement entity syncing logic
        // This would sync player positions, inventory changes, etc.
        GreekMythologyMod.LOGGER.debug("SHADOW REALM SYNC: Entity {} loaded in overworld, ready for shadow realm sync", entity.getName().getString());
    }
    
    /**
     * Handle world loading - initialize shadow realm if needed
     */
    private static void onWorldLoad(MinecraftServer server, ServerWorld world) {
        if (ShadowRealmDimensionManager.isOverworld(world)) {
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Overworld loaded, shadow realm sync ready");
        } else if (ShadowRealmDimensionManager.isShadowRealm(world)) {
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm loaded successfully");
        }
    }
    
    /**
     * Get the shadow realm world from the server
     */
    private static ServerWorld getShadowRealmWorld(MinecraftServer server) {
        try {
            return server.getWorld(ShadowRealmDimensionManager.getShadowRealmDimension());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("SHADOW REALM: Failed to get shadow realm world: {}", e.getMessage());
            return null;
        }
    }
    
    /**
     * Check if shadow realm syncing is available
     */
    public static boolean isShadowRealmAvailable(MinecraftServer server) {
        return getShadowRealmWorld(server) != null;
    }
}
