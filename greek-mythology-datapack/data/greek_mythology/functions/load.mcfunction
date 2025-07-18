# Greek Mythology Data Pack - Load Function
# This runs when the data pack is loaded

tellraw @a [[object Object]🌟 Greek Mythology System Loaded!,olor":gold","bold:true},{"text":nWelcome to Camp Half-Blood!",color":aqua}]

# Set up scoreboard objectives for tracking progression
scoreboard objectives add greek_level dummy "Greek Mythology Level"
scoreboard objectives add greek_xp dummy "Greek Mythology XP"
scoreboard objectives add materials_mined dummy Materials Mined"
scoreboard objectives add mobs_killed dummy "Mobs Killed"
scoreboard objectives add distance_traveled dummy Distance Traveled"
scoreboard objectives add quests_completed dummyQuests Completed"

# Display the scoreboard
scoreboard objectives setdisplay sidebar greek_level

# Give all players starting level
execute as @a run scoreboard players set @s greek_level 1
execute as @a run scoreboard players set @s greek_xp 0 