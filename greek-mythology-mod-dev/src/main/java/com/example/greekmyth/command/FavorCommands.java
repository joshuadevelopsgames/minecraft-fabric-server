package com.example.greekmyth.command;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import com.example.greekmyth.entity.OracleRegistry;
import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.util.InfernoCommandTracker;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import com.example.greekmyth.entity.MerchantPiglinEntity;
import com.example.greekmyth.entity.GreekEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinEntity;

/**
 * Commands for the Greek Mythology mod
 */
public class FavorCommands {
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        GreekMythologyMod.LOGGER.info("Registering Greek Mythology commands...");
        
        // Register the /greekmyth list command to show all available commands
        dispatcher.register(CommandManager.literal("greekmyth")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    sendGreekMythCommandList(player);
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            })
            .then(CommandManager.literal("list")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        sendGreekMythCommandList(player);
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("spawnprotect")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        net.minecraft.item.ItemStack stick = new net.minecraft.item.ItemStack(GreekItems.SPAWN_PROTECT_STICK);
                        player.getInventory().insertStack(stick);
                        player.sendMessage(Text.literal("§6§l[Spawn Protect Stick] §r§aYou received a Spawn Protect Stick!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Left-click: first corner. Right-click: second corner. Full height & no size limit.").formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("STICK SPAWNPROTECT: Player {} received Spawn Protect Stick", player.getName().getString());
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            );
        

        
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
        
        // Register the /erase command to delete the nearest entity
        dispatcher.register(CommandManager.literal("erase")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    ServerWorld world = (ServerWorld) player.getWorld();
                    
                    // Find the nearest entity to the player
                    Entity nearestEntity = getNearestEntity(world, player);
                    
                    if (nearestEntity == null) {
                        player.sendMessage(Text.literal("§c❌ No entity found nearby!").formatted(Formatting.RED), false);
                        return 0;
                    }
                    
                    // Get entity position and distance for confirmation
                    String position = String.format("(%.1f, %.1f, %.1f)", 
                        nearestEntity.getX(), nearestEntity.getY(), nearestEntity.getZ());
                    double distance = Math.sqrt(player.squaredDistanceTo(nearestEntity));
                    String distanceText = String.format("%.1f blocks", distance);
                    String entityName = nearestEntity.getName().getString();
                    String entityType = nearestEntity.getType().toString();
                    
                    // Special handling for Oracle entities
                    if (nearestEntity instanceof OracleEntity oracle) {
                        OracleRegistry.removeSpecializedOracle(oracle.getX(), oracle.getY(), oracle.getZ());
                    }
                    
                    // Remove the entity
                    nearestEntity.remove(Entity.RemovalReason.KILLED);
                    
                    player.sendMessage(Text.literal("§a✅ Entity deleted successfully!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7Entity: " + entityName + " (" + entityType + ")").formatted(Formatting.GRAY), false);
                    player.sendMessage(Text.literal("§7Location: " + position + " (Distance: " + distanceText + ")").formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("ERASE COMMAND: Player {} deleted {} at {}", 
                        player.getName().getString(), entityType, position);
                    
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));

        // Register the /visit command family
        dispatcher.register(CommandManager.literal("visit")
            .then(CommandManager.literal("overworld")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        ServerWorld overworld = source.getServer().getOverworld();
                        if (overworld == null) {
                            source.sendMessage(Text.literal("§c❌ Overworld not available!").formatted(Formatting.RED));
                            return 0;
                        }
                        BlockPos spawnPos = overworld.getSpawnPos();
                        float spawnYaw = overworld.getSpawnAngle();
                        player.teleport(overworld,
                            spawnPos.getX() + 0.5,
                            spawnPos.getY(),
                            spawnPos.getZ() + 0.5,
                            java.util.Set.of(),
                            spawnYaw,
                            0.0f,
                            false);
                        player.sendMessage(Text.literal("§a§l[Teleport] §r§aTeleported to overworld spawn!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Position: " + spawnPos.getX() + ", " + spawnPos.getY() + ", " + spawnPos.getZ()).formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to overworld spawn at {}",
                            player.getName().getString(), spawnPos);
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("world")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        ServerWorld overworld = source.getServer().getWorld(World.OVERWORLD);
                        if (overworld == null) {
                            source.sendMessage(Text.literal("§c❌ Overworld not available!").formatted(Formatting.RED));
                            return 0;
                        }
                        BlockPos spawnPos = overworld.getSpawnPos();
                        float spawnYaw = overworld.getSpawnAngle();
                        player.teleport(overworld,
                            spawnPos.getX() + 0.5,
                            spawnPos.getY(),
                            spawnPos.getZ() + 0.5,
                            java.util.Set.of(),
                            spawnYaw,
                            0.0f,
                            false);
                        player.sendMessage(Text.literal("§a§l[Teleport] §r§aTeleported to world spawn!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Position: " + spawnPos.getX() + ", " + spawnPos.getY() + ", " + spawnPos.getZ()).formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to world spawn at {}",
                            player.getName().getString(), spawnPos);
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("nether")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        ServerWorld nether = source.getServer().getWorld(World.NETHER);
                        if (nether == null) {
                            source.sendMessage(Text.literal("§c❌ Nether not available!").formatted(Formatting.RED));
                            return 0;
                        }
                        BlockPos spawnPos = nether.getSpawnPos();
                        float spawnYaw = nether.getSpawnAngle();
                        player.teleport(nether,
                            spawnPos.getX() + 0.5,
                            spawnPos.getY(),
                            spawnPos.getZ() + 0.5,
                            java.util.Set.of(),
                            spawnYaw,
                            0.0f,
                            false);
                        player.sendMessage(Text.literal("§a§l[Teleport] §r§aTeleported to Nether spawn!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Position: " + spawnPos.getX() + ", " + spawnPos.getY() + ", " + spawnPos.getZ()).formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to nether spawn at {}",
                            player.getName().getString(), spawnPos);
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("end")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        ServerWorld end = source.getServer().getWorld(World.END);
                        if (end == null) {
                            source.sendMessage(Text.literal("§c❌ End not available!").formatted(Formatting.RED));
                            return 0;
                        }
                        // Use custom coordinates: 8 64 -0.3
                        double x = 8.0;
                        double y = 64.0;
                        double z = -0.3;
                        player.teleport(end,
                            x,
                            y,
                            z,
                            java.util.Set.of(),
                            0.0f,
                            0.0f,
                            false);
                        player.sendMessage(Text.literal("§a§l[Teleport] §r§aTeleported to End!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Position: " + x + ", " + y + ", " + z).formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to end at ({}, {}, {})",
                            player.getName().getString(), x, y, z);
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
        );
        
        // Register the /stick command to give Power Stick
        dispatcher.register(CommandManager.literal("stick")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    
                    // Give the player a Power Stick
                    net.minecraft.item.ItemStack powerStick = new net.minecraft.item.ItemStack(GreekItems.POWER_STICK);
                    player.getInventory().insertStack(powerStick);
                    
                    player.sendMessage(Text.literal("§6§l[Power Stick] §r§aYou received a Power Stick!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7Left-click a block to set the first corner.").formatted(Formatting.GRAY), false);
                    player.sendMessage(Text.literal("§7Right-click another block to set the second corner and create a protected zone.").formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("STICK COMMAND: Player {} received Power Stick", player.getName().getString());
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            })
            .then(CommandManager.literal("pvp")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        
                        // Give the player a No PvP Stick
                        net.minecraft.item.ItemStack noPvpStick = new net.minecraft.item.ItemStack(GreekItems.NO_PVP_STICK);
                        player.getInventory().insertStack(noPvpStick);
                        
                        player.sendMessage(Text.literal("§a§l[No PvP Stick] §r§aYou received a No PvP Stick!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Left-click a block to set the first corner.").formatted(Formatting.GRAY), false);
                        player.sendMessage(Text.literal("§7Right-click another block to set the second corner and create a No PvP zone.").formatted(Formatting.GRAY), false);
                        player.sendMessage(Text.literal("§7Zone will cover full height from bedrock to build limit.").formatted(Formatting.GRAY), false);
                        
                        GreekMythologyMod.LOGGER.info("STICK PVP COMMAND: Player {} received No PvP Stick", player.getName().getString());
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("spawnprotect")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        net.minecraft.item.ItemStack stick = new net.minecraft.item.ItemStack(GreekItems.SPAWN_PROTECT_STICK);
                        player.getInventory().insertStack(stick);
                        player.sendMessage(Text.literal("§6§l[Spawn Protect Stick] §r§aYou received a Spawn Protect Stick!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Left-click: first corner. Right-click: second corner. Full height & no size limit.").formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("STICK SPAWNPROTECT: Player {} received Spawn Protect Stick", player.getName().getString());
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("copy")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        net.minecraft.item.ItemStack stick = new net.minecraft.item.ItemStack(GreekItems.COPY_STICK);
                        player.getInventory().insertStack(stick);
                        player.sendMessage(Text.literal("§b§l[Copy Stick] §r§aYou received a Copy Stick!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Left-click: first corner. Right-click: second corner to copy.").formatted(Formatting.GRAY), false);
                        player.sendMessage(Text.literal("§7Shift + right-click to paste the copied area.").formatted(Formatting.GRAY), false);
                        GreekMythologyMod.LOGGER.info("STICK COPY: Player {} received Copy Stick", player.getName().getString());
                        return 1;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
        );
        
        // Register zone management commands
        dispatcher.register(CommandManager.literal("zones")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    com.example.greekmyth.zone.ZoneManager.listZones(player);
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            })
            .then(CommandManager.literal("here")
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    try {
                        ServerPlayerEntity player = source.getPlayerOrThrow();
                        BlockPos pos = BlockPos.ofFloored(source.getPosition());
                        boolean protectedHere = com.example.greekmyth.zone.ZoneManager.isBlockProtected(pos);
                        if (protectedHere) {
                            source.sendMessage(Text.literal("§6§l[Zones] §r§aThis block is PROTECTED at " + pos.toShortString()).formatted(Formatting.GREEN));
                        } else {
                            source.sendMessage(Text.literal("§6§l[Zones] §r§cThis block is NOT protected at " + pos.toShortString()).formatted(Formatting.RED));
                        }
                        String diag = com.example.greekmyth.zone.ZoneManager.explainProtectionAt(pos);
                        source.sendMessage(Text.literal("§7" + diag).formatted(Formatting.GRAY));
                        return protectedHere ? 1 : 0;
                    } catch (Exception e) {
                        source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                        return 0;
                    }
                }))
            .then(CommandManager.literal("reload")
                .requires(src -> src.hasPermissionLevel(4))
                .executes(context -> {
                    ServerCommandSource source = context.getSource();
                    int count = com.example.greekmyth.zone.ZoneManager.reloadZones();
                    source.sendMessage(Text.literal("§6§l[Zones] §r§aReloaded zones from disk: " + count + " zones.").formatted(Formatting.GREEN));
                    return count > 0 ? 1 : 0;
                }))
            .then(CommandManager.literal("remove")
                .then(CommandManager.argument("zone_id", StringArgumentType.string())
                    .executes(context -> {
                        ServerCommandSource source = context.getSource();
                        
                        try {
                            ServerPlayerEntity player = source.getPlayerOrThrow();
                            String zoneId = StringArgumentType.getString(context, "zone_id");
                            boolean success = com.example.greekmyth.zone.ZoneManager.removeZone(player, zoneId);
                            return success ? 1 : 0;
                        } catch (Exception e) {
                            source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                            return 0;
                        }
                    }))));
        
        // Register PvP zone management commands
        dispatcher.register(CommandManager.literal("pvpzones")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    com.example.greekmyth.pvp.PvpZoneManager.listPvpZones(player);
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            })
            .then(CommandManager.literal("remove")
                .then(CommandManager.argument("zone_id", StringArgumentType.string())
                    .executes(context -> {
                        ServerCommandSource source = context.getSource();
                        
                        try {
                            ServerPlayerEntity player = source.getPlayerOrThrow();
                            String zoneId = StringArgumentType.getString(context, "zone_id");
                            boolean success = com.example.greekmyth.pvp.PvpZoneManager.removePvpZone(player, zoneId);
                            return success ? 1 : 0;
                        } catch (Exception e) {
                            source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                            return 0;
                        }
                    }))));
        
        // Register the /testpvp command to check current PvP status
        dispatcher.register(CommandManager.literal("testpvp")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    BlockPos playerPos = player.getBlockPos();
                    
                    boolean inNoPvpZone = com.example.greekmyth.pvp.PvpZoneManager.isInNoPvpZone(playerPos);
                    
                    if (inNoPvpZone) {
                        player.sendMessage(Text.literal("§a§l[PvP Test] §r§aYou are in a No PvP zone!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7PvP is disabled here. You cannot attack.").formatted(Formatting.GRAY), false);
                    } else {
                        player.sendMessage(Text.literal("§c§l[PvP Test] §r§cYou are in a PvP zone!").formatted(Formatting.RED), false);
                        player.sendMessage(Text.literal("§7PvP is enabled here. You can attack.").formatted(Formatting.GRAY), false);
                    }
                    
                    player.sendMessage(Text.literal("§7Position: " + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ()).formatted(Formatting.GRAY), false);
                    
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
        
        // Register the /break command to disable zone protection
        dispatcher.register(CommandManager.literal("break")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    
                    // Check if player has permission (admin level 4 or higher)
                    if (!player.hasPermissionLevel(4)) {
                        player.sendMessage(Text.literal("§6§l[Zone Protection] §r§cYou don't have permission to use this command!").formatted(Formatting.RED), false);
                        return 0;
                    }
                    
                    // Disable zone protection
                    com.example.greekmyth.zone.ZoneManager.disableProtection();
                    
                    player.sendMessage(Text.literal("§6§l[Zone Protection] §r§aZone protection disabled!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7You can now break blocks in all protected zones.").formatted(Formatting.GRAY), false);
                    player.sendMessage(Text.literal("§7Use /unbreak to restore protection.").formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("BREAK COMMAND: Player {} disabled zone protection", player.getName().getString());
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
        
        // Register the /unbreak command to enable zone protection
        dispatcher.register(CommandManager.literal("unbreak")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    
                    // Check if player has permission (admin level 4 or higher)
                    if (!player.hasPermissionLevel(4)) {
                        player.sendMessage(Text.literal("§6§l[Zone Protection] §r§cYou don't have permission to use this command!").formatted(Formatting.RED), false);
                        return 0;
                    }
                    
                    // Enable zone protection
                    com.example.greekmyth.zone.ZoneManager.enableProtection();
                    
                    player.sendMessage(Text.literal("§6§l[Zone Protection] §r§aZone protection enabled!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7All protected zones are now active again.").formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("UNBREAK COMMAND: Player {} enabled zone protection", player.getName().getString());
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
        
        // Register the /protect command to check protection status
        dispatcher.register(CommandManager.literal("protect")
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    
                    boolean protectionEnabled = com.example.greekmyth.zone.ZoneManager.isProtectionEnabled();
                    int zoneCount = com.example.greekmyth.zone.ZoneManager.getAllZones().size();
                    
                    player.sendMessage(Text.literal("§6§l[Zone Protection] §r§eStatus:").formatted(Formatting.GOLD), false);
                    player.sendMessage(Text.literal("§7Protection: " + (protectionEnabled ? "§aENABLED" : "§cDISABLED")).formatted(Formatting.GRAY), false);
                    player.sendMessage(Text.literal("§7Active Zones: " + zoneCount).formatted(Formatting.GRAY), false);
                    
                    if (protectionEnabled) {
                        player.sendMessage(Text.literal("§7Use /break to disable protection.").formatted(Formatting.GRAY), false);
                    } else {
                        player.sendMessage(Text.literal("§7Use /unbreak to enable protection.").formatted(Formatting.GRAY), false);
                    }
                    
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
        
        // Register the /nametag command to give Oracle tags
        dispatcher.register(CommandManager.literal("nametag")
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
                            case "invisible":
                                tagItem = new ItemStack(GreekItems.INVISIBLE_NAMETAG);
                                displayName = "§7§lInvisible Nametag";
                                color = "§7";
                                break;
                            default:
                                player.sendMessage(Text.literal("§c❌ Unknown god: " + godName).formatted(Formatting.RED), false);
                                player.sendMessage(Text.literal("§7Available gods: zeus, poseidon, hades, ares, athena, hephaestus, apollo, artemis, hermes, dionysus, aphrodite, demeter, invisible").formatted(Formatting.GRAY), false);
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
        
        // Register merchant spawn command
        dispatcher.register(CommandManager.literal("spawnmerchant")
            .requires(source -> source.hasPermissionLevel(4))
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                // Check if source is a player first
                if (!(source.getEntity() instanceof ServerPlayerEntity)) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
                
                ServerPlayerEntity player = (ServerPlayerEntity) source.getEntity();
                
                try {
                    // Log attempt for debugging
                    GreekMythologyMod.LOGGER.info("SPAWNMERCHANT: Player {} attempting to spawn merchant at ({}, {}, {})", 
                        player.getName().getString(), player.getX(), player.getY(), player.getZ());
                    
                    // Check if player has permission
                    if (!player.hasPermissionLevel(4)) {
                        player.sendMessage(Text.literal("§c❌ You need operator permissions (level 4) to use this command!").formatted(Formatting.RED), false);
                        GreekMythologyMod.LOGGER.warn("SPAWNMERCHANT: Player {} lacks permission level 4", player.getName().getString());
                        return 0;
                    }
                    
                    // Spawn the custom merchant entity directly
                    MerchantPiglinEntity merchant = new MerchantPiglinEntity(GreekEntityTypes.MERCHANT_PIGLIN, player.getWorld());
                    merchant.setPosition(player.getX(), player.getY(), player.getZ());
                    
                    // Try to spawn the merchant
                    boolean spawned = player.getWorld().spawnEntity(merchant);
                    
                    if (spawned) {
                        player.sendMessage(Text.literal("§6§l[Merchant] §r§aDivine Merchant spawned successfully!").formatted(Formatting.GREEN), false);
                        player.sendMessage(Text.literal("§7Right-click the merchant to interact.").formatted(Formatting.GRAY), false);
                        
                        GreekMythologyMod.LOGGER.info("MERCHANT SPAWN: Player {} successfully spawned Divine Merchant at ({}, {}, {})", 
                            player.getName().getString(), player.getX(), player.getY(), player.getZ());
                        
                        return 1;
                    } else {
                        player.sendMessage(Text.literal("§c❌ Failed to spawn merchant - entity spawn failed!").formatted(Formatting.RED), false);
                        GreekMythologyMod.LOGGER.error("MERCHANT SPAWN: Failed to spawn merchant for player {} at ({}, {}, {})", 
                            player.getName().getString(), player.getX(), player.getY(), player.getZ());
                        return 0;
                    }
                    
                } catch (Exception e) {
                    // Log the specific exception for debugging
                    GreekMythologyMod.LOGGER.error("MERCHANT SPAWN: Exception occurred while spawning merchant for player {}: {}", 
                        player.getName().getString(), e.getMessage(), e);
                    
                    player.sendMessage(Text.literal("§c❌ Error spawning merchant: " + e.getMessage()).formatted(Formatting.RED), false);
                    return 0;
                }
            }));
        
        // Register the /resetinferno command to reset the inferno command for a new player
        dispatcher.register(CommandManager.literal("resetinferno")
            .requires(source -> source.hasPermissionLevel(4))
            .executes(context -> {
                ServerCommandSource source = context.getSource();
                
                try {
                    ServerPlayerEntity player = source.getPlayerOrThrow();
                    
                    // Check if player has permission (admin level 4 or higher)
                    if (!player.hasPermissionLevel(4)) {
                        player.sendMessage(Text.literal("§c❌ You need operator permissions (level 4) to use this command!").formatted(Formatting.RED), false);
                        return 0;
                    }
                    
                    // Reset the inferno command for a new player to claim
                    InfernoCommandTracker.resetForNewClaimer();
                    
                    player.sendMessage(Text.literal("§6§l[Inferno Command] §r§aReset successful!").formatted(Formatting.GREEN), false);
                    player.sendMessage(Text.literal("§7The /inferno command is now available for a new player to claim.").formatted(Formatting.GRAY), false);
                    player.sendMessage(Text.literal("§7Note: Players who have used it before cannot use it again.").formatted(Formatting.GRAY), false);
                    
                    GreekMythologyMod.LOGGER.info("RESET INFERNO: Player {} reset the inferno command for a new player to claim", player.getName().getString());
                    return 1;
                } catch (Exception e) {
                    source.sendMessage(Text.literal("§c❌ This command can only be used by players!").formatted(Formatting.RED));
                    return 0;
                }
            }));
    }

    // Helper method to send the command list
    private static void sendGreekMythCommandList(ServerPlayerEntity player) {
        player.sendMessage(Text.literal("§6§l=== GREEK MYTHOLOGY COMMANDS ===§r").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Quest System Commands
        player.sendMessage(Text.literal("§e§l📜 QUEST SYSTEM:").formatted(Formatting.YELLOW), false);
        player.sendMessage(Text.literal("§7/quest clear §8- Clear your current quest").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/quest select §8- Show quest selection menu").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/quest select <god> §8- Get a specific god's quest").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Oracle Management Commands
        player.sendMessage(Text.literal("§b§l🔮 ORACLE MANAGEMENT:").formatted(Formatting.AQUA), false);
        player.sendMessage(Text.literal("§7/erase §8- Delete the nearest entity").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/nametag <god> §8- Get Oracle tag for specific god").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/nametag invisible §8- Get invisible nametag (prevents mob despawning)").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7§8Available gods: zeus, poseidon, hades, ares, athena, hephaestus, apollo, artemis, hermes, dionysus, aphrodite, demeter, invisible").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Zone Protection Commands
        player.sendMessage(Text.literal("§6§l🛡️ ZONE PROTECTION:").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§7/stick §8- Get Power Stick for zone protection").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/zones §8- List all protected zones").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/zones remove <zone_id> §8- Remove a protected zone").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/protect §8- Check zone protection status").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // PvP Zone Commands
        player.sendMessage(Text.literal("§a§l⚔️ PVP ZONES:").formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7/stick pvp §8- Get No PvP Stick for safe zones").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/pvpzones §8- List all No PvP zones").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/pvpzones remove <zone_id> §8- Remove a No PvP zone").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/testpvp §8- Check your current PvP zone status").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Admin Commands (Level 4+)
        player.sendMessage(Text.literal("§c§l👑 ADMIN COMMANDS (Level 4+):").formatted(Formatting.RED), false);
        player.sendMessage(Text.literal("§7/break §8- Disable all zone protection globally").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/unbreak §8- Re-enable all zone protection").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/resetinferno §8- Reset /inferno command for new player to claim").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Teleportation Commands
        player.sendMessage(Text.literal("§d§l🌍 TELEPORTATION:").formatted(Formatting.LIGHT_PURPLE), false);
        player.sendMessage(Text.literal("§7/visit overworld §8- Teleport to Overworld spawn").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/visit world §8- Teleport to world spawn").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/visit nether §8- Teleport to Nether spawn").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/visit end §8- Teleport to End spawn").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Jail System Commands
        player.sendMessage(Text.literal("§5§l🔒 JAIL SYSTEM:").formatted(Formatting.DARK_PURPLE), false);
        player.sendMessage(Text.literal("§7/jail <player> §8- Send player to jail").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/setjail §8- Set your current position as jail spawn").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/escape §8- Try to escape from jail").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Merchant Commands
        player.sendMessage(Text.literal("§6§l💰 MERCHANT:").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§7/spawnmerchant §8- Spawn Divine Merchant (Admin)").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Utility Commands
        player.sendMessage(Text.literal("§f§l🛠️ UTILITY:").formatted(Formatting.WHITE), false);
        player.sendMessage(Text.literal("§7/spawnenhanced §8- Enhanced mob spawning").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/soul §8- Soul collection system").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/greekversion §8- Check mod version").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7/help §8- Show help information").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        // Easter Egg Commands
        player.sendMessage(Text.literal("§6§l🎁 EASTER EGGS:").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7§oUse /greekmyth list to see this help again").formatted(Formatting.GRAY), false);
    }
    


    
    /**
     * Get the nearest entity to a player
     */
    private static Entity getNearestEntity(ServerWorld world, net.minecraft.entity.player.PlayerEntity player) {
        Entity nearestEntity = null;
        double nearestDistance = Double.MAX_VALUE;
        
        // Find the nearest entity by iterating through all loaded entities
        for (Entity entity : world.iterateEntities()) {
            // Skip the player themselves
            if (entity == player) {
                continue;
            }
            
            // Skip entities that are too far away (optional - you can remove this if you want to find entities at any distance)
            double distance = player.squaredDistanceTo(entity);
            if (distance > 10000) { // 100 blocks squared
                continue;
            }
            
            if (distance < nearestDistance) {
                nearestDistance = distance;
                nearestEntity = entity;
            }
        }
        
        return nearestEntity;
    }
}
