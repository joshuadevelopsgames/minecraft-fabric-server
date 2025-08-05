package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.zone.ZoneManager;
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

public class ZoneProtectionEvents {
    
    public static void register() {
        // Register block break protection
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer)) {
                return true; // Allow break on client
            }
            
            // Check if player is holding Power Stick for left-click selection
            ItemStack mainHand = player.getMainHandStack();
            if (mainHand.getItem() == GreekItems.POWER_STICK) {
                ZoneManager.handleLeftClick(serverPlayer, (ServerWorld) world, pos);
                return false; // Cancel the break when using Power Stick
            }
            
            // Check if player can break this block
            if (!ZoneManager.canPlayerBreakBlock(serverPlayer, pos)) {
                // Block is protected, cancel the break
                serverPlayer.sendMessage(Text.literal("§6§l[Zone Protection] §r§cThis area is protected!").formatted(Formatting.RED), false);
                serverPlayer.sendMessage(Text.literal("§7You cannot break blocks in this zone.").formatted(Formatting.GRAY), false);
                
                GreekMythologyMod.LOGGER.info("Zone Protection: Player {} attempted to break protected block at {}", 
                    serverPlayer.getName().getString(), pos);
                
                return false; // Cancel the break
            }
            
            return true; // Allow the break
        });
        
        // Register right-click block interaction for Power Stick
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer) || !(world instanceof ServerWorld serverWorld)) {
                return ActionResult.PASS;
            }
            
            ItemStack stack = player.getStackInHand(hand);
            if (stack.getItem() == GreekItems.POWER_STICK) {
                BlockPos pos = hitResult.getBlockPos();
                ZoneManager.handleRightClick(serverPlayer, serverWorld, pos);
                return ActionResult.SUCCESS; // Consume the interaction
            }
            
            return ActionResult.PASS;
        });
        
        GreekMythologyMod.LOGGER.info("Zone Protection Events registered!");
    }
} 