# 🎯 DEVELOPMENT RULEBOOK
*Last Updated: July 23, 2025*

## 📋 **CORE PRINCIPLES**
1. **NEVER undo existing work** - Always build upon what's already working
   - **EXCEPTION**: Only when creating a new version or if user explicitly asks to change an old version
2. **ALWAYS verify current state** before making changes
3. **ONE source of truth** - No duplicate files or folders
4. **CLEAR communication** - Explain what I'm doing and why
5. **ALWAYS check with user before updating server or modpack**

---

## 🏗️ **PROJECT STRUCTURE**

### **Remote Server**
- **IP**: `178.156.165.14:25565`
- **Type**: Fabric server (ONLY active server)
- **Purpose**: Production server for testing mods

### **Local Development**
- **Root Directory**: `/Users/joshua/Minecraft Server/minecraft-fabric-server/`
- **Mod Development**: `greek-mythology-mod-dev/`
- **Modpack**: `~/my-fabric-pack/` (ONLY modpack location)
- **Server Mods**: `mods/` (for local testing only)

---

## 🔄 **WORKFLOW RULES**

### **Rule #1: Always Check Current State First**
```bash
# Check what's currently running
ps aux | grep java | grep -v grep

# Check current mod versions
ls -la mods/ | grep greek
ls -la ~/my-fabric-pack/mods/ | grep greek

# Check modpack version
cat ~/my-fabric-pack/pack.toml | grep version
```

### **Rule #2: Mod Development Process**
1. **Edit**: `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/`
2. **Build**: `cd greek-mythology-mod-dev && gradle build`
3. **Deploy to Server**: `cp build/libs/greek-mythology-*.jar mods/`
4. **Update Modpack**: `cp build/libs/greek-mythology-*.jar ~/my-fabric-pack/mods/`
5. **Update Version**: Edit `greek-mythology-mod-dev/build.gradle` and `~/my-fabric-pack/pack.toml`
6. **Export Modpack**: `cd ~/my-fabric-pack && packwiz refresh && packwiz mr export`

### **Rule #3: Version Management**
- **Server**: Always use latest version from `greek-mythology-mod-dev/build/libs/`
- **Client**: Always match server version
- **Modpack**: Always export to `~/my-fabric-pack/kangaroo-modpack.mrpack`

### **Rule #4: File Locations (NEVER CHANGE)**
- **Mod Source**: `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/`
- **Mod Build**: `greek-mythology-mod-dev/build/libs/`
- **Server Mod**: `mods/greek-mythology-*.jar`
- **Client Mod**: `~/my-fabric-pack/mods/greek-mythology-*.jar`
- **Modpack**: `~/my-fabric-pack/kangaroo-modpack.mrpack`

---

## 🚫 **NEVER DO THESE**

### **File Management**
- ❌ Create duplicate `my-fabric-pack` folders
- ❌ Use local `server.jar` (it's vanilla, not Fabric)
- ❌ Delete existing working files without verification
- ❌ Change file locations without updating this rulebook
- ❌ Update server or modpack without user approval

### **Server Management**
- ❌ Start local servers (use remote server only)
- ❌ Modify remote server files directly (except with express permission)
- ❌ Assume server state without checking

### **Version Management**
- ❌ Leave version mismatches between server and client
- ❌ Skip modpack export after mod updates
- ❌ Forget to update version numbers

---

## ✅ **ALWAYS DO THESE**

### **Before Any Changes**
1. ✅ Check current mod versions
2. ✅ Verify remote server is accessible
3. ✅ Confirm file locations match rulebook
4. ✅ Check if changes are actually needed
5. ✅ Get express permission before modifying remote server files

### **After Any Changes**
1. ✅ Update version numbers
2. ✅ **ASK USER** before deploying to server or modpack
3. ✅ Deploy to both server and client (after approval)
4. ✅ Export updated modpack (after approval)
5. ✅ Verify no duplicate files created
6. ✅ Test functionality

### **Communication**
1. ✅ Explain what I'm doing
2. ✅ Show current state before changes
3. ✅ **ALWAYS ask before updating server or modpack**
4. ✅ Confirm changes with user before proceeding
5. ✅ Report results clearly

---

## 🔧 **COMMON COMMANDS**

### **Check Current State**
```bash
# Check running processes
ps aux | grep java | grep -v grep

# Check mod versions
ls -la mods/ | grep greek
ls -la ~/my-fabric-pack/mods/ | grep greek

# Check modpack version
cat ~/my-fabric-pack/pack.toml | grep version
```

### **Build and Deploy**
```bash
# Build mod
cd greek-mythology-mod-dev && gradle build

# Deploy to server
cp build/libs/greek-mythology-*.jar mods/

# Deploy to client
cp build/libs/greek-mythology-*.jar ~/my-fabric-pack/mods/

# Export modpack
cd ~/my-fabric-pack && packwiz refresh && packwiz mr export
mv "My Fabric Pack-*.mrpack" kangaroo-modpack.mrpack
```

### **Version Update**
```bash
# Update build.gradle
sed -i '' 's/version = ".*"/version = "NEW_VERSION"/' greek-mythology-mod-dev/build.gradle

# Update pack.toml
sed -i '' 's/version = ".*"/version = "NEW_VERSION"/' ~/my-fabric-pack/pack.toml
```

---

## 🎯 **TESTING CHECKLIST**

### **Before Testing**
- [ ] Server and client versions match
- [ ] Modpack is updated
- [ ] Remote server is accessible
- [ ] No duplicate files exist

### **During Testing**
- [ ] Check server logs for mod initialization
- [ ] Verify debug logging is working
- [ ] Test all mod features
- [ ] Confirm cooldown system works

### **After Testing**
- [ ] Report any issues found
- [ ] Document what works
- [ ] Update rulebook if needed

---

## 📝 **CHANGE LOG**
- **2025-07-23**: Created rulebook
- **2025-07-23**: Defined clear file locations and workflow
- **2025-07-23**: Established version management rules
- **2025-07-23**: Added user approval requirement for server/modpack updates
- **2025-07-23**: Clarified when work can be undone (new versions or explicit requests)
- **2025-07-23**: Added permission to modify remote server files with express permission

---

---

## 🔄 **HOW TO REFERENCE THIS RULEBOOK**

### **For AI Assistant:**
- **File Location**: `DEVELOPMENT_RULEBOOK.md` in project root
- **Always read this file first** before starting any development task
- **Follow the workflow rules exactly** as written
- **Check the "NEVER DO THESE" section** before making any changes
- **Use the "COMMON COMMANDS" section** for standard operations

### **For User:**
- **Reference**: "Check the rulebook" or "Follow the rulebook"
- **Quick Check**: "What does the rulebook say about [topic]?"
- **Workflow**: "Follow the workflow rules for [task]"

### **Quick Reference Commands:**
```bash
# Check current state (Rule #1)
ps aux | grep java | grep -v grep
ls -la mods/ | grep greek
ls -la ~/my-fabric-pack/mods/ | grep greek
cat ~/my-fabric-pack/pack.toml | grep version

# Build and deploy (Rule #2)
cd greek-mythology-mod-dev && gradle build
cp build/libs/greek-mythology-*.jar mods/
cp build/libs/greek-mythology-*.jar ~/my-fabric-pack/mods/
cd ~/my-fabric-pack && packwiz refresh && packwiz mr export
```

---

**Remember**: This rulebook is the source of truth. Always follow it exactly, and update it if changes are needed. 