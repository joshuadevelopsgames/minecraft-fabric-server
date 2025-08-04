// SOUL ABSORPTION FUNCTIONALITY BACKUP
// This code was removed from HadesScytheItem.java but preserved for future use
// Date: August 3, 2024

// === HADES SCYTHE SOUL ABSORPTION CODE ===

// In HadesScytheItem.java - postHit method soul damage calculation:
/*
// Calculate soul-enhanced damage using NBT-stored values from the scythe
float baseDamage = 4.0f;
int soulBonus = getSoulDamageBonus(stack); // Use NBT-stored soul count from this scythe

float totalDamage = baseDamage + soulBonus;

GreekMythologyMod.LOGGER.info("HADES SCYTHE ATTACK: Base Damage: {}, Soul Bonus: {} (from NBT), Total Damage: {}", 
    baseDamage, soulBonus, totalDamage);

target.damage(serverWorld, serverWorld.getDamageSources().generic(), totalDamage);
*/

// === SOUL DAMAGE BONUS METHODS ===

/*
private int getSoulDamageBonus(ItemStack scytheStack) {
    // Use NBT data to store soul bonus (separate from damage/charge system)
    net.minecraft.nbt.NbtCompound nbt = scytheStack.getNbt();
    return nbt != null && nbt.contains("SoulBonus") ? nbt.getInt("SoulBonus").orElse(0) : 0;
}

private void setSoulDamageBonus(ItemStack scytheStack, int bonus) {
    // Store soul bonus in NBT data (not damage value)
    net.minecraft.nbt.NbtCompound nbt = scytheStack.getNbt();
    if (nbt == null) {
        nbt = new net.minecraft.nbt.NbtCompound();
        scytheStack.setNbt(nbt);
    }
    nbt.putInt("SoulBonus", bonus);
    GreekMythologyMod.LOGGER.info("Set soul damage bonus to: {} (stored in NBT)", bonus);
}

// Public method for SoulItem to update soul bonus
public static void updateSoulBonus(ItemStack scytheStack, int bonus) {
    net.minecraft.nbt.NbtCompound nbt = scytheStack.getNbt();
    if (nbt == null) {
        nbt = new net.minecraft.nbt.NbtCompound();
        scytheStack.setNbt(nbt);
    }
    nbt.putInt("SoulBonus", bonus);
    GreekMythologyMod.LOGGER.info("Updated soul damage bonus to: {} (stored in NBT)", bonus);
}
*/

// === TOOLTIP SOUL DAMAGE DISPLAY ===

/*
// In appendTooltip method:
float baseDamage = 4.0f;
int currentSoulBonus = getSoulDamageBonus(stack);
float totalDamage = baseDamage + currentSoulBonus;

// Live damage display showing actual combat values
tooltip.accept(Text.literal("⚔️ BASE DAMAGE: " + String.format("%.1f", baseDamage)).formatted(net.minecraft.util.Formatting.RED, net.minecraft.util.Formatting.BOLD));

// Soul consumption progress with visual indicator
String soulProgressColor = currentSoulBonus >= 12 ? "§6" : "§5"; // Gold if maxed, Purple if not
String maxIndicator = currentSoulBonus >= 12 ? " §6§l[MAX]" : "";
tooltip.accept(Text.literal("💀 SOULS CONSUMED: " + soulProgressColor + currentSoulBonus + "/12" + maxIndicator).formatted(net.minecraft.util.Formatting.DARK_PURPLE, net.minecraft.util.Formatting.BOLD));

tooltip.accept(Text.literal("💙 SOUL BONUS: +" + String.format("%.1f", (float)currentSoulBonus)).formatted(net.minecraft.util.Formatting.AQUA, net.minecraft.util.Formatting.BOLD));
tooltip.accept(Text.literal("⚡ LIVE DAMAGE: " + String.format("%.1f", totalDamage) + " (actual combat damage)").formatted(net.minecraft.util.Formatting.GREEN, net.minecraft.util.Formatting.BOLD));

tooltip.accept(Text.literal("🍽️ Consume soul items to increase damage permanently").formatted(net.minecraft.util.Formatting.LIGHT_PURPLE));
*/

// === SOUL ITEM ABSORPTION CODE ===

/*
// In SoulItem.java - use method:
@Override
public ActionResult use(World world, PlayerEntity user, Hand hand) {
    if (!world.isClient()) {
        ServerPlayerEntity serverPlayer = (ServerPlayerEntity) user;
        ItemStack soulStack = user.getStackInHand(hand);
        
        // Find Hades Scythe in player's inventory
        ItemStack scytheStack = findHadesScytheInInventory(serverPlayer);
        
        if (scytheStack != null) {
            // Get current soul bonus from scythe
            int currentBonus = getScytheDamageBonus(scytheStack);
            
            // Check if we can add more souls (max 12)
            if (currentBonus < MAX_DAMAGE_BONUS) {
                // Increase soul bonus
                int newBonus = Math.min(currentBonus + DAMAGE_BONUS_PER_SOUL, MAX_DAMAGE_BONUS);
                setScytheDamageBonus(scytheStack, newBonus);
                
                // Consume the soul item
                soulStack.decrement(1);
                
                // Send feedback message
                String message = String.format("§aAbsorbed %s into Hades' Scythe! Damage bonus: +%d", soulName, newBonus);
                serverPlayer.sendMessage(Text.literal(message), false);
                
                // Play absorption sound and particles
                serverPlayer.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
                
                // Spawn soul absorption particles
                for (int i = 0; i < 10; i++) {
                    double x = user.getX() + (world.getRandom().nextDouble() - 0.5) * 2;
                    double y = user.getY() + world.getRandom().nextDouble() * 2;
                    double z = user.getZ() + (world.getRandom().nextDouble() - 0.5) * 2;
                    ((ServerWorld) world).spawnParticles(ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
                }
                
                return ActionResult.SUCCESS;
            } else {
                // Already at max soul bonus
                serverPlayer.sendMessage(Text.literal("§cHades' Scythe is already at maximum soul power!"), false);
                return ActionResult.FAIL;
            }
        } else {
            // No Hades Scythe in inventory
            serverPlayer.sendMessage(Text.literal("§cYou need Hades' Scythe in your inventory to absorb this soul!"), false);
            return ActionResult.FAIL;
        }
    }
    
    return ActionResult.SUCCESS;
}

private ItemStack findHadesScytheInInventory(ServerPlayerEntity player) {
    for (int i = 0; i < player.getInventory().size(); i++) {
        ItemStack stack = player.getInventory().getStack(i);
        if (stack.isOf(GreekItems.HADES_SCYTHE)) {
            return stack;
        }
    }
    return null;
}

private int getScytheDamageBonus(ItemStack scytheStack) {
    // Use NBT data to read soul bonus (separate from damage/charge system)
    net.minecraft.nbt.NbtCompound nbt = scytheStack.getNbt();
    return nbt != null && nbt.contains("SoulBonus") ? nbt.getInt("SoulBonus").orElse(0) : 0;
}

private void setScytheDamageBonus(ItemStack scytheStack, int bonus) {
    // Store soul bonus in NBT data (not damage value to avoid conflict with charges)
    net.minecraft.nbt.NbtCompound nbt = scytheStack.getNbt();
    if (nbt == null) {
        nbt = new net.minecraft.nbt.NbtCompound();
        scytheStack.setNbt(nbt);
    }
    nbt.putInt("SoulBonus", bonus);
    GreekMythologyMod.LOGGER.info("Set soul damage bonus to: {} (stored in NBT)", bonus);
}
*/

// === SOUL ITEM TOOLTIP ===

/*
// In SoulItem appendTooltip:
tooltip.accept(Text.literal("Right-click to absorb into Hades' Scythe").formatted(Formatting.YELLOW));
tooltip.accept(Text.literal("Increases scythe damage by +1").formatted(Formatting.YELLOW));
*/

// === CONSTANTS ===

/*
// In SoulItem.java:
private static final int DAMAGE_BONUS_PER_SOUL = 1; // +1 damage per soul consumed
private static final int MAX_DAMAGE_BONUS = 12; // Maximum +12 damage bonus
*/

// === USAGE INSTRUCTIONS ===

/*
To restore soul absorption functionality to a future item:

1. Copy the soul damage bonus methods (getSoulDamageBonus, setSoulDamageBonus, updateSoulBonus)
2. Add soul damage calculation to the item's attack method
3. Add soul damage display to the tooltip
4. Update SoulItem.java to work with the new item instead of Hades Scythe
5. Update the findHadesScytheInInventory method to find the new item
6. Update tooltip text to reference the new item

The soul absorption system allows items to permanently increase their damage by consuming soul items,
with a maximum bonus of +12 damage from 12 consumed souls.
*/ 