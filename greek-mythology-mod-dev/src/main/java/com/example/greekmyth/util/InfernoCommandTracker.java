package com.example.greekmyth.util;

import com.example.greekmyth.GreekMythologyMod;
import java.util.HashSet;
import java.util.Set;

/**
 * Tracks usage of the /inferno Easter egg command
 */
public class InfernoCommandTracker {
    private static final Set<String> USED_BY = new HashSet<>();
    private static final String OWNER_NAME = "Kangarude";
    
    /**
     * Check if a player can use the /inferno command
     * @param playerName The player's name
     * @return true if the player can use the command
     */
    public static boolean canUseInferno(String playerName) {
        // Kangarude can always use it for testing
        if (OWNER_NAME.equals(playerName)) {
            GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} can use command (owner testing)", playerName);
            return true;
        }
        
        // Check if any non-owner player has already used it
        boolean hasNonOwnerUsed = USED_BY.stream()
            .anyMatch(name -> !OWNER_NAME.equals(name));
        
        if (hasNonOwnerUsed) {
            GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} cannot use command (already claimed by another player)", playerName);
            return false;
        }
        
        GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} can use command (first non-owner to find it!)", playerName);
        return true;
    }
    
    /**
     * Mark that a player has used the /inferno command
     * @param playerName The player's name
     */
    public static void markUsed(String playerName) {
        USED_BY.add(playerName);
        GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} has used the command. Total users: {}", playerName, USED_BY.size());
        
        // Log special message for the first non-owner user
        if (!OWNER_NAME.equals(playerName) && USED_BY.stream().anyMatch(name -> !OWNER_NAME.equals(name))) {
            GreekMythologyMod.LOGGER.info("INFERNO COMMAND: 🎉 EASTER EGG CLAIMED! {} is the lucky player who found the secret command!", playerName);
        }
    }
    
    /**
     * Get all players who have used the command
     * @return Set of player names
     */
    public static Set<String> getUsedBy() {
        return new HashSet<>(USED_BY);
    }
    
    /**
     * Check if the command has been claimed by a non-owner
     * @return true if claimed by someone other than Kangarude
     */
    public static boolean isClaimedByNonOwner() {
        return USED_BY.stream().anyMatch(name -> !OWNER_NAME.equals(name));
    }
}
