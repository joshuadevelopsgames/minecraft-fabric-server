package com.example.greekmyth.mixin;

import com.example.greekmyth.client.AnimatedBackgroundRenderer;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiplayerScreen.class)
public class MultiplayerScreenMixin {
    
    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        MultiplayerScreen screen = (MultiplayerScreen) (Object) this;
        
        // Render our custom animated background instead of the default panorama
        AnimatedBackgroundRenderer.renderAnimatedBackground(context, screen.width, screen.height, 1.0f);
    }
} 