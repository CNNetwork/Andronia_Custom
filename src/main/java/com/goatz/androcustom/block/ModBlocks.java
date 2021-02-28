package com.goatz.androcustom.block;

import com.goatz.androcustom.util.Registration;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import com.goatz.androcustom.block.CustomSlab;
import com.goatz.androcustom.block.BrownStairs;
import com.goatz.androcustom.block.ChimneyBlock;
import com.goatz.androcustom.block.CustomSlabLow;
import com.goatz.androcustom.block.BrownStairsHole;
import com.goatz.androcustom.block.CustomStairs;


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

    public static final RegistryObject<Block> SHINGLES_SLAB = register("shingles_slab",
            () -> new CustomSlab(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 5f)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SHINGLES_SLAB_LOW = register("shingles_slab_low",
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

    public static final RegistryObject<Block> BLUE_SHINGLES_BLOCK = register("blue_shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLUE_SHINGLES_BLOCK_2 = register("blue_shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BLUE_SHINGLES_BLOCK_3 = register("blue_shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SHINGLES_BLOCK = register("red_shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SHINGLES_BLOCK_2 = register("red_shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_SHINGLES_BLOCK_3 = register("red_shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_SHINGLES_BLOCK = register("green_shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_SHINGLES_BLOCK_2 = register("green_shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_SHINGLES_BLOCK_3 = register("green_shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_SHINGLES_BLOCK = register("pink_shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_SHINGLES_BLOCK_2 = register("pink_shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_SHINGLES_BLOCK_3 = register("pink_shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> YELLOW_SHINGLES_BLOCK = register("yellow_shingles_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> YELLOW_SHINGLES_BLOCK_2 = register("yellow_shingles_block_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> YELLOW_SHINGLES_BLOCK_3 = register("yellow_shingles_block_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> AQUA_WOOL = register("aqua_wool",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
            .hardnessAndResistance(2f, 4f).sound(SoundType.CLOTH)));

    public static final RegistryObject<Block> DIRTY_PURPLE_WOOL = register("dirty_purple_wool",
            () -> new Block(AbstractBlock.Properties.create(Material.WOOL)
                    .hardnessAndResistance(2f, 4f).sound(SoundType.CLOTH)));

    public static final RegistryObject<Block> CRUMBLE_DIRT = register("crumble_dirt",
            () -> new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2f, 2f)
                    .harvestLevel(1).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));

    public static final RegistryObject<Block> CHOCOLATE_TILES = register("chocolate_tiles",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CIRCLE_ENGRAVED_STONE = register("circle_engraved_stone",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CIRCLE_ENGRAVED_STONE_2 = register("circle_engraved_stone_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PAUSE = register("pause",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BIG_CHOCOLATE_TILES = register("big_chocolate_tiles",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_BRICK = register("stone_brick",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_BRICK_2 = register("stone_brick_2",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STONE_BRICK_3 = register("stone_brick_3",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> TRASH_BLOCK = register("trash_block",
            () -> new Block(AbstractBlock.Properties.create(Material.CLAY)
                    .hardnessAndResistance(2f, 2f)
                    .harvestLevel(1).harvestTool(ToolType.SHOVEL).sound(SoundType.GROUND)));

    public static final RegistryObject<Block> BROWN_BRICKS = register("brown_bricks",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
            .hardnessAndResistance(5f, 7f).setRequiresTool()
            .harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = register("brown_brick_stairs",
            () -> new BrownStairs(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BROWN_BRICK_STAIRS_HOLE = register("brown_brick_stairs_hole",
            () -> new BrownStairsHole(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static final RegistryObject<Block> CHIMNEY_BLOCK = register("chimney_block",
            () -> new ChimneyBlock(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

   public static final RegistryObject<Block> CHIMNEY_STAIRS = register("chimney_stairs",
            () -> new CustomStairs(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(5f, 7f).setRequiresTool()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

   public static final RegistryObject<Block> BROWN_BRICK_SLAB = register("brown_brick_slab",
           () -> new BrickSlab(AbstractBlock.Properties.create(Material.ROCK)
                   .hardnessAndResistance(5f, 7f).setRequiresTool()
                   .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

   public static final RegistryObject<Block> BROWN_BRICK_TILE = register("brown_brick_tile",
           () -> new BrickTile(DyeColor.BROWN, AbstractBlock.Properties.create(Material.ROCK)
           .hardnessAndResistance(5f, 7f).setRequiresTool()
           .harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }
}
