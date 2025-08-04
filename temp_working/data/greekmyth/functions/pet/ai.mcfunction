# Pet AI - Main behavior function for each pet wither skeleton

# Extract owner name from custom name (format: "§6[OwnerName]'s Enhanced Wither Skeleton")
execute store result score #temp GreekPet.Calc run data get entity @s CustomName
execute store result storage greekmyth:temp name string run data get entity @s CustomName

# Find the owner by name
execute as @a if score @s GreekPet.Owner = #temp GreekPet.Calc run function greekmyth:pet/find_owner

# If we have an owner, check their target
execute if score @s GreekPet.Owner = #temp GreekPet.Calc if entity @s[tag=GreekPet.HasOwner] run function greekmyth:pet/check_owner_target

# If no owner found, try to find one by name pattern
execute unless score @s GreekPet.Owner = #temp GreekPet.Calc run function greekmyth:pet/find_owner_by_name

# Attack nearby hostile mobs if no specific target
execute unless entity @s[tag=GreekPet.HasTarget] run function greekmyth:pet/attack_mobs 