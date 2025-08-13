package com.example.greekmyth.mixin;

import com.example.greekmyth.client.CustomTitleScreenRenderer;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    
    @Inject(method = "init", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        TitleScreen screen = (TitleScreen) (Object) this;
        
        // Add custom buttons or modify existing ones
        // This runs after the title screen is initialized
        
        // Example: Add a custom button
        // screen.addDrawableChild(ButtonWidget.builder(
        //     Text.literal("🏛️ Greek Mythology"),
        //     button -> {
        //         // Custom functionality
        //     }
        // ).dimensions(screen.width / 2 - 100, screen.height / 4 + 120, 200, 20).build());
    }
    
    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        TitleScreen screen = (TitleScreen) (Object) this;
        
        // Render custom background
        CustomTitleScreenRenderer.renderCustomBackground(context, screen.width, screen.height, 1.0f);
        
        // Render custom logo
        CustomTitleScreenRenderer.renderCustomLogo(context, screen.width, screen.height, 1.0f);
    }
} 