# Check Attack Target - Determine what the player is attacking

# Check if player is attacking a player
execute if entity @e[type=player, distance=..4, tag=!GreekPet.Owner] run tag @s add GreekPet.AttackingPlayer

# Check if player is attacking a mob
execute if entity @e[type=!player, type=!item, type=!experience_orb, distance=..4] run tag @s add GreekPet.AttackingMob

# Tag that player has a target
execute if entity @s[tag=GreekPet.AttackingPlayer] run tag @s add GreekPet.HasTarget
execute if entity @s[tag=GreekPet.AttackingMob] run tag @s add GreekPet.HasTarget 