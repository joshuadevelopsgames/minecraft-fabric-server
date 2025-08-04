package com.example.greekmyth.quest;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class OracleQuest {
    private final String questId;
    private final String title;
    private final String description;
    private final QuestType type;
    private final int targetAmount;
    private int currentProgress;
    private final QuestReward reward;
    private boolean completed;
    
    public OracleQuest(String questId, String title, String description, QuestType type, int targetAmount, QuestReward reward) {
        this.questId = questId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.targetAmount = targetAmount;
        this.currentProgress = 0;
        this.reward = reward;
        this.completed = false;
    }
    
    public void updateProgress(int progress) {
        this.currentProgress = Math.min(this.currentProgress + progress, this.targetAmount);
        if (this.currentProgress >= this.targetAmount && !this.completed) {
            this.completed = true;
        }
    }
    
    public Text getQuestText() {
        return Text.literal("§6§l[Oracle Quest] §r§e" + title)
            .formatted(Formatting.GOLD)
            .append(Text.literal("\n§7" + description).formatted(Formatting.GRAY))
            .append(Text.literal("\n§aProgress: " + currentProgress + "/" + targetAmount).formatted(Formatting.GREEN));
    }
    
    public Text getCompletionText() {
        return Text.literal("§6§l[Oracle Quest Complete!] §r§e" + title)
            .formatted(Formatting.GOLD)
            .append(Text.literal("\n§a" + reward.getDescription()).formatted(Formatting.GREEN));
    }
    
    // Getters
    public String getQuestId() { return questId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public QuestType getType() { return type; }
    public int getTargetAmount() { return targetAmount; }
    public int getCurrentProgress() { return currentProgress; }
    public QuestReward getReward() { return reward; }
    public boolean isCompleted() { return completed; }
    
    public enum QuestType {
        KILL_MOBS,
        COLLECT_ITEMS,
        EXPLORE_AREA,
        CRAFT_ITEMS,
        FIND_STRUCTURES
    }
} 