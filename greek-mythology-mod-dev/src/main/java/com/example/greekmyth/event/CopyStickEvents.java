package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.copy.CopyManager;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopyStickEvents {
    
    public static void register() {
        // Register block break events for Copy Stick left-click selection
        PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer)) {
                return true; // Allow break on client
            }
            
            // Check if player is holding Copy Stick for left-click selection
            ItemStack mainHand = player.getMainHandStack();
            if (mainHand.getItem() == GreekItems.COPY_STICK) {
                CopyManager.handleLeftClick(serverPlayer, (ServerWorld) world, pos);
                return false; // Cancel the break when using Copy Stick
            }
            
            return true; // Allow the break
        });
        
        // Register right-click block interaction for Copy Stick
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!(player instanceof ServerPlayerEntity serverPlayer) || !(world instanceof ServerWorld serverWorld)) {
                return ActionResult.PASS;
            }
            
            ItemStack stack = player.getStackInHand(hand);
            if (stack.getItem() == GreekItems.COPY_STICK) {
                BlockPos pos = hitResult.getBlockPos();
                
                // Check if player is sneaking (shift + right-click for paste)
                if (player.isSneaking()) {
                    CopyManager.handleShiftRightClick(serverPlayer, serverWorld, pos);
                } else {
                    // Regular right-click for copy
                    CopyManager.handleRightClick(serverPlayer, serverWorld, pos);
                }
                
                return ActionResult.SUCCESS; // Consume the interaction
            }
            
            return ActionResult.PASS;
        });
        
        GreekMythologyMod.LOGGER.info("Copy Stick Events registered!");
    }
}
