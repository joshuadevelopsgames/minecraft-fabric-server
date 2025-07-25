package com.example.greekmyth.classsystem;

import net.minecraft.util.Identifier;
import java.util.UUID;

/**
 * Represents a player's class data in the Greek Mythology system.
 * Contains their tier, god parent, experience, and other progression data.
 */
public class PlayerClass {
    private final UUID playerUuid;
    private final String playerName;
    private ClassTier tier;
    private GodParent godParent;
    private int experience;
    private int level;
    private long lastAdvancementTime;

    public PlayerClass(UUID playerUuid, String playerName) {
        this.playerUuid = playerUuid;
        this.playerName = playerName;
        this.tier = ClassTier.MORTAL; // Start as mortal
        this.godParent = null; // No god parent initially
        this.experience = 0;
        this.level = 1;
        this.lastAdvancementTime = System.currentTimeMillis();
    }

    // Getters
    public UUID getPlayerUuid() {
        return playerUuid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public ClassTier getTier() {
        return tier;
    }

    public GodParent getGodParent() {
        return godParent;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public long getLastAdvancementTime() {
        return lastAdvancementTime;
    }

    // Setters
    public void setTier(ClassTier tier) {
        this.tier = tier;
        this.lastAdvancementTime = System.currentTimeMillis();
    }

    public void setGodParent(GodParent godParent) {
        this.godParent = godParent;
        // If claiming a god parent, automatically advance to DEMI_GOD if still mortal
        if (this.tier == ClassTier.MORTAL && godParent != null) {
            this.tier = ClassTier.DEMI_GOD;
        }
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Utility methods
    public boolean hasGodParent() {
        return godParent != null;
    }

    public boolean isBigThreeChild() {
        return godParent != null && godParent.isBigThree();
    }

    public String getDisplayName() {
        if (godParent != null) {
            return godParent.getFullDisplayName() + " " + tier.getDisplayName();
        } else {
            return tier.getDisplayName();
        }
    }

    public String getFullDescription() {
        StringBuilder desc = new StringBuilder();
        desc.append(tier.getDisplayName());
        
        if (godParent != null) {
            desc.append(" of ").append(godParent.getDisplayName());
        }
        
        desc.append(" (Level ").append(level).append(")");
        return desc.toString();
    }

    /**
     * Check if the player can advance to the next tier
     */
    public boolean canAdvanceTier() {
        return tier.canAdvance() && hasGodParent();
    }

    /**
     * Get the experience required for the next level
     */
    public int getExperienceForNextLevel() {
        return level * 100; // Simple progression: level * 100 XP
    }

    /**
     * Check if the player has enough experience to level up
     */
    public boolean canLevelUp() {
        return experience >= getExperienceForNextLevel();
    }

    /**
     * Add experience and handle level ups
     */
    public void addExperience(int amount) {
        this.experience += amount;
        
        // Check for level up
        while (canLevelUp()) {
            levelUp();
        }
    }

    /**
     * Handle level up logic
     */
    private void levelUp() {
        this.level++;
        this.experience -= getExperienceForNextLevel();
        this.lastAdvancementTime = System.currentTimeMillis();
    }
} 