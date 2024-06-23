package net.admirallvtzov.tritaniumcraft.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class StabilizerItem extends Item {

    private static final int DRINKING_DURATION_OF_STABILIZERS = 32;

    private final MobEffect effect;
    private final int duration;
    private final int amplifier;

    public StabilizerItem(MobEffect pEffect, int pDuration, int pAmplifier, Properties pProperties) {

        super(pProperties);

        this.effect = pEffect;
        this.duration = pDuration;
        this.amplifier = pAmplifier;

    }

    @Override
    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {

        if (!pLevel.isClientSide) {

            MobEffectInstance effectInstance = new MobEffectInstance(this.effect, this.duration, this.amplifier);

            pEntityLiving.addEffect(effectInstance);

            /*

                The MobEffectInstance here seems to be a reference.

                After it was used, its content will be destroyed and the effect can't be applied again.

                So it's necessary to record configurations and generate an instance every time.

            */

        }

        if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {

            pStack.shrink(1);

            if (pStack.isEmpty()) {

                return new ItemStack(Items.GLASS_BOTTLE);

            }

            else {

                Player thisPlayer = (Player) pEntityLiving;

                ItemStack bottleAfterUsing = new ItemStack(Items.GLASS_BOTTLE);

                if(!thisPlayer.getInventory().add(bottleAfterUsing)) {

                    ItemEntity bottleDropped = new ItemEntity(pLevel, thisPlayer.getX(), thisPlayer.getY(), thisPlayer.getZ(), bottleAfterUsing);

                    pLevel.addFreshEntity(bottleDropped);

                }

                return pStack;

                /*

                    Since stabilizers are allowed to be stacked up to 64, the code related to results after using could use some work.

                    If the item stack is not empty, try to add a glass bottle to the player's inventory.

                    If the player's inventory is full, drop a glass bottle around the player.

                */

            }

        }

        else {

            return pStack;

        }

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

}