package com.example.aimyth.item;

import com.example.aimyth.AIMythologyMod;
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
        // Create and register items in one step
        ZEUS_BOLT = registerItem("zeus_bolt", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "zeus_bolt")))));
        AMBROSIA = registerItem("ambrosia", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "ambrosia")))));
        NECTAR = registerItem("nectar", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "nectar")))));
        SOUL_FRAGMENT = registerItem("soul_fragment", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "soul_fragment")))));
        DIVINE_SOUL = registerItem("divine_soul", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "divine_soul")))));
        OLYMPIAN_STEEL = registerItem("olympian_steel", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "olympian_steel")))));
        DIVINE_ESSENCE = registerItem("divine_essence", new Item(new Item.Settings().registryKey(net.minecraft.registry.RegistryKey.of(net.minecraft.registry.RegistryKeys.ITEM, net.minecraft.util.Identifier.of(AIMythologyMod.MOD_ID, "divine_essence")))));
        
        AIMythologyMod.LOGGER.info("AI Mythology items registered successfully!");
    }
    
    private static Item registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, Identifier.of(AIMythologyMod.MOD_ID, name), item);
        LOGGER.info("Registered item: {}", name);
        return item;
    }
} 