#!/bin/bash

echo "📊 Version Tracker - Greek Mythology Mod"
echo "========================================"

# Check if we're in the right directory
if [ ! -f "src/main/java/com/example/greekmyth/GreekMythologyMod.java" ]; then
    echo "❌ Error: GreekMythologyMod.java not found. Please run this script from the mod directory."
    exit 1
fi

# Extract version information
echo "🔍 Extracting version information..."
MOD_VERSION=$(grep 'MOD_VERSION' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
BUILD_TITLE=$(grep 'BUILD_VERSION_TITLE' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
BUILD_DATE=$(grep 'BUILD_DATE' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
BUILD_TIME=$(grep 'BUILD_TIME' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
BUILD_FEATURES=$(grep 'BUILD_FEATURES' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)

echo ""
echo "📋 Current Version Information:"
echo "   Version: $MOD_VERSION"
echo "   Title: $BUILD_TITLE"
echo "   Date: $BUILD_DATE"
echo "   Time: $BUILD_TIME"
echo ""
echo "🔧 Build Features:"
echo "   $BUILD_FEATURES"

# Check for existing versions
echo ""
echo "📁 Existing Version Files:"
if [ -d "../mods" ]; then
    echo "   Mods directory:"
    ls -la ../mods/greek-mythology-*.jar 2>/dev/null | while read line; do
        echo "     $line"
    done
fi

if [ -d "backup" ]; then
    echo "   Backup directory:"
    ls -la backup/greek-mythology-*.jar 2>/dev/null | while read line; do
        echo "     $line"
    done
fi

# Check git status
echo ""
echo "📝 Git Status:"
git status --porcelain | head -10

# Show recent commits
echo ""
echo "📜 Recent Commits:"
git log --oneline -5

echo ""
echo "💡 Version Management Tips:"
echo "   - Use 1.0.142 for major features"
echo "   - Use 1.0.142a for quick fixes"
echo "   - Use 1.0.142-TEST for testing versions"
echo "   - Use 1.0.142-WORKING for verified working versions" 