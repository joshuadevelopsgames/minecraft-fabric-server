package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;

public class ModEvents {
    public static void register() {
        // Simple event registration - no complex death handling
        GreekMythologyMod.LOGGER.info("ModEvents registered - simple version");
    }
} 