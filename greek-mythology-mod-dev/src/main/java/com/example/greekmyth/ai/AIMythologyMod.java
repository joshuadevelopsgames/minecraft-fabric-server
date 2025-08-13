package com.example.aimyth;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.aimyth.item.AIItems;
import com.example.aimyth.item.StygianWaterBucketItem;
import com.example.aimyth.event.StygianWaterHandler;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * Main initializer for the AI Mythology mod.
 */
public class AIMythologyMod implements ModInitializer {
    
    public static final String MOD_ID = "aimyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Stygian Water - Using vanilla water with custom rendering
    public static Item STYGIAN_WATER_BUCKET;
    
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing AI Mythology mod...");
        
        initStygianWater();
        
        // Initialize items
        initItems();
        
        // Initialize commands
        initCommands();
        
        // Initialize event handlers
        initEventHandlers();
        
        LOGGER.info("AI Mythology mod initialized successfully!");
    }
    
    private void initStygianWater() {
        LOGGER.info("Initializing Stygian Water fluid...");
        
        // Register the bucket item that places vanilla water
        STYGIAN_WATER_BUCKET = Registry.register(Registries.ITEM, 
            Identifier.of(MOD_ID, "stygian_water_bucket"), 
            new StygianWaterBucketItem(Fluids.WATER, new Item.Settings()
                .recipeRemainder(Items.BUCKET)
                .maxCount(1)
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "stygian_water_bucket")))));
        
        LOGGER.info("Stygian Water fluid initialized successfully!");
    }
    
    private void initItems() {
        LOGGER.info("Initializing AI Mythology items...");
        AIItems.init();
        LOGGER.info("AI Mythology items initialized successfully!");
    }
    
    private void initCommands() {
        LOGGER.info("Initializing AI Mythology commands...");
        
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            // Register help command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("help")
                .then(net.minecraft.server.command.CommandManager.literal("aimyth")
                    .executes(context -> {
                        return showAIMythologyHelp(context.getSource());
                    })));
            
            // Register version command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("aimythversion")
                .executes(context -> {
                    return showAIMythologyVersion(context.getSource());
                }));
            
            // Register basic favor command (placeholder)
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("favor")
                .executes(context -> {
                    return showFavorPlaceholder(context.getSource());
                }));
            
            LOGGER.info("AI Mythology commands registered successfully!");
        });
        
        LOGGER.info("AI Mythology commands initialized successfully!");
    }
    
    private void initEventHandlers() {
        LOGGER.info("Initializing AI Mythology event handlers...");
        
        // Register Stygian Water effects
        // DISABLED: This was making all water apply wither effects
        // StygianWaterHandler.register();
        
        LOGGER.info("AI Mythology event handlers initialized successfully!");
    }
    
    private static int showFavorPlaceholder(net.minecraft.server.command.ServerCommandSource source) {
        source.sendMessage(net.minecraft.text.Text.literal("§6=== AI Mythology Favor System ===").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("§eFavor system coming in version 1.0.18!"));
        source.sendMessage(net.minecraft.text.Text.literal("§7Gain favor with the 12 Olympian gods:"));
        source.sendMessage(net.minecraft.text.Text.literal("§7- Zeus, Poseidon, Hades (The Big Three)"));
        source.sendMessage(net.minecraft.text.Text.literal("§7- Athena, Ares, Apollo, Artemis"));
        source.sendMessage(net.minecraft.text.Text.literal("§7- Hermes, Hephaestus, Aphrodite"));
        source.sendMessage(net.minecraft.text.Text.literal("§7- Demeter, Dionysus"));
        return 1;
    }
    
    private static int showAIMythologyHelp(net.minecraft.server.command.ServerCommandSource source) {
        source.sendMessage(net.minecraft.text.Text.literal("§6=== AI Mythology Mod Help ===").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("§e/aimythversion §7- Show mod version"));
        source.sendMessage(net.minecraft.text.Text.literal("§e/help aimyth §7- Show this help"));
        source.sendMessage(net.minecraft.text.Text.literal("§e/favor §7- Show favor system info"));
        source.sendMessage(net.minecraft.text.Text.literal("§6=== Features ===").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("§e- Zeus Bolt: Legendary lightning weapon"));
        source.sendMessage(net.minecraft.text.Text.literal("§e- Ambrosia & Nectar: Divine consumables"));
        source.sendMessage(net.minecraft.text.Text.literal("§e- Soul Fragments: Mystical materials"));
        source.sendMessage(net.minecraft.text.Text.literal("§e- Divine Favor System: Coming soon!"));
        return 1;
    }
    
    private static int showAIMythologyVersion(net.minecraft.server.command.ServerCommandSource source) {
        source.sendMessage(net.minecraft.text.Text.literal("§6AI Mythology Mod §eVersion 1.0.17").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("§7Built with Fabric API for Minecraft 1.21.8"));
        source.sendMessage(net.minecraft.text.Text.literal("§7Features: Items, Commands, Text System"));
        return 1;
    }
} 