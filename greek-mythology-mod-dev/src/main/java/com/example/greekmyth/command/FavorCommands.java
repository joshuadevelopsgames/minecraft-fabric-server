package com.example.greekmyth.command;

import com.example.greekmyth.favor.*;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

/**
 * Commands for testing and managing the favor system
 */
public class FavorCommands {
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(literal("favor")
            .requires(source -> source.hasPermissionLevel(2)) // Admin level required
            .then(literal("get")
                .then(argument("god", StringArgumentType.word())
                    .executes(context -> {
                        String godName = StringArgumentType.getString(context, "god");
                        ServerPlayerEntity player = context.getSource().getPlayer();
                        if (player == null) {
                            context.getSource().sendMessage(Text.literal("This command can only be used by players").formatted(Formatting.RED));
                            return 0;
                        }
                        return getFavor(context.getSource(), player, godName);
                    })))
            .then(literal("add")
                .then(argument("god", StringArgumentType.word())
                    .then(argument("amount", IntegerArgumentType.integer())
                        .executes(context -> {
                            String godName = StringArgumentType.getString(context, "god");
                            int amount = IntegerArgumentType.getInteger(context, "amount");
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            if (player == null) {
                                context.getSource().sendMessage(Text.literal("This command can only be used by players").formatted(Formatting.RED));
                                return 0;
                            }
                            return addFavor(context.getSource(), player, godName, amount);
                        }))))
            .then(literal("set")
                .then(argument("god", StringArgumentType.word())
                    .then(argument("amount", IntegerArgumentType.integer())
                        .executes(context -> {
                            String godName = StringArgumentType.getString(context, "god");
                            int amount = IntegerArgumentType.getInteger(context, "amount");
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            if (player == null) {
                                context.getSource().sendMessage(Text.literal("This command can only be used by players").formatted(Formatting.RED));
                                return 0;
                            }
                            return setFavor(context.getSource(), player, godName, amount);
                        }))))
            .then(literal("profile")
                .executes(context -> {
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    if (player == null) {
                        context.getSource().sendMessage(Text.literal("This command can only be used by players").formatted(Formatting.RED));
                        return 0;
                    }
                    return showProfile(context.getSource(), player);
                }))
            .then(literal("summary")
                .requires(source -> source.hasPermissionLevel(4)) // Owner level required
                .executes(context -> {
                    return showSummary(context.getSource());
                })));
    }
    
    private static int getFavor(ServerCommandSource source, ServerPlayerEntity player, String godName) {
        try {
            God god = God.valueOf(godName.toUpperCase());
            FavorProfile profile = FavorManager.getOrCreateProfile(player.getUuid(), player.getName().getString());
            
            int favor = profile.getFavor(god);
            FavorTier tier = profile.getFavorTier(god);
            
            source.sendMessage(Text.literal("=== Favor Status ===").formatted(Formatting.GOLD));
            source.sendMessage(Text.literal("Player: " + player.getName().getString()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("God: " + god.getFullDisplayName()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("Favor: " + favor).formatted(Formatting.GREEN));
            source.sendMessage(Text.literal("Tier: " + tier.getFullDisplayName()).formatted(Formatting.YELLOW));
            source.sendMessage(Text.literal("Description: " + tier.getDescription()).formatted(Formatting.GRAY));
            
            return 1;
        } catch (IllegalArgumentException e) {
            source.sendMessage(Text.literal("Invalid god: " + godName).formatted(Formatting.RED));
            source.sendMessage(Text.literal("Available gods: ZEUS, POSEIDON, HADES, ATHENA, ARES, APOLLO, ARTEMIS, HERMES, HEPHAESTUS, APHRODITE, DEMETER, DIONYSUS").formatted(Formatting.GRAY));
            return 0;
        }
    }
    
    private static int addFavor(ServerCommandSource source, ServerPlayerEntity player, String godName, int amount) {
        try {
            God god = God.valueOf(godName.toUpperCase());
            FavorManager.addFavor(player.getUuid(), god, amount);
            
            FavorProfile profile = FavorManager.getProfile(player.getUuid());
            int newFavor = profile.getFavor(god);
            FavorTier newTier = profile.getFavorTier(god);
            
            source.sendMessage(Text.literal("=== Favor Added ===").formatted(Formatting.GREEN));
            source.sendMessage(Text.literal("Player: " + player.getName().getString()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("God: " + god.getFullDisplayName()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("Amount: +" + amount).formatted(Formatting.GREEN));
            source.sendMessage(Text.literal("New Favor: " + newFavor).formatted(Formatting.GREEN));
            source.sendMessage(Text.literal("New Tier: " + newTier.getFullDisplayName()).formatted(Formatting.YELLOW));
            
            return 1;
        } catch (IllegalArgumentException e) {
            source.sendMessage(Text.literal("Invalid god: " + godName).formatted(Formatting.RED));
            return 0;
        }
    }
    
    private static int setFavor(ServerCommandSource source, ServerPlayerEntity player, String godName, int amount) {
        try {
            God god = God.valueOf(godName.toUpperCase());
            FavorManager.setFavor(player.getUuid(), god, amount);
            
            FavorProfile profile = FavorManager.getProfile(player.getUuid());
            int newFavor = profile.getFavor(god);
            FavorTier newTier = profile.getFavorTier(god);
            
            source.sendMessage(Text.literal("=== Favor Set ===").formatted(Formatting.BLUE));
            source.sendMessage(Text.literal("Player: " + player.getName().getString()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("God: " + god.getFullDisplayName()).formatted(Formatting.WHITE));
            source.sendMessage(Text.literal("New Favor: " + newFavor).formatted(Formatting.GREEN));
            source.sendMessage(Text.literal("New Tier: " + newTier.getFullDisplayName()).formatted(Formatting.YELLOW));
            
            return 1;
        } catch (IllegalArgumentException e) {
            source.sendMessage(Text.literal("Invalid god: " + godName).formatted(Formatting.RED));
            return 0;
        }
    }
    
    private static int showProfile(ServerCommandSource source, ServerPlayerEntity player) {
        FavorProfile profile = FavorManager.getOrCreateProfile(player.getUuid(), player.getName().getString());
        
        source.sendMessage(Text.literal("=== Favor Profile ===").formatted(Formatting.GOLD));
        source.sendMessage(Text.literal("Player: " + player.getName().getString()).formatted(Formatting.WHITE));
        source.sendMessage(Text.literal("Highest Tier: " + profile.getHighestTier().getFullDisplayName()).formatted(Formatting.YELLOW));
        
        God favoriteGod = profile.getFavoriteGod();
        if (favoriteGod != null) {
            source.sendMessage(Text.literal("Favorite God: " + favoriteGod.getFullDisplayName()).formatted(Formatting.GREEN));
        } else {
            source.sendMessage(Text.literal("Favorite God: None").formatted(Formatting.GRAY));
        }
        
        source.sendMessage(Text.literal("--- All Gods ---").formatted(Formatting.GRAY));
        for (God god : God.values()) {
            int favor = profile.getFavor(god);
            FavorTier tier = profile.getFavorTier(god);
            Formatting color = tier == FavorTier.CHAMPION ? Formatting.LIGHT_PURPLE :
                             tier == FavorTier.CHOSEN ? Formatting.GREEN :
                             tier == FavorTier.RESPECTED ? Formatting.YELLOW :
                             tier == FavorTier.NEUTRAL ? Formatting.WHITE : Formatting.RED;
            
            source.sendMessage(Text.literal(String.format("  %s: %d (%s)", 
                god.getDisplayName(), favor, tier.getDisplayName())).formatted(color));
        }
        
        return 1;
    }
    
    private static int showSummary(ServerCommandSource source) {
        String summary = FavorManager.getSystemSummary();
        String[] lines = summary.split("\n");
        
        source.sendMessage(Text.literal("=== Favor System Summary ===").formatted(Formatting.GOLD));
        for (String line : lines) {
            source.sendMessage(Text.literal(line).formatted(Formatting.WHITE));
        }
        
        return 1;
    }
} 