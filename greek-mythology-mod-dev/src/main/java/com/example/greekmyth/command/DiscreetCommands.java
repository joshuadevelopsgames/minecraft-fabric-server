package com.example.greekmyth.command;

import com.example.greekmyth.GreekMythologyMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

/**
 * Commands for discreet item giving that don't show operator logs
 */
public class DiscreetCommands {
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("gift")
            .requires(source -> source.hasPermissionLevel(2)) // Admin level required
            .then(argument("player", StringArgumentType.word())
                .then(argument("item", StringArgumentType.word())
                    .then(argument("count", IntegerArgumentType.integer(1, 64))
                        .executes(context -> {
                            String playerName = StringArgumentType.getString(context, "player");
                            String itemName = StringArgumentType.getString(context, "item");
                            int count = IntegerArgumentType.getInteger(context, "count");
                            return giveItemDiscreetly(context.getSource(), playerName, itemName, count);
                        })))));
    }
    
    private static int giveItemDiscreetly(ServerCommandSource source, String playerName, String itemName, int count) {
        try {
            // Find the player
            ServerPlayerEntity targetPlayer = null;
            for (ServerPlayerEntity player : source.getServer().getPlayerManager().getPlayerList()) {
                if (player.getName().getString().equalsIgnoreCase(playerName)) {
                    targetPlayer = player;
                    break;
                }
            }
            
            if (targetPlayer == null) {
                source.sendMessage(Text.literal("Player not found: " + playerName).formatted(Formatting.RED));
                return 0;
            }
            
            // Get the item
            ItemStack itemStack = getItemStack(itemName, count);
            if (itemStack == null) {
                source.sendMessage(Text.literal("Invalid item: " + itemName).formatted(Formatting.RED));
                source.sendMessage(Text.literal("Examples: oak_boat, diamond_sword, bread, etc.").formatted(Formatting.GRAY));
                return 0;
            }
            
            // Give the item directly to player inventory (no logging)
            boolean success = targetPlayer.getInventory().insertStack(itemStack);
            
            if (success) {
                // Send private message to the giver (only they see this)
                source.sendMessage(Text.literal("✓ Gifted " + count + "x " + itemName + " to " + playerName).formatted(Formatting.GREEN));
                
                // Send private message to the receiver
                targetPlayer.sendMessage(Text.literal("You received a gift: " + count + "x " + itemName).formatted(Formatting.GOLD));
                
                // Log to mod log (not server log)
                GreekMythologyMod.LOGGER.info("DISCREET GIFT: {} gave {}x {} to {}", 
                    source.getName(), count, itemName, playerName);
                
                return 1;
            } else {
                source.sendMessage(Text.literal("Failed to give item - inventory might be full").formatted(Formatting.RED));
                return 0;
            }
            
        } catch (Exception e) {
            source.sendMessage(Text.literal("Error: " + e.getMessage()).formatted(Formatting.RED));
            GreekMythologyMod.LOGGER.error("Error in discreet gift command", e);
            return 0;
        }
    }
    
    private static ItemStack getItemStack(String itemName, int count) {
        try {
            // Handle common item names
            String normalizedName = itemName.toLowerCase().replace(" ", "_");
            
            // Map common names to actual item IDs
            switch (normalizedName) {
                case "boat":
                case "oak_boat":
                    return new ItemStack(Items.OAK_BOAT, count);
                case "diamond_sword":
                    return new ItemStack(Items.DIAMOND_SWORD, count);
                case "bread":
                    return new ItemStack(Items.BREAD, count);
                case "apple":
                    return new ItemStack(Items.APPLE, count);
                case "steak":
                    return new ItemStack(Items.COOKED_BEEF, count);
                case "cooked_beef":
                    return new ItemStack(Items.COOKED_BEEF, count);
                case "diamond":
                    return new ItemStack(Items.DIAMOND, count);
                case "gold":
                    return new ItemStack(Items.GOLD_INGOT, count);
                case "iron":
                    return new ItemStack(Items.IRON_INGOT, count);
                case "emerald":
                    return new ItemStack(Items.EMERALD, count);
                case "torch":
                    return new ItemStack(Items.TORCH, count);
                case "water_bucket":
                    return new ItemStack(Items.WATER_BUCKET, count);
                case "lava_bucket":
                    return new ItemStack(Items.LAVA_BUCKET, count);
                case "fishing_rod":
                    return new ItemStack(Items.FISHING_ROD, count);
                case "bow":
                    return new ItemStack(Items.BOW, count);
                case "arrow":
                    return new ItemStack(Items.ARROW, count);
                case "shield":
                    return new ItemStack(Items.SHIELD, count);
                case "helmet":
                case "diamond_helmet":
                    return new ItemStack(Items.DIAMOND_HELMET, count);
                case "chestplate":
                case "diamond_chestplate":
                    return new ItemStack(Items.DIAMOND_CHESTPLATE, count);
                case "leggings":
                case "diamond_leggings":
                    return new ItemStack(Items.DIAMOND_LEGGINGS, count);
                case "boots":
                case "diamond_boots":
                    return new ItemStack(Items.DIAMOND_BOOTS, count);
                default:
                    // Try to get from registry
                    Identifier itemId = Identifier.of("minecraft", normalizedName);
                    if (Registries.ITEM.containsId(itemId)) {
                        return new ItemStack(Registries.ITEM.get(itemId), count);
                    }
                    return null;
            }
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Error creating item stack for: " + itemName, e);
            return null;
        }
    }
} 