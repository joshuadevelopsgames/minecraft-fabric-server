package com.example.greekmyth.favor;

/**
 * Represents the different tiers of favor a player can have with a god.
 * Higher tiers unlock more powerful abilities and rewards.
 */
public enum FavorTier {
    DISFAVORED("Disfavored", -1000, -100, "The god actively dislikes you", "🔴"),
    NEUTRAL("Neutral", -99, 99, "The god is indifferent to you", "⚪"),
    RESPECTED("Respected", 100, 499, "The god respects your actions", "🟡"),
    CHOSEN("Chosen", 500, 999, "The god has chosen you as their champion", "🟢"),
    CHAMPION("Champion", 1000, Integer.MAX_VALUE, "You are the god's ultimate champion", "🟣");

    private final String displayName;
    private final int minFavor;
    private final int maxFavor;
    private final String description;
    private final String symbol;

    FavorTier(String displayName, int minFavor, int maxFavor, String description, String symbol) {
        this.displayName = displayName;
        this.minFavor = minFavor;
        this.maxFavor = maxFavor;
        this.description = description;
        this.symbol = symbol;
    }

    public String getDisplayName() {
        return displayName;
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

    public String getSymbol() {
        return symbol;
    }

    /**
     * Get the full display name with symbol
     */
    public String getFullDisplayName() {
        return symbol + " " + displayName;
    }

    /**
     * Check if a favor value falls within this tier
     */
    public boolean containsFavor(int favor) {
        return favor >= minFavor && favor <= maxFavor;
    }

    /**
     * Get the tier for a given favor value
     */
    public static FavorTier getTierForFavor(int favor) {
        for (FavorTier tier : values()) {
            if (tier.containsFavor(favor)) {
                return tier;
            }
        }
        return NEUTRAL; // Fallback
    }

    /**
     * Get the next tier in progression, or null if already at max
     */
    public FavorTier getNextTier() {
        if (this == CHAMPION) {
            return null; // Already at max
        }
        return values()[this.ordinal() + 1];
    }

    /**
     * Get the previous tier in progression, or null if already at min
     */
    public FavorTier getPreviousTier() {
        if (this == DISFAVORED) {
            return null; // Already at min
        }
        return values()[this.ordinal() - 1];
    }

    /**
     * Check if this tier can advance to the next
     */
    public boolean canAdvance() {
        return getNextTier() != null;
    }

    /**
     * Check if this tier can regress to the previous
     */
    public boolean canRegress() {
        return getPreviousTier() != null;
    }
} 