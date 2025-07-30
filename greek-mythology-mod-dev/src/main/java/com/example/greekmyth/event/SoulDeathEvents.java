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
                return; // Skip players
            }
            
            // Only harvest souls if the entity died from wither damage (Hades Scythe effect)
            if (damageSource.getTypeRegistryEntry().matchesKey(net.minecraft.entity.damage.DamageTypes.WITHER)) {
                // Check if this entity can drop a soul
                if (SoulHarvester.canDropSoul(entity.getType())) {
                    // Try to harvest a soul from this entity upon death
                    if (SoulHarvester.harvestSoul(entity, (ServerWorld) entity.getWorld(), entity.getPos())) {
                        GreekMythologyMod.LOGGER.info("SOUL DEATH: Successfully harvested soul from {} upon wither death", 
                            entity.getName().getString());
                    }
                }
            } else {
                GreekMythologyMod.LOGGER.debug("SOUL DEATH: Entity {} died from {} (not wither), no soul harvested", 
                    entity.getName().getString(), damageSource.getName());
            }
        });
    }
} 