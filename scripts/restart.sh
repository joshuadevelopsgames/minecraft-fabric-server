#!/usr/bin/env bash
# Grace-restart Fabric server in a clean screen session
pkill -f "java.*fabric-server-launch.jar" 2>/dev/null || true
sleep 3
screen -wipe >/dev/null 2>&1 || true
cd ~/minecraft
screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui
echo "🟢 Minecraft server restarted in screen 'minecraft'"
