package net.admirallvtzov.tritaniumcraft.item.custom;

import net.admirallvtzov.tritaniumcraft.effect.ModEffects;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

@Deprecated
public class DeprecatedStabilizerItem extends Item {

    /*

        Unique NBT tags for stabilizers were long-term shelved due to several reasons.

        Please refer to README for more details. Maybe this epic would be continued in the future.

        This class has been copied and modified to provide expanded features for stabilizers.

    */

    private static final int DRINKING_DURATION_OF_STABILIZERS = 32;

    public DeprecatedStabilizerItem(Properties pProperties) {

        super(pProperties);

    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {

        if (!pLevel.isClientSide) {

            int customModelData = pStack.getOrCreateTag().getInt("CustomModelData");

            switch (customModelData) {

                case 1: {

                    pEntityLiving.addEffect(new MobEffectInstance(ModEffects.POISONED_BY_COVALENT_BOND_STABILIZER.get(), 900, 0));

                    break;

                }

                case 2: {

                    pEntityLiving.addEffect(new MobEffectInstance(ModEffects.POISONED_BY_VIRTUAL_SINGLE_BOND_STABILIZER.get(), 900, 0));

                    break;

                }

                default: {

                    break;

                }

            }

        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {

            pStack.shrink(1);

        }

        return pStack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : pStack;

    }

    @Override
    public int getUseDuration(ItemStack pStack) {

        return DRINKING_DURATION_OF_STABILIZERS;

    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {

        return UseAnim.DRINK;

    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {

        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pHand);

    }

    @Override
    public void fillItemCategory(CreativeModeTab pCategory, NonNullList<ItemStack> pItems) {

        if (this.allowedIn(pCategory)) {

            pItems.add(createModelData(1));     // Covalent Bond Stabilizer
            pItems.add(createModelData(2));     // Virtual Single Bond Stabilizer

            /*

                It's necessary to add the case where custom_model_data = 3 in the JSON file.

                Otherwise, for situations where custom_model_data > 2, the icon when the value is 2 will be used.

            */

        }

    }

    private ItemStack createModelData(int customModelData) {

        ItemStack result = new ItemStack(this);

        result.getOrCreateTag().putInt("CustomModelData", customModelData);

        /*

            The name here have to be "CustomModelData" and not anything else.

            The predicate in the JSON file also have to be exactly the same as "custom_model_data".

        */

        return result;

    }

    @Override
    public Component getName(ItemStack pStack) {

        int customModelData = pStack.getOrCreateTag().getInt("CustomModelData");

        switch (customModelData) {

            case 1: {

                return Component.translatable(this.getDescriptionId(pStack) + ".covalent_bond");

            }

            case 2: {

                return Component.translatable(this.getDescriptionId(pStack) + ".virtual_single_bond");

            }

            default: {

                return Component.translatable(this.getDescriptionId(pStack) + ".distilled_water");

            }

        }

    }

}