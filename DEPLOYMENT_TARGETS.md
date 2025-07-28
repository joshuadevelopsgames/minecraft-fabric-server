# 🎯 DEPLOYMENT TARGETS GUIDE

## **How to Specify Where Changes Should Go**

### **🏗️ DEVELOPMENT ENVIRONMENT (Local Testing)**
When you want to test changes locally without affecting the main server:

**Use these phrases:**
- "Deploy to dev" / "Deploy to development"
- "Test locally" / "Test on dev server"
- "Build for development"
- "Deploy to local server"
- "Use the dev environment"

**What happens:**
- Changes go to `dev-server/` directory
- Server runs on `localhost:25565`
- Isolated testing environment
- No impact on production server

### **🚀 PRODUCTION SERVER (Live Server)**
When you want changes to go to the main server that others connect to:

**Use these phrases:**
- "Deploy to production" / "Deploy to server"
- "Push to live server"
- "Deploy to remote server"
- "Update the main server"
- "Deploy to 178.156.165.14"

**What happens:**
- Changes go to the remote server at `178.156.165.14:25565`
- All players will see the changes
- Requires server restart
- Affects all connected players

## **📋 Quick Reference**

| Target | Phrase | Server | Impact |
|--------|--------|--------|--------|
| **Development** | "deploy to dev" | `localhost:25565` | Local only |
| **Production** | "deploy to server" | `178.156.165.14:25565` | All players |

## **🔄 Recommended Workflow**

### **For Testing New Features:**
1. Say: *"Deploy to dev"*
2. Test on `localhost:25565`
3. If working, say: *"Deploy to production"*

### **For Quick Fixes:**
1. Say: *"Deploy to server"* (if confident)
2. Or say: *"Deploy to dev"* (if unsure)

## **💡 Examples**

**✅ Good Examples:**
- "Deploy the Hades Scythe changes to dev"
- "Test the pet skeleton feature on development"
- "Deploy to production when ready"
- "Push the teleportation fix to server"

**❌ Unclear Examples:**
- "Deploy it" (which target?)
- "Build the mod" (where to deploy?)
- "Update the server" (dev or production?)

## **🚨 Important Notes**

- **Development is SAFE**: Never affects production
- **Production affects ALL PLAYERS**: Use carefully
- **Always specify target**: Don't assume which one
- **Test first**: Use dev for new features 