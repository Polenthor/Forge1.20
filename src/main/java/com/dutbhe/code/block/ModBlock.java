package com.dutbhe.code.block;

import com.dutbhe.code.code;

import com.dutbhe.code.item.ModItems;


import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.block.Block;


import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.state.BlockBehaviour.*;
import static net.minecraft.world.level.material.MapColor.STONE;

public class ModBlock {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, code.MOD_ID);

    public static final RegistryObject<Block> LIME_BLOCK = BLOCKS.register("lime_block",
            () -> new Block(Properties.of().mapColor(STONE).requiresCorrectToolForDrops()
                    .explosionResistance(2).strength(2)));
// very important




    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryObjectItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item>registryObjectItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
