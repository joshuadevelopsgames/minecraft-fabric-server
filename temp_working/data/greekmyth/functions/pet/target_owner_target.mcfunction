# Target Owner Target - Make pet target what owner is targeting

# Get the owner's target and make pet target the same
execute as @a if score @s GreekPet.Owner = @s GreekPet.Owner run function greekmyth:pet/get_owner_target

# Set the pet's target to the owner's target
execute if entity @s[tag=GreekPet.HasOwnerTarget] run function greekmyth:pet/set_target 