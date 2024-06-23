package net.admirallvtzov.tritaniumcraft.block;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.fluid.ModFluids;
import net.admirallvtzov.tritaniumcraft.item.ModCreativeModeTab;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TritaniumCraft.MOD_ID);

    public static final RegistryObject<Block> BLOCK_OF_TRITANIUM = registerBlock("block_of_tritanium", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> BLOCK_OF_UNITRITANIUM = registerBlock("block_of_unitritanium", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> TRITANIUM_ORE = registerBlock("tritanium_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f)
                    .requiresCorrectToolForDrops(),
            UniformInt.of(1,2)),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> DEEPSLATE_TRITANIUM_ORE = registerBlock("deepslate_tritanium_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f)
                    .requiresCorrectToolForDrops(),
            UniformInt.of(1,3)),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> BLOCK_OF_RAW_TRITANIUM = registerBlock("block_of_raw_tritanium", () -> new Block(
            BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> BLOCK_OF_CORUNDUM_TRITANIUM = registerBlock("block_of_corundum_tritanium", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<Block> BLOCK_OF_ANTISTATIC_UNITRITANIUM = registerBlock("block_of_antistatic_unitritanium", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BLOCK_TAB_OF_TRITANIUMCRAFT);

    public static final RegistryObject<LiquidBlock> BLOCK_OF_COVALENT_BOND_STABILIZER = BLOCKS.register("block_of_covalent_bond_stabilizer", () -> new LiquidBlock(
            ModFluids.STILL_COVALENT_BOND_STABILIZER,
            BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> BLOCK_OF_VIRTUAL_SINGLE_BOND_STABILIZER = BLOCKS.register("block_of_virtual_single_bond_stabilizer", () -> new LiquidBlock(
            ModFluids.STILL_VIRTUAL_SINGLE_BOND_STABILIZER,
            BlockBehaviour.Properties.copy(Blocks.WATER)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn, tab);

        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);

    }

}