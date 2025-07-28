# 🚀 DEPLOYMENT TROUBLESHOOTING GUIDE
*How to fix deployment issues when GitHub Actions fails*

---

## 🚨 **COMMON DEPLOYMENT ISSUES**

### **Issue #1: GitHub Actions Deployment Fails**
**Symptoms**: 
- `deploy.sh` runs successfully but GitHub Actions shows "failure"
- Server doesn't get updated automatically
- SSH key authentication issues in GitHub

**Solution**: Use manual SSH deployment (see below)

### **Issue #2: SSH Password Prompts**
**Symptoms**:
- `ssh root@178.156.165.14` asks for password
- `scp` commands fail with authentication errors
- "Permission denied (publickey,password)"

**Solution**: Use SSH key authentication

### **Issue #3: Wrong Server JAR Name**
**Symptoms**:
- Server won't start
- "No such file or directory" errors
- Wrong jar name in restart commands

**Solution**: Use correct jar name (`fabric-server-launch.jar`)

---

## ✅ **CORRECT DEPLOYMENT PROCESS**

### **Step 1: Build the Mod**
```bash
cd greek-mythology-mod-dev
gradle build
```

### **Step 2: Deploy to Server (SSH Key Method)**
```bash
# Copy mod to server using SSH key
scp -i ~/.ssh/id_ed25519 "build/libs/greek-mythology-1.0.XX.jar" root@178.156.165.14:/root/minecraft/mods/

# Remove old versions
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft/mods && rm greek-mythology-OLD_VERSION.jar"
```

### **Step 3: Restart Server**
```bash
# Kill existing server
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && pkill -f 'java.*fabric-server-launch.jar' && sleep 3"

# Start server with correct jar name
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"
```

### **Step 4: Verify Deployment**
```bash
# Check server status
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && screen -ls"

# Check mod files
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft/mods && ls -la | grep greek"

# Check server logs
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && tail -20 logs/latest.log | grep -E '(Greek|Registered|Initialized)'"
```

---

## 🔑 **SSH KEY SETUP**

### **Required SSH Keys**
- **Primary**: `~/.ssh/id_ed25519` (works for this server)
- **Backup**: `~/.ssh/id_rsa` (if available)

### **SSH Key Authentication Commands**
```bash
# Always use -i flag to specify key
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14
scp -i ~/.ssh/id_ed25519 file.jar root@178.156.165.14:/path/
```

### **If SSH Keys Don't Work**
1. **Check key permissions**: `chmod 600 ~/.ssh/id_ed25519`
2. **Test connection**: `ssh -i ~/.ssh/id_ed25519 -o BatchMode=yes root@178.156.165.14`
3. **Fallback**: Use GitHub Actions (if configured properly)

---

## 🛠️ **TROUBLESHOOTING COMMANDS**

### **Check Server Status**
```bash
# Ping server
ping -c 3 178.156.165.14

# Check if server is running
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "ps aux | grep java | grep -v grep"

# Check screen sessions
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "screen -ls"
```

### **Check Server Files**
```bash
# List server jar files
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && ls -la *.jar"

# Check mod files
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft/mods && ls -la | grep greek"

# Check server logs
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && tail -f logs/latest.log"
```

### **Check GitHub Actions Status**
```bash
# Check latest workflow run
curl -s "https://api.github.com/repos/joshuadevelopsgames/minecraft-fabric-server/actions/runs?per_page=1" | grep -E '"status"|"conclusion"'
```

---

## 📋 **DEPLOYMENT CHECKLIST**

### **Before Deployment**
- [ ] Mod builds successfully (`gradle build`)
- [ ] Version numbers updated in all files
- [ ] Changelog updated
- [ ] Server is reachable (`ping 178.156.165.14`)

### **During Deployment**
- [ ] File transfer successful (`scp` command)
- [ ] Old versions removed from server
- [ ] Server restarted successfully
- [ ] Screen session created

### **After Deployment**
- [ ] Server logs show mod initialization
- [ ] No error messages in logs
- [ ] Mod commands work (`/help greekmyth`)
- [ ] New features testable in-game

---

## 🚨 **EMERGENCY PROCEDURES**

### **If Server Won't Start**
```bash
# Check what's running
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "ps aux | grep java"

# Kill all Java processes
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "pkill -f java"

# Check available jar files
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && ls -la *.jar"

# Start with correct jar
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"
```

### **If Mod Won't Load**
```bash
# Check mod file exists
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft/mods && ls -la | grep greek"

# Check server logs for errors
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft && tail -50 logs/latest.log | grep -i error"

# Verify mod file integrity
ssh -i ~/.ssh/id_ed25519 root@178.156.165.14 "cd /root/minecraft/mods && file greek-mythology-*.jar"
```

### **If SSH Connection Fails**
```bash
# Test SSH key
ssh -i ~/.ssh/id_ed25519 -o BatchMode=yes root@178.156.165.14

# Check key permissions
ls -la ~/.ssh/id_ed25519

# Try alternative key
ssh -i ~/.ssh/id_rsa root@178.156.165.14
```

---

## 📚 **REFERENCE INFORMATION**

### **Server Details**
- **IP**: 178.156.165.14:25565
- **SSH Key**: `~/.ssh/id_ed25519`
- **Server Directory**: `/root/minecraft`
- **Server JAR**: `fabric-server-launch.jar`
- **Memory**: `-Xmx3G -Xms3G`

### **Mod Details**
- **Build Directory**: `greek-mythology-mod-dev/build/libs/`
- **Server Mods**: `/root/minecraft/mods/`
- **Current Version**: 1.0.66 (Inferno Pearl)

### **GitHub Actions**
- **Repository**: `joshuadevelopsgames/minecraft-fabric-server`
- **Workflow**: `Deploy to Minecraft Server`
- **Status URL**: `https://github.com/joshuadevelopsgames/minecraft-fabric-server/actions`

---

## 🎯 **SUCCESS INDICATORS**

### **Deployment Successful When**
- ✅ File transfer completes without errors
- ✅ Server starts in screen session
- ✅ Logs show "Greek Mythology Favor System initialized successfully!"
- ✅ No error messages in server logs
- ✅ Players can connect and use mod features

### **Mod Working When**
- ✅ `/help greekmyth` command works
- ✅ All weapons function properly
- ✅ New features (Inferno Pearl) are available
- ✅ No crashes or errors in logs

---

## 📝 **NOTES**

- **Always use SSH key authentication** (`-i ~/.ssh/id_ed25519`)
- **Always use correct server jar name** (`fabric-server-launch.jar`)
- **Always clean old mod versions** before deploying new ones
- **Always check server logs** after deployment
- **GitHub Actions is backup method** - manual SSH is primary

---

**Last Updated**: July 27, 2025  
**Tested**: ✅ Working deployment method confirmed  
**Status**: ✅ All deployment issues resolved 