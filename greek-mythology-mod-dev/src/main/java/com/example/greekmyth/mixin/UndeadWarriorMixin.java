package com.example.greekmyth.mixin;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WolfEntity.class)
public abstract class UndeadWarriorMixin {

    @Inject(method = "getAmbientSound", at = @At("HEAD"), cancellable = true)
    private void greekmyth$undeadWarriorAmbientSound(CallbackInfoReturnable<SoundEvent> cir) {
        WolfEntity wolf = (WolfEntity) (Object) this;
        if (isUndeadWarrior(wolf)) {
            cir.setReturnValue(SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT);
        }
    }

    @Inject(method = "getHurtSound", at = @At("HEAD"), cancellable = true)
    private void greekmyth$undeadWarriorHurtSound(net.minecraft.entity.damage.DamageSource source, CallbackInfoReturnable<SoundEvent> cir) {
        WolfEntity wolf = (WolfEntity) (Object) this;
        if (isUndeadWarrior(wolf)) {
            cir.setReturnValue(SoundEvents.ENTITY_WITHER_SKELETON_HURT);
        }
    }

    @Inject(method = "getDeathSound", at = @At("HEAD"), cancellable = true)
    private void greekmyth$undeadWarriorDeathSound(CallbackInfoReturnable<SoundEvent> cir) {
        WolfEntity wolf = (WolfEntity) (Object) this;
        if (isUndeadWarrior(wolf)) {
            cir.setReturnValue(SoundEvents.ENTITY_WITHER_SKELETON_DEATH);
        }
    }

    @Inject(method = "playStepSound", at = @At("HEAD"), cancellable = true)
    private void greekmyth$undeadWarriorStepSound(BlockPos pos, net.minecraft.block.BlockState state, CallbackInfo ci) {
        WolfEntity wolf = (WolfEntity) (Object) this;
        if (isUndeadWarrior(wolf)) {
            wolf.playSound(SoundEvents.ENTITY_SKELETON_STEP, 0.15f, 1.0f);
            ci.cancel();
        }
    }

    private boolean isUndeadWarrior(WolfEntity wolf) {
        if (wolf.hasCustomName()) {
            String name = wolf.getCustomName().getString();
            return name.contains("Undead Warrior");
        }
        return false;
    }
} 