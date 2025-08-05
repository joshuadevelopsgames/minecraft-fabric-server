package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;


public class GreekItems {
    public static final Identifier ZEUS_BOLT_ID = Identifier.of(GreekMythologyMod.MOD_ID, "zeus_bolt");
    public static final Identifier POSEIDON_TRIDENT_ID = Identifier.of(GreekMythologyMod.MOD_ID, "poseidon_trident");
    public static final Identifier HADES_SCYTHE_ID = Identifier.of(GreekMythologyMod.MOD_ID, "hades_scythe");
    public static final Identifier INFERNO_PEARL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "inferno_pearl");
    
    // Soul Items
    public static final Identifier ZOMBIE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "zombie_soul");
    public static final Identifier SKELETON_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "skeleton_soul");
    public static final Identifier SPIDER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "spider_soul");
    public static final Identifier CREEPER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "creeper_soul");
    public static final Identifier ENDERMAN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "enderman_soul");
    public static final Identifier WITCH_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "witch_soul");
    public static final Identifier SLIME_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "slime_soul");
    public static final Identifier BLAZE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "blaze_soul");
    public static final Identifier GHAST_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "ghast_soul");
    public static final Identifier PIGLIN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "piglin_soul");
    public static final Identifier HOGLIN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "hoglin_soul");
    public static final Identifier ZOMBIFIED_PIGLIN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "zombified_piglin_soul");
    public static final Identifier MAGMA_CUBE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "magma_cube_soul");
    public static final Identifier WARDEN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "warden_soul");
    public static final Identifier ELDER_GUARDIAN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "elder_guardian_soul");
    public static final Identifier WITHER_SKELETON_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "wither_skeleton_soul");
    public static final Identifier DROWNED_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "drowned_soul");
    public static final Identifier HUSK_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "husk_soul");
    public static final Identifier STRAY_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "stray_soul");
    public static final Identifier CAVE_SPIDER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "cave_spider_soul");
    public static final Identifier PHANTOM_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "phantom_soul");
    public static final Identifier VINDICATOR_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "vindicator_soul");
    public static final Identifier EVOKER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "evoker_soul");
    public static final Identifier PILLAGER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "pillager_soul");
    public static final Identifier RAVAGER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "ravager_soul");
    public static final Identifier SHULKER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "shulker_soul");
    public static final Identifier SILVERFISH_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "silverfish_soul");
    public static final Identifier ENDERMITE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "endermite_soul");
    public static final Identifier GUARDIAN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "guardian_soul");
    public static final Identifier DOLPHIN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "dolphin_soul");
    public static final Identifier PIG_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "pig_soul");
    public static final Identifier COW_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "cow_soul");
    public static final Identifier SHEEP_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "sheep_soul");
    public static final Identifier CHICKEN_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "chicken_soul");
    public static final Identifier HORSE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "horse_soul");
    public static final Identifier WOLF_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "wolf_soul");
    public static final Identifier CAT_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "cat_soul");
    public static final Identifier FOX_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "fox_soul");
    public static final Identifier RABBIT_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "rabbit_soul");
    public static final Identifier PANDA_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "panda_soul");
    public static final Identifier BEE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "bee_soul");
    public static final Identifier LLAMA_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "llama_soul");
    public static final Identifier TRADER_LLAMA_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "trader_llama_soul");
    public static final Identifier DONKEY_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "donkey_soul");
    public static final Identifier MULE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "mule_soul");
    public static final Identifier PARROT_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "parrot_soul");
    public static final Identifier TURTLE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "turtle_soul");
    public static final Identifier AXOLOTL_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "axolotl_soul");
    public static final Identifier GOAT_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "goat_soul");
    public static final Identifier FROG_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "frog_soul");
    public static final Identifier TADPOLE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "tadpole_soul");
    public static final Identifier ALLAY_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "allay_soul");
    public static final Identifier CAMEL_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "camel_soul");
    public static final Identifier SNIFFER_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "sniffer_soul");
    public static final Identifier ARMADILLO_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "armadillo_soul");
    public static final Identifier BREEZE_SOUL_ID = Identifier.of(GreekMythologyMod.MOD_ID, "breeze_soul");
    // ILLUSIONER_SOUL_ID removed - now functions as Oracle mob
    
    // Oracle Tag Items
    public static final Identifier ZEUS_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "zeus_oracle_tag");
    public static final Identifier POSEIDON_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "poseidon_oracle_tag");
    public static final Identifier HADES_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "hades_oracle_tag");
    public static final Identifier ARES_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "ares_oracle_tag");
    public static final Identifier ATHENA_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "athena_oracle_tag");
    public static final Identifier HEPHAESTUS_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "hephaestus_oracle_tag");
    public static final Identifier APOLLO_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "apollo_oracle_tag");
    public static final Identifier ARTEMIS_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "artemis_oracle_tag");
    public static final Identifier HERMES_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "hermes_oracle_tag");
    public static final Identifier DIONYSUS_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "dionysus_oracle_tag");
    public static final Identifier APHRODITE_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "aphrodite_oracle_tag");
    public static final Identifier DEMETER_ORACLE_TAG_ID = Identifier.of(GreekMythologyMod.MOD_ID, "demeter_oracle_tag");
    
    // Power Stick for zone protection
    public static final Identifier POWER_STICK_ID = Identifier.of(GreekMythologyMod.MOD_ID, "power_stick");
    
    // No PvP Stick for safe zones
    public static final Identifier NO_PVP_STICK_ID = Identifier.of(GreekMythologyMod.MOD_ID, "no_pvp_stick");

    
    public static Item ZEUS_BOLT;
    public static Item POSEIDON_TRIDENT;
    public static Item HADES_SCYTHE;
    public static Item INFERNO_PEARL;
    
    // Soul Items
    public static Item ZOMBIE_SOUL;
    public static Item SKELETON_SOUL;
    public static Item SPIDER_SOUL;
    public static Item CREEPER_SOUL;
    public static Item ENDERMAN_SOUL;
    public static Item WITCH_SOUL;
    public static Item SLIME_SOUL;
    public static Item BLAZE_SOUL;
    public static Item GHAST_SOUL;
    public static Item PIGLIN_SOUL;
    public static Item HOGLIN_SOUL;
    public static Item ZOMBIFIED_PIGLIN_SOUL;
    public static Item MAGMA_CUBE_SOUL;
    public static Item WARDEN_SOUL;
    public static Item ELDER_GUARDIAN_SOUL;
    public static Item WITHER_SKELETON_SOUL;
    public static Item DROWNED_SOUL;
    public static Item HUSK_SOUL;
    public static Item STRAY_SOUL;
    public static Item CAVE_SPIDER_SOUL;
    public static Item PHANTOM_SOUL;
    public static Item VINDICATOR_SOUL;
    public static Item EVOKER_SOUL;
    public static Item PILLAGER_SOUL;
    public static Item RAVAGER_SOUL;
    public static Item SHULKER_SOUL;
    public static Item SILVERFISH_SOUL;
    public static Item ENDERMITE_SOUL;
    public static Item GUARDIAN_SOUL;
    public static Item DOLPHIN_SOUL;
    public static Item PIG_SOUL;
    public static Item COW_SOUL;
    public static Item SHEEP_SOUL;
    public static Item CHICKEN_SOUL;
    public static Item HORSE_SOUL;
    public static Item WOLF_SOUL;
    public static Item CAT_SOUL;
    public static Item FOX_SOUL;
    public static Item RABBIT_SOUL;
    public static Item PANDA_SOUL;
    public static Item BEE_SOUL;
    public static Item LLAMA_SOUL;
    public static Item TRADER_LLAMA_SOUL;
    public static Item DONKEY_SOUL;
    public static Item MULE_SOUL;
    public static Item PARROT_SOUL;
    public static Item TURTLE_SOUL;
    public static Item AXOLOTL_SOUL;
    public static Item GOAT_SOUL;
    public static Item FROG_SOUL;
    public static Item TADPOLE_SOUL;
    public static Item ALLAY_SOUL;
    public static Item CAMEL_SOUL;
    public static Item SNIFFER_SOUL;
    public static Item ARMADILLO_SOUL;
    public static Item BREEZE_SOUL;
    // ILLUSIONER_SOUL removed - now functions as Oracle mob
    
    // Oracle Tag Items
    public static Item ZEUS_ORACLE_TAG;
    public static Item POSEIDON_ORACLE_TAG;
    public static Item HADES_ORACLE_TAG;
    public static Item ARES_ORACLE_TAG;
    public static Item ATHENA_ORACLE_TAG;
    public static Item HEPHAESTUS_ORACLE_TAG;
    public static Item APOLLO_ORACLE_TAG;
    public static Item ARTEMIS_ORACLE_TAG;
    public static Item HERMES_ORACLE_TAG;
    public static Item DIONYSUS_ORACLE_TAG;
    public static Item APHRODITE_ORACLE_TAG;
    public static Item DEMETER_ORACLE_TAG;
    
    // Power Stick for zone protection
    public static Item POWER_STICK;
    
    // No PvP Stick for safe zones
    public static Item NO_PVP_STICK;

    
    // Called from mod initializer to ensure this class is loaded.
    public static void init() {
        // Zeus Bolt
        Item.Settings zeusSettings = new Item.Settings()
            .maxCount(1)
            .maxDamage(5)
            .fireproof()
            .rarity(Rarity.EPIC)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_BOLT_ID));

        ZEUS_BOLT = Registry.register(Registries.ITEM, ZEUS_BOLT_ID,
            new ZeusBoltItem(zeusSettings));
        GreekMythologyMod.LOGGER.info("Registered Zeus Bolt via factory with weapon attributes");
        
        // Poseidon Trident
        Item.Settings tridentSettings = new Item.Settings()
            .maxCount(1)
            .maxDamage(3)
            .fireproof()
            .rarity(Rarity.EPIC)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, POSEIDON_TRIDENT_ID));

        POSEIDON_TRIDENT = Registry.register(Registries.ITEM, POSEIDON_TRIDENT_ID,
            new PoseidonTridentItem(tridentSettings));
        GreekMythologyMod.LOGGER.info("Registered Poseidon Trident via factory with water abilities");
        
        // Hades Scythe
        Item.Settings scytheSettings = new Item.Settings()
            .maxCount(1)
            .maxDamage(4)
            .fireproof()
            .rarity(Rarity.EPIC)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, HADES_SCYTHE_ID));

        HADES_SCYTHE = Registry.register(Registries.ITEM, HADES_SCYTHE_ID,
            new HadesScytheItem(scytheSettings));
        GreekMythologyMod.LOGGER.info("Registered Hades Scythe via factory with underworld abilities");
        
        // Inferno Pearl
        Item.Settings pearlSettings = new Item.Settings()
            .maxCount(16)
            .fireproof()
            .rarity(Rarity.UNCOMMON)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, INFERNO_PEARL_ID));

        INFERNO_PEARL = Registry.register(Registries.ITEM, INFERNO_PEARL_ID,
            new InfernoPearlItem(pearlSettings));
        GreekMythologyMod.LOGGER.info("Registered Inferno Pearl via factory with corruption abilities");
        
        // Register Soul Items
        registerSoulItems();
        
        // Register Oracle Tag Items
        registerOracleTagItems();
        
        // Register Power Stick
        registerPowerStick();
        
        // Register No PvP Stick
        registerNoPvpStick();
    }
    
    private static void registerSoulItems() {
        // Hostile Mobs
        ZOMBIE_SOUL = registerSoulItem(ZOMBIE_SOUL_ID, "Zombie Soul", Rarity.COMMON);
        SKELETON_SOUL = registerSoulItem(SKELETON_SOUL_ID, "Skeleton Soul", Rarity.COMMON);
        SPIDER_SOUL = registerSoulItem(SPIDER_SOUL_ID, "Spider Soul", Rarity.COMMON);
        CREEPER_SOUL = registerSoulItem(CREEPER_SOUL_ID, "Creeper Soul", Rarity.UNCOMMON);
        ENDERMAN_SOUL = registerSoulItem(ENDERMAN_SOUL_ID, "Enderman Soul", Rarity.RARE);
        WITCH_SOUL = registerSoulItem(WITCH_SOUL_ID, "Witch Soul", Rarity.UNCOMMON);
        SLIME_SOUL = registerSoulItem(SLIME_SOUL_ID, "Slime Soul", Rarity.COMMON);
        BLAZE_SOUL = registerSoulItem(BLAZE_SOUL_ID, "Blaze Soul", Rarity.RARE);
        GHAST_SOUL = registerSoulItem(GHAST_SOUL_ID, "Ghast Soul", Rarity.EPIC);
        PIGLIN_SOUL = registerSoulItem(PIGLIN_SOUL_ID, "Piglin Soul", Rarity.UNCOMMON);
        HOGLIN_SOUL = registerSoulItem(HOGLIN_SOUL_ID, "Hoglin Soul", Rarity.UNCOMMON);
        ZOMBIFIED_PIGLIN_SOUL = registerSoulItem(ZOMBIFIED_PIGLIN_SOUL_ID, "Zombified Piglin Soul", Rarity.COMMON);
        MAGMA_CUBE_SOUL = registerSoulItem(MAGMA_CUBE_SOUL_ID, "Magma Cube Soul", Rarity.UNCOMMON);
        WARDEN_SOUL = registerSoulItem(WARDEN_SOUL_ID, "Warden Soul", Rarity.EPIC);
        ELDER_GUARDIAN_SOUL = registerSoulItem(ELDER_GUARDIAN_SOUL_ID, "Elder Guardian Soul", Rarity.EPIC);
        WITHER_SKELETON_SOUL = registerSoulItem(WITHER_SKELETON_SOUL_ID, "Wither Skeleton Soul", Rarity.RARE);
        DROWNED_SOUL = registerSoulItem(DROWNED_SOUL_ID, "Drowned Soul", Rarity.COMMON);
        HUSK_SOUL = registerSoulItem(HUSK_SOUL_ID, "Husk Soul", Rarity.COMMON);
        STRAY_SOUL = registerSoulItem(STRAY_SOUL_ID, "Stray Soul", Rarity.COMMON);
        CAVE_SPIDER_SOUL = registerSoulItem(CAVE_SPIDER_SOUL_ID, "Cave Spider Soul", Rarity.UNCOMMON);
        PHANTOM_SOUL = registerSoulItem(PHANTOM_SOUL_ID, "Phantom Soul", Rarity.UNCOMMON);
        VINDICATOR_SOUL = registerSoulItem(VINDICATOR_SOUL_ID, "Vindicator Soul", Rarity.RARE);
        EVOKER_SOUL = registerSoulItem(EVOKER_SOUL_ID, "Evoker Soul", Rarity.EPIC);
        PILLAGER_SOUL = registerSoulItem(PILLAGER_SOUL_ID, "Pillager Soul", Rarity.UNCOMMON);
        RAVAGER_SOUL = registerSoulItem(RAVAGER_SOUL_ID, "Ravager Soul", Rarity.RARE);
        SHULKER_SOUL = registerSoulItem(SHULKER_SOUL_ID, "Shulker Soul", Rarity.RARE);
        SILVERFISH_SOUL = registerSoulItem(SILVERFISH_SOUL_ID, "Silverfish Soul", Rarity.COMMON);
        ENDERMITE_SOUL = registerSoulItem(ENDERMITE_SOUL_ID, "Endermite Soul", Rarity.UNCOMMON);
        GUARDIAN_SOUL = registerSoulItem(GUARDIAN_SOUL_ID, "Guardian Soul", Rarity.UNCOMMON);
        
        // Passive Mobs
        DOLPHIN_SOUL = registerSoulItem(DOLPHIN_SOUL_ID, "Dolphin Soul", Rarity.COMMON);
        PIG_SOUL = registerSoulItem(PIG_SOUL_ID, "Pig Soul", Rarity.COMMON);
        COW_SOUL = registerSoulItem(COW_SOUL_ID, "Cow Soul", Rarity.COMMON);
        SHEEP_SOUL = registerSoulItem(SHEEP_SOUL_ID, "Sheep Soul", Rarity.COMMON);
        CHICKEN_SOUL = registerSoulItem(CHICKEN_SOUL_ID, "Chicken Soul", Rarity.COMMON);
        HORSE_SOUL = registerSoulItem(HORSE_SOUL_ID, "Horse Soul", Rarity.COMMON);
        WOLF_SOUL = registerSoulItem(WOLF_SOUL_ID, "Wolf Soul", Rarity.COMMON);
        CAT_SOUL = registerSoulItem(CAT_SOUL_ID, "Cat Soul", Rarity.COMMON);
        FOX_SOUL = registerSoulItem(FOX_SOUL_ID, "Fox Soul", Rarity.COMMON);
        RABBIT_SOUL = registerSoulItem(RABBIT_SOUL_ID, "Rabbit Soul", Rarity.COMMON);
        PANDA_SOUL = registerSoulItem(PANDA_SOUL_ID, "Panda Soul", Rarity.COMMON);
        BEE_SOUL = registerSoulItem(BEE_SOUL_ID, "Bee Soul", Rarity.COMMON);
        LLAMA_SOUL = registerSoulItem(LLAMA_SOUL_ID, "Llama Soul", Rarity.COMMON);
        TRADER_LLAMA_SOUL = registerSoulItem(TRADER_LLAMA_SOUL_ID, "Trader Llama Soul", Rarity.COMMON);
        DONKEY_SOUL = registerSoulItem(DONKEY_SOUL_ID, "Donkey Soul", Rarity.COMMON);
        MULE_SOUL = registerSoulItem(MULE_SOUL_ID, "Mule Soul", Rarity.COMMON);
        PARROT_SOUL = registerSoulItem(PARROT_SOUL_ID, "Parrot Soul", Rarity.COMMON);
        TURTLE_SOUL = registerSoulItem(TURTLE_SOUL_ID, "Turtle Soul", Rarity.COMMON);
        AXOLOTL_SOUL = registerSoulItem(AXOLOTL_SOUL_ID, "Axolotl Soul", Rarity.COMMON);
        GOAT_SOUL = registerSoulItem(GOAT_SOUL_ID, "Goat Soul", Rarity.COMMON);
        FROG_SOUL = registerSoulItem(FROG_SOUL_ID, "Frog Soul", Rarity.COMMON);
        TADPOLE_SOUL = registerSoulItem(TADPOLE_SOUL_ID, "Tadpole Soul", Rarity.COMMON);
        ALLAY_SOUL = registerSoulItem(ALLAY_SOUL_ID, "Allay Soul", Rarity.COMMON);
        CAMEL_SOUL = registerSoulItem(CAMEL_SOUL_ID, "Camel Soul", Rarity.COMMON);
        SNIFFER_SOUL = registerSoulItem(SNIFFER_SOUL_ID, "Sniffer Soul", Rarity.COMMON);
        ARMADILLO_SOUL = registerSoulItem(ARMADILLO_SOUL_ID, "Armadillo Soul", Rarity.COMMON);
        BREEZE_SOUL = registerSoulItem(BREEZE_SOUL_ID, "Breeze Soul", Rarity.RARE);
        // ILLUSIONER_SOUL registration removed - now functions as Oracle mob
        
        GreekMythologyMod.LOGGER.info("Registered {} soul items for Hades Scythe soul harvesting", 50);
    }
    
    private static Item registerSoulItem(Identifier id, String name, Rarity rarity) {
        Item.Settings settings = new Item.Settings()
            .maxCount(64)
            .fireproof()
            .rarity(rarity)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, id));
        
        // Map soul name to entity type
        net.minecraft.entity.EntityType<?> entityType = getEntityTypeFromSoulName(name);
            
        Item soulItem = Registry.register(Registries.ITEM, id, new SoulItem(settings, name, entityType));
        GreekMythologyMod.LOGGER.info("Registered soul item: {} for entity: {}", name, entityType);
        return soulItem;
    }
    
    private static net.minecraft.entity.EntityType<?> getEntityTypeFromSoulName(String soulName) {
        // Remove " Soul" suffix and convert to entity type
        String entityName = soulName.replace(" Soul", "").toLowerCase();
        
        // Map soul names to entity types
        switch (entityName) {
            case "zombie": return net.minecraft.entity.EntityType.ZOMBIE;
            case "skeleton": return net.minecraft.entity.EntityType.SKELETON;
            case "spider": return net.minecraft.entity.EntityType.SPIDER;
            case "creeper": return net.minecraft.entity.EntityType.CREEPER;
            case "enderman": return net.minecraft.entity.EntityType.ENDERMAN;
            case "witch": return net.minecraft.entity.EntityType.WITCH;
            case "slime": return net.minecraft.entity.EntityType.SLIME;
            case "blaze": return net.minecraft.entity.EntityType.BLAZE;
            case "ghast": return net.minecraft.entity.EntityType.GHAST;
            case "piglin": return net.minecraft.entity.EntityType.PIGLIN;
            case "hoglin": return net.minecraft.entity.EntityType.HOGLIN;
            case "zombified piglin": return net.minecraft.entity.EntityType.ZOMBIFIED_PIGLIN;
            case "magma cube": return net.minecraft.entity.EntityType.MAGMA_CUBE;
            case "warden": return net.minecraft.entity.EntityType.WARDEN;
            case "elder guardian": return net.minecraft.entity.EntityType.ELDER_GUARDIAN;
            case "wither skeleton": return net.minecraft.entity.EntityType.WITHER_SKELETON;
            case "drowned": return net.minecraft.entity.EntityType.DROWNED;
            case "husk": return net.minecraft.entity.EntityType.HUSK;
            case "stray": return net.minecraft.entity.EntityType.STRAY;
            case "cave spider": return net.minecraft.entity.EntityType.CAVE_SPIDER;
            case "phantom": return net.minecraft.entity.EntityType.PHANTOM;
            case "vindicator": return net.minecraft.entity.EntityType.VINDICATOR;
            case "evoker": return net.minecraft.entity.EntityType.EVOKER;
            case "pillager": return net.minecraft.entity.EntityType.PILLAGER;
            case "ravager": return net.minecraft.entity.EntityType.RAVAGER;
            case "shulker": return net.minecraft.entity.EntityType.SHULKER;
            case "silverfish": return net.minecraft.entity.EntityType.SILVERFISH;
            case "endermite": return net.minecraft.entity.EntityType.ENDERMITE;
            case "guardian": return net.minecraft.entity.EntityType.GUARDIAN;
            case "dolphin": return net.minecraft.entity.EntityType.DOLPHIN;
            case "pig": return net.minecraft.entity.EntityType.PIG;
            case "cow": return net.minecraft.entity.EntityType.COW;
            case "sheep": return net.minecraft.entity.EntityType.SHEEP;
            case "chicken": return net.minecraft.entity.EntityType.CHICKEN;
            case "horse": return net.minecraft.entity.EntityType.HORSE;
            case "wolf": return net.minecraft.entity.EntityType.WOLF;
            case "cat": return net.minecraft.entity.EntityType.CAT;
            case "fox": return net.minecraft.entity.EntityType.FOX;
            case "rabbit": return net.minecraft.entity.EntityType.RABBIT;
            case "panda": return net.minecraft.entity.EntityType.PANDA;
            case "bee": return net.minecraft.entity.EntityType.BEE;
            case "llama": return net.minecraft.entity.EntityType.LLAMA;
            case "trader llama": return net.minecraft.entity.EntityType.TRADER_LLAMA;
            case "donkey": return net.minecraft.entity.EntityType.DONKEY;
            case "mule": return net.minecraft.entity.EntityType.MULE;
            case "parrot": return net.minecraft.entity.EntityType.PARROT;
            case "turtle": return net.minecraft.entity.EntityType.TURTLE;
            case "axolotl": return net.minecraft.entity.EntityType.AXOLOTL;
            case "goat": return net.minecraft.entity.EntityType.GOAT;
            case "frog": return net.minecraft.entity.EntityType.FROG;
            case "tadpole": return net.minecraft.entity.EntityType.TADPOLE;
            case "allay": return net.minecraft.entity.EntityType.ALLAY;
            case "camel": return net.minecraft.entity.EntityType.CAMEL;
            case "sniffer": return net.minecraft.entity.EntityType.SNIFFER;
            case "armadillo": return net.minecraft.entity.EntityType.ARMADILLO;
            case "breeze": return net.minecraft.entity.EntityType.BREEZE;
            case "illusioner": return net.minecraft.entity.EntityType.ILLUSIONER;
            default: return net.minecraft.entity.EntityType.ZOMBIE; // Fallback
        }
    }
    
    private static void registerOracleTagItems() {
        // Zeus Oracle Tag (Yellow - Lightning)
        ZEUS_ORACLE_TAG = Registry.register(Registries.ITEM, ZEUS_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_ORACLE_TAG_ID))));
        
        // Poseidon Oracle Tag (Blue - Water)
        POSEIDON_ORACLE_TAG = Registry.register(Registries.ITEM, POSEIDON_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, POSEIDON_ORACLE_TAG_ID))));
        
        // Hades Oracle Tag (Purple - Underworld)
        HADES_ORACLE_TAG = Registry.register(Registries.ITEM, HADES_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, HADES_ORACLE_TAG_ID))));
        
        // Ares Oracle Tag (Red - War)
        ARES_ORACLE_TAG = Registry.register(Registries.ITEM, ARES_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, ARES_ORACLE_TAG_ID))));
        
        // Athena Oracle Tag (Gray - Wisdom)
        ATHENA_ORACLE_TAG = Registry.register(Registries.ITEM, ATHENA_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, ATHENA_ORACLE_TAG_ID))));
        
        // Hephaestus Oracle Tag (Orange - Fire/Forge)
        HEPHAESTUS_ORACLE_TAG = Registry.register(Registries.ITEM, HEPHAESTUS_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, HEPHAESTUS_ORACLE_TAG_ID))));
        
        // Apollo Oracle Tag (Gold - Sun/Light)
        APOLLO_ORACLE_TAG = Registry.register(Registries.ITEM, APOLLO_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, APOLLO_ORACLE_TAG_ID))));
        
        // Artemis Oracle Tag (Green - Nature/Hunt)
        ARTEMIS_ORACLE_TAG = Registry.register(Registries.ITEM, ARTEMIS_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, ARTEMIS_ORACLE_TAG_ID))));
        
        // Hermes Oracle Tag (Cyan - Speed/Messenger)
        HERMES_ORACLE_TAG = Registry.register(Registries.ITEM, HERMES_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, HERMES_ORACLE_TAG_ID))));
        
        // Dionysus Oracle Tag (Pink - Wine/Festival)
        DIONYSUS_ORACLE_TAG = Registry.register(Registries.ITEM, DIONYSUS_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, DIONYSUS_ORACLE_TAG_ID))));
        
        // Aphrodite Oracle Tag (Magenta - Love/Beauty)
        APHRODITE_ORACLE_TAG = Registry.register(Registries.ITEM, APHRODITE_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, APHRODITE_ORACLE_TAG_ID))));
        
        // Demeter Oracle Tag (Brown - Agriculture)
        DEMETER_ORACLE_TAG = Registry.register(Registries.ITEM, DEMETER_ORACLE_TAG_ID,
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, DEMETER_ORACLE_TAG_ID))));
        
        GreekMythologyMod.LOGGER.info("Registered 12 Oracle Tag items for god-specific Oracle tagging");
    }
    
    private static void registerPowerStick() {
        // Power Stick for zone protection
        POWER_STICK = Registry.register(Registries.ITEM, POWER_STICK_ID,
            new PowerStickItem(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, POWER_STICK_ID))));
        
        GreekMythologyMod.LOGGER.info("Registered Power Stick for zone protection");
    }
    
    private static void registerNoPvpStick() {
        // No PvP Stick for safe zones
        NO_PVP_STICK = Registry.register(Registries.ITEM, NO_PVP_STICK_ID,
            new NoPvpStickItem(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, NO_PVP_STICK_ID))));
        
        GreekMythologyMod.LOGGER.info("Registered No PvP Stick for safe zones");
    }
} 