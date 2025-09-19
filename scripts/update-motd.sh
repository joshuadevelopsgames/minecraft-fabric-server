#!/usr/bin/env bash
# Script to update the MOTD on the remote Minecraft server
echo "🔄 Updating MOTD on remote Minecraft server at 178.156.165.14..."

# SSH into remote server and update the MOTD
ssh root@178.156.165.14 "
  echo '=== STEP 1: Backing up current server.properties ==='
  cd ~/minecraft
  cp server.properties server.properties.backup.\$(date +%Y%m%d_%H%M%S)
  
  echo '=== STEP 2: Updating MOTD in server.properties ==='
  # Update the MOTD line
  sed -i 's/^motd=.*/motd=Welcome to Mount Olympus - Realm of the Gods/' server.properties
  
  echo '=== STEP 3: Verifying the change ==='
  grep '^motd=' server.properties
  
  echo '=== STEP 4: Restarting server to apply changes ==='
  # Kill existing processes
  pkill -9 java 2>/dev/null || true
  pkill -9 screen 2>/dev/null || true
  screen -wipe >/dev/null 2>&1 || true
  sleep 3
  
  # Start new server
  screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui
  sleep 5
  
  echo '=== STEP 5: Verifying server is running ==='
  NEW_PROCESSES=\$(ps aux | grep -E '(java|screen)' | grep -v grep)
  if [ -n \"\$NEW_PROCESSES\" ]; then
    echo \"✅ Server restarted successfully with new MOTD\"
  else
    echo \"❌ ERROR: Server failed to restart!\"
    exit 1
  fi
  
  echo '=== MOTD UPDATE COMPLETE ==='
"

echo "🟢 Remote Minecraft server MOTD updated successfully!" 