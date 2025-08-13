package com.example.aimyth;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client-side initializer for the AI Mythology mod.
 */
public class AIMythologyClientMod implements ClientModInitializer {
    
    public static final String MOD_ID = "aimyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing AI Mythology client mod...");
        
        // TODO: Add client-side rendering for Stygian Water bucket
        
        LOGGER.info("AI Mythology client mod initialized successfully!");
    }
} 