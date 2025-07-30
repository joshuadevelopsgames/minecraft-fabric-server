# Greek Mythology Modpack Overrides

This directory contains configuration files that are automatically applied when the modpack is installed.

## Files Included:

### `options.txt`
- **Purpose**: Disables the narrator opening screen and sets default Minecraft options
- **Key Setting**: `narrator:0` - Disables the narrator accessibility screen
- **Effect**: Players will no longer see the narrator accessibility prompt when first launching the modpack

### Other Settings in options.txt:
- Standard keybindings for common actions
- Optimized graphics settings (render distance: 12, view distance: 12)
- Balanced sound levels (master: 100%, music: 50%)
- Disabled auto-jump for better control
- Enabled VSync for smoother performance

## For Future Modpack Exports:
- Always include this `options.txt` file in the overrides directory
- The `narrator:0` setting ensures a smoother first-time experience
- Players can still enable narrator in-game if they need accessibility features
- This setting only affects the initial launch screen, not in-game narrator functionality

## Installation:
These files are automatically copied to the Minecraft installation directory when the modpack is installed. 