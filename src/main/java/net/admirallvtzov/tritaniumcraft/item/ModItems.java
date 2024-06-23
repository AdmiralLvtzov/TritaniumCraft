package net.admirallvtzov.tritaniumcraft.item;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.effect.ModEffects;
import net.admirallvtzov.tritaniumcraft.fluid.ModFluids;
import net.admirallvtzov.tritaniumcraft.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TritaniumCraft.MOD_ID);

    public static final RegistryObject<Item> TRITANIUM = ITEMS.register("tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    /*

        Configurations of the texture:

        Navigate to Colors -> Color Balance in GIMP2.

        In the section "Shadows", let red -60, green -20, blue -15;

        In the section "Midtones", let red -60, green -20, blue 15;

        In the section "Highlights", let red -60, green -20, blue 100;

        (The range of color values is from -100 to 100.)

        Regarding the logoFile of the mod:

        Add 15 to blue in both "Shadows" and "Midtones", but not in "Highlights".

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
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)
                    .craftRemainder(Items.RAW_IRON)));

    public static final RegistryObject<Item> RAW_TRITANIUM = ITEMS.register("raw_tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> COVALENT_BOND_STABILIZER = ITEMS.register("covalent_bond_stabilizer", () -> new StabilizerItem(
            ModEffects.POISONED_BY_COVALENT_BOND_STABILIZER.get(),
            900,
            0,
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)
                    .craftRemainder(Items.GLASS_BOTTLE)));

    public static final RegistryObject<Item> VIRTUAL_SINGLE_BOND_STABILIZER = ITEMS.register("virtual_single_bond_stabilizer", () -> new StabilizerItem(
            ModEffects.POISONED_BY_VIRTUAL_SINGLE_BOND_STABILIZER.get(),
            900,
            0,
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)
                    .craftRemainder(Items.GLASS_BOTTLE)));

    public static final RegistryObject<Item> UNITRITANIUM_NUGGET = ITEMS.register("unitritanium_nugget", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> REINFORCED_HANDLE = ITEMS.register("reinforced_handle", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> HANDLE = ITEMS.register("handle", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer", () -> new SledgehammerItem(
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)
                    .durability(72)));

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

    public static final RegistryObject<Item> TRITANIUM_HELMET = ITEMS.register("tritanium_helmet", () -> new ArmorItem(
            ModArmorMaterials.TRITANIUM,
            EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_CHESTPLATE = ITEMS.register("tritanium_chestplate", () -> new ArmorItem(
            ModArmorMaterials.TRITANIUM,
            EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_LEGGINGS = ITEMS.register("tritanium_leggings", () -> new ArmorItem(
            ModArmorMaterials.TRITANIUM,
            EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> TRITANIUM_BOOTS = ITEMS.register("tritanium_boots", () -> new ArmorItem(
            ModArmorMaterials.TRITANIUM,
            EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_SWORD = ITEMS.register("unitritanium_sword", () -> new SwordItem(
            ModToolTiers.UNITRITANIUM,
            3,
            -2.24f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_AXE = ITEMS.register("unitritanium_axe", () -> new AxeItem(
            ModToolTiers.UNITRITANIUM,
            6,
            -3.1f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_PICKAXE = ITEMS.register("unitritanium_pickaxe", () -> new PickaxeItem(
            ModToolTiers.UNITRITANIUM,
            1,
            -2.8f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_SHOVEL = ITEMS.register("unitritanium_shovel", () -> new ShovelItem(
            ModToolTiers.UNITRITANIUM,
            1.5f,
            -3f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_HOE = ITEMS.register("unitritanium_hoe", () -> new HoeItem(
            ModToolTiers.UNITRITANIUM,
            -2,
            -1f,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_HELMET = ITEMS.register("unitritanium_helmet", () -> new ArmorItem(
            ModArmorMaterials.UNITRITANIUM,
            EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_CHESTPLATE = ITEMS.register("unitritanium_chestplate", () -> new ArmorItem(
            ModArmorMaterials.UNITRITANIUM,
            EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_LEGGINGS = ITEMS.register("unitritanium_leggings", () -> new ArmorItem(
            ModArmorMaterials.UNITRITANIUM,
            EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> UNITRITANIUM_BOOTS = ITEMS.register("unitritanium_boots", () -> new ArmorItem(
            ModArmorMaterials.UNITRITANIUM,
            EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeModeTab.TOOL_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> CLUSTER_OF_COALS = ITEMS.register("cluster_of_coals", () -> new ClusterOfCoalsItem(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> LATTICE_COAT = ITEMS.register("lattice_coat", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> CORUNDUM_TRITANIUM = ITEMS.register("corundum_tritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> LEAF_OF_OREGANO = ITEMS.register("leaf_of_oregano", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)
                    .food(ModFoods.LEAF_OF_OREGANO)));

    public static final RegistryObject<Item> ANTISTATIC_PASTE = ITEMS.register("antistatic_paste", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> ANTISTATIC_COAT = ITEMS.register("antistatic_coat", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> ANTISTATIC_UNITRITANIUM = ITEMS.register("antistatic_unitritanium", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> ANTISTATIC_UNITRITANIUM_NUGGET = ITEMS.register("antistatic_unitritanium_nugget", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB_OF_TRITANIUMCRAFT)));

    public static final RegistryObject<Item> COVALENT_BOND_STABILIZER_BUCKET = ITEMS.register("covalent_bond_stabilizer_bucket", () -> new BucketItem(
            ModFluids.STILL_COVALENT_BOND_STABILIZER,
            new Item.Properties().tab(ModCreativeModeTab.ITEMS_UNDER_DEV_OF_TRITANIUMCRAFT)
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));

    public static final RegistryObject<Item> VIRTUAL_SINGLE_BOND_STABILIZER_BUCKET = ITEMS.register("virtual_single_bond_stabilizer_bucket", () -> new BucketItem(
            ModFluids.STILL_VIRTUAL_SINGLE_BOND_STABILIZER,
            new Item.Properties().tab(ModCreativeModeTab.ITEMS_UNDER_DEV_OF_TRITANIUMCRAFT)
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}