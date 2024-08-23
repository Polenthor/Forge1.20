package com.dutbhe.code.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier LIME = new ForgeTier(3,2400,2.5f,
            8f,24, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.LIME.get()));

    public static final ForgeTier RUBY = new ForgeTier(4,2500,6.5f,
            9f,25, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.LIME.get()));
}
