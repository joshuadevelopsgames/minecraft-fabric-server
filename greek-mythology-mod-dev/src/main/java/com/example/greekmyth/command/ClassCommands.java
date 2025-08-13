package com.example.greekmyth.command;

import com.example.greekmyth.classsystem.PlayerClass;
import com.example.greekmyth.classsystem.GodParent;
import com.example.greekmyth.classsystem.ClassTier;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Commands for managing player classes and god parent selection
 * These were part of AI Mythology and are now integrated into Greek Mythology
 */
public class ClassCommands {
    private static final Logger LOGGER = LoggerFactory.getLogger("ClassCommands");
    
    // In-memory storage for player classes (in a real implementation, this would be persistent)
    private static final Map<UUID, PlayerClass> playerClasses = new HashMap<>();
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        LOGGER.info("Registering class management commands...");
        
        // /choosezeus - Choose Zeus as god parent
        dispatcher.register(CommandManager.literal("choosezeus")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.ZEUS);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseposeidon - Choose Poseidon as god parent
        dispatcher.register(CommandManager.literal("chooseposeidon")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.POSEIDON);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /choosehades - Choose Hades as god parent
        dispatcher.register(CommandManager.literal("choosehades")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.HADES);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseathena - Choose Athena as god parent
        dispatcher.register(CommandManager.literal("chooseathena")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.ATHENA);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseares - Choose Ares as god parent
        dispatcher.register(CommandManager.literal("chooseares")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.ARES);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseapollo - Choose Apollo as god parent
        dispatcher.register(CommandManager.literal("chooseapollo")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.APOLLO);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseartemis - Choose Artemis as god parent
        dispatcher.register(CommandManager.literal("chooseartemis")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.ARTEMIS);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /choosehermes - Choose Hermes as god parent
        dispatcher.register(CommandManager.literal("choosehermes")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.HERMES);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /choosehephaestus - Choose Hephaestus as god parent
        dispatcher.register(CommandManager.literal("choosehephaestus")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.HEPHAESTUS);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /chooseaphrodite - Choose Aphrodite as god parent
        dispatcher.register(CommandManager.literal("chooseaphrodite")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.APHRODITE);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /choosedemeter - Choose Demeter as god parent
        dispatcher.register(CommandManager.literal("choosedemeter")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.DEMETER);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /choosedionysus - Choose Dionysus as god parent
        dispatcher.register(CommandManager.literal("choosedionysus")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return chooseGodParent(player, GodParent.DIONYSUS);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /class - Show your current class information
        dispatcher.register(CommandManager.literal("class")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return showClass(context.getSource(), player);
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));
        
        // /class reset - Reset your class (requires permission level 3)
        dispatcher.register(CommandManager.literal("class")
            .then(CommandManager.literal("reset")
                .requires(source -> source.hasPermissionLevel(3))
                .executes(context -> {
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    if (player != null) {
                        return resetClass(context.getSource(), player);
                    }
                    context.getSource().sendError(Text.literal("This command can only be used by a player."));
                    return 0;
                })));
        
        // /class clear - Clear your class (requires permission level 3)
        dispatcher.register(CommandManager.literal("class")
            .then(CommandManager.literal("clear")
                .requires(source -> source.hasPermissionLevel(3))
                .executes(context -> {
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    if (player != null) {
                        return clearClass(context.getSource(), player);
                    }
                    context.getSource().sendError(Text.literal("This command can only be used by a player."));
                    return 0;
                })));
        
        // /class level <level> - Set your class level (requires permission level 3)
        dispatcher.register(CommandManager.literal("class")
            .then(CommandManager.literal("level")
                .requires(source -> source.hasPermissionLevel(3))
                .then(CommandManager.argument("level", IntegerArgumentType.integer(1, 100))
                    .executes(context -> {
                        ServerPlayerEntity player = context.getSource().getPlayer();
                        if (player != null) {
                            int level = IntegerArgumentType.getInteger(context, "level");
                            return setClassLevel(context.getSource(), player, level);
                        }
                        context.getSource().sendError(Text.literal("This command can only be used by a player."));
                        return 0;
                    }))));
        
        // /class info <player> - Show another player's class (requires permission level 2)
        dispatcher.register(CommandManager.literal("class")
            .then(CommandManager.literal("info")
                .requires(source -> source.hasPermissionLevel(2))
                .then(CommandManager.argument("player", StringArgumentType.word())
                    .executes(context -> {
                        String playerName = StringArgumentType.getString(context, "player");
                        return showPlayerClass(context.getSource(), playerName);
                    }))));
        
        LOGGER.info("Class management commands registered successfully!");
    }
    
    private static int chooseGodParent(ServerPlayerEntity player, GodParent godParent) {
        UUID playerUuid = player.getUuid();
        String playerName = player.getName().getString();
        
        // Check if player already has a class
        if (playerClasses.containsKey(playerUuid)) {
            PlayerClass existingClass = playerClasses.get(playerUuid);
            if (existingClass.hasGodParent()) {
                player.sendMessage(Text.literal("§cYou have already chosen a god parent: " + 
                    existingClass.getGodParent().getDisplayName()));
                return 0;
            }
        }
        
        // Create new player class or update existing one
        PlayerClass playerClass = playerClasses.computeIfAbsent(playerUuid, 
            uuid -> new PlayerClass(uuid, playerName));
        
        // Set the god parent
        playerClass.setGodParent(godParent);
        
        // Send success message
        MutableText message = Text.literal("§a§l⚡ You have been claimed by ")
            .append(Text.literal(godParent.getFullDisplayName()).formatted(Formatting.GOLD))
            .append(Text.literal("! §r§aYou are now a "))
            .append(Text.literal(playerClass.getTier().getDisplayName()).formatted(Formatting.YELLOW))
            .append(Text.literal(" of "))
            .append(Text.literal(godParent.getDisplayName()).formatted(Formatting.GOLD))
            .append(Text.literal("!"));
        
        player.sendMessage(message);
        
        // Broadcast to all players
        player.getServer().getPlayerManager().broadcast(
            Text.literal("§6§l" + playerName + " has been claimed by " + godParent.getDisplayName() + "!"), false);
        
        LOGGER.info("GOD PARENT: {} chose {} as their god parent", playerName, godParent.getDisplayName());
        
        return 1;
    }
    
    private static int showClass(ServerCommandSource source, ServerPlayerEntity player) {
        UUID playerUuid = player.getUuid();
        PlayerClass playerClass = playerClasses.get(playerUuid);
        
        if (playerClass == null) {
            source.sendMessage(Text.literal("§eYou don't have a class yet. Use /choose<god> to select a god parent!"));
            return 0;
        }
        
        // Show class information
        MutableText message = Text.literal("§6§l=== Your Class Information ===\n")
            .append(Text.literal("§eClass: ").formatted(Formatting.YELLOW))
            .append(Text.literal(playerClass.getDisplayName()).formatted(Formatting.GOLD))
            .append(Text.literal("\n§eLevel: ").formatted(Formatting.YELLOW))
            .append(Text.literal(String.valueOf(playerClass.getLevel())).formatted(Formatting.WHITE))
            .append(Text.literal("\n§eExperience: ").formatted(Formatting.YELLOW))
            .append(Text.literal(playerClass.getExperience() + "/" + playerClass.getExperienceForNextLevel()).formatted(Formatting.WHITE))
            .append(Text.literal("\n§eTier: ").formatted(Formatting.YELLOW))
            .append(Text.literal(playerClass.getTier().getDisplayName()).formatted(Formatting.AQUA));
        
        if (playerClass.hasGodParent()) {
            GodParent godParent = playerClass.getGodParent();
            message.append(Text.literal("\n§eGod Parent: ").formatted(Formatting.YELLOW))
                .append(Text.literal(godParent.getFullDisplayName()).formatted(Formatting.GOLD))
                .append(Text.literal("\n§eDomains: ").formatted(Formatting.YELLOW))
                .append(Text.literal(godParent.getDomains()).formatted(Formatting.WHITE))
                .append(Text.literal("\n§eTitle: ").formatted(Formatting.YELLOW))
                .append(Text.literal(godParent.getTitle()).formatted(Formatting.WHITE));
        }
        
        source.sendMessage(message);
        return 1;
    }
    
    private static int resetClass(ServerCommandSource source, ServerPlayerEntity player) {
        UUID playerUuid = player.getUuid();
        PlayerClass playerClass = playerClasses.get(playerUuid);
        
        if (playerClass == null) {
            source.sendError(Text.literal("§cYou don't have a class to reset."));
            return 0;
        }
        
        // Reset the class
        playerClass.setGodParent(null);
        playerClass.setTier(ClassTier.MORTAL);
        playerClass.setLevel(1);
        playerClass.setExperience(0);
        
        source.sendMessage(Text.literal("§aYour class has been reset to mortal status."));
        LOGGER.info("CLASS RESET: {} reset their class", player.getName().getString());
        
        return 1;
    }
    
    private static int clearClass(ServerCommandSource source, ServerPlayerEntity player) {
        UUID playerUuid = player.getUuid();
        PlayerClass removedClass = playerClasses.remove(playerUuid);
        
        if (removedClass == null) {
            source.sendError(Text.literal("§cYou don't have a class to clear."));
            return 0;
        }
        
        source.sendMessage(Text.literal("§aYour class has been completely cleared."));
        LOGGER.info("CLASS CLEARED: {} cleared their class", player.getName().getString());
        
        return 1;
    }
    
    private static int setClassLevel(ServerCommandSource source, ServerPlayerEntity player, int level) {
        UUID playerUuid = player.getUuid();
        PlayerClass playerClass = playerClasses.get(playerUuid);
        
        if (playerClass == null) {
            source.sendError(Text.literal("§cYou don't have a class. Use /choose<god> first."));
            return 0;
        }
        
        playerClass.setLevel(level);
        source.sendMessage(Text.literal("§aYour class level has been set to " + level));
        LOGGER.info("CLASS LEVEL: {} set {}'s class level to {}", 
            source.getName(), player.getName().getString(), level);
        
        return 1;
    }
    
    private static int showPlayerClass(ServerCommandSource source, String playerName) {
        // Find player by name
        ServerPlayerEntity targetPlayer = source.getServer().getPlayerManager().getPlayer(playerName);
        if (targetPlayer == null) {
            source.sendError(Text.literal("§cPlayer " + playerName + " is not online."));
            return 0;
        }
        
        UUID playerUuid = targetPlayer.getUuid();
        PlayerClass playerClass = playerClasses.get(playerUuid);
        
        if (playerClass == null) {
            source.sendMessage(Text.literal("§e" + playerName + " doesn't have a class yet."));
            return 0;
        }
        
        // Show player's class information
        MutableText message = Text.literal("§6§l=== " + playerName + "'s Class ===\n")
            .append(Text.literal("§eClass: ").formatted(Formatting.YELLOW))
            .append(Text.literal(playerClass.getDisplayName()).formatted(Formatting.GOLD))
            .append(Text.literal("\n§eLevel: ").formatted(Formatting.YELLOW))
            .append(Text.literal(String.valueOf(playerClass.getLevel())).formatted(Formatting.WHITE))
            .append(Text.literal("\n§eTier: ").formatted(Formatting.YELLOW))
            .append(Text.literal(playerClass.getTier().getDisplayName()).formatted(Formatting.AQUA));
        
        if (playerClass.hasGodParent()) {
            GodParent godParent = playerClass.getGodParent();
            message.append(Text.literal("\n§eGod Parent: ").formatted(Formatting.YELLOW))
                .append(Text.literal(godParent.getFullDisplayName()).formatted(Formatting.GOLD));
        }
        
        source.sendMessage(message);
        return 1;
    }
    
    // Utility method to get a player's class
    public static PlayerClass getPlayerClass(UUID playerUuid) {
        return playerClasses.get(playerUuid);
    }
    
    // Utility method to check if a player has a class
    public static boolean hasPlayerClass(UUID playerUuid) {
        return playerClasses.containsKey(playerUuid);
    }
}
