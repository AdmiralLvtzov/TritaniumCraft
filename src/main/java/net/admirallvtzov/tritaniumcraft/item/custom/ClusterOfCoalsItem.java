package net.admirallvtzov.tritaniumcraft.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ClusterOfCoalsItem extends Item {

    private static int BURNTIME = 7200;

    public ClusterOfCoalsItem(Properties pProperties) {

        super(pProperties);

    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {

        return ClusterOfCoalsItem.BURNTIME;

    }

}