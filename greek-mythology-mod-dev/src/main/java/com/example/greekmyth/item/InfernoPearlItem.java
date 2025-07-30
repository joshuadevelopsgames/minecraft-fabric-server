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
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.fabricmc.fabric.api.item.v1.FabricItem;

import net.minecraft.util.math.random.Random;

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
            
            // Create and throw a standard ender pearl - simpler approach
            if (!world.isClient()) {
                net.minecraft.entity.projectile.thrown.EnderPearlEntity pearlEntity = 
                    new net.minecraft.entity.projectile.thrown.EnderPearlEntity(net.minecraft.entity.EntityType.ENDER_PEARL, world);
                
                // Set the owner and velocity exactly like a normal ender pearl
                pearlEntity.setOwner(user);
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
            user.getItemCooldownManager().set(itemStack, 20);
            
            return ActionResult.SUCCESS;
        } else {
            // Not in Overworld - show message and don't throw
            if (!world.isClient) {
                user.sendMessage(Text.literal("§cInferno Pearls can only be used in the Overworld!"), false);
            }
            return ActionResult.FAIL;
        }
    }
    
    private void corruptArea(World world, BlockPos center) {
        Random random = world.getRandom();
        int radius = 4; // Increased radius for better tree coverage
        
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = center.add(x, y, z);
                    BlockState currentState = world.getBlockState(pos);
                    
                    // Transform trees into crimson forest
                    if (isTreeBlock(currentState)) {
                        Block crimsonBlock = getCrimsonForestBlock(currentState, random);
                        world.setBlockState(pos, crimsonBlock.getDefaultState());
                    }
                    // Corrupt other replaceable blocks
                    else if (isReplaceable(currentState)) {
                        Block corruptedBlock = getRandomNetherBlock(random);
                        world.setBlockState(pos, corruptedBlock.getDefaultState());
                    }
                }
            }
        }
    }
    
    private boolean isTreeBlock(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.OAK_LOG ||
               block == Blocks.BIRCH_LOG ||
               block == Blocks.SPRUCE_LOG ||
               block == Blocks.JUNGLE_LOG ||
               block == Blocks.ACACIA_LOG ||
               block == Blocks.DARK_OAK_LOG ||
               block == Blocks.MANGROVE_LOG ||
               block == Blocks.CHERRY_LOG ||
               block == Blocks.OAK_LEAVES ||
               block == Blocks.BIRCH_LEAVES ||
               block == Blocks.SPRUCE_LEAVES ||
               block == Blocks.JUNGLE_LEAVES ||
               block == Blocks.ACACIA_LEAVES ||
               block == Blocks.DARK_OAK_LEAVES ||
               block == Blocks.MANGROVE_LEAVES ||
               block == Blocks.CHERRY_LEAVES ||
               block == Blocks.AZALEA_LEAVES ||
               block == Blocks.FLOWERING_AZALEA_LEAVES;
    }
    
    private Block getCrimsonForestBlock(BlockState originalState, Random random) {
        Block originalBlock = originalState.getBlock();
        
        // Transform logs to crimson stems
        if (originalBlock == Blocks.OAK_LOG || 
            originalBlock == Blocks.BIRCH_LOG || 
            originalBlock == Blocks.SPRUCE_LOG || 
            originalBlock == Blocks.JUNGLE_LOG || 
            originalBlock == Blocks.ACACIA_LOG || 
            originalBlock == Blocks.DARK_OAK_LOG ||
            originalBlock == Blocks.MANGROVE_LOG ||
            originalBlock == Blocks.CHERRY_LOG) {
            return Blocks.CRIMSON_STEM;
        }
        
        // Transform leaves to crimson forest leaves (Nether Wart Blocks)
        if (originalBlock == Blocks.OAK_LEAVES || 
            originalBlock == Blocks.BIRCH_LEAVES || 
            originalBlock == Blocks.SPRUCE_LEAVES || 
            originalBlock == Blocks.JUNGLE_LEAVES || 
            originalBlock == Blocks.ACACIA_LEAVES || 
            originalBlock == Blocks.DARK_OAK_LEAVES ||
            originalBlock == Blocks.MANGROVE_LEAVES ||
            originalBlock == Blocks.CHERRY_LEAVES ||
            originalBlock == Blocks.AZALEA_LEAVES ||
            originalBlock == Blocks.FLOWERING_AZALEA_LEAVES) {
            
            return Blocks.NETHER_WART_BLOCK;
        }
        
        // Fallback to crimson nylium
        return Blocks.CRIMSON_NYLIUM;
    }
    
    private boolean isReplaceable(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || 
               block == Blocks.DIRT || 
               block == Blocks.STONE || 
               block == Blocks.SAND || 
               block == Blocks.GRAVEL ||
               block == Blocks.COBBLESTONE;
    }
    
    private Block getRandomNetherBlock(Random random) {
        Block[] netherBlocks = {
            Blocks.NETHERRACK,
            Blocks.MAGMA_BLOCK
        };
        
        return netherBlocks[random.nextInt(netherBlocks.length)];
    }
} 