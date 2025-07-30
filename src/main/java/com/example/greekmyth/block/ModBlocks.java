package com.example.greekmyth.block;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    public static final Block INFERNO_PORTAL = Registry.register(
        Registries.BLOCK,
        Identifier.of(GreekMythologyMod.MOD_ID, "inferno_portal"),
        new InfernoPortalBlock(AbstractBlock.Settings.create()
            .mapColor(MapColor.DARK_RED)
            .noCollision()
            .strength(-1.0F)
            .sounds(BlockSoundGroup.GLASS)
            .luminance(state -> 11)
            .pistonBehavior(net.minecraft.block.piston.PistonBehavior.BLOCK)
            .dropsNothing())
    );
    
    public static void registerModBlocks() {
        GreekMythologyMod.LOGGER.info("Registering Inferno Portal block for " + GreekMythologyMod.MOD_ID);
    }
} 