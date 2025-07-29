#!/bin/bash

# Deploy Preserving Builds Script
# Deploys mod changes while preserving player builds on the remote server

echo "🚀 Deploying Mods (Preserving Player Builds)"
echo "============================================="

# Build the mod
echo "📦 Building Greek Mythology mod..."
cd greek-mythology-mod-dev
gradle build

if [ $? -ne 0 ]; then
    echo "❌ Build failed! Check the errors above."
    exit 1
fi

echo "✅ Build successful!"

# Deploy to development
echo ""
echo "🏗️ Deploying to DEVELOPMENT environment..."
cd ../dev-server
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.66.jar mods/
echo "✅ Deployed to development server!"

# Deploy to production (preserving builds)
echo ""
echo "🚀 Deploying to PRODUCTION server (preserving builds)..."

# Copy mod to production
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.66.jar ../mods/

# Deploy to remote server
echo "Deploying to remote server..."
cd ..
git add .
git commit -m "Deploy mods preserving builds - $(date)"
git push

# Sync worlds preserving builds
echo ""
echo "🌍 Syncing worlds (preserving player builds)..."
./sync-worlds-preserve-builds.sh

echo ""
echo "🎉 Deployment Complete!"
echo ""
echo "📋 Connection Details:"
echo "  Development: localhost:25565"
echo "  Production: 178.156.165.14:25565"
echo ""
echo "✅ Mods updated, player builds preserved!" 