package com.example.greekmyth.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;

public class OracleTagItem extends Item implements FabricItem {
    private final String godName;
    private final String color;
    
    public OracleTagItem(String godName, String color, Item.Settings settings) {
        super(settings);
        this.godName = godName;
        this.color = color;
    }
    
    @Override
    public Text getName(ItemStack stack) {
        return Text.literal(color + "§l" + godName + " Oracle Tag").formatted(Formatting.BOLD);
    }
    
    public String getGodName() {
        return godName;
    }
    
    public String getColor() {
        return color;
    }
}
