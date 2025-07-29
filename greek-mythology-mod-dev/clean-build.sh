#!/bin/bash

# Clean Build Script for Greek Mythology Mod
# This script ensures no backup files are included in the final JAR

echo "🧹 Cleaning build directory..."
cd ../fabric-1.21.8 && ./gradlew clean

echo "🗑️  Removing any backup files from source..."
cd ../greek-mythology-mod-dev
find . -name "*.backup" -type f -delete
find . -name "*_backup.*" -type f -delete
find . -name "fabric.mod.json.backup" -type f -delete

echo "🔍 Checking for backup files in source directories..."
BACKUP_FILES=$(find . -name "*.backup" -o -name "*_backup.*" 2>/dev/null)
if [ -n "$BACKUP_FILES" ]; then
    echo "⚠️  Found backup files:"
    echo "$BACKUP_FILES"
    echo "❌ Please remove these files before building!"
    exit 1
fi

echo "🏗️  Building mod..."
cd ../fabric-1.21.8 && ./gradlew build

if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
    
    # Check the built JAR for backup files
    echo "🔍 Checking built JAR for backup files..."
    JAR_FILE="../greek-mythology-mod-dev/build/libs/greek-mythology-1.0.69.jar"
    
    if [ -f "$JAR_FILE" ]; then
        BACKUP_IN_JAR=$(jar -tf "$JAR_FILE" | grep -E "\.backup|_backup\." 2>/dev/null)
        
        if [ -n "$BACKUP_IN_JAR" ]; then
            echo "⚠️  Found backup files in JAR:"
            echo "$BACKUP_IN_JAR"
            echo "🧹 Cleaning JAR..."
            
            # Extract, clean, and repack
            TEMP_DIR=$(mktemp -d)
            cd "$TEMP_DIR"
            jar -xf "../../$JAR_FILE"
            
            # Remove backup files
            find . -name "*.backup" -type f -delete
            find . -name "*_backup.*" -type f -delete
            
            # Repack
            jar -cf "../../$JAR_FILE" *
            cd - > /dev/null
            rm -rf "$TEMP_DIR"
            
            echo "✅ JAR cleaned successfully!"
        else
            echo "✅ No backup files found in JAR!"
        fi
    else
        echo "❌ JAR file not found: $JAR_FILE"
        exit 1
    fi
    
    echo "📦 Mod built successfully without backup files!"
else
    echo "❌ Build failed!"
    exit 1
fi 