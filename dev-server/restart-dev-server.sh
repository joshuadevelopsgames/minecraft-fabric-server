#!/bin/bash

# Development Server Restart Script
# This script properly kills and restarts the development server with new code

echo "🔄 Development Server Restart Script"
echo "=================================="

# Step 1: Kill the server process
echo "📋 Step 1: Killing server process..."
pkill -f "fabric-server-launch.jar"

# Wait a moment for process to die
sleep 3

# Verify it's stopped
if ps aux | grep "fabric-server-launch.jar" | grep -v grep > /dev/null; then
    echo "❌ Server process still running, force killing..."
    pkill -9 -f "fabric-server-launch.jar"
    sleep 2
fi

# Step 2: Copy new JAR file
echo "📋 Step 2: Copying new JAR file..."
if [ -f "../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.69.jar" ]; then
    cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.69.jar mods/
    echo "✅ JAR file copied successfully"
else
    echo "❌ JAR file not found! Please build the mod first:"
    echo "   cd ../greek-mythology-mod-dev && ../fabric-1.21.8/gradlew clean build"
    exit 1
fi

# Step 3: Start the server in screen session
echo "📋 Step 3: Starting development server in screen session..."
screen -dmS minecraft java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui

# Step 4: Wait and verify
echo "📋 Step 4: Waiting for server to start..."
sleep 20

echo "📋 Step 5: Checking server status..."
if ps aux | grep "fabric-server-launch.jar" | grep -v grep > /dev/null; then
    echo "✅ Server is running"
    echo "📋 Recent log entries:"
    tail -5 logs/latest.log
else
    echo "❌ Server failed to start"
    echo "📋 Checking for errors..."
    tail -10 logs/latest.log
    exit 1
fi

echo "🎉 Development server restart complete!"
echo "🌐 Server should be available at localhost:25565" 