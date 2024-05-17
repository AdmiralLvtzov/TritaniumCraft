package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TritaniumCraft.MODID);

    public static final RegistryObject<Item> UNITRITANIUM = ITEMS.register("unitritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM = ITEMS.register("tritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNSTABLEUNITRITANIUM = ITEMS.register("unstableunitritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNSTABLETRITANIUM = ITEMS.register("unstabletritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> RAWTRITANIUM = ITEMS.register("rawtritanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> ILMENTRITE = ITEMS.register("ilmentrite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> COVALENTBONDSTABILIZER = ITEMS.register("covalentbondstabilizer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> VIRTUALSINGLEBONDSTABILIZER = ITEMS.register("virtualsinglebondstabilizer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}