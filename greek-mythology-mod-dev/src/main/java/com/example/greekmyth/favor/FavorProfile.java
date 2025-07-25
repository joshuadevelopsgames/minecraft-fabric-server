package com.example.greekmyth.favor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Represents a player's favor profile, tracking their favor with all gods.
 * Each player starts with neutral favor (0) with all gods.
 */
public class FavorProfile {
    private final UUID playerUuid;
    private final String playerName;
    private final Map<God, Integer> favorMap;
    private final Map<God, Long> lastActivityMap;
    private final long creationTime;

    public FavorProfile(UUID playerUuid, String playerName) {
        this.playerUuid = playerUuid;
        this.playerName = playerName;
        this.favorMap = new HashMap<>();
        this.lastActivityMap = new HashMap<>();
        this.creationTime = System.currentTimeMillis();
        
        // Initialize all gods with neutral favor (0)
        for (God god : God.values()) {
            favorMap.put(god, 0);
            lastActivityMap.put(god, System.currentTimeMillis());
        }
    }

    // Getters
    public UUID getPlayerUuid() {
        return playerUuid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Map<God, Integer> getFavorMap() {
        return new HashMap<>(favorMap); // Return copy for safety
    }

    public Map<God, Long> getLastActivityMap() {
        return new HashMap<>(lastActivityMap); // Return copy for safety
    }

    public long getCreationTime() {
        return creationTime;
    }

    /**
     * Get favor for a specific god
     */
    public int getFavor(God god) {
        return favorMap.getOrDefault(god, 0);
    }

    /**
     * Set favor for a specific god
     */
    public void setFavor(God god, int favor) {
        favorMap.put(god, favor);
        lastActivityMap.put(god, System.currentTimeMillis());
    }

    /**
     * Add favor to a specific god
     */
    public void addFavor(God god, int amount) {
        int currentFavor = getFavor(god);
        setFavor(god, currentFavor + amount);
    }

    /**
     * Remove favor from a specific god
     */
    public void removeFavor(God god, int amount) {
        int currentFavor = getFavor(god);
        setFavor(god, currentFavor - amount);
    }

    /**
     * Get the favor tier for a specific god
     */
    public FavorTier getFavorTier(God god) {
        return FavorTier.getTierForFavor(getFavor(god));
    }

    /**
     * Get the last activity time for a specific god
     */
    public long getLastActivity(God god) {
        return lastActivityMap.getOrDefault(god, creationTime);
    }

    /**
     * Update the last activity time for a specific god
     */
    public void updateLastActivity(God god) {
        lastActivityMap.put(god, System.currentTimeMillis());
    }

    /**
     * Get the highest favor tier the player has achieved
     */
    public FavorTier getHighestTier() {
        FavorTier highest = FavorTier.NEUTRAL;
        for (God god : God.values()) {
            FavorTier tier = getFavorTier(god);
            if (tier.ordinal() > highest.ordinal()) {
                highest = tier;
            }
        }
        return highest;
    }

    /**
     * Get the god with the highest favor
     */
    public God getFavoriteGod() {
        God favorite = null;
        int highestFavor = Integer.MIN_VALUE;
        
        for (Map.Entry<God, Integer> entry : favorMap.entrySet()) {
            if (entry.getValue() > highestFavor) {
                highestFavor = entry.getValue();
                favorite = entry.getKey();
            }
        }
        
        return favorite;
    }

    /**
     * Get a formatted display of the player's favor status
     */
    public String getFavorDisplay() {
        StringBuilder display = new StringBuilder();
        display.append("Favor Profile for ").append(playerName).append(":\n");
        
        for (God god : God.values()) {
            int favor = getFavor(god);
            FavorTier tier = getFavorTier(god);
            display.append(String.format("  %s: %d (%s)\n", 
                god.getDisplayName(), favor, tier.getFullDisplayName()));
        }
        
        return display.toString();
    }

    /**
     * Get a summary of the player's favor status
     */
    public String getFavorSummary() {
        God favorite = getFavoriteGod();
        FavorTier highest = getHighestTier();
        
        return String.format("%s - Highest Tier: %s, Favorite God: %s", 
            playerName, highest.getFullDisplayName(), 
            favorite != null ? favorite.getDisplayName() : "None");
    }

    /**
     * Check if the player has any god at a specific tier or higher
     */
    public boolean hasTierOrHigher(FavorTier tier) {
        for (God god : God.values()) {
            if (getFavorTier(god).ordinal() >= tier.ordinal()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get all gods at a specific tier
     */
    public java.util.List<God> getGodsAtTier(FavorTier tier) {
        java.util.List<God> gods = new java.util.ArrayList<>();
        for (God god : God.values()) {
            if (getFavorTier(god) == tier) {
                gods.add(god);
            }
        }
        return gods;
    }
} 