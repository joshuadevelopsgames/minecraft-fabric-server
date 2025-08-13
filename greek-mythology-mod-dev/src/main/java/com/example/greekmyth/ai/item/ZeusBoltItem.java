package com.example.aimyth.item;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Zeus's Lightning Bolt - A legendary weapon with lightning powers.
 */
public class ZeusBoltItem extends Item {
    private static final Logger LOGGER = LoggerFactory.getLogger("ZeusBoltItem");
    
    public ZeusBoltItem(Settings settings) {
        super(settings);
        AIMythologyMod.LOGGER.info("ZeusBoltItem constructor called");
    }
    
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        BlockPos pos = context.getBlockPos();
        
        if (player != null && !world.isClient) {
            LOGGER.info("Zeus Bolt used by {} at position {}", player.getName().getString(), pos);
            
            // Simple lightning effect - in full implementation this would create actual lightning
            if (player.isSneaking()) {
                // Flight burst effect
                Vec3d velocity = player.getVelocity();
                player.setVelocity(velocity.x, 2.0, velocity.z);
                player.velocityModified = true;
                LOGGER.info("Zeus Bolt flight burst activated for {}", player.getName().getString());
            } else {
                // Lightning strike effect
                LOGGER.info("Zeus Bolt lightning strike at {}", pos);
            }
            
            return ActionResult.SUCCESS;
        }
        
        return ActionResult.PASS;
    }
    
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            LOGGER.info("Zeus Bolt hit by {} on {}", player.getName().getString(), target.getName().getString());
        }
        super.postHit(stack, target, attacker);
    }
} 