package com.example.greekmyth.quest;

import com.example.greekmyth.favor.God;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.random.Random;

public class GodQuest {
    private final String questId;
    private final String title;
    private final String description;
    private final QuestType type;
    private final int targetAmount;
    private int currentProgress;
    private final God targetGod;
    private final int favorReward;
    private final int xpReward;
    private boolean completed;
    private final String[] requiredItems; // Specific items needed for the quest
    private final java.util.Set<String> turnedInItems; // Track which items have been turned in
    
    public GodQuest(String questId, String title, String description, QuestType type, 
                   int targetAmount, God targetGod, int favorReward, int xpReward, String[] requiredItems) {
        this.questId = questId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.targetAmount = targetAmount;
        this.currentProgress = 0;
        this.targetGod = targetGod;
        this.favorReward = favorReward;
        this.xpReward = xpReward;
        this.completed = false;
        this.requiredItems = requiredItems;
        this.turnedInItems = new java.util.HashSet<>();
    }
    
    // Overloaded constructor for backward compatibility
    public GodQuest(String questId, String title, String description, QuestType type, 
                   int targetAmount, God targetGod, int favorReward, int xpReward) {
        this(questId, title, description, type, targetAmount, targetGod, favorReward, xpReward, new String[0]);
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
            .append(Text.literal("\n§aProgress: " + currentProgress + "/" + targetAmount).formatted(Formatting.GREEN))
            .append(Text.literal("\n§bReward: " + favorReward + " favor with " + targetGod.getDisplayName() + " + " + xpReward + " XP").formatted(Formatting.AQUA));
    }
    
    public Text getCompletionText() {
        return Text.literal("§6§l[Oracle Quest Complete!] §r§e" + title)
            .formatted(Formatting.GOLD)
            .append(Text.literal("\n§aYou gained " + favorReward + " favor with " + targetGod.getDisplayName()).formatted(Formatting.GREEN))
            .append(Text.literal("\n§aYou gained " + xpReward + " experience points").formatted(Formatting.GREEN));
    }
    
    // Getters
    public String getQuestId() { return questId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public QuestType getType() { return type; }
    public int getTargetAmount() { return targetAmount; }
    public int getCurrentProgress() { return currentProgress; }
    public God getTargetGod() { return targetGod; }
    public int getFavorReward() { return favorReward; }
    public int getXpReward() { return xpReward; }
    public boolean isCompleted() { return completed; }
    public String[] getRequiredItems() { return requiredItems; }
    
    /**
     * Check if an item has already been turned in for this quest
     */
    public boolean hasItemBeenTurnedIn(String itemId) {
        return turnedInItems.contains(itemId);
    }
    
    /**
     * Mark an item as turned in for this quest
     */
    public void markItemAsTurnedIn(String itemId) {
        turnedInItems.add(itemId);
    }
    
    /**
     * Get the list of items that have been turned in
     */
    public java.util.Set<String> getTurnedInItems() {
        return new java.util.HashSet<>(turnedInItems);
    }
    
    public String getRequiredItemsText() {
        if (requiredItems == null || requiredItems.length == 0) {
            return "Any items";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < requiredItems.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(requiredItems[i]);
        }
        return sb.toString();
    }
    
    public enum QuestType {
        KILL_MOBS,
        COLLECT_ITEMS,
        EXPLORE_AREA,
        CRAFT_ITEMS,
        FIND_STRUCTURES,
        USE_ITEMS,
        TRAVEL_DISTANCE
    }
    
    /**
     * Create a god-specific quest based on the target god
     */
    public static GodQuest createGodQuest(God god, Random random) {
        switch (god) {
            case ZEUS:
                return createZeusQuest(random);
            case POSEIDON:
                return createPoseidonQuest(random);
            case HADES:
                return createHadesQuest(random);
            case ATHENA:
                return createAthenaQuest(random);
            case ARES:
                return createAresQuest(random);
            case APOLLO:
                return createApolloQuest(random);
            case ARTEMIS:
                return createArtemisQuest(random);
            case HERMES:
                return createHermesQuest(random);
            case HEPHAESTUS:
                return createHephaestusQuest(random);
            case APHRODITE:
                return createAphroditeQuest(random);
            case DEMETER:
                return createDemeterQuest(random);
            case DIONYSUS:
                return createDionysusQuest(random);
            default:
                return createDefaultQuest(god, random);
        }
    }
    
    private static GodQuest createZeusQuest(Random random) {
        QuestType[] types = {QuestType.USE_ITEMS, QuestType.TRAVEL_DISTANCE, QuestType.COLLECT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case USE_ITEMS:
                return new GodQuest("zeus_weather_mastery", "Master of Storms", 
                    "Use 10 lightning-related items to demonstrate your control over Zeus's domain", 
                    type, 10, God.ZEUS, 20, 75);
            case TRAVEL_DISTANCE:
                return new GodQuest("zeus_sky_journey", "Journey Through the Skies", 
                    "Travel 1000 blocks to show your dedication to Zeus's realm", 
                    type, 1000, God.ZEUS, 15, 50);
            case COLLECT_ITEMS:
                return new GodQuest("zeus_lightning_collector", "Collector of Lightning", 
                    "Collect 8 lightning and storm-related items to honor Zeus", 
                    type, 8, God.ZEUS, 25, 100);
            default:
                return createDefaultQuest(God.ZEUS, random);
        }
    }
    
    private static GodQuest createPoseidonQuest(Random random) {
        QuestType[] types = {QuestType.EXPLORE_AREA, QuestType.COLLECT_ITEMS, QuestType.FIND_STRUCTURES};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case EXPLORE_AREA:
                return new GodQuest("poseidon_ocean_exploration", "Master of the Depths", 
                    "Explore 5 underwater areas to prove your connection to Poseidon's domain", 
                    type, 5, God.POSEIDON, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("poseidon_sea_treasures", "Treasures of the Deep", 
                    "Collect 8 sea-related items to honor the God of the Sea", 
                    type, 8, God.POSEIDON, 20, 75);
            case FIND_STRUCTURES:
                return new GodQuest("poseidon_temple_seeker", "Temple of the Sea", 
                    "Find 2 ocean monuments to pay homage to Poseidon", 
                    type, 2, God.POSEIDON, 30, 125);
            default:
                return createDefaultQuest(God.POSEIDON, random);
        }
    }
    
    private static GodQuest createHadesQuest(Random random) {
        QuestType[] types = {QuestType.EXPLORE_AREA, QuestType.COLLECT_ITEMS, QuestType.CRAFT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case EXPLORE_AREA:
                return new GodQuest("hades_underworld_journey", "Journey to the Underworld", 
                    "Explore 3 deep cave systems to honor the God of the Underworld", 
                    type, 3, God.HADES, 20, 75);
            case COLLECT_ITEMS:
                return new GodQuest("hades_soul_collector", "Collector of Souls", 
                    "Collect 12 soul-related items to gain Hades's favor", 
                    type, 12, God.HADES, 30, 125);
            case CRAFT_ITEMS:
                return new GodQuest("hades_underworld_craftsman", "Craftsman of the Dead", 
                    "Craft 15 underworld and death-related items", 
                    type, 15, God.HADES, 25, 100);
            default:
                return createDefaultQuest(God.HADES, random);
        }
    }
    
    private static GodQuest createAthenaQuest(Random random) {
        QuestType[] types = {QuestType.CRAFT_ITEMS, QuestType.COLLECT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case CRAFT_ITEMS:
                return new GodQuest("athena_wisdom_crafting", "Wisdom of the Craftsman", 
                    "Craft 15 books and scrolls to honor Athena's wisdom", 
                    type, 15, God.ATHENA, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("athena_knowledge_seeker", "Seeker of Knowledge", 
                    "Collect 10 knowledge-related items to gain Athena's favor", 
                    type, 10, God.ATHENA, 20, 75);
            default:
                return createDefaultQuest(God.ATHENA, random);
        }
    }
    
    private static GodQuest createAresQuest(Random random) {
        QuestType[] types = {QuestType.KILL_MOBS, QuestType.TRAVEL_DISTANCE, QuestType.USE_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case KILL_MOBS:
                return new GodQuest("ares_warrior_trial", "Trial of the Warrior", 
                    "Defeat 25 hostile mobs to prove your worth to Ares", 
                    type, 25, God.ARES, 25, 100);
            case TRAVEL_DISTANCE:
                return new GodQuest("ares_battlefield_runner", "Swift as the Wind of War", 
                    "Travel 1500 blocks to demonstrate your speed in battle", 
                    type, 1500, God.ARES, 20, 75);
            case USE_ITEMS:
                return new GodQuest("ares_weapon_master", "Master of Weapons", 
                    "Use 12 different weapons to honor the God of War", 
                    type, 12, God.ARES, 30, 125);
            default:
                return createDefaultQuest(God.ARES, random);
        }
    }
    
    private static GodQuest createApolloQuest(Random random) {
        QuestType[] types = {QuestType.CRAFT_ITEMS, QuestType.COLLECT_ITEMS, QuestType.EXPLORE_AREA};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case CRAFT_ITEMS:
                return new GodQuest("apollo_musical_crafting", "Harmony of the Sun", 
                    "Craft 10 musical instruments to honor Apollo's domain", 
                    type, 10, God.APOLLO, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("apollo_healing_collector", "Gatherer of Light", 
                    "Collect 8 healing and light-related items", 
                    type, 8, God.APOLLO, 20, 75);
            case EXPLORE_AREA:
                return new GodQuest("apollo_sun_temple", "Temple of the Sun", 
                    "Explore 4 bright, open areas to honor Apollo", 
                    type, 4, God.APOLLO, 30, 125);
            default:
                return createDefaultQuest(God.APOLLO, random);
        }
    }
    
    private static GodQuest createArtemisQuest(Random random) {
        QuestType[] types = {QuestType.EXPLORE_AREA, QuestType.COLLECT_ITEMS, QuestType.CRAFT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case EXPLORE_AREA:
                return new GodQuest("artemis_wilderness_explorer", "Explorer of the Wild", 
                    "Explore 6 forest and wilderness areas", 
                    type, 6, God.ARTEMIS, 20, 75);
            case COLLECT_ITEMS:
                return new GodQuest("artemis_nature_collector", "Gatherer of Nature", 
                    "Collect 15 nature-related items to honor Artemis", 
                    type, 15, God.ARTEMIS, 30, 125);
            case CRAFT_ITEMS:
                return new GodQuest("artemis_huntress_craftsman", "Craftsman of the Hunt", 
                    "Craft 12 hunting and wilderness-related items", 
                    type, 12, God.ARTEMIS, 25, 100);
            default:
                return createDefaultQuest(God.ARTEMIS, random);
        }
    }
    
    private static GodQuest createHermesQuest(Random random) {
        QuestType[] types = {QuestType.TRAVEL_DISTANCE, QuestType.COLLECT_ITEMS, QuestType.USE_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case TRAVEL_DISTANCE:
                return new GodQuest("hermes_speed_trial", "Swift as the Wind", 
                    "Travel 2000 blocks to prove your speed to Hermes", 
                    type, 2000, God.HERMES, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("hermes_traveler_collector", "Traveler's Collection", 
                    "Collect 20 items from different biomes", 
                    type, 20, God.HERMES, 20, 75);
            case USE_ITEMS:
                return new GodQuest("hermes_speed_items", "Speed of the Messenger", 
                    "Use 15 speed-enhancing items", 
                    type, 15, God.HERMES, 30, 125);
            default:
                return createDefaultQuest(God.HERMES, random);
        }
    }
    
    private static GodQuest createHephaestusQuest(Random random) {
        QuestType[] types = {QuestType.CRAFT_ITEMS, QuestType.COLLECT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case CRAFT_ITEMS:
                return new GodQuest("hephaestus_master_craftsman", "Master Craftsman", 
                    "Craft 25 metal and fire-related items", 
                    type, 25, God.HEPHAESTUS, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("hephaestus_fire_collector", "Collector of Fire", 
                    "Collect 12 fire and metal-related items. Right-click the Oracle with these items in hand: Iron Ingot, Gold Ingot, Coal, Blaze Rod, Lava Bucket, Redstone, Diamond, Emerald, Lapis Lazuli, Quartz, Obsidian, Netherite Ingot", 
                    type, 12, God.HEPHAESTUS, 20, 75,
                    new String[]{"iron_ingot", "gold_ingot", "coal", "blaze_rod", "lava_bucket", "redstone", "diamond", "emerald", "lapis_lazuli", "quartz", "obsidian", "netherite_ingot"});
            default:
                return createDefaultQuest(God.HEPHAESTUS, random);
        }
    }
    
    private static GodQuest createAphroditeQuest(Random random) {
        QuestType[] types = {QuestType.COLLECT_ITEMS, QuestType.CRAFT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case COLLECT_ITEMS:
                return new GodQuest("aphrodite_beauty_collector", "Collector of Beauty", 
                    "Collect 10 beautiful and rare items", 
                    type, 10, God.APHRODITE, 25, 100);
            case CRAFT_ITEMS:
                return new GodQuest("aphrodite_love_craftsman", "Craftsman of Love", 
                    "Craft 15 decorative and beautiful items", 
                    type, 15, God.APHRODITE, 20, 75);
            default:
                return createDefaultQuest(God.APHRODITE, random);
        }
    }
    
    private static GodQuest createDemeterQuest(Random random) {
        QuestType[] types = {QuestType.CRAFT_ITEMS, QuestType.COLLECT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case CRAFT_ITEMS:
                return new GodQuest("demeter_harvest_craftsman", "Harvest Craftsman", 
                    "Craft 20 farming and harvest-related items", 
                    type, 20, God.DEMETER, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("demeter_nature_collector", "Collector of Nature's Bounty", 
                    "Collect 15 farming and nature items", 
                    type, 15, God.DEMETER, 20, 75);
            default:
                return createDefaultQuest(God.DEMETER, random);
        }
    }
    
    private static GodQuest createDionysusQuest(Random random) {
        QuestType[] types = {QuestType.CRAFT_ITEMS, QuestType.COLLECT_ITEMS};
        QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case CRAFT_ITEMS:
                return new GodQuest("dionysus_festival_craftsman", "Festival Craftsman", 
                    "Craft 15 celebration and party items", 
                    type, 15, God.DIONYSUS, 25, 100);
            case COLLECT_ITEMS:
                return new GodQuest("dionysus_celebration_collector", "Collector of Celebration", 
                    "Collect 10 celebration-related items", 
                    type, 10, God.DIONYSUS, 20, 75);
            default:
                return createDefaultQuest(God.DIONYSUS, random);
        }
    }
    
    private static GodQuest createDefaultQuest(God god, Random random) {
        return new GodQuest("default_" + god.name().toLowerCase(), 
            god.getDisplayName() + "'s Trial", 
            "Complete a trial to gain " + god.getDisplayName() + "'s favor", 
            QuestType.KILL_MOBS, 10, god, 15, 50,
            new String[]{"zombie_head", "skeleton_skull", "spider_eye", "creeper_head"});
    }
} 