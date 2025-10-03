package com.example.greekmyth.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class CopyStickItem extends Item {
    
    public CopyStickItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public Text getName(ItemStack stack) {
        return Text.literal("§b§lCopy Stick").formatted(Formatting.AQUA, Formatting.BOLD);
    }
}



