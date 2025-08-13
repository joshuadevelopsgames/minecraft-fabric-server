package com.example.aimyth.classes;

import com.example.aimyth.AIMythologyMod;
import com.example.aimyth.favor.FavorManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DivineClass {
    private static final Map<UUID, String> playerClasses = new HashMap<>();
    private static final Map<UUID, Integer> classLevels = new HashMap<>();
    
    public static final String[] OLYMPIAN_GODS = FavorManager.OLYMPIAN_GODS;
    
    public static void init() {
        AIMythologyMod.LOGGER.info("Initializing AI Mythology Divine Class System...");
    }
    
    public static void checkForDivineClaim(ServerPlayerEntity player, String god) {
        UUID playerId = player.getUuid();
        int favor = FavorManager.getFavor(player, god);
        
        if (favor >= 100 && !hasClass(playerId)) {
            claimPlayer(player, god);
        }
    }
    
    public static void claimPlayer(ServerPlayerEntity player, String god) {
        UUID playerId = player.getUuid();
        playerClasses.put(playerId, god);
        classLevels.put(playerId, 1);
        
        String godName = god.substring(0, 1).toUpperCase() + god.substring(1);
        String className = getClassName(god);
        
        // Send dramatic claim message
        player.sendMessage(Text.literal("").formatted(Formatting.GOLD));
        player.sendMessage(Text.literal("§6⚡ DIVINE CLAIM ⚡").formatted(Formatting.GOLD, Formatting.BOLD));
        player.sendMessage(Text.literal("§e" + godName + " has chosen you as their child!").formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§7You are now a " + className + "!").formatted(Formatting.GRAY));
        player.sendMessage(Text.literal("§7You have gained divine abilities and passive buffs.").formatted(Formatting.GRAY));
        player.sendMessage(Text.literal("").formatted(Formatting.GOLD));
        
        // Apply initial buffs
        applyClassBuffs(player, god, 1);
        
        AIMythologyMod.LOGGER.info("Player {} claimed by {} as {}", player.getName().getString(), godName, className);
    }
    
    public static boolean hasClass(UUID playerId) {
        return playerClasses.containsKey(playerId);
    }
    
    public static String getPlayerClass(UUID playerId) {
        return playerClasses.get(playerId);
    }
    
    public static int getClassLevel(UUID playerId) {
        return classLevels.getOrDefault(playerId, 0);
    }
    
    public static void levelUpClass(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        if (!hasClass(playerId)) return;
        
        String god = getPlayerClass(playerId);
        int currentLevel = getClassLevel(playerId);
        int newLevel = currentLevel + 1;
        
        classLevels.put(playerId, newLevel);
        
        String godName = god.substring(0, 1).toUpperCase() + god.substring(1);
        String className = getClassName(god);
        
        player.sendMessage(Text.literal("§6⚡ CLASS LEVEL UP ⚡").formatted(Formatting.GOLD));
        player.sendMessage(Text.literal("§e" + godName + " grants you more power!").formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§7" + className + " Level: " + currentLevel + " → " + newLevel).formatted(Formatting.GRAY));
        
        // Apply new level buffs
        applyClassBuffs(player, god, newLevel);
        
        AIMythologyMod.LOGGER.info("Player {} leveled up {} class to level {}", player.getName().getString(), className, newLevel);
    }
    
    public static void setClassLevel(ServerPlayerEntity player, int level) {
        UUID playerId = player.getUuid();
        if (!hasClass(playerId)) return;
        
        String god = getPlayerClass(playerId);
        int oldLevel = getClassLevel(playerId);
        
        classLevels.put(playerId, level);
        
        String godName = god.substring(0, 1).toUpperCase() + god.substring(1);
        String className = getClassName(god);
        
        player.sendMessage(Text.literal("§6⚡ CLASS LEVEL SET ⚡").formatted(Formatting.GOLD));
        player.sendMessage(Text.literal("§e" + godName + " adjusts your power!").formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§7" + className + " Level: " + oldLevel + " → " + level).formatted(Formatting.GRAY));
        
        // Apply new level buffs
        applyClassBuffs(player, god, level);
        
        AIMythologyMod.LOGGER.info("Player {} {} class level set to {}", player.getName().getString(), className, level);
    }
    
    public static void showClassStatus(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        
        if (!hasClass(playerId)) {
            player.sendMessage(Text.literal("§7You have not been claimed by any god yet.").formatted(Formatting.GRAY));
            player.sendMessage(Text.literal("§7Reach 100 favor with a god to be claimed as their child.").formatted(Formatting.GRAY));
            return;
        }
        
        String god = getPlayerClass(playerId);
        int level = getClassLevel(playerId);
        String godName = god.substring(0, 1).toUpperCase() + god.substring(1);
        String className = getClassName(god);
        
        player.sendMessage(Text.literal("§6=== Your Divine Class ===").formatted(Formatting.GOLD));
        player.sendMessage(Text.literal("§eGod: " + godName).formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§eClass: " + className).formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§eLevel: " + level).formatted(Formatting.YELLOW));
        player.sendMessage(Text.literal("§6=== Abilities ===").formatted(Formatting.GOLD));
        
        // Show class-specific abilities
        showClassAbilities(player, god, level);
    }
    
    private static void showClassAbilities(ServerPlayerEntity player, String god, int level) {
        switch (god) {
            case "zeus":
                player.sendMessage(Text.literal("§e⚡ Lightning Mastery").formatted(Formatting.YELLOW));
                player.sendMessage(Text.literal("§7- Passive: Lightning absorption (heals & empowers)").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Call lightning (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Flight in storms").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Thunder clap").formatted(Formatting.GRAY));
                }
                break;
            case "poseidon":
                player.sendMessage(Text.literal("§b🌊 Ocean Lord").formatted(Formatting.AQUA));
                player.sendMessage(Text.literal("§7- Passive: Water breathing").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Summon trident (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Swim speed boost").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Tidal wave").formatted(Formatting.GRAY));
                }
                break;
            case "hades":
                player.sendMessage(Text.literal("§8💀 Shadow Walker").formatted(Formatting.DARK_GRAY));
                player.sendMessage(Text.literal("§7- Passive: Night vision").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Shadow step (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Undead ignore you").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Summon souls").formatted(Formatting.GRAY));
                }
                break;
            case "athena":
                player.sendMessage(Text.literal("§f⚔️ Wise Warrior").formatted(Formatting.WHITE));
                player.sendMessage(Text.literal("§7- Passive: Experience boost").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Battle tactics (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Better enchantments").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Divine shield").formatted(Formatting.GRAY));
                }
                break;
            case "ares":
                player.sendMessage(Text.literal("§c🔥 War Master").formatted(Formatting.RED));
                player.sendMessage(Text.literal("§7- Passive: Damage boost").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Battle rage (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Health regeneration in combat").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Berserker mode").formatted(Formatting.GRAY));
                }
                break;
            case "apollo":
                player.sendMessage(Text.literal("§6☀️ Sun Archer").formatted(Formatting.GOLD));
                player.sendMessage(Text.literal("§7- Passive: Bow accuracy").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Solar arrow (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Healing aura").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Sun burst").formatted(Formatting.GRAY));
                }
                break;
            case "artemis":
                player.sendMessage(Text.literal("§a🏹 Huntress").formatted(Formatting.GREEN));
                player.sendMessage(Text.literal("§7- Passive: Animal friendship").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Call wolves (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Night hunting bonus").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Moonlight arrows").formatted(Formatting.GRAY));
                }
                break;
            case "hermes":
                player.sendMessage(Text.literal("§e🏃 Swift Messenger").formatted(Formatting.YELLOW));
                player.sendMessage(Text.literal("§7- Passive: Speed boost").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Teleport (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Jump boost").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Time warp").formatted(Formatting.GRAY));
                }
                break;
            case "hephaestus":
                player.sendMessage(Text.literal("§7⚒️ Master Smith").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Passive: Better crafting").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Forge items (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Fire resistance").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Create golems").formatted(Formatting.GRAY));
                }
                break;
            case "aphrodite":
                player.sendMessage(Text.literal("§d💕 Love Goddess").formatted(Formatting.LIGHT_PURPLE));
                player.sendMessage(Text.literal("§7- Passive: Charm effect").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Love aura (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Better trading").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Mass charm").formatted(Formatting.GRAY));
                }
                break;
            case "demeter":
                player.sendMessage(Text.literal("§a🌾 Harvest Mother").formatted(Formatting.GREEN));
                player.sendMessage(Text.literal("§7- Passive: Crop growth boost").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Instant grow (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Better farming").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Nature's blessing").formatted(Formatting.GRAY));
                }
                break;
            case "dionysus":
                player.sendMessage(Text.literal("§5🍷 Party Master").formatted(Formatting.DARK_PURPLE));
                player.sendMessage(Text.literal("§7- Passive: Luck boost").formatted(Formatting.GRAY));
                player.sendMessage(Text.literal("§7- Active: Revelry (Level " + Math.min(level, 3) + ")").formatted(Formatting.GRAY));
                if (level >= 2) {
                    player.sendMessage(Text.literal("§7- Passive: Better brewing").formatted(Formatting.GRAY));
                }
                if (level >= 3) {
                    player.sendMessage(Text.literal("§7- Active: Mass celebration").formatted(Formatting.GRAY));
                }
                break;
        }
    }
    
    private static String getClassName(String god) {
        switch (god) {
            case "zeus": return "Thunder Child";
            case "poseidon": return "Ocean Child";
            case "hades": return "Shadow Child";
            case "athena": return "Wise Child";
            case "ares": return "War Child";
            case "apollo": return "Sun Child";
            case "artemis": return "Hunt Child";
            case "hermes": return "Swift Child";
            case "hephaestus": return "Smith Child";
            case "aphrodite": return "Love Child";
            case "demeter": return "Harvest Child";
            case "dionysus": return "Party Child";
            default: return "Divine Child";
        }
    }
    
    private static void applyClassBuffs(ServerPlayerEntity player, String god, int level) {
        // Apply actual game effects using the ClassBuffs system
        ClassBuffs.applyClassBuffs(player, god, level);
    }
    
    public static void resetClass(ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        String currentClass = playerClasses.get(playerId);
        
        // Remove buffs if player has a class
        if (currentClass != null) {
            ClassBuffs.removeClassBuffs(player, currentClass);
        }
        
        playerClasses.remove(playerId);
        classLevels.remove(playerId);
        player.sendMessage(Text.literal("§cYour divine class has been reset.").formatted(Formatting.RED));
        AIMythologyMod.LOGGER.info("Player {} class reset", player.getName().getString());
    }
} 