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
    public static Item ZEUS_BOLT;
    public static Item POSEIDON_TRIDENT;
    public static Item HADES_SCYTHE;
    public static Item INFERNO_PEARL;
    
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
    }
} 