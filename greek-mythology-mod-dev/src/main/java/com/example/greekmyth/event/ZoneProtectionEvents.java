package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.zone.ZoneManager;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
            if (mainHand.getItem() == GreekItems.POWER_STICK || mainHand.getItem() == GreekItems.SPAWN_PROTECT_STICK) {
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
            if (stack.getItem() == GreekItems.POWER_STICK || stack.getItem() == GreekItems.SPAWN_PROTECT_STICK) {
                BlockPos pos = hitResult.getBlockPos();
                boolean fullHeight = stack.getItem() == GreekItems.SPAWN_PROTECT_STICK;
                ZoneManager.handleRightClick(serverPlayer, serverWorld, pos, fullHeight, fullHeight);
                return ActionResult.SUCCESS; // Consume the interaction
            }

            // Prevent creating fire inside protected zones unless on eternal-fire blocks
            if (stack.getItem() == Items.FLINT_AND_STEEL || stack.getItem() == Items.FIRE_CHARGE) {
                BlockHitResult bhr = (BlockHitResult) hitResult;
                BlockPos targetPos = bhr.getBlockPos().offset(bhr.getSide());
                
                if (ZoneManager.isBlockProtected(targetPos)) {
                    BlockState below = serverWorld.getBlockState(targetPos.down());
                    boolean isEternalSurface = below.isOf(Blocks.NETHERRACK) || below.isOf(Blocks.SOUL_SOIL) || below.isOf(Blocks.SOUL_SAND);
                    if (!isEternalSurface) {
                        serverPlayer.sendMessage(Text.literal("§6§l[Zone Protection] §r§cFire is not allowed here.").formatted(Formatting.RED), false);
                        serverPlayer.sendMessage(Text.literal("§7Fire inside protected zones is only allowed on Netherrack or Soul Soil.").formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("Zone Protection: Prevented fire placement by {} at {} inside protected zone", serverPlayer.getName().getString(), targetPos);
                        return ActionResult.FAIL; // Block the fire placement
                    }
                }
            }
            
            return ActionResult.PASS;
        });

        // Explosion block filtering is implemented via a mixin on Explosion#collectBlocksAndDamageEntities
        
        GreekMythologyMod.LOGGER.info("Zone Protection Events registered!");
    }
} 