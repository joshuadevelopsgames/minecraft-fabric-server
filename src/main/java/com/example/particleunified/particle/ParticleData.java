package com.example.particleunified.particle;

import net.minecraft.particle.ParticleTypes;

import java.util.*;

/**
 * Data class to store particle preferences for each player
 */
public class ParticleData {
    private boolean enabled = true;
    private ParticleSlot slot = ParticleSlot.AROUND;
    private final Set<String> activeParticles = new HashSet<>();
    private final Map<String, ParticleConfig> particleConfigs = new HashMap<>();
    
    // Available particle types
    public enum ParticleType {
        HEART("heart", ParticleTypes.HEART),
        HAPPY_VILLAGER("happy_villager", ParticleTypes.HAPPY_VILLAGER),
        VILLAGER_ANGRY("villager_angry", ParticleTypes.ANGRY_VILLAGER),
        EXPLOSION("explosion", ParticleTypes.EXPLOSION),
        FIREWORK("firework", ParticleTypes.FIREWORK),
        ENCHANT("enchant", ParticleTypes.ENCHANT),
        CRIT("crit", ParticleTypes.CRIT),
        MAGIC_CRIT("magic_crit", ParticleTypes.ENCHANTED_HIT),
        SMOKE("smoke", ParticleTypes.SMOKE),
        LARGE_SMOKE("large_smoke", ParticleTypes.LARGE_SMOKE),
        SPELL("spell", ParticleTypes.EFFECT),
        INSTANT_SPELL("instant_spell", ParticleTypes.INSTANT_EFFECT),
        MOB_SPELL("mob_spell", ParticleTypes.ENTITY_EFFECT),
        MOB_SPELL_AMBIENT("mob_spell_ambient", ParticleTypes.ENTITY_EFFECT),
        NOTE("note", ParticleTypes.NOTE),
        PORTAL("portal", ParticleTypes.PORTAL),
        SPLASH("splash", ParticleTypes.SPLASH),
        LAVA("lava", ParticleTypes.LAVA),
        WATER_SPLASH("water_splash", ParticleTypes.SPLASH),
        BUBBLE("bubble", ParticleTypes.BUBBLE),
        SUSPENDED("suspended", ParticleTypes.UNDERWATER),
        DEPTH_SUSPENDED("depth_suspended", ParticleTypes.UNDERWATER),
        CRIMSON_SPORE("crimson_spore", ParticleTypes.CRIMSON_SPORE),
        WARPED_SPORE("warped_spore", ParticleTypes.WARPED_SPORE),
        SOUL("soul", ParticleTypes.SOUL),
        SOUL_FIRE_FLAME("soul_fire_flame", ParticleTypes.SOUL_FIRE_FLAME),
        FLAME("flame", ParticleTypes.FLAME),
        CAMPFIRE_COSY_SMOKE("campfire_cosy_smoke", ParticleTypes.CAMPFIRE_COSY_SMOKE),
        CAMPFIRE_SIGNAL_SMOKE("campfire_signal_smoke", ParticleTypes.CAMPFIRE_SIGNAL_SMOKE);
        
        private final String name;
        private final net.minecraft.particle.ParticleType<?> particleType;
        
        ParticleType(String name, net.minecraft.particle.ParticleType<?> particleType) {
            this.name = name;
            this.particleType = particleType;
        }
        
        public String getName() {
            return name;
        }
        
        public net.minecraft.particle.ParticleType<?> getParticleType() {
            return particleType;
        }
        
        public static ParticleType fromName(String name) {
            for (ParticleType type : values()) {
                if (type.name.equals(name)) {
                    return type;
                }
            }
            return null;
        }
    }
    
    public enum ParticleSlot {
        ABOVE, AROUND, BELOW
    }
    
    public static class ParticleConfig {
        private final ParticleType type;
        private int count = 1;
        private double spread = 0.1;
        private double speed = 0.0;
        
        public ParticleConfig(ParticleType type) {
            this.type = type;
        }
        
        public ParticleConfig(ParticleType type, int count, double spread, double speed) {
            this.type = type;
            this.count = count;
            this.spread = spread;
            this.speed = speed;
        }
        
        public ParticleType getType() {
            return type;
        }
        
        public int getCount() {
            return count;
        }
        
        public double getSpread() {
            return spread;
        }
        
        public double getSpeed() {
            return speed;
        }
    }
    
    public ParticleData() {
        // Add some default particles
        addParticle("heart", new ParticleConfig(ParticleType.HEART, 1, 0.1, 0.0));
        addParticle("happy_villager", new ParticleConfig(ParticleType.HAPPY_VILLAGER, 1, 0.1, 0.0));
        addParticle("flame", new ParticleConfig(ParticleType.FLAME, 3, 0.2, 0.05));
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public ParticleSlot getSlot() {
        return slot;
    }
    
    public void setSlot(ParticleSlot slot) {
        this.slot = slot;
    }
    
    public Set<String> getActiveParticles() {
        return new HashSet<>(activeParticles);
    }
    
    public void addParticle(String name, ParticleConfig config) {
        particleConfigs.put(name, config);
        activeParticles.add(name);
    }
    
    public void removeParticle(String name) {
        activeParticles.remove(name);
        particleConfigs.remove(name);
    }
    
    public void clearAllParticles() {
        activeParticles.clear();
        particleConfigs.clear();
    }
    
    public void enableAllParticles() {
        activeParticles.addAll(particleConfigs.keySet());
    }
    
    public void disableAllParticles() {
        activeParticles.clear();
    }
    
    public ParticleConfig getParticleConfig(String name) {
        return particleConfigs.get(name);
    }
    
    public Collection<ParticleConfig> getAllParticleConfigs() {
        return particleConfigs.values();
    }
}
