# Target Entity - Make pet target a specific entity

# Tag the pet as having a target
tag @s add GreekPet.HasTarget

# Store the target entity's position
execute store result score #target_x GreekPet.Calc run data get entity @e[limit=1, sort=nearest] Pos[0]
execute store result score #target_y GreekPet.Calc run data get entity @e[limit=1, sort=nearest] Pos[1]
execute store result score #target_z GreekPet.Calc run data get entity @e[limit=1, sort=nearest] Pos[2]

# Make the pet move toward the target
execute at @e[limit=1, sort=nearest] run tp @s ~ ~ ~ ~ ~ 