package com.example.greekmyth.mixin;

import com.example.greekmyth.client.AnimatedBackgroundRenderer;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SelectWorldScreen.class)
public class SelectWorldScreenMixin {
    
    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        SelectWorldScreen screen = (SelectWorldScreen) (Object) this;
        
        // Render our custom animated background instead of the default panorama
        AnimatedBackgroundRenderer.renderAnimatedBackground(context, screen.width, screen.height, 1.0f);
    }
} 