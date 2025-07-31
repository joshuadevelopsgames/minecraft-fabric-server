#!/usr/bin/env bash
# Comprehensive restart script for remote Minecraft server at 178.156.165.14
echo "🔄 Restarting remote Minecraft server at 178.156.165.14..."

# SSH into remote server with comprehensive restart process
ssh root@178.156.165.14 "
  echo '=== STEP 1: Checking current processes ==='
  ps aux | grep -E '(java|minecraft|screen)' | grep -v grep || echo 'No processes found'
  
  echo '=== STEP 2: Killing all Java processes ==='
  pkill -9 java 2>/dev/null || true
  sleep 2
  
  echo '=== STEP 3: Killing all screen sessions ==='
  pkill -9 screen 2>/dev/null || true
  screen -wipe >/dev/null 2>&1 || true
  sleep 2
  
  echo '=== STEP 4: Force kill any remaining processes ==='
  # Get specific PIDs and kill them individually
  JAVA_PIDS=\$(ps aux | grep 'fabric-server-launch.jar' | grep -v grep | awk '{print \$2}')
  SCREEN_PIDS=\$(ps aux | grep 'SCREEN.*minecraft' | grep -v grep | awk '{print \$2}')
  
  for pid in \$JAVA_PIDS; do
    echo \"Force killing Java process: \$pid\"
    kill -9 \$pid 2>/dev/null || true
  done
  
  for pid in \$SCREEN_PIDS; do
    echo \"Force killing Screen process: \$pid\"
    kill -9 \$pid 2>/dev/null || true
  done
  
  sleep 3
  
  echo '=== STEP 5: Verifying all processes are dead ==='
  REMAINING=\$(ps aux | grep -E '(java.*fabric-server|SCREEN.*minecraft)' | grep -v grep)
  if [ -n \"\$REMAINING\" ]; then
    echo \"WARNING: Some processes still running:\"
    echo \"\$REMAINING\"
  else
    echo \"✅ All processes successfully killed\"
  fi
  
  echo '=== STEP 6: Starting new Minecraft server ==='
  cd ~/minecraft
  screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui
  sleep 5
  
  echo '=== STEP 7: Verifying new server started ==='
  NEW_PROCESSES=\$(ps aux | grep -E '(java|screen)' | grep -v grep)
  if [ -n \"\$NEW_PROCESSES\" ]; then
    echo \"✅ New processes started:\"
    echo \"\$NEW_PROCESSES\"
  else
    echo \"❌ ERROR: No new processes found!\"
    exit 1
  fi
  
  echo '=== RESTART COMPLETE ==='
"

echo "🟢 Remote Minecraft server (178.156.165.14) restart process completed!"
