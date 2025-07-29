package com.example.greekmyth.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PoseidonWaterBlock extends FluidBlock {
    
    public static final BooleanProperty WALKABLE = BooleanProperty.of("walkable");
    
    public PoseidonWaterBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
        setDefaultState(getDefaultState().with(WALKABLE, false));
    }
    
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WALKABLE);
    }
    
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // If the water is walkable, return a solid collision shape
        if (state.get(WALKABLE)) {
            return VoxelShapes.fullCube();
        }
        // Otherwise, return empty (normal water behavior)
        return VoxelShapes.empty();
    }
    
    /**
     * Make this water block walkable
     */
    public static BlockState makeWalkable(BlockState state) {
        return state.with(WALKABLE, true);
    }
    
    /**
     * Make this water block normal (not walkable)
     */
    public static BlockState makeNormal(BlockState state) {
        return state.with(WALKABLE, false);
    }
} 