package com.example.aimyth.mixin;

import com.example.aimyth.classes.LightningHandler;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class LightningMixin {
    
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onPlayerDamage(ServerWorld world, DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        
        // Debug: Log all damage sources to see what lightning damage is called
        if (player instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
            String sourceName = source.getName();
            String sourceId = source.getType().toString();
            
            // Log damage source info for debugging
            com.example.aimyth.AIMythologyMod.LOGGER.info("Player {} took {} damage from source: '{}' (type: {})", 
                serverPlayer.getName().getString(), amount, sourceName, sourceId);
            
            // Check if this is lightning damage and player is a Zeus child
            // Try multiple possible lightning damage source names
            boolean isLightningDamage = sourceName.equals("lightning") || 
                                      sourceName.equals("lightningBolt") ||
                                      sourceName.equals("lightning_bolt") ||
                                      sourceId.contains("lightning") ||
                                      sourceId.contains("Lightning");
            
            if (isLightningDamage && LightningHandler.shouldCancelLightningDamage(serverPlayer)) {
                com.example.aimyth.AIMythologyMod.LOGGER.info("Lightning damage detected! Cancelling damage for Zeus child {}", 
                    serverPlayer.getName().getString());
                
                // Handle the lightning strike for Zeus children
                LightningHandler.handleLightningStrike(serverPlayer, null);
                
                // Cancel the damage
                cir.setReturnValue(false);
            }
        }
    }
} 