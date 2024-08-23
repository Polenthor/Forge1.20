package com.dutbhe.code.coustom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class LimeCoal extends Item {
    public LimeCoal(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 3200;
    }
}
