# 🏗️ Development Environment

## **Quick Start**

### **Option 1: One-Command Setup**
```bash
cd dev-server
./quick-dev.sh
```
This will build, deploy, and start the development server automatically.

### **Option 2: Step-by-Step**
```bash
# 1. Deploy changes
./deploy-to-dev.sh

# 2. Start server
./start-dev-server.sh

# 3. Connect to localhost:25565
```

## **🎯 What This Gives You**

### **✅ Benefits**
- **No Production Downtime**: Test without stopping your main server
- **Fast Iteration**: Quick build and deploy cycle
- **Safe Testing**: Isolated development environment
- **Easy Rollback**: Changes don't affect production

### **🔄 Workflow**
1. **Make Changes** → Edit mod code
2. **Deploy to Dev** → `./deploy-to-dev.sh`
3. **Test Changes** → Connect to `localhost:25565`
4. **Deploy to Production** → When ready, use main deploy script

## **📁 Files**
- `deploy-to-dev.sh` - Build and deploy mod to dev server
- `start-dev-server.sh` - Start the development server
- `quick-dev.sh` - One-command setup (recommended)
- `DEVELOPMENT_WORKFLOW.md` - Detailed workflow guide

## **🔧 Configuration**
- **Port**: 25565 (change in `server.properties` if needed)
- **World**: `world-dev/` (separate from production)
- **Mods**: `mods/` (copied from main server)
- **Logs**: `logs/latest.log`

## **🚀 Usage Examples**

### **Quick Development Session**
```bash
cd dev-server
./quick-dev.sh
# Connect to localhost:25565
# Test your changes
# Ctrl+C to stop
```

### **Deploy Only (Server Already Running)**
```bash
./deploy-to-dev.sh
# Server will reload mods automatically
```

### **Multiple Dev Sessions**
```bash
# Edit server.properties to change port
# Run multiple dev servers on different ports
```

## **💡 Tips**
- Keep the dev server running while developing
- Check `logs/latest.log` for debugging
- The dev world is separate from production
- Use `/gametest` for automated testing 