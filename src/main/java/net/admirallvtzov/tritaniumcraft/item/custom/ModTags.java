package net.admirallvtzov.tritaniumcraft.item.custom;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_TRITANIUM_TOOL = tag("needs_tritanium_tool");

        public static final TagKey<Block> NEEDS_UNITRITANIUM_TOOL = tag("needs_unitritanium_tool");

        private static TagKey<Block> tag(String name) {

            return BlockTags.create(new ResourceLocation(TritaniumCraft.MOD_ID, name));

        }

        private static TagKey<Block> forgeTag(String name) {

            return BlockTags.create(new ResourceLocation("forge", name));

        }

    }

}