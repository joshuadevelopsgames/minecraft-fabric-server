package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.util.SoulHarvester;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.world.ServerWorld;

public class SoulDeathEvents {
    
    public static void register() {
        // Listen for when entities die
        ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
            // Only harvest souls from non-player entities
            if (entity instanceof net.minecraft.server.network.ServerPlayerEntity) {
                GreekMythologyMod.LOGGER.debug("SOUL DEATH: Skipping player death");
                return; // Skip players
            }
            
            // Log all entity deaths for debugging
            GreekMythologyMod.LOGGER.info("SOUL DEATH: Entity {} died from damage type: {}", 
                entity.getName().getString(), damageSource.getTypeRegistryEntry().getKey().get().getValue());
            
            // Only harvest souls if the entity died from wither damage (Hades Scythe effect)
            if (damageSource.getTypeRegistryEntry().matchesKey(net.minecraft.entity.damage.DamageTypes.WITHER)) {
                GreekMythologyMod.LOGGER.info("SOUL DEATH: Entity {} died from WITHER damage - checking for soul drop", 
                    entity.getName().getString());
                
                // Check if this entity can drop a soul
                if (SoulHarvester.canDropSoul(entity.getType())) {
                    GreekMythologyMod.LOGGER.info("SOUL DEATH: Entity {} can drop soul - attempting harvest", 
                        entity.getName().getString());
                    
                    // Try to add soul to entity's loot drops
                    if (SoulHarvester.addSoulToLoot(entity, (ServerWorld) entity.getWorld())) {
                        GreekMythologyMod.LOGGER.info("SOUL DEATH: Successfully added soul to loot from {} upon wither death", 
                            entity.getName().getString());
                    } else {
                        GreekMythologyMod.LOGGER.info("SOUL DEATH: Failed to add soul to loot from {} (drop chance failed)", 
                            entity.getName().getString());
                    }
                } else {
                    GreekMythologyMod.LOGGER.info("SOUL DEATH: Entity {} cannot drop soul (not in soul map)", 
                        entity.getName().getString());
                }
            } else {
                GreekMythologyMod.LOGGER.info("SOUL DEATH: Entity {} died from {} (not wither), no soul harvested", 
                    entity.getName().getString(), damageSource.getTypeRegistryEntry().getKey().get().getValue());
            }
        });
    }
} 