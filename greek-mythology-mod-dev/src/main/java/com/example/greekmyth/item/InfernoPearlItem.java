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
        int radius = 3; // 3x3x3 area
        
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos pos = center.add(x, y, z);
                    BlockState currentState = world.getBlockState(pos);
                    
                    // Only corrupt replaceable blocks
                    if (isReplaceable(currentState)) {
                        Block corruptedBlock = getRandomNetherBlock(random);
                        world.setBlockState(pos, corruptedBlock.getDefaultState());
                    }
                }
            }
        }
    }
    
    private boolean isReplaceable(BlockState state) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || 
               block == Blocks.DIRT || 
               block == Blocks.STONE || 
               block == Blocks.SAND || 
               block == Blocks.GRAVEL ||
               block == Blocks.COBBLESTONE ||
               block == Blocks.OAK_LEAVES ||
               block == Blocks.BIRCH_LEAVES ||
               block == Blocks.SPRUCE_LEAVES ||
               block == Blocks.JUNGLE_LEAVES ||
               block == Blocks.ACACIA_LEAVES ||
               block == Blocks.DARK_OAK_LEAVES;
    }
    
    private Block getRandomNetherBlock(Random random) {
        Block[] netherBlocks = {
            Blocks.NETHERRACK,
            Blocks.MAGMA_BLOCK
        };
        
        return netherBlocks[random.nextInt(netherBlocks.length)];
    }
} 