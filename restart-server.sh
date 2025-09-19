#!/bin/bash

echo "🔄 Restarting Minecraft server..."
echo "📋 Using existing restart script on server..."

# Try to restart the server using the existing script
ssh root@178.156.165.14 "cd ~/minecraft && ./scripts/restart.sh"

echo "✅ Server restart command sent!"
echo ""
echo "📝 Note: If you see SSH authentication errors, you may need to:"
echo "   1. Check your SSH key configuration"
echo "   2. Manually restart the server on the remote machine"
echo "   3. Or use the server's web panel if available"

