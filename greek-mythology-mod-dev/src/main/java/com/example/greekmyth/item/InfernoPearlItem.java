package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.InfernoPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.fabricmc.fabric.api.item.v1.FabricItem;

public class InfernoPearlItem extends Item implements FabricItem {
    
    public InfernoPearlItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("InfernoPearlItem constructor called");
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        
        // Only allow throwing in the Overworld
        if (world.getRegistryKey().getValue().getPath().equals("overworld")) {
            // Play throw sound first (like vanilla ender pearl)
            world.playSound(null, user.getX(), user.getY(), user.getZ(), 
                SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
            
            // Increment stats (like vanilla ender pearl)
            user.incrementStat(Stats.USED.getOrCreateStat(this));
            
            // Create and throw our custom inferno pearl entity
            if (!world.isClient()) {
                InfernoPearlEntity pearlEntity = new InfernoPearlEntity(world, user);
                
                // Set the velocity exactly like a normal ender pearl
                pearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
                
                // Spawn the entity on server
                world.spawnEntity(pearlEntity);
                
                GreekMythologyMod.LOGGER.info("INFERNO PEARL: Thrown by player {}", user.getName().getString());
            }
            
            // Consume the pearl (like vanilla ender pearl)
            if (!user.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }
            
            // Set cooldown (like vanilla ender pearl)
            user.getItemCooldownManager().set(this, 20);
            
            return ActionResult.SUCCESS;
        } else {
            // Not in Overworld - show message and don't throw
            if (!world.isClient) {
                user.sendMessage(Text.literal("§cInferno Pearls can only be used in the Overworld!"), false);
            }
            return ActionResult.FAIL;
        }
    }
} 