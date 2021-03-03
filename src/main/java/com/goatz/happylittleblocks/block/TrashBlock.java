package com.goatz.happylittleblocks.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class TrashBlock extends GrassBlock {

    public TrashBlock(Properties properties) {
        super(properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack held = player.getHeldItem(handIn);
        if(held.getItem() instanceof ShovelItem)
        {
            held.damageItem(1, player, e -> e.sendBreakAnimation(handIn));
            worldIn.setBlockState(pos, ModFluids.TRASH_FLUID_BLOCK.get().getDefaultState());
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }
}


