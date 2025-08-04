#!/bin/bash

echo "🔧 Development Environment Setup - Greek Mythology Mod"
echo "====================================================="

# Create necessary directories
echo "📁 Creating directories..."
mkdir -p backup
mkdir -p working-versions
mkdir -p test-worlds
mkdir -p logs
mkdir -p temp

echo "✅ Directories created:"
echo "   - backup/ (for version backups)"
echo "   - working-versions/ (for verified working versions)"
echo "   - test-worlds/ (for testing worlds)"
echo "   - logs/ (for development logs)"
echo "   - temp/ (for temporary files)"

# Make scripts executable
echo ""
echo "🔧 Making scripts executable..."
chmod +x quick-test.sh
chmod +x deploy-safe.sh
chmod +x dev-setup.sh
chmod +x version-tracker.sh

echo "✅ Scripts made executable"

# Create initial backup
echo ""
echo "💾 Creating initial backup..."
if [ -f "../mods/greek-mythology-*.jar" ]; then
    cp ../mods/greek-mythology-*.jar "backup/greek-mythology-INITIAL-BACKUP-$(date +%Y%m%d-%H%M).jar"
    echo "✅ Initial backup created"
else
    echo "⚠️ No existing mod found for initial backup"
fi

# Check if gradle wrapper exists
echo ""
echo "🔍 Checking Gradle setup..."
if [ ! -f "gradlew" ]; then
    echo "❌ Gradle wrapper not found. Please ensure you're in the correct directory."
    exit 1
fi

# Test build
echo ""
echo "🧪 Testing build process..."
./gradlew build --dry-run

if [ $? -eq 0 ]; then
    echo "✅ Build system ready"
else
    echo "❌ Build system has issues. Please check your setup."
    exit 1
fi

echo ""
echo "🎉 Development environment setup complete!"
echo ""
echo "📋 Available commands:"
echo "   ./quick-test.sh    - Quick local testing"
echo "   ./deploy-safe.sh   - Safe deployment to server"
echo "   ./version-tracker.sh - Check current version info"
echo ""
echo "📁 Directory structure:"
echo "   backup/           - Version backups"
echo "   working-versions/ - Verified working versions"
echo "   test-worlds/      - Testing worlds"
echo "   logs/             - Development logs"
echo "   temp/             - Temporary files" 