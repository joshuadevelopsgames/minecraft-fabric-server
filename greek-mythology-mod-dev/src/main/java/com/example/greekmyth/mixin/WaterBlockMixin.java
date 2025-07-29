package com.example.greekmyth.mixin;

import com.example.greekmyth.item.GreekItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
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

@Mixin(net.minecraft.block.FluidBlock.class)
public abstract class WaterBlockMixin {

    /**
     * Modify the collision shape of water blocks when a player has the Poseidon Trident
     */
    @Inject(method = "getCollisionShape", at = @At("RETURN"), cancellable = true)
    private void greekmyth$modifyWaterCollision(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        // Only modify water blocks
        if (!state.isOf(Blocks.WATER)) {
            return;
        }
        
        // Check if the context is a player
        if (context instanceof net.minecraft.block.EntityShapeContext entityContext) {
            if (entityContext.getEntity() instanceof PlayerEntity player) {
                // Check if player is holding Poseidon Trident in either hand
                ItemStack mainHand = player.getStackInHand(Hand.MAIN_HAND);
                ItemStack offHand = player.getStackInHand(Hand.OFF_HAND);
                
                boolean hasPoseidonTrident = mainHand.isOf(GreekItems.POSEIDON_TRIDENT) || 
                                            offHand.isOf(GreekItems.POSEIDON_TRIDENT);
                
                if (hasPoseidonTrident && !player.isSneaking()) {
                    // Make water solid for players with the trident
                    cir.setReturnValue(VoxelShapes.fullCube());
                    
                    com.example.greekmyth.GreekMythologyMod.LOGGER.info("POSEIDON WATER WALKING: Modified collision shape for player {} at ({}, {}, {})", 
                        player.getName().getString(), pos.getX(), pos.getY(), pos.getZ());
                }
            }
        }
    }
} 