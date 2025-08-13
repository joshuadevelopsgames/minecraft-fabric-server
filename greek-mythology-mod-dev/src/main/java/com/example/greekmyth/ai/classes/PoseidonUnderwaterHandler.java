package com.example.aimyth.classes;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class PoseidonUnderwaterHandler {
    
    public static void updatePoseidonUnderwaterBuffs(ServerPlayerEntity player) {
        String playerClass = DivineClass.getPlayerClass(player.getUuid());
        int level = DivineClass.getClassLevel(player.getUuid());
        
        // Only apply underwater buffs for Poseidon level 3+
        if (!"poseidon".equals(playerClass) || level < 3) {
            return;
        }
        
        boolean isUnderwater = player.isSubmergedInWater();
        boolean hasDolphinsGrace = player.hasStatusEffect(StatusEffects.DOLPHINS_GRACE);
        boolean hasHaste = player.hasStatusEffect(StatusEffects.HASTE);
        
        if (isUnderwater) {
            // Apply underwater buffs if not already applied
            if (!hasDolphinsGrace) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, -1, 2, false, false));
                AIMythologyMod.LOGGER.info("Applied enhanced Dolphins Grace to Poseidon child {}", player.getName().getString());
            }
            if (!hasHaste) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 1, false, false));
                AIMythologyMod.LOGGER.info("Applied Haste to Poseidon child {}", player.getName().getString());
            }
        } else {
            // Remove underwater buffs if player is no longer underwater
            if (hasDolphinsGrace) {
                player.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
                AIMythologyMod.LOGGER.info("Removed enhanced Dolphins Grace from Poseidon child {}", player.getName().getString());
            }
            if (hasHaste) {
                player.removeStatusEffect(StatusEffects.HASTE);
                AIMythologyMod.LOGGER.info("Removed Haste from Poseidon child {}", player.getName().getString());
            }
        }
    }
} 