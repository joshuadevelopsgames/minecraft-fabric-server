#!/bin/bash

# LuckPerms Group Setup Script
# This script creates all the permission groups for the customname mod

echo "Setting up LuckPerms groups for customname mod..."

# Staff Groups
echo "Creating staff groups..."
lp creategroup staff_owner
lp creategroup staff_dc_manager
lp creategroup staff_web_manager
lp creategroup staff_admin
lp creategroup staff_mod
lp creategroup staff_trial_mod
lp creategroup staff_chat_mod

# Other Groups
echo "Creating other groups..."
lp creategroup other_chat_helper
lp creategroup other_onboarder
lp creategroup other_event_coordinator
lp creategroup other_spawn_manager
lp creategroup other_guide
lp creategroup other_patrol
lp creategroup other_hall_of_fame
lp creategroup other_content_creator

# Donator Groups
echo "Creating donator groups..."
lp creategroup donator_sponsor
lp creategroup donator_mvp
lp creategroup donator_vip
lp creategroup donator_golden1
lp creategroup donator_golden2
lp creategroup donator_pro1
lp creategroup donator_pro2
lp creategroup donator_donator_plus
lp creategroup donator_member1
lp creategroup donator_member2
lp creategroup donator_donator

# Sponsor Fruit Groups
echo "Creating sponsor fruit groups..."
lp creategroup sponsor_apple
lp creategroup sponsor_banana
lp creategroup sponsor_blueberry
lp creategroup sponsor_cherry
lp creategroup sponsor_coconut
lp creategroup sponsor_grape
lp creategroup sponsor_kiwi
lp creategroup sponsor_lemon
lp creategroup sponsor_mango
lp creategroup sponsor_orange
lp creategroup sponsor_peach
lp creategroup sponsor_pear
lp creategroup sponsor_pineapple
lp creategroup sponsor_plum
lp creategroup sponsor_pomegranate
lp creategroup sponsor_raspberry
lp creategroup sponsor_strawberry
lp creategroup sponsor_watermelon

# Golden Fruit Groups
echo "Creating golden fruit groups..."
lp creategroup golden_apple
lp creategroup golden_banana
lp creategroup golden_blueberry
lp creategroup golden_cherry
lp creategroup golden_coconut
lp creategroup golden_grape
lp creategroup golden_kiwi
lp creategroup golden_lemon
lp creategroup golden_mango
lp creategroup golden_orange
lp creategroup golden_peach
lp creategroup golden_pear
lp creategroup golden_pineapple
lp creategroup golden_plum
lp creategroup golden_pomegranate
lp creategroup golden_raspberry
lp creategroup golden_strawberry
lp creategroup golden_watermelon

# Pro Fruit Groups
echo "Creating pro fruit groups..."
lp creategroup pro_apple
lp creategroup pro_banana
lp creategroup pro_blueberry
lp creategroup pro_cherry
lp creategroup pro_coconut
lp creategroup pro_grape
lp creategroup pro_kiwi
lp creategroup pro_lemon
lp creategroup pro_mango
lp creategroup pro_orange
lp creategroup pro_peach
lp creategroup pro_pear
lp creategroup pro_pineapple
lp creategroup pro_plum
lp creategroup pro_pomegranate
lp creategroup pro_raspberry
lp creategroup pro_strawberry
lp creategroup pro_watermelon

# Member Fruit Groups
echo "Creating member fruit groups..."
lp creategroup member_apple
lp creategroup member_banana
lp creategroup member_blueberry
lp creategroup member_cherry
lp creategroup member_coconut
lp creategroup member_grape
lp creategroup member_kiwi
lp creategroup member_lemon
lp creategroup member_mango
lp creategroup member_orange
lp creategroup member_peach
lp creategroup member_pear
lp creategroup member_pineapple
lp creategroup member_plum
lp creategroup member_pomegranate
lp creategroup member_raspberry
lp creategroup member_strawberry
lp creategroup member_watermelon

# Consolidated Fruit Groups
echo "Creating consolidated fruit groups..."
lp creategroup sponsor_fruits
lp creategroup golden_fruits
lp creategroup pro_fruits
lp creategroup member_fruits

echo "Setting up permissions for customname groups..."

# Set permissions for all groups to use their respective customname prefixes
for group in staff_owner staff_dc_manager staff_web_manager staff_admin staff_mod staff_trial_mod staff_chat_mod; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in other_chat_helper other_onboarder other_event_coordinator other_spawn_manager other_guide other_patrol other_hall_of_fame other_content_creator; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in donator_sponsor donator_mvp donator_vip donator_golden1 donator_golden2 donator_pro1 donator_pro2 donator_donator_plus donator_member1 donator_member2 donator_donator; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in sponsor_apple sponsor_banana sponsor_blueberry sponsor_cherry sponsor_coconut sponsor_grape sponsor_kiwi sponsor_lemon sponsor_mango sponsor_orange sponsor_peach sponsor_pear sponsor_pineapple sponsor_plum sponsor_pomegranate sponsor_raspberry sponsor_strawberry sponsor_watermelon; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in golden_apple golden_banana golden_blueberry golden_cherry golden_coconut golden_grape golden_kiwi golden_lemon golden_mango golden_orange golden_peach golden_pear golden_pineapple golden_plum golden_pomegranate golden_raspberry golden_strawberry golden_watermelon; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in pro_apple pro_banana pro_blueberry pro_cherry pro_coconut pro_grape pro_kiwi pro_lemon pro_mango pro_orange pro_peach pro_pear pro_pineapple pro_plum pro_pomegranate pro_raspberry pro_strawberry pro_watermelon; do
    lp group $group permission set customname.group.prefix.$group true
done

for group in member_apple member_banana member_blueberry member_cherry member_coconut member_grape member_kiwi member_lemon member_mango member_orange member_peach member_pear member_pineapple member_plum member_pomegranate member_raspberry member_strawberry member_watermelon; do
    lp group $group permission set customname.group.prefix.$group true
done

# Set permissions for consolidated fruit groups
lp group sponsor_fruits permission set customname.group.prefix.sponsor_fruits true
lp group golden_fruits permission set customname.group.prefix.golden_fruits true
lp group pro_fruits permission set customname.group.prefix.pro_fruits true
lp group member_fruits permission set customname.group.prefix.member_fruits true

echo "Setting up group hierarchy..."

# Set up hierarchy (staff > other > donator > fruits)
lp group staff_owner parent add staff_admin
lp group staff_admin parent add staff_mod
lp group staff_mod parent add staff_trial_mod
lp group staff_trial_mod parent add staff_chat_mod
lp group staff_chat_mod parent add staff_dc_manager
lp group staff_dc_manager parent add staff_web_manager

lp group staff_web_manager parent add other_chat_helper
lp group other_chat_helper parent add other_onboarder
lp group other_onboarder parent add other_event_coordinator
lp group other_event_coordinator parent add other_spawn_manager
lp group other_spawn_manager parent add other_guide
lp group other_guide parent add other_patrol
lp group other_patrol parent add other_hall_of_fame
lp group other_hall_of_fame parent add other_content_creator

lp group other_content_creator parent add donator_sponsor
lp group donator_sponsor parent add donator_mvp
lp group donator_mvp parent add donator_vip
lp group donator_vip parent add donator_golden1
lp group donator_golden1 parent add donator_golden2
lp group donator_golden2 parent add donator_pro1
lp group donator_pro1 parent add donator_pro2
lp group donator_pro2 parent add donator_donator_plus
lp group donator_donator_plus parent add donator_member1
lp group donator_member1 parent add donator_member2
lp group donator_member2 parent add donator_donator

# Fruit groups (sponsor > golden > pro > member)
lp group donator_donator parent add sponsor_fruits
lp group sponsor_fruits parent add golden_fruits
lp group golden_fruits parent add pro_fruits
lp group pro_fruits parent add member_fruits

echo "LuckPerms groups setup complete!"
echo "You can now assign players to groups using:"
echo "lp user <player> parent add <group>"
echo ""
echo "Example:"
echo "lp user Steve parent add staff_admin"
echo "lp user Alice parent add member_fruits"