package com.example.greekmyth.mixin;

import com.example.greekmyth.item.GreekItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    // Track double-tap timing
    private long lastForwardPress = 0;
    private boolean wasMovingForward = false;
    private static final long DOUBLE_TAP_TIME = 300; // 300ms for double-tap

    /**
     * Poseidon Trident Riptide III underwater sprinting
     * When holding the Poseidon Trident and pressing sprint underwater, apply Riptide III movement
     * Also activates on double-tap forward
     */
    @Inject(method = "tick", at = @At("TAIL"))
    private void greekmyth$poseidonTridentRiptide(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;
        
        // Check if player is holding Poseidon Trident in either hand
        ItemStack mainHand = player.getStackInHand(Hand.MAIN_HAND);
        ItemStack offHand = player.getStackInHand(Hand.OFF_HAND);
        
        boolean hasPoseidonTrident = mainHand.isOf(GreekItems.POSEIDON_TRIDENT) || 
                                    offHand.isOf(GreekItems.POSEIDON_TRIDENT);
        
        // Check if player is submerged in water
        boolean isInWater = player.isSubmergedInWater();
        
        // Check if player is moving forward (using velocity as a proxy for input)
        Vec3d velocity = player.getVelocity();
        boolean isMovingForward = Math.abs(velocity.x) > 0.01 || Math.abs(velocity.z) > 0.01;
        
        // Check for double-tap forward
        boolean doubleTapForward = false;
        if (isMovingForward && !wasMovingForward) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastForwardPress < DOUBLE_TAP_TIME) {
                doubleTapForward = true;
            }
            lastForwardPress = currentTime;
        }
        wasMovingForward = isMovingForward;
        
        // Check if sprint key is pressed (this works even underwater)
        boolean isSprintPressed = player.isSprinting();
        

        
        // Activate Riptide if player has trident, is in water, and either:
        // 1. Pressing sprint key, OR
        // 2. Double-tapped forward
        boolean shouldActivateRiptide = hasPoseidonTrident && isInWater && 
                                       (isSprintPressed || doubleTapForward) && isMovingForward;
        
        if (shouldActivateRiptide) {
            // Riptide III movement - boost forward movement significantly
            // Get the direction the player is looking
            Vec3d lookVec = player.getRotationVec(1.0F);
            
            // Apply Riptide III boost (similar to vanilla Riptide III)
            double riptideSpeed = 2.0; // Riptide III speed multiplier
            
            // Calculate new velocity with Riptide boost in the direction player is looking
            Vec3d newVelocity = new Vec3d(
                lookVec.x * riptideSpeed,
                velocity.y, // Keep vertical velocity unchanged
                lookVec.z * riptideSpeed
            );
            
            player.setVelocity(newVelocity);
            

        }
    }
} 