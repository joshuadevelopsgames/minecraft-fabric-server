package com.example.greekmyth.favor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages god-specific configurations loaded from JSON files.
 * Each god has their own configuration file with behavior, thresholds, and rewards.
 */
public class GodConfig {
    private static final Map<God, JsonObject> godConfigs = new HashMap<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
    /**
     * Load all god configurations from JSON files
     */
    public static void loadConfigs(ResourceManager resourceManager) {
        godConfigs.clear();
        
        for (God god : God.values()) {
            String configPath = "data/greekmyth/gods/" + god.name().toLowerCase() + ".json";
            Identifier configId = Identifier.of(GreekMythologyMod.MOD_ID, configPath);
            
            try {
                var resource = resourceManager.getResource(configId).orElse(null);
                if (resource != null) {
                    try (var reader = new InputStreamReader(resource.getInputStream())) {
                        JsonObject config = JsonParser.parseReader(reader).getAsJsonObject();
                        godConfigs.put(god, config);
                        GreekMythologyMod.LOGGER.info("Loaded config for {}: {}", god.getDisplayName(), configPath);
                    }
                } else {
                    GreekMythologyMod.LOGGER.warn("Could not find config file for {}: {}", god.getDisplayName(), configPath);
                }
            } catch (Exception e) {
                GreekMythologyMod.LOGGER.error("Failed to load config for {}: {}", god.getDisplayName(), e.getMessage());
            }
        }
        
        GreekMythologyMod.LOGGER.info("Loaded {} god configurations", godConfigs.size());
    }
    
    /**
     * Get the configuration for a specific god
     */
    public static JsonObject getConfig(God god) {
        return godConfigs.get(god);
    }
    
    /**
     * Check if a god has a configuration loaded
     */
    public static boolean hasConfig(God god) {
        return godConfigs.containsKey(god);
    }
    
    /**
     * Get favor value for a specific action with a god
     */
    public static int getActionFavor(God god, String actionType, String actionName) {
        JsonObject config = getConfig(god);
        if (config == null) return 0;
        
        try {
            JsonObject actions = config.getAsJsonObject("actions");
            if (actions == null) return 0;
            
            JsonObject actionTypeObj = actions.getAsJsonObject(actionType);
            if (actionTypeObj == null) return 0;
            
            JsonObject action = actionTypeObj.getAsJsonObject(actionName);
            if (action == null) return 0;
            
            return action.get("favor").getAsInt();
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to get favor for action {} with {}: {}", actionName, god.getDisplayName(), e.getMessage());
            return 0;
        }
    }
    
    /**
     * Get the description for a specific action with a god
     */
    public static String getActionDescription(God god, String actionType, String actionName) {
        JsonObject config = getConfig(god);
        if (config == null) return "Unknown action";
        
        try {
            JsonObject actions = config.getAsJsonObject("actions");
            if (actions == null) return "Unknown action";
            
            JsonObject actionTypeObj = actions.getAsJsonObject(actionType);
            if (actionTypeObj == null) return "Unknown action";
            
            JsonObject action = actionTypeObj.getAsJsonObject(actionName);
            if (action == null) return "Unknown action";
            
            return action.get("description").getAsString();
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to get description for action {} with {}: {}", actionName, god.getDisplayName(), e.getMessage());
            return "Unknown action";
        }
    }
    
    /**
     * Get favor settings for a god
     */
    public static FavorSettings getFavorSettings(God god) {
        JsonObject config = getConfig(god);
        if (config == null) {
            // Return default settings
            return new FavorSettings(1, 24000, 1000, -1000);
        }
        
        try {
            JsonObject settings = config.getAsJsonObject("favorSettings");
            if (settings == null) {
                return new FavorSettings(1, 24000, 1000, -1000);
            }
            
            int baseDecayRate = settings.get("baseDecayRate").getAsInt();
            int decayInterval = settings.get("decayInterval").getAsInt();
            int maxFavor = settings.get("maxFavor").getAsInt();
            int minFavor = settings.get("minFavor").getAsInt();
            
            return new FavorSettings(baseDecayRate, decayInterval, maxFavor, minFavor);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to get favor settings for {}: {}", god.getDisplayName(), e.getMessage());
            return new FavorSettings(1, 24000, 1000, -1000);
        }
    }
    
    /**
     * Get rewards for a specific tier with a god
     */
    public static GodRewards getRewards(God god, FavorTier tier) {
        JsonObject config = getConfig(god);
        if (config == null) return new GodRewards();
        
        try {
            JsonObject rewards = config.getAsJsonObject("rewards");
            if (rewards == null) return new GodRewards();
            
            JsonObject tierRewards = rewards.getAsJsonObject(tier.name());
            if (tierRewards == null) return new GodRewards();
            
            return GSON.fromJson(tierRewards, GodRewards.class);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to get rewards for {} tier {}: {}", god.getDisplayName(), tier.getDisplayName(), e.getMessage());
            return new GodRewards();
        }
    }
    
    /**
     * Check if a god has a special rule
     */
    public static boolean hasSpecialRule(God god, String ruleName) {
        JsonObject config = getConfig(god);
        if (config == null) return false;
        
        try {
            JsonObject specialRules = config.getAsJsonObject("specialRules");
            if (specialRules == null) return false;
            
            return specialRules.has(ruleName) && specialRules.get(ruleName).getAsBoolean();
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to check special rule {} for {}: {}", ruleName, god.getDisplayName(), e.getMessage());
            return false;
        }
    }
    
    /**
     * Get all available actions for a god
     */
    public static Map<String, Integer> getPositiveActions(God god) {
        return getActions(god, "positive");
    }
    
    /**
     * Get all negative actions for a god
     */
    public static Map<String, Integer> getNegativeActions(God god) {
        return getActions(god, "negative");
    }
    
    private static Map<String, Integer> getActions(God god, String actionType) {
        Map<String, Integer> actions = new HashMap<>();
        JsonObject config = getConfig(god);
        if (config == null) return actions;
        
        try {
            JsonObject actionsObj = config.getAsJsonObject("actions");
            if (actionsObj == null) return actions;
            
            JsonObject actionTypeObj = actionsObj.getAsJsonObject(actionType);
            if (actionTypeObj == null) return actions;
            
            for (String actionName : actionTypeObj.keySet()) {
                JsonObject action = actionTypeObj.getAsJsonObject(actionName);
                if (action != null && action.has("favor")) {
                    actions.put(actionName, action.get("favor").getAsInt());
                }
            }
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.warn("Failed to get {} actions for {}: {}", actionType, god.getDisplayName(), e.getMessage());
        }
        
        return actions;
    }
    
    /**
     * Favor settings for a god
     */
    public static class FavorSettings {
        public final int baseDecayRate;
        public final int decayInterval;
        public final int maxFavor;
        public final int minFavor;
        
        public FavorSettings(int baseDecayRate, int decayInterval, int maxFavor, int minFavor) {
            this.baseDecayRate = baseDecayRate;
            this.decayInterval = decayInterval;
            this.maxFavor = maxFavor;
            this.minFavor = minFavor;
        }
    }
    
    /**
     * Rewards for a specific tier
     */
    public static class GodRewards {
        public String[] passiveAbilities = new String[0];
        public String[] activeAbilities = new String[0];
    }
} 