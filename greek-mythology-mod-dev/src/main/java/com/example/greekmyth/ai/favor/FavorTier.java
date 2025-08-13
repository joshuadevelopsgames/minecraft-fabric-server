package com.example.aimyth.favor;

/**
 * Represents the different tiers of favor with the Olympian gods.
 * Each tier grants different abilities and rewards.
 */
public enum FavorTier {
    DISFAVORED("Disfavored", "§c", -1000, -500, "The gods look upon you with disdain"),
    NEUTRAL("Neutral", "§7", -100, 100, "The gods are indifferent to your actions"),
    RESPECTED("Respected", "§a", 100, 500, "The gods acknowledge your worth"),
    CHOSEN("Chosen", "§b", 500, 1000, "A god has chosen you as their champion"),
    CHAMPION("Champion", "§6", 1000, 2000, "You are a legendary champion of the gods");

    private final String displayName;
    private final String colorCode;
    private final int minFavor;
    private final int maxFavor;
    private final String description;

    FavorTier(String displayName, String colorCode, int minFavor, int maxFavor, String description) {
        this.displayName = displayName;
        this.colorCode = colorCode;
        this.minFavor = minFavor;
        this.maxFavor = maxFavor;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getColorCode() {
        return colorCode;
    }

    public int getMinFavor() {
        return minFavor;
    }

    public int getMaxFavor() {
        return maxFavor;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Get the full colored display name
     */
    public String getFullDisplayName() {
        return colorCode + displayName;
    }

    /**
     * Check if a favor value falls within this tier
     */
    public boolean isInTier(int favorValue) {
        return favorValue >= minFavor && favorValue <= maxFavor;
    }

    /**
     * Get the tier for a specific favor value
     */
    public static FavorTier getTierForFavor(int favorValue) {
        for (FavorTier tier : values()) {
            if (tier.isInTier(favorValue)) {
                return tier;
            }
        }
        return NEUTRAL; // Default fallback
    }

    /**
     * Get the next tier (if possible)
     */
    public FavorTier getNextTier() {
        FavorTier[] tiers = values();
        int currentIndex = ordinal();
        if (currentIndex < tiers.length - 1) {
            return tiers[currentIndex + 1];
        }
        return this; // Already at highest tier
    }

    /**
     * Get the previous tier (if possible)
     */
    public FavorTier getPreviousTier() {
        FavorTier[] tiers = values();
        int currentIndex = ordinal();
        if (currentIndex > 0) {
            return tiers[currentIndex - 1];
        }
        return this; // Already at lowest tier
    }

    /**
     * Check if this is the highest tier
     */
    public boolean isHighestTier() {
        return this == CHAMPION;
    }

    /**
     * Check if this is the lowest tier
     */
    public boolean isLowestTier() {
        return this == DISFAVORED;
    }

    /**
     * Get the progress percentage within this tier
     */
    public double getProgressPercentage(int favorValue) {
        if (!isInTier(favorValue)) {
            return 0.0;
        }
        
        int tierRange = maxFavor - minFavor;
        int valueInTier = favorValue - minFavor;
        
        return (double) valueInTier / tierRange * 100.0;
    }

    /**
     * Get the favor needed to reach the next tier
     */
    public int getFavorNeededForNextTier(int currentFavor) {
        if (isHighestTier()) {
            return 0; // Already at max
        }
        
        FavorTier nextTier = getNextTier();
        return nextTier.getMinFavor() - currentFavor;
    }

    /**
     * Get a formatted description of the tier benefits
     */
    public String getBenefitsDescription() {
        switch (this) {
            case DISFAVORED:
                return "§cThe gods actively work against you. Expect curses and divine punishment.";
            case NEUTRAL:
                return "§7The gods pay you no special attention. You must earn their favor.";
            case RESPECTED:
                return "§aThe gods acknowledge your worth. You receive minor blessings.";
            case CHOSEN:
                return "§bA god has chosen you as their champion. You gain powerful abilities.";
            case CHAMPION:
                return "§6You are a legendary champion. The gods grant you their greatest gifts.";
            default:
                return "§7Unknown tier benefits.";
        }
    }

    /**
     * Get the tier's special abilities
     */
    public String[] getSpecialAbilities() {
        switch (this) {
            case DISFAVORED:
                return new String[]{
                    "Divine curses and punishments",
                    "Hostile creature attraction",
                    "Reduced luck and fortune",
                    "Divine intervention (negative)"
                };
            case NEUTRAL:
                return new String[]{
                    "Basic divine protection",
                    "Standard luck",
                    "Normal creature behavior",
                    "No special abilities"
                };
            case RESPECTED:
                return new String[]{
                    "Enhanced divine protection",
                    "Improved luck",
                    "Friendly creature behavior",
                    "Minor divine blessings"
                };
            case CHOSEN:
                return new String[]{
                    "Major divine protection",
                    "Significant luck boost",
                    "Creature assistance",
                    "Powerful divine abilities",
                    "Divine intervention (positive)"
                };
            case CHAMPION:
                return new String[]{
                    "Maximum divine protection",
                    "Legendary luck",
                    "Creature mastery",
                    "Ultimate divine abilities",
                    "Frequent divine intervention",
                    "Immortality potential"
                };
            default:
                return new String[]{"Unknown abilities"};
        }
    }
} 