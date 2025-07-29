# 🔧 Resource Pack Troubleshooting Guide

## 🚨 Issue: Wolves Still Look Like Dogs

### **Current Status:**
- ✅ **Custom entity created** (logs show "UNDEAD WARRIOR ENTITY: Created")
- ✅ **Sound overrides working** (logs show "UNDEAD WARRIOR SOUNDS: Registered")
- ❌ **Visual texture not applying** (wolves still look like dogs)

## 🔍 Troubleshooting Steps:

### **Step 1: Check Resource Pack Download**
1. **Connect to:** `localhost:25565`
2. **Look for resource pack prompt** when joining
3. **Accept the resource pack** if prompted
4. **Check Minecraft settings** → Resource Packs → Is it enabled?

### **Step 2: Manual Resource Pack Installation**
If the server resource pack isn't working:

1. **Download the resource pack manually:**
   - Go to: `dev-server/resource-packs/undead-warrior-resourcepack.zip`
   - Copy it to your Minecraft `resourcepacks` folder

2. **Enable it manually:**
   - Open Minecraft
   - Go to Resource Packs
   - Enable "undead-warrior-resourcepack"
   - Move it to the top of the list

### **Step 3: Test the Texture**
1. **Create a regular wolf** (not Undead Warrior)
2. **Check if it looks like wither skeleton**
3. **If yes:** Resource pack is working, issue is with custom entity
4. **If no:** Resource pack isn't loading properly

### **Step 4: Alternative Approach**
If resource pack still doesn't work:

1. **Use OptiFine CIT** (if you have OptiFine):
   - The CIT properties are already included
   - Should only affect wolves with "Undead Warrior" names

2. **Manual texture replacement:**
   - Find your Minecraft installation
   - Replace `assets/minecraft/textures/entity/wolf/wolf.png` with wither skeleton texture

## 🎯 Quick Test:

### **Test 1: Server Resource Pack**
1. Connect to server
2. Accept resource pack when prompted
3. Create Undead Warrior
4. Check if it looks like wither skeleton

### **Test 2: Manual Resource Pack**
1. Copy `undead-warrior-resourcepack.zip` to your resourcepacks folder
2. Enable it in Minecraft settings
3. Create Undead Warrior
4. Check if it looks like wither skeleton

### **Test 3: Sound Test**
1. Create Undead Warrior
2. Hit it or let it attack something
3. Should hear wither skeleton sounds (not dog barks)

## 🔧 Current Configuration:

### **Server Properties:**
```properties
require-resource-pack=false
resource-pack=undead-warrior-resourcepack.zip
resource-pack-id=undead-warrior-pack
resource-pack-prompt=§6Undead Warrior Resource Pack - Makes wolves look like wither skeletons!
resource-pack-sha1=56bf0af363f4f2694c7f55f9c0b8a917630c50e7
```

### **Resource Pack Contents:**
- `wolf.png` - Main wolf texture (wither skeleton)
- `wolf_tame.png` - Tamed wolf texture (wither skeleton)
- `wolf_angry.png` - Angry wolf texture (wither skeleton)
- `sounds.json` - Sound overrides (backup)

## 🚀 Next Steps:

1. **Try connecting again** and accept the resource pack
2. **If that doesn't work:** Install the resource pack manually
3. **If still doesn't work:** The issue might be with the custom entity not using the texture properly

The custom entity is working (sounds, behavior), but the visual texture replacement might need manual installation! 🎮✨ 