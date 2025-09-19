package com.example.greekmyth.client;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.MerchantPiglinEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PiglinEntityModel;
import net.minecraft.util.Identifier;

public class MerchantPiglinRenderer extends MobEntityRenderer<MerchantPiglinEntity, PiglinEntityModel<MerchantPiglinEntity>> {

    private static final Identifier TEXTURE = new Identifier(GreekMythologyMod.MOD_ID, "textures/entity/merchant_piglin.png");

    public MerchantPiglinRenderer(EntityRendererFactory.Context context) {
        super(context, new PiglinEntityModel<>(context.getPart(EntityModelLayers.PIGLIN)), 0.5f);
        GreekMythologyMod.LOGGER.info("Merchant Piglin Renderer created");
    }

    @Override
    public Identifier getTexture(MerchantPiglinEntity entity) {
        return TEXTURE;
    }
} 