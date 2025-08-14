package com.example.greekmyth.copy;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.NbtCompound;

public class BlockData {
    private BlockState blockState;
    private NbtCompound blockEntityNbt;
    
    public BlockData() {
    }
    
    public BlockData(BlockState blockState) {
        this.blockState = blockState;
    }
    
    public BlockData(BlockState blockState, NbtCompound blockEntityNbt) {
        this.blockState = blockState;
        this.blockEntityNbt = blockEntityNbt;
    }
    
    public BlockState getBlockState() {
        return blockState;
    }
    
    public void setBlockState(BlockState blockState) {
        this.blockState = blockState;
    }
    
    public NbtCompound getBlockEntityNbt() {
        return blockEntityNbt;
    }
    
    public void setBlockEntityNbt(NbtCompound blockEntityNbt) {
        this.blockEntityNbt = blockEntityNbt;
    }
    
    public boolean hasBlockEntity() {
        return blockEntityNbt != null;
    }
}
