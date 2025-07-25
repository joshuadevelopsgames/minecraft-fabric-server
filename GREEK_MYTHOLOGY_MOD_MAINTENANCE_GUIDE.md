# 🏛️ GREEK MYTHOLOGY MOD MAINTENANCE GUIDE
*Comprehensive guide for mod development, server management, and deployment procedures*

---

## 📋 **TABLE OF CONTENTS**

1. [Server Management](#server-management)
2. [Mod Development Workflow](#mod-development-workflow)
3. [Bug Fixing Process](#bug-fixing-process)
4. [Deployment Procedures](#deployment-procedures)
5. [Common Issues & Solutions](#common-issues--solutions)
6. [Best Practices](#best-practices)

---

## 🖥️ **SERVER MANAGEMENT**

### **Connecting to Remote Server**
```bash
# SSH into the remote server
ssh root@178.156.165.14

# Navigate to server directory
cd /root/minecraft
```

### **Checking Server Status**
```bash
# Check if server is running
ps aux | grep java | grep -v grep

# Check screen sessions
screen -ls

# Check if port is listening
netstat -tlnp | grep 25565
```

### **Starting/Stopping Server**
```bash
# Stop server
pkill -f 'java.*fabric-server-launch.jar'
sleep 3
screen -wipe

# Start server
cd /root/minecraft
screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui
```

### **Checking Server Logs**
```bash
# View recent logs
tail -20 server.log

# Search for specific mod logs
tail -50 server.log | grep -i greek

# Check log file timestamps
ls -la *.log
```

---

## 🔧 **MOD DEVELOPMENT WORKFLOW**

### **Project Structure**
```
minecraft-fabric-server/
├── greek-mythology-mod-dev/          # Mod source code
│   ├── src/main/java/com/example/greekmyth/
│   ├── src/main/resources/
│   ├── build.gradle                  # Build configuration
│   └── CHANGELOG.txt                 # Version history
├── mods/                             # Compiled mods
└── deploy.sh                         # Deployment script
```

### **Building the Mod**
```bash
# Navigate to mod directory
cd greek-mythology-mod-dev

# Build the mod
gradle build

# Check build output
ls -la build/libs/
```

### **Version Management**
```bash
# Update version in build.gradle
version = '1.0.XX'

# Add changelog entry
# Update CHANGELOG.txt with new version details
```

---

## 🐛 **BUG FIXING PROCESS**

### **1. Identify the Problem**
- **User reports issue**: "Zeus Bolt charges don't reset after cooldown"
- **Understand the expected behavior**: Charges should reset to 5 after 30-second cooldown
- **Reproduce the issue**: Test the current functionality

### **2. Analyze the Code**
```bash
# Search for relevant code
codebase_search "Zeus"

# Read specific files
read_file target_file start_line end_line

# Understand the current logic
```

### **3. Identify the Root Cause**
- **Problem**: No logic to reset charges when cooldown expires
- **Current Logic**: Sets cooldown when charges depleted, but never resets charges
- **Missing Logic**: Check if cooldown expired and reset charges

### **4. Implement the Fix**
```java
// Add cooldown expiration check
if (currentDamage >= MAX_CHARGES && !isOnCooldown) {
    GreekMythologyMod.LOGGER.info("COOLDOWN EXPIRED: Resetting charges from {} to 0", currentDamage);
    stack.setDamage(0); // Reset to full charges
    currentDamage = 0;
}
```

### **5. Test the Fix**
```bash
# Build the mod
gradle build

# Check for compilation errors
# Verify build success
```

---

## 🚀 **DEPLOYMENT PROCEDURES**

### **1. Prepare the Mod**
```bash
# Build the mod
cd greek-mythology-mod-dev
gradle build

# Copy to mods directory
cp build/libs/greek-mythology-1.0.XX.jar ../mods/
```

### **2. Deploy to Remote Server**
```bash
# Option A: Use deployment script
./deploy.sh

# Option B: Manual deployment
scp mods/greek-mythology-1.0.XX.jar root@178.156.165.14:/root/minecraft/mods/
```

### **3. Update Remote Server**
```bash
# Remove old version
ssh root@178.156.165.14 "cd /root/minecraft/mods && rm greek-mythology-OLD_VERSION.jar"

# Verify new version
ssh root@178.156.165.14 "cd /root/minecraft/mods && ls -la | grep greek"
```

### **4. Restart Server**
```bash
# Stop server
ssh root@178.156.165.14 "pkill -f 'java.*fabric-server-launch.jar' && sleep 3"

# Start server
ssh root@178.156.165.14 "cd /root/minecraft && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"

# Verify server is running
ssh root@178.156.165.14 "screen -ls && ps aux | grep java | grep -v grep"
```

---

## ⚠️ **COMMON ISSUES & SOLUTIONS**

### **Server Won't Start**
```bash
# Check if port is already in use
netstat -tlnp | grep 25565

# Check server logs for errors
tail -50 server.log

# Verify Java process
ps aux | grep java
```

### **Mod Not Loading**
```bash
# Check mod file exists
ls -la mods/ | grep greek

# Check mod file permissions
ls -la mods/greek-mythology-*.jar

# Verify mod version compatibility
```

### **Build Failures**
```bash
# Check for compilation errors
gradle build --stacktrace

# Verify dependencies
cat build.gradle

# Check Java version compatibility
java -version
```

### **Import Errors**
```bash
# Check import statements
# Verify package structure
# Ensure all dependencies are included
```

---

## 📚 **BEST PRACTICES**

### **Code Changes**
1. **Always update version number** in `build.gradle`
2. **Add changelog entry** for every change
3. **Test compilation** before deployment
4. **Use descriptive commit messages**
5. **Add debug logging** for troubleshooting

### **Server Management**
1. **Always check server status** before making changes
2. **Backup important files** before major changes
3. **Use screen sessions** for persistent server processes
4. **Monitor server logs** after deployment
5. **Verify functionality** after updates

### **Deployment**
1. **Build locally first** to catch errors
2. **Remove old versions** to avoid conflicts
3. **Restart server** after mod updates
4. **Verify deployment** with status checks
5. **Document changes** in changelog

### **Debugging**
1. **Use comprehensive logging** for troubleshooting
2. **Check server logs** for error messages
3. **Verify file permissions** and ownership
4. **Test functionality** step by step
5. **Keep backup of working versions**

---

## 🔍 **USEFUL COMMANDS REFERENCE**

### **File Operations**
```bash
# Search for files
file_search "filename"

# Search for text in files
grep_search "search_term"

# Read file contents
read_file target_file start_line end_line

# Edit files
edit_file target_file instructions code_edit
```

### **Server Operations**
```bash
# Check server status
ssh root@178.156.165.14 "ps aux | grep java"

# View server logs
ssh root@178.156.165.14 "tail -20 /root/minecraft/server.log"

# Restart server
ssh root@178.156.165.14 "pkill -f 'java.*fabric-server-launch.jar' && sleep 3 && cd /root/minecraft && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"
```

### **Mod Operations**
```bash
# Build mod
cd greek-mythology-mod-dev && gradle build

# Copy to mods
cp build/libs/greek-mythology-*.jar ../mods/

# Deploy to server
scp mods/greek-mythology-*.jar root@178.156.165.14:/root/minecraft/mods/
```

---

## 📝 **CHANGELOG TEMPLATE**

```markdown
## Version X.X.X (YYYY-MM-DD)
### 🔧 **FIXES**
- **Issue Description**: What was broken
- **Fix Description**: How it was fixed
- **Technical Details**: Code-level changes

### 📝 **TECHNICAL CHANGES**
- **Files Modified**: List of changed files
- **API Changes**: Any API modifications
- **Version**: New version number
```

---

## 🎯 **WORKFLOW SUMMARY**

1. **Receive Issue Report** → Understand the problem
2. **Analyze Code** → Find relevant files and logic
3. **Identify Root Cause** → Determine what's wrong
4. **Implement Fix** → Make necessary code changes
5. **Test Locally** → Build and verify compilation
6. **Update Version** → Bump version number
7. **Add Changelog** → Document the changes
8. **Deploy to Server** → Copy files and restart
9. **Verify Deployment** → Check server status and logs
10. **Test Functionality** → Ensure fix works as expected

---

*This guide should be updated with new procedures and best practices as they are discovered.* 