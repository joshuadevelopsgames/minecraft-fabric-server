package com.example.greekmyth;

import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.event.ModEvents;
import com.example.greekmyth.favor.FavorManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreekMythologyMod implements ModInitializer {
    public static final String MOD_ID = "greekmyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Greek Mythology Mod initialized!");

        GreekItems.init();
        ModEvents.register();
        
        // Initialize favor system
        LOGGER.info("Initializing Greek Mythology Favor System...");
        FavorManager.init();
        
        // Register commands
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LOGGER.info("Registering Greek Mythology commands...");
            
            // Register help command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("help")
                .then(net.minecraft.server.command.CommandManager.literal("greekmyth")
                    .executes(context -> {
                        return showGreekMythologyHelp(context.getSource());
                    })));
            
            LOGGER.info("Greek Mythology commands registered successfully!");
        });
        
        LOGGER.info("Greek Mythology Favor System initialized successfully!");
    }
    
    /**
     * Show comprehensive help for the Greek Mythology mod
     */
    private static int showGreekMythologyHelp(net.minecraft.server.command.ServerCommandSource source) {
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("🏛️ GREEK MYTHOLOGY MOD HELP 🏛️").formatted(net.minecraft.util.Formatting.GOLD, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Overview
        source.sendMessage(net.minecraft.text.Text.literal("📖 OVERVIEW").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("Welcome to the Greek Mythology mod! This mod brings the power of the Olympian gods to your Minecraft world.").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Items Section
        source.sendMessage(net.minecraft.text.Text.literal("⚡ ITEMS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Zeus Bolt: A powerful lightning weapon with multiple abilities").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("  - Right-click: Cast lightning (5 charges, 30s cooldown)").formatted(net.minecraft.util.Formatting.GRAY));
        source.sendMessage(net.minecraft.text.Text.literal("  - Shift + Right-click: Flight burst (levitation)").formatted(net.minecraft.util.Formatting.GRAY));
        source.sendMessage(net.minecraft.text.Text.literal("  - Fireproof: Cannot be destroyed by fire or lava").formatted(net.minecraft.util.Formatting.GRAY));
        source.sendMessage(net.minecraft.text.Text.literal("  - Weather bonus: Infinite charges during rain/thunder").formatted(net.minecraft.util.Formatting.GRAY));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Favor System Section
        source.sendMessage(net.minecraft.text.Text.literal("🏛️ FAVOR SYSTEM").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("Gain favor with the 12 Olympian gods through your actions:").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // The Big Three
        source.sendMessage(net.minecraft.text.Text.literal("⚡ THE BIG THREE (Most Powerful)").formatted(net.minecraft.util.Formatting.LIGHT_PURPLE, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Zeus, King of the Gods: Lightning, weather, leadership").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Poseidon, Lord of the Seas: Water, horses, earthquakes").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hades, Lord of the Underworld: Death, riches, the dead").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Other Gods
        source.sendMessage(net.minecraft.text.Text.literal("🏺 OTHER OLYMPIANS").formatted(net.minecraft.util.Formatting.BLUE, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Athena: Wisdom, warfare, crafts").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Ares: War, violence, courage").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Apollo: Sun, music, healing, prophecy").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Artemis: Moon, hunting, wilderness").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hermes: Travel, commerce, messages").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hephaestus: Fire, smithing, crafts").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Aphrodite: Love, beauty, desire").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Demeter: Agriculture, harvest, fertility").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Dionysus: Wine, revelry, theater").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Favor Tiers
        source.sendMessage(net.minecraft.text.Text.literal("📊 FAVOR TIERS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        for (com.example.greekmyth.favor.FavorTier tier : com.example.greekmyth.favor.FavorTier.values()) {
            String tierInfo = String.format("• %s: %s (%d to %d favor)", 
                tier.getDisplayName(), 
                tier.getDescription(),
                tier.getMinFavor(),
                tier.getMaxFavor());
            net.minecraft.util.Formatting color = tier == com.example.greekmyth.favor.FavorTier.CHAMPION ? net.minecraft.util.Formatting.LIGHT_PURPLE :
                             tier == com.example.greekmyth.favor.FavorTier.CHOSEN ? net.minecraft.util.Formatting.GREEN :
                             tier == com.example.greekmyth.favor.FavorTier.RESPECTED ? net.minecraft.util.Formatting.YELLOW :
                             tier == com.example.greekmyth.favor.FavorTier.NEUTRAL ? net.minecraft.util.Formatting.WHITE : net.minecraft.util.Formatting.RED;
            source.sendMessage(net.minecraft.text.Text.literal(tierInfo).formatted(color));
        }
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Commands Section
        source.sendMessage(net.minecraft.text.Text.literal("💬 COMMANDS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• /help greekmyth: Show this help message").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• /favor get <GOD>: Check your favor with a specific god").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• /favor add <GOD> <AMOUNT>: Add favor points").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• /favor set <GOD> <AMOUNT>: Set favor points").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• /favor profile: View your complete favor profile").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• /favor summary: View system statistics (admin only)").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // How to Gain Favor
        source.sendMessage(net.minecraft.text.Text.literal("🎯 HOW TO GAIN FAVOR").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Zeus: Use lightning, respect the weather, be a leader").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Poseidon: Swim, fish, ride horses, respect water").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hades: Mine deep, respect the dead, value riches").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Athena: Build, craft, fight strategically").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Ares: Fight, be brave, engage in combat").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Apollo: Play music, heal others, respect the sun").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Artemis: Hunt, explore wilderness, respect nature").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hermes: Travel, trade, deliver messages").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Hephaestus: Smith, craft, work with fire").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Aphrodite: Be kind, create beauty, spread love").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Demeter: Farm, harvest, respect agriculture").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Dionysus: Celebrate, create art, enjoy life").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Tips
        source.sendMessage(net.minecraft.text.Text.literal("💡 TIPS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Favor decays over time - stay active to maintain it").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• The Big Three (Zeus, Poseidon, Hades) have more power").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Higher favor tiers unlock better rewards and abilities").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• You can gain favor with multiple gods simultaneously").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Check your profile regularly to see your progress").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Version Info
        source.sendMessage(net.minecraft.text.Text.literal("📋 VERSION INFO").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Mod Version: 1.0.40").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Minecraft Version: 1.21.8").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Fabric API: 0.129.0").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Footer
        source.sendMessage(net.minecraft.text.Text.literal("🏛️ May the gods favor your journey! 🏛️").formatted(net.minecraft.util.Formatting.GOLD, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        return 1;
    }
} 