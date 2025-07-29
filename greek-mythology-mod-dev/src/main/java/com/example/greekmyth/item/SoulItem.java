package com.example.greekmyth.item;

import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import java.util.function.Consumer;

public class SoulItem extends Item {
    private final String soulName;
    
    public SoulItem(Settings settings, String soulName) {
        super(settings);
        this.soulName = soulName;
    }
    
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("💀 " + soulName).formatted(Formatting.LIGHT_PURPLE, Formatting.BOLD));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Harvested by Hades' Scythe").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("Contains the essence of the fallen").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Soul Item").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC));
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Soul items have a magical glow
    }
    
    public String getSoulName() {
        return soulName;
    }
} 