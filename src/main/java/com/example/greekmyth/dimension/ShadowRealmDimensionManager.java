package com.example.greekmyth.dimension;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.NoiseChunkGenerator;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.FixedBiomeSource;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.gen.noise.NoiseParameters;
import net.minecraft.world.gen.noise.NoiseConfig;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;

public class ShadowRealmDimensionManager {
    
    // Shadow Realm dimension keys
    public static final RegistryKey<World> SHADOW_REALM_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("greekmyth", "shadow_realm"));
    public static final RegistryKey<World> OVERWORLD_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("minecraft", "overworld"));
    public static final RegistryKey<DimensionType> SHADOW_REALM_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, Identifier.of("greekmyth", "shadow_realm"));
    
    public static void init() {
        GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension manager initialized");
    }
    
    /**
     * Register the Shadow Realm dimension with the server
     */
    public static void registerDimension(MinecraftServer server) {
        try {
            // Check if dimension already exists
            ServerWorld existingShadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (existingShadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm already exists");
                return;
            }
            
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension ready for creation");
            
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Error preparing shadow realm dimension: {}", e.getMessage());
        }
    }
    
    /**
     * Get or create the Shadow Realm dimension
     */
    public static ServerWorld getOrCreateShadowRealm(MinecraftServer server) {
        try {
            // First try to get existing dimension
            ServerWorld existingShadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (existingShadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Using existing shadow realm");
                return existingShadowRealm;
            }
            
            // Dimension doesn't exist, we need to create it
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Creating shadow realm dimension...");
            
            // Get the overworld as a reference
            ServerWorld overworld = server.getWorld(OVERWORLD_DIMENSION);
            if (overworld == null) {
                GreekMythologyMod.LOGGER.error("SHADOW REALM: Cannot create shadow realm - overworld not found");
                return null;
            }
            
            // Create the shadow realm world
            ServerWorld shadowRealm = createShadowRealmWorld(server, overworld);
            if (shadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Successfully created shadow realm dimension");
                return shadowRealm;
            } else {
                GreekMythologyMod.LOGGER.error("SHADOW REALM: Failed to create shadow realm dimension");
                return null;
            }
            
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Error getting/creating shadow realm: {}", e.getMessage());
            return null;
        }
    }
    
    /**
     * Create the Shadow Realm world
     */
    private static ServerWorld createShadowRealmWorld(MinecraftServer server, ServerWorld overworld) {
        try {
            // For now, we'll use a simpler approach - try to get the dimension from the registry
            // The JSON files should handle the actual creation
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Attempting to load shadow realm from registry...");
            
            // Try to access the dimension again - sometimes it takes a moment to register
            ServerWorld shadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (shadowRealm != null) {
                return shadowRealm;
            }
            
            // If still not available, log the issue
            GreekMythologyMod.LOGGER.warn("SHADOW REALM: Dimension not available in registry. This may require a server restart or world recreation.");
            return null;
            
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Error creating shadow realm world: {}", e.getMessage());
            return null;
        }
    }
    
    /**
     * Get the Shadow Realm dimension key
     */
    public static RegistryKey<World> getShadowRealmDimension() {
        return SHADOW_REALM_DIMENSION;
    }
    
    /**
     * Get the Overworld dimension key
     */
    public static RegistryKey<World> getOverworldDimension() {
        return OVERWORLD_DIMENSION;
    }
    
    /**
     * Check if the Shadow Realm dimension is available
     */
    public static boolean isShadowRealmAvailable(MinecraftServer server) {
        try {
            ServerWorld shadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            return shadowRealm != null;
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Error checking shadow realm availability: {}", e.getMessage());
            return false;
        }
    }
}
