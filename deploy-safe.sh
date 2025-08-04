#!/bin/bash

echo "🛡️ Safe Deployment - Greek Mythology Mod"
echo "========================================"

# Check if we're in the right directory
if [ ! -f "build.gradle" ]; then
    echo "❌ Error: build.gradle not found. Please run this script from the mod directory."
    exit 1
fi

# Get current version
VERSION=$(grep 'MOD_VERSION' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
TIMESTAMP=$(date +%Y%m%d-%H%M)

echo "📋 Current version: $VERSION"
echo "⏰ Timestamp: $TIMESTAMP"

# Step 1: Build the mod
echo ""
echo "🔨 Step 1: Building mod..."
./gradlew build

if [ $? -ne 0 ]; then
    echo "❌ Build failed! Aborting deployment."
    exit 1
fi

# Step 2: Create backup of current working version
echo ""
echo "💾 Step 2: Creating backup..."
mkdir -p backup
if [ -f "../mods/greek-mythology-*.jar" ]; then
    cp ../mods/greek-mythology-*.jar "backup/greek-mythology-BACKUP-${TIMESTAMP}.jar"
    echo "✅ Backup created"
else
    echo "⚠️ No existing mod found to backup"
fi

# Step 3: Create working version
echo ""
echo "📦 Step 3: Creating working version..."
WORKING_JAR="greek-mythology-${VERSION}-WORKING.jar"
cp build/libs/greek-mythology-*.jar "$WORKING_JAR"
echo "✅ Working version created: $WORKING_JAR"

# Step 4: Deploy to mods directory
echo ""
echo "🚀 Step 4: Deploying to mods directory..."
cp "$WORKING_JAR" "../mods/"
echo "✅ Deployed to mods directory"

# Step 5: Git operations
echo ""
echo "📝 Step 5: Git operations..."
git add .
git commit -m "Deploy: Version $VERSION - $(date +%Y-%m-%d_%H:%M)"
git push

if [ $? -eq 0 ]; then
    echo "✅ Git operations completed"
else
    echo "⚠️ Git operations failed, but deployment continued"
fi

# Step 6: Restart server
echo ""
echo "🔄 Step 6: Restarting remote server..."
cd ..
./scripts/restart.sh

if [ $? -eq 0 ]; then
    echo "✅ Server restart completed"
else
    echo "❌ Server restart failed"
    exit 1
fi

echo ""
echo "🎉 Deployment completed successfully!"
echo "📊 Version $VERSION is now live on the server"
echo "🔍 Use /greekversion in-game to verify"
echo ""
echo "📁 Files created:"
echo "   - $WORKING_JAR (working version)"
echo "   - backup/greek-mythology-BACKUP-${TIMESTAMP}.jar (backup)" 