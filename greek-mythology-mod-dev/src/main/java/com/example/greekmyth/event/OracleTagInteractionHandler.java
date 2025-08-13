package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.SpecializedOracleEntity;
import com.example.greekmyth.favor.God;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class OracleTagInteractionHandler {
    
    public static void register() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            // Only handle server-side interactions
            if (world.isClient || !(player instanceof ServerPlayerEntity)) {
                return ActionResult.PASS;
            }
            
            // Check if player is holding an Oracle tag
            ItemStack heldItem = player.getStackInHand(hand);
            if (!isOracleTag(heldItem)) {
                return ActionResult.PASS;
            }
            
            // Check if target is an Illusioner
            if (!(entity instanceof IllusionerEntity)) {
                player.sendMessage(Text.literal("§c❌ You can only use Oracle tags on Illusioners!").formatted(Formatting.RED), false);
                return ActionResult.FAIL;
            }
            
            // Check if the Illusioner is already an Oracle
            if (entity.hasCustomName() && entity.getCustomName().getString().contains("Oracle")) {
                player.sendMessage(Text.literal("§c❌ This Illusioner is already an Oracle!").formatted(Formatting.RED), false);
                return ActionResult.FAIL;
            }
            
            // Transform the Illusioner into a specialized Oracle
            return transformToSpecializedOracle((ServerPlayerEntity) player, (ServerWorld) world, (IllusionerEntity) entity, heldItem);
        });
        
        GreekMythologyMod.LOGGER.info("Oracle Tag Interaction Handler registered!");
    }
    
    private static boolean isOracleTag(ItemStack stack) {
        return stack.getItem() == GreekItems.ZEUS_ORACLE_TAG ||
               stack.getItem() == GreekItems.POSEIDON_ORACLE_TAG ||
               stack.getItem() == GreekItems.HADES_ORACLE_TAG ||
               stack.getItem() == GreekItems.ARES_ORACLE_TAG ||
               stack.getItem() == GreekItems.ATHENA_ORACLE_TAG ||
               stack.getItem() == GreekItems.HEPHAESTUS_ORACLE_TAG ||
               stack.getItem() == GreekItems.APOLLO_ORACLE_TAG ||
               stack.getItem() == GreekItems.ARTEMIS_ORACLE_TAG ||
               stack.getItem() == GreekItems.HERMES_ORACLE_TAG ||
               stack.getItem() == GreekItems.DIONYSUS_ORACLE_TAG ||
               stack.getItem() == GreekItems.APHRODITE_ORACLE_TAG ||
               stack.getItem() == GreekItems.DEMETER_ORACLE_TAG;
    }
    
    private static ActionResult transformToSpecializedOracle(ServerPlayerEntity player, ServerWorld world, IllusionerEntity illusioner, ItemStack tagItem) {
        // Determine which god this tag represents
        God god = getGodFromTag(tagItem);
        if (god == null) {
            player.sendMessage(Text.literal("§c❌ Unknown Oracle tag type!").formatted(Formatting.RED), false);
            return ActionResult.FAIL;
        }
        
        // Get the illusioner's position and data
        Vec3d position = illusioner.getPos();
        float yaw = illusioner.getYaw();
        float pitch = illusioner.getPitch();
        
        // Remove the original illusioner
        illusioner.remove(Entity.RemovalReason.DISCARDED);
        
        // Create the specialized Oracle
        SpecializedOracleEntity specializedOracle = new SpecializedOracleEntity(
            (EntityType<? extends IllusionerEntity>) EntityType.ILLUSIONER, 
            world, 
            god
        );
        specializedOracle.setPosition(position);
        specializedOracle.setYaw(yaw);
        specializedOracle.setPitch(pitch);
        
        // Spawn the specialized Oracle
        world.spawnEntity(specializedOracle);
        
        // Consume the tag item
        if (!player.getAbilities().creativeMode) {
            tagItem.decrement(1);
        }
        
        // Send success message
        String godName = god.name().toLowerCase();
        String color = getGodColor(god);
        player.sendMessage(Text.literal(color + "✅ Successfully transformed Illusioner into " + godName + " Oracle!").formatted(Formatting.GREEN), false);
        
        GreekMythologyMod.LOGGER.info("Player {} transformed Illusioner into {} Oracle at position: {}", 
            player.getName().getString(), god.name(), position);
        
        return ActionResult.SUCCESS;
    }
    
    private static God getGodFromTag(ItemStack tagItem) {
        if (tagItem.getItem() == GreekItems.ZEUS_ORACLE_TAG) return God.ZEUS;
        if (tagItem.getItem() == GreekItems.POSEIDON_ORACLE_TAG) return God.POSEIDON;
        if (tagItem.getItem() == GreekItems.HADES_ORACLE_TAG) return God.HADES;
        if (tagItem.getItem() == GreekItems.ARES_ORACLE_TAG) return God.ARES;
        if (tagItem.getItem() == GreekItems.ATHENA_ORACLE_TAG) return God.ATHENA;
        if (tagItem.getItem() == GreekItems.HEPHAESTUS_ORACLE_TAG) return God.HEPHAESTUS;
        if (tagItem.getItem() == GreekItems.APOLLO_ORACLE_TAG) return God.APOLLO;
        if (tagItem.getItem() == GreekItems.ARTEMIS_ORACLE_TAG) return God.ARTEMIS;
        if (tagItem.getItem() == GreekItems.HERMES_ORACLE_TAG) return God.HERMES;
        if (tagItem.getItem() == GreekItems.DIONYSUS_ORACLE_TAG) return God.DIONYSUS;
        if (tagItem.getItem() == GreekItems.APHRODITE_ORACLE_TAG) return God.APHRODITE;
        if (tagItem.getItem() == GreekItems.DEMETER_ORACLE_TAG) return God.DEMETER;
        return null;
    }
    
    private static String getGodColor(God god) {
        switch (god) {
            case ZEUS: return "§e"; // Yellow
            case POSEIDON: return "§b"; // Blue
            case HADES: return "§5"; // Purple
            case ARES: return "§c"; // Red
            case ATHENA: return "§7"; // Gray
            case HEPHAESTUS: return "§6"; // Orange
            case APOLLO: return "§e"; // Gold
            case ARTEMIS: return "§a"; // Green
            case HERMES: return "§b"; // Cyan
            case DIONYSUS: return "§d"; // Pink
            case APHRODITE: return "§d"; // Magenta
            case DEMETER: return "§6"; // Brown
            default: return "§f"; // White
        }
    }
}
