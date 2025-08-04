package com.example.greekmyth.jail;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SimpleJailManager {
    
    // Cell coordinates (center of each cell) in overworld
    private static final Map<Integer, BlockPos> CELL_COORDINATES = new HashMap<>();
    private static final Map<Integer, BlockPos> ADMIN_CHEST_COORDINATES = new HashMap<>();
    
    // Track jailed players
    private static final Map<UUID, Integer> JAILED_PLAYERS = new HashMap<>();
    
    static {
        // Initialize cell coordinates (using overworld coordinates) - closer to spawn for testing
        CELL_COORDINATES.put(1, new BlockPos(100, 64, 100));
        CELL_COORDINATES.put(2, new BlockPos(110, 64, 100));
        CELL_COORDINATES.put(3, new BlockPos(120, 64, 100));
        CELL_COORDINATES.put(4, new BlockPos(130, 64, 100));
        CELL_COORDINATES.put(5, new BlockPos(140, 64, 100));
        
        // Initialize admin chest coordinates
        ADMIN_CHEST_COORDINATES.put(1, new BlockPos(100, 64, 80));
        ADMIN_CHEST_COORDINATES.put(2, new BlockPos(101, 64, 80));
        ADMIN_CHEST_COORDINATES.put(3, new BlockPos(102, 64, 80));
        ADMIN_CHEST_COORDINATES.put(4, new BlockPos(103, 64, 80));
        ADMIN_CHEST_COORDINATES.put(5, new BlockPos(104, 64, 80));
    }
    
    /**
     * Jail a player in the specified cell
     */
    public static boolean jailPlayer(ServerPlayerEntity player, int cellNumber) {
        if (cellNumber < 1 || cellNumber > 5) {
            GreekMythologyMod.LOGGER.error("Invalid cell number: {}", cellNumber);
            return false;
        }
        
        // Get overworld
        ServerWorld world = player.getServer().getWorld(World.OVERWORLD);
        if (world == null) {
            GreekMythologyMod.LOGGER.error("Overworld not found!");
            return false;
        }
        
        // Store player's inventory in admin chest
        if (!storePlayerInventory(player, cellNumber, world)) {
            GreekMythologyMod.LOGGER.error("Failed to store inventory for player {}", player.getName().getString());
            return false;
        }
        
        // Clear player's inventory
        player.getInventory().clear();
        
        // Teleport player to cell center
        BlockPos cellPos = CELL_COORDINATES.get(cellNumber);
        if (cellPos == null) {
            GreekMythologyMod.LOGGER.error("No jail cell {} found! Use /setjail {} first.", cellNumber, cellNumber);
            player.sendMessage(net.minecraft.text.Text.literal("§cJail cell " + cellNumber + " not found! Admin must set it with /setjail " + cellNumber + " first."));
            return false;
        }
        Vec3d teleportPos = new Vec3d(cellPos.getX() + 0.5, cellPos.getY() + 1, cellPos.getZ() + 0.5);
        player.teleport(teleportPos.x, teleportPos.y, teleportPos.z, false);
        
        // Track jailed player
        JAILED_PLAYERS.put(player.getUuid(), cellNumber);
        
        // Send messages
        player.sendMessage(net.minecraft.text.Text.literal("§cYou have been jailed in Cell " + cellNumber + "!").formatted(net.minecraft.util.Formatting.RED));
        player.sendMessage(net.minecraft.text.Text.literal("§7Your items have been stored safely. Use /escape to get out.").formatted(net.minecraft.util.Formatting.GRAY));
        
        GreekMythologyMod.LOGGER.info("JAIL: {} jailed in cell {}", player.getName().getString(), cellNumber);
        return true;
    }
    
    /**
     * Store player's inventory in the admin chest
     */
    private static boolean storePlayerInventory(ServerPlayerEntity player, int cellNumber, ServerWorld world) {
        BlockPos chestPos = ADMIN_CHEST_COORDINATES.get(cellNumber);
        
        // Create chest if it doesn't exist
        if (world.getBlockState(chestPos).getBlock() != Blocks.CHEST) {
            GreekMythologyMod.LOGGER.info("Creating chest at admin position for cell {}", cellNumber);
            world.setBlockState(chestPos, Blocks.CHEST.getDefaultState());
        }
        
        // Get chest block entity
        if (!(world.getBlockEntity(chestPos) instanceof ChestBlockEntity chest)) {
            GreekMythologyMod.LOGGER.error("Chest block entity not found at admin position for cell {}", cellNumber);
            return false;
        }
        
        // Store inventory (simplified - just main inventory)
        for (int i = 0; i < player.getInventory().size(); i++) {
            ItemStack item = player.getInventory().getStack(i);
            if (!item.isEmpty()) {
                chest.setStack(i, item.copy());
            }
        }
        
        GreekMythologyMod.LOGGER.info("JAIL: Stored inventory for {} in admin chest {}", player.getName().getString(), cellNumber);
        return true;
    }
    
    /**
     * Check if a player is jailed
     */
    public static boolean isPlayerJailed(UUID playerUUID) {
        return JAILED_PLAYERS.containsKey(playerUUID);
    }
    
    /**
     * Get the cell number a player is jailed in
     */
    public static Integer getJailedCell(UUID playerUUID) {
        return JAILED_PLAYERS.get(playerUUID);
    }
    
    /**
     * Release a player from jail
     */
    public static boolean releasePlayer(UUID playerUUID) {
        if (!isPlayerJailed(playerUUID)) {
            return false;
        }
        
        JAILED_PLAYERS.remove(playerUUID);
        GreekMythologyMod.LOGGER.info("JAIL: Player {} released from jail", playerUUID);
        return true;
    }
    
    /**
     * Get cell coordinates
     */
    public static BlockPos getCellCoordinates(int cellNumber) {
        return CELL_COORDINATES.get(cellNumber);
    }
    
    /**
     * Get admin chest coordinates
     */
    public static BlockPos getAdminChestCoordinates(int cellNumber) {
        return ADMIN_CHEST_COORDINATES.get(cellNumber);
    }
    
    /**
     * Build the jail structure (cells and admin room)
     */
    public static void buildJailStructure(ServerWorld world) {
        GreekMythologyMod.LOGGER.info("Building jail structure...");
        
        // Build admin room with chests
        for (int i = 0; i < 5; i++) {
            BlockPos chestPos = new BlockPos(100 + i, 64, 80);
            world.setBlockState(chestPos, Blocks.CHEST.getDefaultState());
        }
        
        // Build jail cells (simple bedrock boxes)
        for (int cell = 1; cell <= 5; cell++) {
            BlockPos cellCenter = CELL_COORDINATES.get(cell);
            buildJailCell(world, cellCenter);
        }
        
        GreekMythologyMod.LOGGER.info("Jail structure built successfully");
    }
    
    /**
     * Build a single jail cell
     */
    private static void buildJailCell(ServerWorld world, BlockPos center) {
        // Build 5x5x4 bedrock cell
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                // Floor
                world.setBlockState(center.add(x, 0, z), Blocks.BEDROCK.getDefaultState());
                // Ceiling
                world.setBlockState(center.add(x, 4, z), Blocks.BEDROCK.getDefaultState());
            }
        }
        
        // Walls
        for (int y = 1; y <= 3; y++) {
            for (int x = -2; x <= 2; x++) {
                // North wall
                world.setBlockState(center.add(x, y, -2), Blocks.BEDROCK.getDefaultState());
                // South wall
                world.setBlockState(center.add(x, y, 2), Blocks.BEDROCK.getDefaultState());
            }
            for (int z = -2; z <= 2; z++) {
                // West wall
                world.setBlockState(center.add(-2, y, z), Blocks.BEDROCK.getDefaultState());
                // East wall
                world.setBlockState(center.add(2, y, z), Blocks.BEDROCK.getDefaultState());
            }
        }
        
        // Add iron bars in center of each wall
        world.setBlockState(center.add(0, 2, -2), Blocks.IRON_BARS.getDefaultState()); // North
        world.setBlockState(center.add(0, 2, 2), Blocks.IRON_BARS.getDefaultState());  // South
        world.setBlockState(center.add(-2, 2, 0), Blocks.IRON_BARS.getDefaultState()); // West
        world.setBlockState(center.add(2, 2, 0), Blocks.IRON_BARS.getDefaultState());  // East
    }
    
    /**
     * Return player's items from admin chest
     */
    public static boolean returnPlayerItems(ServerPlayerEntity player, int cellNumber) {
        ServerWorld world = player.getServer().getWorld(World.OVERWORLD);
        if (world == null) {
            return false;
        }
        
        BlockPos chestPos = ADMIN_CHEST_COORDINATES.get(cellNumber);
        
        if (!(world.getBlockEntity(chestPos) instanceof ChestBlockEntity chest)) {
            GreekMythologyMod.LOGGER.error("Chest not found for returning items to {}", player.getName().getString());
            return false;
        }
        
        // Return items to player
        for (int i = 0; i < chest.size(); i++) {
            ItemStack item = chest.getStack(i);
            if (!item.isEmpty()) {
                player.getInventory().offerOrDrop(item);
                chest.setStack(i, ItemStack.EMPTY);
            }
        }
        
        GreekMythologyMod.LOGGER.info("JAIL: Returned items to {}", player.getName().getString());
        return true;
    }
} 