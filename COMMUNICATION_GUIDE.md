# 💬 CLEAR COMMUNICATION GUIDE

## **How to Clearly Specify Deployment Targets**

### **🏗️ For Development Testing:**
Use these phrases when you want to test changes locally:

**✅ Good Examples:**
- "Deploy the Hades Scythe changes to dev"
- "Test the pet skeleton feature on development"
- "Build and deploy to local server"
- "Use the development environment for this"
- "Deploy to dev server for testing"

**What I'll do:**
- Build the mod
- Deploy to `dev-server/`
- Tell you to connect to `localhost:25565`

### **🚀 For Production Server:**
Use these phrases when you want changes on the live server:

**✅ Good Examples:**
- "Deploy to production server"
- "Push the teleportation fix to server"
- "Deploy to live server"
- "Update the main server"
- "Deploy to 178.156.165.14"

**What I'll do:**
- Build the mod
- Deploy to remote server
- Restart the production server

---

## **🎯 Quick Reference**

| What You Want | Say This | Result |
|---------------|----------|--------|
| **Local Testing** | "deploy to dev" | `localhost:25565` |
| **Live Server** | "deploy to server" | `178.156.165.14:25565` |

---

## **💡 Examples for Common Scenarios**

### **Testing New Features:**
> "I want to test the pet wither skeleton feature. Deploy to dev so I can test it locally."

### **Quick Bug Fix:**
> "The teleportation is spawning me too high. Deploy this fix to server."

### **Major Update:**
> "I've made several changes to the Hades Scythe. Deploy to dev first so I can test, then we'll push to production."

### **Emergency Fix:**
> "There's a crash on the server. Deploy this fix to production immediately."

---

## **🚨 What NOT to Say**

**❌ Unclear Examples:**
- "Deploy it" (which target?)
- "Build the mod" (where to deploy?)
- "Update the server" (dev or production?)
- "Push the changes" (where?)

**✅ Always specify the target!**

---

## **🔄 My Response Pattern**

When you specify a target, I'll respond like this:

**For Development:**
> "🏗️ Deploying to DEVELOPMENT environment...
> ✅ Deployed to development server!
> Connect to: localhost:25565"

**For Production:**
> "🚀 Deploying to PRODUCTION server...
> ✅ Deployed to production server!
> Connect to: 178.156.165.14:25565"

---

## **📝 Remember**
- **Always specify target** in your request
- **Development is safe** - never affects production
- **Production affects everyone** - use carefully
- **Test first** - use dev for new features 