package com.dutbhe.code.block;

import com.dutbhe.code.code;

import com.dutbhe.code.item.ModItems;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.block.Block;


import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jline.utils.InfoCmp;

import java.util.function.Supplier;

import static net.minecraft.world.level.material.MapColor.STONE;
import static org.jline.utils.InfoCmp.Capability.tab;

public class ModBlock {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, code.MOD_ID);

    public static final RegistryObject<Block> LIME_BLOCK = registerBlock("lime_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));


        private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
            return BLOCKS.register(name, block);
// very important



        }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registryObjectItem(String name, RegistryObject<T> toReturn, InfoCmp.Capability capability) {
    }

    private static <T extends Block>RegistryObject<Item>registryBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
