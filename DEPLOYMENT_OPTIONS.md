# 🎯 DEPLOYMENT OPTIONS GUIDE

## **Two Different Deployment Strategies**

### **🏗️ Option 1: Fresh Worlds (Standardized)**
**Use when:** Testing new features, resetting worlds, or when you don't care about player builds

**Script:** `./deploy-both-environments.sh`

**What it does:**
- ✅ Syncs both worlds to template (identical worlds)
- ✅ Deploys mods to both environments
- ✅ Worlds are always identical
- ❌ **Overwrites player builds**

**When to use:**
- Testing new features
- After major world changes
- When you want identical testing environments
- Development phase

---

### **🚀 Option 2: Preserve Player Builds**
**Use when:** Players are building on the live server and you want to keep their work

**Script:** `./deploy-preserve-builds.sh`

**What it does:**
- ✅ **Preserves player builds** on remote server
- ✅ Syncs remote world → local dev (you get their builds)
- ✅ Syncs local mods → remote server (your changes)
- ✅ Bidirectional sync

**When to use:**
- Live server with active players
- When players have built things you want to keep
- Regular mod updates
- Production deployment

---

## **📋 Quick Reference**

| Scenario | Use This Script | Result |
|----------|----------------|--------|
| **Testing new features** | `./deploy-both-environments.sh` | Identical worlds, fresh start |
| **Live server with players** | `./deploy-preserve-builds.sh` | Keep player builds, update mods |
| **Reset everything** | `./sync-worlds.sh` | Both worlds reset to template |
| **Just sync worlds** | `./sync-worlds-preserve-builds.sh` | Remote → Dev world, Dev → Remote mods |

---

## **🔄 Workflow Examples**

### **Development Phase (No Players):**
```bash
# 1. Develop features locally
cd dev-server && ./quick-dev.sh

# 2. Deploy with fresh worlds
./deploy-both-environments.sh

# 3. Test on both environments
# Both have identical worlds
```

### **Live Server Phase (With Players):**
```bash
# 1. Develop features locally
cd dev-server && ./quick-dev.sh

# 2. Deploy preserving builds
./deploy-preserve-builds.sh

# 3. Test on dev, players keep builds on live
# Dev gets player builds, live gets your mods
```

---

## **💡 Communication Examples**

### **For Fresh Worlds:**
> "Deploy with fresh worlds" or "Reset and deploy"

### **For Preserving Builds:**
> "Deploy preserving builds" or "Update mods but keep player builds"

---

## **🎯 Benefits of Each**

### **Fresh Worlds:**
- ✅ Predictable testing environment
- ✅ No world drift
- ✅ Easy debugging
- ✅ Identical behavior

### **Preserve Builds:**
- ✅ Players don't lose work
- ✅ Live server stays active
- ✅ You can test with real player builds
- ✅ Production-safe deployment

---

## **🚨 Important Notes**

- **Fresh Worlds**: Will kick all players and reset everything
- **Preserve Builds**: Keeps player work but may have slight differences
- **Always specify**: Which deployment method you want
- **Test first**: Use dev environment before production

---

## **📝 Recommended Workflow**

1. **Development**: Use fresh worlds for testing
2. **Pre-Launch**: Use fresh worlds for final testing
3. **Live Server**: Use preserve builds for updates
4. **Major Updates**: Consider fresh worlds if needed 