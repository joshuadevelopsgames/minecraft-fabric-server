# Parse Owner Name - Extract owner name from custom name

# For now, use a simple approach - find the closest player
# This is a fallback if the name parsing doesn't work
execute as @a[distance=..20, limit=1, sort=nearest] run function greekmyth:pet/find_owner

# If no nearby players, the pet will remain untamed
execute unless entity @a[distance=..20] run tag @s remove GreekPet.HasOwner 