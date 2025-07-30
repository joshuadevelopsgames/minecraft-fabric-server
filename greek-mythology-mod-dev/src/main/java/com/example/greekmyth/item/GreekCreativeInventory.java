package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;

public class GreekCreativeInventory {
    
    public static void registerCreativeInventoryItems() {
        GreekMythologyMod.LOGGER.info("Registering Greek Mythology items to creative inventory...");
        
        // Add all our items to the "Ingredients" creative tab (where most custom items go)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            // Main Legendary Weapons
            content.add(new ItemStack(GreekItems.ZEUS_BOLT));
            content.add(new ItemStack(GreekItems.POSEIDON_TRIDENT));
            content.add(new ItemStack(GreekItems.HADES_SCYTHE));
            content.add(new ItemStack(GreekItems.INFERNO_PEARL));
            
            // All Soul Items (only the ones that actually exist)
            content.add(new ItemStack(GreekItems.ZOMBIE_SOUL));
            content.add(new ItemStack(GreekItems.SKELETON_SOUL));
            content.add(new ItemStack(GreekItems.SPIDER_SOUL));
            content.add(new ItemStack(GreekItems.CREEPER_SOUL));
            content.add(new ItemStack(GreekItems.ENDERMAN_SOUL));
            content.add(new ItemStack(GreekItems.WITCH_SOUL));
            content.add(new ItemStack(GreekItems.SLIME_SOUL));
            content.add(new ItemStack(GreekItems.BLAZE_SOUL));
            content.add(new ItemStack(GreekItems.GHAST_SOUL));
            content.add(new ItemStack(GreekItems.PIGLIN_SOUL));
            content.add(new ItemStack(GreekItems.HOGLIN_SOUL));
            content.add(new ItemStack(GreekItems.ZOMBIFIED_PIGLIN_SOUL));
            content.add(new ItemStack(GreekItems.MAGMA_CUBE_SOUL));
            content.add(new ItemStack(GreekItems.WARDEN_SOUL));
            content.add(new ItemStack(GreekItems.ELDER_GUARDIAN_SOUL));
            content.add(new ItemStack(GreekItems.WITHER_SKELETON_SOUL));
            content.add(new ItemStack(GreekItems.DROWNED_SOUL));
            content.add(new ItemStack(GreekItems.HUSK_SOUL));
            content.add(new ItemStack(GreekItems.STRAY_SOUL));
            content.add(new ItemStack(GreekItems.CAVE_SPIDER_SOUL));
            content.add(new ItemStack(GreekItems.PHANTOM_SOUL));
            content.add(new ItemStack(GreekItems.VINDICATOR_SOUL));
            content.add(new ItemStack(GreekItems.EVOKER_SOUL));
            content.add(new ItemStack(GreekItems.PILLAGER_SOUL));
            content.add(new ItemStack(GreekItems.RAVAGER_SOUL));
            content.add(new ItemStack(GreekItems.SHULKER_SOUL));
            content.add(new ItemStack(GreekItems.SILVERFISH_SOUL));
            content.add(new ItemStack(GreekItems.ENDERMITE_SOUL));
            content.add(new ItemStack(GreekItems.GUARDIAN_SOUL));
            content.add(new ItemStack(GreekItems.DOLPHIN_SOUL));
            content.add(new ItemStack(GreekItems.PIG_SOUL));
            content.add(new ItemStack(GreekItems.COW_SOUL));
            content.add(new ItemStack(GreekItems.SHEEP_SOUL));
            content.add(new ItemStack(GreekItems.CHICKEN_SOUL));
            content.add(new ItemStack(GreekItems.HORSE_SOUL));
            content.add(new ItemStack(GreekItems.WOLF_SOUL));
            content.add(new ItemStack(GreekItems.CAT_SOUL));
            content.add(new ItemStack(GreekItems.RABBIT_SOUL));
            content.add(new ItemStack(GreekItems.LLAMA_SOUL));
            content.add(new ItemStack(GreekItems.TRADER_LLAMA_SOUL));
            content.add(new ItemStack(GreekItems.PANDA_SOUL));
            content.add(new ItemStack(GreekItems.BEE_SOUL));
            content.add(new ItemStack(GreekItems.DONKEY_SOUL));
            content.add(new ItemStack(GreekItems.MULE_SOUL));
            content.add(new ItemStack(GreekItems.PARROT_SOUL));
            content.add(new ItemStack(GreekItems.TURTLE_SOUL));
            content.add(new ItemStack(GreekItems.AXOLOTL_SOUL));
            content.add(new ItemStack(GreekItems.GOAT_SOUL));
            content.add(new ItemStack(GreekItems.FROG_SOUL));
            content.add(new ItemStack(GreekItems.TADPOLE_SOUL));
            content.add(new ItemStack(GreekItems.ALLAY_SOUL));
            content.add(new ItemStack(GreekItems.CAMEL_SOUL));
            content.add(new ItemStack(GreekItems.SNIFFER_SOUL));
            content.add(new ItemStack(GreekItems.ARMADILLO_SOUL));
            content.add(new ItemStack(GreekItems.BREEZE_SOUL));
        });
        
        // Also add the main weapons to the "Combat" tab where they belong
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(new ItemStack(GreekItems.ZEUS_BOLT));
            content.add(new ItemStack(GreekItems.POSEIDON_TRIDENT));
            content.add(new ItemStack(GreekItems.HADES_SCYTHE));
        });
        
        // Add Inferno Pearl to "Tools" tab (like ender pearls)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(new ItemStack(GreekItems.INFERNO_PEARL));
        });
        
        GreekMythologyMod.LOGGER.info("Successfully registered all Greek Mythology items to creative inventory!");
    }
} 