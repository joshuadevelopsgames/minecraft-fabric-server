# Development Server Restart Guide

## 🚨 **IMPORTANT: Always Follow This Process**

This guide ensures the development server properly loads new code and avoids caching issues.

## 🔄 **Complete Restart Process**

### Step 1: Kill the Server Process
```bash
# Find the server process
ps aux | grep "fabric-server-launch.jar" | grep -v grep

# Kill the specific process (replace PID with actual process ID)
kill <PID>

# OR kill all fabric server processes
pkill -f "fabric-server-launch.jar"

# Verify it's stopped
ps aux | grep "fabric-server-launch.jar" | grep -v grep
# Should return nothing if properly killed
```

### Step 2: Copy New JAR File
```bash
# Copy the newly built jar to dev-server
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.68.jar mods/

# Verify the file was copied and check timestamp
ls -la mods/greek-mythology-1.0.68.jar
```

### Step 3: Start the Development Server in Screen Session
```bash
# Start the server in screen session (RECOMMENDED)
screen -dmS minecraft java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui

# OR use the automated restart script
./restart-dev-server.sh
```

### Step 4: Verify New Code is Loading
```bash
# Wait for server to start (15-20 seconds)
sleep 20

# Check logs for new timestamps
tail -10 logs/latest.log

# Look for new messages (not old cached ones)
grep -i "water\|walking\|strider" logs/latest.log | tail -5
```

## 🚫 **What NOT to Do**

- ❌ Don't just restart without killing the process first
- ❌ Don't assume the server will load new code automatically
- ❌ Don't skip checking process IDs
- ❌ Don't forget to verify the new jar file was copied
- ❌ Don't start the server without a screen session (it will stop when you close the terminal)

## 🔍 **Troubleshooting**

### If Server Won't Start
```bash
# Check if fabric-server-launch.jar exists
ls -la fabric-server-launch.jar

# If missing, copy from backup
cp ../dev-server/fabric-server-launch.jar .
```

### If Old Code Still Shows
```bash
# Check jar file timestamps
ls -la mods/greek-mythology-*.jar

# Check build timestamp
ls -la ../greek-mythology-mod-dev/build/libs/greek-mythology-*.jar

# If timestamps don't match, copy again
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.68.jar mods/
```

### If Process Won't Die
```bash
# Force kill
kill -9 <PID>

# Or kill all Java processes (be careful!)
pkill -f java
```

### If Server Stops When You Close Terminal
```bash
# Always use screen session
screen -dmS minecraft java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui

# Check if screen session is running
screen -list
```

## 📝 **Quick Reference Commands**

```bash
# Complete restart sequence
pkill -f "fabric-server-launch.jar"
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.68.jar mods/
screen -dmS minecraft java -Xmx2G -Xms1G -jar fabric-server-launch.jar nogui
sleep 20
tail -10 logs/latest.log
```

## 🎯 **Success Indicators**

- ✅ New timestamps in logs (not old cached timestamps)
- ✅ New log messages appear
- ✅ Server responds to new code changes
- ✅ No "STRIDER TICK TEST" messages (unless that's the new code)
- ✅ Server stays running in screen session

## 🔧 **Build Process**

Before restarting, always rebuild:
```bash
cd ../greek-mythology-mod-dev
../fabric-1.21.8/gradlew clean build
```

---

**Remember: The development server must be completely killed and restarted to load new code, and ALWAYS use a screen session!** 