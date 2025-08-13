# Store Target - Store the player's current target

# Store target information in scoreboard for pets to reference
execute if entity @s[tag=GreekPet.HasTarget] run scoreboard players set @s GreekPet.Target 1
execute unless entity @s[tag=GreekPet.HasTarget] run scoreboard players set @s GreekPet.Target 0

# Store the target entity's UUID for pets to track
execute if entity @s[tag=GreekPet.HasTarget] as @e[limit=1, sort=nearest] run scoreboard players operation @s GreekPet.Target = @e[limit=1, sort=nearest] UUID[0] 