package net.admirallvtzov.tritaniumcraft;

import com.mojang.logging.LogUtils;
import net.admirallvtzov.tritaniumcraft.block.ModBlocks;
import net.admirallvtzov.tritaniumcraft.effect.ModEffects;
import net.admirallvtzov.tritaniumcraft.fluid.ModFluidTypes;
import net.admirallvtzov.tritaniumcraft.fluid.ModFluids;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.admirallvtzov.tritaniumcraft.world.feature.ModConfiguredFeatures;
import net.admirallvtzov.tritaniumcraft.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TritaniumCraft.MOD_ID)
public class TritaniumCraft
{

    public static final String MOD_ID = "tritaniumcraft";

    private static final Logger LOGGER = LogUtils.getLogger();

    public TritaniumCraft()
    {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModEffects.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }

    }

}