package com.example.greekmyth.pvp;

import com.example.greekmyth.GreekMythologyMod;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PvpZoneManager {
    
    private static final Map<UUID, PvpZoneSelection> playerSelections = new HashMap<>();
    private static final Map<String, NoPvpZone> noPvpZones = new HashMap<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String PVP_ZONES_FILENAME = "pvp_zones.json";
    private static Path pvpZonesFile = null;
    
    /**
     * Initialize the PvP zone manager and load zones from file
     */
    public static void initialize(MinecraftServer server) {
        try {
            // Set the PvP zones file path in the world directory
            pvpZonesFile = server.getRunDirectory()
                .resolve("world")
                .resolve("data")
                .resolve(PVP_ZONES_FILENAME);
            
            // Create directories if they don't exist
            Files.createDirectories(pvpZonesFile.getParent());
            
            // Load existing zones
            loadPvpZones();
            
            GreekMythologyMod.LOGGER.info("PvP Zone Manager: Initialized and loaded from {}", pvpZonesFile);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("PvP Zone Manager: Failed to initialize", e);
        }
    }
    
    /**
     * Handle left-click (first corner selection)
     */
    public static void handleLeftClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        PvpZoneSelection selection = playerSelections.get(playerId);
        
        if (selection == null) {
            selection = new PvpZoneSelection();
            playerSelections.put(playerId, selection);
        }
        
        selection.setCorner1(pos);
        
        player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§aFirst corner set at: " + formatPosition(pos)).formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Right-click another block to set the second corner.").formatted(Formatting.GRAY), false);
        
        GreekMythologyMod.LOGGER.info("PvP Zone Manager: Player {} set first corner at {}", player.getName().getString(), pos);
    }
    
    /**
     * Handle right-click (second corner selection and zone creation)
     */
    public static void handleRightClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        PvpZoneSelection selection = playerSelections.get(playerId);
        
        if (selection == null || selection.getCorner1() == null) {
            player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§cPlease left-click a block first to set the first corner.").formatted(Formatting.RED), false);
            return;
        }
        
        selection.setCorner2(pos);
        
        // Create the no PvP zone (full height from bedrock to build limit)
        NoPvpZone zone = new NoPvpZone(
            selection.getCorner1(),
            selection.getCorner2(),
            player.getUuid(),
            player.getName().getString()
        );
        
        // Add zone to protection list
        String zoneId = zone.getId();
        noPvpZones.put(zoneId, zone);
        savePvpZones();
        
        // Clear selection
        playerSelections.remove(playerId);
        
        // Send success message
        player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§aNo PvP zone created successfully!").formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Zone ID: " + zoneId).formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7Area: " + zone.getArea() + " blocks²").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7Height: Bedrock to Build Limit").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7Owner: " + player.getName().getString()).formatted(Formatting.GRAY), false);
        
        GreekMythologyMod.LOGGER.info("PvP Zone Manager: Player {} created no PvP zone {} with area {}", 
            player.getName().getString(), zoneId, zone.getArea());
    }
    
    /**
     * Check if a position is in a no PvP zone
     */
    public static boolean isInNoPvpZone(BlockPos pos) {
        for (NoPvpZone zone : noPvpZones.values()) {
            if (zone.contains(pos)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Check if a player can engage in PvP at a position
     */
    public static boolean canPlayerPvp(ServerPlayerEntity player, BlockPos pos) {
        // If position is in a no PvP zone, deny PvP
        return !isInNoPvpZone(pos);
    }
    
    /**
     * Remove a no PvP zone (for zone owner or admins)
     */
    public static boolean removePvpZone(ServerPlayerEntity player, String zoneId) {
        NoPvpZone zone = noPvpZones.get(zoneId);
        if (zone == null) {
            player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§cZone not found: " + zoneId).formatted(Formatting.RED), false);
            return false;
        }
        
        // Check if player is owner or has permission
        if (!zone.getOwnerId().equals(player.getUuid()) && !player.hasPermissionLevel(4)) {
            player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§cYou don't have permission to remove this zone.").formatted(Formatting.RED), false);
            return false;
        }
        
        noPvpZones.remove(zoneId);
        savePvpZones();
        
        player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§aNo PvP zone removed: " + zoneId).formatted(Formatting.GREEN), false);
        GreekMythologyMod.LOGGER.info("PvP Zone Manager: Player {} removed no PvP zone {}", player.getName().getString(), zoneId);
        return true;
    }
    
    /**
     * List all no PvP zones for a player
     */
    public static void listPvpZones(ServerPlayerEntity player) {
        player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§eNo PvP Zones:").formatted(Formatting.GOLD), false);
        
        boolean hasZones = false;
        for (NoPvpZone zone : noPvpZones.values()) {
            if (zone.getOwnerId().equals(player.getUuid()) || player.hasPermissionLevel(4)) {
                player.sendMessage(Text.literal("§7• " + zone.getId() + " - " + zone.getArea() + " blocks² - " + zone.getOwnerName()).formatted(Formatting.GRAY), false);
                hasZones = true;
            }
        }
        
        if (!hasZones) {
            player.sendMessage(Text.literal("§7No no PvP zones found.").formatted(Formatting.GRAY), false);
        }
    }
    
    /**
     * Save PvP zones to file
     */
    private static void savePvpZones() {
        if (pvpZonesFile == null) {
            GreekMythologyMod.LOGGER.warn("PvP Zone Manager: Cannot save - not initialized");
            return;
        }
        
        try {
            String json = GSON.toJson(noPvpZones);
            Files.write(pvpZonesFile, json.getBytes());
            GreekMythologyMod.LOGGER.debug("PvP Zone Manager: Saved {} zones to file", noPvpZones.size());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("PvP Zone Manager: Failed to save PvP zones", e);
        }
    }
    
    /**
     * Load PvP zones from file
     */
    private static void loadPvpZones() {
        if (pvpZonesFile == null || !Files.exists(pvpZonesFile)) {
            GreekMythologyMod.LOGGER.info("PvP Zone Manager: No existing PvP zones file found, starting fresh");
            return;
        }
        
        try {
            String json = Files.readString(pvpZonesFile);
            Type type = new TypeToken<Map<String, NoPvpZone>>(){}.getType();
            Map<String, NoPvpZone> loaded = GSON.fromJson(json, type);
            
            if (loaded != null) {
                noPvpZones.clear();
                noPvpZones.putAll(loaded);
                GreekMythologyMod.LOGGER.info("PvP Zone Manager: Loaded {} no PvP zones from file", loaded.size());
            }
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("PvP Zone Manager: Failed to load PvP zones", e);
        }
    }
    
    /**
     * Format position for display
     */
    private static String formatPosition(BlockPos pos) {
        return String.format("(%d, %d, %d)", pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Get all no PvP zones (for debugging)
     */
    public static Map<String, NoPvpZone> getAllPvpZones() {
        return new HashMap<>(noPvpZones);
    }
    
    /**
     * Clear all PvP zones (for testing)
     */
    public static void clearAllPvpZones() {
        noPvpZones.clear();
        savePvpZones();
        GreekMythologyMod.LOGGER.info("PvP Zone Manager: Cleared all no PvP zones");
    }
} 