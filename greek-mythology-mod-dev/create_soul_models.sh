#!/bin/bash

# List of all soul items
SOUL_ITEMS=(
    "zombie_soul"
    "skeleton_soul"
    "spider_soul"
    "creeper_soul"
    "enderman_soul"
    "witch_soul"
    "slime_soul"
    "blaze_soul"
    "ghast_soul"
    "piglin_soul"
    "hoglin_soul"
    "zombified_piglin_soul"
    "magma_cube_soul"
    "warden_soul"
    "elder_guardian_soul"
    "wither_skeleton_soul"
    "drowned_soul"
    "husk_soul"
    "stray_soul"
    "cave_spider_soul"
    "phantom_soul"
    "vindicator_soul"
    "evoker_soul"
    "pillager_soul"
    "ravager_soul"
    "shulker_soul"
    "silverfish_soul"
    "endermite_soul"
    "guardian_soul"
    "dolphin_soul"
    "pig_soul"
    "cow_soul"
    "sheep_soul"
    "chicken_soul"
    "horse_soul"
    "wolf_soul"
    "cat_soul"
    "fox_soul"
    "rabbit_soul"
    "panda_soul"
    "bee_soul"
    "llama_soul"
    "trader_llama_soul"
    "donkey_soul"
    "mule_soul"
    "parrot_soul"
    "turtle_soul"
    "axolotl_soul"
    "goat_soul"
    "frog_soul"
    "tadpole_soul"
    "allay_soul"
    "camel_soul"
    "sniffer_soul"
    "armadillo_soul"
    "breeze_soul"
)

# Create model files for each soul item
for soul_item in "${SOUL_ITEMS[@]}"; do
    cat > "src/main/resources/assets/greekmyth/models/item/${soul_item}.json" << EOF
{
  "parent": "item/generated",
  "textures": {
    "layer0": "greekmyth:item/soul"
  }
}
EOF
    echo "Created model for ${soul_item}"
done

echo "All soul item models created!" 