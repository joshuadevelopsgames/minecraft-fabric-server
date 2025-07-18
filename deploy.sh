#!/bin/bash

# Minecraft Server Deployment Script
echo "🚀 Starting Minecraft server deployment..."

# Check if we're in the right directory
if [ ! -f "server.properties" ]; then
    echo "❌ Error: Not in Minecraft server directory"
    exit 1
fi

# Add all changes
echo "📦 Adding changes to Git..."
git add .

# Commit changes
echo "💾 Committing changes..."
git commit -m "Auto-deploy: $(date)"

# Push to GitHub
echo "⬆️ Pushing to GitHub..."
git push origin master

echo "✅ Deployment initiated! GitHub Actions will update your server automatically."
echo "📊 Check deployment status at: https://github.com/joshuadevelopsgames/minecraft-fabric-server/actions" 