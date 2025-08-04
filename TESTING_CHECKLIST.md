# Testing Checklist Template

## Feature: [Feature Name] - Version [Version Number]

### Pre-Test Checklist
- [ ] Code compiles without errors
- [ ] Version info updated in `GreekMythologyMod.java`
- [ ] Local build successful (`./gradlew build`)
- [ ] No obvious syntax errors
- [ ] All imports are correct

### Local Testing Checklist
- [ ] Feature works as expected in singleplayer
- [ ] No crashes or error messages in console
- [ ] Integration with existing features works
- [ ] Performance is acceptable (no lag)
- [ ] UI elements display correctly
- [ ] Sound effects play properly
- [ ] Particle effects render correctly
- [ ] Commands work as intended
- [ ] Items function properly
- [ ] Entities behave correctly

### Remote Testing Checklist
- [ ] Server starts without errors
- [ ] `/greekversion` shows correct version info
- [ ] Feature works on remote server
- [ ] Multiple players can use feature simultaneously
- [ ] No server-side crashes
- [ ] Database/configuration files load correctly
- [ ] World generation works properly
- [ ] Player data persists correctly

### Post-Test Checklist
- [ ] Working version backed up (`greek-mythology-X.X.X-WORKING.jar`)
- [ ] Git commit created with descriptive message
- [ ] Changes pushed to remote repository
- [ ] Documentation updated (CHANGELOG.txt, README.md)
- [ ] Known issues documented if any
- [ ] Performance metrics recorded if applicable

### Specific Feature Tests

#### For New Items:
- [ ] Item appears in creative inventory
- [ ] Item can be crafted/obtained
- [ ] Item functions correctly when used
- [ ] Item has proper textures and models
- [ ] Item tooltips display correctly

#### For New Entities:
- [ ] Entity spawns correctly
- [ ] Entity AI works properly
- [ ] Entity can be interacted with
- [ ] Entity drops appropriate items
- [ ] Entity has proper animations

#### For New Commands:
- [ ] Command syntax is correct
- [ ] Command executes without errors
- [ ] Command provides appropriate feedback
- [ ] Command permissions work correctly
- [ ] Command help text is clear

#### For New Dimensions/Worlds:
- [ ] Dimension loads without errors
- [ ] World generation works properly
- [ ] Players can enter/exit dimension
- [ ] Dimension has appropriate atmosphere
- [ ] No performance issues in dimension

### Performance Testing
- [ ] No significant FPS drops
- [ ] Memory usage is reasonable
- [ ] Network traffic is acceptable
- [ ] Server TPS remains stable
- [ ] No memory leaks detected

### Compatibility Testing
- [ ] Works with other mods (if applicable)
- [ ] Works with different Minecraft versions
- [ ] Works with different Fabric versions
- [ ] No conflicts with vanilla features

### Edge Case Testing
- [ ] Feature works with extreme values
- [ ] Feature handles null/empty inputs
- [ ] Feature works with multiple players
- [ ] Feature works after server restart
- [ ] Feature works in different biomes/dimensions

### Documentation Testing
- [ ] Feature is documented in README.md
- [ ] Changes are logged in CHANGELOG.txt
- [ ] Version info is accurate
- [ ] Known issues are documented

---

## Test Results Summary

**Feature Status:** [Working/Broken/Needs Fixes]
**Performance:** [Good/Acceptable/Poor]
**Compatibility:** [Full/Partial/None]
**Documentation:** [Complete/Partial/None]

**Issues Found:**
1. [Issue description]
2. [Issue description]

**Fixes Applied:**
1. [Fix description]
2. [Fix description]

**Notes:**
[Additional notes about the testing process]

---

*This checklist should be completed for every new feature or major update.* 