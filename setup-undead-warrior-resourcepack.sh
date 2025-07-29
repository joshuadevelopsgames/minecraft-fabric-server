#!/bin/bash

# Undead Warrior Resource Pack Setup Script
echo "🔮 Setting up Undead Warrior Resource Pack..."

# Check if we're in the right directory
if [ ! -d "undead-warrior-resourcepack" ]; then
    echo "❌ Error: undead-warrior-resourcepack directory not found!"
    echo "Please run this script from the minecraft-fabric-server directory."
    exit 1
fi

# Create the wolf texture directory if it doesn't exist
mkdir -p undead-warrior-resourcepack/assets/minecraft/textures/entity/wolf

echo "✅ Resource pack structure created!"
echo ""
echo "📋 Next Steps:"
echo "1. Get the wither skeleton texture from Minecraft:"
echo "   - Open Minecraft"
echo "   - Go to Resource Packs"
echo "   - Click 'Open resource pack folder'"
echo "   - Navigate to assets/minecraft/textures/entity/skeleton/"
echo "   - Copy wither_skeleton.png"
echo ""
echo "2. Place the texture in the resource pack:"
echo "   - Rename wither_skeleton.png to wolf.png"
echo "   - Copy it to: undead-warrior-resourcepack/assets/minecraft/textures/entity/wolf/wolf.png"
echo ""
echo "3. Create the resource pack zip:"
echo "   - Zip the entire undead-warrior-resourcepack folder"
echo "   - Rename it to undead-warrior-resourcepack.zip"
echo ""
echo "4. Install the resource pack:"
echo "   - Place the zip in your Minecraft resourcepacks folder"
echo "   - Enable it in Minecraft settings"
echo ""
echo "🎮 Then test it on your server with the Hades Scythe!"

# Check if wolf.png already exists
if [ -f "undead-warrior-resourcepack/assets/minecraft/textures/entity/wolf/wolf.png" ]; then
    echo ""
    echo "✅ wolf.png already exists! You can skip step 2."
fi 