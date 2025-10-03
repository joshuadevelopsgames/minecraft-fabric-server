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
        Vec3d particlePos = calculateParticlePosition(playerPos, data.getSlot());
        
        for (String particleName : data.getActiveParticles()) {
            ParticleData.ParticleConfig config = data.getParticleConfig(particleName);
            if (config != null) {
                spawnParticle(world, particlePos, config);
            }
        }
    }
    
    private Vec3d calculateParticlePosition(Vec3d playerPos, ParticleData.ParticleSlot slot) {
        switch (slot) {
            case ABOVE:
                return playerPos.add(0, 2.5, 0);
            case BELOW:
                return playerPos.add(0, -0.5, 0);
            case AROUND:
            default:
                // Random position around the player
                double angle = random.nextDouble() * 2 * Math.PI;
                double radius = 1.0 + random.nextDouble() * 0.5;
                double x = Math.cos(angle) * radius;
                double z = Math.sin(angle) * radius;
                return playerPos.add(x, 0.5 + random.nextDouble() * 1.5, z);
        }
    }
    
    private void spawnParticle(ServerWorld world, Vec3d pos, ParticleData.ParticleConfig config) {
        double x = pos.x;
        double y = pos.y;
        double z = pos.z;
        
        double velocityX = (random.nextDouble() - 0.5) * config.getSpread();
        double velocityY = (random.nextDouble() - 0.5) * config.getSpread();
        double velocityZ = (random.nextDouble() - 0.5) * config.getSpread();
        
        // For now, just use FLAME particles as a test
        world.spawnParticles(
            net.minecraft.particle.ParticleTypes.FLAME,
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
            // For now, just start with empty particles
            // TODO: Implement JSON deserialization for ParticleData
        } catch (Exception e) {
            System.err.println("Failed to load particles: " + e.getMessage());
        }
    }
}
