package com.example.aimyth.quest;

import com.example.aimyth.AIMythologyMod;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Manages all quests and heroic challenges in the AI Mythology mod.
 * Handles quest tracking, progression, and rewards.
 */
public class QuestManager {
    private static final Map<UUID, PlayerQuestData> playerQuestData = new HashMap<>();
    
    public static void init() {
        AIMythologyMod.LOGGER.info("Initializing AI Mythology Quest System...");
        // Initialize quest system
        AIMythologyMod.LOGGER.info("AI Mythology Quest System initialized");
    }
    
    /**
     * Get or create quest data for a player
     */
    public static PlayerQuestData getPlayerQuestData(UUID playerUuid) {
        return playerQuestData.computeIfAbsent(playerUuid, uuid -> new PlayerQuestData(uuid));
    }
    
    /**
     * Start a quest for a player
     */
    public static boolean startQuest(UUID playerUuid, String questId) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.startQuest(questId);
    }
    
    /**
     * Complete a quest for a player
     */
    public static boolean completeQuest(UUID playerUuid, String questId) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.completeQuest(questId);
    }
    
    /**
     * Check quest progress for a player
     */
    public static QuestProgress getQuestProgress(UUID playerUuid, String questId) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.getQuestProgress(questId);
    }
    
    /**
     * Get all active quests for a player
     */
    public static Map<String, QuestProgress> getActiveQuests(UUID playerUuid) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.getActiveQuests();
    }
    
    /**
     * Get all completed quests for a player
     */
    public static Map<String, QuestProgress> getCompletedQuests(UUID playerUuid) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.getCompletedQuests();
    }
    
    /**
     * Update quest progress for a player
     */
    public static void updateQuestProgress(UUID playerUuid, String questId, int progress) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        data.updateQuestProgress(questId, progress);
    }
    
    /**
     * Check if a player has completed a specific quest
     */
    public static boolean hasCompletedQuest(UUID playerUuid, String questId) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.hasCompletedQuest(questId);
    }
    
    /**
     * Get the total number of completed quests for a player
     */
    public static int getCompletedQuestCount(UUID playerUuid) {
        PlayerQuestData data = getPlayerQuestData(playerUuid);
        return data.getCompletedQuestCount();
    }
    
    /**
     * Get available quests for a player
     */
    public static String[] getAvailableQuests(UUID playerUuid) {
        // In a full implementation, this would check prerequisites and return available quests
        return new String[]{
            "nemean_lion",
            "lernaean_hydra", 
            "ceryneian_hind",
            "erymanthian_boar",
            "augean_stables",
            "stymphalian_birds",
            "cretan_bull",
            "mares_of_diomedes",
            "girdle_of_hippolyta",
            "cattle_of_geryon",
            "apples_of_hesperides",
            "cerberus"
        };
    }
    
    /**
     * Get quest information
     */
    public static QuestInfo getQuestInfo(String questId) {
        // In a full implementation, this would load from configuration
        switch (questId) {
            case "nemean_lion":
                return new QuestInfo("Nemean Lion", "Slay the invulnerable beast", 100);
            case "lernaean_hydra":
                return new QuestInfo("Lernaean Hydra", "Defeat the regenerating serpent", 200);
            case "ceryneian_hind":
                return new QuestInfo("Ceryneian Hind", "Capture the golden deer", 150);
            case "erymanthian_boar":
                return new QuestInfo("Erymanthian Boar", "Subdue the giant boar", 180);
            case "augean_stables":
                return new QuestInfo("Augean Stables", "Clean the massive stables", 120);
            case "stymphalian_birds":
                return new QuestInfo("Stymphalian Birds", "Drive away the man-eating birds", 160);
            case "cretan_bull":
                return new QuestInfo("Cretan Bull", "Capture the divine bull", 220);
            case "mares_of_diomedes":
                return new QuestInfo("Mares of Diomedes", "Steal the flesh-eating horses", 250);
            case "girdle_of_hippolyta":
                return new QuestInfo("Girdle of Hippolyta", "Obtain the Amazon queen's belt", 300);
            case "cattle_of_geryon":
                return new QuestInfo("Cattle of Geryon", "Steal the giant's cattle", 350);
            case "apples_of_hesperides":
                return new QuestInfo("Apples of Hesperides", "Retrieve the golden apples", 400);
            case "cerberus":
                return new QuestInfo("Cerberus", "Capture the underworld guardian", 500);
            default:
                return new QuestInfo("Unknown Quest", "Unknown quest description", 0);
        }
    }
    
    /**
     * Quest information class
     */
    public static class QuestInfo {
        private final String name;
        private final String description;
        private final int reward;
        
        public QuestInfo(String name, String description, int reward) {
            this.name = name;
            this.description = description;
            this.reward = reward;
        }
        
        public String getName() { return name; }
        public String getDescription() { return description; }
        public int getReward() { return reward; }
    }
    
    /**
     * Quest progress class
     */
    public static class QuestProgress {
        private final String questId;
        private final int currentProgress;
        private final int maxProgress;
        private final boolean completed;
        private final long startTime;
        private final Long completionTime;
        
        public QuestProgress(String questId, int currentProgress, int maxProgress, 
                           boolean completed, long startTime, Long completionTime) {
            this.questId = questId;
            this.currentProgress = currentProgress;
            this.maxProgress = maxProgress;
            this.completed = completed;
            this.startTime = startTime;
            this.completionTime = completionTime;
        }
        
        public String getQuestId() { return questId; }
        public int getCurrentProgress() { return currentProgress; }
        public int getMaxProgress() { return maxProgress; }
        public boolean isCompleted() { return completed; }
        public long getStartTime() { return startTime; }
        public Long getCompletionTime() { return completionTime; }
        
        public double getProgressPercentage() {
            return (double) currentProgress / maxProgress * 100.0;
        }
    }
    
    /**
     * Player quest data class
     */
    public static class PlayerQuestData {
        private final UUID playerUuid;
        private final Map<String, QuestProgress> activeQuests;
        private final Map<String, QuestProgress> completedQuests;
        
        public PlayerQuestData(UUID playerUuid) {
            this.playerUuid = playerUuid;
            this.activeQuests = new HashMap<>();
            this.completedQuests = new HashMap<>();
        }
        
        public boolean startQuest(String questId) {
            if (activeQuests.containsKey(questId) || completedQuests.containsKey(questId)) {
                return false; // Already started or completed
            }
            
            QuestInfo info = getQuestInfo(questId);
            QuestProgress progress = new QuestProgress(questId, 0, info.getReward(), 
                false, System.currentTimeMillis(), null);
            activeQuests.put(questId, progress);
            
            AIMythologyMod.LOGGER.info("Player {} started quest: {}", playerUuid, info.getName());
            return true;
        }
        
        public boolean completeQuest(String questId) {
            QuestProgress progress = activeQuests.get(questId);
            if (progress == null || progress.isCompleted()) {
                return false;
            }
            
            QuestProgress completed = new QuestProgress(questId, progress.getMaxProgress(), 
                progress.getMaxProgress(), true, progress.getStartTime(), System.currentTimeMillis());
            
            activeQuests.remove(questId);
            completedQuests.put(questId, completed);
            
            QuestInfo info = getQuestInfo(questId);
            AIMythologyMod.LOGGER.info("Player {} completed quest: {}", playerUuid, info.getName());
            return true;
        }
        
        public QuestProgress getQuestProgress(String questId) {
            QuestProgress progress = activeQuests.get(questId);
            if (progress != null) {
                return progress;
            }
            return completedQuests.get(questId);
        }
        
        public Map<String, QuestProgress> getActiveQuests() {
            return new HashMap<>(activeQuests);
        }
        
        public Map<String, QuestProgress> getCompletedQuests() {
            return new HashMap<>(completedQuests);
        }
        
        public void updateQuestProgress(String questId, int progress) {
            QuestProgress current = activeQuests.get(questId);
            if (current != null && !current.isCompleted()) {
                int newProgress = Math.min(progress, current.getMaxProgress());
                QuestProgress updated = new QuestProgress(questId, newProgress, current.getMaxProgress(), 
                    newProgress >= current.getMaxProgress(), current.getStartTime(), 
                    newProgress >= current.getMaxProgress() ? System.currentTimeMillis() : null);
                
                activeQuests.put(questId, updated);
                
                if (newProgress >= current.getMaxProgress()) {
                    completeQuest(questId);
                }
            }
        }
        
        public boolean hasCompletedQuest(String questId) {
            return completedQuests.containsKey(questId);
        }
        
        public int getCompletedQuestCount() {
            return completedQuests.size();
        }
    }
} 