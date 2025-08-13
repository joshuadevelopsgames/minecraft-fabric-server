# Fabric API Changes for Minecraft 1.21.6, 1.21.7 & 1.21.8

*Reference document for development - Last updated: August 6, 2025*

## Overview
A new version of Minecraft is coming soon with some changes that affect most mod makers. As always, we ask all players to be patient, and give mod developers time to update to this new version.

## Development Requirements
- **Loom**: 1.10 (at the time of writing)
- **Fabric Loader**: Latest stable version (currently 0.16.14)

## Deprecations and Removals

The following previously deprecated modules have been removed (#4651):
- `fabric-command-api-v1`
- `fabric-commands-v0` (Deprecated almost 5 years ago!)
- `fabric-keybindings-v0`
- `fabric-rendering-data-attachment-v1`

## Module Merges

The following modules have been merged into other modules for simplicity:
- `fabric-client-tags-api-v1` was merged into `fabric-tag-api-v1` (#4647)
- `fabric-blockrenderlayer-v1` was merged into `fabric-rendering-v1` (#4675)

## BlockRenderLayerMap API Changes

The BlockRenderLayerMap API was updated to be more consistent with current API style:

### Old Code:
```java
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MY_EPIC_BLOCK, BlockRenderLayer.CUTOUT)
```

### New Code:
```java
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;

BlockRenderLayerMap.putBlock(ModBlocks.MY_EPIC_BLOCK, BlockRenderLayer.CUTOUT)
```

## Breaking Changes

### HUD API Rewrite
Fabric's brand new HUD API had to be totally rewritten in 1.21.6. The new `HudElementRegistry` provides all of the functionality provided by the old API.

#### Basic Example - Draw text after all vanilla HUD layers:
```java
HudElementRegistry.addLast(Identifier.of("example", "hud"), (context, tickCounter) -> {
    context.drawTextWithShadow(MinecraftClient.getInstance().textRenderer, "This is an example", 10, 10, Colors.WHITE);
});
```

#### Render before vanilla chat:
```java
HudElementRegistry.attachElementBefore(VanillaHudElements.CHAT, Identifier.of("example", "hud"), (context, tickCounter) -> {
    // Your custom HUD code here
});
```

## New Fabric API Features

### ComponentTooltipAppenderRegistry
Since `Item#appendTooltip` has become deprecated, Fabric API now provides the `ComponentTooltipAppenderRegistry`. This registry provides `addAfter`, `addBefore`, `addFirst`, and `addLast` to allow you to position your tooltips relative to vanilla and other mods.

```java
record MyAmazingComponent() implements TooltipAppender {
    @Override
    public void appendTooltip(Item.TooltipContext context, Consumer<Text> textConsumer, TooltipType type, ComponentsAccess components) {
        textConsumer.accept(Text.literal("Amazingness Awaits!"));
    }
}

ComponentType<MyAmazingComponent> myAmazingComponentComponentType = /*...*/;
ComponentTooltipAppenderRegistry.addAfter(
    DataComponentTypes.DAMAGE,
    myAmazingComponentComponentType
);
```

### LootTable API Expansion
The LootTable API has been expanded to make certain extreme usages more convenient. The `LootTableEvents.MODIFY_DROPS` event allows modders to customize the collective output of LootTables.

```java
var matchGetter = ServerRecipeManager.createCachedMatchGetter(RecipeType.SMELTING);

// smelt any smeltable drops from blocks broken with a diamond pickaxe
LootTableEvents.MODIFY_DROPS.register((entry, context, drops) -> {
    if (!context.hasParameter(LootContextParameters.TOOL)) return;
    if (!context.hasParameter(LootContextParameters.BLOCK_STATE)) return;
    ItemStack tool = context.get(LootContextParameters.TOOL);
    if (!tool.isOf(Items.DIAMOND_PICKAXE)) return;
    var world = context.getWorld();
    var lookup = world.getRegistryManager();
    drops.replaceAll(drop ->
        matchGetter.getFirstMatch(new SingleStackRecipeInput(drop), world)
            .map(RecipeEntry::value)
            .map(recipe -> recipe.craft(input, lookup))
            .orElse(drop)
    );
});
```

### New Biome Tags
Added new biome tags, allowing modders to differentiate biomes based on their primary wood type.

### ServerChunkEvents
The `ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE` event was added to allow more control over the timing of chunk events. This event fires for changes in chunk loading level.

### Attachment Change Events
An event was added for attachment changes, allowing reaction to an attachment value changing.

### Player Events
Two more events were added for players joining and leaving the game:

```java
AttachmentType<Instant> JOINED_TIME = /*...*/;
ServerPlayerEvents.JOIN.register(player -> {
    // runs on the main thread, no need to use player.getServer().execute(() -> ...);
    player.setAttached(JOINED_TIME, Instant.now());
});

List<ServerPlayerEntity> activePlayers = /*...*/;
ServerPlayerEvents.LEAVE.register(activePlayers::remove);
```

### FabricSoundsProvider
The `FabricSoundsProvider` class was added to allow convenient creation of sounds.json from within datagen.

### Model Loading API
The Model Loading API now supports registering extra unbound models:

```java
// A ModelKey is a unique identifier for a model you want to bake.
public static final ModelKey<BlockStateModel> HALF_RED_SAND_MODEL_KEY = ModelKey.create();
public static final Identifier HALF_RED_SAND_MODEL_ID = id("half_red_sand");

public static void init() {
    ModelLoadingPlugin.register(pluginContext -> {
        pluginContext.addModel(HALF_RED_SAND_MODEL_KEY, HALF_RED_SAND_MODEL_ID, (model, baker) -> {
            ModelTextures textures = model.getTextures();
            return new SimpleBlockStateModel(new GeometryBakedModel(
                model.bakeGeometry(textures, baker, ModelRotation.X0_Y0),
                model.getAmbientOcclusion(),
                model.getParticleTexture(textures, baker)
            ));
        });
    })
}

public static BlockStateModel getModel() {
    return MinecraftClient.getInstance().getBakedModelManager().getModel(HALF_RED_SAND_MODEL_KEY);
}
```

### FabricTrackedDataRegistry
`FabricTrackedDataRegistry` has been added to allow registering tracked data handlers for entities. This removes conflicts between mods registering tracked data handlers and ensures that the order is consistent between the client and server.

#### Migration:
```java
// Old
TrackedDataHandlerRegistry.register(TRACKED_DATA_HANDLER);

// New
FabricTrackedDataRegistry.registerHandler(TRACKED_DATA_HANDLER_ID, TRACKED_DATA_HANDLER);
```

## Minecraft Changes

### Rendering
Mojang is currently working on separating Minecraft's rendering pipeline into two stages:
1. The extraction stage, where all renderable data is separated from the game
2. The render phase, where the previously extracted data is rendered

This process began in 1.21.2, and is still incomplete as of this update. Chunk, GUI and HUD rendering have all been converted to use the new separate rendering style.

Many methods in `RenderSystem` have been removed without direct replacement. In most cases, there isn't a one-to-one translation from the old code to the new, but the same capabilities exist by combining the new `RenderPipelines` with `RenderLayers`.

### NBT Changes
BlockEntities now abstract saving to NBT through `ReadViews` and `WriteViews`. These views are responsible for storing errors from encoding / decoding, and keeping track of registries throughout the serialization process.

#### Example Implementation:
```java
class BE extends BlockEntity {
    private int anInt;
    private String aString;
    private Extra extra;
    
    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registries) {
        return createNbt(registries); // createNbt takes care of adapting to / from WriteView
    }

    @Override
    protected void writeData(WriteView view) {
        super.writeData(view);
        view.putNullable("extra", Extra.CODEC, this.extra);
        if (aString != null) // putString will eventually throw if we pass null
            view.putString("aString", aString);
        view.putInt("anInt", anInt);
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        view.read("extra", Extra.CODEC).ifPresent(extra -> this.extra = extra);
        view.getOptionalString("aString").ifPresent(aString -> this.aString = aString);
        view.getOptionalInt("anInt").ifPresent(anInt -> this.anInt = anInt);
    }

    record Extra(int i, int j) {
        public static final Codec<Extra> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("i").forGetter(extra -> extra.i), 
            Codec.INT.fieldOf("j").forGetter(extra -> extra.j)
        ).apply(instance, Extra::new));
    }
}
```

### Data Generation
`getOrCreateTagBuilder` should be replaced with the new `valueLookupBuilder`.

## Important Notes
- The Fabric Rendering API previously provided a Material API, which has been removed
- Materials were removed because they were deemed to be an unnecessary part of the API design
- The breaking change induced by changes in 1.21.6 was related to materials, which made this the perfect time to remove them

## References
- Fabric GitHub: https://github.com/FabricMC/fabric
- Issue #4651: Module removals
- Issue #4647: Tag API changes
- Issue #4675: Rendering API changes
- Issue #4664: BlockRenderLayerMap API updates
- Issue #4587: ComponentTooltipAppenderRegistry
- Issue #4643: LootTable API expansion
- Issue #4541: Biome tags and chunk events
- Issue #4606: Attachment change events
- Issue #4642: Player events
- Issue #4560: FabricSoundsProvider
- Issue #4597: Client Game Test API
- Issue #4565: Model Loading API 