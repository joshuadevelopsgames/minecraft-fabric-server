package com.example.aimyth.item;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
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
        // Create items without registry registration (fallback approach)
        ZEUS_BOLT = new ZeusBoltItem(new Item.Settings().maxCount(1).maxDamage(5).fireproof());
        AMBROSIA = new Item(new Item.Settings().maxCount(64).fireproof());
        NECTAR = new Item(new Item.Settings().maxCount(64).fireproof());
        SOUL_FRAGMENT = new Item(new Item.Settings().maxCount(64).fireproof());
        DIVINE_SOUL = new Item(new Item.Settings().maxCount(64).fireproof());
        OLYMPIAN_STEEL = new Item(new Item.Settings().maxCount(64).fireproof());
        DIVINE_ESSENCE = new Item(new Item.Settings().maxCount(64).fireproof());
        
        // Test Text usage like the Oracle pattern
        Text testText = net.minecraft.text.Text.literal("AI Mythology Items Created Successfully!");
        LOGGER.info("Text test: {}", testText.getString());
        
        AIMythologyMod.LOGGER.info("Created AI Mythology items without registry registration");
        AIMythologyMod.LOGGER.info("Text usage test successful - ready for command system");
    }
} 