# 🎯 DEPLOYMENT QUICK REFERENCE

## **🏗️ DEVELOPMENT (Safe Testing)**
**Phrases:** "deploy to dev", "test locally", "development environment"
**Server:** `localhost:25565`
**Impact:** Local only, no production downtime

## **🚀 PRODUCTION (Live Server)**
**Phrases:** "deploy to server", "push to production", "live server"
**Server:** `178.156.165.14:25565`
**Impact:** All players affected

---

## **📋 Common Commands**

### **Quick Deployment (with target selection):**
```bash
./deploy-with-target.sh
# Will ask: Development (1) or Production (2)?
```

### **Direct Deployment:**
```bash
# Development
./deploy-with-target.sh dev

# Production  
./deploy-with-target.sh prod
```

### **Manual Deployment:**
```bash
# Development
cd dev-server && ./deploy-to-dev.sh

# Production
./deploy.sh
```

---

## **💡 When to Use Each**

| Use Case | Target | Why |
|----------|--------|-----|
| **New Features** | Development | Test safely first |
| **Bug Fixes** | Development | Verify fix works |
| **Quick Fixes** | Production | If confident |
| **Major Updates** | Development → Production | Test then deploy |

---

## **🚨 Remember**
- **Always specify target** in your request
- **Development is safe** - never affects production
- **Production affects everyone** - use carefully
- **Test first** - use dev for new features 