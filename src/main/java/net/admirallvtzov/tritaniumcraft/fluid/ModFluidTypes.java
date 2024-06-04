package net.admirallvtzov.tritaniumcraft.fluid;

import com.mojang.math.Vector3f;
import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TritaniumCraft.MODID);

    public static final RegistryObject<FluidType> COVALENT_BOND_STABILIZER = registerCovalentBondStabilizer("covalent_bond_stabilizer", generalConfigurationsOfStabilizers());

    public static final RegistryObject<FluidType> VIRTUAL_SINGLE_BOND_STABILIZER = registerVirtualSingleBondStabilizer("virtual_single_bond_stabilizer", generalConfigurationsOfStabilizers());

    private static FluidType.Properties generalConfigurationsOfStabilizers() {

        return FluidType.Properties.create()
                .canHydrate(false)
                .lightLevel(0)
                .density(1000)
                .temperature(300)
                .viscosity(1000)
                .motionScale(0.014d)
                .canPushEntity(true)
                .canSwim(true)
                .canDrown(true)
                .fallDistanceModifier(0)
                .canExtinguish(true)
                .canConvertToSource(false)
                .supportsBoating(true)
                .pathType(BlockPathTypes.WATER)
                .adjacentPathType(BlockPathTypes.WATER_BORDER);

        /*

            A related page on GitHub which may be helpful:

            https://github.com/MinecraftForge/MinecraftForge/issues/8608

            However, these APIs are very likely broken...

            Modifying some of them won't make any difference to the game.

        */

    }

    private static RegistryObject<FluidType> registerCovalentBondStabilizer(String name, FluidType.Properties properties) {

        return FLUID_TYPES.register(name, () -> new BaseFluidType(
                new ResourceLocation("block/water_still"),
                new ResourceLocation("block/water_flow"),
                new ResourceLocation("misc/underwater"),
                0xA1ADFAFF,
                new Vector3f( 173f / 255f, 250f / 255f, 255f / 255f ),
                properties));

    }

    private static RegistryObject<FluidType> registerVirtualSingleBondStabilizer(String name, FluidType.Properties properties) {

        return FLUID_TYPES.register(name, () -> new BaseFluidType(
                new ResourceLocation("block/water_still"),
                new ResourceLocation("block/water_flow"),
                new ResourceLocation("misc/underwater"),
                0xA1547ACE,
                new Vector3f( 84f / 255f, 122f / 255f, 206f / 255f ),
                properties));

    }

    public static void register(IEventBus eventBus) {

        FLUID_TYPES.register(eventBus);

    }

}