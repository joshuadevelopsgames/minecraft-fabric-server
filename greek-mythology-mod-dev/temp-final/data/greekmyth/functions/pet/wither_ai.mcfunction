# Wither Skeleton Pet AI - Main behavior function for wither skeleton pets

# Extract owner name from custom name (format: "§6[OwnerName]'s Enhanced Wither Skeleton")
execute store result storage greekmyth:temp owner_name string run data get entity @s CustomName

# Simple approach: find the closest player as the likely owner
execute as @a[distance=..20, limit=1, sort=nearest] run function greekmyth:pet/set_owner

# If we have an owner nearby, follow basic pet behavior
execute if entity @a[distance=..20] run function greekmyth:pet/wither_behavior
