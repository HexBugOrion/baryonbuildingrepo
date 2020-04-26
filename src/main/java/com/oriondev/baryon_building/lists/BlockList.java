package com.oriondev.baryon_building.lists;

import com.oriondev.baryon_building.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {



    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static RegistryObject<Block> BLACK_SHULKERTILE = BLOCKS.register("black_shulkertile", ()-> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.METAL)));

    //Shulkertile blocks VV
    //public static Block white_shulkertile;
    //public static Block black_shulkertile;
    //public static Block light_gray_shulkertile;
    //public static Block gray_shulkertile;
    //public static Block red_shulkertile;
    //public static Block orange_shulkertile;
   // public static Block yellow_shulkertile;
    //public static Block green_shulkertile;
    //public static Block lime_shulkertile;
    //public static Block cyan_shulkertile;
    //public static Block light_blue_shulkertile;
    //public static Block blue_shulkertile;
    //public static Block purple_shulkertile;
   //public static Block magenta_shulkertile;
   //public static Block pink_shulkertile;
    //public static Block brown_shulkertile;
    //Glowyglowies VV

}
