# Find Owner By Name - Parse custom name to find owner

# Extract owner name from custom name pattern
# Format: "§6[OwnerName]'s Enhanced Wither Skeleton"
execute store result storage greekmyth:temp owner_name string run data get entity @s CustomName

# Try to find player with matching name
execute as @a if data storage greekmyth:temp {owner_name:"*'s Enhanced Wither Skeleton"} run function greekmyth:pet/find_owner

# If still no owner found, try alternative parsing
execute unless entity @s[tag=GreekPet.HasOwner] run function greekmyth:pet/parse_owner_name 