# Find Owner - Set the pet's owner

# Tag this pet as having an owner
tag @s add GreekPet.HasOwner

# Store the owner's UUID for this pet
execute store result score @s GreekPet.Owner run data get entity @p UUID[0]
execute store result score @s GreekPet.Owner run data get entity @p UUID[1]

# Log the owner assignment
tellraw @p {"text":"Your pet wither skeleton is now tracking you!","color":"green"} 