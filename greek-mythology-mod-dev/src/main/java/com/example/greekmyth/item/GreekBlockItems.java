package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.block.GreekBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GreekBlockItems {
    
    public static final Identifier ORACLE_ALTAR_ITEM_ID = Identifier.of(GreekMythologyMod.MOD_ID, "oracle_altar");
    public static Item ORACLE_ALTAR_ITEM;
    
    public static void register() {
        ORACLE_ALTAR_ITEM = Registry.register(Registries.ITEM, ORACLE_ALTAR_ITEM_ID, 
            new BlockItem(GreekBlocks.ORACLE_ALTAR, new Item.Settings()));
        
        GreekMythologyMod.LOGGER.info("Registered Oracle Altar block item");
    }
} 