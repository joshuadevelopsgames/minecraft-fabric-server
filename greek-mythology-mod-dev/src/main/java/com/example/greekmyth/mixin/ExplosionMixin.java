package com.example.greekmyth.mixin;

import com.example.greekmyth.zone.ZoneManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.List;

// Target by obfuscated name path; if mapping changes, this mixin is harmless
@Mixin(targets = "net.minecraft.world.explosion.Explosion")
public class ExplosionMixin {

    // Signature for collectBlocksAndDamageEntities(World, double, double, double, float, boolean, ExplosionBehavior, Entity)
    @Inject(method = "collectBlocksAndDamageEntities", at = @At("TAIL"))
    private void greek$filterProtectedBlocks(World world, double x, double y, double z, float power, boolean createFire, Object behavior, Entity source, CallbackInfo ci) {
        // No-op fallback; actual block protection is enforced via World mixin.
    }
}

