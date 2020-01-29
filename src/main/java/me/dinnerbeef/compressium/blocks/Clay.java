package me.dinnerbeef.compressium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;


public class Clay extends Block {


    public Clay() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.GROUND).hardnessAndResistance(2.0f));
        setRegistryName("clay");
        RenderType.cutout();
    }
}