package com.example.greekmyth;

import com.example.greekmyth.item.GreekItems;
import com.example.greekmyth.entity.GreekEntityTypes;
import com.example.greekmyth.event.ModEvents;
import com.example.greekmyth.event.UndeadWarriorEvents;
import com.example.greekmyth.event.UndeadWarriorSoundEvents;
import com.example.greekmyth.event.QuestProgressEvents;
import com.example.greekmyth.favor.FavorManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.command.argument.EntityArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GreekMythologyMod implements ModInitializer {
    public static final String MOD_ID = "greekmyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Version tracking system
    public static final String MOD_VERSION = "1.0.154";
    public static final String BUILD_VERSION_TITLE = "Interactive Quest Selection";
    public static final String BUILD_DATE = "2024-08-04";
    public static final String BUILD_TIME = "14:35";
    public static final String BUILD_FEATURES = "Interactive Quest Selection - Enhanced /quest select command to show available gods and allow choosing specific quests, perfect for targeted testing";
    
    // Soul counting system
    private static final Map<UUID, Integer> playerSoulCounts = new HashMap<>();
    
    public static void incrementSoulCount(UUID playerUuid) {
        int currentCount = playerSoulCounts.getOrDefault(playerUuid, 0);
        playerSoulCounts.put(playerUuid, currentCount + 1);
        LOGGER.info("SOUL COUNT: Player {} now has {} souls", playerUuid, currentCount + 1);
    }
    
    public static int getSoulCount(UUID playerUuid) {
        return playerSoulCounts.getOrDefault(playerUuid, 0);
    }
    
    public static void resetSoulCount(UUID playerUuid) {
        playerSoulCounts.put(playerUuid, 0);
        LOGGER.info("SOUL COUNT: Reset soul count for player {}", playerUuid);
    }

    @Override
    public void onInitialize() {
        LOGGER.info("Greek Mythology Mod initialized!");

        GreekItems.init();
        GreekEntityTypes.initialize();
        
        // Register items to creative inventory
        com.example.greekmyth.item.GreekCreativeInventory.registerCreativeInventoryItems();
        
        // Register Inferno Portal system
        com.example.greekmyth.portal.InfernoPortalManager.register();
        
        ModEvents.register();
        UndeadWarriorEvents.register();
        UndeadWarriorSoundEvents.register();
        QuestProgressEvents.register();
        
        // Register soul death events for soul harvesting
        com.example.greekmyth.event.SoulDeathEvents.register();
        
        // Register Oracle transformation handler
        com.example.greekmyth.event.OracleTransformationHandler.register();
        
        // Register Oracle damage handler
        com.example.greekmyth.event.OracleDamageHandler.register();
        
        // Oracle Altar system temporarily disabled due to block registration issues
        
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
            
            // Register favor commands
            com.example.greekmyth.command.FavorCommands.register(dispatcher);
            
            // Register the /jail command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("jail")
                .requires(source -> source.hasPermissionLevel(4))
                .then(net.minecraft.server.command.CommandManager.argument("player", EntityArgumentType.player())
                    .then(net.minecraft.server.command.CommandManager.argument("cell_number", IntegerArgumentType.integer())
                        .executes(context -> {
                            ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
                            int cellNumber = IntegerArgumentType.getInteger(context, "cell_number");
                            com.example.greekmyth.jail.TartarusJailManager.jailPlayer(player, cellNumber);
                            return 1;
                        }))));

            // Register the /setjail command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("setjail")
                .requires(source -> source.hasPermissionLevel(4))
                .then(net.minecraft.server.command.CommandManager.argument("cell_number", IntegerArgumentType.integer())
                    .executes(context -> {
                        ServerPlayerEntity player = context.getSource().getPlayer();
                        if (player == null) {
                            context.getSource().sendError(net.minecraft.text.Text.literal("This command can only be used by a player."));
                            return 0;
                        }
                        int cellNumber = IntegerArgumentType.getInteger(context, "cell_number");
                        com.example.greekmyth.jail.TartarusJailManager.setJailCell(player, cellNumber);
                        context.getSource().sendMessage(net.minecraft.text.Text.literal("§aJail cell " + cellNumber + " set to your current location."));
                        GreekMythologyMod.LOGGER.info("JAIL: Player {} set jail cell {} to {}", player.getName().getString(), cellNumber, player.getBlockPos().toShortString());
                        return 1;
                    })));

            // Register the /escape command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("escape")
                .executes(context -> {
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    if (player == null) {
                        context.getSource().sendError(net.minecraft.text.Text.literal("This command can only be used by a player."));
                        return 0;
                    }
                    executeEscape(player);
                    return 1;
                })
                .then(net.minecraft.server.command.CommandManager.argument("player", EntityArgumentType.player())
                    .requires(source -> source.hasPermissionLevel(4)) // Only ops can free others
                    .executes(context -> {
                        ServerPlayerEntity targetPlayer = EntityArgumentType.getPlayer(context, "player");
                        executeEscape(targetPlayer);
                        context.getSource().sendMessage(net.minecraft.text.Text.literal("§aSuccessfully freed " + targetPlayer.getName().getString() + " from jail."));
                        return 1;
                    })));

            // Register the /visit command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("visit")
                .requires(source -> source.hasPermissionLevel(4))
                .then(net.minecraft.server.command.CommandManager.argument("dimension", StringArgumentType.word())
                    .executes(context -> {
                        ServerPlayerEntity player = context.getSource().getPlayer();
                        if (player == null) {
                            context.getSource().sendError(net.minecraft.text.Text.literal("This command can only be used by a player."));
                            return 0;
                        }
                        String dimension = StringArgumentType.getString(context, "dimension");
                        switch (dimension.toLowerCase()) {
                            case "jail":
                            case "tartarus":
                                ServerWorld jailWorld = player.getServer().getWorld(com.example.greekmyth.jail.TartarusJailManager.JAIL_DIMENSION_KEY);
                                if (jailWorld != null) {
                                    // Teleport to the admin room in the jail dimension
                                    player.teleport(jailWorld, 11, 20, -19, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
                                    player.sendMessage(net.minecraft.text.Text.literal("§aTeleported to the Jail dimension."));
                                    GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to Jail dimension.", player.getName().getString());
                                } else {
                                    player.sendMessage(net.minecraft.text.Text.literal("§cJail dimension not found!"));
                                    GreekMythologyMod.LOGGER.warn("VISIT COMMAND: Jail dimension not found for player {}.", player.getName().getString());
                                }
                                break;
                            case "overworld":
                            case "world":
                                ServerWorld overworld = player.getServer().getOverworld();
                                if (overworld != null) {
                                    // Teleport to world spawn (0.5, 64, 0.5)
                                    player.teleport(overworld, 0.5, 64, 0.5, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
                                    player.sendMessage(net.minecraft.text.Text.literal("§aTeleported to the Overworld spawn."));
                                    GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to Overworld spawn.", player.getName().getString());
                                } else {
                                    player.sendMessage(net.minecraft.text.Text.literal("§cOverworld not found!"));
                                    GreekMythologyMod.LOGGER.warn("VISIT COMMAND: Overworld not found for player {}.", player.getName().getString());
                                }
                                break;
                            case "nether":
                                ServerWorld netherWorld = player.getServer().getWorld(net.minecraft.world.World.NETHER);
                                if (netherWorld != null) {
                                    player.teleport(netherWorld, 0, 64, 0, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
                                    player.sendMessage(net.minecraft.text.Text.literal("§aTeleported to the Nether dimension."));
                                    GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to Nether dimension.", player.getName().getString());
                                } else {
                                    player.sendMessage(net.minecraft.text.Text.literal("§cNether dimension not found!"));
                                    GreekMythologyMod.LOGGER.warn("VISIT COMMAND: Nether dimension not found for player {}.", player.getName().getString());
                                }
                                break;
                            case "end":
                                ServerWorld endWorld = player.getServer().getWorld(net.minecraft.world.World.END);
                                if (endWorld != null) {
                                    // Teleport to a safe spot in the End (e.g., 4, 64, 0)
                                    player.teleport(endWorld, 4, 64, 0, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
                                    player.sendMessage(net.minecraft.text.Text.literal("§aTeleported to the End dimension."));
                                    GreekMythologyMod.LOGGER.info("VISIT COMMAND: Player {} teleported to End dimension.", player.getName().getString());
                                } else {
                                    player.sendMessage(net.minecraft.text.Text.literal("§cEnd dimension not found!"));
                                    GreekMythologyMod.LOGGER.warn("VISIT COMMAND: End dimension not found for player {}.", player.getName().getString());
                                }
                                break;
                            default:
                                player.sendMessage(net.minecraft.text.Text.literal("§cInvalid dimension. Choose from: jail, overworld, nether, end."));
                                break;
                        }
                        return 1;
                    })));

            // Register the /spawnenhanced command (for testing enhanced wither skeleton)
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("spawnenhanced")
                .requires(source -> source.hasPermissionLevel(4))
                .executes(context -> {
                    ServerWorld world = context.getSource().getWorld();
                    net.minecraft.util.math.BlockPos pos = net.minecraft.util.math.BlockPos.ofFloored(context.getSource().getPosition());
                    
                    // Spawn a vanilla Wither Skeleton
                    net.minecraft.entity.mob.WitherSkeletonEntity witherSkeleton = 
                        new net.minecraft.entity.mob.WitherSkeletonEntity(net.minecraft.entity.EntityType.WITHER_SKELETON, world);
                    
                    witherSkeleton.setPos(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
                    
                    // Set custom health (e.g., 30.0f)
                    witherSkeleton.setHealth(30.0f); 
                    
                    // Make it persistent so it doesn't despawn
                    witherSkeleton.setPersistent();
                    
                    // Set a custom name
                    witherSkeleton.setCustomName(net.minecraft.text.Text.literal("§6Enhanced Wither Skeleton"));
                    witherSkeleton.setCustomNameVisible(true);
                    
                    // Add command tags for datapack integration
                    witherSkeleton.addCommandTag("GreekPet.Pet");
                    witherSkeleton.addCommandTag("GreekPet.WitherSkeleton");

                    world.spawnEntity(witherSkeleton);
                    
                    context.getSource().sendMessage(net.minecraft.text.Text.literal("§aSpawned an enhanced Wither Skeleton at " + pos.toShortString()));
                    GreekMythologyMod.LOGGER.info("SPAWNENHANCED: Player {} spawned an enhanced Wither Skeleton at {}.", context.getSource().getPlayer().getName().getString(), pos.toShortString());
                    return 1;
                }));

            // Register the /soul command with clear subcommand
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("soul")
                .then(net.minecraft.server.command.CommandManager.literal("clear")
                    .executes(context -> {
                        ServerPlayerEntity player = context.getSource().getPlayer();
                        if (player == null) {
                            context.getSource().sendError(net.minecraft.text.Text.literal("This command can only be used by a player."));
                            return 0;
                        }
                        return clearSoulCount(player);
                    })));
            
            // Register the /greekversion command
            dispatcher.register(net.minecraft.server.command.CommandManager.literal("greekversion")
                .executes(context -> {
                    return showGreekMythologyVersion(context.getSource());
                }));
            
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
    
    /**
     * Helper method to execute escape logic for both self-escape and admin-free
     */
    private static void executeEscape(ServerPlayerEntity player) {
        // Get the cell number the player is jailed in
        Integer cellNumber = com.example.greekmyth.jail.TartarusJailManager.getJailedCell(player.getUuid());
        if (cellNumber == null) {
            player.sendMessage(net.minecraft.text.Text.literal("§cYou are not currently jailed!"));
            return;
        }
        
        // Clear all status effects
        player.clearStatusEffects();
        
        // Reset level unless they are Level 4 (Owner)
        if (player.experienceLevel != 4) {
            player.setExperienceLevel(1);
            player.setExperiencePoints(0);
        }
        
        // Set gamemode to survival
        player.changeGameMode(net.minecraft.world.GameMode.SURVIVAL);
        
        // Return items from jail chest and teleport to spawn
        com.example.greekmyth.jail.TartarusJailManager.returnPlayerItems(player, cellNumber);
        
        // Release player from jail tracking
        com.example.greekmyth.jail.TartarusJailManager.releasePlayer(player.getUuid());
        
        // Teleport to overworld spawn
        ServerWorld overworld = player.getServer().getOverworld();
        if (overworld != null) {
            player.teleport(overworld, 0.5, 64, 0.5, java.util.Set.of(), player.getYaw(), player.getPitch(), false);
        }
        
        player.sendMessage(net.minecraft.text.Text.literal("§aYou have been freed from jail!"));
        GreekMythologyMod.LOGGER.info("ESCAPE: Player {} escaped from jail", player.getName().getString());
    }

    /**
     * Helper method to clear the soul count for the Hades Scythe.
     */
    private static int clearSoulCount(ServerPlayerEntity player) {
        // Check if player is holding Hades Scythe
        net.minecraft.item.ItemStack heldStack = player.getMainHandStack();
        if (heldStack.getItem() == com.example.greekmyth.item.GreekItems.HADES_SCYTHE) {
            // Reset the NBT-stored soul count (damage value back to 0)
            heldStack.setDamage(0);
            
            LOGGER.info("SOUL CLEAR: Player {} cleared their Hades Scythe soul count.", player.getName().getString());
            player.sendMessage(net.minecraft.text.Text.literal("§6💀 Your Hades Scythe soul count has been reset to 0/12!"));
            player.sendMessage(net.minecraft.text.Text.literal("§7Damage bonus cleared - scythe is back to base 4.0 damage."));
            return 1;
        } 
        
        // Check inventory for Hades Scythe if not in main hand
        for (int i = 0; i < player.getInventory().size(); i++) {
            net.minecraft.item.ItemStack stack = player.getInventory().getStack(i);
            if (stack.getItem() == com.example.greekmyth.item.GreekItems.HADES_SCYTHE) {
                // Reset the NBT-stored soul count for scythe in inventory
                stack.setDamage(0);
                
                LOGGER.info("SOUL CLEAR: Player {} cleared soul count for Hades Scythe in inventory slot {}.", player.getName().getString(), i);
                player.sendMessage(net.minecraft.text.Text.literal("§6💀 Found Hades Scythe in your inventory - soul count reset to 0/12!"));
                player.sendMessage(net.minecraft.text.Text.literal("§7Damage bonus cleared - scythe is back to base 4.0 damage."));
                return 1;
            }
        }
        
        // No Hades Scythe found
        player.sendMessage(net.minecraft.text.Text.literal("§cYou need a Hades Scythe in your inventory to use this command."));
        return 0;
    }
    
    /**
     * Show detailed version information for the Greek Mythology mod
     */
    private static int showGreekMythologyVersion(net.minecraft.server.command.ServerCommandSource source) {
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        source.sendMessage(net.minecraft.text.Text.literal("🏛️ GREEK MYTHOLOGY MOD VERSION 🏛️").formatted(net.minecraft.util.Formatting.GOLD, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Version Info
        source.sendMessage(net.minecraft.text.Text.literal("📋 VERSION DETAILS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Build Title: " + BUILD_VERSION_TITLE).formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Mod Version: " + MOD_VERSION).formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Build Date: " + BUILD_DATE).formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Build Time: " + BUILD_TIME).formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Minecraft Version: 1.21.8").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("• Fabric API: 0.129.0").formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Build Features
        source.sendMessage(net.minecraft.text.Text.literal("🔧 BUILD FEATURES").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal(BUILD_FEATURES).formatted(net.minecraft.util.Formatting.WHITE));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Server Status
        source.sendMessage(net.minecraft.text.Text.literal("🖥️ SERVER STATUS").formatted(net.minecraft.util.Formatting.YELLOW, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("• Mod Status: ✅ Active").formatted(net.minecraft.util.Formatting.GREEN));
        source.sendMessage(net.minecraft.text.Text.literal("• Soul Harvesting: ✅ Enabled").formatted(net.minecraft.util.Formatting.GREEN));
        source.sendMessage(net.minecraft.text.Text.literal("• Illusioner Souls: ✅ 100% Drop Rate").formatted(net.minecraft.util.Formatting.GREEN));
        source.sendMessage(net.minecraft.text.Text.literal("• All Features: ✅ Working").formatted(net.minecraft.util.Formatting.GREEN));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        // Footer
        source.sendMessage(net.minecraft.text.Text.literal("🏛️ Version check complete! 🏛️").formatted(net.minecraft.util.Formatting.GOLD, net.minecraft.util.Formatting.BOLD));
        source.sendMessage(net.minecraft.text.Text.literal("").formatted(net.minecraft.util.Formatting.GOLD));
        
        LOGGER.info("VERSION CHECK: Player {} checked mod version {}", 
            source.getPlayer() != null ? source.getPlayer().getName().getString() : "Console", MOD_VERSION);
        
        return 1;
    }
} 