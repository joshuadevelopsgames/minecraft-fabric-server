# Chat Formatting Guide for Minecraft Mods

## Problem
When implementing custom player roles with colored prefixes in chat, the color was bleeding into the entire message instead of just the prefix.

## Solution: Explicit Color Control

### Key Principle
Instead of trying to "reset" formatting, explicitly set the desired color for each text component.

### Implementation Steps

#### 1. Use `ServerMessageDecoratorEvent.CONTENT_PHASE`
```java
net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent.EVENT.register(
    net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent.CONTENT_PHASE,
    (sender, message) -> {
        // Formatting logic here
    }
);
```

#### 2. Create Separate Text Components
```java
// Create formatted message with only the prefix colored using separate components
net.minecraft.util.Formatting colorFormat = getFormattingFromColor(color);
LOGGER.info("CHAT DEBUG: Role color '{}' -> Formatting: {}", color, colorFormat);

net.minecraft.text.MutableText formattedMessage = net.minecraft.text.Text.literal(prefix + " ")
    .formatted(colorFormat);
formattedMessage.append(net.minecraft.text.Text.literal(serverPlayer.getName().getString() + ": " + message.getContent().getString())
    .formatted(net.minecraft.util.Formatting.WHITE));
```

#### 3. Color Mapping Function
```java
private static net.minecraft.util.Formatting getFormattingFromColor(String colorName) {
    switch (colorName.toLowerCase()) {
        case "black": return net.minecraft.util.Formatting.BLACK;
        case "dark_blue": return net.minecraft.util.Formatting.DARK_BLUE;
        case "dark_green": return net.minecraft.util.Formatting.DARK_GREEN;
        case "dark_aqua": return net.minecraft.util.Formatting.DARK_AQUA;
        case "dark_red": return net.minecraft.util.Formatting.DARK_RED;
        case "dark_purple": return net.minecraft.util.Formatting.DARK_PURPLE;
        case "gold": return net.minecraft.util.Formatting.GOLD;
        case "gray": return net.minecraft.util.Formatting.GRAY;
        case "dark_gray": return net.minecraft.util.Formatting.DARK_GRAY;
        case "blue": return net.minecraft.util.Formatting.BLUE;
        case "green": return net.minecraft.util.Formatting.GREEN;
        case "aqua": return net.minecraft.util.Formatting.AQUA;
        case "red": return net.minecraft.util.Formatting.RED;
        case "light_purple": return net.minecraft.util.Formatting.LIGHT_PURPLE;
        case "yellow": return net.minecraft.util.Formatting.YELLOW;
        case "white": return net.minecraft.util.Formatting.WHITE;
        default: return net.minecraft.util.Formatting.WHITE;
    }
}
```

## Configuration File Structure

### `config/custom_roles.json`
```json
{
  "roles": {
    "Owner": {
      "prefix": "[Owner]",
      "color": "gold",
      "permission_level": 4
    },
    "Admin": {
      "prefix": "[Admin]",
      "color": "dark_red",
      "permission_level": 3
    },
    "Member": {
      "prefix": "[Member]",
      "color": "green",
      "permission_level": 1
    }
  },
  "assignments": {
    "Kangarude": "Owner"
  }
}
```

## Deployment Process

### 1. Build the Mod
```bash
gradle build
```

### 2. Deploy to Server
```bash
scp -i ~/.ssh/id_ed25519 "build/libs/greek-mythology-1.0.76.jar" root@178.156.165.14:/root/minecraft/mods/
```

### 3. Update Configuration
```bash
scp -i ~/.ssh/id_ed25519 "src/main/resources/config/custom_roles.json" root@178.156.165.14:/root/minecraft/config/
```

### 4. Restart Server
```bash
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && pkill -f 'java.*fabric-server-launch.jar' && sleep 3 && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"
```

### 5. Reload Roles (if server is running)
```bash
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && screen -S minecraft -X stuff 'roles reload^M'"
```

## Debugging

### Add Debug Logging
```java
LOGGER.info("CHAT DEBUG: Role color '{}' -> Formatting: {}", color, colorFormat);
```

### Check Logs
```bash
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && grep -E '(CHAT DEBUG|CHAT FORMAT)' logs/latest.log | tail -5"
```

## Common Issues and Solutions

### Issue: Color Bleeding into Entire Message
**Solution**: Use explicit `.formatted(Formatting.WHITE)` on the message content instead of trying to reset formatting.

### Issue: Color Codes Displaying Literally (e.g., "c[Owner]")
**Solution**: Use `getFormattingFromColor()` method that returns `Formatting` enum values instead of color codes.

### Issue: Configuration Not Updating
**Solution**: Ensure both the mod JAR and config file are deployed, then reload roles or restart server.

### Issue: Commands Not Working
**Solution**: 
1. Remove environment restrictions from command registration
2. Use `sendFeedback()` instead of `sendMessage()`
3. Ensure command classes are properly compiled and included in JAR

## Expected Result
- **Prefix**: `[Owner]` in **gold color**
- **Message**: `Kangarude: hi` in **white color**
- **No color bleeding** between components

## Key Takeaways

1. **Explicit Color Control**: Always set the exact color you want for each text component
2. **Separate Components**: Use `MutableText` with separate `.formatted()` calls
3. **No Reset Needed**: Don't rely on `Formatting.RESET` - set the desired color explicitly
4. **Debug Logging**: Add logging to track color conversion and formatting
5. **Configuration Sync**: Ensure both mod and config files are updated together

## File Locations
- **Mod Source**: `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/GreekMythologyMod.java`
- **Config**: `greek-mythology-mod-dev/src/main/resources/config/custom_roles.json`
- **Server Config**: `/root/minecraft/config/custom_roles.json`
- **Server Mod**: `/root/minecraft/mods/greek-mythology-1.0.76.jar` 