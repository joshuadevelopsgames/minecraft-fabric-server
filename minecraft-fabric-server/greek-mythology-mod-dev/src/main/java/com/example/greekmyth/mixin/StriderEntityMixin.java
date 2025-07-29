package com.example.greekmyth.mixin;

import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StriderEntity.class)
public class StriderEntityMixin {

    /**
     * Test constructor injection to see if our mixin loads at all
     */
    @Inject(method = "<init>", at = @At("TAIL"))
    private void greekmyth$striderConstructor(CallbackInfo ci) {
        StriderEntity strider = (StriderEntity) (Object) this;
        
        com.example.greekmyth.GreekMythologyMod.LOGGER.info("STRIDER CONSTRUCTOR TEST: Strider {} was created!", 
            strider.getName().getString());
    }

    /**
     * Implement water walking for Striders - based on their lava walking logic
     */
    @Inject(method = "tick", at = @At("TAIL"))
    private void greekmyth$striderTick(CallbackInfo ci) {
        StriderEntity strider = (StriderEntity) (Object) this;
        
        // Check if Strider is in water (instead of lava)
        if (strider.isInWater()) {
            World world = strider.getWorld();
            BlockPos blockPos = strider.getBlockPos();
            
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("WATER WALKING: Strider {} in water - applying water walking logic", 
                strider.getName().getString());
            
            // Use the same logic as Strider's updateFloating() but for water
            if (strider.getFluidHeight(FluidTags.WATER) > 0.0D && 
                !world.getFluidState(blockPos.up()).isIn(FluidTags.WATER)) {
                
                // Strider is at water surface - set on ground
                strider.setOnGround(true);
                com.example.greekmyth.GreekMythologyMod.LOGGER.info("WATER WALKING: Strider {} at water surface - set on ground", 
                    strider.getName().getString());
            } else {
                // Strider is in water - apply floating velocity
                Vec3d velocity = strider.getVelocity();
                strider.setVelocity(velocity.multiply(0.5).add(0.0, 0.05, 0.0));
                com.example.greekmyth.GreekMythologyMod.LOGGER.info("WATER WALKING: Strider {} floating in water - applied velocity", 
                    strider.getName().getString());
            }
        } else {
            // Original test message for non-water cases
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("STRIDER TICK TEST: Strider {} is ticking at TAIL!", 
                strider.getName().getString());
        }
    }
} 