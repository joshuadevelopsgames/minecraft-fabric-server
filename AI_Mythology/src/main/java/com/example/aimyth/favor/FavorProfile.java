package com.example.aimyth.favor;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a player's favor profile with all Olympian gods.
 */
public class FavorProfile {
    private final Map<God, Integer> favorValues;
    
    public FavorProfile() {
        this.favorValues = new HashMap<>();
        // Initialize all gods with neutral favor
        for (God god : God.values()) {
            favorValues.put(god, 0);
        }
    }
    
    public int getFavor(God god) {
        return favorValues.getOrDefault(god, 0);
    }
    
    public void addFavor(God god, int amount) {
        int current = getFavor(god);
        favorValues.put(god, current + amount);
    }
    
    public void setFavor(God god, int amount) {
        favorValues.put(god, amount);
    }
    
    public FavorTier getFavorTier(God god) {
        int favor = getFavor(god);
        
        if (favor >= 300) return FavorTier.CHAMPION;
        if (favor >= 150) return FavorTier.CHOSEN;
        if (favor >= 50) return FavorTier.RESPECTED;
        if (favor >= -50) return FavorTier.NEUTRAL;
        return FavorTier.DISFAVORED;
    }
    
    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        for (Map.Entry<God, Integer> entry : favorValues.entrySet()) {
            json.addProperty(entry.getKey().name(), entry.getValue());
        }
        return json;
    }
    
    public static FavorProfile fromJson(JsonObject json) {
        FavorProfile profile = new FavorProfile();
        for (God god : God.values()) {
            if (json.has(god.name())) {
                profile.setFavor(god, json.get(god.name()).getAsInt());
            }
        }
        return profile;
    }
} 