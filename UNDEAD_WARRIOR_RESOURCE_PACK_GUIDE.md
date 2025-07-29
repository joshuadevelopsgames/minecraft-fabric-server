# Undead Warrior Resource Pack Guide

## 🎨 Making Your Undead Warrior Wolves Look Like Wither Skeletons

Since the mod is server-side, you'll need to create a client-side resource pack to make the wolves look like wither skeletons.

### 📁 Create This Folder Structure:

```
undead-warrior-resourcepack/
├── pack.mcmeta
└── assets/
    └── minecraft/
        └── textures/
            └── entity/
                └── wolf/
                    └── wolf_undead_warrior.png
```

### 📄 pack.mcmeta
```json
{
  "pack": {
    "pack_format": 22,
    "description": "Makes Undead Warrior wolves look like wither skeletons"
  }
}
```

### 🖼️ wolf_undead_warrior.png
- Copy the wither skeleton texture from Minecraft
- Save it as `wolf_undead_warrior.png` in the wolf textures folder
- This will make all wolves look like wither skeletons

### 🚀 Installation:
1. Create the folder structure above
2. Copy the wither skeleton texture to `wolf_undead_warrior.png`
3. Zip the `undead-warrior-resourcepack` folder
4. Rename the zip to `undead-warrior-resourcepack.zip`
5. Place it in your Minecraft `resourcepacks` folder
6. Enable it in Minecraft settings

### 🎯 Alternative: Use OptiFine CIT
If you have OptiFine installed, you can create a more specific texture:

Create: `assets/minecraft/optifine/cit/wolf_undead_warrior.properties`
```
type=entity
matchItems=wolf
nbt.display.Name=regex:.*Undead Warrior.*
model=wither_skeleton
```

This will only affect wolves with "Undead Warrior" in their name!

---

## 🔮 Current Undead Warrior Features:

### ✅ Working Features:
- **Pet Behavior:** Follows you, won't attack you, attacks enemies
- **Wither Skeleton Damage:** Applies wither effect (3 seconds) when attacking
- **Wither Skeleton Sounds:** Plays wither skeleton hurt sounds when attacking
- **Visual Effects:** Glowing aura (10 seconds)
- **Naming:** "[Owner]'s Undead Warrior" (golden)
- **Transformation:** Soul + smoke particles
- **Sound:** Wither ambient sound on creation

### 🎨 To Complete the Look:
- Add the resource pack above to make them look like wither skeletons
- The wolves will have all the pet behavior you want
- They'll look and sound like wither skeletons with the resource pack

---

## 🎮 Test Your Undead Warriors:

1. **Connect to:** `localhost:25565`
2. **Get the scythe:** `/give @s greekmyth:hades_scythe`
3. **Find a skeleton** and hit it with the scythe while it has wither effect
4. **Verify:** You should get a glowing wolf pet named "Undead Warrior"
5. **Add resource pack:** To make it look like a wither skeleton

The combination of the mod's pet behavior + resource pack visuals will give you the perfect undead warrior pets! 🔮✨ 