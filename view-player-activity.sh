#!/bin/bash

# Player Activity Log Viewer Script
# This script helps view player activity logs from the command line

LOG_FILE="logs/player-activity.log"
DEFAULT_LINES=50

# Function to show usage
show_usage() {
    echo "Player Activity Log Viewer"
    echo "Usage: $0 [options]"
    echo ""
    echo "Options:"
    echo "  -f, --file <file>     Specify log file path (default: $LOG_FILE)"
    echo "  -n, --lines <number>  Number of lines to show (default: $DEFAULT_LINES)"
    echo "  -a, --all             Show all lines"
    echo "  -s, --search <term>   Search for specific terms"
    echo "  -h, --help            Show this help message"
    echo ""
    echo "Examples:"
    echo "  $0                    # Show last $DEFAULT_LINES lines"
    echo "  $0 -n 100            # Show last 100 lines"
    echo "  $0 -a                # Show all lines"
    echo "  $0 -s \"EnterFruit\"  # Search for EnterFruit activity"
    echo "  $0 -f \"test-server/logs/player-activity.log\"  # Use different log file"
}

# Function to colorize log entries
colorize_log() {
    local line="$1"
    
    if [[ "$line" == *"JOIN:"* ]]; then
        echo -e "\033[32m$line\033[0m"  # Green for joins
    elif [[ "$line" == *"LEAVE:"* ]]; then
        echo -e "\033[31m$line\033[0m"  # Red for leaves
    elif [[ "$line" == *"DEATH:"* ]]; then
        echo -e "\033[35m$line\033[0m"  # Magenta for deaths
    elif [[ "$line" == *"TELEPORT:"* ]]; then
        echo -e "\033[36m$line\033[0m"  # Cyan for teleports
    elif [[ "$line" == *"COMMAND:"* ]]; then
        echo -e "\033[33m$line\033[0m"  # Yellow for commands
    elif [[ "$line" == *"TIME_EVENT:"* ]]; then
        echo -e "\033[1;33m$line\033[0m"  # Bold yellow for time events
    elif [[ "$line" == *"SERVER_EVENT:"* ]]; then
        echo -e "\033[37m$line\033[0m"  # White for server events
    else
        echo "$line"
    fi
}

# Function to show log entries
show_log() {
    local file="$1"
    local lines="$2"
    local search_term="$3"
    
    if [[ ! -f "$file" ]]; then
        echo "Error: Log file '$file' not found!"
        return 1
    fi
    
    echo "=== Player Activity Log ==="
    echo "File: $file"
    echo "Lines: $lines"
    if [[ -n "$search_term" ]]; then
        echo "Search: $search_term"
    fi
    echo "=========================="
    echo ""
    
    if [[ -n "$search_term" ]]; then
        # Search mode
        grep -i "$search_term" "$file" | tail -n "$lines" | while read -r line; do
            colorize_log "$line"
        done
    else
        # Normal mode
        tail -n "$lines" "$file" | while read -r line; do
            colorize_log "$line"
        done
    fi
    
    echo ""
    echo "=== End of Log ==="
}

# Parse command line arguments
LINES=$DEFAULT_LINES
SEARCH_TERM=""
ALL_LINES=false

while [[ $# -gt 0 ]]; do
    case $1 in
        -f|--file)
            LOG_FILE="$2"
            shift 2
            ;;
        -n|--lines)
            LINES="$2"
            shift 2
            ;;
        -a|--all)
            ALL_LINES=true
            shift
            ;;
        -s|--search)
            SEARCH_TERM="$2"
            shift 2
            ;;
        -h|--help)
            show_usage
            exit 0
            ;;
        *)
            echo "Unknown option: $1"
            show_usage
            exit 1
            ;;
    esac
done

# Handle --all option
if [[ "$ALL_LINES" == true ]]; then
    LINES=$(wc -l < "$LOG_FILE" 2>/dev/null || echo "1000")
fi

# Show the log
show_log "$LOG_FILE" "$LINES" "$SEARCH_TERM"














