# Testing Guide - Greek Mythology Mod

## Overview

This guide provides detailed instructions for testing the Greek Mythology mod features. Follow these procedures to ensure quality and catch issues before deployment.

## Quick Testing Workflow

### 1. Local Testing
```bash
# Build the mod
./gradlew build

# If successful, test locally
./gradlew runClient

# Create test version
./quick-test.sh
```

### 2. Feature Testing
```bash
# Test specific feature
# Use TESTING_CHECKLIST.md for systematic testing

# Deploy if working
./deploy-safe.sh
```

## Detailed Testing Procedures

### Oracle Entity Testing

#### Basic Functionality
1. **Spawn Oracle**: Use `/summon minecraft:illusioner` in a test world
2. **Check Appearance**: Oracle should have golden name "The Oracle"
3. **Test Invulnerability**: Try to damage Oracle (should be protected)
4. **Test Persistence**: Oracle should not despawn

#### Interaction Testing
1. **Right-Click**: Should respond to player interaction
2. **Prophecy System**: 
   - Get prophecy on first interaction
   - Check 5-minute cooldown
   - Verify prophecy text appears
3. **Quest System**:
   - Should receive quest after prophecy
   - Check quest progress display
   - Verify quest completion

#### Behavioral States
1. **Meditation**: Oracle stays still, creates enchantment particles
2. **Gathering**: Oracle moves around looking for dandelions
3. **Quest Giving**: Oracle seeks nearby players
4. **Divination**: Oracle creates portal particles
5. **Wandering**: Oracle moves randomly

#### Sacred Ground Effects
1. **Enter 8-block radius**: Should get regeneration and night vision
2. **Particle Effects**: End rod particles should appear around perimeter
3. **Ambient Effects**: Cave sounds should play occasionally

### Item Testing

#### Soul Items
1. **Creative Inventory**: All soul items should appear
2. **Textures**: Items should have proper textures
3. **Tooltips**: Should display correct information
4. **Functionality**: Should work as intended

#### God Items (Zeus Bolt, Hades Scythe, Poseidon Trident)
1. **Crafting**: Should be craftable (if applicable)
2. **Usage**: Should function correctly when used
3. **Effects**: Should produce intended effects
4. **Cooldowns**: Should have appropriate cooldowns

### Command Testing

#### `/greekversion`
1. **Display**: Should show current version information
2. **Accuracy**: Version should match actual mod version
3. **Formatting**: Should be properly formatted

#### `/jail` and `/setjail`
1. **Permissions**: Should require appropriate permissions
2. **Functionality**: Should work as intended
3. **Error Handling**: Should handle invalid inputs

#### Favor Commands
1. **Check Favor**: Should display player favor levels
2. **Gain Favor**: Should increase favor when appropriate
3. **Favor Rewards**: Should provide rewards at thresholds

### Dimension Testing

#### Tartarus Dimension
1. **Entry**: Should be able to enter dimension
2. **Generation**: World should generate properly
3. **Atmosphere**: Should have appropriate lighting and effects
4. **Exit**: Should be able to return to overworld

#### Inferno Portal
1. **Activation**: Should activate with correct items
2. **Transportation**: Should transport to correct location
3. **Effects**: Should have appropriate visual effects

### Performance Testing

#### Local Performance
1. **FPS**: Should maintain acceptable FPS
2. **Memory**: Should not cause memory leaks
3. **Loading**: Should load without significant delays

#### Server Performance
1. **TPS**: Should maintain stable TPS
2. **Memory Usage**: Should not cause excessive memory usage
3. **Network**: Should not generate excessive network traffic

## Automated Testing Scripts

### Using `quick-test.sh`
```bash
# Run quick test cycle
./quick-test.sh

# This will:
# 1. Build the mod
# 2. Create test jar with timestamp
# 3. Provide next steps
```

### Using `deploy-safe.sh`
```bash
# Deploy to server safely
./deploy-safe.sh

# This will:
# 1. Build the mod
# 2. Create backup
# 3. Deploy to mods directory
# 4. Commit to git
# 5. Restart server
```

### Using `version-tracker.sh`
```bash
# Check version information
./version-tracker.sh

# This will:
# 1. Display current version info
# 2. Show existing version files
# 3. Display git status
# 4. Show recent commits
```

## Testing Checklist Usage

### For Each Feature
1. **Copy** `TESTING_CHECKLIST.md` to a new file
2. **Fill in** feature name and version
3. **Complete** all relevant checkboxes
4. **Document** any issues found
5. **Save** the completed checklist

### Example Checklist
```markdown
## Feature: Oracle Interaction Fix - Version 1.0.142

### Pre-Test Checklist
- [x] Code compiles without errors
- [x] Version info updated
- [x] Local build successful
- [x] No obvious syntax errors

### Local Testing Checklist
- [x] Oracle responds to right-click
- [x] Prophecies work correctly
- [x] Quest system functions
- [x] No crashes or errors
```

## Common Issues and Solutions

### Build Failures
- **Issue**: Gradle build fails
- **Solution**: Check for syntax errors, missing imports
- **Prevention**: Use IDE error checking

### Runtime Crashes
- **Issue**: Game crashes when using feature
- **Solution**: Check logs, verify null checks
- **Prevention**: Test edge cases, add error handling

### Performance Issues
- **Issue**: Lag or low FPS
- **Solution**: Optimize code, reduce particle effects
- **Prevention**: Monitor performance during development

### Version Mismatches
- **Issue**: `/greekversion` shows wrong version
- **Solution**: Update version info in `GreekMythologyMod.java`
- **Prevention**: Always update version when making changes

## Testing Best Practices

### Before Testing
1. **Clean Build**: Always do a clean build before testing
2. **Backup**: Create backup of working version
3. **Isolate**: Test one feature at a time
4. **Document**: Keep notes of what you're testing

### During Testing
1. **Systematic**: Follow the checklist step by step
2. **Thorough**: Test all aspects of the feature
3. **Realistic**: Test with realistic use cases
4. **Edge Cases**: Test boundary conditions

### After Testing
1. **Document**: Record results and issues
2. **Fix**: Address any issues found
3. **Retest**: Test fixes before deployment
4. **Deploy**: Use safe deployment process

## Emergency Procedures

### If Testing Reveals Critical Issues
1. **Stop**: Don't deploy broken code
2. **Revert**: Use backup or git reset
3. **Fix**: Address the issue
4. **Retest**: Test the fix thoroughly
5. **Deploy**: Only deploy when working

### If Server Issues Occur
1. **Check Logs**: Look for error messages
2. **Restart**: Restart server if needed
3. **Rollback**: Use previous working version
4. **Investigate**: Find root cause
5. **Fix**: Implement proper fix

---

*This guide should be updated as new features are added and testing procedures evolve.* 