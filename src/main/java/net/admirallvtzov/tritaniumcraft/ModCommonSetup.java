package net.admirallvtzov.tritaniumcraft;

import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModCommonSetup {

    private static final float fInComposterBlockClass = 0.3f;
    private static final float f1InComposterBlockClass = 0.5f;

    public static void commonSetup(final FMLCommonSetupEvent event) {

        event.enqueueWork( () -> {

            ComposterBlock.COMPOSTABLES.put(ModItems.LEAF_OF_OREGANO.get(), f1InComposterBlockClass);
            ComposterBlock.COMPOSTABLES.put(ModItems.ANTISTATIC_PASTE.get(), fInComposterBlockClass);

        });

    }

}