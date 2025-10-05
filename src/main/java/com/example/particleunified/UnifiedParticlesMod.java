package com.example.particleunified;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import com.example.particleunified.particle.ParticleManager;
import com.example.particleunified.particle.ParticleData;

public class UnifiedParticlesMod implements ModInitializer {
    
    @Override
    public void onInitialize() {
        // Register the unified commands
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            registerUnifiedCommands(dispatcher);
        });
        
        // Register server tick event to spawn particles
        ServerTickEvents.END_SERVER_TICK.register(this::onServerTick);
    }
    
    private void onServerTick(MinecraftServer server) {
        // Spawn particles every 5 ticks (4 times per second)
        if (server.getTicks() % 5 == 0) {
            ParticleManager particleManager = ParticleManager.getServerState(server);
            
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                ServerWorld world = player.getWorld();
                particleManager.spawnPlayerParticles(player, world);
            }
        }
    }
    
    private static void registerUnifiedCommands(CommandDispatcher<ServerCommandSource> dispatcher) {
        // Main magic-particles command
        dispatcher.register(CommandManager.literal("magic-particles")
            .then(CommandManager.literal("above")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.setPlayerSlot(playerName, ParticleData.ParticleSlot.ABOVE);
                    context.getSource().sendFeedback(() -> Text.literal("Particle slot set to above"), false);
                    return 1;
                }))
            .then(CommandManager.literal("around")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.setPlayerSlot(playerName, ParticleData.ParticleSlot.AROUND);
                    context.getSource().sendFeedback(() -> Text.literal("Particle slot set to around"), false);
                    return 1;
                }))
            .then(CommandManager.literal("below")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.setPlayerSlot(playerName, ParticleData.ParticleSlot.BELOW);
                    context.getSource().sendFeedback(() -> Text.literal("Particle slot set to below"), false);
                    return 1;
                }))
            .then(CommandManager.literal("disable-all")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.disableAllPlayerParticles(playerName);
                    context.getSource().sendFeedback(() -> Text.literal("All particles disabled"), false);
                    return 1;
                }))
            .then(CommandManager.literal("enable-all")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.enableAllPlayerParticles(playerName);
                    context.getSource().sendFeedback(() -> Text.literal("All particles enabled"), false);
                    return 1;
                }))
            .then(CommandManager.literal("on")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.setPlayerEnabled(playerName, true);
                    context.getSource().sendFeedback(() -> Text.literal("Particles turned on"), false);
                    return 1;
                }))
            .then(CommandManager.literal("off")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.setPlayerEnabled(playerName, false);
                    context.getSource().sendFeedback(() -> Text.literal("Particles turned off"), false);
                    return 1;
                }))
            .then(CommandManager.literal("reset")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    particleManager.resetPlayerParticles(playerName);
                    context.getSource().sendFeedback(() -> Text.literal("Player particles reset"), false);
                    return 1;
                }))
            .then(CommandManager.literal("add")
                .then(CommandManager.argument("particle", StringArgumentType.string())
                    .executes(context -> {
                        String particleName = StringArgumentType.getString(context, "particle");
                        ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                        String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                        
                        ParticleData.ParticleType type = ParticleData.ParticleType.fromName(particleName);
                        if (type != null) {
                            particleManager.addParticleToPlayer(playerName, particleName, type);
                            context.getSource().sendFeedback(() -> Text.literal("Added particle: " + particleName), false);
                        } else {
                            context.getSource().sendFeedback(() -> Text.literal("Unknown particle type: " + particleName), false);
                        }
                        return 1;
                    })))
            .then(CommandManager.literal("remove")
                .then(CommandManager.argument("particle", StringArgumentType.string())
                    .executes(context -> {
                        String particleName = StringArgumentType.getString(context, "particle");
                        ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                        String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                        
                        particleManager.removeParticleFromPlayer(playerName, particleName);
                        context.getSource().sendFeedback(() -> Text.literal("Removed particle: " + particleName), false);
                        return 1;
                    })))
            .then(CommandManager.literal("list")
                .executes(context -> {
                    ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                    String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                    ParticleData data = particleManager.getPlayerData(playerName);
                    
                    StringBuilder message = new StringBuilder("Your active particles: ");
                    if (data.getActiveParticles().isEmpty()) {
                        message.append("None");
                    } else {
                        message.append(String.join(", ", data.getActiveParticles()));
                    }
                    
                    context.getSource().sendFeedback(() -> Text.literal(message.toString()), false);
                    return 1;
                }))
            .then(CommandManager.literal("available")
                .executes(context -> {
                    StringBuilder message = new StringBuilder("Available particle types: ");
                    ParticleData.ParticleType[] types = ParticleData.ParticleType.values();
                    for (int i = 0; i < types.length; i++) {
                        message.append(types[i].getName());
                        if (i < types.length - 1) {
                            message.append(", ");
                        }
                    }
                    
                    context.getSource().sendFeedback(() -> Text.literal(message.toString()), false);
                    return 1;
                }))
            .then(CommandManager.literal("preset")
                .then(CommandManager.literal("magical")
                    .executes(context -> {
                        ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                        String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                        
                        // Clear existing particles and add magical preset
                        particleManager.resetPlayerParticles(playerName);
                        particleManager.addParticleToPlayer(playerName, "enchant", ParticleData.ParticleType.ENCHANT);
                        particleManager.addParticleToPlayer(playerName, "soul", ParticleData.ParticleType.SOUL);
                        particleManager.addParticleToPlayer(playerName, "portal", ParticleData.ParticleType.PORTAL);
                        particleManager.addParticleToPlayer(playerName, "electric_spark", ParticleData.ParticleType.ELECTRIC_SPARK);
                        
                        context.getSource().sendFeedback(() -> Text.literal("Applied magical particle preset"), false);
                        return 1;
                    }))
                .then(CommandManager.literal("fire")
                    .executes(context -> {
                        ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                        String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                        
                        // Clear existing particles and add fire preset
                        particleManager.resetPlayerParticles(playerName);
                        particleManager.addParticleToPlayer(playerName, "flame", ParticleData.ParticleType.FLAME);
                        particleManager.addParticleToPlayer(playerName, "soul_fire_flame", ParticleData.ParticleType.SOUL_FIRE_FLAME);
                        particleManager.addParticleToPlayer(playerName, "lava", ParticleData.ParticleType.LAVA);
                        particleManager.addParticleToPlayer(playerName, "smoke", ParticleData.ParticleType.SMOKE);
                        
                        context.getSource().sendFeedback(() -> Text.literal("Applied fire particle preset"), false);
                        return 1;
                    }))
                .then(CommandManager.literal("nature")
                    .executes(context -> {
                        ParticleManager particleManager = ParticleManager.getServerState(context.getSource().getServer());
                        String playerName = context.getSource().getPlayerOrThrow().getName().getString();
                        
                        // Clear existing particles and add nature preset
                        particleManager.resetPlayerParticles(playerName);
                        particleManager.addParticleToPlayer(playerName, "happy_villager", ParticleData.ParticleType.HAPPY_VILLAGER);
                        particleManager.addParticleToPlayer(playerName, "cherry_leaves", ParticleData.ParticleType.CHERRY_LEAVES);
                        particleManager.addParticleToPlayer(playerName, "falling_spore_blossom", ParticleData.ParticleType.FALLING_SPORE_BLOSSOM);
                        particleManager.addParticleToPlayer(playerName, "honey", ParticleData.ParticleType.HONEY);
                        
                        context.getSource().sendFeedback(() -> Text.literal("Applied nature particle preset"), false);
                        return 1;
                    })));
        
        // Legacy playerparticles command aliases
        dispatcher.register(CommandManager.literal("playerparticles")
            .redirect(dispatcher.getRoot().getChild("magic-particles")));
    }
}
