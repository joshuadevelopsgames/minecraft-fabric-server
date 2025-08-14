package com.example.greekmyth.mixin;

import com.example.greekmyth.GreekMythologyMod;
import com.example.greekmyth.zone.ZoneManager;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerInteractionManager.class)
public class ServerPlayerInteractionManagerMixin {

    @Shadow
    protected ServerPlayerEntity player;

    @Shadow
    protected ServerWorld world;

    /**
     * Intercept block placement and prevent it in protected zones
     */
    @Inject(method = "interactBlock", at = @At("HEAD"), cancellable = true)
    private void greek$preventBlockPlacementInProtectedZones(ServerPlayerEntity player, World world, ItemStack stack, Hand hand, BlockHitResult blockHitResult, CallbackInfoReturnable<ActionResult> cir) {
        // Get the position where the block would be placed
        BlockPos placementPos = blockHitResult.getBlockPos().offset(blockHitResult.getSide());
        
        // Check if the placement position is in a protected zone
        if (ZoneManager.isBlockProtected(placementPos)) {
            // Block placement is not allowed in protected zones
            player.sendMessage(Text.literal("§6§l[Zone Protection] §r§cThis area is protected!").formatted(Formatting.RED), false);
            player.sendMessage(Text.literal("§7You cannot place blocks in this zone.").formatted(Formatting.GRAY), false);
            
            GreekMythologyMod.LOGGER.info("Zone Protection: Player {} attempted to place block at {} in protected zone", 
                player.getName().getString(), placementPos);
            
            // Cancel the block placement
            cir.setReturnValue(ActionResult.FAIL);
            cir.cancel();
        }
    }
}
