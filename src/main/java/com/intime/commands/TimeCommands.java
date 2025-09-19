package com.intime.commands;

import com.intime.InTimeMod;
import com.intime.manager.TimeManager;
import com.intime.data.TimeTransaction;
import com.intime.data.TimeAuditLog;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.fabricmc.fabric.api.permission.v1.PermissionCheckEvent;
import net.fabricmc.fabric.api.permission.v1.Permissions;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class TimeCommands {
    
    // Rate limiting for time transfers
    private static final Map<UUID, Long> lastTransferTime = new ConcurrentHashMap<>();
    private static final long TRANSFER_COOLDOWN_MS = 5000; // 5 seconds
    
    // Permission nodes
    public static final String PERM_VIEW = "lifeline.time.view";
    public static final String PERM_PAY = "lifeline.time.pay";
    public static final String PERM_ADMIN = "lifeline.time.admin";
    public static final String PERM_AUDIT = "lifeline.time.audit";
    public static final String PERM_RESCUE = "lifeline.time.rescue";
    public static final String PERM_PAUSE = "lifeline.time.pause";
    
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess access, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(literal("time")
            .then(literal("bal")
                .executes(TimeCommands::showOwnBalance)
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .executes(TimeCommands::showPlayerBalance)))
            .then(literal("pay")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .then(argument("seconds", IntegerArgumentType.integer(1))
                .executes(TimeCommands::payTime))))
            .then(literal("give")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .then(argument("seconds", IntegerArgumentType.integer(1))
                .then(argument("reason", StringArgumentType.greedyString())
                .executes(TimeCommands::giveTime)))))
            .then(literal("take")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .then(argument("seconds", IntegerArgumentType.integer(1))
                .then(argument("reason", StringArgumentType.greedyString())
                .executes(TimeCommands::takeTime)))))
            .then(literal("set")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .then(argument("seconds", IntegerArgumentType.integer(0))
                .then(argument("reason", StringArgumentType.greedyString())
                .executes(TimeCommands::setTime)))))
            .then(literal("top")
                .executes(context -> showTopPlayers(context, 10))
                .then(argument("count", IntegerArgumentType.integer(1, 50))
                .executes(TimeCommands::showTopPlayers)))
            .then(literal("audit")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .executes(context -> auditPlayer(context, 24))
                .then(argument("hours", IntegerArgumentType.integer(1, 168))
                .executes(TimeCommands::auditPlayer))))
            .then(literal("rescue")
                .then(argument("player", net.minecraft.command.argument.EntityArgumentType.player())
                .then(argument("seconds", IntegerArgumentType.integer(1))
                .executes(TimeCommands::rescuePlayer))))
            .then(literal("pause_self")
                .executes(TimeCommands::pauseSelf))
            .then(literal("help")
                .executes(TimeCommands::showHelp)));
    }
    
    private static int showOwnBalance(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        if (!(source.getEntity() instanceof ServerPlayerEntity player)) {
            source.sendMessage(Text.literal("This command can only be used by players!").formatted(Formatting.RED));
            return 0;
        }
        
        if (!hasPermission(source, PERM_VIEW)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to view time balances!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        String timeString = timeManager.getFormattedTime(player.getUuid());
        
        source.sendMessage(Text.literal("§6[Time] §fYour balance: §e" + timeString));
        return 1;
    }
    
    private static int showPlayerBalance(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        
        if (!hasPermission(source, PERM_VIEW)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to view time balances!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        String timeString = timeManager.getFormattedTime(target.getUuid());
        
        source.sendMessage(Text.literal("§6[Time] §f" + target.getName().getString() + "'s balance: §e" + timeString));
        return 1;
    }
    
    private static int payTime(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        if (!(source.getEntity() instanceof ServerPlayerEntity player)) {
            source.sendMessage(Text.literal("This command can only be used by players!").formatted(Formatting.RED));
            return 0;
        }
        
        if (!hasPermission(source, PERM_PAY)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to transfer time!").formatted(Formatting.RED));
            return 0;
        }
        
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        int seconds = IntegerArgumentType.getInteger(context, "seconds");
        
        if (target.equals(player)) {
            source.sendMessage(Text.literal("§c[Time] §fYou cannot transfer time to yourself!").formatted(Formatting.RED));
            return 0;
        }
        
        // Rate limiting check
        if (!checkRateLimit(player.getUuid())) {
            source.sendMessage(Text.literal("§c[Time] §fTransfer rate limited! Wait 5 seconds between transfers.").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        if (timeManager.transferTime(player.getUuid(), target.getUuid(), seconds)) {
            String timeString = formatTime(seconds);
            source.sendMessage(Text.literal("§6[Time] §fTransferred §e" + timeString + " §fto §e" + target.getName().getString()));
            target.sendMessage(Text.literal("§6[Time] §fReceived §e" + timeString + " §ffrom §e" + player.getName().getString()));
            
            // Log transaction
            logTransaction(player.getUuid(), target.getUuid(), seconds, "PAY", "Direct transfer");
        } else {
            source.sendMessage(Text.literal("§c[Time] §fInsufficient time for transfer!").formatted(Formatting.RED));
        }
        
        return 1;
    }
    
    private static int giveTime(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        int seconds = IntegerArgumentType.getInteger(context, "seconds");
        String reason = StringArgumentType.getString(context, "reason");
        
        if (!hasPermission(source, PERM_ADMIN)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to give time!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        if (timeManager.addTime(target.getUuid(), seconds)) {
            String timeString = formatTime(seconds);
            source.sendMessage(Text.literal("§6[Time] §fGave §e" + timeString + " §fto §e" + target.getName().getString() + " §7(" + reason + ")"));
            target.sendMessage(Text.literal("§6[Time] §fAdmin gave you §e" + timeString + " §7(" + reason + ")"));
            
            // Log admin action
            logTransaction(source.getPlayer() != null ? source.getPlayer().getUuid() : null, 
                          target.getUuid(), seconds, "GIVE", reason);
        } else {
            source.sendMessage(Text.literal("§c[Time] §fFailed to give time!").formatted(Formatting.RED));
        }
        
        return 1;
    }
    
    private static int takeTime(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        int seconds = IntegerArgumentType.getInteger(context, "seconds");
        String reason = StringArgumentType.getString(context, "reason");
        
        if (!hasPermission(source, PERM_ADMIN)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to take time!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        if (timeManager.removeTime(target.getUuid(), seconds)) {
            String timeString = formatTime(seconds);
            source.sendMessage(Text.literal("§6[Time] §fTook §e" + timeString + " §ffrom §e" + target.getName().getString() + " §7(" + reason + ")"));
            target.sendMessage(Text.literal("§6[Time] §fAdmin took §e" + timeString + " §ffrom you §7(" + reason + ")"));
            
            // Log admin action
            logTransaction(source.getPlayer() != null ? source.getPlayer().getUuid() : null, 
                          target.getUuid(), -seconds, "TAKE", reason);
        } else {
            source.sendMessage(Text.literal("§c[Time] §fFailed to take time!").formatted(Formatting.RED));
        }
        
        return 1;
    }
    
    private static int setTime(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        int seconds = IntegerArgumentType.getInteger(context, "seconds");
        String reason = StringArgumentType.getString(context, "reason");
        
        if (!hasPermission(source, PERM_ADMIN)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to set time!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        int oldTime = timeManager.getTimeRemaining(target.getUuid());
        timeManager.getPlayerTimeData(target.getUuid()).setTimeRemaining(seconds);
        String timeString = formatTime(seconds);
        
        source.sendMessage(Text.literal("§6[Time] §fSet §e" + target.getName().getString() + "§f's time to §e" + timeString + " §7(" + reason + ")"));
        target.sendMessage(Text.literal("§6[Time] §fAdmin set your time to §e" + timeString + " §7(" + reason + ")"));
        
        // Log admin action
        logTransaction(source.getPlayer() != null ? source.getPlayer().getUuid() : null, 
                      target.getUuid(), seconds - oldTime, "SET", reason);
        
        return 1;
    }
    
    private static int showTopPlayers(CommandContext<ServerCommandSource> context, int count) {
        ServerCommandSource source = context.getSource();
        
        if (!hasPermission(source, PERM_VIEW)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to view top players!").formatted(Formatting.RED));
            return 0;
        }
        
        source.sendMessage(Text.literal("§6[Time] §fTop " + count + " Richest Players:"));
        
        Map<UUID, Integer> topPlayers = TimeAuditLog.getTopPlayers(count);
        int rank = 1;
        
        for (Map.Entry<UUID, Integer> entry : topPlayers.entrySet()) {
            String playerName = "Unknown";
            // TODO: Get player name from UUID using server player manager
            String timeString = formatTime(entry.getValue());
            source.sendMessage(Text.literal("§e" + rank + ". §f" + playerName + " §7- §e" + timeString));
            rank++;
        }
        
        if (topPlayers.isEmpty()) {
            source.sendMessage(Text.literal("§7No transaction data available"));
        }
        
        return 1;
    }
    
    private static int auditPlayer(CommandContext<ServerCommandSource> context, int hours) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        
        if (!hasPermission(source, PERM_AUDIT)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to audit players!").formatted(Formatting.RED));
            return 0;
        }
        
        source.sendMessage(Text.literal("§6[Time] §fAudit for §e" + target.getName().getString() + " §f(last " + hours + " hours):"));
        
        List<TimeTransaction> transactions = TimeAuditLog.getPlayerTransactions(target.getUuid(), hours);
        
        if (transactions.isEmpty()) {
            source.sendMessage(Text.literal("§7No transactions found in the last " + hours + " hours"));
            return 1;
        }
        
        for (TimeTransaction tx : transactions) {
            String fromName = tx.getFromUUID() != null ? "Unknown" : "System"; // TODO: Get player names
            String toName = tx.getToUUID() != null ? "Unknown" : "System";
            String amountStr = tx.getFormattedAmount();
            String ageStr = tx.getAgeDescription();
            
            if (tx.getType().equals("PAY")) {
                source.sendMessage(Text.literal("§7- Paid: §c" + amountStr + " §7to " + toName + " §7(" + ageStr + ")"));
            } else if (tx.getType().equals("GIVE")) {
                source.sendMessage(Text.literal("§7- Received: §e" + amountStr + " §7from Admin §7(" + ageStr + ")"));
            } else if (tx.getType().equals("TAKE")) {
                source.sendMessage(Text.literal("§7- Lost: §c" + amountStr + " §7(Admin action) §7(" + ageStr + ")"));
            } else if (tx.getType().equals("SET")) {
                source.sendMessage(Text.literal("§7- Set to: §e" + amountStr + " §7(Admin action) §7(" + ageStr + ")"));
            } else if (tx.getType().equals("RESCUE")) {
                source.sendMessage(Text.literal("§7- Rescued: §e" + amountStr + " §7(Emergency) §7(" + ageStr + ")"));
            } else {
                source.sendMessage(Text.literal("§7- " + tx.getType() + ": §e" + amountStr + " §7(" + ageStr + ")"));
            }
        }
        
        return 1;
    }
    
    private static int rescuePlayer(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        ServerPlayerEntity target = net.minecraft.command.argument.EntityArgumentType.getPlayer(context, "player");
        int seconds = IntegerArgumentType.getInteger(context, "seconds");
        
        if (!hasPermission(source, PERM_RESCUE)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to rescue players!").formatted(Formatting.RED));
            return 0;
        }
        
        TimeManager timeManager = InTimeMod.getTimeManager();
        if (timeManager.addTime(target.getUuid(), seconds)) {
            String timeString = formatTime(seconds);
            source.sendMessage(Text.literal("§6[Time] §fRescued §e" + target.getName().getString() + " §fwith §e" + timeString));
            target.sendMessage(Text.literal("§6[Time] §fYou were rescued with §e" + timeString));
            
            // Log rescue action
            logTransaction(source.getPlayer() != null ? source.getPlayer().getUuid() : null, 
                          target.getUuid(), seconds, "RESCUE", "Emergency rescue");
        } else {
            source.sendMessage(Text.literal("§c[Time] §fFailed to rescue player!").formatted(Formatting.RED));
        }
        
        return 1;
    }
    
    private static int pauseSelf(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        if (!(source.getEntity() instanceof ServerPlayerEntity player)) {
            source.sendMessage(Text.literal("This command can only be used by players!").formatted(Formatting.RED));
            return 0;
        }
        
        if (!hasPermission(source, PERM_PAUSE)) {
            source.sendMessage(Text.literal("§c[Time] §fYou don't have permission to pause time!").formatted(Formatting.RED));
            return 0;
        }
        
        // TODO: Implement Cryo Capsule functionality
        source.sendMessage(Text.literal("§6[Time] §fCryo Capsule functionality coming soon!"));
        source.sendMessage(Text.literal("§7This will allow you to pause offline time drain."));
        
        return 1;
    }
    
    private static int showHelp(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        
        source.sendMessage(Text.literal("§6[Time] §fAvailable Commands:"));
        source.sendMessage(Text.literal("§e/time bal [player] §7- View time balance"));
        source.sendMessage(Text.literal("§e/time pay <player> <seconds> §7- Transfer time (rate limited)"));
        source.sendMessage(Text.literal("§e/time top [n] §7- Show richest players"));
        source.sendMessage(Text.literal("§e/time help §7- Show this help message"));
        
        if (hasPermission(source, PERM_ADMIN)) {
            source.sendMessage(Text.literal("§6[Admin Commands]:"));
            source.sendMessage(Text.literal("§e/time give|take|set <player> <seconds> [reason] §7- Admin time management"));
        }
        
        if (hasPermission(source, PERM_AUDIT)) {
            source.sendMessage(Text.literal("§e/time audit <player> [hours] §7- View transaction history"));
        }
        
        if (hasPermission(source, PERM_RESCUE)) {
            source.sendMessage(Text.literal("§e/time rescue <player> <seconds> §7- Emergency time rescue"));
        }
        
        if (hasPermission(source, PERM_PAUSE)) {
            source.sendMessage(Text.literal("§e/time pause_self §7- Pause offline time drain"));
        }
        
        return 1;
    }
    
    // Permission checking with LuckPerms integration
    private static boolean hasPermission(ServerCommandSource source, String permission) {
        // TODO: Integrate with LuckPerms
        // For now, use vanilla permission levels
        return source.hasPermissionLevel(2) || permission.equals(PERM_VIEW) || permission.equals(PERM_PAY);
    }
    
    // Rate limiting for transfers
    private static boolean checkRateLimit(UUID playerUUID) {
        long currentTime = System.currentTimeMillis();
        Long lastTransfer = lastTransferTime.get(playerUUID);
        
        if (lastTransfer == null || currentTime - lastTransfer >= TRANSFER_COOLDOWN_MS) {
            lastTransferTime.put(playerUUID, currentTime);
            return true;
        }
        
        return false;
    }
    
    // Transaction logging
    private static void logTransaction(UUID fromUUID, UUID toUUID, int amount, String type, String reason) {
        TimeTransaction transaction = new TimeTransaction(
            fromUUID, toUUID, amount, type, reason, Instant.now()
        );
        
        // Save to audit log
        TimeAuditLog.logTransaction(transaction);
    }
    
    private static String formatTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        
        if (hours > 0) {
            return String.format("%d:%02d:%02d", hours, minutes, secs);
        } else if (minutes > 0) {
            return String.format("%d:%02d", minutes, secs);
        } else {
            return String.format("%d seconds", secs);
        }
    }
}
