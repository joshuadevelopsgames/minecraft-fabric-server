package com.example.customnpcmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class IntegratedNpcModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		// Register minimal renderer to prevent crashes
		EntityRendererRegistry.register(IntegratedNpcMod.CUSTOM_VILLAGER, CustomVillagerEntityRenderer::new);

		// Register minimal model layer
		EntityModelLayerRegistry.registerModelLayer(
			CustomVillagerEntityModel.LAYER, 
			(context) -> net.minecraft.client.model.TexturedModelData.of(
				net.minecraft.client.model.ModelData.create(),
				64, 64
			)
		);
	}
}
