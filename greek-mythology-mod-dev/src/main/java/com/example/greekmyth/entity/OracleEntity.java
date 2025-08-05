package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.quest.OracleQuest;
import com.example.greekmyth.quest.QuestReward;
import com.example.greekmyth.quest.GodQuest;
import com.example.greekmyth.quest.QuestScoreboardManager;
import com.example.greekmyth.favor.FavorManager;
import com.example.greekmyth.favor.God;
import com.example.greekmyth.entity.OracleRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
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
    private static final int PROPHECY_COOLDOWN_TICKS = 600; // 30 seconds for testing
    
    // Oracle behavior states
    private int behaviorTicks = 0;
    private OracleState currentState = OracleState.MEDITATING;
    private int stateDuration = 0;
    private BlockPos meditationSpot = null;
    
    // Sacred ground effects
    private static final int SACRED_GROUND_RADIUS = 8;
    private static final int SACRED_GROUND_CHECK_INTERVAL = 100; // Check every 5 seconds
    
    // Quest system
    private final Map<net.minecraft.entity.player.PlayerEntity, GodQuest> activeQuests = new HashMap<>();
    private static final int QUEST_COOLDOWN_TICKS = 12000; // 10 minutes between quests
    
    // Oracle specialization
    protected God specializedGod = null; // null means general Oracle, specific God means specialized
    
    public God getSpecializedGod() {
        return specializedGod;
    }
    
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
        return true;
    }
    
    // Prevent Oracle from attacking players
    @Override
    public boolean canTarget(LivingEntity target) {
        return false; // Oracle cannot target any entity
    }
    
    public boolean canAttack(LivingEntity target) {
        return false; // Oracle cannot attack any entity
    }
    
    public boolean isHostile() {
        return false; // Oracle is not hostile
    }
    
    public void setTarget(LivingEntity target) {
        // Do nothing - Oracle should never have a target
    }
    
    public boolean tryAttack(Entity target) {
        return false; // Oracle should never attack
    }
    
    public boolean damage(DamageSource source, float amount) {
        // Oracle is invulnerable to all damage
        return false;
    }
    
    public boolean isPushable() {
        return false; // Oracle cannot be pushed around
    }
    
    public boolean isFireImmune() {
        return true; // Oracle is immune to fire
    }
    
    public boolean isImmuneToExplosion() {
        return true; // Oracle is immune to explosions
    }
    
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (this.getWorld().isClient) {
            return ActionResult.SUCCESS;
        }
        
        if (player instanceof ServerPlayerEntity serverPlayer) {
            // Check if player is holding an Oracle tag item
            if (hand == Hand.MAIN_HAND) {
                net.minecraft.item.ItemStack heldItem = player.getMainHandStack();
                if (!heldItem.isEmpty()) {
                    String itemId = heldItem.getItem().toString().toLowerCase();
                    
                    // Check if it's an Oracle tag item and transform the Oracle
                    God targetGod = null;
                    String godName = "";
                    String color = "";
                    
                    if (itemId.contains("zeus_oracle_tag")) {
                        targetGod = God.ZEUS;
                        godName = "Zeus";
                        color = "§e";
                    } else if (itemId.contains("poseidon_oracle_tag")) {
                        targetGod = God.POSEIDON;
                        godName = "Poseidon";
                        color = "§b";
                    } else if (itemId.contains("hades_oracle_tag")) {
                        targetGod = God.HADES;
                        godName = "Hades";
                        color = "§5";
                    } else if (itemId.contains("ares_oracle_tag")) {
                        targetGod = God.ARES;
                        godName = "Ares";
                        color = "§c";
                    } else if (itemId.contains("athena_oracle_tag")) {
                        targetGod = God.ATHENA;
                        godName = "Athena";
                        color = "§7";
                    } else if (itemId.contains("hephaestus_oracle_tag")) {
                        targetGod = God.HEPHAESTUS;
                        godName = "Hephaestus";
                        color = "§6";
                    } else if (itemId.contains("apollo_oracle_tag")) {
                        targetGod = God.APOLLO;
                        godName = "Apollo";
                        color = "§e";
                    } else if (itemId.contains("artemis_oracle_tag")) {
                        targetGod = God.ARTEMIS;
                        godName = "Artemis";
                        color = "§a";
                    } else if (itemId.contains("hermes_oracle_tag")) {
                        targetGod = God.HERMES;
                        godName = "Hermes";
                        color = "§b";
                    } else if (itemId.contains("dionysus_oracle_tag")) {
                        targetGod = God.DIONYSUS;
                        godName = "Dionysus";
                        color = "§d";
                    } else if (itemId.contains("aphrodite_oracle_tag")) {
                        targetGod = God.APHRODITE;
                        godName = "Aphrodite";
                        color = "§d";
                    } else if (itemId.contains("demeter_oracle_tag")) {
                        targetGod = God.DEMETER;
                        godName = "Demeter";
                        color = "§6";
                    }
                    
                    if (targetGod != null) {
                        // Consume the item
                        heldItem.decrement(1);
                        
                        // Register this location as a specialized Oracle
                        OracleRegistry.registerSpecializedOracle(this.getX(), this.getY(), this.getZ(), targetGod);
                        
                        // Create a specialized Oracle entity to replace this one
                        SpecializedOracleEntity specializedOracle = new SpecializedOracleEntity(
                            (EntityType<? extends IllusionerEntity>) this.getType(), 
                            this.getWorld(), 
                            targetGod
                        );
                        
                        // Copy position and other properties
                        specializedOracle.setPosition(this.getX(), this.getY(), this.getZ());
                        specializedOracle.setYaw(this.getYaw());
                        specializedOracle.setPitch(this.getPitch());
                        specializedOracle.setVelocity(this.getVelocity());
                        
                        // Remove the current Oracle
                        this.remove(Entity.RemovalReason.KILLED);
                        
                        // Spawn the specialized Oracle
                        this.getWorld().spawnEntity(specializedOracle);
                        
                        // Send confirmation message
                        serverPlayer.sendMessage(Text.literal(color + "§l[The Oracle] §r§aThis Oracle now serves " + godName + "!").formatted(Formatting.GREEN), false);
                        serverPlayer.sendMessage(Text.literal("§7The Oracle has been permanently transformed.").formatted(Formatting.GRAY), false);
                        
                        GreekMythologyMod.LOGGER.info("Oracle transformation: {} Oracle created at ({}, {}, {})", 
                            godName, this.getX(), this.getY(), this.getZ());
                        
                        return ActionResult.SUCCESS;
                    }
                }
            }
            // Check if player has an active quest
            GodQuest activeQuest = activeQuests.get(player);
            
            // Check if player is holding an item for quest turn-in
            if (activeQuest != null && !activeQuest.isCompleted() && hand == Hand.MAIN_HAND) {
                net.minecraft.item.ItemStack heldItem = player.getMainHandStack();
                if (!heldItem.isEmpty()) {
                    String itemId = heldItem.getItem().toString().toLowerCase();
                    if (itemId.contains("minecraft:")) {
                        itemId = itemId.replace("minecraft:", "");
                    }
                    
                    // Check if this item is required for the quest (collection quests)
                    String[] requiredItems = activeQuest.getRequiredItems();
                    if (requiredItems != null && requiredItems.length > 0) {
                        for (String requiredItem : requiredItems) {
                            if (itemId.contains(requiredItem) || requiredItem.contains(itemId)) {
                                // Check if this specific item has already been turned in
                                if (activeQuest.hasItemBeenTurnedIn(requiredItem)) {
                                    serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§cYou have already offered this item to " + activeQuest.getTargetGod().getDisplayName()).formatted(Formatting.RED), false);
                                    serverPlayer.sendMessage(Text.literal("§7You need to collect different items from the required list.").formatted(Formatting.GRAY), false);
                                    return ActionResult.SUCCESS;
                                }
                                
                                // Valid item for collection quest turn-in
                                handleQuestItemTurnIn(serverPlayer, activeQuest, heldItem, requiredItem);
                                return ActionResult.SUCCESS;
                            }
                        }
                        
                        // If we get here, the item is not in the required list
                        serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§cThis item is not required for your current quest.").formatted(Formatting.RED), false);
                        serverPlayer.sendMessage(Text.literal("§7Required items: " + activeQuest.getRequiredItemsText()).formatted(Formatting.GRAY), false);
                        return ActionResult.SUCCESS;
                    }
                    
                    // Check if this item is valid for crafting quests
                    if (activeQuest.getType() == GodQuest.QuestType.CRAFT_ITEMS) {
                        // For crafting quests, accept any item as a "crafted item" turn-in
                        handleCraftingQuestTurnIn(serverPlayer, activeQuest, heldItem);
                        return ActionResult.SUCCESS;
                    }
                }
                
                // Show quest progress with scoreboard info
                int currentProgress = activeQuest.getCurrentProgress();
                serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§eYour current quest: " + activeQuest.getTitle()).formatted(Formatting.GOLD), false);
                serverPlayer.sendMessage(Text.literal("§7Progress: " + currentProgress + "/" + activeQuest.getTargetAmount()).formatted(Formatting.GRAY), false);
                serverPlayer.sendMessage(Text.literal("§7" + activeQuest.getDescription()).formatted(Formatting.GRAY), false);
                serverPlayer.sendMessage(Text.literal("§bReward: " + activeQuest.getFavorReward() + " favor with " + activeQuest.getTargetGod().getDisplayName() + " + " + activeQuest.getXpReward() + " XP").formatted(Formatting.AQUA), false);
                
                // Show quest progress
                serverPlayer.sendMessage(Text.literal("§aQuest Progress: " + currentProgress + "/" + activeQuest.getTargetAmount()).formatted(Formatting.GREEN), false);
            } else if (prophecyCooldown <= 0) {
                // Give a new prophecy
                giveProphecy(serverPlayer);
                prophecyCooldown = PROPHECY_COOLDOWN_TICKS;
                
                // Offer quest selection if player doesn't have one
                if (!activeQuests.containsKey(player)) {
                    offerQuestSelection(serverPlayer);
                }
            } else {
                // Still offer quests even if prophecy is on cooldown
                if (!activeQuests.containsKey(player)) {
                    serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§eI can offer you a quest...").formatted(Formatting.GOLD), false);
                    offerQuestSelection(serverPlayer);
                }
            }
            
            // Play interaction sound
            this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
                net.minecraft.sound.SoundEvents.ENTITY_VILLAGER_YES, 
                net.minecraft.sound.SoundCategory.NEUTRAL, 1.0f, 1.0f);
        }
        
        return ActionResult.SUCCESS;
    }
    
    private void handleQuestItemTurnIn(ServerPlayerEntity player, GodQuest quest, net.minecraft.item.ItemStack item, String requiredItem) {
        // Remove one item from the player's hand
        item.decrement(1);
        
        // Mark this specific item as turned in
        quest.markItemAsTurnedIn(requiredItem);
        
        // Update quest progress
        quest.updateProgress(1);
        
        // Send success message
        player.sendMessage(Text.literal("§6§l[The Oracle] §r§aYou have offered " + item.getItem().getName().getString() + " to " + quest.getTargetGod().getDisplayName()).formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Quest Progress: " + quest.getCurrentProgress() + "/" + quest.getTargetAmount()).formatted(Formatting.GRAY), false);
        
        // Update scoreboard
        QuestScoreboardManager.updateQuestProgress(player, quest.getCurrentProgress(), quest.getTargetAmount());
        
        // Check if quest is completed
        if (quest.isCompleted()) {
            // Give rewards
            FavorManager.addFavor(player.getUuid(), quest.getTargetGod(), quest.getFavorReward());
            player.addExperience(quest.getXpReward());
            
            // Send completion message
            player.sendMessage(quest.getCompletionText(), false);
            
            // Remove quest
            activeQuests.remove(player);
            
            // Remove quest scoreboard
            QuestScoreboardManager.removeQuestScoreboard(player);
            
            GreekMythologyMod.LOGGER.info("Player {} completed {} quest: {}", 
                player.getName().getString(), quest.getTargetGod().getDisplayName(), quest.getTitle());
        }
        
        // Play success sound
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
            net.minecraft.sound.SoundEvents.ENTITY_PLAYER_LEVELUP, 
            net.minecraft.sound.SoundCategory.PLAYERS, 1.0f, 1.2f);
    }
    
    private void handleCraftingQuestTurnIn(ServerPlayerEntity player, GodQuest quest, net.minecraft.item.ItemStack item) {
        // Remove one item from the player's hand
        item.decrement(1);
        
        // Update quest progress
        quest.updateProgress(1);
        
        // Send success message
        player.sendMessage(Text.literal("§6§l[The Oracle] §r§aYou have offered your crafted " + item.getItem().getName().getString() + " to " + quest.getTargetGod().getDisplayName()).formatted(Formatting.GREEN), false);
        player.sendMessage(Text.literal("§7Quest Progress: " + quest.getCurrentProgress() + "/" + quest.getTargetAmount()).formatted(Formatting.GRAY), false);
        
        // Update scoreboard
        QuestScoreboardManager.updateQuestProgress(player, quest.getCurrentProgress(), quest.getTargetAmount());
        
        // Check if quest is completed
        if (quest.isCompleted()) {
            // Give rewards
            FavorManager.addFavor(player.getUuid(), quest.getTargetGod(), quest.getFavorReward());
            player.addExperience(quest.getXpReward());
            
            // Send completion message
            player.sendMessage(quest.getCompletionText(), false);
            
            // Remove quest
            activeQuests.remove(player);
            
            // Remove quest scoreboard
            QuestScoreboardManager.removeQuestScoreboard(player);
            
            GreekMythologyMod.LOGGER.info("Player {} completed {} quest: {}", 
                player.getName().getString(), quest.getTargetGod().getDisplayName(), quest.getTitle());
        }
        
        // Play success sound
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
            net.minecraft.sound.SoundEvents.ENTITY_PLAYER_LEVELUP, 
            net.minecraft.sound.SoundCategory.PLAYERS, 1.0f, 1.2f);
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
                    // Give quest for a random god
                    God[] gods = God.values();
                    God randomGod = gods[this.getWorld().getRandom().nextInt(gods.length)];
                    giveGodQuest(serverPlayer, randomGod);
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
    
    private void giveGodQuest(ServerPlayerEntity player, God selectedGod) {
        // Create a god-specific quest for the selected god
        GodQuest quest = GodQuest.createGodQuest(selectedGod, this.getWorld().getRandom());
        activeQuests.put(player, quest);
        
        // Initialize quest tracking with scoreboard
        QuestScoreboardManager.createQuestScoreboard(player, quest);
        
        // Send quest to player with god-specific message
        player.sendMessage(Text.literal("§6§l[The Oracle] §r§e" + selectedGod.getDisplayName() + " calls to you...").formatted(Formatting.GOLD), false);
        player.sendMessage(quest.getQuestText(), false);
        
        // Play quest sound
        this.getWorld().playSound(null, this.getX(), this.getY(), this.getZ(), 
            net.minecraft.sound.SoundEvents.ENTITY_VILLAGER_YES, 
            net.minecraft.sound.SoundCategory.NEUTRAL, 1.0f, 1.2f);
        
        GreekMythologyMod.LOGGER.info("Oracle gave {} quest to player {}: {}", selectedGod.getDisplayName(), player.getName().getString(), quest.getTitle());
    }
    
    private void offerQuestSelection(ServerPlayerEntity player) {
        if (specializedGod != null) {
            // This Oracle is specialized for a specific god
            player.sendMessage(Text.literal("§6§l[The Oracle] §r§eThis Oracle serves " + specializedGod.getDisplayName() + ".").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§7I can offer you quests from " + specializedGod.getDisplayName() + ".").formatted(Formatting.GRAY), false);
            giveGodQuest(player, specializedGod);
        } else {
            // General Oracle - show all options
            player.sendMessage(Text.literal("§6§l[The Oracle] §r§eChoose your path...").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§7Available gods for quests:").formatted(Formatting.GRAY), false);
            player.sendMessage(Text.literal("§e• Zeus - Lightning and Thunder").formatted(Formatting.YELLOW), false);
            player.sendMessage(Text.literal("§b• Poseidon - Oceans and Storms").formatted(Formatting.AQUA), false);
            player.sendMessage(Text.literal("§5• Hades - Underworld and Death").formatted(Formatting.LIGHT_PURPLE), false);
            player.sendMessage(Text.literal("§c• Ares - War and Battle").formatted(Formatting.RED), false);
            player.sendMessage(Text.literal("§7• Athena - Wisdom and Strategy").formatted(Formatting.GRAY), false);
            player.sendMessage(Text.literal("§6• Hephaestus - Fire and Forge").formatted(Formatting.GOLD), false);
            player.sendMessage(Text.literal("§e• Apollo - Sun and Light").formatted(Formatting.YELLOW), false);
            player.sendMessage(Text.literal("§a• Artemis - Nature and Hunt").formatted(Formatting.GREEN), false);
            player.sendMessage(Text.literal("§b• Hermes - Speed and Messenger").formatted(Formatting.AQUA), false);
            player.sendMessage(Text.literal("§d• Dionysus - Wine and Festival").formatted(Formatting.LIGHT_PURPLE), false);
            player.sendMessage(Text.literal("§d• Aphrodite - Love and Beauty").formatted(Formatting.LIGHT_PURPLE), false);
            player.sendMessage(Text.literal("§6• Demeter - Agriculture").formatted(Formatting.GOLD), false);

            player.sendMessage(Text.literal("§7Use /quest select <god> to choose a specific quest.").formatted(Formatting.GRAY), false);
        }
    }
    
    // Old quest creation method removed - now using GodQuest.createGodQuest()
    
    // Public method to update quest progress (called from event handlers)
    public void updateQuestProgress(PlayerEntity player, GodQuest.QuestType type, int progress) {
        GodQuest quest = activeQuests.get(player);
        if (quest != null && quest.getType() == type && !quest.isCompleted()) {
            quest.updateProgress(progress);
            
            // Update scoreboard progress
            if (player instanceof ServerPlayerEntity serverPlayer) {
                QuestScoreboardManager.updateQuestProgress(serverPlayer, 
                    quest.getCurrentProgress(), quest.getTargetAmount());
            }
            
            if (quest.isCompleted()) {
                // Give favor reward
                FavorManager.addFavor(player.getUuid(), quest.getTargetGod(), quest.getFavorReward());
                
                // Give XP reward
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    serverPlayer.addExperience(quest.getXpReward());
                }
                
                // Remove quest scoreboard
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    QuestScoreboardManager.removeQuestScoreboard(serverPlayer);
                }
                
                // Send completion message
                if (player instanceof ServerPlayerEntity serverPlayer) {
                    serverPlayer.sendMessage(quest.getCompletionText(), false);
                }
                
                // Remove quest
                activeQuests.remove(player);
                
                GreekMythologyMod.LOGGER.info("Player {} completed {} quest: {}", 
                    player.getName().getString(), quest.getTargetGod().getDisplayName(), quest.getTitle());
            }
        }
    }
    
    /**
     * Clear the active quest for a player
     */
    public void clearQuest(PlayerEntity player) {
        if (activeQuests.containsKey(player)) {
            GodQuest quest = activeQuests.get(player);
            activeQuests.remove(player);
            
            // Remove quest scoreboard
            if (player instanceof ServerPlayerEntity serverPlayer) {
                QuestScoreboardManager.removeQuestScoreboard(serverPlayer);
            }
            
            // Send clear message
            if (player instanceof ServerPlayerEntity serverPlayer) {
                serverPlayer.sendMessage(Text.literal("§6§l[The Oracle] §r§eYour quest has been cleared.").formatted(Formatting.GOLD), false);
                serverPlayer.sendMessage(Text.literal("§7You can now request a new quest.").formatted(Formatting.GRAY), false);
            }
            
            GreekMythologyMod.LOGGER.info("Player {} cleared their quest: {}", 
                player.getName().getString(), quest.getTitle());
        }
    }
    
    /**
     * Show available quest options to a player
     */
    public void showQuestSelection(ServerPlayerEntity player) {
        player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§6§l           QUEST SELECTION").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§7Available Gods:").formatted(Formatting.GRAY), false);
        
        God[] gods = God.values();
        for (int i = 0; i < gods.length; i++) {
            God god = gods[i];
            player.sendMessage(Text.literal("§e" + (i + 1) + ". §f" + god.getDisplayName()).formatted(Formatting.YELLOW), false);
        }
        
        player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
        player.sendMessage(Text.literal("§7Use: §e/quest select <god_name>").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§7Example: §e/quest select zeus").formatted(Formatting.GRAY), false);
        player.sendMessage(Text.literal("§6§l═══════════════════════════════════════").formatted(Formatting.GOLD), false);
    }
    
    /**
     * Give a specific god's quest to a player
     */
    public void giveSpecificGodQuest(ServerPlayerEntity player, String godName) {
        // Clear any existing quest first
        if (activeQuests.containsKey(player)) {
            clearQuest(player);
        }
        
        // Find the god by name (case insensitive)
        God selectedGod = null;
        for (God god : God.values()) {
            if (god.name().toLowerCase().equals(godName.toLowerCase()) || 
                god.getDisplayName().toLowerCase().equals(godName.toLowerCase())) {
                selectedGod = god;
                break;
            }
        }
        
        if (selectedGod == null) {
            player.sendMessage(Text.literal("§c❌ Unknown god: " + godName).formatted(Formatting.RED), false);
            player.sendMessage(Text.literal("§7Use §e/quest select §7to see available gods").formatted(Formatting.GRAY), false);
            return;
        }
        
        // Give the quest
        giveGodQuest(player, selectedGod);
        
        player.sendMessage(Text.literal("§a✅ Selected " + selectedGod.getDisplayName() + " quest!").formatted(Formatting.GREEN), false);
        
        GreekMythologyMod.LOGGER.info("Testing: Gave {} quest to player {}", selectedGod.getDisplayName(), player.getName().getString());
    }
    
    /**
     * Give a random quest to a player (for testing)
     */
    public void giveRandomQuest(ServerPlayerEntity player) {
        // Clear any existing quest first
        if (activeQuests.containsKey(player)) {
            clearQuest(player);
        }
        
        // Select a random god
        God[] gods = God.values();
        God randomGod = gods[this.getWorld().getRandom().nextInt(gods.length)];
        
        // Give the quest
        giveGodQuest(player, randomGod);
        
        GreekMythologyMod.LOGGER.info("Testing: Gave random {} quest to player {}", randomGod.getDisplayName(), player.getName().getString());
    }
    
    /**
     * Get the Oracle entity from the world (for command access)
     */
    public static OracleEntity getOracleEntity(ServerWorld world) {
        // Find Oracle entity by iterating through all loaded entities
        for (net.minecraft.entity.Entity entity : world.iterateEntities()) {
            if (entity instanceof OracleEntity oracle) {
                return oracle;
            }
        }
        return null;
    }
    
    /**
     * Get the nearest Oracle entity to a player
     */
    public static OracleEntity getNearestOracleEntity(ServerWorld world, net.minecraft.entity.player.PlayerEntity player) {
        OracleEntity nearestOracle = null;
        double nearestDistance = Double.MAX_VALUE;
        
        // Find the nearest Oracle entity by iterating through all loaded entities
        for (net.minecraft.entity.Entity entity : world.iterateEntities()) {
            if (entity instanceof OracleEntity oracle) {
                double distance = player.squaredDistanceTo(oracle);
                if (distance < nearestDistance) {
                    nearestDistance = distance;
                    nearestOracle = oracle;
                }
            }
        }
        
        return nearestOracle;
    }
} 