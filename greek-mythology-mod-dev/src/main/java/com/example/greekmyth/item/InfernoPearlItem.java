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
            // Create and throw the Inferno Pearl entity
            if (!world.isClient()) {
                EnderPearlEntity pearlEntity = new EnderPearlEntity(world, user, itemStack) {
                    @Override
                    protected void onCollision(HitResult hitResult) {
                        // Don't call super.onCollision(hitResult) to disable teleportation
                        
                        // Instead of teleporting, corrupt the area
                        if (!this.getWorld().isClient) {
                            Vec3d landingPos = this.getPos();
                            corruptArea(this.getWorld(), new BlockPos((int)landingPos.x, (int)landingPos.y, (int)landingPos.z));
                            
                            // Play corruption sound
                            this.getWorld().playSound(null, landingPos.x, landingPos.y, landingPos.z, 
                                SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.NEUTRAL, 1.0F, 0.8F);
                            
                            // Spawn particles at landing location
                            if (this.getWorld() instanceof net.minecraft.server.world.ServerWorld) {
                                ((net.minecraft.server.world.ServerWorld) this.getWorld()).spawnParticles(ParticleTypes.SOUL_FIRE_FLAME, 
                                    landingPos.x, landingPos.y, landingPos.z, 20, 0.5, 0.5, 0.5, 0.1);
                            }
                            
                            GreekMythologyMod.LOGGER.info("INFERNO PEARL: Corrupted area at ({}, {}, {})", 
                                landingPos.x, landingPos.y, landingPos.z);
                        }
                        
                        // Discard the entity without teleporting
                        this.discard();
                    }
                };
                
                pearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
                
                if (!world.spawnEntity(pearlEntity)) {
                    return ActionResult.FAIL;
                }
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
                user.getName().getString(), user.getX(), user.getY(), user.getZ());
            
            return ActionResult.SUCCESS;
        } else {
            // Not in Overworld - show message and don't allow throwing
            if (!world.isClient()) {
                user.sendMessage(Text.literal("§cThe pearl refuses to be thrown here — it only works in the Overworld."), false);
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