package com.example.greekmyth.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.nbt.NbtCompound;
import java.util.UUID;

public class PetWitherSkeletonEntity extends WitherSkeletonEntity {
    private UUID ownerUuid;
    private String ownerName;

    public PetWitherSkeletonEntity(EntityType<? extends WitherSkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        // Add a simple follow owner goal (proof of concept)
        this.goalSelector.add(1, new FollowOwnerGoal(this, 1.0, 10.0f, 2.0f));
        // Attack other players (not owner)
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(3, new WanderAroundGoal(this, 1.0));
    }

    public void setOwner(ServerPlayerEntity owner) {
        this.ownerUuid = owner.getUuid();
        this.ownerName = owner.getName().getString();
        this.setCustomName(Text.literal("§6" + ownerName + "'s Wither Skeleton"));
        this.setCustomNameVisible(true);
    }

    public boolean isOwner(PlayerEntity player) {
        return ownerUuid != null && ownerUuid.equals(player.getUuid());
    }

    @Override
    public boolean canTarget(PlayerEntity player) {
        return !isOwner(player) && super.canTarget(player);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        if (ownerUuid != null) {
            nbt.putUuid("Owner", ownerUuid);
        }
        if (ownerName != null) {
            nbt.putString("OwnerName", ownerName);
        }
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.containsUuid("Owner")) {
            this.ownerUuid = nbt.getUuid("Owner");
        }
        if (nbt.contains("OwnerName")) {
            this.ownerName = nbt.getString("OwnerName");
        }
    }

    public static DefaultAttributeContainer.Builder createPetWitherSkeletonAttributes() {
        return WitherSkeletonEntity.createWitherSkeletonAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0);
    }

    // Simple follow owner goal (proof of concept)
    private static class FollowOwnerGoal extends Goal {
        private final PetWitherSkeletonEntity pet;
        private final double speed;
        private final float maxDist;
        private final float minDist;

        public FollowOwnerGoal(PetWitherSkeletonEntity pet, double speed, float maxDist, float minDist) {
            this.pet = pet;
            this.speed = speed;
            this.maxDist = maxDist;
            this.minDist = minDist;
        }

        @Override
        public boolean canStart() {
            PlayerEntity owner = pet.getWorld().getPlayerByUuid(pet.ownerUuid);
            return owner != null && pet.squaredDistanceTo(owner) > minDist * minDist;
        }

        @Override
        public void tick() {
            PlayerEntity owner = pet.getWorld().getPlayerByUuid(pet.ownerUuid);
            if (owner != null) {
                Vec3d ownerPos = owner.getPos();
                pet.getNavigation().startMovingTo(ownerPos.x, ownerPos.y, ownerPos.z, speed);
            }
        }
    }
} 