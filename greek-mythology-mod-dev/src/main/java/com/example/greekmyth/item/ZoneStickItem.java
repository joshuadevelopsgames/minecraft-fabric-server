package com.example.greekmyth.item;

import com.example.greekmyth.zone.ZoneManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Shared behavior for zone sticks. When infiniteFullHeight is true, the selection will be expanded from minY to maxY.
 */
public class ZoneStickItem extends Item {
    private final boolean infiniteFullHeight;

    public ZoneStickItem(Settings settings, boolean infiniteFullHeight) {
        super(settings);
        this.infiniteFullHeight = infiniteFullHeight;
    }

    public boolean isInfiniteFullHeight() {
        return infiniteFullHeight;
    }
}

