package com.example.greekmyth.util;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.ColorHelper;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class SoulColorMapper {
    
    // Cache for color calculations
    private static final Map<EntityType<?>, Integer> COLOR_CACHE = new HashMap<>();
    
    /**
     * Get the color for a soul based on the entity type
     * @param entityType The type of entity
     * @return RGB color as integer (0xRRGGBB format)
     */
    public static int getSoulColor(EntityType<?> entityType) {
        return COLOR_CACHE.computeIfAbsent(entityType, SoulColorMapper::calculateSoulColor);
    }
    
    /**
     * Calculate the appropriate color for a soul based on entity characteristics
     */
    private static int calculateSoulColor(EntityType<?> entityType) {
        String entityName = entityType.toString().toLowerCase();
        
        // Hostile mobs - darker, more ominous colors
        if (entityName.contains("zombie")) {
            return createColor(0, 100, 0); // Dark green
        } else if (entityName.contains("skeleton")) {
            return createColor(200, 200, 200); // Light gray/white
        } else if (entityName.contains("spider")) {
            return createColor(80, 0, 0); // Dark red
        } else if (entityName.contains("creeper")) {
            return createColor(0, 150, 0); // Bright green
        } else if (entityName.contains("enderman")) {
            return createColor(100, 0, 150); // Purple
        } else if (entityName.contains("witch")) {
            return createColor(150, 0, 150); // Magenta
        } else if (entityName.contains("slime")) {
            return createColor(0, 200, 0); // Bright green
        } else if (entityName.contains("ghast")) {
            return createColor(255, 255, 255); // White
        } else if (entityName.contains("blaze")) {
            return createColor(255, 200, 0); // Orange/yellow
        } else if (entityName.contains("magma_cube")) {
            return createColor(255, 100, 0); // Orange/red
        } else if (entityName.contains("guardian")) {
            return createColor(0, 150, 200); // Blue
        } else if (entityName.contains("elder_guardian")) {
            return createColor(100, 0, 200); // Purple
        } else if (entityName.contains("shulker")) {
            return createColor(150, 100, 200); // Light purple
        } else if (entityName.contains("vex")) {
            return createColor(100, 200, 255); // Light blue
        } else if (entityName.contains("evoker")) {
            return createColor(200, 100, 0); // Brown
        } else if (entityName.contains("vindicator")) {
            return createColor(150, 150, 150); // Gray
        } else if (entityName.contains("pillager")) {
            return createColor(100, 100, 100); // Dark gray
        } else if (entityName.contains("ravager")) {
            return createColor(80, 80, 80); // Very dark gray
        } else if (entityName.contains("warden")) {
            return createColor(20, 20, 20); // Almost black
        } else if (entityName.contains("drowned")) {
            return createColor(0, 100, 150); // Blue-green
        } else if (entityName.contains("husk")) {
            return createColor(200, 180, 100); // Sand color
        } else if (entityName.contains("stray")) {
            return createColor(150, 200, 255); // Ice blue
        } else if (entityName.contains("phantom")) {
            return createColor(50, 50, 100); // Dark blue
        } else if (entityName.contains("silverfish")) {
            return createColor(150, 150, 150); // Silver
        } else if (entityName.contains("endermite")) {
            return createColor(100, 50, 150); // Purple
        } else if (entityName.contains("cave_spider")) {
            return createColor(100, 0, 50); // Dark red
        } else if (entityName.contains("zombie_villager")) {
            return createColor(0, 120, 0); // Green
        } else if (entityName.contains("zombified_piglin")) {
            return createColor(200, 100, 0); // Orange
        } else if (entityName.contains("piglin")) {
            return createColor(255, 150, 0); // Bright orange
        } else if (entityName.contains("piglin_brute")) {
            return createColor(255, 100, 0); // Dark orange
        } else if (entityName.contains("hoglin")) {
            return createColor(150, 50, 0); // Brown
        } else if (entityName.contains("zoglin")) {
            return createColor(100, 0, 0); // Dark red
        } else if (entityName.contains("wither_skeleton")) {
            return createColor(50, 50, 50); // Very dark gray
        } else if (entityName.contains("wither")) {
            return createColor(0, 0, 0); // Black
        } else if (entityName.contains("ender_dragon")) {
            return createColor(100, 0, 200); // Purple
        }
        
        // Passive mobs - lighter, more peaceful colors
        else if (entityName.contains("cow")) {
            return createColor(150, 100, 50); // Brown
        } else if (entityName.contains("pig")) {
            return createColor(255, 150, 150); // Pink
        } else if (entityName.contains("sheep")) {
            return createColor(200, 200, 200); // White
        } else if (entityName.contains("chicken")) {
            return createColor(255, 255, 200); // Light yellow
        } else if (entityName.contains("rabbit")) {
            return createColor(200, 150, 100); // Light brown
        } else if (entityName.contains("horse")) {
            return createColor(150, 100, 50); // Brown
        } else if (entityName.contains("donkey")) {
            return createColor(100, 80, 40); // Dark brown
        } else if (entityName.contains("mule")) {
            return createColor(120, 90, 45); // Medium brown
        } else if (entityName.contains("llama")) {
            return createColor(200, 180, 160); // Light brown
        } else if (entityName.contains("cat")) {
            return createColor(150, 100, 50); // Brown
        } else if (entityName.contains("wolf")) {
            return createColor(100, 100, 100); // Gray
        } else if (entityName.contains("fox")) {
            return createColor(255, 150, 0); // Orange
        } else if (entityName.contains("ocelot")) {
            return createColor(200, 150, 50); // Orange-brown
        } else if (entityName.contains("parrot")) {
            return createColor(0, 200, 0); // Green
        } else if (entityName.contains("turtle")) {
            return createColor(0, 150, 100); // Green-blue
        } else if (entityName.contains("dolphin")) {
            return createColor(100, 150, 255); // Light blue
        } else if (entityName.contains("squid")) {
            return createColor(100, 100, 150); // Blue-gray
        } else if (entityName.contains("glow_squid")) {
            return createColor(100, 200, 255); // Bright blue
        } else if (entityName.contains("fish")) {
            return createColor(100, 150, 200); // Blue
        } else if (entityName.contains("pufferfish")) {
            return createColor(255, 255, 0); // Yellow
        } else if (entityName.contains("tropical_fish")) {
            return createColor(255, 100, 100); // Red
        } else if (entityName.contains("cod")) {
            return createColor(100, 150, 200); // Blue
        } else if (entityName.contains("salmon")) {
            return createColor(255, 100, 100); // Red
        } else if (entityName.contains("bee")) {
            return createColor(255, 255, 0); // Yellow
        } else if (entityName.contains("bat")) {
            return createColor(50, 50, 50); // Dark gray
        } else if (entityName.contains("panda")) {
            return createColor(200, 200, 200); // White
        } else if (entityName.contains("polar_bear")) {
            return createColor(255, 255, 255); // White
        } else if (entityName.contains("mooshroom")) {
            return createColor(255, 100, 100); // Red
        } else if (entityName.contains("strider")) {
            return createColor(255, 100, 0); // Orange
        } else if (entityName.contains("axolotl")) {
            return createColor(255, 150, 200); // Pink
        } else if (entityName.contains("goat")) {
            return createColor(200, 200, 200); // White
        } else if (entityName.contains("frog")) {
            return createColor(0, 200, 0); // Green
        } else if (entityName.contains("tadpole")) {
            return createColor(100, 200, 100); // Light green
        } else if (entityName.contains("allay")) {
            return createColor(200, 200, 255); // Light blue
        } else if (entityName.contains("sniffer")) {
            return createColor(150, 100, 50); // Brown
        } else if (entityName.contains("camel")) {
            return createColor(200, 180, 160); // Light brown
        }
        
        // Villagers and other entities
        else if (entityName.contains("villager")) {
            return createColor(200, 150, 100); // Brown
        } else if (entityName.contains("iron_golem")) {
            return createColor(150, 150, 150); // Gray
        } else if (entityName.contains("snow_golem")) {
            return createColor(255, 255, 255); // White
        } else if (entityName.contains("wandering_trader")) {
            return createColor(100, 150, 100); // Green
        } else if (entityName.contains("trader_llama")) {
            return createColor(200, 180, 160); // Light brown
        }
        
        // Default color for unknown entities
        else {
            return createColor(150, 150, 150); // Gray
        }
    }
    
    /**
     * Create a color from RGB components
     */
    private static int createColor(int r, int g, int b) {
        return (r << 16) | (g << 8) | b;
    }
    
    /**
     * Get the red component of a color
     */
    public static int getRed(int color) {
        return (color >> 16) & 0xFF;
    }
    
    /**
     * Get the green component of a color
     */
    public static int getGreen(int color) {
        return (color >> 8) & 0xFF;
    }
    
    /**
     * Get the blue component of a color
     */
    public static int getBlue(int color) {
        return color & 0xFF;
    }
    
    /**
     * Create a glowing version of a color (brighter and more saturated)
     */
    public static int createGlowColor(int baseColor) {
        int r = getRed(baseColor);
        int g = getGreen(baseColor);
        int b = getBlue(baseColor);
        
        // Make the color brighter and more saturated for glow effect
        r = Math.min(255, r + 50);
        g = Math.min(255, g + 50);
        b = Math.min(255, b + 50);
        
        return createColor(r, g, b);
    }
} 