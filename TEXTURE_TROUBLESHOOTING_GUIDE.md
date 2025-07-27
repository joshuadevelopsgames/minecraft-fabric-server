# 🎨 MINECRAFT FABRIC MOD TEXTURE TROUBLESHOOTING GUIDE
*Based on Hades Scythe Debugging Experience - July 27, 2025*

---

## 🚨 **SYMPTOMS OF TEXTURE ISSUES**

### **Purple/Black Block (Most Common)**
- Item appears as a purple and black checkerboard pattern
- Indicates Minecraft cannot find the texture file
- Usually means missing or incorrectly referenced texture

### **Missing Item**
- Item doesn't appear in inventory at all
- Could be registration issue or missing model file

### **Wrong Texture**
- Item shows a different texture than expected
- Usually means incorrect texture path or wrong model parent

---

## 🔍 **STEP-BY-STEP DEBUGGING CHECKLIST**

### **1. Verify File Structure (CRITICAL)**
```bash
# Check if all required files exist in JAR
jar tf build/libs/your-mod-version.jar | grep -E "(your_item_name)"

# Expected files for each item:
assets/modid/items/item_name.json          # ← REDIRECT FILE (CRITICAL!)
assets/modid/models/item/item_name.json    # ← MODEL FILE
assets/modid/textures/item/item_name.png   # ← TEXTURE FILE
```

### **2. Check Redirect File (MOST COMMON ISSUE)**
```json
// assets/modid/items/item_name.json
{
  "model": {
    "type": "model",
    "model": "modid:item/item_name"
  }
}
```
**⚠️ This file is often missing and causes purple/black blocks!**

### **3. Verify Model File**
```json
// assets/modid/models/item/item_name.json
{
  "parent": "item/generated",  // For 16x16 textures
  "textures": {
    "layer0": "modid:item/item_name"
  }
}
```

### **4. Check Texture Format**
```bash
# Verify texture properties
file assets/modid/textures/item/item_name.png

# Should show: PNG image data, 16 x 16, 8-bit/color RGBA, non-interlaced
```

### **5. Compare with Working Item**
```bash
# Compare your item structure with a working one
diff assets/modid/items/working_item.json assets/modid/items/your_item.json
diff assets/modid/models/item/working_item.json assets/modid/models/item/your_item.json
```

---

## 🛠️ **COMMON FIXES**

### **Fix 1: Missing Redirect File**
```bash
# Create the missing redirect file
mkdir -p src/main/resources/assets/modid/items/
cat > src/main/resources/assets/modid/items/item_name.json << 'EOF'
{
  "model": {
    "type": "model",
    "model": "modid:item/item_name"
  }
}
EOF
```

### **Fix 2: Wrong Model Parent**
```json
// For 16x16 textures
"parent": "item/generated"

// For 32x32+ textures (handheld items)
"parent": "item/handheld"
```

### **Fix 3: Incorrect Texture Path**
```json
// Correct format
"layer0": "modid:item/item_name"

// Wrong formats
"layer0": "item/item_name"           // Missing modid
"layer0": "modid:item/item_name.png" // Don't include .png
```

### **Fix 4: Version Mismatch**
```bash
# Check all version files
grep -r "version" build.gradle fabric.mod.json src/main/resources/fabric.mod.json

# All should match your target version
```

---

## 🔧 **DEBUGGING COMMANDS**

### **Check JAR Contents**
```bash
# List all files in mod JAR
jar tf build/libs/your-mod-version.jar | grep item_name

# Extract and inspect JAR contents
jar xf build/libs/your-mod-version.jar
ls -la assets/modid/
```

### **Verify Server Loading**
```bash
# Check server logs for item registration
ssh user@server "tail -f /path/to/logs/latest.log | grep -E '(Registered|constructor|item_name)'"
```

### **Compare Working vs Non-Working**
```bash
# Compare file structures
diff -r working_item_folder/ your_item_folder/

# Compare JAR contents
jar tf working_mod.jar | grep working_item > working.txt
jar tf your_mod.jar | grep your_item > your.txt
diff working.txt your.txt
```

---

## 📋 **COMPLETE WORKING EXAMPLE**

### **File Structure**
```
src/main/resources/
├── assets/
│   └── modid/
│       ├── items/
│       │   └── item_name.json          # ← REDIRECT
│       ├── models/
│       │   └── item/
│       │       └── item_name.json      # ← MODEL
│       └── textures/
│           └── item/
│               └── item_name.png       # ← TEXTURE
└── fabric.mod.json
```

### **Working Files**

**1. Redirect File (`items/item_name.json`)**
```json
{
  "model": {
    "type": "model",
    "model": "modid:item/item_name"
  }
}
```

**2. Model File (`models/item/item_name.json`)**
```json
{
  "parent": "item/generated",
  "textures": {
    "layer0": "modid:item/item_name"
  }
}
```

**3. Item Class**
```java
public class YourItem extends Item implements FabricItem {
    public YourItem(Item.Settings settings) {
        super(settings);
    }
}
```

**4. Registration**
```java
Item.Settings settings = new Item.Settings()
    .maxCount(1)
    .maxDamage(5)
    .fireproof()
    .rarity(Rarity.EPIC)
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, ITEM_ID));

ITEM = Registry.register(Registries.ITEM, ITEM_ID, new YourItem(settings));
```

**5. Language File**
```json
{
  "item.modid.item_name": "Your Item Name"
}
```

---

## 🚨 **CRITICAL CHECKLIST**

Before deploying any new item, verify:

- [ ] **Redirect file exists** (`assets/modid/items/item_name.json`)
- [ ] **Model file exists** (`assets/modid/models/item/item_name.json`)
- [ ] **Texture file exists** (`assets/modid/textures/item/item_name.png`)
- [ ] **Texture is 16x16 PNG** (for `item/generated` parent)
- [ ] **All version numbers match** (build.gradle, fabric.mod.json)
- [ ] **Item implements FabricItem** (for proper rendering)
- [ ] **Registration includes registryKey** (for proper identification)
- [ ] **Language entry exists** (for proper display name)

---

## 🔍 **ADVANCED DEBUGGING**

### **Texture Swap Test**
```bash
# Temporarily replace working texture with problematic one
cp problematic_texture.png working_texture.png
# If working item now shows problematic texture, texture file is fine
# If working item still shows correct texture, texture file is corrupted
```

### **Model Swap Test**
```bash
# Temporarily change model to use vanilla texture
# Change layer0 to "item/netherite_sword"
# If item shows netherite sword texture, model structure is correct
# If item still shows purple/black, model structure is wrong
```

### **JAR Verification**
```bash
# Verify JAR integrity
jar tf your-mod.jar | grep -c item_name
# Should return 3 (redirect + model + texture)

# Check for duplicate files
jar tf your-mod.jar | grep item_name | sort | uniq -d
# Should return nothing
```

---

## 📚 **RESOURCES**

### **Minecraft Texture Guidelines**
- **16x16**: Use `"parent": "item/generated"`
- **32x32+**: Use `"parent": "item/handheld"`
- **Format**: PNG, 8-bit RGBA, non-interlaced
- **Path**: Never include file extension in JSON

### **Fabric API Requirements**
- **Interface**: Implement `FabricItem` for custom items
- **Registration**: Include `registryKey` in Item.Settings
- **Version**: Ensure all version numbers match

### **Common Pitfalls**
1. **Missing redirect file** (most common cause of purple/black blocks)
2. **Wrong texture path** (missing modid or including .png)
3. **Version mismatch** (prevents mod from loading)
4. **Wrong model parent** (16x16 vs 32x32+ textures)
5. **Corrupted texture file** (use `file` command to verify)

---

## 🎯 **QUICK FIX SUMMARY**

**If item shows purple/black block:**
1. Check if redirect file exists
2. Verify texture path in model file
3. Ensure texture is correct format
4. Compare with working item structure

**If item doesn't appear:**
1. Check registration in logs
2. Verify all files are in JAR
3. Check version numbers match
4. Ensure class implements FabricItem

---

*This guide is based on the successful debugging of the Hades Scythe texture issue. The missing redirect file was the root cause of the purple/black block problem.* 