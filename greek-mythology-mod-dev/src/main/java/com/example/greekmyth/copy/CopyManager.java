package com.example.greekmyth.copy;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CopyManager {
    
    private static final Map<UUID, CopiedArea> playerCopiedAreas = new HashMap<>();
    
    /**
     * Handle left-click (first corner selection)
     */
    public static void handleLeftClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        
        // Create new selection or update existing one
        CopiedArea selection = playerCopiedAreas.get(playerId);
        if (selection == null) {
            selection = new CopiedArea();
            playerCopiedAreas.put(playerId, selection);
        }
        
        selection.setCorner1(pos);
        
        player.sendMessage(Text.literal("§b§l[Copy Stick] §r§aFirst corner set at " + formatPosition(pos)).formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Now right-click to set the second corner and copy the area.").formatted(Formatting.GRAY), false);
        
        GreekMythologyMod.LOGGER.info("Copy Manager: Player {} set first corner at {}", 
            player.getName().getString(), pos);
    }
    
    /**
     * Handle right-click (second corner selection and copy)
     */
    public static void handleRightClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        CopiedArea selection = playerCopiedAreas.get(playerId);
        
        if (selection == null || selection.getCorner1() == null) {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cPlease left-click a block first to set the first corner.").formatted(Formatting.RED), false);
            return;
        }
        
        selection.setCorner2(pos);
        
        // Copy the area
        if (copyArea(player, world, selection)) {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§aArea copied successfully!").formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§7Volume: " + selection.getVolume() + " blocks").formatted(Formatting.GRAY), false);
            player.sendMessage(Text.literal("§7Shift + right-click to paste the copied area.").formatted(Formatting.GRAY), false);
        } else {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cFailed to copy area. Area may be too large.").formatted(Formatting.RED), false);
        }
        
        // Clear selection after copy
        playerCopiedAreas.remove(playerId);
    }
    
    /**
     * Handle shift + right-click (paste)
     */
    public static void handleShiftRightClick(ServerPlayerEntity player, ServerWorld world, BlockPos pos) {
        UUID playerId = player.getUuid();
        CopiedArea copiedArea = playerCopiedAreas.get(playerId);
        
        if (copiedArea == null || !copiedArea.hasCopiedData()) {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cNo area copied! Use left-click then right-click to copy an area first.").formatted(Formatting.RED), false);
            return;
        }
        
        // Paste the area
        if (pasteArea(player, world, pos, copiedArea)) {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§aArea pasted successfully!").formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§7Pasted at " + formatPosition(pos)).formatted(Formatting.GRAY), false);
        } else {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cFailed to paste area. Check if the destination is clear.").formatted(Formatting.RED), false);
        }
    }
    
    /**
     * Copy blocks from the selected area
     */
    private static boolean copyArea(ServerPlayerEntity player, ServerWorld world, CopiedArea selection) {
        BlockPos corner1 = selection.getCorner1();
        BlockPos corner2 = selection.getCorner2();
        
        // Calculate bounds
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());
        
        // Check size limits (max 50x50x50 to prevent server lag)
        int sizeX = maxX - minX + 1;
        int sizeY = maxY - minY + 1;
        int sizeZ = maxZ - minZ + 1;
        
        if (sizeX > 50 || sizeY > 50 || sizeZ > 50) {
            player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cArea too large! Maximum size is 50x50x50 blocks.").formatted(Formatting.RED), false);
            return false;
        }
        
        // Copy blocks
        Map<BlockPos, BlockData> copiedBlocks = new HashMap<>();
        
        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                for (int z = minZ; z <= maxZ; z++) {
                    BlockPos blockPos = new BlockPos(x, y, z);
                    BlockState blockState = world.getBlockState(blockPos);
                    
                    // Skip air blocks to save memory
                    if (!blockState.isAir()) {
                        BlockData blockData = new BlockData();
                        blockData.setBlockState(blockState);
                        
                        // Note: Block entity data copying is disabled due to API compatibility
                        // Only block states are copied for now
                        
                        // Calculate relative position from corner1
                        BlockPos relativePos = blockPos.subtract(corner1);
                        copiedBlocks.put(relativePos, blockData);
                    }
                }
            }
        }
        
        // Store the copied data
        selection.setCopiedBlocks(copiedBlocks);
        selection.setCorner1(corner1); // Store original corner for reference
        
        GreekMythologyMod.LOGGER.info("Copy Manager: Player {} copied {} blocks from area {} to {}", 
            player.getName().getString(), copiedBlocks.size(), corner1, corner2);
        
        return true;
    }
    
    /**
     * Paste blocks to the target location
     */
    private static boolean pasteArea(ServerPlayerEntity player, ServerWorld world, BlockPos targetPos, CopiedArea copiedArea) {
        Map<BlockPos, BlockData> copiedBlocks = copiedArea.getCopiedBlocks();
        
        if (copiedBlocks.isEmpty()) {
            return false;
        }
        
        // Check if destination area is clear (optional - could be made configurable)
        for (Map.Entry<BlockPos, BlockData> entry : copiedBlocks.entrySet()) {
            BlockPos relativePos = entry.getKey();
            BlockPos targetBlockPos = targetPos.add(relativePos);
            
            // Check if the target position is within world bounds
            if (!world.isInBuildLimit(targetBlockPos)) {
                player.sendMessage(Text.literal("§b§l[Copy Stick] §r§cCannot paste outside world bounds.").formatted(Formatting.RED), false);
                return false;
            }
        }
        
        // Paste blocks
        int pastedCount = 0;
        for (Map.Entry<BlockPos, BlockData> entry : copiedBlocks.entrySet()) {
            BlockPos relativePos = entry.getKey();
            BlockPos targetBlockPos = targetPos.add(relativePos);
            BlockData blockData = entry.getValue();
            
            // Set the block
            world.setBlockState(targetBlockPos, blockData.getBlockState());
            
            // Note: Block entity data restoration is disabled due to API compatibility
            
            pastedCount++;
        }
        
        // Update the world
        world.updateNeighbors(targetPos, Blocks.AIR);
        
        GreekMythologyMod.LOGGER.info("Copy Manager: Player {} pasted {} blocks at {}", 
            player.getName().getString(), pastedCount, targetPos);
        
        return true;
    }
    
    /**
     * Format position for display
     */
    private static String formatPosition(BlockPos pos) {
        return String.format("(%d, %d, %d)", pos.getX(), pos.getY(), pos.getZ());
    }
    
    /**
     * Get copied area for a player
     */
    public static CopiedArea getCopiedArea(UUID playerId) {
        return playerCopiedAreas.get(playerId);
    }
    
    /**
     * Clear copied area for a player
     */
    public static void clearCopiedArea(UUID playerId) {
        playerCopiedAreas.remove(playerId);
    }
}
