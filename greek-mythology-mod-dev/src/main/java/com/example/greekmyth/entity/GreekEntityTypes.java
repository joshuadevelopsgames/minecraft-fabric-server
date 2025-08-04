package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
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
    
    public static void initialize() {
        GreekMythologyMod.LOGGER.info("Registering Greek Mythology entity types");
    }
} 