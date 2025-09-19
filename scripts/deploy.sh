#!/usr/bin/env bash
# Automated deployment script for Greek Mythology mod
# This script builds the mod and deploys it to the remote server

echo "🚀 Starting automated deployment of Greek Mythology mod..."

# Check if we're in the right directory
if [ ! -f "greek-mythology-mod-dev/build.gradle" ]; then
    echo "❌ Error: This script must be run from the minecraft-fabric-server directory"
    echo "Current directory: $(pwd)"
    exit 1
fi

echo "📁 Building mod from greek-mythology-mod-dev directory..."

# Build the mod
cd greek-mythology-mod-dev
if ! ./gradlew build; then
    echo "❌ Build failed! Please check for compilation errors."
    exit 1
fi

# Check if build was successful
if [ ! -f "build/libs/greek-mythology-2.0.3.jar" ]; then
    echo "❌ Build artifact not found! Expected: build/libs/greek-mythology-2.0.3.jar"
    exit 1
fi

echo "✅ Build successful! Mod file size: $(ls -lh build/libs/greek-mythology-2.0.3.jar | awk '{print $5}')"

# Copy to local mods directory
echo "📋 Copying mod to local mods directory..."
cd ..
cp greek-mythology-mod-dev/build/libs/greek-mythology-2.0.3.jar mods/

# Copy to remote server
echo "🌐 Copying mod to remote server..."
scp greek-mythology-mod-dev/build/libs/greek-mythology-2.0.3.jar root@178.156.165.14:~/minecraft/mods/

if [ $? -eq 0 ]; then
    echo "✅ Mod copied to remote server successfully"
else
    echo "❌ Failed to copy mod to remote server"
    exit 1
fi

echo "🔄 Restarting remote server with new mod..."
# Run the restart script which now includes automatic cleanup
./scripts/restart.sh

echo "🎉 Deployment completed successfully!"
echo "📝 The server has been restarted with the new mod version"
echo "🔍 You can check the server logs to verify the new version is loaded"

