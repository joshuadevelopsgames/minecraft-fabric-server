# Fabric Mod Tooltip Implementation Guide

## Overview
This guide covers how to implement custom tooltips for items in Fabric mods for Minecraft 1.21.6+. Tooltips are client-side rendered but can be generated server-side and sent to clients.

## Method 1: Direct Item Class Implementation (Recommended)

### Step 1: Add Required Imports
Add these imports to your item class:

```java
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import java.util.function.Consumer;
```

### Step 2: Implement appendTooltip Method
Add this method to your item class:

```java
@Override
public void appendTooltip(ItemStack stack, Item.TooltipContext context, 
                         TooltipDisplayComponent displayComponent, 
                         Consumer<Text> tooltip, TooltipType type) {
    super.appendTooltip(stack, context, displayComponent, tooltip, type);
    
    // Add your custom tooltip lines here
    tooltip.accept(Text.literal("Your tooltip text").formatted(Formatting.GOLD));
    tooltip.accept(Text.literal("More tooltip text").formatted(Formatting.YELLOW));
}
```

### Step 3: Key Points
- Use `tooltip.accept()` instead of `tooltip.add()` (new API)
- Call `super.appendTooltip()` first to preserve default tooltips
- Use `Text.literal()` to create text components
- Apply formatting with `.formatted(Formatting.COLOR)`

## Method 2: Using ComponentTooltipAppenderRegistry (Advanced)

### Step 1: Add Registry Entry
In your mod's main class initialization:

```java
ComponentTooltipAppenderRegistry.INSTANCE.register(
    YourItem.class,
    (stack, context, displayComponent, tooltip, type) -> {
        tooltip.accept(Text.literal("Custom tooltip"));
    }
);
```

### Step 2: Required Dependencies
Ensure your `fabric.mod.json` includes:
```json
"depends": {
    "fabric-api": "*"
}
```

## Method 3: Client-Side Events (Not Recommended for Server Mods)

### Step 1: Create Client Entrypoint
Add to `fabric.mod.json`:
```json
"entrypoints": {
    "main": ["com.example.mod.YourMod"],
    "client": ["com.example.mod.YourClientMod"]
}
```

### Step 2: Implement Client Mod
```java
public class YourClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            if (stack.getItem() instanceof YourItem) {
                lines.add(Text.literal("Client-side tooltip"));
            }
        });
    }
}
```

**Note**: This method requires clients to have the mod installed, which defeats the purpose for server mods.

## Formatting Options

### Colors
```java
Formatting.BLACK
Formatting.DARK_BLUE
Formatting.DARK_GREEN
Formatting.DARK_AQUA
Formatting.DARK_RED
Formatting.DARK_PURPLE
Formatting.GOLD
Formatting.GRAY
Formatting.DARK_GRAY
Formatting.BLUE
Formatting.GREEN
Formatting.AQUA
Formatting.RED
Formatting.LIGHT_PURPLE
Formatting.YELLOW
Formatting.WHITE
```

### Styles
```java
Formatting.BOLD
Formatting.ITALIC
Formatting.UNDERLINE
Formatting.STRIKETHROUGH
Formatting.OBFUSCATED
```

### Combining Formatting
```java
Text.literal("Text").formatted(Formatting.GOLD, Formatting.BOLD)
```

## Debugging Tooltips

### Add Debug Logging
```java
@Override
public void appendTooltip(ItemStack stack, Item.TooltipContext context, 
                         TooltipDisplayComponent displayComponent, 
                         Consumer<Text> tooltip, TooltipType type) {
    super.appendTooltip(stack, context, displayComponent, tooltip, type);
    
    // Debug logging
    YourMod.LOGGER.info("TOOLTIP CALLED - Type: {}", type);
    
    tooltip.accept(Text.literal("Debug tooltip"));
}
```

### Check Server Logs
Look for your debug messages in the server logs when hovering over items.

## Common Issues and Solutions

### Issue 1: Tooltips Not Showing
**Cause**: Method signature incorrect or missing imports
**Solution**: Ensure you're using the correct Fabric API 1.21.6+ signature

### Issue 2: Compilation Errors
**Cause**: Using old API methods
**Solution**: 
- Use `tooltip.accept()` instead of `tooltip.add()`
- Use `Consumer<Text>` instead of `List<Text>`

### Issue 3: Version Conflicts
**Cause**: Backup files in JAR containing old versions
**Solution**: Clean JAR files:
```bash
# Extract JAR
jar -xf your-mod.jar

# Remove backup files
rm -f fabric.mod.json.backup
rm -f *.backup

# Repack JAR
jar -cf your-mod-clean.jar *
```

### Issue 4: Tooltips Only Show on Client
**Cause**: Using client-side events
**Solution**: Use direct item class implementation instead

## Best Practices

1. **Always call super**: `super.appendTooltip(stack, context, displayComponent, tooltip, type);`
2. **Use appropriate formatting**: Make tooltips visually appealing
3. **Keep tooltips concise**: Don't overwhelm players with too much text
4. **Test thoroughly**: Verify tooltips work in both singleplayer and multiplayer
5. **Clean JARs**: Remove backup files to prevent version conflicts
6. **Use debug logging**: Add temporary logging to troubleshoot issues
7. **Use clean build script**: Always use `./clean-build.sh` instead of `gradle build` to prevent backup files from being included

## Example Implementation

Here's a complete example for a legendary weapon:

```java
public class LegendaryWeaponItem extends Item {
    public LegendaryWeaponItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, 
                             TooltipDisplayComponent displayComponent, 
                             Consumer<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("⚡ Legendary Weapon").formatted(Formatting.GOLD, Formatting.BOLD));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Special abilities and powers").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("Enhanced damage and effects").formatted(Formatting.RED));
        tooltip.accept(Text.literal("").formatted(Formatting.GOLD));
        tooltip.accept(Text.literal("Rare and powerful item").formatted(Formatting.LIGHT_PURPLE));
    }
}
```

## Version Compatibility

- **Minecraft 1.21.6+**: Use the method signature shown above
- **Older versions**: May require different method signatures
- **Fabric API**: Ensure you're using compatible versions

## Testing

1. Build your mod: `./clean-build.sh` (recommended) or `gradle build`
2. Deploy to server
3. Restart server
4. Test tooltips in-game
5. Check server logs for debug messages
6. Verify tooltips appear for all players

## Preventing Backup File Issues

### Use the Clean Build Script
Always use `./clean-build.sh` instead of `gradle build` to ensure no backup files are included in the final JAR.

### Manual Cleanup (if needed)
If you need to manually clean a JAR:
```bash
# Extract JAR
jar -xf your-mod.jar

# Remove backup files
rm -f fabric.mod.json.backup
rm -f *.backup
rm -f *_backup.*

# Repack JAR
jar -cf your-mod-clean.jar *
```

### Pre-Build Checklist
Before building, always check for:
- `fabric.mod.json.backup` files
- Any `*_backup.*` files
- Any `*.backup` files

This guide should help you implement tooltips successfully in future Fabric mod projects! 