package com.example.greekmyth.dimension;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerRealmTracker {
    
    // Static map to track player realm states
    private static final Map<UUID, Boolean> playerRealmStates = new HashMap<>();
    
    /**
     * Check if a player is currently in the shadow realm
     */
    public static boolean isPlayerInShadowRealm(PlayerEntity player) {
        return playerRealmStates.getOrDefault(player.getUuid(), false);
    }
    
    /**
     * Set a player's realm state
     */
    public static void setPlayerRealm(PlayerEntity player, boolean inShadowRealm) {
        UUID playerUuid = player.getUuid();
        playerRealmStates.put(playerUuid, inShadowRealm);
        
        GreekMythologyMod.LOGGER.info("REALM CHANGE: Player {} is now in {} realm", 
            player.getName().getString(),
            inShadowRealm ? "Shadow" : "Overworld");
    }
    
    /**
     * Toggle a player's realm state
     */
    public static void togglePlayerRealm(PlayerEntity player) {
        boolean currentState = isPlayerInShadowRealm(player);
        setPlayerRealm(player, !currentState);
    }
    
    /**
     * Remove a player from tracking (when they disconnect)
     */
    public static void removePlayer(PlayerEntity player) {
        playerRealmStates.remove(player.getUuid());
        GreekMythologyMod.LOGGER.debug("REALM TRACKER: Removed player {} from tracking", player.getName().getString());
    }
    
    /**
     * Get the current realm state for a player
     */
    public static boolean getPlayerRealmState(PlayerEntity player) {
        return playerRealmStates.getOrDefault(player.getUuid(), false);
    }
    
    /**
     * Get the number of players currently tracked
     */
    public static int getTrackedPlayerCount() {
        return playerRealmStates.size();
    }
    
    /**
     * Clear all player tracking (useful for server restart)
     */
    public static void clearAllPlayers() {
        playerRealmStates.clear();
        GreekMythologyMod.LOGGER.info("REALM TRACKER: Cleared all player tracking");
    }
}
