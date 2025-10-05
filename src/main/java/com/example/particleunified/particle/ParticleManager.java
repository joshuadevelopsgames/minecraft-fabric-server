package com.example.particleunified.particle;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Manages particle data for all players and handles particle spawning
 */
public class ParticleManager {
    private final Map<String, ParticleData> playerParticles = new HashMap<>();
    private final Random random = new Random();
    private static final String PARTICLES_FILE = "world/data/player_particles.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    
    public ParticleManager() {
        loadParticles();
    }
    
    public static ParticleManager getServerState(MinecraftServer server) {
        return new ParticleManager();
    }
    
    public ParticleData getPlayerData(String playerName) {
        return playerParticles.computeIfAbsent(playerName, k -> new ParticleData());
    }
    
    public ParticleData getPlayerData(PlayerEntity player) {
        return getPlayerData(player.getName().getString());
    }
    
    public void setPlayerData(String playerName, ParticleData data) {
        playerParticles.put(playerName, data);
        saveParticles();
    }
    
    public void spawnPlayerParticles(ServerPlayerEntity player, ServerWorld world) {
        ParticleData data = getPlayerData(player);
        
        if (!data.isEnabled() || data.getActiveParticles().isEmpty()) {
            return;
        }
        
        Vec3d playerPos = player.getPos();
        
        // Spawn particles in different positions for variety
        for (String particleName : data.getActiveParticles()) {
            ParticleData.ParticleConfig config = data.getParticleConfig(particleName);
            if (config != null) {
                // Create multiple positions for each particle type
                for (int i = 0; i < config.getCount(); i++) {
                    Vec3d particlePos = calculateParticlePosition(playerPos, data.getSlot());
                    spawnParticle(world, particlePos, config);
                }
            }
        }
        
        // Add special combination effects
        spawnCombinationEffects(world, playerPos, data);
    }
    
    private Vec3d calculateParticlePosition(Vec3d playerPos, ParticleData.ParticleSlot slot) {
        switch (slot) {
            case ABOVE:
                // Create a halo effect above the player
                double angle = random.nextDouble() * 2 * Math.PI;
                double radius = 0.5 + random.nextDouble() * 0.8;
                double x = Math.cos(angle) * radius;
                double z = Math.sin(angle) * radius;
                return playerPos.add(x, 2.0 + random.nextDouble() * 1.0, z);
            case BELOW:
                // Create a ground effect below the player
                double groundAngle = random.nextDouble() * 2 * Math.PI;
                double groundRadius = 0.3 + random.nextDouble() * 0.7;
                double groundX = Math.cos(groundAngle) * groundRadius;
                double groundZ = Math.sin(groundAngle) * groundRadius;
                return playerPos.add(groundX, -0.2 + random.nextDouble() * 0.3, groundZ);
            case AROUND:
            default:
                // Create a swirling effect around the player
                double swirlAngle = random.nextDouble() * 2 * Math.PI;
                double swirlRadius = 0.8 + random.nextDouble() * 1.2;
                double swirlX = Math.cos(swirlAngle) * swirlRadius;
                double swirlZ = Math.sin(swirlAngle) * swirlRadius;
                return playerPos.add(swirlX, 0.5 + random.nextDouble() * 1.8, swirlZ);
        }
    }
    
    private void spawnCombinationEffects(ServerWorld world, Vec3d playerPos, ParticleData data) {
        // Create special effects when multiple particle types are active
        int activeCount = data.getActiveParticles().size();
        
        if (activeCount >= 3) {
            // Create a magical aura effect
            for (int i = 0; i < 5; i++) {
                double angle = (i * 2 * Math.PI) / 5.0;
                double radius = 1.5;
                double x = Math.cos(angle) * radius;
                double z = Math.sin(angle) * radius;
                Vec3d auraPos = playerPos.add(x, 1.0, z);
                
                world.spawnParticles(
                    net.minecraft.particle.ParticleTypes.ENCHANT,
                    auraPos.x, auraPos.y, auraPos.z,
                    1, 0.0, 0.1, 0.0, 0.0
                );
            }
        }
        
        if (activeCount >= 5) {
            // Create a powerful magical effect
            for (int i = 0; i < 8; i++) {
                double angle = (i * 2 * Math.PI) / 8.0;
                double radius = 2.0;
                double x = Math.cos(angle) * radius;
                double z = Math.sin(angle) * radius;
                Vec3d powerPos = playerPos.add(x, 0.5, z);
                
                world.spawnParticles(
                    net.minecraft.particle.ParticleTypes.PORTAL,
                    powerPos.x, powerPos.y, powerPos.z,
                    1, 0.0, 0.2, 0.0, 0.0
                );
            }
        }
    }
    
    private void spawnParticle(ServerWorld world, Vec3d pos, ParticleData.ParticleConfig config) {
        double x = pos.x;
        double y = pos.y;
        double z = pos.z;
        
        double velocityX = (random.nextDouble() - 0.5) * config.getSpread();
        double velocityY = (random.nextDouble() - 0.5) * config.getSpread();
        double velocityZ = (random.nextDouble() - 0.5) * config.getSpread();
        
        // Use the actual particle type from the config
        world.spawnParticles(
            config.getType().getParticleType(),
            x, y, z,
            config.getCount(),
            velocityX, velocityY, velocityZ,
            config.getSpeed()
        );
    }
    
    public void addParticleToPlayer(String playerName, String particleName, ParticleData.ParticleType type) {
        ParticleData data = getPlayerData(playerName);
        ParticleData.ParticleConfig config = new ParticleData.ParticleConfig(type);
        data.addParticle(particleName, config);
        setPlayerData(playerName, data);
    }
    
    public void removeParticleFromPlayer(String playerName, String particleName) {
        ParticleData data = getPlayerData(playerName);
        data.removeParticle(particleName);
        setPlayerData(playerName, data);
    }
    
    public void setPlayerSlot(String playerName, ParticleData.ParticleSlot slot) {
        ParticleData data = getPlayerData(playerName);
        data.setSlot(slot);
        setPlayerData(playerName, data);
    }
    
    public void setPlayerEnabled(String playerName, boolean enabled) {
        ParticleData data = getPlayerData(playerName);
        data.setEnabled(enabled);
        setPlayerData(playerName, data);
    }
    
    public void enableAllPlayerParticles(String playerName) {
        ParticleData data = getPlayerData(playerName);
        data.enableAllParticles();
        setPlayerData(playerName, data);
    }
    
    public void disableAllPlayerParticles(String playerName) {
        ParticleData data = getPlayerData(playerName);
        data.disableAllParticles();
        setPlayerData(playerName, data);
    }
    
    public void resetPlayerParticles(String playerName) {
        ParticleData data = new ParticleData();
        setPlayerData(playerName, data);
    }
    
    private void saveParticles() {
        try {
            String json = GSON.toJson(playerParticles);
            File file = new File(PARTICLES_FILE);
            file.getParentFile().mkdirs();
            java.nio.file.Files.write(file.toPath(), json.getBytes());
        } catch (Exception e) {
            System.err.println("Failed to save particles: " + e.getMessage());
        }
    }
    
    private void loadParticles() {
        try {
            File file = new File(PARTICLES_FILE);
            if (!file.exists()) {
                return;
            }
            
            String json = new String(java.nio.file.Files.readAllBytes(file.toPath()));
            if (json.trim().isEmpty()) {
                return;
            }
            
            // Parse the JSON and load particle data
            com.google.gson.reflect.TypeToken<Map<String, ParticleData>> typeToken = 
                new com.google.gson.reflect.TypeToken<Map<String, ParticleData>>() {};
            Map<String, ParticleData> loadedParticles = GSON.fromJson(json, typeToken.getType());
            
            if (loadedParticles != null) {
                playerParticles.putAll(loadedParticles);
            }
        } catch (Exception e) {
            System.err.println("Failed to load particles: " + e.getMessage());
        }
    }
}
