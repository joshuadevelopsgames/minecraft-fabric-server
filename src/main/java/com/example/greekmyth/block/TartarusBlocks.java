package com.example.greekmyth.block;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class TartarusBlocks {
    
    // Declare the block but don't initialize it statically
    public static Block TARTARUS_PORTAL;
    
    public static void registerTartarusBlocks() {
        GreekMythologyMod.LOGGER.info("Registering Tartarus blocks for " + GreekMythologyMod.MOD_ID);
        
        // Register the block in the method, not statically
        TARTARUS_PORTAL = Registry.register(
            Registries.BLOCK,
            Identifier.of(GreekMythologyMod.MOD_ID, "tartarus_portal"),
            new TartarusPortalBlock(AbstractBlock.Settings.create()
                .mapColor(MapColor.DARK_RED)
                .noCollision()
                .strength(-1.0F)
                .sounds(BlockSoundGroup.GLASS)
                .luminance(state -> 11)
                .pistonBehavior(net.minecraft.block.piston.PistonBehavior.BLOCK)
                .dropsNothing())
        );
        
        GreekMythologyMod.LOGGER.info("Tartarus Portal block registered successfully!");
    }
} 