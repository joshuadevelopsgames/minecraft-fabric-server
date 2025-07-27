package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionType;
import net.fabricmc.fabric.api.item.v1.FabricItem;

import java.util.List;

public class InfernoPearlItem extends Item implements FabricItem {
    
    public InfernoPearlItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("InfernoPearlItem constructor called");
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        
        // Raycast to find where the pearl will land
        Vec3d start = user.getEyePos();
        Vec3d end = start.add(user.getRotationVecClient().multiply(40.0));
        
        BlockHitResult hitResult = world.raycast(new RaycastContext(start, end, 
            RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, user));
        
        Vec3d targetPos = hitResult.getType() == HitResult.Type.BLOCK ? hitResult.getPos() : end;
        
        // Only allow throwing in the Overworld
        if (world.getRegistryKey().getValue().getPath().equals("overworld")) {
            // For now, just show a message that it would corrupt the area
            if (!world.isClient()) {
                user.sendMessage(Text.literal("§6The Inferno Pearl crackles with netherfire..."), false);
            }
            
            // Play throw sound
            world.playSound(null, user.getX(), user.getY(), user.getZ(), 
                SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
            
            // Consume the pearl
            if (!user.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            
            user.getItemCooldownManager().set(itemStack, 20); // 1 second cooldown
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            
            GreekMythologyMod.LOGGER.info("INFERNO PEARL: Thrown by {} at position ({}, {}, {})", 
                user.getName().getString(), targetPos.x, targetPos.y, targetPos.z);
            
            return ActionResult.SUCCESS;
        } else {
            // Not in Overworld - show message and don't allow throwing
            if (!world.isClient()) {
                user.sendMessage(Text.literal("§cThe pearl refuses to be thrown here — it only works in the Overworld."), false);
            }
            return ActionResult.FAIL;
        }
    }


} 