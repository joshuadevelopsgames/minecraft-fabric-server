package com.example.greekmyth.pvp;

import net.minecraft.util.math.BlockPos;

import java.util.UUID;

public class NoPvpZone {
    private final BlockPos minCorner;
    private final BlockPos maxCorner;
    private final UUID ownerId;
    private final String ownerName;
    private final String id;
    private final int area;
    
    // Minecraft world limits
    private static final int BEDROCK_LEVEL = -64;
    private static final int BUILD_LIMIT = 320;
    
    public NoPvpZone(BlockPos corner1, BlockPos corner2, UUID ownerId, String ownerName) {
        // Calculate min and max corners (X and Z only, Y will be full height)
        this.minCorner = new BlockPos(
            Math.min(corner1.getX(), corner2.getX()),
            BEDROCK_LEVEL, // Always start at bedrock
            Math.min(corner1.getZ(), corner2.getZ())
        );
        this.maxCorner = new BlockPos(
            Math.max(corner1.getX(), corner2.getX()),
            BUILD_LIMIT, // Always go to build limit
            Math.max(corner1.getZ(), corner2.getZ())
        );
        
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.id = generateZoneId();
        this.area = calculateArea();
    }
    
    /**
     * Check if a position is within this zone
     */
    public boolean contains(BlockPos pos) {
        return pos.getX() >= minCorner.getX() && pos.getX() <= maxCorner.getX() &&
               pos.getY() >= minCorner.getY() && pos.getY() <= maxCorner.getY() &&
               pos.getZ() >= minCorner.getZ() && pos.getZ() <= maxCorner.getZ();
    }
    
    /**
     * Calculate the area of the zone (X * Z)
     */
    private int calculateArea() {
        int width = maxCorner.getX() - minCorner.getX() + 1;
        int depth = maxCorner.getZ() - minCorner.getZ() + 1;
        return width * depth;
    }
    
    /**
     * Generate a unique zone ID
     */
    private String generateZoneId() {
        return "pvp_zone_" + ownerId.toString().substring(0, 8) + "_" + System.currentTimeMillis();
    }
    
    // Getters
    public BlockPos getMinCorner() {
        return minCorner;
    }
    
    public BlockPos getMaxCorner() {
        return maxCorner;
    }
    
    public UUID getOwnerId() {
        return ownerId;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getId() {
        return id;
    }
    
    public int getArea() {
        return area;
    }
    
    @Override
    public String toString() {
        return String.format("NoPvpZone{id='%s', owner='%s', area=%d, min=%s, max=%s}", 
            id, ownerName, area, minCorner, maxCorner);
    }
} 