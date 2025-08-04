# Attack Mobs - Make pet attack nearby hostile mobs

# Target nearby hostile mobs (zombies, skeletons, creepers, etc.)
execute as @e[type=zombie, distance=..8, limit=1, sort=nearest] unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_entity
execute as @e[type=skeleton, distance=..8, limit=1, sort=nearest] unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_entity
execute as @e[type=creeper, distance=..8, limit=1, sort=nearest] unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_entity
execute as @e[type=spider, distance=..8, limit=1, sort=nearest] unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_entity
execute as @e[type=enderman, distance=..8, limit=1, sort=nearest] unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_entity

# Don't attack the owner or other pets
execute unless entity @e[type=player, distance=..8, tag=!GreekPet.Owner] run tag @s remove GreekPet.HasTarget 