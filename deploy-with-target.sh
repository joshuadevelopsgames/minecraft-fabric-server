#!/bin/bash

# Deployment Script with Target Clarification
# This script asks where you want to deploy if not specified

echo "🎯 DEPLOYMENT TARGET SELECTION"
echo "=============================="

# Check if target was specified in arguments
if [ "$1" = "dev" ] || [ "$1" = "development" ]; then
    TARGET="dev"
elif [ "$1" = "prod" ] || [ "$1" = "production" ] || [ "$1" = "server" ]; then
    TARGET="prod"
else
    # Ask user for target
    echo ""
    echo "Where would you like to deploy?"
    echo "1) Development (localhost:25565) - Safe testing"
    echo "2) Production (178.156.165.14:25565) - Live server"
    echo ""
    read -p "Enter choice (1 or 2): " choice
    
    case $choice in
        1) TARGET="dev" ;;
        2) TARGET="prod" ;;
        *) echo "Invalid choice. Exiting."; exit 1 ;;
    esac
fi

# Deploy based on target
if [ "$TARGET" = "dev" ]; then
    echo ""
    echo "🏗️ Deploying to DEVELOPMENT environment..."
    cd dev-server
    ./deploy-to-dev.sh
    echo ""
    echo "✅ Deployed to development server!"
    echo "Connect to: localhost:25565"
elif [ "$TARGET" = "prod" ]; then
    echo ""
    echo "🚀 Deploying to PRODUCTION server..."
    ./deploy.sh
    echo ""
    echo "✅ Deployed to production server!"
    echo "Connect to: 178.156.165.14:25565"
else
    echo "❌ Invalid target. Use 'dev' or 'prod'"
    exit 1
fi 