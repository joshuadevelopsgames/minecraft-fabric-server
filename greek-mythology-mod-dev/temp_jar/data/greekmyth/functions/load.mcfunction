# Greek Mythology Pet System - Load Function
# This function runs when the datapack loads

tellraw @a {"text":"Greek Mythology Pet System loaded!","color":"green"}

# Set up scoreboard objectives for pet tracking
scoreboard objectives add GreekPet.Owner dummy "Pet Owner"
scoreboard objectives add GreekPet.Target dummy "Current Target"
scoreboard objectives add GreekPet.AttackCooldown dummy "Attack Cooldown"

# Tag all existing wither skeletons with our custom names as pets
execute as @e[type=wither_skeleton, name="*Enhanced Wither Skeleton"] run tag @s add GreekPet.Pet
execute as @e[type=wither_skeleton, name="*Enhanced Wither Skeleton"] run tag @s add GreekPet.WitherSkeleton

# Schedule the main tick function
schedule function greekmyth:tick 1t 