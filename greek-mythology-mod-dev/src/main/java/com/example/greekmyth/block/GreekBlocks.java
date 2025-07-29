package com.example.greekmyth.block;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GreekBlocks {
    
    public static Block POSEIDON_WATER;
    
    private static Block register(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of("greekmyth", name), block);
    }
    
    public static void init() {
        // Register the Poseidon Water block with water fluid
        POSEIDON_WATER = register("poseidon_water", 
            new PoseidonWaterBlock(Fluids.WATER, Block.Settings.copy(net.minecraft.block.Blocks.WATER)));
    }
} 