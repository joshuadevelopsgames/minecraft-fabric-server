package com.example.greekmyth.mixin;

import com.example.greekmyth.item.GreekItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FluidBlock.class)
public class FluidBlockMixin {

    /**
     * Modify water collision shape for Poseidon Trident water walking
     * This makes water blocks solid when a player with the trident is nearby
     */
    @Inject(method = "getCollisionShape", at = @At("HEAD"), cancellable = true)
    private void greekmyth$modifyWaterCollision(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        // Check if this is a water block
        if (state.getBlock() instanceof FluidBlock) {
            // Check if the context is an entity (player)
            if (context instanceof Entity entity && entity instanceof PlayerEntity player) {
                // Check if player is holding Poseidon Trident in either hand
                ItemStack mainHand = player.getStackInHand(Hand.MAIN_HAND);
                ItemStack offHand = player.getStackInHand(Hand.OFF_HAND);
                
                boolean hasPoseidonTrident = mainHand.isOf(GreekItems.POSEIDON_TRIDENT) || 
                                            offHand.isOf(GreekItems.POSEIDON_TRIDENT);
                
                if (hasPoseidonTrident && !player.isSneaking()) {
                    // Make water solid for this player
                    cir.setReturnValue(VoxelShapes.fullCube());
                    
                    com.example.greekmyth.GreekMythologyMod.LOGGER.info("POSEIDON FLUID COLLISION: Made water solid for player {} at {}", 
                        player.getName().getString(), pos);
                }
            }
        }
    }
} 