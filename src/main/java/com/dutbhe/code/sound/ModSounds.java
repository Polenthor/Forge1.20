package com.dutbhe.code.sound;

import com.dutbhe.code.code;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, code.MOD_ID);

    public static RegistryObject<SoundEvent> MUSIC_BOX = registerSoundEvent("music_box");
    public static RegistryObject<SoundEvent> SIVA_BOX = registerSoundEvent("siva_box");
    public static RegistryObject<SoundEvent> CON_CALMA = registerSoundEvent("con_calma");
    public static RegistryObject<SoundEvent> MISS_ME           = registerSoundEvent("miss_me");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(code.MOD_ID,name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    // If the sounds stops in the middle it is because of the ogg file
    //The ogg file must be converted by the correct way

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
