package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.item.custom.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TritaniumCraft.MODID);

    public static final RegistryObject<Item> TRITANIUM = ITEMS.register("tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    /*

        Configurations of the texture:

        Navigate to Colors -> Color Balance in GIMP2.

        In the section "Shadows", let red -60, green -20, blue -15;

        In the section "Midtones", let red -60, green -20, blue 15;

        In the section "Highlights", let red -60, green -20, blue 100;

        (The range of color values is from -100 to 100.)

    */

    public static final RegistryObject<Item> UNITRITANIUM = ITEMS.register("unitritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    /*

        Configurations of the texture:

        Navigate to Colors -> Color Balance in GIMP2.

        In the section "Shadows", let red 20, green 10, blue -20;

        In the section "Midtones", let red 20, green 10, blue -5;

        In the section "Highlights", let red 20, green 10, blue -5;

        (The range of color values is from -100 to 100.)

    */

    public static final RegistryObject<Item> UNSTABLE_TRITANIUM = ITEMS.register("unstable_tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNSTABLE_UNITRITANIUM = ITEMS.register("unstable_unitritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> ILMENTRITE = ITEMS.register("ilmentrite", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> RAW_TRITANIUM = ITEMS.register("raw_tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> COVALENT_BOND_STABILIZER = ITEMS.register("covalent_bond_stabilizer", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> VIRTUAL_SINGLE_BOND_STABILIZER = ITEMS.register("virtual_single_bond_stabilizer", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_NUGGET = ITEMS.register("unitritanium_nugget", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> REINFORCED_HANDLE = ITEMS.register("reinforced_handle", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_SWORD = ITEMS.register("tritanium_sword", () -> new SwordItem(
            ModToolTiers.TRITANIUM,
            3, // Final Damage = Damage of fists (1) + Damage Bonus of the tier + Damage Modifier of the tool
            -2.24f, // Final Attack Speed = Speed of fists (4) + Speed Modifier of the tool
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_AXE = ITEMS.register("tritanium_axe", () -> new AxeItem(
            ModToolTiers.TRITANIUM,
            5,
            -3f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_PICKAXE = ITEMS.register("tritanium_pickaxe", () -> new PickaxeItem(
            ModToolTiers.TRITANIUM,
            1,
            -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_SHOVEL = ITEMS.register("tritanium_shovel", () -> new ShovelItem(
            ModToolTiers.TRITANIUM,
            1.5f,
            -3f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_HOE = ITEMS.register("tritanium_hoe", () -> new HoeItem(
            ModToolTiers.TRITANIUM,
            -3,
            0f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEMS_UNDER_DEV_OF_TRITANIUMCRAFT)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}