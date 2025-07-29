package com.example.greekmyth.mixin;

import net.minecraft.entity.passive.StriderEntity;
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
} 