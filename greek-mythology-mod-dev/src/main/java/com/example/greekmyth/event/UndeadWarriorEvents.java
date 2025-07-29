package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;

public class UndeadWarriorEvents {
    
    public static void register() {
        // Listen for when entities take damage
        ServerLivingEntityEvents.AFTER_DAMAGE.register((entity, source, baseDamageTaken, damageTaken, blocked) -> {
            // Check if the attacker is a wolf with "Undead Warrior" name
            if (source.getAttacker() instanceof WolfEntity wolf) {
                Text customName = wolf.getCustomName();
                if (customName != null && customName.getString().contains("Undead Warrior")) {
                    // This is an Undead Warrior wolf attack!
                    GreekMythologyMod.LOGGER.info("UNDEAD WARRIOR ATTACK: Wolf {} attacked {} for {} damage", 
                        wolf.getName().getString(), entity.getName().getString(), damageTaken);
                    
                    // Apply wither effect like a wither skeleton
                    if (entity instanceof LivingEntity) {
                        LivingEntity livingEntity = (LivingEntity) entity;
                        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 1)); // 3 seconds of Wither II
                        GreekMythologyMod.LOGGER.info("UNDEAD WARRIOR: Applied wither effect to {}", entity.getName().getString());
                        
                        // Play wither skeleton attack sound using our custom sound system
                        if (entity.getWorld() instanceof ServerWorld) {
                            ServerWorld serverWorld = (ServerWorld) entity.getWorld();
                            UndeadWarriorSoundEvents.playWitherSkeletonSound(wolf, serverWorld, "hurt");
                        }
                    }
                }
            }
        });
        
        GreekMythologyMod.LOGGER.info("Undead Warrior events registered successfully!");
    }
} 