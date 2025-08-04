package com.example.greekmyth.quest;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class QuestScoreboardManager {
    
    public static void createQuestScoreboard(ServerPlayerEntity player, GodQuest quest) {
        try {
            // Send prominent quest start messages
            player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§6§l           ORACLE QUEST BOARD").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§e§lQuest Started: §r§f" + quest.getTitle()).formatted(Formatting.YELLOW), false);
            player.sendMessage(Text.literal("§7" + quest.getDescription()).formatted(Formatting.GRAY), false);
            player.sendMessage(Text.literal("§a§lProgress: §r§f0/" + quest.getTargetAmount()).formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§b§lReward: §r§f" + quest.getFavorReward() + " favor + " + quest.getXpReward() + " XP").formatted(Formatting.AQUA), false);
            player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
            
            GreekMythologyMod.LOGGER.info("Created quest board for player {}: {}", 
                player.getName().getString(), quest.getTitle());
                
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to create quest board: {}", e.getMessage());
        }
    }
    
    public static void updateQuestProgress(ServerPlayerEntity player, int progress, int target) {
        try {
            // Send progress update with visual indicator
            String progressBar = createProgressBar(progress, target);
            player.sendMessage(Text.literal("§6§l[Quest Progress] §r§a" + progress + "/" + target + " " + progressBar).formatted(Formatting.GREEN), false);
                    
            GreekMythologyMod.LOGGER.info("Updated quest progress for player {}: {}/{}", 
                player.getName().getString(), progress, target);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to update quest progress: {}", e.getMessage());
        }
    }
    
    public static void removeQuestScoreboard(ServerPlayerEntity player) {
        try {
            // Send quest completion celebration
            player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§a§l           QUEST COMPLETED!").formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§a§l           Congratulations!").formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
            
            GreekMythologyMod.LOGGER.info("Removed quest board for player {}", 
                player.getName().getString());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to remove quest board: {}", e.getMessage());
        }
    }
    
    private static String createProgressBar(int current, int target) {
        int barLength = 10;
        int filled = (int) Math.round((double) current / target * barLength);
        filled = Math.min(filled, barLength);
        
        StringBuilder bar = new StringBuilder("§7[");
        for (int i = 0; i < barLength; i++) {
            if (i < filled) {
                bar.append("§a█");
            } else {
                bar.append("§8█");
            }
        }
        bar.append("§7]");
        return bar.toString();
    }
} 