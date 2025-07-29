package com.example.greekmyth.event;

import com.example.greekmyth.GreekMythologyMod;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;

public class UndeadWarriorSoundEvents {
    
    public static void register() {
        // Override wolf sounds for Undead Warriors
        ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
            if (entity instanceof WolfEntity wolf) {
                Text customName = wolf.getCustomName();
                if (customName != null && customName.getString().contains("Undead Warrior")) {
                    // This is an Undead Warrior - we'll handle sounds in the attack events
                    GreekMythologyMod.LOGGER.info("UNDEAD WARRIOR SOUNDS: Registered sound overrides for wolf {}", wolf.getName().getString());
                }
            }
        });
        
        GreekMythologyMod.LOGGER.info("Undead Warrior sound events registered successfully!");
    }
    
    // Method to play wither skeleton sounds for Undead Warriors
    public static void playWitherSkeletonSound(WolfEntity wolf, ServerWorld world, String soundType) {
        Text customName = wolf.getCustomName();
        if (customName != null && customName.getString().contains("Undead Warrior")) {
            switch (soundType) {
                case "ambient":
                    world.playSound(null, wolf.getX(), wolf.getY(), wolf.getZ(),
                        SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT, SoundCategory.HOSTILE, 1.0f, 1.0f);
                    break;
                case "hurt":
                    world.playSound(null, wolf.getX(), wolf.getY(), wolf.getZ(),
                        SoundEvents.ENTITY_WITHER_SKELETON_HURT, SoundCategory.HOSTILE, 1.0f, 1.0f);
                    break;
                case "death":
                    world.playSound(null, wolf.getX(), wolf.getY(), wolf.getZ(),
                        SoundEvents.ENTITY_WITHER_SKELETON_DEATH, SoundCategory.HOSTILE, 1.0f, 1.0f);
                    break;
                case "step":
                    world.playSound(null, wolf.getX(), wolf.getY(), wolf.getZ(),
                        SoundEvents.ENTITY_SKELETON_STEP, SoundCategory.HOSTILE, 0.3f, 1.0f);
                    break;
            }
        }
    }
} 