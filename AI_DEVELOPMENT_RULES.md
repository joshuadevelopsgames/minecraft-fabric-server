# 🤖 AI Development Rules - Simple Reference Card

## 🎯 **The 3-Step Process**
**Every development task follows this:**

1. **🔍 ASSESS** - What are we building/fixing?
2. **🧪 TEST** - Does it work locally?
3. **🚀 DEPLOY** - Put it on the server

---

## 📋 **Simple Commands**

```bash
# 1. Quick test (ALWAYS do this first)
./quick-test.sh

# 2. Check version info
./version-tracker.sh

# 3. Deploy when ready
./deploy-safe.sh
```

---

## ✅ **AI MUST DO (Every Time)**

### **Before Making Changes:**
- [ ] Ask permission before changing anything
- [ ] Check current version: `./version-tracker.sh`
- [ ] Understand what we're building

### **During Development:**
- [ ] Test after changes: `./quick-test.sh`
- [ ] Use clear commit messages with version numbers
- [ ] Keep changes focused and small

### **After Development:**
- [ ] Verify it works locally
- [ ] Ask permission before deploying
- [ ] Use `./deploy-safe.sh` for deployment

---

## ❌ **AI MUST NEVER DO**

- [ ] Make changes without asking permission
- [ ] Deploy without permission
- [ ] Skip testing steps
- [ ] Forget to update version info
- [ ] Deploy broken code

---

## 🔧 **Version Management**

**Version Numbers:**
- `1.0.142` = Major feature
- `1.0.142a` = Quick fix
- `1.0.142-TEST` = Testing version

**Always Update These:**
```java
MOD_VERSION = "1.0.142"
BUILD_VERSION_TITLE = "What we built"
BUILD_FEATURES = "What it does"
```

---

## 🚨 **Emergency Rules**

**If Something Breaks:**
1. **STOP** - Don't deploy broken code
2. **REVERT** - Use backup or git reset
3. **FIX** - Make targeted fixes
4. **RETEST** - Verify it works
5. **DEPLOY** - Only when working

---

## 📊 **Simple Testing Checklist**

**For Every Feature:**
- [ ] Code compiles (`./quick-test.sh`)
- [ ] Works in singleplayer (`./gradlew runClient`)
- [ ] No crashes or errors
- [ ] Version info updated
- [ ] Ready for deployment

---

## 💬 **Communication Template**

**AI Should Say:**
```
"I see [issue/feature]. Can I investigate and fix this?"
"I'll check the current version first: ./version-tracker.sh"
"I found the issue - [description]. Can I fix it?"
"I'll test it: ./quick-test.sh"
"Build successful! Can I deploy this fix?"
"Deploying: ./deploy-safe.sh"
"Done! [Feature] should now work"
```

---

## 🎮 **Example Workflow**

**Scenario: Fixing Oracle interaction**

1. **AI**: "I see the Oracle isn't responding to right-clicks. Can I investigate and fix this?"
2. **You**: "Yes, go ahead"
3. **AI**: "I'll check the current version first: `./version-tracker.sh`"
4. **AI**: "I found the issue - missing `interactMob` method. Can I add it?"
5. **You**: "Yes"
6. **AI**: "I'll test it: `./quick-test.sh`"
7. **AI**: "Build successful! Can I deploy this fix?"
8. **You**: "Yes"
9. **AI**: "Deploying: `./deploy-safe.sh`"
10. **AI**: "Done! Oracle should now be interactive"

---

## 📁 **File Locations**

```
greek-mythology-mod-dev/
├── quick-test.sh      # Test changes
├── deploy-safe.sh     # Deploy to server
├── version-tracker.sh # Check version
└── [your mod files]
```

---

## 🎯 **Key Principles**

1. **Permission First** - Always ask before changing anything
2. **Test Everything** - Use `./quick-test.sh` religiously
3. **Version Everything** - Update version info for every change
4. **Deploy Safely** - Use `./deploy-safe.sh` for all deployments
5. **Communicate Clearly** - Explain what I'm doing at each step

---

## 🔄 **Quick Reference**

| Action | Command | When to Use |
|--------|---------|-------------|
| Test Changes | `./quick-test.sh` | After making any changes |
| Check Version | `./version-tracker.sh` | Before starting work |
| Deploy | `./deploy-safe.sh` | When ready to go live |

---

*This card should be referenced for every development task.* 