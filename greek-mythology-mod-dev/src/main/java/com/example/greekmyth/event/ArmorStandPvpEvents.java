package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.pvp.PvpZoneManager;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

public class ArmorStandPvpEvents {
    
    public static void register() {
        // Register armor stand damage events for PvP testing
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof ArmorStandEntity) {
                // Add a custom damage handler to armor stands
                entity.setInvulnerable(false); // Ensure armor stands can take damage
            }
        });
        
        // Note: For now, we'll use a simpler approach with chat commands for testing
        // The armor stand PvP testing will be implemented in a future update
        // with proper entity damage event handling
        
        GreekMythologyMod.LOGGER.info("Armor Stand PvP Events registered!");
    }
} 