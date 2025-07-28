#!/bin/bash

# Development Deployment Script
# This builds the mod and deploys it to the development server

echo "Building Greek Mythology mod for development..."

# Build the mod
cd ../greek-mythology-mod-dev
gradle build

if [ $? -eq 0 ]; then
    echo "Build successful! Deploying to development server..."
    
    # Copy the latest build to the dev server
    cp "build/libs/greek-mythology-1.0.66.jar" ../dev-server/mods/
    
    echo "✅ Mod deployed to development server!"
    echo "You can now test changes without affecting the main server."
    echo ""
    echo "To start the development server:"
    echo "  cd dev-server"
    echo "  ./start-dev-server.sh"
    echo ""
    echo "To connect to the dev server:"
    echo "  localhost:25565"
else
    echo "❌ Build failed! Check the errors above."
    exit 1
fi 