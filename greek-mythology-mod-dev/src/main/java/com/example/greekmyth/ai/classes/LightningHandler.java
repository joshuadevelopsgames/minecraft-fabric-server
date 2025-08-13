package com.example.aimyth.classes;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class LightningHandler {
    
    public static void handleLightningStrike(ServerPlayerEntity player, LightningEntity lightning) {
        // Check if player is a Zeus child
        String playerClass = DivineClass.getPlayerClass(player.getUuid());
        
        if ("zeus".equals(playerClass)) {
            // Cancel the lightning damage and apply beneficial effects instead
            int classLevel = DivineClass.getClassLevel(player.getUuid());
            
            // Heal the player
            player.heal(4.0f); // Heal 2 hearts
            
            // Apply lightning empowerment effects
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0, false, false));
            
            // Additional effects based on class level
            if (classLevel >= 2) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1, false, false));
            }
            
            if (classLevel >= 3) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1, false, false));
            }
            
            // Send dramatic message
            player.sendMessage(Text.literal("").formatted(Formatting.GOLD));
            player.sendMessage(Text.literal("§6⚡ LIGHTNING ABSORBED ⚡").formatted(Formatting.GOLD, Formatting.BOLD));
            player.sendMessage(Text.literal("§eZeus' lightning empowers you!").formatted(Formatting.YELLOW));
            player.sendMessage(Text.literal("§7You feel invigorated and stronger!").formatted(Formatting.GRAY));
            player.sendMessage(Text.literal("").formatted(Formatting.GOLD));
            
            AIMythologyMod.LOGGER.info("Player {} absorbed lightning strike and gained power", player.getName().getString());
            
            // Prevent the lightning from doing damage
            // Note: This is handled by the mixin system
        }
    }
    
    public static boolean shouldCancelLightningDamage(ServerPlayerEntity player) {
        // Return true if player is a Zeus child (to cancel damage)
        String playerClass = DivineClass.getPlayerClass(player.getUuid());
        return "zeus".equals(playerClass);
    }
} 