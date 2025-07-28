# 🏗️ Development Environment Workflow

## **Quick Start**

### **1. Deploy Changes to Dev Server**
```bash
cd dev-server
./deploy-to-dev.sh
```

### **2. Start Development Server**
```bash
./start-dev-server.sh
```

### **3. Connect to Dev Server**
- **Address**: `localhost:25565`
- **No password required** (local development)

## **🔄 Development Workflow**

### **Step 1: Make Changes**
- Edit files in `../greek-mythology-mod-dev/src/`
- Test your changes locally

### **Step 2: Deploy to Dev Server**
```bash
./deploy-to-dev.sh
```
This will:
- Build the mod
- Copy the JAR to `dev-server/mods/`
- Show connection instructions

### **Step 3: Test Changes**
- Start the dev server: `./start-dev-server.sh`
- Connect with Minecraft client to `localhost:25565`
- Test your changes without affecting the main server

### **Step 4: Deploy to Production (When Ready)**
```bash
cd ..
./deploy.sh
```

## **📁 File Structure**
```
dev-server/
├── mods/                    # Development mods
├── config/                  # Server configuration
├── world-dev/              # Development world
├── logs/                   # Development logs
├── start-dev-server.sh     # Start development server
├── deploy-to-dev.sh        # Deploy changes to dev
└── DEVELOPMENT_WORKFLOW.md # This guide
```

## **🎯 Benefits**
- ✅ **No Production Downtime**: Test without stopping main server
- ✅ **Quick Iteration**: Fast build and deploy cycle
- ✅ **Safe Testing**: Isolated development environment
- ✅ **Easy Rollback**: Changes don't affect production

## **🚀 Advanced Usage**

### **Multiple Development Sessions**
You can run multiple dev servers on different ports:
```bash
# Edit server.properties to change port
# Default: 25565, Dev: 25566, Test: 25567
```

### **Development World Backup**
```bash
# Backup dev world before major changes
cp -r world-dev world-dev-backup-$(date +%Y%m%d)
```

### **Quick Restart**
```bash
# Stop dev server: Ctrl+C
# Restart: ./start-dev-server.sh
```

## **🔧 Troubleshooting**

### **Port Already in Use**
- Change port in `server.properties`
- Or kill existing process: `pkill -f "java.*fabric"`

### **Mod Not Loading**
- Check `logs/latest.log` for errors
- Ensure JAR is copied to `mods/` directory
- Verify Fabric API is present

### **Build Errors**
- Check Gradle output in `../greek-mythology-mod-dev/`
- Fix compilation errors before deploying

## **📝 Tips**
- Keep the dev server running while developing
- Use `/gametest` commands for automated testing
- Check logs in `logs/latest.log` for debugging
- The dev world is separate from production 