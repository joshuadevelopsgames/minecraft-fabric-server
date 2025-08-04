package com.example.greekmyth.command;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.util.InfernoCommandTracker;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * Commands for the Greek Mythology mod
 */
public class FavorCommands {
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        GreekMythologyMod.LOGGER.info("Registering Greek Mythology commands...");
        
        // Register the /inferno Easter egg command (hidden from help)
        dispatcher.register(CommandManager.literal("inferno")
            // NO .requires() - allows all players to use it
            // NO .then() with help - keeps it hidden from tab completion
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                // Allow any player to use this command (not just ops)
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    String playerName = player.getName().getString();
                    
                    GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} attempted to use /inferno", playerName);
                    
                    // Check if player can use the command
                    if (!InfernoCommandTracker.canUseInferno(playerName)) {
                        player.sendMessage(Text.literal("§c❌ This Easter egg has already been claimed by another player! §7(You're too late)")
                            .formatted(Formatting.RED), false);
                        return 0;
                    }
                    
                    // Mark the command as used
                    InfernoCommandTracker.markUsed(playerName);
                    
                    // Give 32 inferno pearls
                    ItemStack infernoPearls = new ItemStack(GreekItems.INFERNO_PEARL, 32);
                    player.getInventory().offerOrDrop(infernoPearls);
                    
                    // Special message for Kangarude (testing)
                    if ("Kangarude".equals(playerName)) {
                        player.sendMessage(Text.literal("§6🔥 INFERNO COMMAND (TESTING) 🔥")
                            .formatted(Formatting.GOLD), false);
                        player.sendMessage(Text.literal("§eYou received 32 Inferno Pearls for testing the Easter egg!")
                            .formatted(Formatting.YELLOW), false);
                        GreekMythologyMod.LOGGER.info("INFERNO COMMAND: {} used command for testing", playerName);
                    } else {
                        // Special message for the lucky player
                        player.sendMessage(Text.literal("§6✨ CONGRATULATIONS! ✨")
                            .formatted(Formatting.GOLD), false);
                        player.sendMessage(Text.literal("§eYou found the secret §6/inferno §ecommand!")
                            .formatted(Formatting.YELLOW), false);
                        player.sendMessage(Text.literal("§eYou are the first player to discover this Easter egg!")
                            .formatted(Formatting.YELLOW), false);
                        player.sendMessage(Text.literal("§eYou received §632 Inferno Pearls §eas your reward!")
                            .formatted(Formatting.YELLOW), false);
                        player.sendMessage(Text.literal("§7This command can only be used once by one player.")
                            .formatted(Formatting.GRAY), false);
                        
                        GreekMythologyMod.LOGGER.info("INFERNO COMMAND: 🎉 EASTER EGG CLAIMED! {} found the secret command!", playerName);
                    }
                    
                    return 1;
                } catch (Exception e) {
                    // If not a player (console), silently fail
                    return 0;
                }
            }));
        
        // Register the /quest clear command
        dispatcher.register(CommandManager.literal("quest")
            .then(CommandManager.literal("clear")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        ServerWorld world = (ServerWorld) player.getWorld();
                        
                        // Find the Oracle entity
                        OracleEntity oracle = OracleEntity.getOracleEntity(world);
                        
                        if (oracle == null) {
                            player.sendMessage(Text.literal("§c❌ No Oracle found in this world!").formatted(Formatting.RED), false);
                            return 0;
                        }
                        
                        // Clear the player's quest
                        oracle.clearQuest(player);
                        
                        player.sendMessage(Text.literal("§a✅ Quest cleared successfully!").formatted(Formatting.GREEN), false);
                        
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                })));
        
        GreekMythologyMod.LOGGER.info("Greek Mythology commands registered successfully!");
    }
}
