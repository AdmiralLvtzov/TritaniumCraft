package net.admirallvtzov.tritaniumcraft.fluid;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.block.ModBlocks;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, TritaniumCraft.MODID);

    public static final RegistryObject<FlowingFluid> STILL_COVALENT_BOND_STABILIZER = FLUIDS.register("still_covalent_bond_stabilizer", () -> new ForgeFlowingFluid.Source(ModFluids.PROPERTIES_OF_COVALENT_BOND_STABILIZER));
    public static final RegistryObject<FlowingFluid> FLOWING_COVALENT_BOND_STABILIZER = FLUIDS.register("flowing_covalent_bond_stabilizer", () -> new ForgeFlowingFluid.Flowing(ModFluids.PROPERTIES_OF_COVALENT_BOND_STABILIZER));
    public static final ForgeFlowingFluid.Properties PROPERTIES_OF_COVALENT_BOND_STABILIZER = new ForgeFlowingFluid.Properties(ModFluidTypes.COVALENT_BOND_STABILIZER, STILL_COVALENT_BOND_STABILIZER, FLOWING_COVALENT_BOND_STABILIZER)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)   // These are the same values as water in vanilla Minecraft.
            .block(ModBlocks.BLOCK_OF_COVALENT_BOND_STABILIZER)
            .bucket(ModItems.COVALENT_BOND_STABILIZER_BUCKET);

    public static final RegistryObject<FlowingFluid> STILL_VIRTUAL_SINGLE_BOND_STABILIZER = FLUIDS.register("still_virtual_single_bond_stabilizer", () -> new ForgeFlowingFluid.Source(ModFluids.PROPERTIES_OF_VIRTUAL_SINGLE_BOND_STABILIZER));
    public static final RegistryObject<FlowingFluid> FLOWING_VIRTUAL_SINGLE_BOND_STABILIZER = FLUIDS.register("flowing_virtual_single_bond_stabilizer", () -> new ForgeFlowingFluid.Flowing(ModFluids.PROPERTIES_OF_VIRTUAL_SINGLE_BOND_STABILIZER));
    public static final ForgeFlowingFluid.Properties PROPERTIES_OF_VIRTUAL_SINGLE_BOND_STABILIZER = new ForgeFlowingFluid.Properties(ModFluidTypes.VIRTUAL_SINGLE_BOND_STABILIZER, STILL_VIRTUAL_SINGLE_BOND_STABILIZER, FLOWING_VIRTUAL_SINGLE_BOND_STABILIZER)
            .slopeFindDistance(4)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.BLOCK_OF_VIRTUAL_SINGLE_BOND_STABILIZER)
            .bucket(ModItems.VIRTUAL_SINGLE_BOND_STABILIZER_BUCKET);

    /*

        Fluids for stabilizers was abandoned or at least long-term shelved, because the implementation required an unacceptable investment, a relevant important API didn't work properly, and the feature might only marginally improve the experience of players.

        Please refer to README for specific reasons, which won't be fully expanded here for the sake of brevity.

    */

    public static void register(IEventBus eventBus) {

        FLUIDS.register(eventBus);

    }

}