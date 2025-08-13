package com.example.aimyth.event;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

/**
 * Handles Stygian Water effects on entities.
 * 
 * DISABLED: This was causing all vanilla water to apply wither effects.
 * Stygian Water should only affect actual Stygian Water blocks, not vanilla water.
 */
public class StygianWaterHandler {

    // DISABLED: This was making all water apply wither effects
    // Only Stygian Water should have wither effects, not vanilla water
    /*
    public static void register() {
        // Check for entities in water every tick
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            // Use a simpler approach - just check the player
            if (world.getPlayers().size() > 0) {
                for (net.minecraft.entity.player.PlayerEntity player : world.getPlayers()) {
                    checkStygianWaterEffect(world, player);
                }
            }
        });
    }

    private static void checkStygianWaterEffect(World world, LivingEntity entity) {
        BlockPos pos = entity.getBlockPos();
        
        // Check multiple positions around the entity for water
        BlockPos[] positionsToCheck = {
            pos,                    // Current position
            pos.up(),              // Above
            pos.down(),            // Below
            pos.north(),           // North
            pos.south(),           // South
            pos.east(),            // East
            pos.west()             // West
        };
        
        boolean inWater = false;
        
        // Check all positions for water
        for (BlockPos checkPos : positionsToCheck) {
            if (world.getFluidState(checkPos).getFluid() == Fluids.WATER) {
                inWater = true;
                break;
            }
        }
        
        // Apply wither effect if entity is in or near water
        if (inWater) {
            entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.WITHER, 
                60, // 3 seconds
                0,  // Level 1
                false, // Ambient
                true   // Show particles
            ));
        }
    }
    */
} 