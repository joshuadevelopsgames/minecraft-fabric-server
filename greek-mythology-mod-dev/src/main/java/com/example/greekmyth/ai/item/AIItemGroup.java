package com.example.aimyth.item;

import com.example.aimyth.AIMythologyMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AIItemGroup {
    public static final ItemGroup AI_MYTHOLOGY_GROUP = Registry.register(
        Registries.ITEM_GROUP,
        Identifier.of(AIMythologyMod.MOD_ID, "ai_mythology"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.aimyth.ai_mythology"))
            .icon(() -> new ItemStack(AIItems.ZEUS_BOLT))
            .entries((context, entries) -> {
                entries.add(AIItems.ZEUS_BOLT);
                entries.add(AIItems.AMBROSIA);
                entries.add(AIItems.NECTAR);
                entries.add(AIItems.SOUL_FRAGMENT);
                entries.add(AIItems.DIVINE_SOUL);
                entries.add(AIItems.OLYMPIAN_STEEL);
                entries.add(AIItems.DIVINE_ESSENCE);
            })
            .build()
    );

    public static void register() {
        AIMythologyMod.LOGGER.info("AI Mythology item group registered successfully!");
    }
} 