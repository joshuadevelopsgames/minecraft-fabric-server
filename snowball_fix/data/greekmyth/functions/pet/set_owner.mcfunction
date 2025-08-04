# Set Owner - Assign the closest player as the pet owner

# Tag this player as the owner
tag @s add GreekPet.Owner

# Store some basic owner info
scoreboard players set @s GreekPet.Owner 1

# Log the assignment
tellraw @s {"text":"A wither skeleton pet is now following you!","color":"yellow"}
