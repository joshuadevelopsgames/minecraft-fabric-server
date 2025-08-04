# Greek Mythology Pet System - Main Tick Function
# This function runs every tick to handle pet behavior

# Tag any new wither skeleton pets that might have been created
execute as @e[type=wither_skeleton, name="*Enhanced Wither Skeleton", tag=!GreekPet.Pet] run tag @s add GreekPet.Pet
execute as @e[type=wither_skeleton, name="*Enhanced Wither Skeleton", tag=!GreekPet.WitherSkeleton] run tag @s add GreekPet.WitherSkeleton

# Process all pet wither skeletons
execute as @e[type=wither_skeleton, tag=GreekPet.Pet] run function greekmyth:pet/wither_ai

# Process all players to track their targets
execute as @a run function greekmyth:player/track_target

# Schedule the next tick
schedule function greekmyth:tick 1t 