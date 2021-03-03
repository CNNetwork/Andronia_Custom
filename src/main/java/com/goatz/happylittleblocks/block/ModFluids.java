package com.goatz.happylittleblocks.block;

import com.goatz.happylittleblocks.HappyLittleBlocks;
import com.goatz.happylittleblocks.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

public class ModFluids {
    public static final ResourceLocation TRASH_STILL_RL = new ResourceLocation(HappyLittleBlocks.MOD_ID,
            "block/trash_still");

    public static final ResourceLocation TRASH_FLOWING_RL = new ResourceLocation(HappyLittleBlocks.MOD_ID,
            "block/trash_flowing");

    public static final RegistryObject<FlowingFluid> TRASH_FLUID
            = Registration.FLUIDS.register("trash_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.TRASH_PROPERTIES));

    public static final RegistryObject<FlowingFluid> TRASH_FLOWING
            = Registration.FLUIDS.register("trash_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.TRASH_PROPERTIES));

    public static final ForgeFlowingFluid.Properties TRASH_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> TRASH_FLUID.get(), () -> TRASH_FLOWING.get(), FluidAttributes.builder(TRASH_STILL_RL, TRASH_FLOWING_RL)
            .luminosity(2).rarity(Rarity.RARE).sound(SoundEvents.BLOCK_BAMBOO_SAPLING_BREAK)
            .viscosity(5)).slopeFindDistance(1).levelDecreasePerBlock(3)
            .block(() -> ModFluids.TRASH_FLUID_BLOCK.get());

    public static final RegistryObject<FlowingFluidBlock> TRASH_FLUID_BLOCK = Registration.BLOCKS.register("trash",
            () -> new TrashFluidBlock(() -> ModFluids.TRASH_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
            .doesNotBlockMovement().hardnessAndResistance(5f).noDrops()));

    public static void register() {}
}
