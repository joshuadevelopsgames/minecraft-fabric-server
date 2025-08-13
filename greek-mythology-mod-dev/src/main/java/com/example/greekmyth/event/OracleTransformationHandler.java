package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import com.example.greekmyth.entity.SpecializedOracleEntity;
import com.example.greekmyth.entity.OracleRegistry;
import com.example.greekmyth.favor.God;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;

public class OracleTransformationHandler {
    
    public static void register() {
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof IllusionerEntity illusioner) {
                // Check if this Illusioner should be transformed
                // Only transform if it's not already an Oracle entity
                if (!(illusioner instanceof OracleEntity)) {
                    // Transform the Illusioner into an Oracle
                    transformToOracle(illusioner, world);
                }
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
        
        // Check if there should be a specialized Oracle at this location
        God specializedGod = OracleRegistry.getSpecializedGodAt(position.x, position.y, position.z);
        
        // Remove the original illusioner
        illusioner.remove(Entity.RemovalReason.DISCARDED);
        
        // Create the appropriate Oracle entity
        if (specializedGod != null) {
            // Create a specialized Oracle
            SpecializedOracleEntity specializedOracle = new SpecializedOracleEntity(
                (EntityType<? extends IllusionerEntity>) EntityType.ILLUSIONER, 
                world, 
                specializedGod
            );
            specializedOracle.setPosition(position);
            specializedOracle.setYaw(yaw);
            specializedOracle.setPitch(pitch);
            
            // Spawn the specialized Oracle
            world.spawnEntity(specializedOracle);
            
            GreekMythologyMod.LOGGER.info("Transformed Illusioner into {} Oracle at position: {}", specializedGod.name(), position);
        } else {
            // Create a regular Oracle
            OracleEntity oracle = new OracleEntity(EntityType.ILLUSIONER, world);
            oracle.setPosition(position);
            oracle.setYaw(yaw);
            oracle.setPitch(pitch);
            
            // Spawn the Oracle
            world.spawnEntity(oracle);
            
            GreekMythologyMod.LOGGER.info("Transformed Illusioner into Oracle at position: {}", position);
        }
    }
} 