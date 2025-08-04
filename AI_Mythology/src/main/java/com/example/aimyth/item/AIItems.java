package com.example.aimyth.item;

import com.example.aimyth.AIMythologyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AIItems {
    private static final Logger LOGGER = LoggerFactory.getLogger("AIItems");
    
    // Item instances
    public static Item ZEUS_BOLT;
    public static Item AMBROSIA;
    public static Item NECTAR;
    public static Item SOUL_FRAGMENT;
    public static Item DIVINE_SOUL;
    public static Item OLYMPIAN_STEEL;
    public static Item DIVINE_ESSENCE;

    public static void init() {
        // Create items with proper settings
        ZEUS_BOLT = new ZeusBoltItem(new FabricItemSettings().maxCount(1).maxDamage(5).fireproof());
        AMBROSIA = new Item(new FabricItemSettings().maxCount(64).fireproof());
        NECTAR = new Item(new FabricItemSettings().maxCount(64).fireproof());
        SOUL_FRAGMENT = new Item(new FabricItemSettings().maxCount(64).fireproof());
        DIVINE_SOUL = new Item(new FabricItemSettings().maxCount(64).fireproof());
        OLYMPIAN_STEEL = new Item(new FabricItemSettings().maxCount(64).fireproof());
        DIVINE_ESSENCE = new Item(new FabricItemSettings().maxCount(64).fireproof());
        
        // Register items with the game registry
        registerItem("zeus_bolt", ZEUS_BOLT);
        registerItem("ambrosia", AMBROSIA);
        registerItem("nectar", NECTAR);
        registerItem("soul_fragment", SOUL_FRAGMENT);
        registerItem("divine_soul", DIVINE_SOUL);
        registerItem("olympian_steel", OLYMPIAN_STEEL);
        registerItem("divine_essence", DIVINE_ESSENCE);
        
        AIMythologyMod.LOGGER.info("AI Mythology items registered successfully!");
    }
    
    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(AIMythologyMod.MOD_ID, name), item);
        LOGGER.info("Registered item: {}", name);
    }
} 