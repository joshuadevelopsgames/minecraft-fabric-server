#!/bin/bash

# Sync Worlds Preserving Builds Script
# Syncs world files from remote server to local dev, preserving player builds
# Mod files go from local dev to remote server

echo "🌍 Syncing Worlds (Preserving Player Builds)"
echo "============================================="

# Step 1: Backup current local dev world
echo "📦 Backing up current development world..."
if [ -d "dev-server/world-dev" ]; then
    cp -r dev-server/world-dev dev-server/world-dev-backup-$(date +%Y%m%d-%H%M%S)
    echo "✅ Development world backed up"
fi

# Step 2: Sync world files from remote to local dev
echo ""
echo "🔄 Syncing world files from remote server to development..."
ssh root@178.156.165.14 "cd /root/minecraft && tar -czf /tmp/world-backup.tar.gz world/"
scp root@178.156.165.14:/tmp/world-backup.tar.gz /tmp/
cd dev-server && tar -xzf /tmp/world-backup.tar.gz && rm /tmp/world-backup.tar.gz
cd ..
echo "✅ World files synced from remote to development"

# Step 3: Sync mod files from local dev to remote
echo ""
echo "🚀 Syncing mod files from development to remote server..."
scp greek-mythology-mod-dev/build/libs/greek-mythology-1.0.66.jar root@178.156.165.14:/root/minecraft/mods/
echo "✅ Mod files synced to remote server"

# Step 4: Restart remote server to load new mods
echo ""
echo "🔄 Restarting remote server to load new mods..."
ssh root@178.156.165.14 "cd /root/minecraft && pkill -f 'java.*fabric' && sleep 2 && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"

echo ""
echo "🎉 Sync Complete!"
echo ""
echo "📋 What Happened:"
echo "  ✅ World files: Remote → Development (preserved player builds)"
echo "  ✅ Mod files: Development → Remote (your latest changes)"
echo ""
echo "🌍 Result:"
echo "  Development: localhost:25565 (has remote world + your mods)"
echo "  Production: 178.156.165.14:25565 (has player builds + your mods)"
echo ""
echo "✅ Player builds are preserved, mods are updated!" 