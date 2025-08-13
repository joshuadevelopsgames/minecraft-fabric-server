package com.example.aimyth.favor;

/**
 * Represents the complete Olympian pantheon who can grant or withdraw favor.
 * Includes the Big Three (Zeus, Poseidon, Hades) and all other major Olympians.
 */
public enum God {
    // THE BIG THREE - Most powerful gods
    ZEUS("Zeus", "King of the Gods", "Lightning, Weather, Leadership, Justice", true, "⚡", "Olympus", "Eagle", "Thunderbolt"),
    POSEIDON("Poseidon", "God of the Sea", "Water, Earthquakes, Horses, Storms", true, "🌊", "Ocean", "Horse", "Trident"),
    HADES("Hades", "God of the Underworld", "Death, Wealth, Underground, Souls", true, "💀", "Underworld", "Cerberus", "Scythe"),

    // OTHER OLYMPIANS
    ATHENA("Athena", "Goddess of Wisdom", "Wisdom, Warfare, Strategy, Crafts", false, "🛡️", "Athens", "Owl", "Aegis"),
    ARES("Ares", "God of War", "War, Violence, Courage, Bloodshed", false, "⚔️", "Thrace", "Vulture", "Spear"),
    APOLLO("Apollo", "God of the Sun", "Sun, Music, Healing, Prophecy, Poetry", false, "☀️", "Delphi", "Raven", "Bow"),
    ARTEMIS("Artemis", "Goddess of the Hunt", "Hunting, Wilderness, Moon, Chastity", false, "🏹", "Forest", "Deer", "Silver Bow"),
    HERMES("Hermes", "God of Speed", "Speed, Travel, Commerce, Messages", false, "⚡", "Roads", "Caduceus", "Winged Sandals"),
    HEPHAESTUS("Hephaestus", "God of Fire", "Fire, Crafting, Technology, Volcanoes", false, "🔥", "Lemnos", "Donkey", "Hammer"),
    APHRODITE("Aphrodite", "Goddess of Love", "Love, Beauty, Desire, Fertility", false, "💕", "Cyprus", "Dove", "Girdle"),
    DEMETER("Demeter", "Goddess of Harvest", "Agriculture, Harvest, Nature, Seasons", false, "🌾", "Eleusis", "Serpent", "Sickle"),
    DIONYSUS("Dionysus", "God of Wine", "Wine, Madness, Theater, Revelry", false, "🍷", "Thebes", "Leopard", "Thyrsus");

    private final String displayName;
    private final String title;
    private final String domains;
    private final boolean isBigThree;
    private final String symbol;
    private final String sacredPlace;
    private final String sacredAnimal;
    private final String sacredWeapon;

    God(String displayName, String title, String domains, boolean isBigThree, String symbol, 
        String sacredPlace, String sacredAnimal, String sacredWeapon) {
        this.displayName = displayName;
        this.title = title;
        this.domains = domains;
        this.isBigThree = isBigThree;
        this.symbol = symbol;
        this.sacredPlace = sacredPlace;
        this.sacredAnimal = sacredAnimal;
        this.sacredWeapon = sacredWeapon;
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

    public String getSacredPlace() {
        return sacredPlace;
    }

    public String getSacredAnimal() {
        return sacredAnimal;
    }

    public String getSacredWeapon() {
        return sacredWeapon;
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

    /**
     * Get the god's sacred information
     */
    public String getSacredInfo() {
        return "Sacred Place: " + sacredPlace + ", Sacred Animal: " + sacredAnimal + ", Sacred Weapon: " + sacredWeapon;
    }

    /**
     * Get all gods that are Big Three
     */
    public static God[] getBigThree() {
        return new God[]{ZEUS, POSEIDON, HADES};
    }

    /**
     * Get all gods except Big Three
     */
    public static God[] getOtherOlympians() {
        return new God[]{ATHENA, ARES, APOLLO, ARTEMIS, HERMES, HEPHAESTUS, APHRODITE, DEMETER, DIONYSUS};
    }

    /**
     * Get all gods
     */
    public static God[] getAllGods() {
        return God.values();
    }
} 