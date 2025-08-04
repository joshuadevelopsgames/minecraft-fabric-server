package com.example.greekmyth.quest;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class QuestScoreboardManager {
    
    public static void createQuestScoreboard(ServerPlayerEntity player, GodQuest quest) {
        try {
            // Send a message to show quest progress
            player.sendMessage(Text.literal("§6§l[Quest Board] §r§eQuest Started: " + quest.getTitle()).formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§7Progress: 0/" + quest.getTargetAmount()).formatted(Formatting.GRAY), false);
            
            GreekMythologyMod.LOGGER.info("Created quest tracking for player {}: {}", 
                player.getName().getString(), quest.getTitle());
                
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to create quest tracking: {}", e.getMessage());
        }
    }
    
    public static void updateQuestProgress(ServerPlayerEntity player, int progress, int target) {
        try {
            // Send progress update message
            player.sendMessage(Text.literal("§6§l[Quest Board] §r§aProgress: " + progress + "/" + target).formatted(Formatting.GREEN), false);
                    
            GreekMythologyMod.LOGGER.info("Updated quest progress for player {}: {}/{}", 
                player.getName().getString(), progress, target);
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to update quest progress: {}", e.getMessage());
        }
    }
    
    public static void removeQuestScoreboard(ServerPlayerEntity player) {
        try {
            // Send quest completion message
            player.sendMessage(Text.literal("§6§l[Quest Board] §r§aQuest completed!").formatted(Formatting.GREEN), false);
            
            GreekMythologyMod.LOGGER.info("Removed quest tracking for player {}", 
                player.getName().getString());
        } catch (Exception e) {
            GreekMythologyMod.LOGGER.error("Failed to remove quest tracking: {}", e.getMessage());
        }
    }
} 