package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

/**
 * Handles invisible nametag interactions with entities
 */
public class InvisibleNametagHandler {
    
    public static void register() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            ItemStack heldItem = player.getStackInHand(hand);
            
            // Check if the held item is an invisible nametag
            if (heldItem.getItem() == GreekItems.INVISIBLE_NAMETAG) {
                return handleInvisibleNametagUse(player, world, entity, heldItem, hand);
            }
            
            return ActionResult.PASS;
        });
        
        GreekMythologyMod.LOGGER.info("Invisible Nametag Handler registered!");
    }
    
    private static ActionResult handleInvisibleNametagUse(PlayerEntity player, World world, Entity entity, ItemStack nametag, Hand hand) {
        // Don't allow naming players
        if (entity instanceof PlayerEntity) {
            player.sendMessage(Text.literal("§c❌ Cannot apply nametag to players!").formatted(Formatting.RED), false);
            return ActionResult.FAIL;
        }
        
        // Set the entity's custom name to empty string (invisible)
        entity.setCustomName(Text.literal(""));
        entity.setCustomNameVisible(false);
        
        // Mark the entity as persistent (won't despawn)
        if (entity instanceof net.minecraft.entity.mob.MobEntity) {
            ((net.minecraft.entity.mob.MobEntity) entity).setPersistent();
        }
        
        // Send success message
        player.sendMessage(Text.literal("§a✅ Applied invisible nametag to " + entity.getName().getString() + " §7(Mob will no longer despawn)").formatted(Formatting.GREEN), false);
        
        // Consume the item (unless in creative mode)
        if (!player.getAbilities().creativeMode) {
            nametag.decrement(1);
        }
        
        return ActionResult.SUCCESS;
    }
}
