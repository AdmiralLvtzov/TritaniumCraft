package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TritaniumCraft.MODID);

    public static final RegistryObject<Item> UNITRITANIUM = ITEMS.register("unitritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRITANIUMCRAFTITEMTAB)));

    public static final RegistryObject<Item> TRITANIUM = ITEMS.register("tritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TRITANIUMCRAFTITEMTAB)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}