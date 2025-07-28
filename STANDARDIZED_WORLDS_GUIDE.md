# 🌍 Standardized Worlds Guide

## **What This Does**

Creates identical worlds for both development and production environments, so your world doesn't change with each deployment.

## **🏗️ Setup**

### **Initial Setup (One-time):**
```bash
./setup-standardized-worlds.sh
```

This will:
- Create a fresh world template
- Set up identical worlds for dev and production
- Create management scripts

## **📁 World Structure**

```
world-template/          # Master template world
├── data/               # World data
├── datapacks/          # Data packs
├── playerdata/         # Player data
├── poi/               # Points of interest
└── region/            # World chunks

dev-server/world-dev/   # Development world (copy of template)
world/                  # Production world (copy of template)
```

## **🔄 Management Commands**

### **Sync All Worlds:**
```bash
./sync-worlds.sh
```
- Makes dev and production worlds identical to template
- Use when you want to reset both worlds

### **Backup Current Worlds:**
```bash
./backup-worlds.sh
```
- Creates timestamped backups of current worlds
- Use before major changes

### **Deploy to Both Environments:**
```bash
./deploy-both-environments.sh
```
- Builds mod and deploys to both dev and production
- Both environments get the same changes

## **🎯 Benefits**

### **✅ Consistent Testing:**
- Same world state in dev and production
- No surprises when deploying to production
- Predictable testing environment

### **✅ No World Drift:**
- Worlds stay synchronized
- Changes don't accumulate differently
- Clean testing baseline

### **✅ Easy Reset:**
- Reset both worlds to template anytime
- Fresh start for testing
- No manual world management

## **💡 Usage Examples**

### **Fresh Development Session:**
```bash
# 1. Sync worlds to template
./sync-worlds.sh

# 2. Deploy changes to both
./deploy-both-environments.sh

# 3. Test on development
cd dev-server && ./start-dev-server.sh
# Connect to localhost:25565

# 4. Test on production
# Connect to 178.156.165.14:25565
```

### **After Major Changes:**
```bash
# 1. Backup current worlds
./backup-worlds.sh

# 2. Reset to template
./sync-worlds.sh

# 3. Deploy new changes
./deploy-both-environments.sh
```

## **🚨 Important Notes**

- **Template is Master**: `world-template/` is the source of truth
- **Sync Resets**: `./sync-worlds.sh` will overwrite both worlds
- **Backup First**: Always backup before syncing if you want to keep changes
- **Identical State**: Both environments will have identical world state

## **📝 Workflow**

1. **Develop**: Make changes to mod code
2. **Deploy Both**: `./deploy-both-environments.sh`
3. **Test Dev**: Connect to `localhost:25565`
4. **Test Prod**: Connect to `178.156.165.14:25565`
5. **Reset When Needed**: `./sync-worlds.sh`

## **🔧 Troubleshooting**

### **Worlds Getting Out of Sync:**
```bash
./sync-worlds.sh
```

### **Want to Keep Changes:**
```bash
./backup-worlds.sh
# Then make your changes
```

### **Fresh Start:**
```bash
./setup-standardized-worlds.sh
``` 