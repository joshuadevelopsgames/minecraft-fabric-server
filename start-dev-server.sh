#!/bin/bash

echo "Starting Fresh Minecraft Fabric Development Server..."

# Set Java options for development
export JAVA_OPTS="-Xmx2G -Xms1G"

# Start the Fabric server
java $JAVA_OPTS -jar fabric-server-launch.jar nogui

echo "Development server stopped." 