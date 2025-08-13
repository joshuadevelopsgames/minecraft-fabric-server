# Track Target - Track what each player is targeting

# Clear previous target tags
tag @s remove GreekPet.HasTarget
tag @s remove GreekPet.AttackingPlayer
tag @s remove GreekPet.AttackingMob

# Check if player is attacking something
execute if entity @s[tag=GreekPet.Owner] run function greekmyth:player/check_attack_target

# Store the player's current target for pets to reference
execute if entity @s[tag=GreekPet.Owner] run function greekmyth:player/store_target 