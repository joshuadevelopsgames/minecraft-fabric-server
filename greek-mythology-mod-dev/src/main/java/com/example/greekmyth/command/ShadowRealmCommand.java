package com.example.greekmyth.command;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.dimension.PlayerRealmTracker;
import com.example.greekmyth.dimension.ShadowRealmDimensionManager;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShadowRealmCommand {

    // Store player positions for realm switching
    private static final Map<UUID, Vec3d> playerPositions = new HashMap<>();

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("shadowrealm")
            .requires(source -> source.hasPermissionLevel(0)) // Anyone can use
            .executes(ShadowRealmCommand::toggleRealm)
            .then(CommandManager.literal("toggle")
                .executes(ShadowRealmCommand::toggleRealm))
            .then(CommandManager.literal("overworld")
                .executes(ShadowRealmCommand::goToOverworld))
            .then(CommandManager.literal("shadow")
                .executes(ShadowRealmCommand::goToShadow))
            .then(CommandManager.argument("realm", BoolArgumentType.bool())
                .executes(ShadowRealmCommand::setRealm)));
    }

    private static int toggleRealm(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayerOrThrow();

        // Toggle the player's realm state
        PlayerRealmTracker.togglePlayerRealm(player);

        boolean isInShadowRealm = PlayerRealmTracker.isPlayerInShadowRealm(player);

        // Teleport the player to the appropriate dimension
        if (isInShadowRealm) {
            teleportToShadowRealm(player);
        } else {
            teleportToOverworld(player);
        }

        // Send feedback message
        String realmName = isInShadowRealm ? "Shadow Realm" : "Overworld";
        Formatting color = isInShadowRealm ? Formatting.DARK_PURPLE : Formatting.GREEN;

        player.sendMessage(Text.literal("§7[§bShadow Realm§7] §fYou have entered the " + realmName + "!")
            .formatted(color));

        GreekMythologyMod.LOGGER.info("SHADOW REALM COMMAND: Player {} toggled to {} realm",
            player.getName().getString(), realmName);

        return 1;
    }

    private static int goToOverworld(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayerOrThrow();

        // Set player to overworld realm
        PlayerRealmTracker.setPlayerRealm(player, false);

        // Teleport to overworld
        teleportToOverworld(player);

        player.sendMessage(Text.literal("§7[§bShadow Realm§7] §fYou have returned to the Overworld!")
            .formatted(Formatting.GREEN));

        GreekMythologyMod.LOGGER.info("SHADOW REALM COMMAND: Player {} returned to Overworld realm",
            player.getName().getString());

        return 1;
    }

    private static int goToShadow(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayerOrThrow();

        // Set player to shadow realm
        PlayerRealmTracker.setPlayerRealm(player, true);

        // Teleport to shadow realm
        teleportToShadowRealm(player);

        player.sendMessage(Text.literal("§7[§bShadow Realm§7] §fYou have entered the Shadow Realm!")
            .formatted(Formatting.DARK_PURPLE));

        GreekMythologyMod.LOGGER.info("SHADOW REALM COMMAND: Player {} entered Shadow Realm",
            player.getName().getString());

        return 1;
    }

    private static int setRealm(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayerOrThrow();
        boolean goToShadow = BoolArgumentType.getBool(context, "realm");

        // Set player to specified realm
        PlayerRealmTracker.setPlayerRealm(player, goToShadow);

        // Teleport to appropriate dimension
        if (goToShadow) {
            teleportToShadowRealm(player);
        } else {
            teleportToOverworld(player);
        }

        String realmName = goToShadow ? "Shadow Realm" : "Overworld";
        Formatting color = goToShadow ? Formatting.DARK_PURPLE : Formatting.GREEN;

        player.sendMessage(Text.literal("§7[§bShadow Realm§7] §fYou have entered the " + realmName + "!")
            .formatted(color));

        GreekMythologyMod.LOGGER.info("SHADOW REALM COMMAND: Player {} set to {} realm",
            player.getName().getString(), realmName);

        return 1;
    }

    /**
     * Teleport player to the Shadow Realm
     */
    private static void teleportToShadowRealm(ServerPlayerEntity player) {
        try {
            // Try to get or create the shadow realm world
            ServerWorld shadowRealm = ShadowRealmDimensionManager.getOrCreateShadowRealm(player.getServer());
            
            if (shadowRealm == null) {
                player.sendMessage(Text.literal("§7[§bShadow Realm§7] §cError: Shadow Realm not available!")
                    .formatted(Formatting.RED));
                GreekMythologyMod.LOGGER.warn("SHADOW REALM: Failed to get shadow realm world for player {}", 
                    player.getName().getString());
                return;
            }

            // Store current position for return
            Vec3d currentPos = player.getPos();
            playerPositions.put(player.getUuid(), currentPos);

            // Teleport to shadow realm at same coordinates
            player.teleport(shadowRealm, currentPos.x, currentPos.y, currentPos.z, 
                java.util.Set.of(), player.getYaw(), player.getPitch(), false);

            GreekMythologyMod.LOGGER.info("SHADOW REALM: Player {} teleported to shadow realm at {}", 
                player.getName().getString(), currentPos);

        } catch (Exception e) {
            player.sendMessage(Text.literal("§7[§bShadow Realm§7] §cError teleporting to Shadow Realm!")
                .formatted(Formatting.RED));
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Failed to teleport player {} to shadow realm: {}", 
                player.getName().getString(), e.getMessage());
        }
    }

    /**
     * Teleport player back to the Overworld
     */
    private static void teleportToOverworld(ServerPlayerEntity player) {
        try {
            // Get the overworld
            ServerWorld overworld = player.getServer().getWorld(ShadowRealmDimensionManager.getOverworldDimension());
            
            if (overworld == null) {
                player.sendMessage(Text.literal("§7[§bShadow Realm§7] §cError: Overworld not available!")
                    .formatted(Formatting.RED));
                GreekMythologyMod.LOGGER.warn("SHADOW REALM: Failed to get overworld for player {}", 
                    player.getName().getString());
                return;
            }

            // Get previous position or current position
            Vec3d targetPos = playerPositions.get(player.getUuid());
            if (targetPos == null) {
                targetPos = player.getPos();
            }

            // Teleport to overworld
            player.teleport(overworld, targetPos.x, targetPos.y, targetPos.z, 
                java.util.Set.of(), player.getYaw(), player.getPitch(), false);

            GreekMythologyMod.LOGGER.info("SHADOW REALM: Player {} teleported to overworld at {}", 
                player.getName().getString(), targetPos);

        } catch (Exception e) {
            player.sendMessage(Text.literal("§7[§bShadow Realm§7] §cError teleporting to Overworld!")
                .formatted(Formatting.RED));
            GreekMythologyMod.LOGGER.error("SHADOW REALM: Failed to teleport player {} to overworld: {}", 
                player.getName().getString(), e.getMessage());
        }
    }
}
