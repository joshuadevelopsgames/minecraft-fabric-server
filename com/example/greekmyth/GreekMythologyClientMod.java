package com.example.greekmyth;

import com.example.greekmyth.client.MerchantPiglinRenderer;
import com.example.greekmyth.entity.MerchantPiglinEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
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
        
        // Register custom entity renderers
        EntityRendererRegistry.register(MerchantPiglinEntity.class, MerchantPiglinRenderer::new);
        
        LOGGER.info("Custom entity renderers registered!");
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