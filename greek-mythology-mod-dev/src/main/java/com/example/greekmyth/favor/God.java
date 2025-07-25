package com.example.greekmyth.favor;

/**
 * Represents the Olympian gods who can grant or withdraw favor.
 * The Big Three (Zeus, Poseidon, Hades) have the most power and influence.
 */
public enum God {
    // THE BIG THREE - Most powerful gods
    ZEUS("Zeus", "King of the Gods", "Lightning, Weather, Leadership", true, "⚡"),
    POSEIDON("Poseidon", "God of the Sea", "Water, Earthquakes, Horses", true, "🌊"),
    HADES("Hades", "God of the Underworld", "Death, Wealth, Underground", true, "💀"),

    // OTHER OLYMPIANS
    ATHENA("Athena", "Goddess of Wisdom", "Wisdom, Warfare, Strategy", false, "🛡️"),
    ARES("Ares", "God of War", "War, Violence, Courage", false, "⚔️"),
    APOLLO("Apollo", "God of the Sun", "Sun, Music, Healing, Prophecy", false, "☀️"),
    ARTEMIS("Artemis", "Goddess of the Hunt", "Hunting, Wilderness, Moon", false, "🏹"),
    HERMES("Hermes", "God of Speed", "Speed, Travel, Commerce", false, "⚡"),
    HEPHAESTUS("Hephaestus", "God of Fire", "Fire, Crafting, Technology", false, "🔥"),
    APHRODITE("Aphrodite", "Goddess of Love", "Love, Beauty, Desire", false, "💕"),
    DEMETER("Demeter", "Goddess of Harvest", "Agriculture, Harvest, Nature", false, "🌾"),
    DIONYSUS("Dionysus", "God of Wine", "Wine, Madness, Theater", false, "🍷");

    private final String displayName;
    private final String title;
    private final String domains;
    private final boolean isBigThree;
    private final String symbol;

    God(String displayName, String title, String domains, boolean isBigThree, String symbol) {
        this.displayName = displayName;
        this.title = title;
        this.domains = domains;
        this.isBigThree = isBigThree;
        this.symbol = symbol;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getTitle() {
        return title;
    }

    public String getDomains() {
        return domains;
    }

    public boolean isBigThree() {
        return isBigThree;
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
     * Check if this god is one of the Big Three
     */
    public boolean isBigThreeGod() {
        return isBigThree;
    }

    /**
     * Get a formatted description of the god
     */
    public String getDescription() {
        return displayName + " - " + title + " (" + domains + ")";
    }
} 