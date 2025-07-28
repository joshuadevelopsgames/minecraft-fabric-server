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
