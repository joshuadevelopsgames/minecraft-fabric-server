package com.example.greekmyth;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreekMythologyClientMod implements ClientModInitializer {
    public static final String MOD_ID = "greekmyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Client-side soul counter - synced from server
    private static int clientSoulCount = 0;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Greek Mythology Client Mod initialized!");
    }
    
    /**
     * Get the client-side soul count
     */
    public static int getClientSoulCount() {
        return clientSoulCount;
    }
    
    /**
     * Set the client-side soul count (called when syncing from server)
     */
    public static void setClientSoulCount(int count) {
        clientSoulCount = count;
        LOGGER.info("CLIENT SOUL COUNTER: Updated to {} souls", count);
    }
    
    /**
     * Increment the client-side soul count
     */
    public static void incrementClientSoulCount() {
        clientSoulCount++;
        LOGGER.info("CLIENT SOUL COUNTER: Incremented to {} souls", clientSoulCount);
    }
} 