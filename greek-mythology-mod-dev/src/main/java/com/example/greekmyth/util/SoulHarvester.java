package com.example.greekmyth.util;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.item.GreekItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import java.util.HashMap;
import java.util.Map;

public class SoulHarvester {
    
    // Map entity types to their corresponding soul items
    private static final Map<EntityType<?>, Item> SOUL_MAP = new HashMap<>();
    
    // Drop chances for different mob types (0.0 to 1.0)
    private static final Map<EntityType<?>, Float> DROP_CHANCES = new HashMap<>();
    
    static {
        // Hostile Mobs - Higher drop rates
        SOUL_MAP.put(EntityType.ZOMBIE, GreekItems.ZOMBIE_SOUL);
        SOUL_MAP.put(EntityType.SKELETON, GreekItems.SKELETON_SOUL);
        SOUL_MAP.put(EntityType.SPIDER, GreekItems.SPIDER_SOUL);
        SOUL_MAP.put(EntityType.CREEPER, GreekItems.CREEPER_SOUL);
        SOUL_MAP.put(EntityType.ENDERMAN, GreekItems.ENDERMAN_SOUL);
        SOUL_MAP.put(EntityType.WITCH, GreekItems.WITCH_SOUL);
        SOUL_MAP.put(EntityType.SLIME, GreekItems.SLIME_SOUL);
        SOUL_MAP.put(EntityType.BLAZE, GreekItems.BLAZE_SOUL);
        SOUL_MAP.put(EntityType.GHAST, GreekItems.GHAST_SOUL);
        SOUL_MAP.put(EntityType.PIGLIN, GreekItems.PIGLIN_SOUL);
        SOUL_MAP.put(EntityType.HOGLIN, GreekItems.HOGLIN_SOUL);
        SOUL_MAP.put(EntityType.ZOMBIFIED_PIGLIN, GreekItems.ZOMBIFIED_PIGLIN_SOUL);
        SOUL_MAP.put(EntityType.MAGMA_CUBE, GreekItems.MAGMA_CUBE_SOUL);
        SOUL_MAP.put(EntityType.WARDEN, GreekItems.WARDEN_SOUL);
        SOUL_MAP.put(EntityType.ELDER_GUARDIAN, GreekItems.ELDER_GUARDIAN_SOUL);
        SOUL_MAP.put(EntityType.WITHER_SKELETON, GreekItems.WITHER_SKELETON_SOUL);
        SOUL_MAP.put(EntityType.DROWNED, GreekItems.DROWNED_SOUL);
        SOUL_MAP.put(EntityType.HUSK, GreekItems.HUSK_SOUL);
        SOUL_MAP.put(EntityType.STRAY, GreekItems.STRAY_SOUL);
        SOUL_MAP.put(EntityType.CAVE_SPIDER, GreekItems.CAVE_SPIDER_SOUL);
        SOUL_MAP.put(EntityType.PHANTOM, GreekItems.PHANTOM_SOUL);
        SOUL_MAP.put(EntityType.VINDICATOR, GreekItems.VINDICATOR_SOUL);
        SOUL_MAP.put(EntityType.EVOKER, GreekItems.EVOKER_SOUL);
        SOUL_MAP.put(EntityType.PILLAGER, GreekItems.PILLAGER_SOUL);
        SOUL_MAP.put(EntityType.RAVAGER, GreekItems.RAVAGER_SOUL);
        SOUL_MAP.put(EntityType.SHULKER, GreekItems.SHULKER_SOUL);
        SOUL_MAP.put(EntityType.SILVERFISH, GreekItems.SILVERFISH_SOUL);
        SOUL_MAP.put(EntityType.ENDERMITE, GreekItems.ENDERMITE_SOUL);
        SOUL_MAP.put(EntityType.GUARDIAN, GreekItems.GUARDIAN_SOUL);
        SOUL_MAP.put(EntityType.BREEZE, GreekItems.BREEZE_SOUL);
        // ILLUSIONER removed - now functions as Oracle mob
        
        // Passive Mobs - Lower drop rates
        SOUL_MAP.put(EntityType.DOLPHIN, GreekItems.DOLPHIN_SOUL);
        SOUL_MAP.put(EntityType.PIG, GreekItems.PIG_SOUL);
        SOUL_MAP.put(EntityType.COW, GreekItems.COW_SOUL);
        SOUL_MAP.put(EntityType.SHEEP, GreekItems.SHEEP_SOUL);
        SOUL_MAP.put(EntityType.CHICKEN, GreekItems.CHICKEN_SOUL);
        SOUL_MAP.put(EntityType.HORSE, GreekItems.HORSE_SOUL);
        SOUL_MAP.put(EntityType.WOLF, GreekItems.WOLF_SOUL);
        SOUL_MAP.put(EntityType.CAT, GreekItems.CAT_SOUL);
        SOUL_MAP.put(EntityType.FOX, GreekItems.FOX_SOUL);
        SOUL_MAP.put(EntityType.RABBIT, GreekItems.RABBIT_SOUL);
        SOUL_MAP.put(EntityType.PANDA, GreekItems.PANDA_SOUL);
        SOUL_MAP.put(EntityType.BEE, GreekItems.BEE_SOUL);
        SOUL_MAP.put(EntityType.LLAMA, GreekItems.LLAMA_SOUL);
        SOUL_MAP.put(EntityType.TRADER_LLAMA, GreekItems.TRADER_LLAMA_SOUL);
        SOUL_MAP.put(EntityType.DONKEY, GreekItems.DONKEY_SOUL);
        SOUL_MAP.put(EntityType.MULE, GreekItems.MULE_SOUL);
        SOUL_MAP.put(EntityType.PARROT, GreekItems.PARROT_SOUL);
        SOUL_MAP.put(EntityType.TURTLE, GreekItems.TURTLE_SOUL);
        SOUL_MAP.put(EntityType.AXOLOTL, GreekItems.AXOLOTL_SOUL);
        SOUL_MAP.put(EntityType.GOAT, GreekItems.GOAT_SOUL);
        SOUL_MAP.put(EntityType.FROG, GreekItems.FROG_SOUL);
        SOUL_MAP.put(EntityType.TADPOLE, GreekItems.TADPOLE_SOUL);
        SOUL_MAP.put(EntityType.ALLAY, GreekItems.ALLAY_SOUL);
        SOUL_MAP.put(EntityType.CAMEL, GreekItems.CAMEL_SOUL);
        SOUL_MAP.put(EntityType.SNIFFER, GreekItems.SNIFFER_SOUL);
        SOUL_MAP.put(EntityType.ARMADILLO, GreekItems.ARMADILLO_SOUL);
        
        // Set drop chances based on mob rarity (DIVIDED BY 10 FOR RARITY)
        // Hostile mobs - higher chances
        DROP_CHANCES.put(EntityType.ZOMBIE, 0.025f);          // 2.5%
        DROP_CHANCES.put(EntityType.SKELETON, 0.025f);        // 2.5%
        DROP_CHANCES.put(EntityType.SPIDER, 0.02f);           // 2.0%
        DROP_CHANCES.put(EntityType.CREEPER, 0.03f);          // 3.0%
        DROP_CHANCES.put(EntityType.ENDERMAN, 0.04f);         // 4.0%
        DROP_CHANCES.put(EntityType.WITCH, 0.035f);           // 3.5%
        DROP_CHANCES.put(EntityType.SLIME, 0.02f);            // 2.0%
        DROP_CHANCES.put(EntityType.BLAZE, 0.045f);           // 4.5%
        DROP_CHANCES.put(EntityType.GHAST, 0.05f);            // 5.0%
        DROP_CHANCES.put(EntityType.PIGLIN, 0.03f);           // 3.0%
        DROP_CHANCES.put(EntityType.HOGLIN, 0.035f);          // 3.5%
        DROP_CHANCES.put(EntityType.ZOMBIFIED_PIGLIN, 0.025f);// 2.5%
        DROP_CHANCES.put(EntityType.MAGMA_CUBE, 0.03f);       // 3.0%
        DROP_CHANCES.put(EntityType.WARDEN, 0.08f);           // 8.0%
        DROP_CHANCES.put(EntityType.ELDER_GUARDIAN, 0.07f);   // 7.0%
        DROP_CHANCES.put(EntityType.WITHER_SKELETON, 0.04f);  // 4.0%
        DROP_CHANCES.put(EntityType.DROWNED, 0.025f);         // 2.5%
        DROP_CHANCES.put(EntityType.HUSK, 0.025f);            // 2.5%
        DROP_CHANCES.put(EntityType.STRAY, 0.025f);           // 2.5%
        DROP_CHANCES.put(EntityType.CAVE_SPIDER, 0.03f);      // 3.0%
        DROP_CHANCES.put(EntityType.PHANTOM, 0.035f);         // 3.5%
        DROP_CHANCES.put(EntityType.VINDICATOR, 0.045f);      // 4.5%
        DROP_CHANCES.put(EntityType.EVOKER, 0.06f);           // 6.0%
        DROP_CHANCES.put(EntityType.PILLAGER, 0.03f);         // 3.0%
        DROP_CHANCES.put(EntityType.RAVAGER, 0.05f);          // 5.0%
        DROP_CHANCES.put(EntityType.SHULKER, 0.045f);         // 4.5%
        DROP_CHANCES.put(EntityType.SILVERFISH, 0.02f);       // 2.0%
        DROP_CHANCES.put(EntityType.ENDERMITE, 0.03f);        // 3.0%
        DROP_CHANCES.put(EntityType.GUARDIAN, 0.035f);        // 3.5%
        DROP_CHANCES.put(EntityType.BREEZE, 0.15f);        // 15.0% - Rare mob
        // ILLUSIONER drop chance removed - now functions as Oracle mob
        
        // Passive mobs - lower chances
        DROP_CHANCES.put(EntityType.DOLPHIN, 0.015f);         // 1.5%
        DROP_CHANCES.put(EntityType.PIG, 0.01f);              // 1.0%
        DROP_CHANCES.put(EntityType.COW, 0.01f);              // 1.0%
        DROP_CHANCES.put(EntityType.SHEEP, 0.01f);            // 1.0%
        DROP_CHANCES.put(EntityType.CHICKEN, 0.01f);          // 1.0%
        DROP_CHANCES.put(EntityType.HORSE, 0.015f);           // 1.5%
        DROP_CHANCES.put(EntityType.WOLF, 0.015f);            // 1.5%
        DROP_CHANCES.put(EntityType.CAT, 0.015f);             // 1.5%
        DROP_CHANCES.put(EntityType.FOX, 0.015f);             // 1.5%
        DROP_CHANCES.put(EntityType.RABBIT, 0.01f);           // 1.0%
        DROP_CHANCES.put(EntityType.PANDA, 0.015f);           // 1.5%
        DROP_CHANCES.put(EntityType.BEE, 0.01f);              // 1.0%
        DROP_CHANCES.put(EntityType.LLAMA, 0.015f);           // 1.5%
        DROP_CHANCES.put(EntityType.TRADER_LLAMA, 0.015f);    // 1.5%
        DROP_CHANCES.put(EntityType.DONKEY, 0.015f);          // 1.5%
        DROP_CHANCES.put(EntityType.MULE, 0.015f);            // 1.5%
        DROP_CHANCES.put(EntityType.PARROT, 0.015f);          // 1.5%
        DROP_CHANCES.put(EntityType.TURTLE, 0.01f);           // 1.0%
        DROP_CHANCES.put(EntityType.AXOLOTL, 0.015f);         // 1.5%
        DROP_CHANCES.put(EntityType.GOAT, 0.015f);            // 1.5%
        DROP_CHANCES.put(EntityType.FROG, 0.01f);             // 1.0%
        DROP_CHANCES.put(EntityType.TADPOLE, 0.01f);          // 1.0%
        DROP_CHANCES.put(EntityType.ALLAY, 0.02f);            // 2.0%
        DROP_CHANCES.put(EntityType.CAMEL, 0.015f);           // 1.5%
        DROP_CHANCES.put(EntityType.SNIFFER, 0.015f);         // 1.5%
        DROP_CHANCES.put(EntityType.ARMADILLO, 0.015f);       // 1.5%
    }
    
    /**
     * Adds a soul to the entity's loot drops (proper loot system)
     * @param entity The entity that died
     * @param world The server world
     * @return true if a soul was successfully added to loot
     */
    public static boolean addSoulToLoot(LivingEntity entity, ServerWorld world) {
        EntityType<?> entityType = entity.getType();
        
        // Check if this entity type has a soul item
        if (!SOUL_MAP.containsKey(entityType)) {
            return false;
        }
        
        // Get the drop chance for this entity type
        Float dropChance = DROP_CHANCES.get(entityType);
        if (dropChance == null) {
            dropChance = 0.15f; // Default 15% chance
        }
        
        // Roll for soul drop
        net.minecraft.util.math.random.Random random = world.getRandom();
        if (random.nextFloat() < dropChance) {
            // Get the soul item for this entity type
            Item soulItem = SOUL_MAP.get(entityType);
            ItemStack soulStack = new ItemStack(soulItem, 1);
            
            // Drop the soul as loot at the entity's death location
            Vec3d position = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
            world.spawnEntity(new net.minecraft.entity.ItemEntity(
                world, 
                position.x, 
                position.y, 
                position.z, 
                soulStack
            ));
            
            // Log the soul harvest
            GreekMythologyMod.LOGGER.info("SOUL LOOT: {} soul added to loot from {} ({}% chance)", 
                soulItem.toString(), entityType.toString(), dropChance * 100);
            
            // Spawn soul particles at entity's position
            for (int i = 0; i < 10; i++) {
                double x = position.x + (random.nextDouble() - 0.5) * 2;
                double y = position.y + random.nextDouble() * 2;
                double z = position.z + (random.nextDouble() - 0.5) * 2;
                world.spawnParticles(net.minecraft.particle.ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
            }
            
            // Play soul harvest sound
            world.playSound(null, position.x, position.y, position.z,
                net.minecraft.sound.SoundEvents.ENTITY_WITHER_AMBIENT, 
                net.minecraft.sound.SoundCategory.PLAYERS, 0.5f, 1.5f);
            
            return true;
        }
        
        return false;
    }
    
    // OLD METHOD REMOVED - Use addSoulToLoot() for proper loot drops only
    
    /**
     * Gets the soul item for a given entity type
     * @param entityType The entity type
     * @return The corresponding soul item, or null if none exists
     */
    public static Item getSoulItem(EntityType<?> entityType) {
        return SOUL_MAP.get(entityType);
    }
    
    /**
     * Gets the drop chance for a given entity type
     * @param entityType The entity type
     * @return The drop chance (0.0 to 1.0)
     */
    public static float getDropChance(EntityType<?> entityType) {
        return DROP_CHANCES.getOrDefault(entityType, 0.15f);
    }
    
    /**
     * Checks if an entity type can drop a soul
     * @param entityType The entity type to check
     * @return true if the entity can drop a soul
     */
    public static boolean canDropSoul(EntityType<?> entityType) {
        return SOUL_MAP.containsKey(entityType);
    }
} 