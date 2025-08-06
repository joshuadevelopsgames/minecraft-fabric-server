package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class GreekEntityTypes {
    
    public static final EntityType<InfernoPearlEntity> INFERNO_PEARL = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_pearl"),
        EntityType.Builder.<InfernoPearlEntity>create(InfernoPearlEntity::new, SpawnGroup.MISC)
            .dimensions(0.25f, 0.25f) // Same size as ender pearl
            .maxTrackingRange(4)
            .trackingTickInterval(10)
            .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(), Identifier.of(GreekMythologyMod.MOD_ID, "inferno_pearl")))
    );
    
    public static final EntityType<MerchantPiglinEntity> MERCHANT_PIGLIN = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(GreekMythologyMod.MOD_ID, "merchant_piglin"),
        FabricEntityTypeBuilder.createMob()
            .entityFactory(MerchantPiglinEntity::new)
            .spawnGroup(SpawnGroup.CREATURE)
            .dimensions(EntityDimensions.fixed(0.6f, 1.95f)) // Same as Piglin
            .defaultAttributes(PiglinEntity::createPiglinAttributes)
            .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(), Identifier.of(GreekMythologyMod.MOD_ID, "merchant_piglin")))
    );
    
    public static void initialize() {
        GreekMythologyMod.LOGGER.info("Registering Greek Mythology entity types");
    }
} 