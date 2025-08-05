package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.pvp.PvpZoneManager;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;

import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PvpProtectionEvents {
    
    // Track player's last known zone state
    private static final Map<UUID, Boolean> playerInNoPvpZone = new HashMap<>();
    
    public static void register() {
        // Register block break events for No PvP Stick selection
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer)) {
                return true; // Allow break on client
            }
            
            // Check if player is holding No PvP Stick for left-click selection
            ItemStack mainHand = player.getMainHandStack();
            if (mainHand.getItem() == GreekItems.NO_PVP_STICK) {
                PvpZoneManager.handleLeftClick(serverPlayer, (ServerWorld) world, pos);
                return false; // Cancel the break when using No PvP Stick
            }
            
            return true; // Allow the break
        });
        
        // Register right-click block interaction for No PvP Stick
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer) || !(world instanceof ServerWorld serverWorld)) {
                return ActionResult.PASS;
            }
            
            ItemStack stack = player.getStackInHand(hand);
            if (stack.getItem() == GreekItems.NO_PVP_STICK) {
                BlockPos pos = hitResult.getBlockPos();
                PvpZoneManager.handleRightClick(serverPlayer, serverWorld, pos);
                return ActionResult.SUCCESS; // Consume the interaction
            }
            
            return ActionResult.PASS;
        });
        
        // Register player movement tracking for zone entry/exit notifications
        // We'll use a tick-based approach to check player positions
        net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.END_SERVER_TICK.register(server -> {
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                UUID playerId = player.getUuid();
                BlockPos currentPos = player.getBlockPos();
                boolean currentlyInNoPvpZone = PvpZoneManager.isInNoPvpZone(currentPos);
                boolean wasInNoPvpZone = playerInNoPvpZone.getOrDefault(playerId, false);
                
                // Check if player entered a no PvP zone
                if (currentlyInNoPvpZone && !wasInNoPvpZone) {
                    player.sendMessage(Text.literal("§a§l[Safe Zone] §r§aYou have entered a No PvP zone!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7PvP is disabled in this area.").formatted(Formatting.GRAY), false);
                    GreekMythologyMod.LOGGER.info("PvP Protection: Player {} entered no PvP zone at {}", 
                        player.getName().getString(), currentPos);
                }
                // Check if player left a no PvP zone
                else if (!currentlyInNoPvpZone && wasInNoPvpZone) {
                    player.sendMessage(Text.literal("§c§l[PvP Zone] §r§cYou have entered a PvP zone!").formatted(Formatting.RED), false);
                    player.sendMessage(Text.literal("§7PvP is now enabled.").formatted(Formatting.GRAY), false);
                    GreekMythologyMod.LOGGER.info("PvP Protection: Player {} left no PvP zone at {}", 
                        player.getName().getString(), currentPos);
                }
                
                // Update player's zone state
                playerInNoPvpZone.put(playerId, currentlyInNoPvpZone);
            }
        });
        
        GreekMythologyMod.LOGGER.info("PvP Protection Events registered!");
    }
} 