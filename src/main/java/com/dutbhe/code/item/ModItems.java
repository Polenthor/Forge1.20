package com.dutbhe.code.item;

import com.dutbhe.code.code;

import com.dutbhe.code.sound.ModSounds;
import net.minecraft.world.item.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, code.MOD_ID);

    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new Item(new Item.Properties().food(ModFoods.DIAMOND_APPLE)));
    public static final RegistryObject<Item> RAW_LIME = ITEMS.register("raw_lime",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_SWORD = ITEMS.register("lime_sword",
            ()-> new LevitationSwordItem(ModTiers.LIME,8,1300f,new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIME_PICKAXE = ITEMS.register("lime_pickaxe",
            () ->new PickaxeItem(ModTiers.LIME,9,900f,new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_BOX_DISC = ITEMS.register("music_box_disc",
            () -> new RecordItem(8, ModSounds.MUSIC_BOX,new Item.Properties().stacksTo(1),4800));
    public static final RegistryObject<Item> SIVA_BOX_DISC = ITEMS.register("siva_box_disc",
            () -> new RecordItem(15, ModSounds.SIVA_BOX,new Item.Properties().stacksTo(1),5500));
    public static final RegistryObject<Item> CON_CALMA_DISC = ITEMS.register("con_calma_disc",
            () -> new RecordItem(14,ModSounds.CON_CALMA,new Item.Properties().stacksTo(1),4800));
    public static final RegistryObject<Item> MISS_ME_DISC = ITEMS.register("miss_me_disc",
            () -> new RecordItem(14,ModSounds.MISS_ME,new Item.Properties().stacksTo(1),5500));



    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
