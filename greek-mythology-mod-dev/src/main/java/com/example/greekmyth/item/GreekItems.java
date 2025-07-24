package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class GreekItems {
    public static Item ZEUS_BOLT;

    static {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM,
                Identifier.of(GreekMythologyMod.MOD_ID, "zeus_bolt"));

        ZEUS_BOLT = new ZeusBoltItem(new Settings()
                .maxCount(1)
                .maxDamage(5)
                .rarity(Rarity.EPIC));
        
        Registry.register(Registries.ITEM, key, ZEUS_BOLT);
        GreekMythologyMod.LOGGER.info("Registered Zeus Bolt via factory");
    }

    // Called from mod initializer to ensure this class is loaded.
    public static void init() {}
} 