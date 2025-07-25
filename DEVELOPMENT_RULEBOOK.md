# 🎯 DEVELOPMENT RULEBOOK
*Last Updated: July 23, 2025*

## 📋 **CORE PRINCIPLES**
1. **NEVER undo existing work** - Always build upon what's already working
   - **EXCEPTION**: Only when creating a new version or if user explicitly asks to change an old version
2. **ALWAYS verify current state** before making changes
3. **ONE source of truth** - No duplicate files or folders
4. **CLEAR communication** - Explain what I'm doing and why
5. **ALWAYS check with user before updating server or modpack**
6. **NEVER revert versions unless explicitly told** - Always opt for newest versions and keep moving forward

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
3. **Update Changelog**: Add entry to `greek-mythology-mod-dev/CHANGELOG.txt` for new version
4. **Deploy to Server**: `cp build/libs/greek-mythology-*.jar mods/`
5. **Update Modpack**: `cp build/libs/greek-mythology-*.jar ~/my-fabric-pack/mods/`
6. **Update Version**: Edit `greek-mythology-mod-dev/build.gradle` and `~/my-fabric-pack/pack.toml`
7. **Clean Old JARs**: Remove old versions from modpack before export
8. **Export Modpack**: `cd ~/my-fabric-pack && packwiz refresh && packwiz mr export && mv "Kangaroo Modpack-*.mrpack" "kangaroo-modpack-vX.X.X.mrpack"`
9. **Verify API Dependencies**: Ensure Fabric API is present in both server and client

### **Rule #3: Version Management**
- **Server**: Always use latest version from `greek-mythology-mod-dev/build/libs/`
- **Client**: Always match server version
- **Modpack**: Always export to `~/my-fabric-pack/kangaroo-modpack-vX.X.X.mrpack` (include version number)
- **Changelog**: Always create/update `CHANGELOG.txt` for each version with detailed changes

### **Rule #4: File Locations (NEVER CHANGE)**
- **Mod Source**: `greek-mythology-mod-dev/src/main/java/com/example/greekmyth/`
- **Mod Build**: `greek-mythology-mod-dev/build/libs/`
- **Server Mod**: `mods/greek-mythology-*.jar`
- **Client Mod**: `~/my-fabric-pack/mods/greek-mythology-*.jar`
- **Modpack**: `~/my-fabric-pack/kangaroo-modpack-vX.X.X.mrpack` (versioned filename)
- **Changelog**: `greek-mythology-mod-dev/CHANGELOG.txt`

---

## 🚫 **NEVER DO THESE**

### **File Management**
- ❌ Create duplicate `my-fabric-pack` folders
- ❌ Use local `server.jar` (it's vanilla, not Fabric)
- ❌ Delete existing working files without verification
- ❌ Change file locations without updating this rulebook
- ❌ Update server or modpack without user approval
- ❌ Keep multiple versions of the same mod in modpack (only keep latest version)

### **Server Management**
- ❌ Start local servers (use remote server only)
- ❌ Modify remote server files directly (except with express permission)
- ❌ Assume server state without checking

### **Version Management**
- ❌ Leave version mismatches between server and client
- ❌ Skip modpack export after mod updates
- ❌ Forget to update version numbers
- ❌ Revert to older versions unless explicitly told to do so
- ❌ Forget to update changelog for new versions
- ❌ Forget to include Fabric API dependencies on server
- ❌ Keep multiple versions of the same mod in modpack (only keep latest version)

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
4. ✅ **Clean old JARs** from modpack before export
5. ✅ Export updated modpack (after approval)
6. ✅ Verify no duplicate files created
7. ✅ **Remove old mod versions** from modpack (keep only latest)
8. ✅ Test functionality

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

# IMPORTANT: Clean up old mod versions BEFORE export (keep only latest)
cd ~/my-fabric-pack/mods && ls greek-mythology-*.jar | grep -v $(ls greek-mythology-*.jar | tail -1) | xargs rm -f

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

### **API Dependency Fix**
```bash
# Check if Fabric API is missing
ls -la mods/ | grep fabric-api

# Download and add Fabric API if missing
cd ~/my-fabric-pack/mods
curl -L "https://cdn.modrinth.com/data/P7dR8mSH/versions/X2hTodix/fabric-api-0.129.0%2B1.21.8.jar" -o "fabric-api-0.129.0+1.21.8.jar"
cp "fabric-api-0.129.0+1.21.8.jar" "/Users/joshua/Minecraft Server/minecraft-fabric-server/mods/"

# Update modpack
cd ~/my-fabric-pack && packwiz refresh && packwiz mr export
```

---

## 🔧 **TROUBLESHOOTING**

### **"Item id not set" Crash**
**Symptoms**: Mod crashes with `java.lang.NullPointerException: Item id not set`
**Cause**: Missing Fabric API dependency on server
**Solution**: 
1. Check if Fabric API is in server mods: `ls -la mods/ | grep fabric-api`
2. If missing, download and add Fabric API using the API Dependency Fix commands above
3. Ensure both server and client have matching Fabric API versions

### **Version Mismatch Issues**
**Symptoms**: Client can't connect or mods don't work
**Cause**: Server and client running different Minecraft/Fabric versions
**Solution**:
1. Check server version: `find . -name "server-*.jar"`
2. Check mod target version in `build.gradle`
3. Ensure both target the same Minecraft version

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
- **2025-07-23**: Added rule to never revert versions unless explicitly told - always opt for newest versions
- **2025-07-23**: Added changelog system requirement for tracking version changes
- **2025-07-23**: Added troubleshooting section with Fabric API dependency fix for "Item id not set" crashes
- **2025-01-27**: Added mandatory step to clean old JARs before modpack export to prevent multiple versions

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