#!/bin/bash

# Deploy to Both Environments Script
# Deploys changes to both development and production with standardized worlds

echo "🚀 Deploying to Both Environments"
echo "=================================="

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

# Deploy to production
echo ""
echo "🚀 Deploying to PRODUCTION server..."
cd ..

# Copy mod to production
cp greek-mythology-mod-dev/build/libs/greek-mythology-1.0.66.jar mods/

# Deploy to remote server
echo "Deploying to remote server..."
git add .
git commit -m "Deploy to both environments - $(date)"
git push

echo ""
echo "🎉 Deployment Complete!"
echo ""
echo "📋 Connection Details:"
echo "  Development: localhost:25565"
echo "  Production: 178.156.165.14:25565"
echo ""
echo "🌍 Both environments use standardized worlds:"
echo "  Template: world-template/"
echo "  Development: dev-server/world-dev/"
echo "  Production: world/"
echo ""
echo "✅ Changes deployed to both environments!" 