package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.damage.DamageSource;

public class MerchantPiglinEntity extends PiglinEntity {
    
    public MerchantPiglinEntity(EntityType<? extends PiglinEntity> entityType, World world) {
        super(entityType, world);
        
        GreekMythologyMod.LOGGER.info("Merchant Piglin Entity constructor called");
        
        // Set up the merchant properties
        this.setCustomName(Text.literal("Divine Merchant").formatted(Formatting.GOLD, Formatting.BOLD));
        this.setCustomNameVisible(true);
        this.setPersistent();
        this.setInvulnerable(true);
        this.setBaby(false);
        
        GreekMythologyMod.LOGGER.info("Merchant Piglin Entity created successfully");
    }
    
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (!(player instanceof ServerPlayerEntity serverPlayer)) {
            return ActionResult.PASS;
        }
        
        // Simple greeting for now
        serverPlayer.sendMessage(Text.literal("§6§l[Divine Merchant] §r§eGreetings, mortal! I am the Divine Merchant.").formatted(Formatting.GOLD), false);
        serverPlayer.sendMessage(Text.literal("§7I will soon offer divine treasures for trade!").formatted(Formatting.GRAY), false);
        
        return ActionResult.SUCCESS;
    }
    
    @Override
    public boolean isPersistent() {
        return true;
    }
    
    @Override
    public boolean cannotDespawn() {
        return true;
    }
    
    @Override
    public boolean isInvulnerable() {
        return true;
    }
    
    public boolean canTarget(net.minecraft.entity.LivingEntity target) {
        return false;
    }
    
    public boolean canAttack(net.minecraft.entity.LivingEntity target) {
        return false;
    }
    
    public boolean isHostile() {
        return false;
    }
    
    public boolean damage(DamageSource source, float amount) {
        // Merchant is invulnerable to all damage
        return false;
    }
    
    public boolean isPushable() {
        return false;
    }
    
    public boolean isFireImmune() {
        return true;
    }
    
    public boolean isImmuneToExplosion() {
        return true;
    }
    
    // Override transformation methods to prevent zombification
    public boolean canConvertInWater() {
        return false;
    }
    
    public boolean canConvertInPowderSnow() {
        return false;
    }
    
    public boolean canConvertInOverworld() {
        return false;
    }
    
    public boolean shouldConvertInOverworld() {
        return false;
    }
    
    public boolean shouldConvertInWater() {
        return false;
    }
    
    public boolean shouldConvertInPowderSnow() {
        return false;
    }
    
    public boolean canConvert() {
        return false;
    }
} 