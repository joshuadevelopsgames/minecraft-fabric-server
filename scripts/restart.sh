#!/usr/bin/env bash
# Grace-restart Fabric server in a clean screen session
pkill -f "java.*server.jar" 2>/dev/null || true
sleep 3
screen -wipe >/dev/null 2>&1 || true
cd "$(dirname "$0")/.."  # move to the server root (parent dir of scripts)
screen -dmS minecraft java -Xmx3G -Xms3G -jar server.jar nogui
echo "🟢 Minecraft server restarted in screen 'minecraft'"
