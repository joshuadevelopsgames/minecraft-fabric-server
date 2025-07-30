package com.example.greekmyth.item;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.function.Consumer;

public class SoulItem extends Item {
    private final String soulName;
    private final net.minecraft.entity.EntityType<?> entityType;
    private static final int DAMAGE_BONUS_PER_SOUL = 1; // +1 damage per soul consumed
    private static final int MAX_DAMAGE_BONUS = 12; // Maximum +12 damage bonus
    
    public SoulItem(Settings settings, String soulName, net.minecraft.entity.EntityType<?> entityType) {
        super(settings);
        this.soulName = soulName;
        this.entityType = entityType;
    }
    
    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack soulStack = user.getStackInHand(hand);
        
        if (!world.isClient()) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) user;
            ServerWorld serverWorld = (ServerWorld) world;
            
            // Check if player has Hades Scythe in inventory
            ItemStack scytheStack = findHadesScytheInInventory(serverPlayer);
            
            if (scytheStack != null) {
                // Get current damage bonus from scythe
                int currentDamageBonus = getScytheDamageBonus(scytheStack);
                
                if (currentDamageBonus < MAX_DAMAGE_BONUS) {
                    // Consume the soul and increase scythe damage
                    soulStack.decrement(1);
                    
                    // Increase scythe damage bonus
                    int newDamageBonus = Math.min(currentDamageBonus + DAMAGE_BONUS_PER_SOUL, MAX_DAMAGE_BONUS);
                    setScytheDamageBonus(scytheStack, newDamageBonus);
                    
                    // Visual and sound effects
                    Vec3d playerPos = user.getPos();
                    for (int i = 0; i < 15; i++) {
                        double x = playerPos.x + (world.random.nextDouble() - 0.5) * 3;
                        double y = playerPos.y + world.random.nextDouble() * 2;
                        double z = playerPos.z + (world.random.nextDouble() - 0.5) * 3;
                        serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.SOUL, x, y, z, 1, 0, 0, 0, 0.1);
                        serverWorld.spawnParticles(net.minecraft.particle.ParticleTypes.SMOKE, x, y, z, 1, 0, 0, 0, 0.05);
                    }
                    
                    // Play soul absorption sound
                    serverWorld.playSound(null, playerPos.x, playerPos.y, playerPos.z,
                        SoundEvents.ENTITY_WITHER_AMBIENT, SoundCategory.PLAYERS, 0.8f, 1.5f);
                    
                    // Increment the server-side soul counter
                    GreekMythologyMod.incrementSoulCount(serverPlayer.getUuid());
                    int totalSouls = GreekMythologyMod.getSoulCount(serverPlayer.getUuid());
                    
                    // Increment client-side counter for tooltip display
                    com.example.greekmyth.GreekMythologyClientMod.incrementClientSoulCount();
                    
                    // Send feedback message
                    serverPlayer.sendMessage(Text.literal("§d💀 " + soulName + " §7has been absorbed by Hades' Scythe! §eTotal Souls: " + totalSouls), false);
                    
                    GreekMythologyMod.LOGGER.info("SOUL ABSORPTION: {} soul consumed by {} for scythe damage bonus: {} -> {} (Total souls: {})", 
                        soulName, user.getName().getString(), currentDamageBonus, newDamageBonus, totalSouls);
                    
                    return ActionResult.SUCCESS;
                } else {
                    // Already at max damage bonus
                    serverPlayer.sendMessage(Text.literal("§cThe scythe cannot absorb more souls - it has reached maximum power! (12/12)"), false);
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
        // Use the same method as HadesScytheItem - store bonus in damage value
        int currentDamage = scytheStack.getDamage();
        
        // If damage is in the soul bonus range (1000-1012), extract the bonus
        // Format: 1000 + soulBonus (e.g., 1001 = 1 soul bonus, 1012 = 12 soul bonus)
        if (currentDamage >= 1000 && currentDamage <= 1012) {
            return currentDamage - 1000;
        }
        
        return 0;
    }
    
    private void setScytheDamageBonus(ItemStack scytheStack, int bonus) {
        // Store soul bonus in a range that doesn't conflict with charges
        // Format: 1000 + bonus (e.g., 1001 for 1 bonus, 1020 for 20 bonus)
        int soulDamageValue = 1000 + bonus;
        scytheStack.setDamage(soulDamageValue);
        GreekMythologyMod.LOGGER.info("Set soul damage bonus to: {} (damage value: {})", bonus, soulDamageValue);
    }
    
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, tooltip, type);
        
        // Get the soul color
        int soulColor = getSoulColor();
        int r = com.example.greekmyth.util.SoulColorMapper.getRed(soulColor);
        int g = com.example.greekmyth.util.SoulColorMapper.getGreen(soulColor);
        int b = com.example.greekmyth.util.SoulColorMapper.getBlue(soulColor);
        
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        
        // Create colored soul name using the entity's color
        String colorHex = String.format("#%02x%02x%02x", r, g, b);
        tooltip.accept(Text.literal("💀 " + soulName).formatted(Formatting.LIGHT_PURPLE, Formatting.BOLD));
        
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Harvested by Hades' Scythe").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("Contains the essence of the fallen").formatted(Formatting.GRAY));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        tooltip.accept(Text.literal("Right-click to absorb into Hades' Scythe").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("Increases scythe damage by +1").formatted(Formatting.YELLOW));
        tooltip.accept(Text.literal("").formatted(Formatting.LIGHT_PURPLE));
        
        // Show color information
        tooltip.accept(Text.literal("Color: RGB(" + r + ", " + g + ", " + b + ")").formatted(Formatting.DARK_GRAY, Formatting.ITALIC));
        tooltip.accept(Text.literal("Soul Item").formatted(Formatting.LIGHT_PURPLE, Formatting.ITALIC));
    }
    
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true; // Soul items have a magical glow
    }
    
    @Override
    public net.minecraft.text.Text getName(ItemStack stack) {
        return net.minecraft.text.Text.literal(getCleanDisplayName());
    }
    
    public String getSoulName() {
        return soulName;
    }
    
    /**
     * Get a clean display name for the hotbar (just the mob type + "Soul")
     */
    public String getCleanDisplayName() {
        // Remove " Soul" suffix if it exists and return clean format
        String cleanName = soulName.replace(" Soul", "");
        return cleanName + "'s Soul";
    }
    
    public net.minecraft.entity.EntityType<?> getEntityType() {
        return entityType;
    }
    
    /**
     * Get the color for this soul based on its entity type
     */
    public int getSoulColor() {
        return com.example.greekmyth.util.SoulColorMapper.getSoulColor(entityType);
    }
    
    /**
     * Get the glowing color for this soul
     */
    public int getGlowColor() {
        return com.example.greekmyth.util.SoulColorMapper.createGlowColor(getSoulColor());
    }
} 