package com.example.greekmyth.command;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.util.InfernoCommandTracker;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.entity.Entity;
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
                }))
            .then(CommandManager.literal("select")
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
                        
                        // Show available quest options
                        oracle.showQuestSelection(player);
                        
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                })
                .then(CommandManager.argument("god", StringArgumentType.string())
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
                            
                            String godName = StringArgumentType.getString(context, "god");
                            oracle.giveSpecificGodQuest(player, godName);
                            
                            return 1;
                        } catch (Exception e) {
                            source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                            return 0;
                        }
                                            }))));
        
        // Register the /erase command to delete the nearest Oracle
        dispatcher.register(CommandManager.literal("erase")
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
                    
                    // Get Oracle position for confirmation
                    String position = String.format("(%.1f, %.1f, %.1f)", 
                        oracle.getX(), oracle.getY(), oracle.getZ());
                    
                    // Remove the Oracle entity
                    oracle.remove(Entity.RemovalReason.KILLED);
                    
                    player.sendMessage(Text.literal("§a✅ Oracle deleted successfully!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7Location: " + position).formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("ERASE COMMAND: Player {} deleted Oracle at {}", 
                        player.getName().getString(), position);
                    
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
        
        // Register the /tag command to give Oracle tags
        dispatcher.register(CommandManager.literal("tag")
            .then(CommandManager.argument("god", StringArgumentType.string())
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        String godName = StringArgumentType.getString(context, "god").toLowerCase();
                        
                        ItemStack tagItem = null;
                        String displayName = "";
                        String color = "";
                        
                        // Determine which tag to give based on god name
                        switch (godName) {
                            case "zeus":
                                tagItem = new ItemStack(GreekItems.ZEUS_ORACLE_TAG);
                                displayName = "§e§lZeus Oracle Tag";
                                color = "§e";
                                break;
                            case "poseidon":
                                tagItem = new ItemStack(GreekItems.POSEIDON_ORACLE_TAG);
                                displayName = "§b§lPoseidon Oracle Tag";
                                color = "§b";
                                break;
                            case "hades":
                                tagItem = new ItemStack(GreekItems.HADES_ORACLE_TAG);
                                displayName = "§5§lHades Oracle Tag";
                                color = "§5";
                                break;
                            case "ares":
                                tagItem = new ItemStack(GreekItems.ARES_ORACLE_TAG);
                                displayName = "§c§lAres Oracle Tag";
                                color = "§c";
                                break;
                            case "athena":
                                tagItem = new ItemStack(GreekItems.ATHENA_ORACLE_TAG);
                                displayName = "§7§lAthena Oracle Tag";
                                color = "§7";
                                break;
                            case "hephaestus":
                                tagItem = new ItemStack(GreekItems.HEPHAESTUS_ORACLE_TAG);
                                displayName = "§6§lHephaestus Oracle Tag";
                                color = "§6";
                                break;
                            case "apollo":
                                tagItem = new ItemStack(GreekItems.APOLLO_ORACLE_TAG);
                                displayName = "§e§lApollo Oracle Tag";
                                color = "§e";
                                break;
                            case "artemis":
                                tagItem = new ItemStack(GreekItems.ARTEMIS_ORACLE_TAG);
                                displayName = "§a§lArtemis Oracle Tag";
                                color = "§a";
                                break;
                            case "hermes":
                                tagItem = new ItemStack(GreekItems.HERMES_ORACLE_TAG);
                                displayName = "§b§lHermes Oracle Tag";
                                color = "§b";
                                break;
                            case "dionysus":
                                tagItem = new ItemStack(GreekItems.DIONYSUS_ORACLE_TAG);
                                displayName = "§d§lDionysus Oracle Tag";
                                color = "§d";
                                break;
                            case "aphrodite":
                                tagItem = new ItemStack(GreekItems.APHRODITE_ORACLE_TAG);
                                displayName = "§d§lAphrodite Oracle Tag";
                                color = "§d";
                                break;
                            case "demeter":
                                tagItem = new ItemStack(GreekItems.DEMETER_ORACLE_TAG);
                                displayName = "§6§lDemeter Oracle Tag";
                                color = "§6";
                                break;

                            default:
                                player.sendMessage(Text.literal("§c❌ Unknown god: " + godName).formatted(Formatting.RED), false);
                                player.sendMessage(Text.literal("§7Available gods: zeus, poseidon, hades, ares, athena, hephaestus, apollo, artemis, hermes, dionysus, aphrodite, demeter").formatted(Formatting.GRAY), false);
                                return 0;
                        }
                        
                        // Note: Custom name will be set by the item itself
                        
                        // Give the item to the player
                        player.getInventory().insertStack(tagItem);
                        
                        player.sendMessage(Text.literal(color + "✅ You received a " + displayName + color + "!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Right-click an Oracle with this tag to make it serve " + godName + ".").formatted(Formatting.GRAY), false);
                        
                        GreekMythologyMod.LOGGER.info("TAG COMMAND: Player {} received Oracle tag for god: {}", 
                            player.getName().getString(), godName);
                        
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                })));
        
        GreekMythologyMod.LOGGER.info("Greek Mythology commands registered successfully!");
    }
}
