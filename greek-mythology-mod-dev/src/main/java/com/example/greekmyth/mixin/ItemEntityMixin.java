package com.example.greekmyth.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import com.example.greekmyth.item.GreekItems;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin extends Entity {
    public ItemEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    /**
     * Give fireproof items (e.g., Netherite and the Zeus Bolt) the same gentle upward
     * drift that vanilla applies to Netherite so they float to the lava surface.
     */
    @Inject(method = "tick", at = @At("HEAD"))
    private void greekmyth$floatIfFireproof(CallbackInfo ci) {
        // Cast is safe because we are mixed into ItemEntity
        ItemStack stack = ((ItemEntity) (Object) this).getStack();
        if (stack.isOf(GreekItems.ZEUS_BOLT)) {
            System.out.println("[ZeusBoltMixin] tick stack="+stack+" inLava="+this.isInLava());
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("[DEBUG] Zeus Bolt entity tick - inLava={}, velocityY={}", 
                this.isInLava(), this.getVelocity().y);
        }
        if (stack.isOf(GreekItems.ZEUS_BOLT) && this.isInLava()) {
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("[DEBUG] Zeus Bolt entity in lava – applying upward velocity; velocityY={}", this.getVelocity().y);
            // Apply a small, continuous upward velocity
            this.setVelocity(this.getVelocity().add(0.0, 0.04, 0.0));
            // Mark dirty so the change is synced to clients
            this.velocityDirty = true;
        }
    }
} 