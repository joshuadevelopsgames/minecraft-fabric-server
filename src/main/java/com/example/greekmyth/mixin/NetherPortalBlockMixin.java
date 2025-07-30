package com.example.greekmyth.mixin;

import com.example.greekmyth.portal.InfernoPortalManager;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetherPortalBlock.class)
public class NetherPortalBlockMixin {

    @Inject(method = "onEntityCollision", at = @At("HEAD"), cancellable = true)
    private void onPortalCollision(BlockState state, World world, BlockPos pos, Entity entity, CallbackInfo ci) {
        if (!world.isClient && entity instanceof ServerPlayerEntity player && !entity.hasVehicle() && !entity.hasPassengers()) {
            // Check if this is an inferno portal and handle teleportation
            if (InfernoPortalManager.handlePortalTeleport(player, (ServerWorld) world, pos)) {
                // InfernoPortalManager handled the teleportation, cancel normal portal behavior
                ci.cancel();
            }
            // If not an inferno portal, let normal portal behavior proceed
        }
    }
} 