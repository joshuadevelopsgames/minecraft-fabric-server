#!/bin/bash

# Script to resize main menu images for Greek Mythology mod
# This script uses ImageMagick to resize images to the correct dimensions

echo "Resizing main menu images for AMBROSIA mod..."

# Check if ImageMagick is installed
if ! command -v convert &> /dev/null; then
    echo "Error: ImageMagick is not installed. Please install it first:"
    echo "  macOS: brew install imagemagick"
    echo "  Ubuntu: sudo apt-get install imagemagick"
    echo "  Windows: Download from https://imagemagick.org/"
    exit 1
fi

# Create the textures directory if it doesn't exist
mkdir -p src/main/resources/assets/greekmyth/textures/gui/title/

# Resize logo to 256x44 pixels (Minecraft logo dimensions)
if [ -f "../ambrosia_logo.png" ]; then
    echo "Resizing AMBROSIA logo to 256x44 pixels..."
    convert "../ambrosia_logo.png" -resize 256x44! "src/main/resources/assets/greekmyth/textures/gui/title/ambrosia_logo.png"
    echo "✅ Logo resized successfully!"
else
    echo "⚠️  ambrosia_logo.png not found in parent directory"
fi

# Resize background (can be larger, will be scaled by the game)
if [ -f "../ambrosia-background-small.png" ]; then
    echo "Copying background image..."
    cp "../ambrosia-background-small.png" "src/main/resources/assets/greekmyth/textures/gui/title/background.png"
    echo "✅ Background copied successfully!"
else
    echo "⚠️  ambrosia-background-small.png not found in parent directory"
fi

echo "Done! Images are ready for the mod."
echo ""
echo "To use larger images:"
echo "1. Place your larger logo file as 'ambrosia_logo.png' in the parent directory"
echo "2. Place your larger background as 'ambrosia-background-small.png' in the parent directory"
echo "3. Run this script again to resize them"
echo "4. Build the mod with: ./gradlew build" 