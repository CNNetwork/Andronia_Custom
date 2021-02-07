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

public class CustomSlabLow extends BaseHorizontalBlock{

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(0.9999999999999982, -4.75, 0, 10, -3.75, 8),
            Block.makeCuboidShape(0.9999999999999982, -6.25, 6, 10.999999999999998, -4.25, 10),
            Block.makeCuboidShape(10.254019418610605, -2.49970236282212, 6, 19.054019418610608, 0.00029763717788000577, 10),
            Block.makeCuboidShape(14.254019418610605, -0.6747023628221198, 0, 16.35401941861061, 1.4252976371778807, 16),
            Block.makeCuboidShape(5.254019418610605, -4.87470236282212, 0.025, 7.3540194186106085, -2.7747023628221203, 16.025),
            Block.makeCuboidShape(0.07612046748871037, -5.1326834323650905, 1, 1.076120467488714, -4.1326834323650905, 7),
            Block.makeCuboidShape(7.652240934977421, -1.5153668647301792, 1, 8.652240934977424, -0.5153668647301792, 7),
            Block.makeCuboidShape(8.499999999999998, -0.75, -0.25, 18.5, 0.25, 8),
            Block.makeCuboidShape(0.9999999999999982, -4.25, 7.949999999999999, 10, -3.25, 16),
            Block.makeCuboidShape(0.07612046748871037, -4.632683432365092, 8.95, 1.076120467488714, -3.6326834323650896, 15),
            Block.makeCuboidShape(7.652240934977421, -1.0153668647301828, 8.975, 8.652240934977424, -0.015366864730180119, 15),
            Block.makeCuboidShape(8.499999999999998, -0.25, 7.699999999999999, 18.5, 0.75, 16)
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    public CustomSlabLow(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }

}
