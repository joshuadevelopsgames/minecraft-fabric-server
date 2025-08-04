# Development Efficiency Guide - Greek Mythology Mod

## 🚀 Overview

This guide provides a complete development workflow for the Greek Mythology mod, designed to maximize efficiency, minimize errors, and ensure consistent quality.

## 📋 Quick Start

### Initial Setup
```bash
# Run the development setup (one-time)
./dev-setup.sh

# Check current version info
./version-tracker.sh
```

### Daily Workflow
```bash
# 1. Quick local testing
./quick-test.sh

# 2. Test in game
./gradlew runClient

# 3. Deploy when ready
./deploy-safe.sh
```

## 🔧 Available Scripts

### `quick-test.sh` - Rapid Local Testing
**Purpose**: Quick build and test cycle
**What it does**:
- Builds the mod
- Creates timestamped test jar
- Provides next steps
**Usage**: `./quick-test.sh`

### `deploy-safe.sh` - Safe Deployment
**Purpose**: Complete deployment to remote server
**What it does**:
- Builds the mod
- Creates backup of current version
- Deploys to mods directory
- Commits to git
- Restarts remote server
**Usage**: `./deploy-safe.sh`

### `version-tracker.sh` - Version Information
**Purpose**: Display current version and status
**What it does**:
- Shows current version info
- Lists existing version files
- Displays git status
- Shows recent commits
**Usage**: `./version-tracker.sh`

### `dev-setup.sh` - Environment Setup
**Purpose**: One-time development environment setup
**What it does**:
- Creates necessary directories
- Makes scripts executable
- Tests build system
- Creates initial backup
**Usage**: `./dev-setup.sh` (run once)

## 📁 Directory Structure

```
greek-mythology-mod-dev/
├── backup/              # Version backups
├── working-versions/    # Verified working versions
├── test-worlds/         # Testing worlds
├── logs/               # Development logs
├── temp/               # Temporary files
├── quick-test.sh       # Quick testing script
├── deploy-safe.sh      # Safe deployment script
├── version-tracker.sh  # Version tracking script
├── dev-setup.sh        # Environment setup script
├── TESTING_CHECKLIST.md # Testing checklist template
├── TESTING_GUIDE.md    # Detailed testing guide
├── KNOWN_ISSUES.md     # Known issues tracking
└── DEVELOPMENT_GUIDE.md # This file
```

## 🔄 Development Workflow

### 1. Planning Phase
- Define the feature to build
- Update version info in `GreekMythologyMod.java`
- Create feature branch if needed

### 2. Development Phase
```bash
# Make code changes
# Test frequently with:
./quick-test.sh
./gradlew runClient
```

### 3. Testing Phase
- Use `TESTING_CHECKLIST.md` for systematic testing
- Test locally first
- Test all aspects of the feature
- Document any issues found

### 4. Deployment Phase
```bash
# Deploy when testing is complete
./deploy-safe.sh
```

### 5. Verification Phase
- Check `/greekversion` in-game
- Verify feature works on server
- Monitor for any issues

## 📊 Version Management

### Version Numbering Strategy
- **1.0.142** - Major features
- **1.0.142a** - Quick fixes
- **1.0.142-TEST** - Testing versions
- **1.0.142-WORKING** - Verified working versions

### Version Info Updates
Always update these in `GreekMythologyMod.java`:
```java
public static final String MOD_VERSION = "1.0.142";
public static final String BUILD_VERSION_TITLE = "Feature Name";
public static final String BUILD_DATE = "2024-08-04";
public static final String BUILD_TIME = "11:51";
public static final String BUILD_FEATURES = "List of changes";
```

## 🧪 Testing Strategy

### Local Testing First
- Always test locally before deploying
- Use `./gradlew runClient` for quick testing
- Test in singleplayer worlds
- Create dedicated test worlds for complex features

### Remote Testing
- Deploy only after local verification
- Use `/greekversion` to confirm correct version
- Test with multiple players if needed
- Use `TESTING_CHECKLIST.md` for systematic testing

### Testing Checklist Usage
1. Copy `TESTING_CHECKLIST.md` to a new file
2. Fill in feature name and version
3. Complete all relevant checkboxes
4. Document any issues found
5. Save the completed checklist

## 💾 Progress Preservation

### Version Control Best Practices
```bash
# Before making changes
git status
git stash  # if needed

# After testing and verification
git add .
git commit -m "Feature: [Clear description] - Version X.X.X"
git push
```

### Backup Strategy
- Keep working mod versions in numbered files
- Create milestone backups after major features
- Use descriptive commit messages with version numbers
- Always have a working version available

## 🚨 Emergency Procedures

### If Something Breaks
1. **Immediate**: Revert to last working version
2. **Investigate**: Check logs and error messages
3. **Fix**: Make targeted fixes
4. **Test**: Verify the fix works
5. **Deploy**: Push the fix

### Recovery Commands
```bash
# Revert to last working version
git reset --hard HEAD~1

# Or restore from backup
cp backup/greek-mythology-1.0.141-WORKING.jar mods/
```

## 📚 Documentation

### Keep These Updated
- **CHANGELOG.txt** - Detailed change history
- **README.md** - Feature documentation
- **TESTING_GUIDE.md** - How to test features
- **KNOWN_ISSUES.md** - Current problems and solutions

### Documentation Best Practices
- Update documentation with each feature
- Include version numbers in documentation
- Document known issues and workarounds
- Keep testing procedures current

## 🎯 Best Practices

### Code Organization
- Keep related features in the same commit
- Use descriptive variable and method names
- Add comments for complex logic
- Follow consistent naming conventions

### Error Prevention
- Always check for null values
- Use try-catch blocks for risky operations
- Log important events for debugging
- Test edge cases

### Efficiency Boosters
- Use IDE shortcuts and templates
- Keep a "common code snippets" file
- Use search and replace for repetitive tasks
- Maintain a "known issues" list

## 🔍 Troubleshooting

### Common Issues

#### Build Failures
- Check for syntax errors
- Verify all imports are correct
- Check for missing dependencies
- Use IDE error checking

#### Runtime Crashes
- Check logs for error messages
- Verify null checks are in place
- Test with minimal setup
- Add error handling

#### Performance Issues
- Monitor FPS and memory usage
- Optimize particle effects
- Check for memory leaks
- Profile the code

#### Version Mismatches
- Update version info in `GreekMythologyMod.java`
- Check git status
- Verify deployment was successful
- Use `/greekversion` to confirm

## 📈 Performance Monitoring

### Local Performance
- Monitor FPS during testing
- Check memory usage
- Watch for lag spikes
- Test with different settings

### Server Performance
- Monitor TPS (ticks per second)
- Check memory usage
- Watch network traffic
- Monitor player count impact

## 🔗 Integration

### With Existing Systems
- Test integration with existing features
- Verify no conflicts with other mods
- Check compatibility with server setup
- Test with different player configurations

### With Development Tools
- Use IDE debugging features
- Leverage logging for troubleshooting
- Use version control effectively
- Maintain consistent coding standards

## 📞 Support

### Getting Help
- Check `KNOWN_ISSUES.md` first
- Review `TESTING_GUIDE.md` for testing procedures
- Check git history for similar issues
- Document new issues for future reference

### Contributing
- Follow the established workflow
- Use the testing checklist
- Update documentation
- Report issues with full details

---

## 🎉 Success Metrics

### Development Efficiency
- Reduced time from development to deployment
- Fewer bugs reaching production
- Faster issue resolution
- Consistent code quality

### Quality Assurance
- Systematic testing procedures
- Comprehensive documentation
- Version control best practices
- Emergency recovery procedures

### Team Collaboration
- Clear communication procedures
- Consistent development practices
- Shared knowledge base
- Effective issue tracking

---

*This guide should be updated as the development process evolves and new tools are added.* 