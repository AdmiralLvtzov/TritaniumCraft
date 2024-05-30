package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab ITEM_TAB_OF_TRITANIUMCRAFT = new CreativeModeTab("item_tab_of_tritaniumcraft") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UNSTABLE_TRITANIUM.get());
        }

    };

    public static final CreativeModeTab TOOL_TAB_OF_TRITANIUMCRAFT = new CreativeModeTab("tool_tab_of_tritaniumcraft") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TRITANIUM_SWORD.get());
        }

    };

    public static final CreativeModeTab BLOCK_TAB_OF_TRITANIUMCRAFT = new CreativeModeTab("block_tab_of_tritaniumcraft") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BLOCK_OF_TRITANIUM.get());
        }

    };

    public static final CreativeModeTab MACHINE_TAB_OF_TRITANIUMCRAFT = new CreativeModeTab("machine_tab_of_tritaniumcraft") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UNSTABLE_TRITANIUM.get());
        }

    };

    public static final CreativeModeTab ITEMS_UNDER_DEV_OF_TRITANIUMCRAFT = new CreativeModeTab("items_under_dev_of_tritaniumcraft") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SLEDGEHAMMER.get());
        }

    };

}