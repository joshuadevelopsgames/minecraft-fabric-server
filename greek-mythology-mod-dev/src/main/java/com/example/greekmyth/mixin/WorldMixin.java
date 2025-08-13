package com.example.greekmyth.mixin;

import com.example.greekmyth.zone.ZoneManager;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class WorldMixin {

    // Deny setting AIR inside protected zones (covers explosions and other removals that use setBlockState)
    @Inject(method = "setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;II)Z", at = @At("HEAD"), cancellable = true)
    private void greek$denySetAirInProtected(BlockPos pos, BlockState state, int flags, int maxUpdateDepth, CallbackInfoReturnable<Boolean> cir) {
        // Respect global protection toggle: allow when protection is disabled
        if (ZoneManager.isProtectionEnabled() && ZoneManager.isBlockProtected(pos) && state.isAir()) {
            cir.setReturnValue(false);
        }
    }


    // Deny removeBlock in protected zones
    @Inject(method = "removeBlock(Lnet/minecraft/util/math/BlockPos;Z)Z", at = @At("HEAD"), cancellable = true)
    private void greek$denyRemoveBlock(BlockPos pos, boolean move, CallbackInfoReturnable<Boolean> cir) {
        // Respect global protection toggle: allow when protection is disabled
        if (ZoneManager.isProtectionEnabled() && ZoneManager.isBlockProtected(pos)) {
            cir.setReturnValue(false);
        }
    }

    // Deny breakBlock in protected zones
    @Inject(method = "breakBlock(Lnet/minecraft/util/math/BlockPos;ZLnet/minecraft/entity/Entity;I)Z", at = @At("HEAD"), cancellable = true)
    private void greek$denyBreakBlock(BlockPos pos, boolean drop, Entity breakingEntity, int maxUpdateDepth, CallbackInfoReturnable<Boolean> cir) {
        // Respect global protection toggle: allow when protection is disabled
        if (ZoneManager.isProtectionEnabled() && ZoneManager.isBlockProtected(pos)) {
            cir.setReturnValue(false);
        }
    }
}

