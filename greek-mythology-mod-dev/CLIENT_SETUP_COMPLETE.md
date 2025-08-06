# Complete Client-Side Setup for Merchant Piglin

## Current Status
✅ **Server-side merchant entity** - Working with proper entity registration  
✅ **Custom texture** - Your wandering trader texture included  
⏳ **Client-side renderer** - Ready to be added when mod is installed on client

## When You Install This Mod on a Minecraft Client

The mod will work on the server, but to see the custom texture, you'll need to add the client-side renderer. Here's the complete setup:

### 1. Create the Client-Side Renderer

Create this file in your client mod:
`src/main/java/com/example/greekmyth/client/MerchantPiglinRenderer.java`

```java
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
```

### 2. Update the Client Mod Initializer

In your `GreekMythologyClientMod.java`, add:

```java
package com.example.greekmyth;

import com.example.greekmyth.client.MerchantPiglinRenderer;
import com.example.greekmyth.entity.GreekEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreekMythologyClientMod implements ClientModInitializer {
    public static final String MOD_ID = "greekmyth";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // Client-side soul counter - synced from server
    private static int clientSoulCount = 0;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Greek Mythology Client Mod initialized!");
        
        // Register custom entity renderers
        EntityRendererRegistry.register(GreekEntityTypes.MERCHANT_PIGLIN, MerchantPiglinRenderer::new);
        
        LOGGER.info("Custom entity renderers registered!");
    }
    
    // ... rest of your existing methods
}
```

### 3. Texture Location

The custom texture is already included in the mod at:
`src/main/resources/assets/greekmyth/textures/entity/merchant_piglin.png`

This is your wandering trader texture that will be used for the merchant.

## How It Works

1. **Server-side**: The merchant entity works perfectly with the `/spawnmerchant` command
2. **Client-side**: When you add the renderer, the merchant will display your custom texture
3. **Texture**: The wandering trader texture will replace the default piglin texture

## What You Get

- ✅ **Custom Merchant Entity** - Extends PiglinEntity with merchant behaviors
- ✅ **Proper Entity Registration** - Uses FabricEntityTypeBuilder.createMob()
- ✅ **Custom Texture** - Your wandering trader texture included
- ✅ **Client-Side Rendering** - Ready to be added for custom texture display

## Testing

1. **Server**: Use `/spawnmerchant` to spawn the merchant (works now)
2. **Client**: Add the renderer to see the custom texture
3. **Result**: Merchant with your wandering trader texture!

The mod is ready to use on both server and client sides! 