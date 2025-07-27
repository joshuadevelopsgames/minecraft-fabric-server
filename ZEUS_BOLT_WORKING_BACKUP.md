# ⚡ ZEUS BOLT - WORKING CODE BACKUP
*Last Updated: July 25, 2025 - Version 1.0.57*
**PERFECTLY WORKING - DO NOT MODIFY**

---

## 🎯 **WORKING FUNCTIONALITY**

### **Current Perfect Behavior:**
- ✅ **5 Charges**: Zeus Bolt has 5 charges before cooldown
- ✅ **30-Second Cooldown**: After 5 uses, 30-second cooldown then reset to 5 charges
- ✅ **Weapon Damage**: 8.0 damage on left-click (Netherite sword level)
- ✅ **Lightning Strikes**: Right-click for lightning strikes (40 block range)
- ✅ **Flight Ability**: Shift + right-click for flight burst
- ✅ **Weather Bonus**: Infinite charges during rain/thunder
- ✅ **Fire Immunity**: Item doesn't burn in fire/lava
- ✅ **Lava Floating**: Item floats to surface in lava

---

## 📁 **COMPLETE WORKING CODE FILES**

### **1. ZeusBoltItem.java - WORKING VERSION**
```java
package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

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
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItem;

public class ZeusBoltItem extends Item implements FabricItem {
    private static final Identifier COOLDOWN_ID = Identifier.of("greekmyth", "zeus_bolt_cooldown");
    private static final int COOLDOWN_TICKS = 30 * 20; // 30 seconds
    private static final int MAX_CHARGES = 5;

    public ZeusBoltItem(Item.Settings settings) {
        super(settings);
        GreekMythologyMod.LOGGER.info("ZeusBoltItem constructor called - MAX_CHARGES: {}", MAX_CHARGES);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    // Add weapon damage functionality
    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // Apply Netherite sword-level damage (8.0 damage)
        if (attacker.getWorld() instanceof ServerWorld serverWorld) {
            target.damage(serverWorld, serverWorld.getDamageSources().generic(), 8.0f);
        }
    }

    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = super.getDefaultStack();
        stack.setDamage(0); // Ensure new items start with full charges
        GreekMythologyMod.LOGGER.info("ZeusBoltItem getDefaultStack called - setting damage to 0");
        return stack;
    }

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);
        
        GreekMythologyMod.LOGGER.info("=== ZEUS BOLT USE METHOD CALLED ===");
        GreekMythologyMod.LOGGER.info("World isClient: {}", world.isClient);
        GreekMythologyMod.LOGGER.info("Player: {}", user.getName().getString());
        GreekMythologyMod.LOGGER.info("Hand: {}", hand);
        GreekMythologyMod.LOGGER.info("Stack: {}", stack.toString());
        
        if (world.isClient) {
            GreekMythologyMod.LOGGER.info("Zeus Bolt used on CLIENT side");
            return ActionResult.SUCCESS;
        }

        ServerPlayerEntity serverUser = (ServerPlayerEntity) user;
        ServerWorld serverWorld = (ServerWorld) world;

        // Check for infinite lightning during rain/thunder
        boolean isThundering = world.isThundering();
        boolean isRaining = world.isRaining();
        boolean isSkyVisible = world.isSkyVisible(user.getBlockPos());
        boolean infinite = isThundering || (isRaining && isSkyVisible);
        
        // Get current state
        boolean isOnCooldown = user.getItemCooldownManager().isCoolingDown(stack);
        int currentDamage = stack.getDamage();
        
        // Fix the max damage issue - if maxDamage is wrong, reset the item
        if (stack.getMaxDamage() != 5) {
            GreekMythologyMod.LOGGER.info("ZeusBoltItem use - fixing max damage from {} to 5", stack.getMaxDamage());
            stack.setDamage(0); // Reset to full charges
            currentDamage = 0;
        }
        
        // Check if cooldown has expired and reset charges if needed
        if (currentDamage >= MAX_CHARGES && !isOnCooldown) {
            GreekMythologyMod.LOGGER.info("COOLDOWN EXPIRED: Resetting charges from {} to 0", currentDamage);
            stack.setDamage(0); // Reset to full charges
            currentDamage = 0;
        }
        
        // Calculate charges correctly
        int currentCharges = MAX_CHARGES - currentDamage;
        
        // Log the actual damage and max damage values
        GreekMythologyMod.LOGGER.info("ZeusBoltItem use - Damage: {}, MaxDamage: {}, Charges: {}/{}, Stack: {}", 
            currentDamage, stack.getMaxDamage(), currentCharges, MAX_CHARGES, stack.toString());
        
        // Handle sneak + right-click for flight burst (works regardless of charges/cooldown)
        if (user.isSneaking()) {
            GreekMythologyMod.LOGGER.info("FLIGHT BURST: Applying levitation and slow falling effects");
            // Flight burst: Levitation IV for 2.5s then Slow Falling for 2.5s
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 50, 3)); // 2.5s Levitation IV
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 100, 0)); // 5s Slow Falling (covers both effects)
            
            world.playSound(null, user.getX(), user.getY(), user.getZ(), 
                SoundEvents.ENTITY_ILLUSIONER_MIRROR_MOVE, SoundCategory.PLAYERS, 1.0f, 1.0f);
            
            return ActionResult.SUCCESS;
        }

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
            
            // Lightning strike logic for infinite mode
            GreekMythologyMod.LOGGER.info("LIGHTNING STRIKE: Calculating target position");
            Vec3d start = user.getEyePos();
            Vec3d end = start.add(user.getRotationVecClient().multiply(40.0));
            
            BlockHitResult hitResult = world.raycast(new RaycastContext(start, end, 
                RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, user));
            
            Vec3d targetPos = hitResult.getType() == HitResult.Type.BLOCK ? hitResult.getPos() : end;
            GreekMythologyMod.LOGGER.info("Target position: {}, {}, {}", targetPos.x, targetPos.y, targetPos.z);
            
            // Spawn lightning
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(serverWorld, net.minecraft.entity.SpawnReason.NATURAL);
            if (lightning != null) {
                lightning.refreshPositionAfterTeleport(targetPos.x, targetPos.y, targetPos.z);
                serverWorld.spawnEntity(lightning);
                GreekMythologyMod.LOGGER.info("LIGHTNING SPAWNED: Successfully created lightning entity");
                
                // Apply additional lightning damage to nearby entities
                serverWorld.getOtherEntities(lightning, lightning.getBoundingBox().expand(3.0), entity -> 
                    entity instanceof LivingEntity && entity != user).forEach(entity -> {
                    LivingEntity livingEntity = (LivingEntity) entity;
                    // Apply extra lightning damage (vanilla lightning does 5 damage, we add 3 more)
                    livingEntity.damage(serverWorld, serverWorld.getDamageSources().lightningBolt(), 8.0f);
                    GreekMythologyMod.LOGGER.info("EXTRA LIGHTNING DAMAGE: Applied 8.0 damage to {}", livingEntity.getName().getString());
                });
                
                // Play thunder sound
                world.playSound(null, targetPos.x, targetPos.y, targetPos.z, 
                    SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f + world.random.nextFloat() * 0.2f);
            } else {
                GreekMythologyMod.LOGGER.error("LIGHTNING FAILED: Could not create lightning entity");
            }
        } else {
            // Check cooldown and charges
            if (isOnCooldown) {
                GreekMythologyMod.LOGGER.info("BLOCKED: Item is on cooldown");
                return ActionResult.FAIL;
            }
            
            if (currentCharges <= 0) {
                GreekMythologyMod.LOGGER.info("BLOCKED: No charges remaining");
                return ActionResult.FAIL;
            }
            
            // Consume charge
            int newDamage = currentDamage + 1;
            stack.setDamage(newDamage);
            GreekMythologyMod.LOGGER.info("Charge consumed (damage: {} -> {})", currentDamage, newDamage);
            
            // Set cooldown when we run out of charges
            if (newDamage >= MAX_CHARGES) {
                user.getItemCooldownManager().set(stack, COOLDOWN_TICKS);
                GreekMythologyMod.LOGGER.info("COOLDOWN SET: {} ticks (all charges used)", COOLDOWN_TICKS);
            }
            
            // Lightning strike logic for normal mode
            GreekMythologyMod.LOGGER.info("LIGHTNING STRIKE: Calculating target position");
            Vec3d start = user.getEyePos();
            Vec3d end = start.add(user.getRotationVecClient().multiply(40.0));
            
            BlockHitResult hitResult = world.raycast(new RaycastContext(start, end, 
                RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, user));
            
            Vec3d targetPos = hitResult.getType() == HitResult.Type.BLOCK ? hitResult.getPos() : end;
            GreekMythologyMod.LOGGER.info("Target position: {}, {}, {}", targetPos.x, targetPos.y, targetPos.z);
            
            // Spawn lightning
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(serverWorld, net.minecraft.entity.SpawnReason.NATURAL);
            if (lightning != null) {
                lightning.refreshPositionAfterTeleport(targetPos.x, targetPos.y, targetPos.z);
                serverWorld.spawnEntity(lightning);
                GreekMythologyMod.LOGGER.info("LIGHTNING SPAWNED: Successfully created lightning entity");
                
                // Apply additional lightning damage to nearby entities
                serverWorld.getOtherEntities(lightning, lightning.getBoundingBox().expand(3.0), entity -> 
                    entity instanceof LivingEntity && entity != user).forEach(entity -> {
                    LivingEntity livingEntity = (LivingEntity) entity;
                    // Apply extra lightning damage (vanilla lightning does 5 damage, we add 3 more)
                    livingEntity.damage(serverWorld, serverWorld.getDamageSources().lightningBolt(), 8.0f);
                    GreekMythologyMod.LOGGER.info("EXTRA LIGHTNING DAMAGE: Applied 8.0 damage to {}", livingEntity.getName().getString());
                });
                
                // Play thunder sound
                world.playSound(null, targetPos.x, targetPos.y, targetPos.z, 
                    SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, SoundCategory.WEATHER, 10000.0f, 0.8f + world.random.nextFloat() * 0.2f);
            } else {
                GreekMythologyMod.LOGGER.error("LIGHTNING FAILED: Could not create lightning entity");
            }
        }

        GreekMythologyMod.LOGGER.info("=== ZEUS BOLT COMPLETE ===");
        return ActionResult.SUCCESS;
    }
}
```

### **2. GreekItems.java - WORKING VERSION**
```java
package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class GreekItems {
    public static final Identifier ZEUS_BOLT_ID = Identifier.of(GreekMythologyMod.MOD_ID, "zeus_bolt");
    public static Item ZEUS_BOLT;
    
    // Called from mod initializer to ensure this class is loaded.
    public static void init() {
        Item.Settings settings = new Item.Settings()
            .maxCount(1)
            .maxDamage(5)
            .fireproof()
            .rarity(Rarity.EPIC)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_BOLT_ID));

        ZEUS_BOLT = Registry.register(Registries.ITEM, ZEUS_BOLT_ID,
            new ZeusBoltItem(settings));
        GreekMythologyMod.LOGGER.info("Registered Zeus Bolt via factory with weapon attributes");
    }
}
```

### **3. ItemEntityMixin.java - WORKING VERSION**
```java
package com.example.greekmyth.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import com.example.greekmyth.item.GreekItems;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin extends Entity {
    public ItemEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    /**
     * Give fireproof items (e.g., Netherite and the Zeus Bolt) the same gentle upward
     * drift that vanilla applies to Netherite so they float to the lava surface.
     */
    @Inject(method = "tick", at = @At("HEAD"))
    private void greekmyth$floatIfFireproof(CallbackInfo ci) {
        // Cast is safe because we are mixed into ItemEntity
        ItemStack stack = ((ItemEntity) (Object) this).getStack();
        if (stack.isOf(GreekItems.ZEUS_BOLT)) {
            System.out.println("[ZeusBoltMixin] tick stack="+stack+" inLava="+this.isInLava());
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("[DEBUG] Zeus Bolt entity tick - inLava={}, velocityY={}", 
                this.isInLava(), this.getVelocity().y);
        }
        if (stack.isOf(GreekItems.ZEUS_BOLT) && this.isInLava()) {
            com.example.greekmyth.GreekMythologyMod.LOGGER.info("[DEBUG] Zeus Bolt entity in lava – applying upward velocity; velocityY={}", this.getVelocity().y);
            // Apply a small, continuous upward velocity
            this.setVelocity(this.getVelocity().add(0.0, 0.04, 0.0));
            // Mark dirty so the change is synced to clients
            this.velocityDirty = true;
        }
    }
}
```

### **4. build.gradle - WORKING VERSION**
```gradle
plugins {
    id 'fabric-loom' version '1.11.4'
}

group = 'com.example.greekmyth'
archivesBaseName = 'greek-mythology'
version = '1.0.57'

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenLocal()
    mavenCentral()
    maven { url 'https://maven.fabricmc.net/' }
}

dependencies {
    minecraft 'com.mojang:minecraft:1.21.8'
    mappings 'net.fabricmc:yarn:1.21.8+build.1:v2'
    modImplementation 'net.fabricmc:fabric-loader:0.16.14'
    modImplementation 'net.fabricmc.fabric-api:fabric-api:0.129.0+local'
    implementation 'com.google.code.gson:gson:2.10.1'
    implementation 'com.mojang:brigadier:1.0.18'
}

loom {
    splitEnvironmentSourceSets()
}
```

---

## 🔧 **CRITICAL CONFIGURATION VALUES**

### **Item Settings (MUST BE EXACT):**
```java
Item.Settings settings = new Item.Settings()
    .maxCount(1)           // ← CRITICAL: Only 1 per stack
    .maxDamage(5)          // ← CRITICAL: Must be exactly 5 for charge system
    .fireproof()           // ← CRITICAL: Enables fire immunity
    .rarity(Rarity.EPIC)   // ← CRITICAL: Epic rarity
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_BOLT_ID));
```

### **Constants (MUST BE EXACT):**
```java
private static final int COOLDOWN_TICKS = 30 * 20; // 30 seconds (600 ticks)
private static final int MAX_CHARGES = 5;          // 5 charges before cooldown
```

### **Weapon Damage (MUST BE EXACT):**
```java
@Override
public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    if (attacker.getWorld() instanceof ServerWorld serverWorld) {
        target.damage(serverWorld, serverWorld.getDamageSources().generic(), 8.0f);
    }
}
```

---

## 🚫 **WHAT NEVER TO CHANGE**

### **Critical Values (NEVER MODIFY):**
1. **`.maxDamage(5)`** - Must be exactly 5 for charge system
2. **`.fireproof()`** - Required for fire immunity
3. **`MAX_CHARGES = 5`** - Must be exactly 5
4. **`COOLDOWN_TICKS = 30 * 20`** - Must be exactly 600 ticks
5. **`8.0f` damage** - Must be exactly 8.0 for weapon damage
6. **Mixin configuration** - Required for lava floating

### **Critical Logic (NEVER MODIFY):**
1. **Charge Reset Logic**: Only reset when `currentDamage >= MAX_CHARGES && !isOnCooldown`
2. **Cooldown Logic**: Only set cooldown when `newDamage >= MAX_CHARGES`
3. **Flight Logic**: Must work regardless of charges/cooldown
4. **Weather Logic**: Must give infinite charges during rain/thunder

---

## 📋 **DEPLOYMENT CHECKLIST**

### **Before Deploying:**
- [ ] Version number updated in `build.gradle`
- [ ] All files match this backup exactly
- [ ] Build successful with `gradle build`
- [ ] Mod file copied to remote server
- [ ] Old version removed from server
- [ ] Server restarted
- [ ] Logs checked for initialization

### **Test Checklist:**
- [ ] 5 charges before cooldown
- [ ] 30-second cooldown after 5 uses
- [ ] Charges reset after cooldown
- [ ] 8.0 damage on left-click
- [ ] Lightning strikes on right-click
- [ ] Flight burst on shift + right-click
- [ ] Fire immunity working
- [ ] Lava floating working
- [ ] Infinite charges during rain/thunder

---

## 🎯 **WORKING BEHAVIOR SUMMARY**

### **Perfect Functionality:**
1. **Right-Click**: Lightning strike (5 charges, then 30s cooldown)
2. **Left-Click**: Melee weapon (8.0 damage, Netherite sword level)
3. **Shift + Right-Click**: Flight burst (works anytime)
4. **Weather Bonus**: Infinite charges during rain/thunder
5. **Fire Immunity**: Doesn't burn in fire/lava
6. **Lava Floating**: Floats to surface in lava

### **Charge System:**
- **Max Charges**: 5
- **Cooldown**: 30 seconds after 5 uses
- **Reset**: Automatically resets to 5 charges after cooldown
- **Visual**: Shows remaining charges in durability bar

---

## 🔒 **BACKUP SECURITY**

This backup contains the **EXACT WORKING CODE** that makes the Zeus Bolt function perfectly. If anything ever changes or breaks, this backup can be used to restore the working functionality.

**Last Verified Working**: July 25, 2025 - Version 1.0.57
**Server Status**: ✅ Fully Operational
**Player Feedback**: ✅ "EXACTLY how I want it to"

---

*This backup is sacred - preserve it at all costs!* ⚡ 