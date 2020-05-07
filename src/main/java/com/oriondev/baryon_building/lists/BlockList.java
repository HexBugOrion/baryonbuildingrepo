package com.oriondev.baryon_building.lists;

import com.oriondev.baryon_building.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {



    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    //Shulkertile blocks VV
    public static RegistryObject<Block> BLACK_SHULKERTILE = BLOCKS.register("black_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> WHITE_SHULKERTILE = BLOCKS.register("white_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> LIGHT_GRAY_SHULKERTILE = BLOCKS.register("light_gray_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> GRAY_SHULKERTILE = BLOCKS.register("gray_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> RED_SHULKERTILE = BLOCKS.register("red_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> ORANGE_SHULKERTILE = BLOCKS.register("orange_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> YELLOW_SHULKERTILE = BLOCKS.register("yellow_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> GREEN_SHULKERTILE = BLOCKS.register("green_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> LIME_SHULKERTILE = BLOCKS.register("lime_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> CYAN_SHULKERTILE = BLOCKS.register("cyan_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> LIGHT_BLUE_SHULKERTILE = BLOCKS.register("light_blue_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> BLUE_SHULKERTILE = BLOCKS.register("blue_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> PURPLE_SHULKERTILE = BLOCKS.register("purple_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> MAGENTA_SHULKERTILE = BLOCKS.register("magenta_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> PINK_SHULKERTILE = BLOCKS.register("pink_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    public static RegistryObject<Block> BROWN_SHULKERTILE = BLOCKS.register("brown_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE)));
    //Glowyglowies VV

}
