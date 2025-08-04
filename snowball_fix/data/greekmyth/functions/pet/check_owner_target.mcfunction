# Check Owner Target - Make pet target what owner is attacking

# Get the owner's current target
execute as @a if score @s GreekPet.Owner = @s GreekPet.Owner if entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/target_owner_target

# If owner is attacking a player, pet should also target that player
execute as @a if score @s GreekPet.Owner = @s GreekPet.Owner if entity @s[tag=GreekPet.AttackingPlayer] run function greekmyth:pet/target_player

# If owner is attacking a mob, pet should also target that mob
execute as @a if score @s GreekPet.Owner = @s GreekPet.Owner if entity @s[tag=GreekPet.AttackingMob] run function greekmyth:pet/target_mob

# If owner has no specific target, pet should attack nearby hostile mobs
execute as @a if score @s GreekPet.Owner = @s GreekPet.Owner unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/attack_mobs 