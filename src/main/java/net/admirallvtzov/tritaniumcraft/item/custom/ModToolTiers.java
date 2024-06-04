package net.admirallvtzov.tritaniumcraft.item.custom;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static Tier TRITANIUM;

    static {

        TRITANIUM = TierSortingRegistry.registerTier(
                new ForgeTier(
                        3,
                        1404,
                        8.4f, // Only related to the speed of breaking.
                        3f, // Final Damage = Damage of fists (1) + Damage Bonus of the tier + Damage Modifier of the tool
                        9,
                        ModTags.Blocks.NEEDS_TRITANIUM_TOOL,
                        () -> Ingredient.of(ModItems.TRITANIUM.get())),
                new ResourceLocation(TritaniumCraft.MOD_ID, "tritanium"),
                List.of(Tiers.DIAMOND),
                List.of(Tiers.NETHERITE)
        );

    }

    public static Tier UNITRITANIUM;

    static {

        UNITRITANIUM = TierSortingRegistry.registerTier(
                new ForgeTier(
                        2,
                        322,
                        6.48f,
                        2.0f,
                        18,
                        ModTags.Blocks.NEEDS_UNITRITANIUM_TOOL,
                        () -> Ingredient.of(ModItems.UNITRITANIUM.get())),
                new ResourceLocation(TritaniumCraft.MOD_ID, "unitritanium"),
                List.of(Tiers.IRON),
                List.of(Tiers.DIAMOND)
        );

    }

}