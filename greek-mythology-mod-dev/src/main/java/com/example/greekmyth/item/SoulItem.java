package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.function.Consumer;

public class SoulItem extends Item {
    private final String soulName;
    private final net.minecraft.entity.EntityType<?> entityType;

    
    public SoulItem(Settings settings, String soulName, net.minecraft.entity.EntityType<?> entityType) {
        super(settings);
        this.soulName = soulName;
        this.entityType = entityType;
    }
    
    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        // Soul items are now collectible items - no absorption functionality
        if (!world.isClient()) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) user;
            serverPlayer.sendMessage(Text.literal("§7This soul contains the essence of the fallen."), false);
        }
        return ActionResult.SUCCESS;
    }
    

    
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        // Get the soul color
        int soulColor = getSoulColor();
        int r = com.example.greekmyth.util.SoulColorMapper.getRed(soulColor);
        int g = com.example.greekmyth.util.SoulColorMapper.getGreen(soulColor);
        int b = com.example.greekmyth.util.SoulColorMapper.getBlue(soulColor);
        
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        
        // Create colored soul name using the entity's color
        String colorHex = String.format("#%02x%02x%02x", r, g, b);
        tooltip.accept(Text.literal("💀 " + soulName).formatted(Formatting.LIGHT_PURPLE, Formatting.BOLD));
        
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Harvested by Hades' Scythe").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("Contains the essence of the fallen").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Right-click to examine the soul").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("Collectible soul essence").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        
        // Show color information
        tooltip.accept(Text.literal("Color: RGB(" + r + ", " + g + ", " + b + ")").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.accept(Text.literal("Soul Item").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC));
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Soul items have a magical glow
    }
    
    @Override
    public net.minecraft.text.Text getName(ItemStack stack) {
        return net.minecraft.text.Text.literal(getCleanDisplayName());
    }
    
    public String getSoulName() {
        return soulName;
    }
    
    /**
     * Get a clean display name for the hotbar (just the mob type + "Soul")
     */
    public String getCleanDisplayName() {
        // Remove " Soul" suffix if it exists and return clean format
        String cleanName = soulName.replace(" Soul", "");
        return cleanName + "'s Soul";
    }
    
    public net.minecraft.entity.EntityType<?> getEntityType() {
        return entityType;
    }
    
    /**
     * Get the color for this soul based on its entity type
     */
    public int getSoulColor() {
        return com.example.greekmyth.util.SoulColorMapper.getSoulColor(entityType);
    }
    
    /**
     * Get the glowing color for this soul
     */
    public int getGlowColor() {
        return com.example.greekmyth.util.SoulColorMapper.createGlowColor(getSoulColor());
    }
} 