package com.example.greekmyth.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimatedBackgroundRenderer {
    private static final Logger LOGGER = LoggerFactory.getLogger("AnimatedBackgroundRenderer");
    
    // Animation settings
    private static final int TOTAL_FRAMES = 40; // We have 40 frames from the GIF
    private static final int FRAME_DURATION = 100; // Milliseconds per frame (10 FPS)
    private static long lastFrameTime = 0;
    private static int currentFrame = 0;
    
    public static void renderAnimatedBackground(DrawContext context, int width, int height, float alpha) {
        try {
            long currentTime = System.currentTimeMillis();
            
            // Update frame based on time
            if (currentTime - lastFrameTime >= FRAME_DURATION) {
                currentFrame = (currentFrame + 1) % TOTAL_FRAMES;
                lastFrameTime = currentTime;
            }
            
            // Create the frame texture identifier
            String framePath = String.format("textures/gui/title/frames/frame_%03d.png", currentFrame + 1);
            Identifier frameTexture = Identifier.of("greekmyth", framePath);
            
            // Render the current frame
            context.drawTexture(RenderPipelines.GUI_TEXTURED, frameTexture, 0, 0, 0.0f, 0.0f, width, height, width, height);
            
            LOGGER.debug("Rendered animated background frame: {} of {}", currentFrame + 1, TOTAL_FRAMES);
        } catch (Exception e) {
            LOGGER.error("Failed to render animated background: {}", e.getMessage());
        }
    }
} 