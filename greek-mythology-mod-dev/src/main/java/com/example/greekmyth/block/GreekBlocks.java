package com.example.greekmyth.block;

import com.example.greekmyth.GreekMythologyMod;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GreekBlocks {
    
    public static final Identifier ORACLE_ALTAR_ID = Identifier.of(GreekMythologyMod.MOD_ID, "oracle_altar");
    public static Block ORACLE_ALTAR;
    
    public static void register() {
        ORACLE_ALTAR = Registry.register(Registries.BLOCK, ORACLE_ALTAR_ID, new OracleAltarBlock());
        
        GreekMythologyMod.LOGGER.info("Registered Oracle Altar block");
    }
} 