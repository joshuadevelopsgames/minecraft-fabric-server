package com.example.greekmyth.client;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomTitleScreenRenderer {
    private static final Logger LOGGER = LoggerFactory.getLogger("CustomTitleScreenRenderer");

    // Custom texture identifiers
    private static final Identifier AMBROSIA_LOGO = Identifier.of("greekmyth", "textures/gui/title/ambrosia_logo.png");
    private static final Identifier CUSTOM_BACKGROUND = Identifier.of("greekmyth", "textures/gui/title/background.png");

    public static void renderCustomLogo(DrawContext context, int width, int height, float alpha) {
        try {
            // Render the AMBROSIA logo with proper aspect ratio
            int logoWidth = 400; // Reduced width
            int logoHeight = 300; // Increased height to maintain aspect ratio
            int logoX = width / 2 - logoWidth / 2; // Center it properly
            int logoY = height / 4 - 150; // Position it higher for better placement
            
            // Make the logo larger with proper aspect ratio
            context.drawTexture(RenderPipelines.GUI_TEXTURED, AMBROSIA_LOGO, logoX, logoY, 0.0f, 0.0f, logoWidth, logoHeight, logoWidth, logoHeight);
            
            LOGGER.debug("Rendered custom AMBROSIA logo at position: {}, {} with proper aspect ratio: {}x{}", logoX, logoY, logoWidth, logoHeight);
        } catch (Exception e) {
            LOGGER.error("Failed to render custom logo: {}", e.getMessage());
        }
    }

    public static void renderCustomBackground(DrawContext context, int width, int height, float alpha) {
        try {
            // Use the animated background renderer
            AnimatedBackgroundRenderer.renderAnimatedBackground(context, width, height, alpha);
        } catch (Exception e) {
            LOGGER.error("Failed to render custom background: {}", e.getMessage());
        }
    }
    
    private static int selectedMessageIndex = -1; // Static variable to store the selected message
    private static long animationStartTime = System.currentTimeMillis(); // Track animation start time
    
    public static void renderCyclingText(DrawContext context, int width, int height, float delta) {
        try {
            // Cycling text messages
            String[] messages = {
                "Zeus watches from above",
                "Poseidon rules the deep seas",
                "Hades guards the dark underworld",
                "Athena grants wisdom to mortals",
                "Ares brings war and chaos",
                "Apollo guides the golden sun",
                "Artemis hunts the silver moon",
                "Hermes delivers messages swiftly",
                "Dionysus brings revelry and wine",
                "Hephaestus forges weapons of power",
                "Aphrodite spreads love and beauty",
                "Demeter grows life from earth",
                "Hestia keeps the sacred hearth",
                "The Fates weave mortal destiny",
                "The Muses inspire art and song",
                "The Furies seek divine justice",
                "The Graces bring beauty and charm",
                "The Nymphs dance in sacred groves",
                "The Centaurs roam the wild mountains",
                "The Satyrs play music in forests"
            };
            
            // Select a random message when the client first opens (only once)
            if (selectedMessageIndex == -1) {
                selectedMessageIndex = (int) (Math.random() * messages.length);
            }
            
            String currentMessage = messages[selectedMessageIndex];
            
            // Calculate text position (centered below the Ambrosia logo)
            int textX = width / 2; // Center horizontally
            // Position text at height / 4 + 25 as requested
            int textY = height / 4 + 25; // Position it slightly higher
            
            // Get the text renderer for proper text rendering
            var textRenderer = net.minecraft.client.MinecraftClient.getInstance().textRenderer;
            
            // Calculate pulsing animation
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - animationStartTime;
            double pulseSpeed = 2.0; // Speed of the pulse (cycles per second)
            double pulseScale = 1.0 + 0.2 * Math.sin(elapsedTime * pulseSpeed * 2 * Math.PI / 1000.0); // Scale from 0.8 to 1.2
            
            // Draw the cycling text in yellow, centered, with simple pulsing animation
            // The pulsing effect is achieved by drawing the text at a larger size when pulseScale > 1
            if (pulseScale > 1.0) {
                // When growing, draw a larger version of the text
                int sizeIncrease = (int) ((pulseScale - 1.0) * 2); // Scale factor for size increase
                
                // Draw the text multiple times with slight offsets to create a larger appearance
                for (int dx = -sizeIncrease; dx <= sizeIncrease; dx++) {
                    for (int dy = -sizeIncrease; dy <= sizeIncrease; dy++) {
                        context.drawCenteredTextWithShadow(
                            textRenderer,
                            net.minecraft.text.Text.literal(currentMessage),
                            textX + dx,
                            textY + dy,
                            0xFFFFD700 // Golden yellow color
                        );
                    }
                }
            } else {
                // When shrinking or normal size, draw normally
                context.drawCenteredTextWithShadow(
                    textRenderer,
                    net.minecraft.text.Text.literal(currentMessage),
                    textX,
                    textY,
                    0xFFFFD700 // Golden yellow color
                );
            }
            
            LOGGER.debug("Rendered cycling text: {}", currentMessage);
        } catch (Exception e) {
            LOGGER.error("Failed to render cycling text: {}", e.getMessage());
        }
    }
} 