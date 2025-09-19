package com.example.customnpcmod;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class CustomVillagerEntityRenderer extends EntityRenderer<CustomVillagerEntity> {
    
    public CustomVillagerEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }
    
    @Override
    public Identifier getTexture(CustomVillagerEntity entity) {
        return new Identifier("minecraft", "textures/entity/villager/villager.png");
    }
}
