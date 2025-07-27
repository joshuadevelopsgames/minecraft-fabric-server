# 🤖 AI ASSISTANT PROMPT: Continue Hades Scythe Development

## 🎯 **YOUR MISSION**
You are continuing development of a **Minecraft Fabric mod** called **Greek Mythology**. The user wants to continue working specifically on **Hades' Scythe** - a legendary weapon that's already partially implemented but needs refinement and testing.

## 📋 **CRITICAL CONTEXT**

### **Project Overview:**
- **Mod Name**: Greek Mythology (Fabric)
- **Current Version**: 1.0.62
- **Minecraft Version**: 1.21.8
- **Server**: Remote Fabric server at 178.156.165.14:25565
- **Working State**: All 3 legendary weapons functional (Zeus Bolt, Poseidon Trident, Hades Scythe)

### **Current Hades Scythe Status:**
- ✅ **Implemented**: Soul Harvest, Death Mist, Underworld Portal abilities
- ✅ **Implemented**: 16.0 damage with Wither effect on melee hits
- ✅ **Implemented**: 4 charges with 25-second cooldown
- ✅ **Implemented**: Infinite abilities in Nether/near lava
- ✅ **Implemented**: Netherite hoe texture, proper registration
- ❓ **Needs Work**: User wants to continue development/refinement

## 🗂️ **FILE STRUCTURE (CRITICAL)**

```
/Users/joshua/Minecraft Server/minecraft-fabric-server/
├── greek-mythology-mod-dev/                    # MOD SOURCE CODE
│   ├── src/main/java/com/example/greekmyth/
│   │   ├── item/
│   │   │   ├── HadesScytheItem.java           # HADES SCYTHE CODE
│   │   │   ├── ZeusBoltItem.java              # Working Zeus Bolt
│   │   │   ├── PoseidonTridentItem.java       # Working Poseidon Trident
│   │   │   └── GreekItems.java                # Item registration
│   │   ├── command/
│   │   │   └── DiscreetCommands.java          # /gift command
│   │   └── GreekMythologyMod.java             # Main mod class
│   ├── build.gradle                           # Version 1.0.62
│   └── CHANGELOG.txt                          # Development history
├── ~/my-fabric-pack/                          # CLIENT MODPACK
│   ├── mods/greek-mythology-1.0.62.jar        # Client mod
│   └── pack.toml                              # Modpack config
├── GREEK_MYTHOLOGY_MOD_MASTER_BACKUP.md       # Complete backup guide
├── AI_QUICK_REFERENCE.md                      # Quick AI reference
└── DEVELOPMENT_RULEBOOK.md                    # Development rules
```

## ⚡ **HADES SCYTHE CURRENT ABILITIES**

### **Core Mechanics:**
- **Soul Harvest**: Right-click while looking at target area → harvests souls, applies Wither III + damage
- **Death Mist**: Right-click in open air → creates expanding death mist, withers + slows enemies  
- **Underworld Portal**: Shift + right-click → portal effects, night vision + glowing
- **Nether Affinity**: Infinite abilities when in Nether or near lava (8-block radius)
- **Enhanced Damage**: 16.0 damage with Wither effect on melee hits

### **Technical Details:**
- **Charges**: 4 maximum
- **Cooldown**: 25 seconds when all charges used
- **Detection**: Lava proximity detection for infinite abilities
- **Particles**: Soul fire flame, soul, smoke, portal effects
- **Sounds**: Wither and portal sounds

## 🚀 **DEVELOPMENT WORKFLOW**

### **1. ALWAYS Check Current State First:**
```bash
# Check if server is running
ssh root@178.156.165.14
ps aux | grep java
screen -ls

# Check current mod version
ls -la /root/minecraft/mods/ | grep greek
```

### **2. Development Process:**
```bash
# Navigate to mod directory
cd "/Users/joshua/Minecraft Server/minecraft-fabric-server/greek-mythology-mod-dev"

# Make changes to HadesScytheItem.java
# Update version in build.gradle (1.0.62 → 1.0.63)
# Update CHANGELOG.txt

# Build the mod
gradle build

# Deploy to server
./deploy.sh

# Update client modpack
cp build/libs/greek-mythology-1.0.63.jar ~/my-fabric-pack/mods/
rm ~/my-fabric-pack/mods/greek-mythology-1.0.62.jar

# Export modpack for user
cd ~/my-fabric-pack
zip -r "Greek Mythology Modpack-1.0.63-Hades-Scythe-Enhanced.mrpack" modrinth.index.json overrides/
```

### **3. Server Management:**
```bash
# Restart server (if needed)
ssh root@178.156.165.14
cd /root/minecraft
pkill java
screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui
```

## 📝 **CRITICAL RULES TO FOLLOW**

### **ALWAYS:**
- ✅ **Ask for permission** before making changes to server or modpack
- ✅ **Check current state** before making changes
- ✅ **Update version numbers** when making changes
- ✅ **Update changelog** with detailed descriptions
- ✅ **Test on remote server** (never local)
- ✅ **Export modpack** for user testing
- ✅ **Follow the rulebook** (DEVELOPMENT_RULEBOOK.md)

### **NEVER:**
- ❌ **Undo existing work** (unless creating new version)
- ❌ **Start local server** (always use remote)
- ❌ **Skip version updates** or changelog entries
- ❌ **Make changes without asking** user first

## 🎮 **TESTING PROTOCOL**

### **For Hades Scythe Testing:**
1. **Deploy new version** to server
2. **Export modpack** for user
3. **User tests in game**:
   - Soul Harvest on entities
   - Death Mist in open areas
   - Underworld Portal effects
   - Nether/lava infinite abilities
   - Melee damage vs armored players
4. **Gather feedback** and iterate

## 📚 **REFERENCE DOCUMENTS**

### **Essential Files to Read:**
- `GREEK_MYTHOLOGY_MOD_MASTER_BACKUP.md` - Complete system backup
- `AI_QUICK_REFERENCE.md` - Quick commands and procedures
- `DEVELOPMENT_RULEBOOK.md` - Development workflow rules
- `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/item/HadesScytheItem.java` - Current Hades Scythe code
- `greek-mythology-mod-dev/CHANGELOG.txt` - Development history

## 🎯 **SPECIFIC TASKS FOR HADES SCYTHE**

### **Potential Improvements:**
- **Visual Effects**: Enhanced particle systems
- **Sound Design**: More atmospheric underworld sounds
- **Balance**: Adjust damage, cooldown, or charge system
- **New Abilities**: Additional underworld-themed powers
- **Integration**: Better interaction with other mods
- **Performance**: Optimize particle effects and calculations

### **Bug Fixes:**
- **Cooldown Issues**: Ensure proper charge reset
- **Particle Performance**: Optimize for server performance
- **Compatibility**: Ensure works with other mods
- **Balance**: Adjust damage for PvP balance

## 🔧 **TECHNICAL KNOWLEDGE NEEDED**

### **Minecraft Fabric Modding:**
- **Item Implementation**: Custom item classes and registration
- **Particle Systems**: Particle spawning and effects
- **Sound Systems**: Sound event handling
- **Entity Interaction**: Damage, status effects, entity detection
- **World Interaction**: Block detection, fluid detection
- **Cooldown Systems**: Item cooldown management

### **Server Management:**
- **SSH Commands**: Remote server access and management
- **Screen Sessions**: Process management
- **File Operations**: Copy, move, delete operations
- **Mod Deployment**: Build and deploy process

## 🎮 **USER EXPECTATIONS**

### **The User Wants:**
- **Functional Hades Scythe** that works reliably
- **Balanced gameplay** that's fun but not overpowered
- **Atmospheric effects** that feel underworld-themed
- **Smooth performance** without lag or issues
- **Easy testing** via modpack exports
- **Clear communication** about what's being changed

### **Communication Style:**
- **Ask before making changes**
- **Explain what you're doing**
- **Provide clear instructions**
- **Respond to feedback quickly**
- **Keep user informed of progress**

---

## 🚀 **STARTING POINT**

**Begin by reading these files:**
1. `GREEK_MYTHOLOGY_MOD_MASTER_BACKUP.md` - Understand the complete system
2. `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/item/HadesScytheItem.java` - Current Hades Scythe implementation
3. `DEVELOPMENT_RULEBOOK.md` - Follow the established workflow

**Then ask the user:**
"What specific aspect of the Hades Scythe would you like to work on? Are there any issues you've noticed, or new features you'd like to add?"

**Remember:** You're continuing development of a working system. The Hades Scythe is functional but needs refinement. Focus on improving what exists rather than rebuilding from scratch. 