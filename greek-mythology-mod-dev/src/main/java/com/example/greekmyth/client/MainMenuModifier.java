package com.example.greekmyth.client;

import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.Screens;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainMenuModifier {
    private static final Logger LOGGER = LoggerFactory.getLogger("MainMenuModifier");

    public static void init() {
        // Register screen event to modify the title screen
        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> {
            if (screen instanceof TitleScreen) {
                modifyTitleScreen((TitleScreen) screen, scaledWidth, scaledHeight);
            }
        });
    }

    private static void modifyTitleScreen(TitleScreen titleScreen, int scaledWidth, int scaledHeight) {
        LOGGER.info("Modifying main menu for Greek Mythology mod...");

        // Get the button list from the title screen
        var buttons = Screens.getButtons(titleScreen);

        // Custom button removed - keeping only the modified existing buttons

        // You can also modify existing buttons
        for (var button : buttons) {
            if (button.getMessage().getString().contains("Singleplayer")) {
                // Modify the singleplayer button text
                button.setMessage(Text.literal("Camp Half-Blood"));
            }
        }

        LOGGER.info("Main menu modification complete!");
    }
} 