package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.random.Random;

public class ModEvents {
    
    public static void register() {
        // Register entity death event for Inferno Pearl drops
        ServerLivingEntityEvents.AFTER_DEATH.register(ModEvents::onEntityDeath);
        
        GreekMythologyMod.LOGGER.info("Registered entity death event for Inferno Pearl drops");
    }
    
    private static void onEntityDeath(LivingEntity entity, DamageSource source) {
        // Only handle Enderman deaths
        if (entity.getType() != EntityType.ENDERMAN) {
            return;
        }
        
        // Check if the killer is a player
        if (!(source.getAttacker() instanceof ServerPlayerEntity player)) {
            return;
        }
        
        // Check if player has Hades Scythe or soul harvesting effect
        boolean hasHadesScythe = hasHadesScythe(player);
        boolean hasSoulHarvestingEffect = hasSoulHarvestingEffect(entity);
        
        if (hasHadesScythe || hasSoulHarvestingEffect) {
            // 12% chance to drop Inferno Pearl instead of Ender Pearl
            Random random = entity.getWorld().getRandom();
            if (random.nextFloat() < 0.12f) {
                // Drop Inferno Pearl
                ItemStack infernoPearl = new ItemStack(GreekItems.INFERNO_PEARL);
                if (entity.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
                    entity.dropStack(serverWorld, infernoPearl);
                    
                    GreekMythologyMod.LOGGER.info("INFERNO PEARL DROP: Enderman killed by {} with {} - dropped Inferno Pearl (12% chance)", 
                        player.getName().getString(),
                        hasHadesScythe ? "Hades Scythe" : "Soul Harvesting Effect");
                    
                    // Schedule a task to remove Ender Pearls from the ground after a short delay
                    serverWorld.getServer().execute(() -> {
                        // Find and remove Ender Pearls near the entity's death location
                        net.minecraft.util.math.Box searchBox = new net.minecraft.util.math.Box(
                            entity.getX() - 2, entity.getY() - 1, entity.getZ() - 2,
                            entity.getX() + 2, entity.getY() + 1, entity.getZ() + 2
                        );
                        
                        for (net.minecraft.entity.ItemEntity itemEntity : serverWorld.getEntitiesByType(net.minecraft.entity.EntityType.ITEM, searchBox, item -> 
                            item.getStack().getItem() == net.minecraft.item.Items.ENDER_PEARL)) {
                            itemEntity.discard();
                            GreekMythologyMod.LOGGER.info("REMOVED ENDER PEARL: Replaced with Inferno Pearl");
                        }
                    });
                }
            }
        }
    }
    
    private static boolean hasHadesScythe(ServerPlayerEntity player) {
        // Check main hand
        if (player.getMainHandStack().getItem() == GreekItems.HADES_SCYTHE) {
            return true;
        }
        
        // Check off hand
        if (player.getOffHandStack().getItem() == GreekItems.HADES_SCYTHE) {
            return true;
        }
        
        return false;
    }
    
    private static boolean hasSoulHarvestingEffect(LivingEntity entity) {
        // Check if entity has wither effect (from soul harvesting)
        return entity.hasStatusEffect(net.minecraft.entity.effect.StatusEffects.WITHER);
    }
    

    

} 