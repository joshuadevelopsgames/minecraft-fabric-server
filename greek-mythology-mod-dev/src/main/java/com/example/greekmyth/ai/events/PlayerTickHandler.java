package com.example.aimyth.events;

import com.example.aimyth.AIMythologyMod;
import com.example.aimyth.classes.PoseidonUnderwaterHandler;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;

public class PlayerTickHandler {
    
    public static void init() {
        ServerTickEvents.END_SERVER_TICK.register(PlayerTickHandler::onServerTick);
        AIMythologyMod.LOGGER.info("Initializing Player Tick Handler for Poseidon underwater buffs...");
    }
    
    private static void onServerTick(MinecraftServer server) {
        // Check all online players for Poseidon underwater buffs
        server.getPlayerManager().getPlayerList().forEach(player -> {
            PoseidonUnderwaterHandler.updatePoseidonUnderwaterBuffs(player);
        });
    }
} 