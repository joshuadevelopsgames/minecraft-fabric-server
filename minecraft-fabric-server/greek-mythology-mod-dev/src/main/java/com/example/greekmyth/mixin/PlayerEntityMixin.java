package com.example.greekmyth.mixin;

import com.example.greekmyth.item.GreekItems;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    /**
     * TEST: Universal water walking for ALL players - Direct Strider-style implementation
     * This mimics the exact Strider updateFloating() method but for water
     */
    @Inject(method = "tick", at = @At("HEAD"))
    private void greekmyth$universalWaterWalking(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        
        // Debug: Log that we're checking water walking for ALL players
        com.example.greekmyth.GreekMythologyMod.LOGGER.info("UNIVERSAL WATER WALKING: Checking for player {} - isInWater={}",
            player.getName().getString(), player.isInWater());
        
        // Strider-style water walking - exactly like Strider's updateFloating() but for water
        if (player.isInWater()) {
            World world = player.getWorld();
            BlockPos blockPos = player.getBlockPos();
            ShapeContext shapeContext = ShapeContext.of(player); // Use ShapeContext.of(this) like Strider
            
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("UNIVERSAL WATER WALKING: Player {} in water - using ShapeContext.of(this)",
                player.getName().getString());
            
            // Exact Strider logic but for water instead of lava
            if (shapeContext.isAbove(FluidBlock.COLLISION_SHAPE, blockPos, true)
                && !world.getFluidState(blockPos.up()).isIn(FluidTags.WATER)) {
                
                // Player is at water surface - exactly like Strider sets on ground
                player.setOnGround(true);
                player.setSwimming(false);
                
                com.example.greekmyth.GreekMythologyMod.LOGGER.info("UNIVERSAL WATER WALKING: Player {} at water surface (Strider-style ShapeContext)",
                    player.getName().getString());
            } else {
                // Player is in water - exactly like Strider's velocity formula
                Vec3d velocity = player.getVelocity();
                player.setVelocity(velocity.multiply(0.5).add(0.0, 0.05, 0.0));
                player.setSwimming(false);
                
                com.example.greekmyth.GreekMythologyMod.LOGGER.info("UNIVERSAL WATER WALKING: Player {} floating in water (Strider velocity formula)",
                    player.getName().getString());
            }
        }
    }
} 