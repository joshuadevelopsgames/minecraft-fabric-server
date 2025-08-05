package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.favor.God;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.IllusionerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class SpecializedOracleEntity extends OracleEntity {
    
    private final String displayName;
    private final String color;
    
    public SpecializedOracleEntity(EntityType<? extends IllusionerEntity> entityType, World world, God god) {
        super(entityType, world);
        this.specializedGod = god; // Set the protected field from parent class
        
        // Set the display name and color based on the god
        switch (god) {
            case ZEUS:
                this.displayName = "§e§lZeus Oracle";
                this.color = "§e";
                break;
            case POSEIDON:
                this.displayName = "§b§lPoseidon Oracle";
                this.color = "§b";
                break;
            case HADES:
                this.displayName = "§5§lHades Oracle";
                this.color = "§5";
                break;
            case ARES:
                this.displayName = "§c§lAres Oracle";
                this.color = "§c";
                break;
            case ATHENA:
                this.displayName = "§7§lAthena Oracle";
                this.color = "§7";
                break;
            case HEPHAESTUS:
                this.displayName = "§6§lHephaestus Oracle";
                this.color = "§6";
                break;
            case APOLLO:
                this.displayName = "§e§lApollo Oracle";
                this.color = "§e";
                break;
            case ARTEMIS:
                this.displayName = "§a§lArtemis Oracle";
                this.color = "§a";
                break;
            case HERMES:
                this.displayName = "§b§lHermes Oracle";
                this.color = "§b";
                break;
            case DIONYSUS:
                this.displayName = "§d§lDionysus Oracle";
                this.color = "§d";
                break;
            case APHRODITE:
                this.displayName = "§d§lAphrodite Oracle";
                this.color = "§d";
                break;
            case DEMETER:
                this.displayName = "§6§lDemeter Oracle";
                this.color = "§6";
                break;
            default:
                this.displayName = "§6§lThe Oracle";
                this.color = "§6";
                break;
        }
        
        // Set the custom name
        this.setCustomName(Text.literal(displayName).formatted(Formatting.GOLD, Formatting.BOLD));
        this.setCustomNameVisible(true);
        
        GreekMythologyMod.LOGGER.info("Specialized Oracle Entity created for {} - {}", god.name(), displayName);
    }
    
    @Override
    public God getSpecializedGod() {
        return specializedGod;
    }
    
    public String getOracleDisplayName() {
        return displayName;
    }
    
    public String getColor() {
        return color;
    }
} 