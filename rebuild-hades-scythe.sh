#!/bin/bash

# Hades Scythe Quick Rebuild Script
# This script rebuilds and deploys the Hades Scythe to the development server

echo "🔮 Rebuilding Hades Scythe..."

# Step 1: Build the mod
echo "📦 Building mod..."
cd greek-mythology-mod-dev
gradle build

if [ $? -ne 0 ]; then
    echo "❌ Build failed!"
    exit 1
fi

# Step 2: Deploy to dev server
echo "🚀 Deploying to dev server..."
cp build/libs/greek-mythology-1.0.66.jar ../dev-server/mods/
cd ../dev-server

# Step 3: Restart dev server
echo "🔄 Restarting dev server..."
pkill -f "java.*fabric-server-launch"
sleep 2
screen -dmS dev-server java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui

# Step 4: Verify server is running
sleep 5
if screen -list | grep -q "dev-server"; then
    echo "✅ Hades Scythe successfully rebuilt and deployed!"
    echo "🎮 Connect to: localhost:25565"
    echo "📋 Commands:"
    echo "   /give @s greekmyth:hades_scythe"
    echo "   /give @s greekmyth:inferno_pearl"
else
    echo "❌ Server failed to start!"
    exit 1
fi 