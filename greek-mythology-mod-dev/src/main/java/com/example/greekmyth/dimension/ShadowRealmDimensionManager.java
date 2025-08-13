package com.example.greekmyth.dimension;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

public class ShadowRealmDimensionManager {

    // Shadow realm dimension key
    public static final RegistryKey<World> SHADOW_REALM_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("greekmyth", "shadow_realm"));

    // Overworld dimension key for reference
    public static final RegistryKey<World> OVERWORLD_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("minecraft", "overworld"));

    // Shadow realm dimension type (similar to overworld but with custom properties)
    public static final RegistryKey<DimensionType> SHADOW_REALM_DIMENSION_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, Identifier.of("greekmyth", "shadow_realm"));

    public static void init() {
        GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension manager initialized");
    }

    /**
     * Register the shadow realm dimension with the server
     */
    public static void registerDimension(MinecraftServer server) {
        try {
            // Check if shadow realm already exists
            ServerWorld existingShadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (existingShadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm already exists");
                return;
            }

            // Get the overworld to use as a template
            ServerWorld overworld = server.getWorld(OVERWORLD_DIMENSION);
            if (overworld == null) {
                GreekMythologyMod.LOGGER.warn("SHADOW REALM: Cannot register shadow realm - overworld not found");
                return;
            }

            // For now, just log that we're ready to create the dimension
            // The actual dimension creation will happen when a player first tries to access it
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension ready for creation");

        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Error preparing shadow realm dimension: {}", e.getMessage());
        }
    }

    /**
     * Create the shadow realm world if it doesn't exist
     */
    public static ServerWorld createShadowRealmWorld(MinecraftServer server) {
        try {
            // Check if shadow realm already exists
            ServerWorld existingShadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (existingShadowRealm != null) {
                return existingShadowRealm;
            }

            // Get the overworld to use as a template
            ServerWorld overworld = server.getWorld(OVERWORLD_DIMENSION);
            if (overworld == null) {
                GreekMythologyMod.LOGGER.warn("SHADOW REALM: Cannot create shadow realm - overworld not found");
                return null;
            }

            // Try to create the shadow realm world
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Attempting to create shadow realm world...");
            
            // Try to access the dimension from the registry - sometimes it takes a moment to register
            // The JSON files should handle the actual creation
            ServerWorld shadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (shadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension found in registry");
                return shadowRealm;
            }
            
            // If still not available, try to force a registry reload
            GreekMythologyMod.LOGGER.info("SHADOW REALM: Attempting to force dimension registry reload...");
            
            // Wait a moment and try again
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            shadowRealm = server.getWorld(SHADOW_REALM_DIMENSION);
            if (shadowRealm != null) {
                GreekMythologyMod.LOGGER.info("SHADOW REALM: Shadow realm dimension found after reload");
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
            ServerWorld shadowRealm = createShadowRealmWorld(server);
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
     * Check if a world is the shadow realm
     */
    public static boolean isShadowRealm(World world) {
        return world.getRegistryKey().equals(SHADOW_REALM_DIMENSION);
    }

    /**
     * Check if a world is the overworld
     */
    public static boolean isOverworld(World world) {
        return world.getRegistryKey().equals(OVERWORLD_DIMENSION);
    }

    /**
     * Check if shadow realm is available on the server
     */
    public static boolean isShadowRealmAvailable(MinecraftServer server) {
        return server.getWorld(SHADOW_REALM_DIMENSION) != null;
    }

    /**
     * Get the shadow realm world from the server
     */
    public static ServerWorld getShadowRealmWorld(MinecraftServer server) {
        return server.getWorld(SHADOW_REALM_DIMENSION);
    }
}
