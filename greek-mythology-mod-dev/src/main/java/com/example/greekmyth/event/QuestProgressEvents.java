package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.OracleEntity;
import com.example.greekmyth.quest.GodQuest;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Handles quest progress tracking for Oracle god-specific quests
 */
public class QuestProgressEvents {
    
    // Track player positions for travel distance quests
    private static final Map<UUID, BlockPos> playerPositions = new HashMap<>();
    
    public static void register() {
        GreekMythologyMod.LOGGER.info("Registering Quest Progress Events");
        
        // Track mob kills
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof LivingEntity livingEntity) {
                // Track when entities are loaded for potential kill tracking
            }
        });
        
        // Track item usage
        UseItemCallback.EVENT.register((player, world, hand) -> {
            if (player instanceof ServerPlayerEntity serverPlayer) {
                ItemStack stack = player.getStackInHand(hand);
                if (!stack.isEmpty()) {
                    updateQuestProgress(serverPlayer, GodQuest.QuestType.USE_ITEMS, 1);
                }
            }
            return ActionResult.PASS;
        });
        
        // Track crafting (this would need to be expanded with more specific crafting events)
        // For now, we'll track item usage as a proxy for crafting
        
        // Track structure finding (this would need biome/structure detection)
        // For now, we'll track exploration as a proxy
    }
    
    /**
     * Update quest progress for a specific player and quest type
     */
    public static void updateQuestProgress(ServerPlayerEntity player, GodQuest.QuestType type, int progress) {
        // For now, we'll use a simpler approach - the Oracle will handle its own quest tracking
        // This can be enhanced later with more sophisticated entity finding
        GreekMythologyMod.LOGGER.info("Quest progress update: Player {} completed {} quest type with progress {}", 
            player.getName().getString(), type, progress);
    }
    
    /**
     * Track player movement for travel distance quests
     */
    public static void trackPlayerMovement(ServerPlayerEntity player) {
        UUID playerUuid = player.getUuid();
        BlockPos currentPos = player.getBlockPos();
        BlockPos lastPos = playerPositions.get(playerUuid);
        
        if (lastPos != null) {
            double distance = Math.sqrt(
                Math.pow(currentPos.getX() - lastPos.getX(), 2) +
                Math.pow(currentPos.getZ() - lastPos.getZ(), 2)
            );
            
            if (distance >= 1.0) { // Only count if moved at least 1 block
                updateQuestProgress(player, GodQuest.QuestType.TRAVEL_DISTANCE, (int) distance);
            }
        }
        
        playerPositions.put(playerUuid, currentPos);
    }
    
    /**
     * Track mob kills
     */
    public static void trackMobKill(ServerPlayerEntity player, Entity killedEntity) {
        if (killedEntity instanceof LivingEntity) {
            updateQuestProgress(player, GodQuest.QuestType.KILL_MOBS, 1);
        }
    }
    
    /**
     * Track item collection
     */
    public static void trackItemCollection(ServerPlayerEntity player, ItemStack item) {
        if (!item.isEmpty()) {
            updateQuestProgress(player, GodQuest.QuestType.COLLECT_ITEMS, 1);
        }
    }
    
    /**
     * Track area exploration
     */
    public static void trackAreaExploration(ServerPlayerEntity player, BlockPos pos) {
        // This is a simplified version - in a full implementation,
        // you'd track unique areas/biomes explored
        updateQuestProgress(player, GodQuest.QuestType.EXPLORE_AREA, 1);
    }
    
    /**
     * Track structure finding
     */
    public static void trackStructureFound(ServerPlayerEntity player, String structureType) {
        updateQuestProgress(player, GodQuest.QuestType.FIND_STRUCTURES, 1);
    }
    
    /**
     * Track building structures
     */
    public static void trackStructureBuilt(ServerPlayerEntity player, String structureType) {
        updateQuestProgress(player, GodQuest.QuestType.BUILD_STRUCTURES, 1);
    }
    
    /**
     * Track crafting items
     */
    public static void trackItemCrafted(ServerPlayerEntity player, ItemStack craftedItem) {
        if (!craftedItem.isEmpty()) {
            updateQuestProgress(player, GodQuest.QuestType.CRAFT_ITEMS, 1);
        }
    }
} 