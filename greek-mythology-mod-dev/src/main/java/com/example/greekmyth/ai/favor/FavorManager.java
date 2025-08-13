package com.example.aimyth.favor;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FavorManager {
    private static final Map<UUID, Map<String, Integer>> playerFavor = new HashMap<>();
    
    public static final String[] OLYMPIAN_GODS = {
        "zeus", "poseidon", "hades", "athena", "ares", "apollo", 
        "artemis", "hermes", "hephaestus", "aphrodite", "demeter", "dionysus"
    };
    
    public static void init() {
        AIMythologyMod.LOGGER.info("Initializing AI Mythology Favor System...");
    }
    
    public static void addFavor(ServerPlayerEntity player, String god, int amount) {
        UUID playerId = player.getUuid();
        Map<String, Integer> godFavor = playerFavor.computeIfAbsent(playerId, k -> new HashMap<>());
        
        int currentFavor = godFavor.getOrDefault(god, 0);
        int newFavor = Math.max(0, Math.min(100, currentFavor + amount));
        godFavor.put(god, newFavor);
        
        AIMythologyMod.LOGGER.info("Player {} gained {} favor with {} (Total: {})", 
            player.getName().getString(), amount, god, newFavor);
        
        if (amount > 0) {
            player.sendMessage(Text.literal("§6+" + amount + " favor with " + god.substring(0, 1).toUpperCase() + god.substring(1))
                .formatted(Formatting.GOLD), false);
        }
        
        // Check for divine claim when reaching 100 favor
        com.example.aimyth.classes.DivineClass.checkForDivineClaim(player, god);
    }
    
    public static int getFavor(ServerPlayerEntity player, String god) {
        UUID playerId = player.getUuid();
        Map<String, Integer> godFavor = playerFavor.get(playerId);
        return godFavor != null ? godFavor.getOrDefault(god, 0) : 0;
    }
    
    public static void showFavorStatus(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        Map<String, Integer> godFavor = playerFavor.get(playerId);
        
        player.sendMessage(Text.literal("§6=== Your Divine Favor ===").formatted(Formatting.GOLD));
        
        if (godFavor == null || godFavor.isEmpty()) {
            player.sendMessage(Text.literal("§7You have not gained favor with any gods yet.").formatted(Formatting.GRAY));
            return;
        }
        
        for (String god : OLYMPIAN_GODS) {
            int favor = godFavor.getOrDefault(god, 0);
            String godName = god.substring(0, 1).toUpperCase() + god.substring(1);
            
            if (favor > 0) {
                String bar = getFavorBar(favor);
                player.sendMessage(Text.literal("§e" + godName + ": " + bar + " §7(" + favor + "/100)"));
            }
        }
    }
    
    private static String getFavorBar(int favor) {
        int filled = favor / 10;
        StringBuilder bar = new StringBuilder("§a");
        for (int i = 0; i < 10; i++) {
            if (i < filled) {
                bar.append("█");
            } else {
                bar.append("§7█");
            }
        }
        return bar.toString();
    }
    
    public static void resetFavor(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        playerFavor.remove(playerId);
        player.sendMessage(Text.literal("§cYour favor with all gods has been reset.").formatted(Formatting.RED));
        AIMythologyMod.LOGGER.info("Player {} reset their favor", player.getName().getString());
    }
} 