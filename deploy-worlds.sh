#!/bin/bash

# Deploy Worlds Script
# Deploys standardized world files to both development and production

echo "🌍 Deploying Standardized Worlds"
echo "================================"

# Sync worlds to template first
echo "🔄 Syncing worlds to template..."
./sync-worlds.sh

# Deploy to development (already done by sync)
echo ""
echo "🏗️ Development world updated: dev-server/world-dev/"

# Deploy to production
echo ""
echo "🚀 Deploying world to production server..."

# Remove old world and create new directory
ssh root@178.156.165.14 "cd /root/minecraft && rm -rf world && mkdir -p world"

# Copy world files to remote server
echo "📦 Copying world files to remote server..."
scp -r world/* root@178.156.165.14:/root/minecraft/world/

# Restart remote server to load new world
echo "🔄 Restarting remote server..."
ssh root@178.156.165.14 "cd /root/minecraft && pkill -f 'java.*fabric' && sleep 2 && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"

echo ""
echo "🎉 World Deployment Complete!"
echo ""
echo "📋 World Locations:"
echo "  Template: world-template/"
echo "  Development: dev-server/world-dev/"
echo "  Production: /root/minecraft/world/ (remote)"
echo ""
echo "✅ All environments now have identical worlds!" 