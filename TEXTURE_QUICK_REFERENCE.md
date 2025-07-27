# 🚨 TEXTURE ISSUES - QUICK REFERENCE CARD

## **PURPLE/BLACK BLOCK = MISSING REDIRECT FILE**

### **Immediate Fix:**
```bash
# Create the missing redirect file
mkdir -p src/main/resources/assets/greekmyth/items/
cat > src/main/resources/assets/greekmyth/items/your_item.json << 'EOF'
{
  "model": {
    "type": "model",
    "model": "greekmyth:item/your_item"
  }
}
EOF
```

### **Verify Fix:**
```bash
# Check if file exists in JAR
jar tf build/libs/greek-mythology-*.jar | grep your_item
# Should show 3 files: items/your_item.json, models/item/your_item.json, textures/item/your_item.png
```

---

## **COMMON ISSUES & FIXES**

| **Symptom** | **Cause** | **Fix** |
|-------------|-----------|---------|
| Purple/black block | Missing redirect file | Create `assets/greekmyth/items/item.json` |
| Wrong texture | Incorrect path in model | Check `"layer0": "greekmyth:item/item_name"` |
| Item missing | Version mismatch | Update all `fabric.mod.json` files |
| Wrong size | Wrong model parent | Use `"item/generated"` for 16x16, `"item/handheld"` for 32x32+ |

---

## **REQUIRED FILES FOR EACH ITEM**

```
✅ assets/greekmyth/items/item_name.json          # REDIRECT (CRITICAL!)
✅ assets/greekmyth/models/item/item_name.json    # MODEL
✅ assets/greekmyth/textures/item/item_name.png   # TEXTURE
```

---

## **QUICK DEBUG COMMANDS**

```bash
# Check JAR contents
jar tf build/libs/greek-mythology-*.jar | grep item_name

# Compare with working item
diff assets/greekmyth/items/zeus_bolt.json assets/greekmyth/items/your_item.json

# Check server logs
ssh root@178.156.165.14 "tail -f /root/minecraft/logs/latest.log | grep -E '(Registered|constructor)'"
```

---

## **DEPLOYMENT CHECKLIST**

- [ ] Build: `gradle build`
- [ ] Deploy: `scp build/libs/greek-mythology-*.jar root@178.156.165.14:/root/minecraft/mods/`
- [ ] Restart: `ssh root@178.156.165.14 "pkill -f java && cd /root/minecraft && screen -dmS minecraft java -Xmx3G -Xms3G -jar fabric-server-launch.jar nogui"`
- [ ] Verify: Check logs for "Registered" messages

---

*Based on Hades Scythe debugging - the redirect file was the missing piece!* 