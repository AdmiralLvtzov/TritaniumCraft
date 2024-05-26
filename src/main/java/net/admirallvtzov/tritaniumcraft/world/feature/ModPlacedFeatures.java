package net.admirallvtzov.tritaniumcraft.world.feature;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, TritaniumCraft.MODID);

    public static final RegistryObject<PlacedFeature> PLACEMENT_OF_TRITANIUM_ORE_I = PLACED_FEATURES.register("placement_of_tritanium_ore_i", () -> new PlacedFeature(
            ModConfiguredFeatures.TRITANIUM_ORE.getHolder().get(),
            commonOrePlacement(6,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))
            )));

    public static final RegistryObject<PlacedFeature> PLACEMENT_OF_TRITANIUM_ORE_II = PLACED_FEATURES.register("placement_of_tritanium_ore_ii", () -> new PlacedFeature(
            ModConfiguredFeatures.TRITANIUM_ORE.getHolder().get(),
            commonOrePlacement(4,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-128), VerticalAnchor.absolute(0))
            )));

    /*

        VerticalAnchor.aboveBottom() was used here, but it was found to not work properly - the generation of ores would ignore limits of height.

        After some tests were done to confirm that VerticalAnchor.aboveBottom() was not effective, VerticalAnchor.absolute() was adopted. It works fine as expected.

        Some notes which may be helpful VerticalAnchor.aboveBottom() sets the y-axis at the bottom of the world as 0. The absolute y-axis at the bottom of the world is -64 in the current version.

        VerticalAnchor.absolute() is pretty self-explanatory - it takes absolute coordinate values. The y-axis of the sea level, which is also where the deepslate starts to completely takes over, is 0 at the moment.

    */

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    private static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

    public static void register(IEventBus eventBus) {

        PLACED_FEATURES.register(eventBus);

    }

}