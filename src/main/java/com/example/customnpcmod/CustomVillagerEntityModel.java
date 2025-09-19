package com.example.customnpcmod;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class CustomVillagerEntityModel extends EntityModel<CustomVillagerEntity> {
    
    public static final EntityModelLayer LAYER = new EntityModelLayer(
        new Identifier("integrated_npc_mod", "custom_villager"),
        "main"
    );
    
    public CustomVillagerEntityModel(ModelPart root) {
        // Empty constructor for basic model
    }
    
    @Override
    public void setAngles(CustomVillagerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        // Basic angle setting
    }
    
    @Override
    public void render(net.minecraft.client.util.math.MatrixStack matrices, net.minecraft.client.render.VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // Basic rendering - just render nothing for now
    }
}
