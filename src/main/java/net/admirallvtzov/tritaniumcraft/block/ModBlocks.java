package net.admirallvtzov.tritaniumcraft.block;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.item.ModCreativeModeTab;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TritaniumCraft.MODID);

    public static final RegistryObject<Block> TRITANIUMORE = registerBlock("tritaniumore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3)
                    .requiresCorrectToolForDrops(),
            UniformInt.of(1,2)),
            ModCreativeModeTab.TRITANIUMCRAFTBLOCKTAB);

    public static final RegistryObject<Block> DEEPSLATETRITANIUMORE = registerBlock("deepslatetritaniumore", () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4)
                            .requiresCorrectToolForDrops(),
                    UniformInt.of(1,3)),
            ModCreativeModeTab.TRITANIUMCRAFTBLOCKTAB);

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
