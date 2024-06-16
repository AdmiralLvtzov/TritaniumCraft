package net.admirallvtzov.tritaniumcraft.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties LEAF_OF_OREGANO = (new FoodProperties.Builder())
            .nutrition(1)
            .saturationMod(0.2f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 50, 0), 1f)
            .fast()
            .build();

}