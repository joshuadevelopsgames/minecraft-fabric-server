# Custom Dimension Quick Reference

## 📁 File Structure
```
src/main/resources/data/yourmod/
├── dimension_type/your_dimension.json
├── dimension/your_dimension.json
├── worldgen/noise_settings/your_noise.json
└── worldgen/biome/your_biome.json
```

## 🚀 Quick Start Template

### 1. Dimension Type (`dimension_type/your_dimension.json`)
```json
{
    "ambient_light": 0.0,
    "bed_works": false,
    "coordinate_scale": 1.0,
    "has_ceiling": false,
    "has_raids": false,
    "has_skylight": false,
    "effects": "minecraft:the_end",
    "min_y": 0,
    "height": 256,
    "logical_height": 256,
    "infiniburn": "#minecraft:infiniburn_overworld",
    "monster_spawn_block_light_limit": 15,
    "monster_spawn_light_level": 15,
    "natural": false,
    "piglin_safe": false,
    "respawn_anchor_works": false,
    "ultrawarm": false
}
```

### 2. Dimension (`dimension/your_dimension.json`)
```json
{
    "type": "yourmod:your_dimension",
    "generator": {
        "type": "minecraft:noise",
        "settings": "yourmod:your_noise",
        "biome_source": {
            "type": "minecraft:fixed",
            "biome": "yourmod:your_biome"
        }
    }
}
```

### 3. Java Integration
```java
// Dimension Manager
public static final RegistryKey<World> YOUR_DIMENSION = 
    RegistryKey.of(RegistryKeys.WORLD, Identifier.of("yourmod", "your_dimension"));

// Teleport Command
player.teleport(yourDimension, 0.5, 64, 0.5, Set.of(), player.getYaw(), player.getPitch(), false);
```

## 🎨 Effects Options
- `"minecraft:overworld"` - Sun, stars, moon, rain fog
- `"minecraft:the_nether"` - Thick fog, nether atmosphere  
- `"minecraft:the_end"` - Dark spotted sky, end atmosphere

## 🔧 Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| "Failed to parse JSON" | Check syntax, required fields |
| "Dimension not available" | Verify JSON files exist, restart server |
| Teleport fails | Use `player.teleport(world, x, y, z, Set.of(), yaw, pitch, false)` |
| Server won't start | Check logs for JSON errors |

## ✅ Testing Checklist
- [ ] Build successful
- [ ] Server starts
- [ ] Dimension loads
- [ ] Teleport works
- [ ] Custom features function

## 📚 Working Examples
- **Tartarus**: `greekmyth:tartarus` (void + jail system)
- **Pocket Dimension**: `pocket_dimension:sky_islands` (floating islands)
- **Fabric Testmod**: `fabric_dimension:void` (basic void)

---
*Based on successful Tartarus dimension implementation* 