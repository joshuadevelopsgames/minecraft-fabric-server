package com.example.greekmyth.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class PowerStickItem extends Item {
    
    public PowerStickItem(Settings settings) {
        super(settings);
    }
    
    @Override
    public Text getName(ItemStack stack) {
        return Text.literal("§6§lPower Stick").formatted(Formatting.GOLD, Formatting.BOLD);
    }
} 