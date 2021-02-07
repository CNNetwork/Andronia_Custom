package com.goatz.androcustom.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CustomSlab extends BaseHorizontalBlock{

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(0.9999999999999982, 3.25, 0, 10, 4.25, 8),
            Block.makeCuboidShape(0.9999999999999982, 1.75, 6, 11, 3.75, 10),
            Block.makeCuboidShape(10.254019418610604, 5.50029763717788, 6, 19.054019418610608, 8.00029763717788, 10),
            Block.makeCuboidShape(14.254019418610604, 7.325297637177879, 0, 16.35401941861061, 9.42529763717788, 16),
            Block.makeCuboidShape(5.2540194186106035, 3.12529763717788, 0.025, 7.3540194186106085, 5.22529763717788, 16.025),
            Block.makeCuboidShape(0.07612046748871037, 2.8673165676349086, 1, 1.076120467488714, 3.8673165676349095, 7),
            Block.makeCuboidShape(7.652240934977421, 6.484633135269821, 1, 8.652240934977424, 7.484633135269821, 7),
            Block.makeCuboidShape(8.5, 7.25, -0.25, 18.5, 8.25, 8),
            Block.makeCuboidShape(0.9999999999999982, 3.75, 7.949999999999999, 10, 4.75, 16),
            Block.makeCuboidShape(0.07612046748871037, 3.3673165676349077, 8.95, 1.076120467488714, 4.36731656763491, 15),
            Block.makeCuboidShape(7.652240934977421, 6.984633135269817, 8.975, 8.652240934977424, 7.984633135269821, 15),
            Block.makeCuboidShape(8.5, 7.75, 7.699999999999999, 18.5, 8.75, 16)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public CustomSlab(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }

}
