package com.example.greekmyth;

import com.example.greekmyth.client.render.MerchantPiglinRenderer;
import com.example.greekmyth.entity.GreekEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;
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
        
                            // Register custom entity renderer for merchant piglin
                    EntityRendererRegistry.register(GreekEntityTypes.MERCHANT_PIGLIN, MerchantPiglinRenderer::new);
        
        LOGGER.info("Custom entity renderer registered for merchant piglin");
        LOGGER.info("Custom texture ready: merchant_piglin.png");
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