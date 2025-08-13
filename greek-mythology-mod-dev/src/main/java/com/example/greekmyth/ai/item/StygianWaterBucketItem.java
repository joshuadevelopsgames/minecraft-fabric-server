package com.example.aimyth.item;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;

/**
 * Stygian Water Bucket - Places vanilla water with custom rendering and wither effects.
 * This bucket places vanilla water blocks, which will have 100% water behavior.
 */
public class StygianWaterBucketItem extends BucketItem {

    public StygianWaterBucketItem(Fluid fluid, Settings settings) {
        super(fluid, settings);
    }
} 