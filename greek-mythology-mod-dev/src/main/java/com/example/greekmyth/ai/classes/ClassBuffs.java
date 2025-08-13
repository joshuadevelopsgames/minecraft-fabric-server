package com.example.aimyth.classes;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ClassBuffs {
    
    public static void applyClassBuffs(ServerPlayerEntity player, String god, int level) {
        AIMythologyMod.LOGGER.info("Applying {} class buffs to {} at level {}", god, player.getName().getString(), level);
        
        // Remove any existing buffs first
        removeClassBuffs(player, god);
        
        switch (god) {
            case "zeus":
                applyZeusBuffs(player, level);
                break;
            case "poseidon":
                applyPoseidonBuffs(player, level);
                break;
            case "hades":
                applyHadesBuffs(player, level);
                break;
            case "athena":
                applyAthenaBuffs(player, level);
                break;
            case "ares":
                applyAresBuffs(player, level);
                break;
            case "apollo":
                applyApolloBuffs(player, level);
                break;
            case "artemis":
                applyArtemisBuffs(player, level);
                break;
            case "hermes":
                applyHermesBuffs(player, level);
                break;
            case "hephaestus":
                applyHephaestusBuffs(player, level);
                break;
            case "aphrodite":
                applyAphroditeBuffs(player, level);
                break;
            case "demeter":
                applyDemeterBuffs(player, level);
                break;
            case "dionysus":
                applyDionysusBuffs(player, level);
                break;
        }
    }
    
    public static void removeClassBuffs(ServerPlayerEntity player, String god) {
        // Remove all class-related potion effects
        player.removeStatusEffect(StatusEffects.NIGHT_VISION);
        player.removeStatusEffect(StatusEffects.WATER_BREATHING);
        player.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);
        player.removeStatusEffect(StatusEffects.REGENERATION);
        player.removeStatusEffect(StatusEffects.SPEED);
        player.removeStatusEffect(StatusEffects.JUMP_BOOST);
        player.removeStatusEffect(StatusEffects.LUCK);
        player.removeStatusEffect(StatusEffects.ABSORPTION);
        player.removeStatusEffect(StatusEffects.STRENGTH);
        player.removeStatusEffect(StatusEffects.RESISTANCE);
        player.removeStatusEffect(StatusEffects.HASTE);
        player.removeStatusEffect(StatusEffects.GLOWING);
        player.removeStatusEffect(StatusEffects.INVISIBILITY);
        player.removeStatusEffect(StatusEffects.CONDUIT_POWER);
        player.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
    }
    
    private static void applyZeusBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Lightning absorption and fall damage immunity
        // Lightning absorption is handled by the mixin system
        // Fall damage immunity is handled by the FallDamageMixin
        
        if (level >= 2) {
            // Level 2: Flight in storms (jump boost as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, -1, 1, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Thunder power (strength as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
        }
        
        player.sendMessage(Text.literal("§e⚡ Zeus grants you lightning absorption and fall immunity!").formatted(Formatting.YELLOW));
    }
    
    private static void applyPoseidonBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Water breathing
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Swim speed boost (dolphins grace as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Ocean lord (conduit power + absorption in water)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 3, false, false));
            
            // Underwater buffs will be handled dynamically by PoseidonUnderwaterHandler
        }
        
        player.sendMessage(Text.literal("§b🌊 Poseidon grants you ocean powers!").formatted(Formatting.AQUA));
    }
    
    private static void applyHadesBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Night vision + fire resistance (underworld protection)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Enhanced fire resistance (underworld protection)
            // Fire resistance is already applied at level 1
        }
        
        if (level >= 3) {
            // Level 3: Soul master (absorption as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 2, false, false));
        }
        
        player.sendMessage(Text.literal("§8💀 Hades grants you shadow and underworld powers!").formatted(Formatting.DARK_GRAY));
    }
    
    private static void applyAthenaBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Experience boost + night vision (strategic planning)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 1, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Resistance + speed (tactical advantage)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Absorption + glowing (divine shield aura)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 0, false, false));
        }
        
        player.sendMessage(Text.literal("§f⚔️ Athena grants you wisdom and strategic advantage!").formatted(Formatting.WHITE));
    }
    
    private static void applyAresBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Strength + fire resistance (battle-hardened)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Regeneration + speed (berserker rage)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 1, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Strength II + absorption (unstoppable warrior)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 1, false, false));
        }
        
        player.sendMessage(Text.literal("§c🔥 Ares grants you unstoppable war powers!").formatted(Formatting.RED));
    }
    
    private static void applyApolloBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Luck + night vision (archery precision)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 1, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Regeneration + glowing (healing aura)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Strength + absorption (sun god power)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 1, false, false));
        }
        
        player.sendMessage(Text.literal("§6☀️ Apollo grants you divine sun and healing powers!").formatted(Formatting.GOLD));
    }
    
    private static void applyArtemisBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Night vision + speed (stealth hunter)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, -1, 0, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Jump boost + luck (wilderness mastery)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, -1, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Invisibility + strength (moonlight warrior)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
        }
        
        player.sendMessage(Text.literal("§a🏹 Artemis grants you moonlight hunting powers!").formatted(Formatting.GREEN));
    }
    
    private static void applyHermesBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Speed boost
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 1, false, false));
        
        if (level >= 2) {
            // Level 2: Jump boost
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, -1, 1, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Time warp (haste as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 1, false, false));
        }
        
        player.sendMessage(Text.literal("§e🏃 Hermes grants you divine swiftness!").formatted(Formatting.YELLOW));
    }
    
    private static void applyHephaestusBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Better crafting (haste as proxy)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Fire resistance
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Master smith (strength as proxy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
        }
        
        player.sendMessage(Text.literal("§7⚒️ Hephaestus grants you master smithing powers!").formatted(Formatting.GRAY));
    }
    
    private static void applyAphroditeBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Luck + glowing (natural charm)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 1, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Absorption + speed (graceful movement)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Regeneration + glowing II (divine beauty)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 1, false, false));
        }
        
        player.sendMessage(Text.literal("§d💕 Aphrodite grants you divine beauty and charm!").formatted(Formatting.LIGHT_PURPLE));
    }
    
    private static void applyDemeterBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Luck + regeneration (nature's touch)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 0, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Haste + absorption (bountiful harvest)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Strength + glowing (earth mother power)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 0, false, false));
        }
        
        player.sendMessage(Text.literal("§a🌾 Demeter grants you earth mother harvest powers!").formatted(Formatting.GREEN));
    }
    
    private static void applyDionysusBuffs(ServerPlayerEntity player, int level) {
        // Level 1: Luck + speed (festive spirit)
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, -1, 2, false, false));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1, 0, false, false));
        
        if (level >= 2) {
            // Level 2: Haste + glowing (party energy)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, -1, 0, false, false));
        }
        
        if (level >= 3) {
            // Level 3: Regeneration + absorption (divine revelry)
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, -1, 1, false, false));
        }
        
        player.sendMessage(Text.literal("§5🍷 Dionysus grants you divine celebration powers!").formatted(Formatting.DARK_PURPLE));
    }
} 