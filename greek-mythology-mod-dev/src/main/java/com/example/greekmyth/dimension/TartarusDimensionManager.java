package com.example.greekmyth.dimension;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class TartarusDimensionManager {
    
    // Tartarus dimension key
    public static final RegistryKey<World> TARTARUS_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("greekmyth", "tartarus"));
    
    public static void init() {
        GreekMythologyMod.LOGGER.info("TARTARUS DIMENSION: Tartarus dimension manager initialized");
    }
    
    /**
     * Get the Tartarus dimension key
     */
    public static RegistryKey<World> getTartarusDimension() {
        return TARTARUS_DIMENSION;
    }
} 