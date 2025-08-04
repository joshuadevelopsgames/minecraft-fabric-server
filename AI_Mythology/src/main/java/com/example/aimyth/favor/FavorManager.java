package com.example.aimyth.favor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Manages the favor system for the AI Mythology mod.
 */
public class FavorManager {
    private static final Logger LOGGER = LoggerFactory.getLogger("FavorManager");
    private static final String FAVOR_DATA_FILE = "aimyth_favor_data.json";
    
    private final Map<UUID, FavorProfile> favorProfiles = new HashMap<>();
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public void init() {
        LOGGER.info("Initializing AI Mythology Favor Manager...");
        loadFavorData();
        LOGGER.info("AI Mythology Favor Manager initialized successfully!");
    }
    
    private void loadFavorData() {
        try {
            Path dataFile = Paths.get(FAVOR_DATA_FILE);
            if (Files.exists(dataFile)) {
                String jsonData = Files.readString(dataFile);
                JsonObject root = JsonParser.parseString(jsonData).getAsJsonObject();
                
                for (String playerId : root.keySet()) {
                    try {
                        UUID uuid = UUID.fromString(playerId);
                        JsonObject profileData = root.getAsJsonObject(playerId);
                        FavorProfile profile = FavorProfile.fromJson(profileData);
                        favorProfiles.put(uuid, profile);
                    } catch (Exception e) {
                        LOGGER.warn("Failed to load favor data for player: {}", playerId);
                    }
                }
                
                LOGGER.info("Loaded favor data for {} players", favorProfiles.size());
            } else {
                LOGGER.info("No existing favor data found, starting fresh");
            }
        } catch (Exception e) {
            LOGGER.error("Failed to load favor data", e);
        }
    }
    
    public void saveFavorData() {
        try {
            JsonObject root = new JsonObject();
            
            for (Map.Entry<UUID, FavorProfile> entry : favorProfiles.entrySet()) {
                root.add(entry.getKey().toString(), entry.getValue().toJson());
            }
            
            String jsonData = gson.toJson(root);
            Files.writeString(Paths.get(FAVOR_DATA_FILE), jsonData);
            
            LOGGER.info("Saved favor data for {} players", favorProfiles.size());
        } catch (Exception e) {
            LOGGER.error("Failed to save favor data", e);
        }
    }
    
    public FavorProfile getFavorProfile(UUID playerUuid) {
        return favorProfiles.computeIfAbsent(playerUuid, k -> new FavorProfile());
    }
    
    public int getFavor(UUID playerUuid, God god) {
        FavorProfile profile = getFavorProfile(playerUuid);
        return profile.getFavor(god);
    }
    
    public void addFavor(UUID playerUuid, God god, int amount) {
        FavorProfile profile = getFavorProfile(playerUuid);
        profile.addFavor(god, amount);
        saveFavorData();
    }
    
    public void setFavor(UUID playerUuid, God god, int amount) {
        FavorProfile profile = getFavorProfile(playerUuid);
        profile.setFavor(god, amount);
        saveFavorData();
    }
    
    public FavorTier getFavorTier(UUID playerUuid, God god) {
        FavorProfile profile = getFavorProfile(playerUuid);
        return profile.getFavorTier(god);
    }
    
    public int getLoadedProfileCount() {
        return favorProfiles.size();
    }
} 