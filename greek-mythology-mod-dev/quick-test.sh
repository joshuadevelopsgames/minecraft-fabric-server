#!/bin/bash

echo "🚀 Quick Test Cycle - Greek Mythology Mod"
echo "=========================================="

# Check if we're in the right directory
if [ ! -f "build.gradle" ]; then
    echo "❌ Error: build.gradle not found. Please run this script from the mod directory."
    exit 1
fi

echo "📦 Building mod..."
./gradlew build

if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
    
    # Get the version from the mod file
    VERSION=$(grep 'MOD_VERSION' src/main/java/com/example/greekmyth/GreekMythologyMod.java | cut -d'"' -f2)
    TIMESTAMP=$(date +%Y%m%d-%H%M)
    
    # Create test jar with timestamp
    TEST_JAR="greek-mythology-${VERSION}-TEST-${TIMESTAMP}.jar"
    cp build/libs/greek-mythology-*.jar "$TEST_JAR"
    
    echo "📁 Test jar created: $TEST_JAR"
    echo "🎮 Ready for local testing with: ./gradlew runClient"
    echo ""
    echo "💡 Next steps:"
    echo "   1. Run: ./gradlew runClient"
    echo "   2. Test the feature in singleplayer"
    echo "   3. If working, run: ./deploy-safe.sh"
    echo "   4. If broken, check logs and fix"
else
    echo "❌ Build failed! Check the error messages above."
    exit 1
fi 