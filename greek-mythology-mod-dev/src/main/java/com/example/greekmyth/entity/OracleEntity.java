package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.quest.OracleQuest;
import com.example.greekmyth.quest.QuestReward;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import java.util.HashMap;
import java.util.Map;

public class OracleEntity extends IllusionerEntity {
    
    private static final String[] ORACLE_PROPHECIES = {
        "The winds of fate blow strong tonight...",
        "I see shadows dancing in the depths...",
        "The ancient ones whisper secrets...",
        "A great power awakens in the east...",
        "The stars foretell of change...",
        "Beware the crimson tide...",
        "The underworld calls to the chosen...",
        "Zeus's thunder echoes in the distance...",
        "Poseidon's waves crash against destiny...",
        "Hades' realm grows stronger...",
        "The gods watch with ancient eyes...",
        "A hero's path lies before you...",
        "The fabric of reality shifts...",
        "Time flows like a river...",
        "The oracle speaks, but do you listen?"
    };
    
    private int prophecyCooldown = 0;
    private static final int PROPHECY_COOLDOWN_TICKS = 6000; // 5 minutes
    
    // Oracle behavior states
    private int behaviorTicks = 0;
    private OracleState currentState = OracleState.MEDITATING;
    private int stateDuration = 0;
    private BlockPos meditationSpot = null;
    
    // Sacred ground effects
    private static final int SACRED_GROUND_RADIUS = 8;
    private static final int SACRED_GROUND_CHECK_INTERVAL = 100; // Check every 5 seconds
    
    // Quest system
    private final Map<net.minecraft.entity.player.PlayerEntity, OracleQuest> activeQuests = new HashMap<>();
    private static final int QUEST_COOLDOWN_TICKS = 12000; // 10 minutes between quests
    
    public OracleEntity(EntityType<? extends IllusionerEntity> entityType, World world) {
        super(entityType, world);
        this.setCustomName(Text.literal("The Oracle").formatted(Formatting.GOLD, Formatting.BOLD));
        this.setCustomNameVisible(true);
        this.setPersistent();
        this.setInvulnerable(true);
        GreekMythologyMod.LOGGER.info("Oracle Entity created - Illusioner transformed into Oracle");
    }
    
    // Oracle Altar AI temporarily disabled due to block registration issues
    
    // Damage handling is now done through OracleDamageHandler event
    
    @Override
    public void tick() {
        super.tick();
        
        // Handle prophecy cooldown
        if (prophecyCooldown > 0) {
            prophecyCooldown--;
        }
        
        // Handle behavior state
        behaviorTicks++;
        if (stateDuration > 0) {
            stateDuration--;
        } else {
            changeState();
        }
        
        // Perform current state behavior
        performStateBehavior();
        
        // Sacred ground effects
        if (behaviorTicks % SACRED_GROUND_CHECK_INTERVAL == 0) {
            applySacredGroundEffects();
        }
        
        // Give prophecies to nearby players
        if (prophecyCooldown <= 0 && !this.getWorld().isClient) {
            for (PlayerEntity player : this.getWorld().getPlayers()) {
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    double distance = this.getPos().distanceTo(player.getPos());
                    if (distance <= 8.0) { // Within 8 blocks
                        giveProphecy(serverPlayer);
                        prophecyCooldown = PROPHECY_COOLDOWN_TICKS;
                        break; // Only give one prophecy at a time
                    }
                }
            }
        }
        
        // Ambient effects
        createAmbientEffects();
    }
    
    private void giveProphecy(ServerPlayerEntity player) {
        Random random = this.getWorld().getRandom();
        String prophecy = ORACLE_PROPHECIES[random.nextInt(ORACLE_PROPHECIES.length)];
        
        // Send the prophecy with special formatting
        player.sendMessage(Text.literal("").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§6§l[The Oracle] §r§e" + prophecy).formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("").formatted(Formatting.GOLD), false);
        
        // Play a mystical sound
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
            net.minecraft.sound.SoundEvents.ENTITY_ILLUSIONER_CAST_SPELL, 
            net.minecraft.sound.SoundCategory.AMBIENT, 1.0f, 0.8f);
        
        GreekMythologyMod.LOGGER.info("Oracle gave prophecy to player {}: {}", player.getName().getString(), prophecy);
    }
    
    @Override
    public boolean isPersistent() {
        return true; // Oracle never despawns
    }
    
    @Override
    public boolean cannotDespawn() {
        return true; // Oracle cannot despawn
    }
    
    @Override
    public boolean isInvulnerable() {
        return true; // Oracle is invulnerable
    }
    
    // Oracle is invulnerable to all damage sources
    
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (this.getWorld().isClient) {
            return ActionResult.SUCCESS;
        }
        
        if (player instanceof ServerPlayerEntity serverPlayer) {
            // Check if player has an active quest
            OracleQuest activeQuest = activeQuests.get(player);
            
            if (activeQuest != null && !activeQuest.isCompleted()) {
                // Show quest progress
                serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§eYour current quest: " + activeQuest.getTitle()).formatted(Formatting.GOLD), false);
                serverPlayer.sendMessage(Text.literal("§7Progress: " + activeQuest.getCurrentProgress() + "/" + activeQuest.getTargetAmount()).formatted(Formatting.GRAY), false);
                serverPlayer.sendMessage(Text.literal("§7" + activeQuest.getDescription()).formatted(Formatting.GRAY), false);
            } else if (prophecyCooldown <= 0) {
                // Give a new prophecy
                giveProphecy(serverPlayer);
                prophecyCooldown = PROPHECY_COOLDOWN_TICKS;
                
                // Also give a quest if player doesn't have one
                if (!activeQuests.containsKey(player)) {
                    giveQuest(serverPlayer);
                }
            } else {
                // Show cooldown message
                int remainingSeconds = prophecyCooldown / 20;
                serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§eThe divine forces are still gathering...").formatted(Formatting.GOLD), false);
                serverPlayer.sendMessage(Text.literal("§7Return in " + remainingSeconds + " seconds for another prophecy.").formatted(Formatting.GRAY), false);
            }
            
            // Play interaction sound
            this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
                net.minecraft.sound.SoundEvents.ENTITY_VILLAGER_YES, 
                net.minecraft.sound.SoundCategory.NEUTRAL, 1.0f, 1.0f);
        }
        
        return ActionResult.SUCCESS;
    }
    
    private void changeState() {
        Random random = this.getWorld().getRandom();
        OracleState[] states = OracleState.values();
        currentState = states[random.nextInt(states.length)];
        
        // Set state duration based on state type
        switch (currentState) {
            case MEDITATING:
                stateDuration = 1200 + random.nextInt(600); // 60-90 seconds
                meditationSpot = this.getBlockPos();
                break;
            case GATHERING:
                stateDuration = 800 + random.nextInt(400); // 40-60 seconds
                break;
            case GIVING_QUEST:
                stateDuration = 400 + random.nextInt(200); // 20-30 seconds
                break;
            case DIVINING:
                stateDuration = 600 + random.nextInt(300); // 30-45 seconds
                break;
            case WANDERING:
                stateDuration = 1000 + random.nextInt(500); // 50-75 seconds
                break;
        }
        
        GreekMythologyMod.LOGGER.info("Oracle changed state to: {}", currentState);
    }
    
    private void performStateBehavior() {
        switch (currentState) {
            case MEDITATING:
                performMeditation();
                break;
            case GATHERING:
                performGathering();
                break;
            case GIVING_QUEST:
                performQuestGiving();
                break;
            case DIVINING:
                performDivination();
                break;
            case WANDERING:
                performWandering();
                break;
        }
    }
    
    private void performMeditation() {
        // Stay still and create meditation effects
        if (meditationSpot != null) {
            this.getNavigation().startMovingTo(meditationSpot.getX() + 0.5, meditationSpot.getY(), meditationSpot.getZ() + 0.5, 0.3);
        }
        
        // Create meditation particles every few ticks
        if (this.getWorld().getTime() % 20 == 0) {
            createMeditationParticles();
        }
    }
    
    private void performGathering() {
        // Look for nearby items to "gather"
        BlockPos pos = this.getBlockPos();
        for (int x = -5; x <= 5; x++) {
            for (int z = -5; z <= 5; z++) {
                BlockPos checkPos = pos.add(x, 0, z);
                if (this.getWorld().getBlockState(checkPos).getBlock() == net.minecraft.block.Blocks.DANDELION) {
                    this.getNavigation().startMovingTo(checkPos.getX() + 0.5, checkPos.getY(), checkPos.getZ() + 0.5, 0.5);
                    return;
                }
            }
        }
        
        // If no flowers found, wander randomly
        BlockPos randomPos = pos.add(this.getWorld().getRandom().nextInt(10) - 5, 0, this.getWorld().getRandom().nextInt(10) - 5);
        this.getNavigation().startMovingTo(randomPos.getX() + 0.5, randomPos.getY(), randomPos.getZ() + 0.5, 0.3);
    }
    
    private void performQuestGiving() {
        // Look for nearby players to give quests to
        for (PlayerEntity player : this.getWorld().getPlayers()) {
            if (player instanceof ServerPlayerEntity serverPlayer) {
                double distance = this.getPos().distanceTo(player.getPos());
                if (distance <= 6.0 && !activeQuests.containsKey(player)) {
                    giveQuest(serverPlayer);
                    return;
                }
            }
        }
    }
    
    private void performDivination() {
        // Create divination effects and look mystical
        if (this.getWorld().getTime() % 10 == 0) {
            createDivinationParticles();
        }
        
        // Look around slowly
        this.getLookControl().lookAt(this.getX() + this.getWorld().getRandom().nextDouble() * 10 - 5, 
                                   this.getY() + 2, 
                                   this.getZ() + this.getWorld().getRandom().nextDouble() * 10 - 5);
    }
    
    private void performWandering() {
        // Move around randomly
        if (this.getNavigation().isIdle()) {
            BlockPos pos = this.getBlockPos();
            BlockPos randomPos = pos.add(this.getWorld().getRandom().nextInt(16) - 8, 0, this.getWorld().getRandom().nextInt(16) - 8);
            this.getNavigation().startMovingTo(randomPos.getX() + 0.5, randomPos.getY(), randomPos.getZ() + 0.5, 0.4);
        }
    }
    
    private void applySacredGroundEffects() {
        BlockPos oraclePos = this.getBlockPos();
        
        // Apply effects to players in sacred ground
        for (PlayerEntity player : this.getWorld().getPlayers()) {
            double distance = this.getPos().distanceTo(player.getPos());
            if (distance <= SACRED_GROUND_RADIUS) {
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    // Give regeneration effect
                    serverPlayer.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                        net.minecraft.entity.effect.StatusEffects.REGENERATION, 200, 0, false, false));
                    
                    // Give night vision effect
                    serverPlayer.addStatusEffect(new net.minecraft.entity.effect.StatusEffectInstance(
                        net.minecraft.entity.effect.StatusEffects.NIGHT_VISION, 200, 0, false, false));
                }
            }
        }
        
        // Create sacred ground particles
        createSacredGroundParticles();
    }
    
    private void createAmbientEffects() {
        // Create ambient particles every few seconds
        if (this.getWorld().getTime() % 40 == 0) {
            createAmbientParticles();
        }
        
        // Play ambient sounds occasionally
        if (this.getWorld().getTime() % 200 == 0) {
            this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
                net.minecraft.sound.SoundEvents.AMBIENT_CAVE, 
                net.minecraft.sound.SoundCategory.AMBIENT, 0.3f, 1.2f);
        }
    }
    
    private void createMeditationParticles() {
        if (this.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
            serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.ENCHANT, 
                this.getX(), this.getY() + 2.0, this.getZ(), 5, 0.5, 0.5, 0.5, 0.1);
        }
    }
    
    private void createDivinationParticles() {
        if (this.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
            serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.PORTAL, 
                this.getX(), this.getY() + 1.5, this.getZ(), 3, 0.3, 0.3, 0.3, 0.05);
        }
    }
    
    private void createSacredGroundParticles() {
        if (this.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
            BlockPos oraclePos = this.getBlockPos();
            for (int i = 0; i < 8; i++) {
                double angle = i * Math.PI / 4;
                double x = oraclePos.getX() + 0.5 + Math.cos(angle) * SACRED_GROUND_RADIUS;
                double z = oraclePos.getZ() + 0.5 + Math.sin(angle) * SACRED_GROUND_RADIUS;
                serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.END_ROD, 
                    x, oraclePos.getY() + 0.5, z, 1, 0, 0, 0, 0);
            }
        }
    }
    
    private void createAmbientParticles() {
        if (this.getWorld() instanceof net.minecraft.server.world.ServerWorld serverWorld) {
            serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.FIREWORK, 
                this.getX() + this.getWorld().getRandom().nextDouble() * 2 - 1, 
                this.getY() + 1.0, 
                this.getZ() + this.getWorld().getRandom().nextDouble() * 2 - 1, 
                1, 0, 0, 0, 0);
        }
    }
    
    private void giveQuest(ServerPlayerEntity player) {
        // Create a random quest
        OracleQuest quest = createRandomQuest();
        activeQuests.put(player, quest);
        
        // Send quest to player
        player.sendMessage(quest.getQuestText(), false);
        
        // Play quest sound
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
            net.minecraft.sound.SoundEvents.ENTITY_VILLAGER_YES, 
            net.minecraft.sound.SoundCategory.NEUTRAL, 1.0f, 1.2f);
        
        GreekMythologyMod.LOGGER.info("Oracle gave quest to player {}: {}", player.getName().getString(), quest.getTitle());
    }
    
    private OracleQuest createRandomQuest() {
        Random random = this.getWorld().getRandom();
        OracleQuest.QuestType[] types = OracleQuest.QuestType.values();
        OracleQuest.QuestType type = types[random.nextInt(types.length)];
        
        switch (type) {
            case KILL_MOBS:
                return new OracleQuest("kill_zombies", "Slay the Undead", 
                    "Defeat 10 zombies to prove your worth", type, 10, 
                    new QuestReward(QuestReward.RewardType.EXPERIENCE, "Gain 50 experience points", 50));
            case COLLECT_ITEMS:
                return new OracleQuest("collect_emeralds", "Gather Wealth", 
                    "Collect 5 emeralds for the Oracle", type, 5, 
                    new QuestReward(QuestReward.RewardType.GOLDEN_APPLE, "Receive a golden apple", 1));
            case EXPLORE_AREA:
                return new OracleQuest("explore_caves", "Explore the Depths", 
                    "Find and explore 3 cave systems", type, 3, 
                    new QuestReward(QuestReward.RewardType.DIAMOND, "Receive a diamond", 1));
            case CRAFT_ITEMS:
                return new OracleQuest("craft_torch", "Illuminate the Darkness", 
                    "Craft 20 torches to light the way", type, 20, 
                    new QuestReward(QuestReward.RewardType.EMERALD, "Receive 3 emeralds", 3));
            case FIND_STRUCTURES:
                return new OracleQuest("find_village", "Seek Civilization", 
                    "Discover a village for the Oracle", type, 1, 
                    new QuestReward(QuestReward.RewardType.ENCHANTED_GOLDEN_APPLE, "Receive an enchanted golden apple", 1));
            default:
                return new OracleQuest("default_quest", "Oracle's Test", 
                    "Complete a simple task", OracleQuest.QuestType.KILL_MOBS, 5, 
                    new QuestReward(QuestReward.RewardType.EXPERIENCE, "Gain 25 experience points", 25));
        }
    }
    
    // Public method to update quest progress (called from event handlers)
    public void updateQuestProgress(PlayerEntity player, OracleQuest.QuestType type, int progress) {
        OracleQuest quest = activeQuests.get(player);
        if (quest != null && quest.getType() == type && !quest.isCompleted()) {
            quest.updateProgress(progress);
            
            if (quest.isCompleted()) {
                // Give reward
                quest.getReward().giveReward(player);
                
                // Send completion message
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    serverPlayer.sendMessage(quest.getCompletionText(), false);
                }
                
                // Remove quest
                activeQuests.remove(player);
                
                GreekMythologyMod.LOGGER.info("Player {} completed Oracle quest: {}", player.getName().getString(), quest.getTitle());
            }
        }
    }
} 