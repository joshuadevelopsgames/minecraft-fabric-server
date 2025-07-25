package com.example.greekmyth.favor;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Manages the favor system for all players.
 * Handles loading, modifying, and decaying favor over time.
 */
public class FavorManager {
    private static final Map<UUID, FavorProfile> playerProfiles = new HashMap<>();
    private static final Map<UUID, Long> lastDecayTime = new HashMap<>();
    private static final long DECAY_CHECK_INTERVAL = 24000; // 20 minutes in ticks
    
    /**
     * Initialize the favor manager
     */
    public static void init() {
        GreekMythologyMod.LOGGER.info("Initializing Favor Manager");
        playerProfiles.clear();
        lastDecayTime.clear();
    }
    
    /**
     * Get or create a favor profile for a player
     */
    public static FavorProfile getOrCreateProfile(UUID playerUuid, String playerName) {
        return playerProfiles.computeIfAbsent(playerUuid, uuid -> {
            GreekMythologyMod.LOGGER.info("Creating new favor profile for player: {}", playerName);
            return new FavorProfile(uuid, playerName);
        });
    }
    
    /**
     * Get a favor profile for a player
     */
    public static FavorProfile getProfile(UUID playerUuid) {
        return playerProfiles.get(playerUuid);
    }
    
    /**
     * Get a favor profile for a player by name
     */
    public static FavorProfile getProfileByName(String playerName) {
        for (FavorProfile profile : playerProfiles.values()) {
            if (profile.getPlayerName().equals(playerName)) {
                return profile;
            }
        }
        return null;
    }
    
    /**
     * Add favor to a player for a specific god
     */
    public static void addFavor(UUID playerUuid, God god, int amount) {
        FavorProfile profile = getOrCreateProfile(playerUuid, "Unknown");
        int oldFavor = profile.getFavor(god);
        FavorTier oldTier = profile.getFavorTier(god);
        
        profile.addFavor(god, amount);
        profile.updateLastActivity(god);
        
        int newFavor = profile.getFavor(god);
        FavorTier newTier = profile.getFavorTier(god);
        
        GreekMythologyMod.LOGGER.info("Player {} gained {} favor with {} ({} -> {})", 
            profile.getPlayerName(), amount, god.getDisplayName(), oldFavor, newFavor);
        
        // Check for tier changes
        if (oldTier != newTier) {
            GreekMythologyMod.LOGGER.info("Player {} reached {} tier with {}!", 
                profile.getPlayerName(), newTier.getFullDisplayName(), god.getDisplayName());
        }
    }
    
    /**
     * Remove favor from a player for a specific god
     */
    public static void removeFavor(UUID playerUuid, God god, int amount) {
        FavorProfile profile = getOrCreateProfile(playerUuid, "Unknown");
        int oldFavor = profile.getFavor(god);
        FavorTier oldTier = profile.getFavorTier(god);
        
        profile.removeFavor(god, amount);
        profile.updateLastActivity(god);
        
        int newFavor = profile.getFavor(god);
        FavorTier newTier = profile.getFavorTier(god);
        
        GreekMythologyMod.LOGGER.info("Player {} lost {} favor with {} ({} -> {})", 
            profile.getPlayerName(), amount, god.getDisplayName(), oldFavor, newFavor);
        
        // Check for tier changes
        if (oldTier != newTier) {
            GreekMythologyMod.LOGGER.info("Player {} dropped to {} tier with {}", 
                profile.getPlayerName(), newTier.getFullDisplayName(), god.getDisplayName());
        }
    }
    
    /**
     * Set favor for a player with a specific god
     */
    public static void setFavor(UUID playerUuid, God god, int favor) {
        FavorProfile profile = getOrCreateProfile(playerUuid, "Unknown");
        int oldFavor = profile.getFavor(god);
        FavorTier oldTier = profile.getFavorTier(god);
        
        profile.setFavor(god, favor);
        profile.updateLastActivity(god);
        
        int newFavor = profile.getFavor(god);
        FavorTier newTier = profile.getFavorTier(god);
        
        GreekMythologyMod.LOGGER.info("Player {} favor with {} set to {} (was: {})", 
            profile.getPlayerName(), god.getDisplayName(), newFavor, oldFavor);
        
        // Check for tier changes
        if (oldTier != newTier) {
            GreekMythologyMod.LOGGER.info("Player {} changed to {} tier with {}", 
                profile.getPlayerName(), newTier.getFullDisplayName(), god.getDisplayName());
        }
    }
    
    /**
     * Process favor decay for all players
     */
    public static void processDecay(MinecraftServer server) {
        long currentTime = server.getOverworld().getTime();
        
        for (FavorProfile profile : playerProfiles.values()) {
            UUID playerUuid = profile.getPlayerUuid();
            Long lastDecay = lastDecayTime.get(playerUuid);
            
            if (lastDecay == null || currentTime - lastDecay >= DECAY_CHECK_INTERVAL) {
                processPlayerDecay(profile, currentTime);
                lastDecayTime.put(playerUuid, currentTime);
            }
        }
    }
    
    /**
     * Process decay for a specific player
     */
    private static void processPlayerDecay(FavorProfile profile, long currentTime) {
        for (God god : God.values()) {
            GodConfig.FavorSettings settings = GodConfig.getFavorSettings(god);
            long lastActivity = profile.getLastActivity(god);
            long timeSinceActivity = currentTime - (lastActivity / 50); // Convert to ticks
            
            if (timeSinceActivity >= settings.decayInterval) {
                int currentFavor = profile.getFavor(god);
                int decayAmount = settings.baseDecayRate;
                
                // Apply Big Three bonus (slower decay for powerful gods)
                if (god.isBigThree()) {
                    decayAmount = Math.max(1, decayAmount / 2);
                }
                
                // Don't decay below minimum
                int newFavor = Math.max(settings.minFavor, currentFavor - decayAmount);
                
                if (newFavor != currentFavor) {
                    profile.setFavor(god, newFavor);
                    GreekMythologyMod.LOGGER.debug("Player {} favor with {} decayed by {} ({} -> {})", 
                        profile.getPlayerName(), god.getDisplayName(), decayAmount, currentFavor, newFavor);
                }
            }
        }
    }
    
    /**
     * Get all player profiles
     */
    public static Map<UUID, FavorProfile> getAllProfiles() {
        return new HashMap<>(playerProfiles);
    }
    
    /**
     * Remove a player's profile (when they leave)
     */
    public static void removeProfile(UUID playerUuid) {
        FavorProfile profile = playerProfiles.remove(playerUuid);
        lastDecayTime.remove(playerUuid);
        
        if (profile != null) {
            GreekMythologyMod.LOGGER.info("Removed favor profile for player: {}", profile.getPlayerName());
        }
    }
    
    /**
     * Get the number of active profiles
     */
    public static int getProfileCount() {
        return playerProfiles.size();
    }
    
    /**
     * Check if a player has a profile
     */
    public static boolean hasProfile(UUID playerUuid) {
        return playerProfiles.containsKey(playerUuid);
    }
    
    /**
     * Get a player's favorite god (highest favor)
     */
    public static God getFavoriteGod(UUID playerUuid) {
        FavorProfile profile = getProfile(playerUuid);
        return profile != null ? profile.getFavoriteGod() : null;
    }
    
    /**
     * Get a player's highest favor tier
     */
    public static FavorTier getHighestTier(UUID playerUuid) {
        FavorProfile profile = getProfile(playerUuid);
        return profile != null ? profile.getHighestTier() : FavorTier.NEUTRAL;
    }
    
    /**
     * Get all players at a specific tier with a god
     */
    public static java.util.List<FavorProfile> getPlayersAtTier(God god, FavorTier tier) {
        java.util.List<FavorProfile> players = new java.util.ArrayList<>();
        
        for (FavorProfile profile : playerProfiles.values()) {
            if (profile.getFavorTier(god) == tier) {
                players.add(profile);
            }
        }
        
        return players;
    }
    
    /**
     * Get a summary of all player favor status
     */
    public static String getSystemSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Favor System Summary:\n");
        summary.append("Active Profiles: ").append(getProfileCount()).append("\n");
        
        for (God god : God.values()) {
            int totalPlayers = 0;
            Map<FavorTier, Integer> tierCounts = new HashMap<>();
            
            for (FavorProfile profile : playerProfiles.values()) {
                totalPlayers++;
                FavorTier tier = profile.getFavorTier(god);
                tierCounts.put(tier, tierCounts.getOrDefault(tier, 0) + 1);
            }
            
            summary.append(String.format("  %s: %d players", god.getDisplayName(), totalPlayers));
            
            for (FavorTier tier : FavorTier.values()) {
                int count = tierCounts.getOrDefault(tier, 0);
                if (count > 0) {
                    summary.append(String.format(", %s: %d", tier.getDisplayName(), count));
                }
            }
            summary.append("\n");
        }
        
        return summary.toString();
    }
} 