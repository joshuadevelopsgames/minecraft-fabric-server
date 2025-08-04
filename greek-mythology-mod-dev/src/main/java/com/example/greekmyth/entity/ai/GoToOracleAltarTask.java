package com.example.greekmyth.entity.ai;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.block.GreekBlocks;
import com.example.greekmyth.entity.OracleEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.EnumSet;

public class GoToOracleAltarTask extends Goal {
    
    private final OracleEntity oracle;
    private final World world;
    private BlockPos targetAltar;
    private int searchCooldown;
    private static final int SEARCH_RADIUS = 32; // Search within 32 blocks
    private static final int SEARCH_COOLDOWN_TICKS = 200; // Search every 10 seconds
    
    public GoToOracleAltarTask(OracleEntity oracle) {
        this.oracle = oracle;
        this.world = oracle.getWorld();
        this.setControls(EnumSet.of(Control.MOVE, Control.LOOK));
    }
    
    @Override
    public boolean canStart() {
        if (this.searchCooldown > 0) {
            this.searchCooldown--;
            return false;
        }
        
        // Find the nearest Oracle Altar
        this.targetAltar = findNearestAltar();
        return this.targetAltar != null;
    }
    
    @Override
    public boolean shouldContinue() {
        return this.targetAltar != null && 
               this.world.getBlockState(this.targetAltar).getBlock() instanceof com.example.greekmyth.block.OracleAltarBlock &&
               this.oracle.squaredDistanceTo(this.targetAltar.getX() + 0.5, this.targetAltar.getY(), this.targetAltar.getZ() + 0.5) > 4.0;
    }
    
    @Override
    public void start() {
        GreekMythologyMod.LOGGER.info("Oracle {} is moving to altar at {}", 
            this.oracle.getName().getString(), this.targetAltar);
    }
    
    @Override
    public void tick() {
        if (this.targetAltar != null) {
            // Move towards the altar
            Vec3d targetPos = new Vec3d(this.targetAltar.getX() + 0.5, this.targetAltar.getY(), this.targetAltar.getZ() + 0.5);
            this.oracle.getNavigation().startMovingTo(targetPos.x, targetPos.y, targetPos.z, 0.5);
            
            // Look at the altar
            this.oracle.getLookControl().lookAt(targetPos.x, targetPos.y + 1.0, targetPos.z);
        }
    }
    
    @Override
    public void stop() {
        this.oracle.getNavigation().stop();
        this.searchCooldown = SEARCH_COOLDOWN_TICKS;
        
        if (this.targetAltar != null) {
            GreekMythologyMod.LOGGER.info("Oracle {} reached altar at {}", 
                this.oracle.getName().getString(), this.targetAltar);
        }
    }
    
    private BlockPos findNearestAltar() {
        BlockPos oraclePos = this.oracle.getBlockPos();
        BlockPos nearestAltar = null;
        double nearestDistance = Double.MAX_VALUE;
        
        // Search in a radius around the Oracle
        for (int x = -SEARCH_RADIUS; x <= SEARCH_RADIUS; x++) {
            for (int y = -8; y <= 8; y++) {
                for (int z = -SEARCH_RADIUS; z <= SEARCH_RADIUS; z++) {
                    BlockPos checkPos = oraclePos.add(x, y, z);
                    
                    // Check if the block is an Oracle Altar
                    if (this.world.getBlockState(checkPos).getBlock() instanceof com.example.greekmyth.block.OracleAltarBlock) {
                        double distance = oraclePos.getSquaredDistance(checkPos);
                        if (distance < nearestDistance) {
                            nearestDistance = distance;
                            nearestAltar = checkPos;
                        }
                    }
                }
            }
        }
        
        return nearestAltar;
    }
} 