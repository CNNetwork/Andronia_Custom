package com.goatz.happylittleblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.stream.Stream;

public class CustomStairs extends BaseHorizontalBlock {
    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(8, 12, 12, 12, 15.5, 15),
            Block.makeCuboidShape(0, 12, 12, 4, 15.5, 15),
            Block.makeCuboidShape(0, 12, 15, 16, 16, 16),
            Block.makeCuboidShape(12, 12, 12, 16, 16, 15),
            Block.makeCuboidShape(4, 12, 12, 8, 16, 15),
            Block.makeCuboidShape(12, 0, 0, 16, 3.5, 3),
            Block.makeCuboidShape(4, 0, 0, 8, 3.5, 3),
            Block.makeCuboidShape(0, 0, 3, 16, 4, 4),
            Block.makeCuboidShape(8, 0, 0, 12, 4, 3),
            Block.makeCuboidShape(0, 0, 0, 4, 4, 3),
            Block.makeCuboidShape(0, 4, 4, 4, 7.5, 7),
            Block.makeCuboidShape(0, 4, 7, 16, 8, 8),
            Block.makeCuboidShape(12, 4, 4, 16, 8, 7),
            Block.makeCuboidShape(0, 0, 4, 16, 4, 8),
            Block.makeCuboidShape(0, 0, 8, 16, 8, 12),
            Block.makeCuboidShape(0, 0, 12, 16, 12, 16),
            Block.makeCuboidShape(12, 8, 8, 16, 11.5, 11),
            Block.makeCuboidShape(0, 8, 11, 16, 12, 12),
            Block.makeCuboidShape(0, 8, 8, 4, 12, 11),
            Block.makeCuboidShape(3, 11.5, 11, 13, 16, 13),
            Block.makeCuboidShape(3, 11.5, 5, 5, 16, 11),
            Block.makeCuboidShape(3, 11.5, 3, 13, 16, 5),
            Block.makeCuboidShape(11, 11.5, 5, 13, 16, 11),
            Block.makeCuboidShape(3, 3.5, 11, 13, 11.5, 13),
            Block.makeCuboidShape(3, 3.5, 5, 5, 11.5, 11),
            Block.makeCuboidShape(5, 11.5, 5, 11, 12.5, 11),
            Block.makeCuboidShape(3, 3.5, 3, 13, 11.5, 5),
            Block.makeCuboidShape(11, 3.5, 5, 13, 11.5, 11)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public CustomStairs(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }
    @ParametersAreNonnullByDefault
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }

}
