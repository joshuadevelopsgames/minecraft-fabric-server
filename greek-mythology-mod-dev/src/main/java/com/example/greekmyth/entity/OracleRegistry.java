package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.favor.God;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class OracleRegistry {
    
    // Registry to track specialized Oracles by their position
    private static final Map<String, God> specializedOracles = new HashMap<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String REGISTRY_FILENAME = "oracle_registry.json";
    private static Path registryFile = null;
    
    /**
     * Initialize the registry and load from file
     */
    public static void initialize(MinecraftServer server) {
        try {
            // Set the registry file path in the world directory
            registryFile = server.getRunDirectory()
                .resolve("world")
                .resolve("data")
                .resolve(REGISTRY_FILENAME);
            
            // Create directories if they don't exist
            Files.createDirectories(registryFile.getParent());
            
            // Load existing registry
            loadRegistry();
            
            GreekMythologyMod.LOGGER.info("Oracle Registry: Initialized and loaded from {}", registryFile);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Oracle Registry: Failed to initialize", e);
        }
    }
    
    /**
     * Register a specialized Oracle at a specific location
     */
    public static void registerSpecializedOracle(double x, double y, double z, God god) {
        String key = getPositionKey(x, y, z);
        specializedOracles.put(key, god);
        saveRegistry();
        GreekMythologyMod.LOGGER.info("Oracle Registry: Registered {} Oracle at ({}, {}, {})", god.name(), x, y, z);
    }
    
    /**
     * Check if there should be a specialized Oracle at a location
     */
    public static God getSpecializedGodAt(double x, double y, double z) {
        String key = getPositionKey(x, y, z);
        return specializedOracles.get(key);
    }
    
    /**
     * Remove a specialized Oracle from the registry
     */
    public static void removeSpecializedOracle(double x, double y, double z) {
        String key = getPositionKey(x, y, z);
        God removed = specializedOracles.remove(key);
        if (removed != null) {
            saveRegistry();
            GreekMythologyMod.LOGGER.info("Oracle Registry: Removed {} Oracle at ({}, {}, {})", removed.name(), x, y, z);
        }
    }
    
    /**
     * Generate a position key for the registry
     */
    private static String getPositionKey(double x, double y, double z) {
        // Round to block coordinates for consistent tracking
        int blockX = (int) Math.floor(x);
        int blockY = (int) Math.floor(y);
        int blockZ = (int) Math.floor(z);
        return blockX + "," + blockY + "," + blockZ;
    }
    
    /**
     * Save the registry to file
     */
    private static void saveRegistry() {
        if (registryFile == null) {
            GreekMythologyMod.LOGGER.warn("Oracle Registry: Cannot save - registry not initialized");
            return;
        }
        
        try {
            String json = GSON.toJson(specializedOracles);
            Files.write(registryFile, json.getBytes());
            GreekMythologyMod.LOGGER.debug("Oracle Registry: Saved {} entries to file", specializedOracles.size());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Oracle Registry: Failed to save registry", e);
        }
    }
    
    /**
     * Load the registry from file
     */
    private static void loadRegistry() {
        if (registryFile == null || !Files.exists(registryFile)) {
            GreekMythologyMod.LOGGER.info("Oracle Registry: No existing registry file found, starting fresh");
            return;
        }
        
        try {
            String json = Files.readString(registryFile);
            Type type = new TypeToken<Map<String, God>>(){}.getType();
            Map<String, God> loaded = GSON.fromJson(json, type);
            
            if (loaded != null) {
                specializedOracles.clear();
                specializedOracles.putAll(loaded);
                GreekMythologyMod.LOGGER.info("Oracle Registry: Loaded {} specialized Oracle entries from file", loaded.size());
            }
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Oracle Registry: Failed to load registry", e);
        }
    }
    
    /**
     * Get all registered specialized Oracles (for debugging)
     */
    public static Map<String, God> getAllSpecializedOracles() {
        return new HashMap<>(specializedOracles);
    }
    
    /**
     * Clear all registrations (for testing)
     */
    public static void clearAll() {
        specializedOracles.clear();
        saveRegistry();
        GreekMythologyMod.LOGGER.info("Oracle Registry: Cleared all specialized Oracle registrations");
    }
} 