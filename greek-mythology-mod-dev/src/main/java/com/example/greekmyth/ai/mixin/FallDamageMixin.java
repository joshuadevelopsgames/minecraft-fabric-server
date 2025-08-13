package com.example.aimyth.mixin;

import com.example.aimyth.classes.DivineClass;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class FallDamageMixin {
    
    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void onPlayerDamage(ServerWorld world, DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        
        // Check if this is fall damage and player is a Zeus child
        if (source.getName().equals("fall") && player instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
            
            // Check if player is a Zeus child
            String playerClass = DivineClass.getPlayerClass(serverPlayer.getUuid());
            if ("zeus".equals(playerClass)) {
                com.example.aimyth.AIMythologyMod.LOGGER.info("Fall damage cancelled for Zeus child {}", 
                    serverPlayer.getName().getString());
                
                // Cancel the fall damage for Zeus children
                cir.setReturnValue(false);
            }
        }
    }
} 