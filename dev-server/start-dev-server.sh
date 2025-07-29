#!/bin/bash

# Development Server Startup Script
# This runs a local development server for testing mod changes

echo "Starting Minecraft Fabric Development Server..."

# Set Java options for development
export JAVA_OPTS="-Xmx2G -Xms1G"

# Use standardized world directory
WORLD_DIR="world-dev"

# Create a development world if it doesn't exist
if [ ! -d "$WORLD_DIR" ]; then
    echo "Creating development world..."
    mkdir -p $WORLD_DIR
fi

# Start the Fabric server using the launcher (same as production)
java $JAVA_OPTS -jar fabric-server-launch.jar nogui

echo "Development server stopped." 