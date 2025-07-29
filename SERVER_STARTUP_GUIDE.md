# Dev Server Startup Guide

## Overview
This guide documents the correct process for starting the Minecraft Fabric dev server with the Greek Mythology mod, based on the successful approach that resolved mixin errors and allowed player connections.

## Prerequisites
- Ensure you're in the correct directory: `/Users/joshua/Minecraft Server/minecraft-fabric-server/dev-server`
- Verify the latest mod JAR is built and copied to the `mods/` directory
- Check that no other Java processes are running the fabric server

## Step-by-Step Process

### 1. Build the Mod
```bash
cd /Users/joshua/Minecraft Server/minecraft-fabric-server/greek-mythology-mod-dev
gradle build
```

### 2. Copy the JAR to Dev Server
```bash
cp build/libs/greek-mythology-1.0.67.jar ../dev-server/mods/
```

### 3. Navigate to Dev Server Directory
```bash
cd ../dev-server
```

### 4. Check for Running Processes
```bash
ps aux | grep java | grep fabric-server
```
If any processes are found, kill them:
```bash
kill [PID]
```

### 5. Start Server in Screen Session
```bash
screen -dmS dev-server java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui
```

### 6. Verify Server is Running
```bash
screen -list
```
Should show: `77681.dev-server (Detached)`

### 7. Check Server Logs
```bash
sleep 10 && tail -20 logs/latest.log
```

## Success Indicators
- No mixin errors in logs
- Server starts without "Failed to start the minecraft server" errors
- Player can connect successfully (e.g., "Kangarude joined the game")
- Server shows "Done (1.295s)! For help, type "help""

## Common Issues and Solutions

### Mixin Errors
**Problem**: `Critical injection failure: @Inject annotation on greekmyth$modifyWaterCollision could not find any targets matching 'getCollisionShape'`

**Solution**: 
- Revert to velocity-based water walking approach in `PlayerEntityMixin.java`
- Use `@Mixin(PlayerEntity.class)` instead of `@Mixin(Block.class)`
- Inject into `tick` method instead of `getCollisionShape`

### Connection Refused
**Problem**: "Connection refused" when trying to connect

**Solution**:
- Check if server process is actually running: `ps aux | grep java`
- Verify no other processes are using port 25565
- Check server logs for startup errors

### Wrong JAR Version
**Problem**: Server loads old mod version

**Solution**:
- Verify JAR version: `unzip -p mods/greek-mythology-1.0.67.jar fabric.mod.json | grep version`
- Remove old JAR files from mods directory
- Ensure only one greek-mythology JAR exists

## File Locations
- **Mod Source**: `/Users/joshua/Minecraft Server/minecraft-fabric-server/greek-mythology-mod-dev/`
- **Dev Server**: `/Users/joshua/Minecraft Server/minecraft-fabric-server/dev-server/`
- **Server JAR**: `dev-server/fabric-server-launch.jar`
- **Mod JAR**: `dev-server/mods/greek-mythology-1.0.67.jar`
- **Logs**: `dev-server/logs/latest.log`

## Screen Session Management
- **List sessions**: `screen -list`
- **Attach to session**: `screen -r dev-server`
- **Detach from session**: `Ctrl+A, D`
- **Kill session**: `screen -S dev-server -X quit`

## Key Commands Summary
```bash
# Full startup sequence
cd /Users/joshua/Minecraft Server/minecraft-fabric-server/greek-mythology-mod-dev
gradle build
cp build/libs/greek-mythology-1.0.67.jar ../dev-server/mods/
cd ../dev-server
screen -dmS dev-server java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui
```

## Notes
- Always use screen sessions for background server operation
- The velocity-based water walking approach is stable and working
- Server typically takes 10-15 seconds to fully start
- Check logs immediately after startup to catch any errors
- Player connections confirm successful startup 