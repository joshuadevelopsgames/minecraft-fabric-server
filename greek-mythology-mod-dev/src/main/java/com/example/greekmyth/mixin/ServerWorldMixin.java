package com.example.greekmyth.mixin;

import com.example.greekmyth.explosion.ExplosionGuard;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {

    // Hook start of explosion lifecycle
    @Inject(method = "createExplosion", at = @At("HEAD"))
    private void greek$onExplosionStart(CallbackInfo ci) {
        ExplosionGuard.enable();
    }

    // Hook end of explosion lifecycle
    @Inject(method = "createExplosion", at = @At("RETURN"))
    private void greek$onExplosionEnd(CallbackInfo ci) {
        ExplosionGuard.disable();
    }
}

