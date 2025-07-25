package com.example.greekmyth.classsystem;

/**
 * Represents the progression tiers in the Greek Mythology class system.
 * Players advance through these tiers as they gain experience and prove themselves.
 */
public enum ClassTier {
    MORTAL("Mortal", 0, "A regular human with no divine blood"),
    DEMI_GOD("Demi-God", 1, "Claimed by a god, possessing divine blood"),
    HERO("Hero", 2, "A proven demigod who has accomplished great feats"),
    CHAMPION("Champion", 3, "A legendary hero known across the world"),
    MINOR_GOD("Minor God", 4, "An ascended being with god-like powers");

    private final String displayName;
    private final int level;
    private final String description;

    ClassTier(String displayName, int level, String description) {
        this.displayName = displayName;
        this.level = level;
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Get the next tier in progression, or null if already at max
     */
    public ClassTier getNextTier() {
        if (this == MINOR_GOD) {
            return null; // Already at max
        }
        return values()[this.ordinal() + 1];
    }

    /**
     * Check if this tier can advance to the next
     */
    public boolean canAdvance() {
        return getNextTier() != null;
    }
} 