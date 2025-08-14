package com.example.greekmyth.mixin;

import com.example.greekmyth.client.CustomTitleScreenRenderer;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenLogoReplacer {
    
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void onRender(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        TitleScreen screen = (TitleScreen) (Object) this;
        
        // Render custom background
        CustomTitleScreenRenderer.renderCustomBackground(context, screen.width, screen.height, 1.0f);
        
        // Render custom logo
        CustomTitleScreenRenderer.renderCustomLogo(context, screen.width, screen.height, 1.0f);
        
        // Render the rest of the title screen without the original logo
        renderCustomTitleScreen(screen, context, mouseX, mouseY, delta);
        
        // Cancel the original render to prevent the Minecraft logo from showing
        ci.cancel();
    }
    
    private void renderCustomTitleScreen(TitleScreen screen, net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta) {
        // Render background
        screen.renderBackground(context, mouseX, mouseY, delta);
        
        // Render all buttons
        for (var child : screen.children()) {
            if (child instanceof net.minecraft.client.gui.widget.ButtonWidget) {
                ((net.minecraft.client.gui.widget.ButtonWidget) child).render(context, mouseX, mouseY, delta);
            }
        }
        
        // Render text elements (but not the logo)
        renderCustomText(screen, context);
    }
    
    private void renderCustomText(TitleScreen screen, net.minecraft.client.gui.DrawContext context) {
        // Render credits and other text elements
        // This is a simplified version - you can add more text rendering here
        
        // Render our custom cycling text on top of everything
        CustomTitleScreenRenderer.renderCyclingText(context, screen.width, screen.height, 0.0f);
    }
    

} 