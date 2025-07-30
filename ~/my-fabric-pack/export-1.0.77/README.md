# Greek Mythology Mod - Version 1.0.77

## 🎉 MAJOR NEW FEATURE: Tartarus Dimension System

This version includes a complete custom dimension system with working jail functionality!

### 📦 Installation

1. **For Single Player:**
   - Place `greek-mythology-1.0.77.jar` in your `mods` folder
   - Ensure you have Fabric API installed
   - Start Minecraft with Fabric Loader 1.21.8

2. **For Server:**
   - Place `greek-mythology-1.0.77.jar` in your server's `mods` folder
   - Ensure you have Fabric API and Player Roles mod installed
   - Restart your server

### 🚀 New Features

#### Custom Tartarus Dimension
- **Void-like environment** with custom world generation
- **Custom biome and noise settings** for unique atmosphere
- **Accessible via `/visit tartarus`** command (Level 4+ admins)

#### Jail System in Tartarus
- **Jail cells** built in the Tartarus dimension
- **Admin room** with chest storage for player items
- **`/jail <player> <cell>`** command functionality

#### Dimension Infrastructure
- Custom dimension type: `greekmyth:tartarus`
- Custom noise settings: `greekmyth:tartarus_void`
- Custom biome: `greekmyth:tartarus_void`
- Proper dimension registration and loading

### 🎮 Commands

- **`/visit tartarus`** - Teleport to Tartarus dimension (Level 4+)
- **`/visit jail`** - Teleport to jail admin room in overworld
- **`/visit overworld`** - Return to overworld spawn

### 🌍 Dimension Features

- **Void-like environment** with minimal generation
- **No mob spawning** in Tartarus
- **Custom sky and lighting effects**
- **Proper coordinate scaling** and world limits

### ✅ Technical Improvements

- Imitated working pocket dimension mod structure
- Complete JSON-based dimension system
- Proper Fabric 1.21.8 dimension registration
- Server startup compatibility verified

### 🔧 Requirements

- **Minecraft:** 1.21.8
- **Fabric Loader:** 0.16.14+
- **Fabric API:** 0.129.0+
- **Player Roles:** 1.6.15+ (for server commands)

### 📝 Changelog

See `CHANGELOG-1.0.77.txt` for detailed changes.

---

**This version includes the complete working dimension system that has been tested and verified on the production server.** 