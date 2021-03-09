package com.khalil76.firstMod.util;

import com.khalil76.firstMod.FirstMod;
import com.khalil76.firstMod.blocks.BlockItemBase;
import com.khalil76.firstMod.blocks.RubyBlock;
import com.khalil76.firstMod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    //inicjowanie itemu w grze
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Items
    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", ItemBase::new);

    //BLOCK
    public static final RegistryObject<Block> RUBY_BLOCK =
            BLOCKS.register("ruby_block", RubyBlock::new);

    //Block items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM =
            ITEMS.register("ruby_block",
                    ()-> new BlockItemBase(RUBY_BLOCK.get()));

}
