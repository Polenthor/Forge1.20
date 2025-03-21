package com.dutbhe.code;

import com.dutbhe.code.block.ModBlock;
import com.dutbhe.code.item.ModCreativeModTab;
import com.dutbhe.code.item.ModItems;
import com.dutbhe.code.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import static com.dutbhe.code.block.ModBlock.BLOCKS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(code.MOD_ID)
public class code
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "code";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public code()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModTab.register(modEventBus);
        ModBlock.register(modEventBus);
        ModSounds.register(modEventBus);



        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
    event.accept(ModItems.LIME);
    event.accept(ModItems.RAW_LIME);
    event.accept(ModItems.MUSIC_BOX_DISC);
    event.accept(ModItems.SIVA_BOX_DISC);
}
        if (event.getTab() == ModCreativeModTab.LIME.get()) {
            event.accept(ModItems.LIME);
            event.accept(ModItems.RAW_LIME);
            event.accept(ModItems.MUSIC_BOX_DISC);
            event.accept(ModItems.SIVA_BOX_DISC);
            event.accept(ModItems.LIME_SWORD);
            event.accept(ModItems.LIME_PICKAXE);
            event.accept(ModBlock.LIME_BLOCK);
            event.accept(ModItems.CON_CALMA_DISC);
            event.accept(ModItems.MISS_ME_DISC);
        }
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

         }
    }
}
