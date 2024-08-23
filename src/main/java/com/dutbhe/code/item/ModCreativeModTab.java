package com.dutbhe.code.item;

import com.dutbhe.code.code;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            code.MOD_ID);
    public static RegistryObject<CreativeModeTab> LIME = CREATIVE_MOD_TABS.register("lime",() ->
            CreativeModeTab.builder().build());
     public static void register(IEventBus eventBus){
         CREATIVE_MOD_TABS.register(eventBus);
     }



}
