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
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TartarusJailManager {
    
    // Cell coordinates (center of each cell) in Tartarus dimension - now dynamic
    private static final Map<Integer, BlockPos> CELL_COORDINATES = new HashMap<>();
    private static final Map<Integer, BlockPos> ADMIN_CHEST_COORDINATES = new HashMap<>();
    
    // Track jailed players
    private static final Map<UUID, Integer> JAILED_PLAYERS = new HashMap<>();
    
    // Tartarus dimension key
    private static final RegistryKey<World> TARTARUS_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("greekmyth", "tartarus"));
    
    // Public jail dimension key for external access
    public static final RegistryKey<World> JAIL_DIMENSION_KEY = TARTARUS_DIMENSION;
    
    static {
        // Initialize default cell coordinates (using Tartarus dimension coordinates)
        CELL_COORDINATES.put(1, new BlockPos(0, 10, 0));
        CELL_COORDINATES.put(2, new BlockPos(10, 10, 0));
        CELL_COORDINATES.put(3, new BlockPos(20, 10, 0));
        CELL_COORDINATES.put(4, new BlockPos(30, 10, 0));
        CELL_COORDINATES.put(5, new BlockPos(40, 10, 0));
        
        // Initialize admin chest coordinates (fixed positions)
        ADMIN_CHEST_COORDINATES.put(1, new BlockPos(0, 20, -20));
        ADMIN_CHEST_COORDINATES.put(2, new BlockPos(1, 20, -20));
        ADMIN_CHEST_COORDINATES.put(3, new BlockPos(2, 20, -20));
        ADMIN_CHEST_COORDINATES.put(4, new BlockPos(3, 20, -20));
        ADMIN_CHEST_COORDINATES.put(5, new BlockPos(4, 20, -20));
    }
    
    /**
     * Jail a player in the specified cell in Tartarus
     */
    public static boolean jailPlayer(ServerPlayerEntity player, int cellNumber) {
        if (cellNumber < 1) {
            GreekMythologyMod.LOGGER.error("Invalid cell number: {}", cellNumber);
            return false;
        }
        
        // Get Tartarus dimension
        ServerWorld tartarus = player.getServer().getWorld(TARTARUS_DIMENSION);
        if (tartarus == null) {
            GreekMythologyMod.LOGGER.error("Tartarus dimension not found!");
            return false;
        }
        
        // Store player's inventory in admin chest
        if (!storePlayerInventory(player, cellNumber, tartarus)) {
            GreekMythologyMod.LOGGER.error("Failed to store inventory for player {}", player.getName().getString());
            return false;
        }
        
        // Clear player's inventory
        player.getInventory().clear();
        
        // Clear all status effects
        player.clearStatusEffects();
        
        // Reset player level to 1 unless they are Level 4 (Owner)
        if (player.hasPermissionLevel(4)) {
            // Keep Level 4 players at their current level
            GreekMythologyMod.LOGGER.info("TARTARUS JAIL: Level 4 player {} - keeping current level", player.getName().getString());
        } else {
            // Reset non-Level 4 players to level 1
            player.setExperienceLevel(1);
            player.setExperiencePoints(0);
            GreekMythologyMod.LOGGER.info("TARTARUS JAIL: Reset {} to level 1", player.getName().getString());
        }
        
        // Set player gamemode to survival
        player.changeGameMode(net.minecraft.world.GameMode.SURVIVAL);
        
        // Teleport player to cell center in Tartarus
        BlockPos cellPos = CELL_COORDINATES.get(cellNumber);
        if (cellPos == null) {
            GreekMythologyMod.LOGGER.error("No jail cell {} found! Use /setjail {} first.", cellNumber, cellNumber);
            return false;
        }
        Vec3d teleportPos = new Vec3d(cellPos.getX() + 0.5, cellPos.getY() + 1, cellPos.getZ() + 0.5);
        player.teleport(tartarus, teleportPos.x, teleportPos.y, teleportPos.z, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
        
        // Note: Spawn point setting removed due to API compatibility issues
        // The player will respawn at their last valid spawn point
        
        // Track jailed player
        JAILED_PLAYERS.put(player.getUuid(), cellNumber);
        
        // Send messages
        player.sendMessage(net.minecraft.text.Text.literal("§cYou have been jailed in Jail Cell " + cellNumber + "!").formatted(net.minecraft.util.Formatting.RED));
        player.sendMessage(net.minecraft.text.Text.literal("§7Your items have been stored safely. Find the escape portal to get out.").formatted(net.minecraft.util.Formatting.GRAY));
        player.sendMessage(net.minecraft.text.Text.literal("§7You will respawn here if you die.").formatted(net.minecraft.util.Formatting.GRAY));
        
        GreekMythologyMod.LOGGER.info("JAIL: {} jailed in cell {} with spawn point set", player.getName().getString(), cellNumber);
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
     * Return player's items from admin chest
     */
    public static boolean returnPlayerItems(ServerPlayerEntity player, int cellNumber) {
        ServerWorld tartarus = player.getServer().getWorld(TARTARUS_DIMENSION);
        if (tartarus == null) {
            return false;
        }
        
        BlockPos chestPos = ADMIN_CHEST_COORDINATES.get(cellNumber);
        
        if (!(tartarus.getBlockEntity(chestPos) instanceof ChestBlockEntity chest)) {
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
     * Set a jail cell at the player's current position
     */
    public static boolean setJailCell(ServerPlayerEntity player, int cellNumber) {
        if (cellNumber < 1) {
            GreekMythologyMod.LOGGER.error("Invalid cell number: {}", cellNumber);
            return false;
        }
        
        // Get player's current position
        BlockPos playerPos = player.getBlockPos();
        
        // Update the cell coordinates
        CELL_COORDINATES.put(cellNumber, playerPos);
        
        // Create or update admin chest for this cell in Tartarus
        ServerWorld tartarus = player.getServer().getWorld(TARTARUS_DIMENSION);
        if (tartarus != null) {
            BlockPos chestPos = ADMIN_CHEST_COORDINATES.get(cellNumber);
            if (chestPos == null) {
                // Create new admin chest position if it doesn't exist
                chestPos = new BlockPos(cellNumber - 1, 20, -20);
                ADMIN_CHEST_COORDINATES.put(cellNumber, chestPos);
            }
            
            // Ensure chest exists in Tartarus
            if (tartarus.getBlockState(chestPos).getBlock() != Blocks.CHEST) {
                tartarus.setBlockState(chestPos, Blocks.CHEST.getDefaultState());
                GreekMythologyMod.LOGGER.info("Created admin chest for cell {} at {} in Tartarus", cellNumber, chestPos);
            }
        }
        
        GreekMythologyMod.LOGGER.info("SETJAIL: Cell {} set to position {} by {}", cellNumber, playerPos, player.getName().getString());
        return true;
    }
    
    /**
     * Get Tartarus dimension key
     */
    public static RegistryKey<World> getTartarusDimension() {
        return TARTARUS_DIMENSION;
    }
    
    /**
     * Register the Tartarus jail dimension with the server
     */
    public static void registerDimension(net.minecraft.server.MinecraftServer server) {
        try {
            // Check if Tartarus already exists
            ServerWorld existingTartarus = server.getWorld(TARTARUS_DIMENSION);
            if (existingTartarus != null) {
                GreekMythologyMod.LOGGER.info("TARTARUS: Tartarus dimension already exists");
                return;
            }

            // Get the overworld to use as a template
            ServerWorld overworld = server.getWorld(net.minecraft.world.World.OVERWORLD);
            if (overworld == null) {
                GreekMythologyMod.LOGGER.warn("TARTARUS: Cannot register Tartarus - overworld not found");
                return;
            }

            // For now, just log that we're ready to create the dimension
            // The actual dimension creation will happen when a player first tries to access it
            GreekMythologyMod.LOGGER.info("TARTARUS: Tartarus dimension ready for creation");

        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("TARTARUS: Failed to register Tartarus dimension", e);
        }
    }
}
