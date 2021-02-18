package com.goatz.androcustom.block;

import com.goatz.androcustom.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import com.goatz.androcustom.block.CustomSlab;

import javax.tools.Tool;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> HYDRATED_LOAM = register("hydrated_loam",
            () -> new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1f, 1f)
                    .harvestLevel(1).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));

    public static final RegistryObject<Block> EBONY_VERTICAL_PLANKS = register("ebony_vertical_planks",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(3f, 5f)
                    .harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WORN_STONE_BRICKS = register("worn_stone_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TILLED_DIRT = register("tilled_dirt",
            () -> new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(1f, 1f)
                    .harvestLevel(1).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));

    public static final RegistryObject<Block> POLISHED_STONE_BRICKS = register("polished_stone_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> EBONY_CRATE = register("ebony_crate",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(3f, 5f)
                    .harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> HYDRATED_LOAM_BRICKS = register("hydrated_loam_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> EBONY_PLANKS = register("ebony_planks",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOD)
                    .hardnessAndResistance(3f, 5f)
                    .harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STONE_TILE = register("stone_tile",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TATTERED_BRICKS = register("tattered_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHAIN_BONDED_BRICKS = register("chain_bonded_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SCRAP_BLOCK = register("scrap_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));

    public static final RegistryObject<Block> HORIZONTAL_PAPER_WALL = register("horizontal_paper_wall",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
                    .hardnessAndResistance(3f, 5f)
                    .harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.PLANT)));

    public static final RegistryObject<Block> BASE_PAPER_WALL = register("base_paper_wall",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
                    .hardnessAndResistance(3f, 5f)
                    .harvestLevel(1).harvestTool(ToolType.AXE).sound(SoundType.PLANT)));

    public static final RegistryObject<Block> BRICK_TILE = register("brick_tile",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BROKEN_BRICKS = register("broken_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE = register("fokhan_stone",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_BIG_BRICK = register("fokhan_stone_big_brick",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_BIG_CLINKERS = register("fokhan_stone_big_clinkers",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_BRICK = register("fokhan_stone_brick",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_CLINKERS = register("fokhan_stone_clinkers",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_ORNATE_TILE = register("fokhan_stone_ornate_tile",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_ORNATE_TILE_2 = register("fokhan_stone_ornate_tile_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_TILE = register("fokhan_stone_tile",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_TINY_TILES = register("fokhan_stone_tiny_tiles",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FOKHAN_STONE_VERTICAL_CLINKERS = register("fokhan_stone_vertical_clinkers",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<CustomSlab> SHINGLES_SLAB = register("shingles_slab",
            () -> new CustomSlab(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 5f)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static final RegistryObject<CustomSlab> SHINGLES_SLAB_LOW = register("shingles_slab_low",
            () -> new CustomSlab(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 5f)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHINGLES_BLOCK = register("shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHINGLES_BLOCK_2 = register("shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHINGLES_BLOCK_3 = register("shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> FACTORY_STRIPES = register("factory_stripes",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));

    public static final RegistryObject<Block> FACTORY_FLOOR = register("factory_floor",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));


    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }
}
