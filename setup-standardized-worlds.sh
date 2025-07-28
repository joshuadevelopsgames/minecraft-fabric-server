#!/bin/bash

# Standardized World Setup Script
# Creates identical worlds for development and production

echo "🌍 Setting up standardized worlds..."
echo "====================================="

# Create backup of current world
echo "📦 Creating backup of current world..."
if [ -d "world" ]; then
    cp -r world world-backup-$(date +%Y%m%d-%H%M%S)
    echo "✅ Backup created: world-backup-$(date +%Y%m%d-%H%M%S)"
fi

# Create fresh world template
echo ""
echo "🏗️ Creating fresh world template..."

# Start server briefly to generate a new world
echo "Starting server to generate fresh world..."
java -Xmx2G -Xms1G \
    -cp "libraries/net/fabricmc/fabric-loader/0.16.14/fabric-loader-0.16.14.jar:versions/1.21.8/server-1.21.8.jar" \
    net.fabricmc.loader.launch.server.FabricServerLauncher \
    nogui &
SERVER_PID=$!

# Wait for world generation
echo "Waiting for world generation..."
sleep 30

# Stop the server
echo "Stopping server..."
kill $SERVER_PID
wait $SERVER_PID 2>/dev/null

# Create standardized world structure
echo ""
echo "📁 Setting up standardized world structure..."

# Create world-template directory
mkdir -p world-template

# Copy the fresh world to template
if [ -d "world" ]; then
    cp -r world/* world-template/
    echo "✅ Fresh world copied to template"
else
    echo "❌ No world generated. Creating minimal template..."
    mkdir -p world-template/data
    mkdir -p world-template/datapacks
    mkdir -p world-template/playerdata
    mkdir -p world-template/poi
    mkdir -p world-template/region
fi

# Create standardized world for development
echo ""
echo "🏗️ Setting up development world..."
if [ -d "dev-server/world-dev" ]; then
    rm -rf dev-server/world-dev
fi
cp -r world-template dev-server/world-dev
echo "✅ Development world created: dev-server/world-dev"

# Create standardized world for production
echo ""
echo "🚀 Setting up production world..."
if [ -d "world" ]; then
    rm -rf world
fi
cp -r world-template world
echo "✅ Production world created: world"

# Create world management scripts
echo ""
echo "📝 Creating world management scripts..."

# Create world sync script
cat > sync-worlds.sh << 'EOF'
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
EOF

chmod +x sync-worlds.sh

# Create world backup script
cat > backup-worlds.sh << 'EOF'
#!/bin/bash

# World Backup Script
# Creates backups of current worlds

echo "💾 Creating world backups..."

# Backup development world
if [ -d "dev-server/world-dev" ]; then
    cp -r dev-server/world-dev world-dev-backup-$(date +%Y%m%d-%H%M%S)
    echo "✅ Development world backed up"
fi

# Backup production world
if [ -d "world" ]; then
    cp -r world world-backup-$(date +%Y%m%d-%H%M%S)
    echo "✅ Production world backed up"
fi

echo "📦 All backups created!"
EOF

chmod +x backup-worlds.sh

echo ""
echo "🎉 Standardized world setup complete!"
echo ""
echo "📁 World Structure:"
echo "  Template: world-template/"
echo "  Development: dev-server/world-dev/"
echo "  Production: world/"
echo ""
echo "🔄 Management Commands:"
echo "  ./sync-worlds.sh    - Sync all worlds to template"
echo "  ./backup-worlds.sh  - Backup current worlds"
echo ""
echo "✅ Both development and production now use identical worlds!" 