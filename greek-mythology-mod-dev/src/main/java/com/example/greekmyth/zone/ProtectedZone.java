package com.example.greekmyth.zone;

import net.minecraft.util.math.BlockPos;

import java.util.UUID;

public class ProtectedZone {
    private final BlockPos minCorner;
    private final BlockPos maxCorner;
    private final UUID ownerId;
    private final String ownerName;
    private final String id;
    private final int volume;
    
    public ProtectedZone(BlockPos corner1, BlockPos corner2, UUID ownerId, String ownerName) {
        // Calculate min and max corners
        this.minCorner = new BlockPos(
            Math.min(corner1.getX(), corner2.getX()),
            Math.min(corner1.getY(), corner2.getY()),
            Math.min(corner1.getZ(), corner2.getZ())
        );
        this.maxCorner = new BlockPos(
            Math.max(corner1.getX(), corner2.getX()),
            Math.max(corner1.getY(), corner2.getY()),
            Math.max(corner1.getZ(), corner2.getZ())
        );
        
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.id = generateZoneId();
        this.volume = calculateVolume();
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
     * Calculate the volume of the zone
     */
    private int calculateVolume() {
        int width = maxCorner.getX() - minCorner.getX() + 1;
        int height = maxCorner.getY() - minCorner.getY() + 1;
        int depth = maxCorner.getZ() - minCorner.getZ() + 1;
        return width * height * depth;
    }
    
    /**
     * Generate a unique zone ID
     */
    private String generateZoneId() {
        return "zone_" + ownerId.toString().substring(0, 8) + "_" + System.currentTimeMillis();
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
    
    public int getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return String.format("ProtectedZone{id='%s', owner='%s', volume=%d, min=%s, max=%s}", 
            id, ownerName, volume, minCorner, maxCorner);
    }
} 