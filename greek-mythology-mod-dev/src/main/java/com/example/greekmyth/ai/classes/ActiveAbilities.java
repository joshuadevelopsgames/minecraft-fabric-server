package com.example.aimyth.classes;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ActiveAbilities {
    
    public static void useActiveAbility(ServerPlayerEntity player, String god, int level) {
        switch (god) {
            case "zeus":
                useZeusAbility(player, level);
                break;
            case "poseidon":
                usePoseidonAbility(player, level);
                break;
            case "hades":
                useHadesAbility(player, level);
                break;
            case "athena":
                useAthenaAbility(player, level);
                break;
            case "ares":
                useAresAbility(player, level);
                break;
            case "apollo":
                useApolloAbility(player, level);
                break;
            case "artemis":
                useArtemisAbility(player, level);
                break;
            case "hermes":
                useHermesAbility(player, level);
                break;
            case "hephaestus":
                useHephaestusAbility(player, level);
                break;
            case "aphrodite":
                useAphroditeAbility(player, level);
                break;
            case "demeter":
                useDemeterAbility(player, level);
                break;
            case "dionysus":
                useDionysusAbility(player, level);
                break;
            default:
                player.sendMessage(Text.literal("§cUnknown god ability!").formatted(Formatting.RED));
        }
    }
    
    private static void useZeusAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Call lightning - give player a temporary speed boost and glowing effect
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 2, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 0, false, false));
            player.sendMessage(Text.literal("§e⚡ Zeus' lightning courses through you!").formatted(Formatting.YELLOW));
        }
    }
    
    private static void usePoseidonAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Summon trident - give player water breathing and dolphin's grace
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 400, 0, false, false));
            player.sendMessage(Text.literal("§b🌊 Poseidon's trident empowers you!").formatted(Formatting.AQUA));
        }
    }
    
    private static void useHadesAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Shadow step - give player invisibility and night vision
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 300, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0, false, false));
            player.sendMessage(Text.literal("§8💀 Hades' shadows envelop you!").formatted(Formatting.DARK_GRAY));
        }
    }
    
    private static void useAthenaAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Battle tactics - give player resistance and strength
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 300, 0, false, false));
            player.sendMessage(Text.literal("§f⚔️ Athena's wisdom guides your battle!").formatted(Formatting.WHITE));
        }
    }
    
    private static void useAresAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Battle rage - give player strength and speed
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 300, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 1, false, false));
            player.sendMessage(Text.literal("§c🔥 Ares' battle rage consumes you!").formatted(Formatting.RED));
        }
    }
    
    private static void useApolloAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Solar arrow - give player glowing and regeneration
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1, false, false));
            player.sendMessage(Text.literal("§6☀️ Apollo's solar energy heals you!").formatted(Formatting.GOLD));
        }
    }
    
    private static void useArtemisAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Call wolves - give player speed and night vision
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0, false, false));
            player.sendMessage(Text.literal("§a🏹 Artemis' hunting instincts awaken!").formatted(Formatting.GREEN));
        }
    }
    
    private static void useHermesAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Teleport - give player extreme speed and jump boost
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 2, false, false));
            player.sendMessage(Text.literal("§e🏃 Hermes' swiftness carries you!").formatted(Formatting.YELLOW));
        }
    }
    
    private static void useHephaestusAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Forge items - give player haste and fire resistance
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400, 2, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400, 0, false, false));
            player.sendMessage(Text.literal("§7⚒️ Hephaestus' forge empowers you!").formatted(Formatting.GRAY));
        }
    }
    
    private static void useAphroditeAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Love aura - give player luck and absorption
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 300, 1, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 1, false, false));
            player.sendMessage(Text.literal("§d💕 Aphrodite's love protects you!").formatted(Formatting.LIGHT_PURPLE));
        }
    }
    
    private static void useDemeterAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Instant grow - give player regeneration and luck
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 0, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 400, 0, false, false));
            player.sendMessage(Text.literal("§a🌾 Demeter's harvest blesses you!").formatted(Formatting.GREEN));
        }
    }
    
    private static void useDionysusAbility(ServerPlayerEntity player, int level) {
        if (level >= 1) {
            // Revelry - give player luck and glowing
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 300, 2, false, false));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 300, 0, false, false));
            player.sendMessage(Text.literal("§5🍷 Dionysus' revelry energizes you!").formatted(Formatting.DARK_PURPLE));
        }
    }
} 