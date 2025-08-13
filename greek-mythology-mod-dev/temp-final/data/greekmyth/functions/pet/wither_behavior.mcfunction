# Wither Behavior - Basic pet behavior for wither skeletons

# Follow the owner if they are too far away
execute if entity @a[distance=10.., limit=1, sort=nearest] at @a[distance=10.., limit=1, sort=nearest] run tp @s ~ ~ ~

# Look at nearby players (but don't attack them)
# This creates the illusion of awareness without hostility

# For now, just make them stand still and look menacing
# We'll add proper targeting logic later when the datapack functions work properly
