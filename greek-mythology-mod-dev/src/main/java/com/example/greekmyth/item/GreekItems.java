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
    public static Item ZEUS_BOLT;
    
    // Called from mod initializer to ensure this class is loaded.
    public static void init() {
        Item.Settings settings = new Item.Settings()
            .maxCount(1)
            .maxDamage(5)
            .fireproof()
            .rarity(Rarity.EPIC)
            .pickaxe(ToolMaterial.NETHERITE, 8.0f, -2.4f)  // Netherite sword-level weapon attributes
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_BOLT_ID));

        ZEUS_BOLT = Registry.register(Registries.ITEM, ZEUS_BOLT_ID,
            new ZeusBoltItem(settings));
        GreekMythologyMod.LOGGER.info("Registered Zeus Bolt via factory with weapon attributes");
    }
} 