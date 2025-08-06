# Client-Side Renderer Setup for Merchant Piglin

## Custom Texture Setup

The merchant piglin texture is already included in the mod at:
`src/main/resources/assets/greekmyth/textures/entity/merchant_piglin.png`

## To Enable Custom Texture on Client Side

When installing this mod on a Minecraft client, you'll need to add a client-side renderer. Here's how:

### 1. Create the Renderer File

Create this file in your client mod:
`src/main/java/com/example/greekmyth/client/MerchantPiglinEntityRenderer.java`

```java
package com.example.greekmyth.client;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.entity.MerchantPiglinEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.PiglinEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class MerchantPiglinEntityRenderer extends PiglinEntityRenderer {
    
    private static final Identifier MERCHANT_TEXTURE = new Identifier(GreekMythologyMod.MOD_ID, "textures/entity/merchant_piglin.png");
    
    public MerchantPiglinEntityRenderer(EntityRendererFactory.Context context) {
        super(context, EntityModelLayers.PIGLIN, EntityModelLayers.PIGLIN_INNER_ARMOR, EntityModelLayers.PIGLIN_OUTER_ARMOR);
        GreekMythologyMod.LOGGER.info("Merchant Piglin Entity Renderer created");
    }
    
    @Override
    public Identifier getTexture(MerchantPiglinEntity entity) {
        return MERCHANT_TEXTURE;
    }
}
```

### 2. Register the Renderer

In your client mod initializer, add:

```java
import com.example.greekmyth.client.MerchantPiglinEntityRenderer;
import com.example.greekmyth.entity.MerchantPiglinEntity;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Override
public void onInitializeClient() {
    // Register custom entity renderers
    EntityRendererRegistry.register(MerchantPiglinEntity.class, MerchantPiglinEntityRenderer::new);
}
```

## Current Status

✅ **Server-side merchant entity** - Working with Oracle-style transformation system
✅ **Custom texture** - Included in mod assets
⏳ **Client-side renderer** - Needs to be added when mod is installed on client

The merchant will work on the server without the custom texture, but will use the custom texture when the client-side renderer is properly set up. 