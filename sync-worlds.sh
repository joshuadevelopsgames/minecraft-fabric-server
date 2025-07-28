#!/bin/bash

# World Sync Script
# Syncs the template world to both development and production

echo "🔄 Syncing standardized worlds..."

# Sync to development
echo "📦 Syncing to development world..."
rm -rf dev-server/world-dev
cp -r world-template dev-server/world-dev
echo "✅ Development world synced"

# Sync to production
echo "📦 Syncing to production world..."
rm -rf world
cp -r world-template world
echo "✅ Production world synced"

echo "🎯 All worlds are now identical!"
echo "Development: dev-server/world-dev"
echo "Production: world"
