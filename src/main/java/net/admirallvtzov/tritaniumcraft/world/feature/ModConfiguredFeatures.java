package net.admirallvtzov.tritaniumcraft.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, TritaniumCraft.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> TRITANIUM_ORES_IN_OVERWORLD = Suppliers.memoize( () -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TRITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TRITANIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TRITANIUM_ORE = CONFIGURED_FEATURES.register("tritanium_ore", () -> new ConfiguredFeature<>(
            Feature.ORE,
            new OreConfiguration(TRITANIUM_ORES_IN_OVERWORLD.get(), 50)));

    public static void register(IEventBus eventBus) {

        CONFIGURED_FEATURES.register(eventBus);

    }

}