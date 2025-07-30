# Minecraft Fabric 1.21.8 Custom Dimension Creation Guide

## 🎯 Overview

This guide shows how to create custom dimensions in Minecraft Fabric 1.21.8 using a data-driven approach. Based on successful implementation of the Tartarus dimension system.

## 📁 Required File Structure

```
src/main/resources/data/yourmod/
├── dimension_type/
│   └── your_dimension.json
├── dimension/
│   └── your_dimension.json
├── worldgen/
│   ├── noise_settings/
│   │   └── your_noise.json
│   └── biome/
│       └── your_biome.json
```

## 🏗️ Step 1: Create Dimension Type

**File:** `src/main/resources/data/yourmod/dimension_type/your_dimension.json`

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

### Key Properties Explained:

- **`ambient_light`**: 0.0 = no ambient light, 1.0 = full ambient light
- **`effects`**: 
  - `"minecraft:overworld"` - Sun, stars, moon, rain fog
  - `"minecraft:the_nether"` - Thick fog, nether atmosphere
  - `"minecraft:the_end"` - Dark spotted sky, end atmosphere
- **`coordinate_scale`**: Multiplier for coordinates when leaving dimension
- **`has_skylight`**: Whether dimension has sky lighting
- **`min_y`** and **`height`**: World height limits (must be multiples of 16)
- **`natural`**: false = compasses spin randomly, beds disabled

## 🌍 Step 2: Create Noise Settings

**File:** `src/main/resources/data/yourmod/worldgen/noise_settings/your_noise.json`

### For Void Dimension:
```json
{
  "aquifers_enabled": false,
  "default_block": {
    "Name": "minecraft:air"
  },
  "default_fluid": {
    "Name": "minecraft:air"
  },
  "disable_mob_generation": true,
  "legacy_random_source": true,
  "noise": {
    "height": 128,
    "min_y": 0,
    "size_horizontal": 2,
    "size_vertical": 1
  },
  "noise_router": {
    "barrier": 0.0,
    "continents": 0.0,
    "depth": 0.0,
    "erosion": {
      "type": "minecraft:end_islands"
    },
    "final_density": {
      "type": "minecraft:end_islands"
    },
    "fluid_level_floodedness": 0.0,
    "fluid_level_spread": 0.0,
    "initial_density_without_jaggedness": {
      "type": "minecraft:end_islands"
    },
    "lava": 0.0,
    "ridges": 0.0,
    "temperature": 0.0,
    "vegetation": 0.0,
    "vein_gap": {
      "type": "minecraft:noise",
      "noise": "minecraft:ore_gap",
      "xz_scale": 1.0,
      "y_scale": 1.0
    },
    "vein_ridged": 0.0,
    "vein_toggle": 0.0
  },
  "ore_veins_enabled": false,
  "sea_level": 0,
  "spawn_target": [],
  "surface_rule": {
    "type": "minecraft:sequence",
    "sequence": [
      {
        "type": "minecraft:condition",
        "if_true": {
          "type": "minecraft:stone_depth",
          "offset": 0,
          "surface_type": "floor",
          "add_surface_depth": false,
          "secondary_depth_range": 0
        },
        "then_run": {
          "type": "minecraft:block",
          "result_state": {
            "Name": "minecraft:air"
          }
        }
      }
    ]
  }
}
```

### For Normal Terrain:
```json
{
  "aquifers_enabled": true,
  "default_block": {
    "Name": "minecraft:stone"
  },
  "default_fluid": {
    "Name": "minecraft:water"
  },
  "disable_mob_generation": false,
  "legacy_random_source": true,
  "noise": {
    "height": 128,
    "min_y": 0,
    "size_horizontal": 2,
    "size_vertical": 1
  },
  "noise_router": {
    "barrier": 0.0,
    "continents": 0.0,
    "depth": 0.0,
    "erosion": {
      "type": "minecraft:cache_2d",
      "argument": {
        "type": "minecraft:end_islands"
      }
    },
    "final_density": {
      "type": "minecraft:squeeze",
      "argument": {
        "type": "minecraft:mul",
        "argument1": 0.64,
        "argument2": {
          "type": "minecraft:interpolated",
          "argument": {
            "type": "minecraft:blend_density",
            "argument": {
              "type": "minecraft:add",
              "argument1": -0.234375,
              "argument2": {
                "type": "minecraft:mul",
                "argument1": {
                  "type": "minecraft:y_clamped_gradient",
                  "from_value": 0.0,
                  "from_y": 4,
                  "to_value": 1.0,
                  "to_y": 32
                },
                "argument2": {
                  "type": "minecraft:add",
                  "argument1": 0.234375,
                  "argument2": {
                    "type": "minecraft:add",
                    "argument1": -23.4375,
                    "argument2": {
                      "type": "minecraft:mul",
                      "argument1": {
                        "type": "minecraft:y_clamped_gradient",
                        "from_value": 1.0,
                        "from_y": 56,
                        "to_value": 0.0,
                        "to_y": 312
                      },
                      "argument2": {
                        "type": "minecraft:add",
                        "argument1": 23.4375,
                        "argument2": "minecraft:end/sloped_cheese"
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    },
    "fluid_level_floodedness": 0.0,
    "fluid_level_spread": 0.0,
    "initial_density_without_jaggedness": {
      "type": "minecraft:add",
      "argument1": -0.234375,
      "argument2": {
        "type": "minecraft:mul",
        "argument1": {
          "type": "minecraft:y_clamped_gradient",
          "from_value": 0.0,
          "from_y": 4,
          "to_value": 1.0,
          "to_y": 32
        },
        "argument2": {
          "type": "minecraft:add",
          "argument1": 0.234375,
          "argument2": {
            "type": "minecraft:add",
            "argument1": -23.4375,
            "argument2": {
              "type": "minecraft:mul",
              "argument1": {
                "type": "minecraft:y_clamped_gradient",
                "from_value": 1.0,
                "from_y": 56,
                "to_value": 0.0,
                "to_y": 312
              },
              "argument2": {
                "type": "minecraft:add",
                "argument1": 23.4375,
                "argument2": {
                  "type": "minecraft:add",
                  "argument1": -0.703125,
                  "argument2": {
                    "type": "minecraft:cache_2d",
                    "argument": {
                      "type": "minecraft:end_islands"
                    }
                  }
                }
              }
            }
          }
        }
      }
    },
    "lava": 0.0,
    "ridges": 0.0,
    "temperature": 0.0,
    "vegetation": 0.0,
    "vein_gap": {
      "type": "minecraft:noise",
      "noise": "minecraft:ore_gap",
      "xz_scale": 1.0,
      "y_scale": 1.0
    },
    "vein_ridged": {
      "type": "minecraft:add",
      "argument1": -0.07999999821186066,
      "argument2": {
        "type": "minecraft:max",
        "argument1": {
          "type": "minecraft:abs",
          "argument": {
            "type": "minecraft:interpolated",
            "argument": {
              "type": "minecraft:range_choice",
              "input": "minecraft:y",
              "max_exclusive": 51.0,
              "min_inclusive": -60.0,
              "when_in_range": {
                "type": "minecraft:noise",
                "noise": "minecraft:ore_vein_a",
                "xz_scale": 4.0,
                "y_scale": 4.0
              },
              "when_out_of_range": 0.0
            }
          }
        },
        "argument2": {
          "type": "minecraft:abs",
          "argument": {
            "type": "minecraft:interpolated",
            "argument": {
              "type": "minecraft:range_choice",
              "input": "minecraft:y",
              "max_exclusive": 51.0,
              "min_inclusive": -60.0,
              "when_in_range": {
                "type": "minecraft:noise",
                "noise": "minecraft:ore_vein_b",
                "xz_scale": 4.0,
                "y_scale": 4.0
              },
              "when_out_of_range": 0.0
            }
          }
        }
      }
    },
    "vein_toggle": {
      "type": "minecraft:interpolated",
      "argument": {
        "type": "minecraft:range_choice",
        "input": "minecraft:y",
        "max_exclusive": 51.0,
        "min_inclusive": -60.0,
        "when_in_range": {
          "type": "minecraft:noise",
          "noise": "minecraft:ore_veininess",
          "xz_scale": 1.5,
          "y_scale": 1.5
        },
        "when_out_of_range": 0.0
      }
    }
  },
  "ore_veins_enabled": true,
  "sea_level": 0,
  "spawn_target": [],
  "surface_rule": {
    "type": "minecraft:sequence",
    "sequence": [
      {
        "type": "minecraft:condition",
        "if_true": {
          "type": "minecraft:stone_depth",
          "offset": 0,
          "surface_type": "floor",
          "add_surface_depth": false,
          "secondary_depth_range": 0
        },
        "then_run": {
          "type": "minecraft:block",
          "result_state": {
            "Name": "minecraft:grass_block",
            "Properties": {
              "snowy": "false"
            }
          }
        }
      },
      {
        "type": "minecraft:condition",
        "if_true": {
          "type": "minecraft:stone_depth",
          "offset": 0,
          "surface_type": "floor",
          "add_surface_depth": true,
          "secondary_depth_range": 0
        },
        "then_run": {
          "type": "minecraft:block",
          "result_state": {
            "Name": "minecraft:dirt"
          }
        }
      }
    ]
  }
}
```

## 🌱 Step 3: Create Biome

**File:** `src/main/resources/data/yourmod/worldgen/biome/your_biome.json`

### For Void Biome:
```json
{
    "carvers": [],
    "downfall": 0.0,
    "effects": {
        "fog_color": 0,
        "foliage_color": 0,
        "grass_color": 0,
        "sky_color": 0,
        "water_color": 0,
        "water_fog_color": 0
    },
    "features": [
        [],
        [],
        [],
        [],
        [],
        [],
        [],
        [],
        [],
        [],
        []
    ],
    "has_precipitation": false,
    "spawn_costs": {},
    "spawners": {
        "ambient": [],
        "axolotls": [],
        "creature": [],
        "misc": [],
        "monster": [],
        "underground_water_creature": [],
        "water_ambient": [],
        "water_creature": []
    },
    "temperature": 0.0
}
```

### For Normal Biome:
```json
{
    "carvers": [
        "minecraft:cave",
        "minecraft:cave_extra_underground",
        "minecraft:canyon"
    ],
    "downfall": 0.4,
    "effects": {
        "fog_color": 12638463,
        "foliage_color": 28646,
        "grass_color": 28646,
        "sky_color": 8103167,
        "water_color": 4445678,
        "water_fog_color": 329011
    },
    "features": [
        [
            "minecraft:void_start_platform",
            "minecraft:glow_lichen",
            "minecraft:ore_coal_upper",
            "minecraft:ore_iron_upper",
            "minecraft:ore_gold",
            "minecraft:ore_diamond"
        ],
        [
            "minecraft:glow_lichen",
            "minecraft:ore_coal_upper",
            "minecraft:ore_iron_upper",
            "minecraft:ore_gold",
            "minecraft:ore_diamond"
        ]
    ],
    "has_precipitation": true,
    "spawn_costs": {},
    "spawners": {
        "ambient": [],
        "axolotls": [],
        "creature": [
            {
                "type": "minecraft:sheep",
                "maxCount": 4,
                "minCount": 4,
                "weight": 12
            }
        ],
        "misc": [],
        "monster": [
            {
                "type": "minecraft:spider",
                "maxCount": 4,
                "minCount": 4,
                "weight": 100
            }
        ],
        "underground_water_creature": [],
        "water_ambient": [],
        "water_creature": []
    },
    "temperature": 0.5
}
```

## 🔗 Step 4: Create Dimension

**File:** `src/main/resources/data/yourmod/dimension/your_dimension.json`

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

## 💻 Step 5: Java Code Integration

### Create Dimension Manager:
```java
package com.example.yourmod.dimension;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class YourDimensionManager {
    
    // Dimension key
    public static final RegistryKey<World> YOUR_DIMENSION = RegistryKey.of(RegistryKeys.WORLD, Identifier.of("yourmod", "your_dimension"));
    
    public static void init() {
        // Initialize dimension manager
    }
    
    public static RegistryKey<World> getYourDimension() {
        return YOUR_DIMENSION;
    }
}
```

### Add to Main Mod Class:
```java
@Override
public void onInitialize() {
    // Initialize dimension manager
    YourDimensionManager.init();
}
```

### Create Teleport Command:
```java
// In your command registration
if (dimension.equalsIgnoreCase("yourdimension")) {
    ServerWorld yourDimension = player.getServer().getWorld(YourDimensionManager.getYourDimension());
    if (yourDimension != null) {
        // Use proper cross-dimension teleport
        player.teleport(yourDimension, 0.5, 64, 0.5, Set.of(), player.getYaw(), player.getPitch(), false);
        player.sendMessage(Text.literal("§6Teleported to Your Dimension!").formatted(Formatting.GOLD));
    } else {
        context.getSource().sendFeedback(() -> Text.literal("§cDimension not available!").formatted(Formatting.RED), false);
    }
}
```

## 🧪 Step 6: Testing

### Build and Deploy:
```bash
gradle clean build
scp build/libs/yourmod.jar user@server:/path/to/mods/
```

### Test Commands:
- `/visit yourdimension` - Test teleportation
- `/execute in yourmod:your_dimension run tp @p 0 64 0` - Alternative test

### Check Logs:
```bash
tail -f logs/latest.log | grep -i "dimension\|yourmod"
```

## 🔧 Troubleshooting

### Common Issues:

1. **"Failed to parse dimension JSON"**
   - Check JSON syntax
   - Ensure all required fields are present
   - Verify file paths are correct

2. **"Dimension not available"**
   - Dimension not loaded at world creation
   - Check if dimension JSON is in correct location
   - Verify dimension type exists

3. **Teleport fails**
   - Use proper teleport method: `player.teleport(world, x, y, z, Set.of(), yaw, pitch, false)`
   - Ensure dimension exists before teleporting

4. **Server won't start**
   - Check for JSON parsing errors
   - Verify all referenced files exist
   - Check for missing dependencies

### Debug Commands:
```bash
# Check if dimension is loaded
grep -i "dimension" logs/latest.log

# Check for JSON errors
grep -i "parse\|error" logs/latest.log

# Verify mod loading
grep -i "yourmod" logs/latest.log
```

## 📚 Reference Examples

### Working Examples:
- **Tartarus Dimension**: `greekmyth:tartarus`
- **Pocket Dimension**: `pocket_dimension:sky_islands`
- **Fabric Testmod**: `fabric_dimension:void`

### Useful Resources:
- [Fabric Dimensions API](https://github.com/FabricMC/fabric/tree/1.21.8/fabric-dimensions-v1)
- [Minecraft Wiki - Dimensions](https://minecraft.wiki/w/Custom_dimension)
- [Fabric Testmod Examples](https://github.com/FabricMC/fabric/tree/1.21.8/fabric-dimensions-v1/src/testmod)

## ✅ Success Checklist

- [ ] Dimension type JSON created
- [ ] Noise settings JSON created
- [ ] Biome JSON created
- [ ] Dimension JSON created
- [ ] Java dimension manager created
- [ ] Teleport command implemented
- [ ] Mod builds successfully
- [ ] Server starts without errors
- [ ] Dimension loads at world creation
- [ ] Teleport command works
- [ ] Custom structures generate (if applicable)

## 🎯 Best Practices

1. **Start Simple**: Begin with void dimensions before complex terrain
2. **Test Incrementally**: Test each component separately
3. **Use Working Examples**: Reference successful implementations
4. **Check Logs**: Always monitor server logs for errors
5. **Backup Worlds**: Test on new worlds to avoid conflicts
6. **Version Control**: Keep track of working configurations

---

**This guide is based on successful implementation of the Tartarus dimension system in Minecraft Fabric 1.21.8.** 