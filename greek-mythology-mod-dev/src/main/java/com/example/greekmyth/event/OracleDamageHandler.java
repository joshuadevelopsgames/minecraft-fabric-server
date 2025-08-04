package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class OracleDamageHandler {
    
    public static void register() {
        // Prevent Oracle death entirely
        ServerLivingEntityEvents.ALLOW_DEATH.register((entity, source, amount) -> {
            if (entity instanceof OracleEntity oracle) {
                // Oracle uses divine protection - like a totem of undying
                if (source.getAttacker() instanceof PlayerEntity player) {
                    player.sendMessage(Text.literal("§6§l[Divine Protection] §r§eThe Oracle is protected by divine forces...").formatted(Formatting.GOLD), false);
                }
                
                // Apply totem of undying effects
                oracle.getWorld().playSound(null, oracle.getX(), oracle.getY(), oracle.getZ(), 
                    net.minecraft.sound.SoundEvents.ITEM_TOTEM_USE, 
                    net.minecraft.sound.SoundCategory.PLAYERS, 1.0f, 1.0f);
                
                // Spawn totem particles
                if (oracle.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
                    serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.TOTEM_OF_UNDYING, 
                        oracle.getX(), oracle.getY() + 1.0, oracle.getZ(), 20, 0.5, 0.5, 0.5, 0.1);
                }
                
                // Heal the Oracle back to full health
                oracle.setHealth(oracle.getMaxHealth());
                
                GreekMythologyMod.LOGGER.info("Oracle used divine protection - infinite totem effect");
                
                return false; // Prevent death entirely
            }
            return true; // Allow death for other entities
        });
        
        GreekMythologyMod.LOGGER.info("Oracle Damage Handler registered!");
    }
} 