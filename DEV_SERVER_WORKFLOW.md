# Development Server Workflow

## 🎯 **Overview**

This document outlines the complete workflow for developing and testing the Greek Mythology mod using the development server.

## 📁 **Directory Structure**

```
minecraft-fabric-server/
├── greek-mythology-mod-dev/     # Mod source code
├── dev-server/                  # Development server
│   ├── mods/                    # Mod JAR files
│   ├── logs/                    # Server logs
│   ├── restart-dev-server.sh    # Restart script
│   └── DEV_SERVER_RESTART_GUIDE.md  # Restart guide
└── fabric-1.21.8/              # Fabric API
```

## 🔄 **Development Workflow**

### 1. Make Code Changes
```bash
cd greek-mythology-mod-dev
# Edit source files in src/main/java/
```

### 2. Build the Mod
```bash
cd greek-mythology-mod-dev
../fabric-1.21.8/gradlew clean build
```

### 3. Restart Development Server
```bash
cd dev-server
./restart-dev-server.sh
```

### 4. Test Changes
- Connect to `localhost:25565`
- Test the new functionality
- Check logs for any issues

## 🚨 **Critical: Always Use Proper Restart**

**NEVER** just restart the server without following the proper process. The development server caches code and won't load new changes unless properly killed and restarted.

### Quick Restart Commands
```bash
# Option 1: Use the automated script (RECOMMENDED)
cd dev-server
./restart-dev-server.sh

# Option 2: Manual process
pkill -f "fabric-server-launch.jar"
cp ../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.68.jar mods/
./start-dev-server.sh
sleep 20
tail -10 logs/latest.log
```

## 🔍 **Troubleshooting**

### Build Issues
- Check Gradle version compatibility
- Ensure all dependencies are resolved
- Verify mixin configuration

### Server Issues
- Check if `fabric-server-launch.jar` exists
- Verify Java version compatibility
- Check server logs for errors

### Code Not Loading
- **Most Common Issue**: Server not properly restarted
- Check timestamps in logs (should be recent)
- Verify JAR file was copied with correct timestamp
- Follow the restart guide: `dev-server/DEV_SERVER_RESTART_GUIDE.md`

## 📝 **Testing Checklist**

- [ ] Code changes made and saved
- [ ] Mod built successfully (`gradlew clean build`)
- [ ] Development server properly restarted
- [ ] New timestamps appear in logs
- [ ] Functionality tested in-game
- [ ] No errors in server logs

## 🎯 **Current Status**

- ✅ Build system working
- ✅ Development server restart process documented
- ✅ Automated restart script created
- 🔄 Ready for water walking testing

## 📚 **Reference Documents**

- `dev-server/DEV_SERVER_RESTART_GUIDE.md` - Detailed restart instructions
- `dev-server/restart-dev-server.sh` - Automated restart script
- `greek-mythology-mod-dev/CHANGELOG.txt` - Mod changelog

---

**Remember: Always use the proper restart process to avoid caching issues!** 