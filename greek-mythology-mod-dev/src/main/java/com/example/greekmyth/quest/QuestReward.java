package com.example.greekmyth.quest;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class QuestReward {
    private final RewardType type;
    private final String description;
    private final int amount;
    private final ItemStack itemReward;
    
    public QuestReward(RewardType type, String description, int amount) {
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.itemReward = null;
    }
    
    public QuestReward(RewardType type, String description, ItemStack itemReward) {
        this.type = type;
        this.description = description;
        this.amount = 1;
        this.itemReward = itemReward;
    }
    
    public void giveReward(PlayerEntity player) {
        if (player instanceof ServerPlayerEntity serverPlayer) {
            switch (type) {
                case EXPERIENCE:
                    serverPlayer.addExperience(amount);
                    break;
                case GOLDEN_APPLE:
                    serverPlayer.giveItemStack(new ItemStack(net.minecraft.item.Items.GOLDEN_APPLE, amount));
                    break;
                case ENCHANTED_GOLDEN_APPLE:
                    serverPlayer.giveItemStack(new ItemStack(net.minecraft.item.Items.ENCHANTED_GOLDEN_APPLE, amount));
                    break;
                case DIAMOND:
                    serverPlayer.giveItemStack(new ItemStack(net.minecraft.item.Items.DIAMOND, amount));
                    break;
                case EMERALD:
                    serverPlayer.giveItemStack(new ItemStack(net.minecraft.item.Items.EMERALD, amount));
                    break;
                case CUSTOM_ITEM:
                    if (itemReward != null) {
                        serverPlayer.giveItemStack(itemReward.copy());
                    }
                    break;
            }
        }
    }
    
    public String getDescription() {
        return description;
    }
    
    public enum RewardType {
        EXPERIENCE,
        GOLDEN_APPLE,
        ENCHANTED_GOLDEN_APPLE,
        DIAMOND,
        EMERALD,
        CUSTOM_ITEM
    }
} 