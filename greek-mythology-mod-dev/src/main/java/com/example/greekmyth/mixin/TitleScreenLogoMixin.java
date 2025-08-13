package com.example.greekmyth.mixin;

import com.example.greekmyth.client.CustomTitleScreenRenderer;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenLogoMixin {
    
    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        TitleScreen screen = (TitleScreen) (Object) this;
        
        // Render custom background
        CustomTitleScreenRenderer.renderCustomBackground(context, screen.width, screen.height, 1.0f);
        
        // Render custom logo
        CustomTitleScreenRenderer.renderCustomLogo(context, screen.width, screen.height, 1.0f);
    }
    
    // This will prevent the original Minecraft logo from rendering
    @Inject(method = "render", at = @At("TAIL"), cancellable = true)
    private void onRenderEnd(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        // Cancel the original render to prevent the Minecraft logo from showing
        // But we need to render the buttons first, so we'll do this differently
    }
} 