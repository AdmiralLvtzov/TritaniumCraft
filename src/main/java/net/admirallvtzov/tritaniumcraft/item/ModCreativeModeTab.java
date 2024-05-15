package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab TRITANIUMCRAFTITEMTAB = new CreativeModeTab("tritaniumcraftitemtab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UNSTABLETRITANIUM.get());
        }

    };

    public static final CreativeModeTab TRITANIUMCRAFTBLOCKTAB = new CreativeModeTab("tritaniumcraftblocktab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BLOCKOFTRITANIUM.get());
        }

    };

    public static final CreativeModeTab TRITANIUMCRAFTMACHINETAB = new CreativeModeTab("tritaniumcraftmachinetab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UNSTABLETRITANIUM.get());
        }

    };

}