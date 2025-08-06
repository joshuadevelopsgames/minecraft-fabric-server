package com.example.greekmyth.client.render;

import com.example.greekmyth.entity.MerchantPiglinEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.PiglinEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MerchantPiglinRenderer extends PiglinEntityRenderer {

    private static final Identifier MERCHANT_TEX =
            Identifier.of("greekmyth", "textures/entity/merchant_piglin.png");

    public MerchantPiglinRenderer(EntityRendererFactory.Context ctx) {
        super(ctx,
              EntityModelLayers.PIGLIN,
              EntityModelLayers.PIGLIN_BABY,
              EntityModelLayers.PIGLIN_INNER_ARMOR,
              EntityModelLayers.PIGLIN_OUTER_ARMOR,
              EntityModelLayers.PIGLIN_BABY_INNER_ARMOR,
              EntityModelLayers.PIGLIN_BABY_OUTER_ARMOR);
    }

    public Identifier getTexture(MerchantPiglinEntity entity) {
        return MERCHANT_TEX;
    }
} 