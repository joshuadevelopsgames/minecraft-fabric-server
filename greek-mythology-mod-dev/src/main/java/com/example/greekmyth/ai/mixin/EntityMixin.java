package com.example.aimyth.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Mixin to add wither effects to entities in vanilla water blocks.
 * This makes vanilla water behave like Stygian Water.
 * 
 * DISABLED: This was causing all vanilla water to apply wither effects.
 * Stygian Water should only affect actual Stygian Water blocks, not vanilla water.
 */
@Mixin(Entity.class)
public class EntityMixin {

    // DISABLED: This was making all water apply wither effects
    // Only Stygian Water should have wither effects, not vanilla water
    /*
    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        Entity entity = (Entity)(Object)this;
        
        // Only apply to players
        if (!(entity instanceof PlayerEntity player)) {
            return;
        }
        
        World world = entity.getWorld();
        if (world.isClient()) {
            return;
        }
        
        // Check if player is in water
        BlockPos pos = entity.getBlockPos();
        if (world.getFluidState(pos).isOf(Fluids.WATER)) {
            // Apply wither effect for 3 seconds (60 ticks) with level 1
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 0));
        }
    }
    */
} 