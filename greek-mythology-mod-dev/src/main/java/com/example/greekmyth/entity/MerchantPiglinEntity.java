package com.example.greekmyth.entity;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class MerchantPiglinEntity extends PiglinEntity {
    
    public MerchantPiglinEntity(EntityType<? extends PiglinEntity> entityType, World world) {
        super(entityType, world);
        this.setCustomName(Text.literal("Divine Merchant").formatted(Formatting.GOLD, Formatting.BOLD));
        this.setCustomNameVisible(true);
        this.setPersistent();
        this.setInvulnerable(true);
        GreekMythologyMod.LOGGER.info("Merchant Piglin Entity created - Divine economy merchant ready");
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
    
    public boolean isPersistent() {
        return true;
    }
    
    public boolean cannotDespawn() {
        return true;
    }
    
    public boolean isInvulnerable() {
        return true;
    }
    
    public boolean canTarget(LivingEntity target) {
        return false;
    }
    
    public boolean canAttack(LivingEntity target) {
        return false;
    }
    
    public boolean isHostile() {
        return false;
    }
    
    public void setTarget(LivingEntity target) {
        // Do nothing - merchant doesn't target anyone
    }
    
    public boolean damage(DamageSource source, float amount) {
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
    
    public static MerchantPiglinEntity getNearestMerchant(World world) {
        // For now, return null - we'll implement this later when needed
        return null;
    }
} 