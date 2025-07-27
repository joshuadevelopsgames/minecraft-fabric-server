# 🚀 AI QUICK REFERENCE - GREEK MYTHOLOGY MOD
*For Immediate Use by Future AI Assistants*

---

## 🎯 **CURRENT WORKING STATE**
- **Version**: 1.0.62 ✅ WORKING
- **Server**: 178.156.165.14:25565 ✅ RUNNING
- **Status**: ALL WEAPONS FUNCTIONAL ✅

---

## 📋 **IMMEDIATE ACTIONS FOR AI**

### **Before Making ANY Changes:**
1. **READ**: `GREEK_MYTHOLOGY_MOD_MASTER_BACKUP.md` (complete instructions)
2. **CHECK**: Current working state with `/help greekmyth` on server
3. **BACKUP**: Current working files before modifications
4. **TEST**: Compilation with `gradle build` before deployment

### **If Asked to Add Features:**
1. **Follow exact patterns** from existing weapons (Zeus Bolt, Poseidon Trident, Hades Scythe)
2. **Update version** in ALL files (build.gradle, pack.toml, CHANGELOG.txt)
3. **Test thoroughly** before deployment
4. **Update changelog** with detailed changes

### **If Something Breaks:**
1. **Check server logs**: `ssh root@178.156.165.14 "tail -f /root/minecraft/logs/latest.log"`
2. **Restore from backup**: Use files from this working state
3. **Follow restoration procedure** in master backup document

---

## 🔧 **CRITICAL COMMANDS**

### **Build & Deploy:**
```bash
cd greek-mythology-mod-dev
gradle build
scp build/libs/greek-mythology-1.0.62.jar root@178.156.165.14:/root/minecraft/mods/
ssh root@178.156.165.14 "cd /root/minecraft && pkill -f java && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"
```

### **Export Modpack:**
```bash
cd ~/my-fabric-pack
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.62.jar overrides/mods/
zip -r "Greek Mythology Modpack-1.0.62-[Feature].mrpack" modrinth.index.json overrides/
```

### **Check Server Status:**
```bash
ssh root@178.156.165.14 "cd /root/minecraft && screen -ls && grep -i 'greek' logs/latest.log | tail -5"
```

---

## 🚨 **NEVER DO THESE**
- ❌ Change version without updating ALL files
- ❌ Modify working weapon code without testing
- ❌ Remove modrinth.index.json structure
- ❌ Add custom mods to manifest (use overrides only)

---

## ✅ **ALWAYS DO THESE**
- ✅ Test compilation before deployment
- ✅ Update changelog with every change
- ✅ Use exact same modpack structure as 1.0.58
- ✅ Verify server logs after restart
- ✅ Check mod loading in server logs

---

## 📞 **EMERGENCY CONTACTS**
- **Master Backup**: `GREEK_MYTHOLOGY_MOD_MASTER_BACKUP.md`
- **Lore Document**: `GREEK_MYTHOLOGY_MOD_LORE.md`
- **Zeus Backup**: `ZEUS_BOLT_WORKING_BACKUP.md`

---

**🎯 This is your safety net. Follow these instructions to maintain the perfect working state of the Greek Mythology mod.** 