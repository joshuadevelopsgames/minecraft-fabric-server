package com.example.aimyth.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.FluidRenderer;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Client-side mixin to make water appear black for Stygian Water effect.
 */
@Mixin(FluidRenderer.class)
public class ClientFluidRenderingMixin {

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void onRender(BlockRenderView world, BlockPos pos, VertexConsumer vertexConsumer, 
                         BlockState blockState, FluidState fluidState, CallbackInfo ci) {
        // Make all water appear black for Stygian Water effect
        if (fluidState.getFluid() == net.minecraft.fluid.Fluids.WATER) {
            // Let vanilla water render normally
            // We'll apply a dark tint using a different approach
        }
    }
} 