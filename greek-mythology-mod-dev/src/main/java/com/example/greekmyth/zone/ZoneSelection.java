package com.example.greekmyth.zone;

import net.minecraft.util.math.BlockPos;

public class ZoneSelection {
    private BlockPos corner1;
    private BlockPos corner2;
    
    public ZoneSelection() {
        this.corner1 = null;
        this.corner2 = null;
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
    
    public boolean isComplete() {
        return corner1 != null && corner2 != null;
    }
} 