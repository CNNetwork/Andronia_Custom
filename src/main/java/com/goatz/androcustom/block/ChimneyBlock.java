package com.goatz.androcustom.block;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class ChimneyBlock extends BaseHorizontalBlock{
    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(11, 0, 4.999999999999998, 13, 6, 10.999999999999998),
            Block.makeCuboidShape(3, 0, 3.0000000000000004, 13, 6, 4.999999999999998),
            Block.makeCuboidShape(3, 0, 4.999999999999998, 5, 6, 10.999999999999998),
            Block.makeCuboidShape(3, 0, 10.999999999999998, 13, 6, 12.999999999999998)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public ChimneyBlock(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }

}
