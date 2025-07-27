# 🏛️ GREEK MYTHOLOGY MOD - MASTER BACKUP & AI INSTRUCTIONS
*Complete Working State Backup - Version 1.0.62 with Hades' Scythe*

---

## 📋 **CRITICAL INFORMATION**

**Date**: July 26, 2025  
**Working Version**: 1.0.62  
**Status**: ✅ FULLY FUNCTIONAL  
**Server**: 178.156.165.14:25565  
**Minecraft Version**: 1.21.8 with Fabric

---

## 🎯 **WHAT'S WORKING PERFECTLY**

### ⚡ **LEGENDARY WEAPONS**
1. **Zeus's Lightning Bolt** - Lightning strikes, flight burst, weather affinity
2. **Poseidon's Trident** - Tidal waves, water projectiles, storm at sea
3. **Hades' Scythe** - Soul harvest, death mist, underworld portal

### 🏛️ **FAVOR SYSTEM**
- 12 Olympian gods with favor tracking
- 5 favor tiers (Hostile to Champion)
- Automatic favor decay and rewards

### 🎮 **COMMANDS**
- `/help greekmyth` - Comprehensive help
- `/favor` commands - Favor management
- `/gift` - Discreet item giving

---

## 📁 **EXACT FILE STRUCTURE**

### **Mod Source Code**
```
greek-mythology-mod-dev/
├── src/main/java/com/example/greekmyth/
│   ├── GreekMythologyMod.java (MAIN MOD FILE)
│   ├── item/
│   │   ├── ZeusBoltItem.java
│   │   ├── PoseidonTridentItem.java
│   │   ├── HadesScytheItem.java
│   │   └── GreekItems.java
│   ├── command/
│   │   ├── FavorCommands.java
│   │   └── DiscreetCommands.java
│   └── favor/ (favor system)
├── src/main/resources/
│   ├── assets/greekmyth/
│   │   ├── models/item/
│   │   │   ├── zeus_bolt.json
│   │   │   ├── poseidon_trident.json
│   │   │   └── hades_scythe.json
│   │   └── lang/en_us.json
│   └── data/greekmyth/gods/
│       ├── zeus.json
│       ├── poseidon.json
│       └── hades.json
├── build.gradle (VERSION: 1.0.62)
└── CHANGELOG.txt
```

### **Modpack Structure**
```
~/my-fabric-pack/
├── modrinth.index.json (WORKING MANIFEST)
├── overrides/
│   ├── mods/
│   │   └── greek-mythology-1.0.62.jar
│   └── pack.png
├── mods/ (packwiz files)
└── pack.toml
```

### **Server Files**
```
/root/minecraft/ (on server)
├── mods/greek-mythology-1.0.62.jar
├── fabric-server-launch.jar
└── server.properties
```

---

## 🔧 **CRITICAL CONFIGURATION VALUES**

### **Build Configuration**
```gradle
group = 'com.example.greekmyth'
archivesBaseName = 'greek-mythology'
version = '1.0.62'  // CRITICAL - MUST MATCH
```

### **Modpack Configuration**
```toml
name = "Greek Mythology Modpack"
version = "1.0.62"  // MUST MATCH MOD VERSION
pack-format = "packwiz:1.1.0"
```

### **Server Configuration**
- **IP**: 178.156.165.14:25565
- **Version**: Minecraft 1.21.8
- **Loader**: Fabric 0.16.14
- **Memory**: -Xmx3G -Xms3G

---

## 📋 **STEP-BY-STEP AI INSTRUCTIONS**

### **Phase 1: Mod Development**
1. **ALWAYS** work in `greek-mythology-mod-dev/` directory
2. **NEVER** change version numbers unless creating new version
3. **ALWAYS** update `CHANGELOG.txt` with detailed changes
4. **ALWAYS** test compilation with `gradle build`

### **Phase 2: Building & Deployment**
1. **Build mod**: `cd greek-mythology-mod-dev && gradle build`
2. **Copy to server**: `scp build/libs/greek-mythology-1.0.62.jar root@178.156.165.14:/root/minecraft/mods/`
3. **Remove old versions**: `ssh root@178.156.165.14 "rm /root/minecraft/mods/greek-mythology-*.jar"`
4. **Restart server**: Use the restart script or manual commands

### **Phase 3: Modpack Export**
1. **Update client mod**: `cp greek-mythology-mod-dev/build/libs/greek-mythology-1.0.62.jar ~/my-fabric-pack/mods/`
2. **Update pack.toml**: Change version to match mod version
3. **Use working structure**: 
   - `modrinth.index.json` at root (copy from working version)
   - `overrides/mods/greek-mythology-1.0.62.jar`
   - `overrides/pack.png`
4. **Create modpack**: `zip -r "Greek Mythology Modpack-1.0.62-[Feature].mrpack" modrinth.index.json overrides/`

---

## 🚨 **CRITICAL RULES FOR AI**

### **NEVER DO THESE THINGS**
- ❌ Change version numbers without updating ALL files
- ❌ Modify working weapon code without testing
- ❌ Remove the `modrinth.index.json` structure
- ❌ Add custom mods to the manifest (use overrides only)
- ❌ Change the server IP or basic configuration
- ❌ Modify the favor system without extensive testing

### **ALWAYS DO THESE THINGS**
- ✅ Test compilation before deployment
- ✅ Update changelog with every change
- ✅ Keep backup of working versions
- ✅ Use exact same modpack structure as 1.0.58
- ✅ Verify server logs after restart
- ✅ Check mod loading in server logs

---

## 🔄 **RESTORATION PROCEDURE**

### **If Mod Breaks**
1. **Restore from backup**: Copy working version files
2. **Rebuild**: `gradle build`
3. **Redeploy**: Follow deployment steps
4. **Verify**: Check server logs for mod loading

### **If Modpack Breaks**
1. **Use working structure**: Copy `modrinth.index.json` from 1.0.58
2. **Update overrides**: Put latest mod in `overrides/mods/`
3. **Recreate modpack**: Use zip command with working structure
4. **Test import**: Verify modpack opens in Modrinth

### **If Server Breaks**
1. **Check logs**: `tail -f /root/minecraft/logs/latest.log`
2. **Restart server**: Kill Java process and restart
3. **Verify mods**: Check for mod loading messages
4. **Test commands**: Try `/help greekmyth`

---

## 📊 **WORKING VERSION DETAILS**

### **Zeus Bolt (1.0.62)**
- Damage: 15.0 (netherite armor penetration)
- Charges: 5 with 30-second cooldown
- Weather affinity: Infinite during rain/thunder
- Abilities: Lightning strike, flight burst

### **Poseidon Trident (1.0.58)**
- Damage: 8.0
- Charges: 3 with 20-second cooldown
- Water affinity: Infinite near water
- Abilities: Tidal waves, water projectiles, storm at sea

### **Hades Scythe (1.0.62)**
- Damage: 16.0 (strongest weapon)
- Charges: 4 with 25-second cooldown
- Nether affinity: Infinite in Nether/near lava
- Abilities: Soul harvest, death mist, underworld portal

---

## 🎯 **NEXT DEVELOPMENT STEPS**

### **Safe Additions**
1. **New weapons**: Follow exact pattern of existing weapons
2. **New gods**: Add to favor system following existing structure
3. **New commands**: Add to command system
4. **Textures**: Add to assets folder

### **Advanced Features**
1. **Class system**: Build on favor system
2. **More abilities**: Extend existing weapons
3. **World generation**: Add Greek-themed structures
4. **Mobs**: Add mythological creatures

---

## 📞 **EMERGENCY CONTACTS**

### **Working Files to Reference**
- `greek-mythology-mod-dev/` - Complete source code
- `~/my-fabric-pack/` - Working modpack structure
- `GREEK_MYTHOLOGY_MOD_LORE.md` - Complete lore documentation
- `ZEUS_BOLT_WORKING_BACKUP.md` - Zeus Bolt specific backup

### **Server Commands**
```bash
# Restart server
ssh root@178.156.165.14 "cd /root/minecraft && pkill -f java && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"

# Check server status
ssh root@178.156.165.14 "cd /root/minecraft && screen -ls && tail -f logs/latest.log"
```

---

## 🏆 **SUCCESS METRICS**

### **Mod is Working When**
- ✅ Server starts without errors
- ✅ Mod loads: "Greek Mythology Favor System initialized successfully!"
- ✅ Commands work: `/help greekmyth` shows help
- ✅ Weapons function: All abilities work as described
- ✅ Modpack imports: Opens in Modrinth without errors

### **Everything is Perfect When**
- ✅ All 3 weapons work perfectly
- ✅ Favor system tracks all 12 gods
- ✅ Server runs stable 24/7
- ✅ Modpack installs cleanly
- ✅ Players can use all features

---

**🎯 This document preserves the EXACT working state of the Greek Mythology mod. Follow these instructions precisely to maintain or restore functionality.** 