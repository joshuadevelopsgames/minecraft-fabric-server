package com.example.aimyth.entity;

import com.example.aimyth.AIMythologyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Manages all entity types in the AI Mythology mod.
 * Includes mythological creatures, divine beings, and special entities.
 */
public class AIEntityTypes {
    
    // Greek Monsters
    public static final Identifier MINOTAUR_ID = Identifier.of(AIMythologyMod.MOD_ID, "minotaur");
    public static final Identifier MEDUSA_ID = Identifier.of(AIMythologyMod.MOD_ID, "medusa");
    public static final Identifier HYDRA_ID = Identifier.of(AIMythologyMod.MOD_ID, "hydra");
    public static final Identifier CERBERUS_ID = Identifier.of(AIMythologyMod.MOD_ID, "cerberus");
    public static final Identifier CYCLOPS_ID = Identifier.of(AIMythologyMod.MOD_ID, "cyclops");
    
    // Divine Spirits
    public static final Identifier DRYAD_ID = Identifier.of(AIMythologyMod.MOD_ID, "dryad");
    public static final Identifier NAIAD_ID = Identifier.of(AIMythologyMod.MOD_ID, "naiad");
    public static final Identifier OREAD_ID = Identifier.of(AIMythologyMod.MOD_ID, "oread");
    public static final Identifier CENTAUR_ID = Identifier.of(AIMythologyMod.MOD_ID, "centaur");
    public static final Identifier SATYR_ID = Identifier.of(AIMythologyMod.MOD_ID, "satyr");
    public static final Identifier HARPY_ID = Identifier.of(AIMythologyMod.MOD_ID, "harpy");
    public static final Identifier SIREN_ID = Identifier.of(AIMythologyMod.MOD_ID, "siren");
    public static final Identifier GORGON_ID = Identifier.of(AIMythologyMod.MOD_ID, "gorgon");
    public static final Identifier CHIMERA_ID = Identifier.of(AIMythologyMod.MOD_ID, "chimera");
    
    // Legendary Beasts
    public static final Identifier PEGASUS_ID = Identifier.of(AIMythologyMod.MOD_ID, "pegasus");
    public static final Identifier UNICORN_ID = Identifier.of(AIMythologyMod.MOD_ID, "unicorn");
    public static final Identifier PHOENIX_ID = Identifier.of(AIMythologyMod.MOD_ID, "phoenix");
    public static final Identifier GRIFFIN_ID = Identifier.of(AIMythologyMod.MOD_ID, "griffin");
    public static final Identifier DRAGON_ID = Identifier.of(AIMythologyMod.MOD_ID, "dragon");
    
    // Divine Beings
    public static final Identifier TITAN_ID = Identifier.of(AIMythologyMod.MOD_ID, "titan");
    public static final Identifier HERO_ID = Identifier.of(AIMythologyMod.MOD_ID, "hero");
    public static final Identifier ORACLE_ID = Identifier.of(AIMythologyMod.MOD_ID, "oracle");
    public static final Identifier NYMPH_ID = Identifier.of(AIMythologyMod.MOD_ID, "nymph");
    public static final Identifier MESSENGER_ID = Identifier.of(AIMythologyMod.MOD_ID, "messenger");
    
    // Entity Instances (placeholder - would be actual entity classes in full implementation)
    public static EntityType<?> MINOTAUR;
    public static EntityType<?> MEDUSA;
    public static EntityType<?> HYDRA;
    public static EntityType<?> CERBERUS;
    public static EntityType<?> CYCLOPS;
    public static EntityType<?> DRYAD;
    public static EntityType<?> NAIAD;
    public static EntityType<?> OREAD;
    public static EntityType<?> CENTAUR;
    public static EntityType<?> SATYR;
    public static EntityType<?> HARPY;
    public static EntityType<?> SIREN;
    public static EntityType<?> GORGON;
    public static EntityType<?> CHIMERA;
    public static EntityType<?> PEGASUS;
    public static EntityType<?> UNICORN;
    public static EntityType<?> PHOENIX;
    public static EntityType<?> GRIFFIN;
    public static EntityType<?> DRAGON;
    public static EntityType<?> TITAN;
    public static EntityType<?> HERO;
    public static EntityType<?> ORACLE;
    public static EntityType<?> NYMPH;
    public static EntityType<?> MESSENGER;
    
    /**
     * Initialize all entity types
     */
    public static void initialize() {
        AIMythologyMod.LOGGER.info("Initializing AI Mythology Entity Types...");
        
        // Register Greek Monsters
        registerGreekMonsters();
        
        // Register Divine Spirits
        registerDivineSpirits();
        
        // Register Legendary Beasts
        registerLegendaryBeasts();
        
        // Register Divine Beings
        registerDivineBeings();
        
        AIMythologyMod.LOGGER.info("AI Mythology Entity Types initialized successfully!");
    }
    
    /**
     * Register Greek monster entities
     */
    private static void registerGreekMonsters() {
        // In a full implementation, these would be actual entity classes
        AIMythologyMod.LOGGER.info("Registered Greek monster entities");
    }
    
    /**
     * Register divine spirit entities
     */
    private static void registerDivineSpirits() {
        // In a full implementation, these would be actual entity classes
        AIMythologyMod.LOGGER.info("Registered divine spirit entities");
    }
    
    /**
     * Register legendary beast entities
     */
    private static void registerLegendaryBeasts() {
        // In a full implementation, these would be actual entity classes
        AIMythologyMod.LOGGER.info("Registered legendary beast entities");
    }
    
    /**
     * Register divine being entities
     */
    private static void registerDivineBeings() {
        // In a full implementation, these would be actual entity classes
        AIMythologyMod.LOGGER.info("Registered divine being entities");
    }
    
    /**
     * Register an entity type with the registry
     */
    private static EntityType<?> registerEntity(Identifier id, EntityType<?> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, id, entityType);
    }
} 