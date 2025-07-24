package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.util.TypedActionResult;

public class ZeusBoltItem extends Item {
    private static final Identifier COOLDOWN_ID = Identifier.of("greekmyth", "zeus_bolt_cooldown");
    private static final int COOLDOWN_TICKS = 30 * 20; // 30 seconds
    private static final int MAX_CHARGES = 5;

    public ZeusBoltItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        if (world.isClient) {
            GreekMythologyMod.LOGGER.info("Zeus Bolt used on CLIENT side");
            return TypedActionResult.success(stack);
        }

        ServerPlayerEntity serverUser = (ServerPlayerEntity) user;
        ServerWorld serverWorld = (ServerWorld) world;

        // Check for infinite lightning during rain/thunder
        boolean isThundering = world.isThundering();
        boolean isRaining = world.isRaining();
        boolean isSkyVisible = world.isSkyVisible(user.getBlockPos());
        boolean infinite = isThundering || (isRaining && isSkyVisible);
        
        // Get current state
        boolean isOnCooldown = user.getItemCooldownManager().isCoolingDown(this);
        int currentDamage = stack.getDamage();
        int currentCharges = MAX_CHARGES - currentDamage;
        
        // Comprehensive debug logging
        GreekMythologyMod.LOGGER.info("=== ZEUS BOLT DEBUG ===");
        GreekMythologyMod.LOGGER.info("Player: {}", user.getName().getString());
        GreekMythologyMod.LOGGER.info("Weather - Thundering: {}, Raining: {}, SkyVisible: {}", isThundering, isRaining, isSkyVisible);
        GreekMythologyMod.LOGGER.info("Infinite Mode: {}", infinite);
        GreekMythologyMod.LOGGER.info("Cooldown - IsOnCooldown: {}, CooldownTicks: {}", isOnCooldown, COOLDOWN_TICKS);
        GreekMythologyMod.LOGGER.info("Charges - Current: {}, Max: {}, Damage: {}", currentCharges, MAX_CHARGES, currentDamage);
        GreekMythologyMod.LOGGER.info("Sneaking: {}", user.isSneaking());

        if (infinite) {
            // Give 50 charges during rain/thunder
            stack.setDamage(-45); // This gives 50 charges (5 - (-45) = 50)
            GreekMythologyMod.LOGGER.info("INFINITE MODE: Charges set to 50 (damage: -45)");
        } else {
            // Check cooldown and charges
            if (isOnCooldown) {
                GreekMythologyMod.LOGGER.info("BLOCKED: Item is on cooldown");
                return TypedActionResult.fail(stack);
            }
            
            if (currentCharges <= 0) {
                GreekMythologyMod.LOGGER.info("BLOCKED: No charges remaining");
                return TypedActionResult.fail(stack);
            }
            
            // Set cooldown and consume charge
            user.getItemCooldownManager().set(this, COOLDOWN_TICKS);
            stack.setDamage(currentDamage + 1);
            GreekMythologyMod.LOGGER.info("COOLDOWN SET: {} ticks, charge consumed (new damage: {})", COOLDOWN_TICKS, stack.getDamage());
        }

        // Handle sneak + right-click for flight burst
        if (user.isSneaking()) {
            GreekMythologyMod.LOGGER.info("FLIGHT BURST: Applying levitation and slow falling effects");
            // Flight burst: Levitation IV for 2.5s then Slow Falling for 2.5s
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 50, 3)); // 2.5s Levitation IV
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0)); // 5s Slow Falling (covers both effects)
            
            world.playSound(null, user.getX(), user.getY(), user.getZ(), 
                SoundEvents.ENTITY_ILLUSIONER_MIRROR_MOVE, SoundCategory.PLAYERS, 1.0f, 1.0f);
            
            return TypedActionResult.success(stack);
        }

        // Lightning strike logic
        GreekMythologyMod.LOGGER.info("LIGHTNING STRIKE: Calculating target position");
        Vec3d start = user.getEyePos();
        Vec3d end = start.add(user.getRotationVecClient().multiply(40.0));
        
        BlockHitResult hitResult = world.raycast(new RaycastContext(start, end, 
            RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, user));
        
        Vec3d targetPos = hitResult.getType() == HitResult.Type.BLOCK ? hitResult.getPos() : end;
        GreekMythologyMod.LOGGER.info("Target position: {}, {}, {}", targetPos.x, targetPos.y, targetPos.z);
        
        // Spawn lightning
        LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(serverWorld);
        if (lightning != null) {
            lightning.refreshPositionAfterTeleport(targetPos.x, targetPos.y, targetPos.z);
            serverWorld.spawnEntity(lightning);
            GreekMythologyMod.LOGGER.info("LIGHTNING SPAWNED: Successfully created lightning entity");
            
            // Play thunder sound
            world.playSound(null, targetPos.x, targetPos.y, targetPos.z, 
                SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f + world.random.nextFloat() * 0.2f);
        } else {
            GreekMythologyMod.LOGGER.error("LIGHTNING FAILED: Could not create lightning entity");
        }

        GreekMythologyMod.LOGGER.info("=== ZEUS BOLT COMPLETE ===");
        return TypedActionResult.success(stack);
    }
} 