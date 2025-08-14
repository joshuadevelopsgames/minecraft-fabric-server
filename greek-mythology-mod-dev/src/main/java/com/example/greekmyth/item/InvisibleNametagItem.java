package com.example.greekmyth.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.fabricmc.fabric.api.item.v1.FabricItem;

/**
 * Invisible Nametag - functions like a regular nametag but shows no text
 * Perfect for preventing mob despawning without visual clutter
 */
public class InvisibleNametagItem extends Item implements FabricItem {
    
    public InvisibleNametagItem(Item.Settings settings) {
        super(settings);
    }
    
    @Override
    public Text getName(ItemStack stack) {
        return Text.literal("§7§lInvisible Nametag").formatted(Formatting.GRAY, Formatting.BOLD);
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        // Give it a subtle enchantment glow to indicate it's special
        return true;
    }
}
