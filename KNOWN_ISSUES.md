# Known Issues - Greek Mythology Mod

## Current Issues

### High Priority

#### 1. Oracle Altar System Disabled
- **Issue**: Oracle Altar block registration causes crashes
- **Status**: Temporarily disabled
- **Impact**: Oracle cannot use altar functionality
- **Workaround**: Oracle works without altar system
- **Solution**: Need to fix block registration in future update

#### 2. Creative Inventory NullPointerException
- **Issue**: Missing Oracle Altar item causes crashes in creative inventory
- **Status**: Fixed in version 1.0.142
- **Impact**: None (resolved)
- **Solution**: Removed reference to missing item

### Medium Priority

#### 3. Soul Harvesting System
- **Issue**: Soul harvesting may cause performance issues with many players
- **Status**: Monitoring
- **Impact**: Potential server lag
- **Workaround**: Limit soul harvesting frequency
- **Solution**: Optimize soul collection algorithm

#### 4. Dimension Loading
- **Issue**: Tartarus dimension may take time to load
- **Status**: Known behavior
- **Impact**: Slight delay when entering dimension
- **Workaround**: Wait for dimension to fully load
- **Solution**: Optimize dimension generation

### Low Priority

#### 5. Particle Effects
- **Issue**: Some particle effects may cause FPS drops on low-end systems
- **Status**: Minor issue
- **Impact**: Reduced performance on some systems
- **Workaround**: Reduce particle settings in Minecraft options
- **Solution**: Optimize particle rendering

#### 6. Sound Effects
- **Issue**: Some custom sounds may not play on all systems
- **Status**: Rare issue
- **Impact**: Missing audio feedback
- **Workaround**: Check audio settings
- **Solution**: Ensure sound file compatibility

## Resolved Issues

### Version 1.0.142 - Oracle Interaction Fix
- **Issue**: Oracle entity was unresponsive to player interaction
- **Status**: ✅ RESOLVED
- **Solution**: Added missing `interactMob` method
- **Date**: 2024-08-04

### Version 1.0.141 - Soul Model Fix
- **Issue**: Soul items had incorrect models
- **Status**: ✅ RESOLVED
- **Solution**: Fixed soul item model generation
- **Date**: 2024-08-03

### Version 1.0.140 - Illusioner Model Fix
- **Issue**: Illusioner entity models were broken
- **Status**: ✅ RESOLVED
- **Solution**: Fixed entity model registration
- **Date**: 2024-08-03

## Performance Issues

### Memory Usage
- **Issue**: Mod may use more memory than expected
- **Status**: Monitoring
- **Impact**: Higher server memory requirements
- **Solution**: Optimize entity and item management

### Network Traffic
- **Issue**: Some features may generate excessive network traffic
- **Status**: Monitoring
- **Impact**: Potential lag for players with poor connections
- **Solution**: Optimize packet sending

## Compatibility Issues

### Mod Conflicts
- **Issue**: May conflict with other mods that modify similar systems
- **Status**: Testing needed
- **Impact**: Unknown
- **Solution**: Test with popular modpacks

### Version Compatibility
- **Issue**: May not work with future Minecraft versions
- **Status**: Ongoing
- **Impact**: Need to update for new versions
- **Solution**: Regular updates

## Workarounds

### For Oracle Issues
1. Use right-click interaction instead of altar system
2. Wait for prophecies to reset (5-minute cooldown)
3. Check quest progress by interacting with Oracle

### For Performance Issues
1. Reduce particle settings in Minecraft options
2. Limit number of active quests
3. Restart server if memory usage is high

### For Sound Issues
1. Check Minecraft audio settings
2. Ensure sound files are not corrupted
3. Restart Minecraft client

## Reporting Issues

When reporting a new issue, please include:
1. **Version**: Current mod version
2. **Minecraft Version**: Minecraft and Fabric versions
3. **Description**: Clear description of the problem
4. **Steps to Reproduce**: How to trigger the issue
5. **Expected Behavior**: What should happen
6. **Actual Behavior**: What actually happens
7. **Logs**: Any error messages or crash logs
8. **System Info**: OS, Java version, etc.

## Issue Priority Levels

- **Critical**: Crashes, data loss, major functionality broken
- **High**: Important features not working, significant performance issues
- **Medium**: Minor features broken, slight performance impact
- **Low**: Cosmetic issues, minor annoyances
- **Enhancement**: Feature requests, improvements

---

*Last Updated: 2024-08-04*
*Version: 1.0.142* 