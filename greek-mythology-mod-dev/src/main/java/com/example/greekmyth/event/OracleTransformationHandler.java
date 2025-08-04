package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public class OracleTransformationHandler {
    
    public static void register() {
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof IllusionerEntity illusioner) {
                // Transform the Illusioner into an Oracle
                transformToOracle(illusioner, world);
            }
        });
        
        GreekMythologyMod.LOGGER.info("Oracle Transformation Handler registered!");
    }
    
    private static void transformToOracle(IllusionerEntity illusioner, ServerWorld world) {
        // Don't transform if it's already an Oracle
        if (illusioner instanceof OracleEntity) {
            return;
        }
        
        // Get the illusioner's position and data
        Vec3d position = illusioner.getPos();
        float yaw = illusioner.getYaw();
        float pitch = illusioner.getPitch();
        
        // Remove the original illusioner
        illusioner.remove(Entity.RemovalReason.DISCARDED);
        
        // Create the Oracle entity
        OracleEntity oracle = new OracleEntity(EntityType.ILLUSIONER, world);
        oracle.setPosition(position);
        oracle.setYaw(yaw);
        oracle.setPitch(pitch);
        
        // Spawn the Oracle
        world.spawnEntity(oracle);
        
        GreekMythologyMod.LOGGER.info("Transformed Illusioner into Oracle at position: {}", position);
    }
} 