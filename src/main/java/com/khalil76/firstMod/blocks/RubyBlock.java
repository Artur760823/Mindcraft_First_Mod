package com.khalil76.firstMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)//typ materiału bloku
                .hardnessAndResistance(5.0f, 6.0f) //twardość i czas rozwalenia
                .sound(SoundType.METAL)//dźwięk jaki wydaje przy udeżeniu
                .harvestLevel(2)//poziom narzędzia jakim możesz zebrać materiał z niego inaczej zniknie
                .harvestTool(ToolType.PICKAXE)//typ narzędzia zalecany do wydobycia
        );
    }
}
