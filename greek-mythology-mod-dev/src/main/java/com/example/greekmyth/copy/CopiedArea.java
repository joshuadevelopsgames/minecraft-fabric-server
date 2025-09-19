package com.example.greekmyth.copy;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.Map;

public class CopiedArea {
    private BlockPos corner1;
    private BlockPos corner2;
    private Map<BlockPos, BlockData> copiedBlocks;
    
    public CopiedArea() {
        this.copiedBlocks = new HashMap<>();
    }
    
    public CopiedArea(BlockPos corner1, BlockPos corner2) {
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.copiedBlocks = new HashMap<>();
    }
    
    public BlockPos getCorner1() {
        return corner1;
    }
    
    public void setCorner1(BlockPos corner1) {
        this.corner1 = corner1;
    }
    
    public BlockPos getCorner2() {
        return corner2;
    }
    
    public void setCorner2(BlockPos corner2) {
        this.corner2 = corner2;
    }
    
    public Map<BlockPos, BlockData> getCopiedBlocks() {
        return copiedBlocks;
    }
    
    public void setCopiedBlocks(Map<BlockPos, BlockData> copiedBlocks) {
        this.copiedBlocks = copiedBlocks;
    }
    
    public boolean hasCopiedData() {
        return copiedBlocks != null && !copiedBlocks.isEmpty();
    }
    
    public int getVolume() {
        if (corner1 == null || corner2 == null) {
            return 0;
        }
        
        int width = Math.abs(corner2.getX() - corner1.getX()) + 1;
        int height = Math.abs(corner2.getY() - corner1.getY()) + 1;
        int depth = Math.abs(corner2.getZ() - corner1.getZ()) + 1;
        
        return width * height * depth;
    }
}

