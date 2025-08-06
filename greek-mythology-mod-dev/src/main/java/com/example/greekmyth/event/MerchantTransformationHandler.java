package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;

public class MerchantTransformationHandler {

    public static void register() {
        // No longer needed since we're using a custom entity type
        GreekMythologyMod.LOGGER.info("Merchant Transformation Handler registered - using custom entity!");
    }
} 