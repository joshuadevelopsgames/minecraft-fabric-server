# ⚡ ZEUS BOLT - WORKING LOGIC BACKUP
*Last Updated: July 25, 2025 - Version 1.0.39*

## 🎯 **CORE FUNCTIONALITY**

### **Charge System**
- **Max Charges**: 5 charges before cooldown
- **Damage System**: Uses item damage to track charges (damage = 0 = 5 charges, damage = 5 = 0 charges)
- **Visual Bar**: Shows remaining charges correctly
- **Cooldown**: 30 seconds (600 ticks) only when all charges are depleted

### **Fire Immunity**
- **Fireproof Setting**: `.fireproof()` in Item.Settings
- **Lava Floating**: Mixin provides upward velocity in lava
- **No Burning**: Item doesn't burn in fire/lava

### **Flight Ability**
- **Trigger**: Shift + Right-click
- **Effects**: Levitation IV (2.5s) → Slow Falling (5s)
- **Sound**: Illusioner mirror move sound
- **Works**: Regardless of charges/cooldown

### **Lightning Strike**
- **Range**: 40 blocks
- **Target**: Raycast to block or max range
- **Sound**: Thunder sound at target location
- **Weather Bonus**: Infinite charges during rain/thunder

---

## 🔧 **CRITICAL CODE LOGIC**

### **Item Registration (GreekItems.java)**
```java
Item.Settings settings = new Item.Settings()
    .maxCount(1)
    .maxDamage(5)  // ← CRITICAL: Sets max damage to 5
    .fireproof()    // ← CRITICAL: Enables fire immunity
    .rarity(Rarity.EPIC)
    .registryKey(RegistryKey.of(RegistryKeys.ITEM, ZEUS_BOLT_ID));
```

### **Charge Management (ZeusBoltItem.java)**
```java
// CRITICAL: Only reset when completely depleted
if (currentDamage >= stack.getMaxDamage()) {
    stack.setDamage(0);
    currentDamage = 0;
    GreekMythologyMod.LOGGER.info("ZeusBoltItem use - reset depleted item to full charges");
}

// CRITICAL: Consume charge without cooldown
stack.setDamage(currentDamage + 1);

// CRITICAL: Only set cooldown when charges run out
if (stack.getDamage() >= MAX_CHARGES) {
    user.getItemCooldownManager().set(stack, COOLDOWN_TICKS);
    GreekMythologyMod.LOGGER.info("COOLDOWN SET: {} ticks (all charges used)", COOLDOWN_TICKS);
}
```

### **Fire Immunity (ItemEntityMixin.java)**
```java
@Inject(method = "tick", at = @At("HEAD"))
private void greekmyth$floatIfFireproof(CallbackInfo ci) {
    ItemStack stack = ((ItemEntity) (Object) this).getStack();
    if (stack.isOf(GreekItems.ZEUS_BOLT) && this.isInLava()) {
        this.setVelocity(this.getVelocity().add(0.0, 0.04, 0.0));
        this.velocityDirty = true;
    }
}
```

---

## 🚫 **WHAT NOT TO CHANGE**

### **Never Change These:**
1. **`.maxDamage(5)`** - Must be exactly 5 for charge system
2. **`.fireproof()`** - Required for fire immunity
3. **Cooldown Logic** - Only set cooldown when `damage >= MAX_CHARGES`
4. **Reset Logic** - Only reset when `damage >= maxDamage`
5. **Mixin Configuration** - Required for lava floating

### **Common Mistakes to Avoid:**
- ❌ Setting cooldown on every use (causes 1-use limit)
- ❌ Resetting when charges < 5 (causes infinite loop)
- ❌ Removing `.fireproof()` (breaks fire immunity)
- ❌ Changing `maxDamage` (breaks charge system)

---

## 🔍 **DEBUGGING LOGS**

### **Key Log Messages:**
```
ZeusBoltItem use - Damage: X, MaxDamage: 5, Stack: 1 greekmyth:zeus_bolt
Charge consumed (new damage: X)
COOLDOWN SET: 600 ticks (all charges used)
ZeusBoltItem use - reset depleted item to full charges
```

### **Expected Behavior:**
1. **Use 1**: Damage 0→1, no cooldown
2. **Use 2**: Damage 1→2, no cooldown
3. **Use 3**: Damage 2→3, no cooldown
4. **Use 4**: Damage 3→4, no cooldown
5. **Use 5**: Damage 4→5, **COOLDOWN SET**
6. **After 30s**: Reset to damage 0, ready again

---

## 📋 **DEPLOYMENT CHECKLIST**

### **Before Deploying:**
- [ ] Version number updated in `build.gradle`
- [ ] Modpack version updated
- [ ] Remote server deployed
- [ ] Modpack exported
- [ ] Server restarted
- [ ] Logs checked for initialization

### **Test Checklist:**
- [ ] 5 charges before cooldown
- [ ] 30-second cooldown after 5 uses
- [ ] Fire immunity working
- [ ] Lava floating working
- [ ] Flight ability working
- [ ] Weather bonus working

---

## 🎯 **SUCCESS METRICS**

✅ **Working Zeus Bolt should:**
- Start with 5 charges (damage = 0)
- Use all 5 charges without cooldown
- Go on 30-second cooldown after 5 uses
- Float in lava without burning
- Allow flight with shift+right-click
- Give infinite charges during rain/thunder

**Version 1.0.39 - PERFECT WORKING STATE** ⚡ 