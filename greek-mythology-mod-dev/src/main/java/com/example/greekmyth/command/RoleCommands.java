package com.example.greekmyth.command;

import com.example.greekmyth.roles.RolesManager;
import com.example.greekmyth.roles.Role;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class RoleCommands {
    private static final Logger LOGGER = LoggerFactory.getLogger("RoleCommands");

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        LOGGER.info("Registering role management commands...");

        // /setrole <player> <role> - Set a player's role (requires permission level 4)
        dispatcher.register(CommandManager.literal("setrole")
            .requires(source -> source.hasPermissionLevel(4))
            .then(CommandManager.argument("player", StringArgumentType.word())
                .then(CommandManager.argument("role", StringArgumentType.word())
                    .executes(context -> {
                        String playerName = StringArgumentType.getString(context, "player");
                        String roleName = StringArgumentType.getString(context, "role");
                        return setRole(context.getSource(), playerName, roleName);
                    }))));

        // /role <player> - View a player's current role (requires permission level 2)
        dispatcher.register(CommandManager.literal("role")
            .requires(source -> source.hasPermissionLevel(2))
            .then(CommandManager.argument("player", StringArgumentType.word())
                .executes(context -> {
                    String playerName = StringArgumentType.getString(context, "player");
                    return viewRole(context.getSource(), playerName);
                }))
            .executes(context -> {
                // If no player specified, show the command sender's role
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return viewRole(context.getSource(), player.getName().getString());
                }
                return 0;
            }));

        // /roles - List all available roles (requires permission level 2)
        dispatcher.register(CommandManager.literal("roles")
            .requires(source -> source.hasPermissionLevel(2))
            .executes(context -> {
                return listRoles(context.getSource());
            }));

        // /setrolepermission <role> <level> - Set permission level for a role (requires permission level 4)
        dispatcher.register(CommandManager.literal("setrolepermission")
            .requires(source -> source.hasPermissionLevel(4))
            .then(CommandManager.argument("role", StringArgumentType.word())
                .then(CommandManager.argument("level", IntegerArgumentType.integer(1, 4))
                    .executes(context -> {
                        String roleName = StringArgumentType.getString(context, "role");
                        int level = IntegerArgumentType.getInteger(context, "level");
                        return setRolePermission(context.getSource(), roleName, level);
                    }))));

        // /reloadroles - Reload roles from config (requires permission level 4)
        dispatcher.register(CommandManager.literal("reloadroles")
            .requires(source -> source.hasPermissionLevel(4))
            .executes(context -> {
                return reloadRoles(context.getSource());
            }));

        // /myrole - Show your own role (no permission required)
        dispatcher.register(CommandManager.literal("myrole")
            .executes(context -> {
                ServerPlayerEntity player = context.getSource().getPlayer();
                if (player != null) {
                    return viewRole(context.getSource(), player.getName().getString());
                }
                context.getSource().sendError(Text.literal("This command can only be used by a player."));
                return 0;
            }));

        LOGGER.info("Role management commands registered successfully!");
    }

    private static int setRole(ServerCommandSource source, String playerName, String roleName) {
        try {
            // Check if the role exists
            if (!RolesManager.roleExists(roleName)) {
                source.sendError(Text.literal("§cRole '" + roleName + "' does not exist!"));
                source.sendMessage(Text.literal("§eAvailable roles: Owner, Admin, Moderator, Member"));
                return 0;
            }

            // Set the role
            RolesManager.assignRole(playerName, roleName);
            
            // Get the role details for display
            Role role = RolesManager.getRole(roleName);
            if (role != null) {
                MutableText message = Text.literal("§aSuccessfully set ")
                    .append(Text.literal(playerName).formatted(Formatting.WHITE))
                    .append(Text.literal("'s role to "))
                    .append(Text.literal(role.prefix + role.name).formatted(Formatting.valueOf(role.color.toUpperCase())))
                    .append(Text.literal(" (Permission Level: " + role.permissionLevel + ")"));
                
                source.sendMessage(message);
                
                LOGGER.info("ROLE: {} set {}'s role to {} (Permission Level: {})", 
                    source.getName(), playerName, roleName, role.permissionLevel);
            }
            
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError setting role: " + e.getMessage()));
            LOGGER.error("Error setting role for {} to {}: {}", playerName, roleName, e.getMessage());
            return 0;
        }
    }

    private static int viewRole(ServerCommandSource source, String playerName) {
        try {
            Role role = RolesManager.getRoleForPlayer(playerName);
            if (role != null) {
                MutableText message = Text.literal("§ePlayer: ")
                    .append(Text.literal(playerName).formatted(Formatting.WHITE))
                    .append(Text.literal(" | Role: "))
                    .append(Text.literal(role.prefix + role.name).formatted(Formatting.valueOf(role.color.toUpperCase())))
                    .append(Text.literal(" | Permission Level: " + role.permissionLevel));
                
                source.sendMessage(message);
            } else {
                source.sendError(Text.literal("§cCould not retrieve role information for " + playerName));
            }
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError viewing role: " + e.getMessage()));
            LOGGER.error("Error viewing role for {}: {}", playerName, e.getMessage());
            return 0;
        }
    }

    private static int listRoles(ServerCommandSource source) {
        try {
            source.sendMessage(Text.literal("§6=== Available Roles ==="));
            
            Map<String, Role> roles = RolesManager.getAllRoles();
            for (Map.Entry<String, Role> entry : roles.entrySet()) {
                Role role = entry.getValue();
                MutableText roleText = Text.literal("§e" + role.name + ": ")
                    .append(Text.literal(role.prefix).formatted(Formatting.valueOf(role.color.toUpperCase())))
                    .append(Text.literal(" (Permission Level: " + role.permissionLevel + ")"));
                
                source.sendMessage(roleText);
            }
            
            source.sendMessage(Text.literal("§6=== Role Assignments ==="));
            Map<String, String> assignments = RolesManager.getAllAssignments();
            for (Map.Entry<String, String> entry : assignments.entrySet()) {
                source.sendMessage(Text.literal("§e" + entry.getKey() + " → " + entry.getValue()));
            }
            
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError listing roles: " + e.getMessage()));
            LOGGER.error("Error listing roles: {}", e.getMessage());
            return 0;
        }
    }

    private static int setRolePermission(ServerCommandSource source, String roleName, int level) {
        try {
            if (!RolesManager.roleExists(roleName)) {
                source.sendError(Text.literal("§cRole '" + roleName + "' does not exist!"));
                return 0;
            }

            RolesManager.setRolePermission(roleName, level);
            source.sendMessage(Text.literal("§aSuccessfully set " + roleName + "'s permission level to " + level));
            
            LOGGER.info("ROLE PERMISSION: {} set {}'s permission level to {}", 
                source.getName(), roleName, level);
            
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError setting role permission: " + e.getMessage()));
            LOGGER.error("Error setting permission for role {}: {}", roleName, e.getMessage());
            return 0;
        }
    }

    private static int reloadRoles(ServerCommandSource source) {
        try {
            RolesManager.reload();
            source.sendMessage(Text.literal("§aRoles configuration reloaded successfully!"));
            
            LOGGER.info("ROLES RELOADED: {} reloaded roles configuration", source.getName());
            
            return 1;
        } catch (Exception e) {
            source.sendError(Text.literal("§cError reloading roles: " + e.getMessage()));
            LOGGER.error("Error reloading roles: {}", e.getMessage());
            return 0;
        }
    }
}
