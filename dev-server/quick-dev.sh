#!/bin/bash

# Quick Development Script
# Builds, deploys, and starts the development server

echo "🚀 Quick Development Setup"
echo "=========================="

# Step 1: Build and deploy
echo "📦 Building and deploying mod..."
./deploy-to-dev.sh

if [ $? -eq 0 ]; then
    echo ""
    echo "🎮 Starting development server..."
    echo "Press Ctrl+C to stop the server"
    echo ""
    
    # Step 2: Start the dev server
    ./start-dev-server.sh
else
    echo "❌ Build failed! Fix errors and try again."
    exit 1
fi 