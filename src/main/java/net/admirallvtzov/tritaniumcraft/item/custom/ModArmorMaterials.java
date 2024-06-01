package net.admirallvtzov.tritaniumcraft.item.custom;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    TRITANIUM("tritanium",
            29,
            new int[]{4, 6, 9, 3},
            9,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.2f,
            0f,
            () -> { return Ingredient.of(ModItems.TRITANIUM.get()); });

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 13, 15, 16, 11 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {

        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;

    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {

        return BASE_DURABILITY[pSlot.ordinal()] * this.durabilityMultiplier;

    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {

        return this.protectionAmounts[pSlot.ordinal()];

    }

    @Override
    public int getEnchantmentValue() {

        return this.enchantmentValue;

    }

    @Override
    public SoundEvent getEquipSound() {

        return this.equipSound;

    }

    @Override
    public Ingredient getRepairIngredient() {

        return this.repairIngredient.get();

    }

    @Override
    public String getName() {

        return TritaniumCraft.MODID + ":" + this.name;

    }

    @Override
    public float getToughness() {

        return this.toughness;

    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
