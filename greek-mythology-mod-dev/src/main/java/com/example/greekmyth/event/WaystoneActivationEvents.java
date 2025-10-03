package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.shrine.ShrineSystem;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public final class WaystoneActivationEvents {
    private WaystoneActivationEvents() {}

    /**
     * Check if a waypoint is a free-access waypoint (spawn or wilderness)
     * @param pos The block position of the waypoint
     * @param world The world the waypoint is in
     * @return true if this waypoint should allow free access
     */
    private static boolean isFreeAccessWaypoint(BlockPos pos, World world) {
        // Spawn waypoint - typically near world spawn (0,0 or configured spawn)
        if (world instanceof ServerWorld serverWorld) {
            BlockPos spawnPos = serverWorld.getSpawnPos();
            // Check if waypoint is within 50 blocks of spawn
            if (pos.getSquaredDistance(spawnPos) <= 2500) { // 50^2 = 2500
                return true;
            }
        }
        
        // Wilderness waypoint - typically far from spawn (you can adjust these coordinates)
        // Assuming wilderness waypoint is at a significant distance from spawn
        if (Math.abs(pos.getX()) > 1000 || Math.abs(pos.getZ()) > 1000) {
            return true;
        }
        
        return false;
    }

    public static void register() {
        // TEMPORARILY DISABLED: Waystone interference causing crashes
        // TODO: Re-enable with proper compatibility once waystone issues are resolved
        /*
        // Require holding an Ender Eye and right-clicking a Waystone block; consume one Eye and allow default behavior
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!(world instanceof ServerWorld serverWorld)) {
                return ActionResult.PASS;
            }
            if (!(player instanceof ServerPlayerEntity serverPlayer)) {
                return ActionResult.PASS;
            }

            BlockHitResult bhr = (BlockHitResult) hitResult;
            BlockPos pos = bhr.getBlockPos();
            Identifier blockId = Registries.BLOCK.getId(world.getBlockState(pos).getBlock());

            // Only target waystones blocks
            if (!"waystones".equals(blockId.getNamespace()) || !blockId.getPath().contains("waystone")) {
                return ActionResult.PASS;
            }

            // Check if this is a shrine first
            if (ShrineSystem.isShrine(pos)) {
                // Handle shrine interaction
                if (ShrineSystem.handleShrineActivation(serverPlayer, pos, world)) {
                    return ActionResult.SUCCESS; // Consume the interaction (player made offering)
                }
                // If shrine system returns false, continue with normal waystone logic
            }

            // Check if this is a free-access waypoint (spawn or wilderness)
            if (isFreeAccessWaypoint(pos, world)) {
                // Allow free access to spawn and wilderness waypoints
                serverPlayer.sendMessage(Text.literal("§6§l[Waystone] §r§aFree access waypoint activated.").formatted(Formatting.GREEN), false);
                GreekMythologyMod.LOGGER.info("WAYSTONES: Free access waypoint used at {} by {}", pos.toShortString(), serverPlayer.getName().getString());
                return ActionResult.PASS;
            }

            // Must be holding Ender Eye in hand for other waypoints
            ItemStack inHand = player.getStackInHand(hand);
            if (!inHand.isOf(Items.ENDER_EYE)) {
                serverPlayer.sendMessage(Text.literal("§6§l[Waystone] §r§cUse an Ender Eye on the Waystone to interact.").formatted(Formatting.RED), false);
                return ActionResult.FAIL;
            }

            // Consume one Eye if not in creative
            if (!serverPlayer.getAbilities().creativeMode) {
                inHand.decrement(1);
                if (hand == Hand.MAIN_HAND) {
                    serverPlayer.setStackInHand(Hand.MAIN_HAND, inHand);
                } else {
                    serverPlayer.setStackInHand(Hand.OFF_HAND, inHand);
                }
            }

            serverPlayer.sendMessage(Text.literal("§6§l[Waystone] §r§aEye accepted.").formatted(Formatting.GREEN), false);
            GreekMythologyMod.LOGGER.info("WAYSTONES: Eye consumed at {} by {}", pos.toShortString(), serverPlayer.getName().getString());
            // Allow Waystones to handle the click normally (open GUI / activate)
            return ActionResult.PASS;
        });
        */

        // Temporarily disable waystone item blocking to fix hotbar crash
        // TODO: Re-enable with more specific filtering once hotbar issue is resolved
        /*
        UseItemCallback.EVENT.register((player, world, hand) -> {
            ItemStack stack = player.getStackInHand(hand);
            Identifier itemId = Registries.ITEM.getId(stack.getItem());
            if ("waystones".equals(itemId.getNamespace())) {
                String path = itemId.getPath();
                if (path.contains("scroll") || path.contains("warp_stone") || path.contains("warp")) {
                    if (player instanceof ServerPlayerEntity serverPlayer) {
                        serverPlayer.sendMessage(Text.literal("§6§l[Waystone] §r§cScrolls are disabled. Use an Ender Eye on a Waystone.").formatted(Formatting.RED), false);
                    }
                    return ActionResult.FAIL;
                }
            }
            return ActionResult.PASS;
        });
        */

        GreekMythologyMod.LOGGER.info("Waystone interaction temporarily disabled to fix compatibility issues");
    }
}

