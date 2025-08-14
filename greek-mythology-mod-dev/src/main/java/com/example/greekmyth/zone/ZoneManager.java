package com.example.greekmyth.zone;

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

public class ZoneManager {
    
    private static final Map<UUID, ZoneSelection> playerSelections = new HashMap<>();
    private static final Map<String, ProtectedZone> protectedZones = new HashMap<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String ZONES_FILENAME = "protected_zones.json";
    private static Path zonesFile = null;
    private static boolean protectionEnabled = true; // Global protection toggle
    
    /**
     * Initialize the zone manager and load zones from file
     */
    public static void initialize(MinecraftServer server) {
        try {
            // Set the zones file path in the world directory
            zonesFile = server.getRunDirectory()
                .resolve("world")
                .resolve("data")
                .resolve(ZONES_FILENAME);
            
            // Create directories if they don't exist
            Files.createDirectories(zonesFile.getParent());
            
            // Load existing zones
            loadZones();
            
            GreekMythologyMod.LOGGER.info("Zone Manager: Initialized and loaded from {}", zonesFile);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Zone Manager: Failed to initialize", e);
        }
    }
    
    /**
     * Handle left-click (first corner selection)
     */
    public static void handleLeftClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        ZoneSelection selection = playerSelections.get(playerId);
        
        if (selection == null) {
            selection = new ZoneSelection();
            playerSelections.put(playerId, selection);
        }
        
        selection.setCorner1(pos);
        
        player.sendMessage(Text.literal("§6§l[Power Stick] §r§aFirst corner set at: " + formatPosition(pos)).formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Right-click another block to set the second corner.").formatted(Formatting.GRAY), false);
        
        GreekMythologyMod.LOGGER.info("Zone Manager: Player {} set first corner at {}", player.getName().getString(), pos);
    }
    
    /**
     * Handle right-click (second corner selection and zone creation)
     */
    public static void handleRightClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        handleRightClick(player, world, pos, false, false);
    }

    public static void handleRightClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos, boolean ignoreSizeLimit, boolean fullHeight) {
        UUID playerId = player.getUuid();
        ZoneSelection selection = playerSelections.get(playerId);
        
        if (selection == null || selection.getCorner1() == null) {
            player.sendMessage(Text.literal("§6§l[Power Stick] §r§cPlease left-click a block first to set the first corner.").formatted(Formatting.RED), false);
            return;
        }
        
        selection.setCorner2(pos);
        
        BlockPos c1 = selection.getCorner1();
        BlockPos c2 = selection.getCorner2();
        if (fullHeight) {
            int bottomY = world.getBottomY();
            // Build height spans 384 in modern versions
            int topYExclusive = bottomY + 384;
            c1 = new BlockPos(c1.getX(), bottomY, c1.getZ());
            c2 = new BlockPos(c2.getX(), topYExclusive - 1, c2.getZ());
        }

        // Create the protected zone
        ProtectedZone zone = new ProtectedZone(
            c1,
            c2,
            player.getUuid(),
            player.getName().getString()
        );
        
        // Check size limit only when not using spawn protect stick
        if (!ignoreSizeLimit) {
            // Check if zone is too large (max 100x100x100)
            if (zone.getVolume() > 1000000) {
                player.sendMessage(Text.literal("§6§l[Power Stick] §r§cZone is too large! Maximum size is 100x100x100 blocks.").formatted(Formatting.RED), false);
                playerSelections.remove(playerId);
                return;
            }
        }
        
        // Add zone to protection list
        String zoneId = zone.getId();
        protectedZones.put(zoneId, zone);
        saveZones();
        
        // Clear selection
        playerSelections.remove(playerId);
        
        // Send success message
        player.sendMessage(Text.literal("§6§l[Power Stick] §r§aProtected zone created successfully!").formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Zone ID: " + zoneId).formatted(Formatting.GRAY), false);
        if (!ignoreSizeLimit) {
            player.sendMessage(Text.literal("§7Volume: " + zone.getVolume() + " blocks").formatted(Formatting.GRAY), false);
        } else {
            player.sendMessage(Text.literal("§7Height: world bottom to sky (full vertical)").formatted(Formatting.GRAY), false);
        }
        player.sendMessage(Text.literal("§7Owner: " + player.getName().getString()).formatted(Formatting.GRAY), false);
        
        GreekMythologyMod.LOGGER.info("Zone Manager: Player {} created protected zone {} with volume {}", 
            player.getName().getString(), zoneId, zone.getVolume());
    }
    
    /**
     * Check if a block is protected
     */
    public static boolean isBlockProtected(BlockPos pos) {
        for (ProtectedZone zone : protectedZones.values()) {
            if (zone.contains(pos)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Check if a player can break a block at a position
     */
    public static boolean canPlayerBreakBlock(ServerPlayerEntity player, BlockPos pos) {
        // If protection is disabled globally, allow all breaks
        if (!protectionEnabled) {
            return true;
        }
        
        for (ProtectedZone zone : protectedZones.values()) {
            if (zone.contains(pos)) {
                // Deny ALL players (including zone owners) when protection is enabled
                return false;
            }
        }
        return true; // Not in any protected zone
    }
    
    /**
     * Check if a player can place a block at a position
     */
    public static boolean canPlayerPlaceBlock(ServerPlayerEntity player, BlockPos pos) {
        // If protection is disabled globally, allow all placements
        if (!protectionEnabled) {
            return true;
        }
        
        for (ProtectedZone zone : protectedZones.values()) {
            if (zone.contains(pos)) {
                // Deny ALL players (including zone owners) when protection is enabled
                return false;
            }
        }
        return true; // Not in any protected zone
    }
    
    /**
     * Remove a protected zone (for zone owner or admins)
     */
    public static boolean removeZone(ServerPlayerEntity player, String zoneId) {
        ProtectedZone zone = protectedZones.get(zoneId);
        if (zone == null) {
            player.sendMessage(Text.literal("§6§l[Power Stick] §r§cZone not found: " + zoneId).formatted(Formatting.RED), false);
            return false;
        }
        
        // Check if player is owner or has permission
        if (!zone.getOwnerId().equals(player.getUuid()) && !player.hasPermissionLevel(4)) {
            player.sendMessage(Text.literal("§6§l[Power Stick] §r§cYou don't have permission to remove this zone.").formatted(Formatting.RED), false);
            return false;
        }
        
        protectedZones.remove(zoneId);
        saveZones();
        
        player.sendMessage(Text.literal("§6§l[Power Stick] §r§aZone removed: " + zoneId).formatted(Formatting.GREEN), false);
        GreekMythologyMod.LOGGER.info("Zone Manager: Player {} removed zone {}", player.getName().getString(), zoneId);
        return true;
    }
    
    /**
     * List all zones for a player
     */
    public static void listZones(ServerPlayerEntity player) {
        player.sendMessage(Text.literal("§6§l[Power Stick] §r§eProtected Zones:").formatted(Formatting.GOLD), false);
        
        boolean hasZones = false;
        for (ProtectedZone zone : protectedZones.values()) {
            if (zone.getOwnerId().equals(player.getUuid()) || player.hasPermissionLevel(4)) {
                player.sendMessage(Text.literal("§7• " + zone.getId() + " - " + zone.getVolume() + " blocks - " + zone.getOwnerName()).formatted(Formatting.GRAY), false);
                hasZones = true;
            }
        }
        
        if (!hasZones) {
            player.sendMessage(Text.literal("§7No protected zones found.").formatted(Formatting.GRAY), false);
        }
    }
    
    /**
     * Save zones to file
     */
    private static void saveZones() {
        if (zonesFile == null) {
            GreekMythologyMod.LOGGER.warn("Zone Manager: Cannot save - not initialized");
            return;
        }
        
        try {
            String json = GSON.toJson(protectedZones);
            Files.write(zonesFile, json.getBytes());
            GreekMythologyMod.LOGGER.debug("Zone Manager: Saved {} zones to file", protectedZones.size());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Zone Manager: Failed to save zones", e);
        }
    }
    
    /**
     * Load zones from file
     */
    private static void loadZones() {
        if (zonesFile == null || !Files.exists(zonesFile)) {
            GreekMythologyMod.LOGGER.info("Zone Manager: No existing zones file found, starting fresh");
            return;
        }
        
        try {
            String json = Files.readString(zonesFile);
            Type type = new TypeToken<Map<String, ProtectedZone>>(){}.getType();
            Map<String, ProtectedZone> loaded = GSON.fromJson(json, type);
            
            if (loaded != null) {
                protectedZones.clear();
                protectedZones.putAll(loaded);
                GreekMythologyMod.LOGGER.info("Zone Manager: Loaded {} protected zones from file", loaded.size());
            }
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Zone Manager: Failed to load zones", e);
        }
    }

    /**
     * Reload zones from disk. Returns number of zones after reload.
     */
    public static int reloadZones() {
        loadZones();
        return protectedZones.size();
    }
    
    /**
     * Format position for display
     */
    private static String formatPosition(BlockPos pos) {
        return String.format("(%d, %d, %d)", pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Get all protected zones (for debugging)
     */
    public static Map<String, ProtectedZone> getAllZones() {
        return new HashMap<>(protectedZones);
    }

    /**
     * Debug helper: explain protection status at a position.
     */
    public static String explainProtectionAt(BlockPos pos) {
        StringBuilder sb = new StringBuilder();
        boolean any = false;
        for (ProtectedZone zone : protectedZones.values()) {
            BlockPos min = zone.getMinCorner();
            BlockPos max = zone.getMaxCorner();
            boolean inX = pos.getX() >= min.getX() && pos.getX() <= max.getX();
            boolean inY = pos.getY() >= min.getY() && pos.getY() <= max.getY();
            boolean inZ = pos.getZ() >= min.getZ() && pos.getZ() <= max.getZ();
            if (inX || inY || inZ) {
                any = true;
                sb.append("Zone ").append(zone.getId())
                  .append(" owner=").append(zone.getOwnerName())
                  .append(" min=").append(min.toShortString())
                  .append(" max=").append(max.toShortString())
                  .append(" | inX=").append(inX)
                  .append(" inY=").append(inY)
                  .append(" inZ=").append(inZ)
                  .append('\n');
            }
        }
        if (!any) {
            sb.append("No nearby zones intersect any axis here.");
        }
        return sb.toString();
    }
    
    /**
     * Clear all zones (for testing)
     */
    public static void clearAllZones() {
        protectedZones.clear();
        saveZones();
        GreekMythologyMod.LOGGER.info("Zone Manager: Cleared all protected zones");
    }
    
    /**
     * Disable zone protection globally (allows breaking in all zones)
     */
    public static void disableProtection() {
        protectionEnabled = false;
        GreekMythologyMod.LOGGER.info("Zone Manager: Global protection disabled");
    }
    
    /**
     * Enable zone protection globally (prevents breaking in all zones)
     */
    public static void enableProtection() {
        protectionEnabled = true;
        GreekMythologyMod.LOGGER.info("Zone Manager: Global protection enabled");
    }
    
    /**
     * Check if protection is currently enabled
     */
    public static boolean isProtectionEnabled() {
        return protectionEnabled;
    }
} 