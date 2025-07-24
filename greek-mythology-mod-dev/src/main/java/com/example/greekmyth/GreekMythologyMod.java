package com.example.greekmyth;

import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.event.ModEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreekMythologyMod implements ModInitializer {
    public static final String MOD_ID = "greekmyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Greek Mythology Mod initialized!");

        GreekItems.init();
        ModEvents.register();
    }
} 