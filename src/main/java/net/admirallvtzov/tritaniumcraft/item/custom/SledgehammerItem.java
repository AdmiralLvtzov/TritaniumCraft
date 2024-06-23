package net.admirallvtzov.tritaniumcraft.item.custom;

import net.admirallvtzov.tritaniumcraft.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;

public class SledgehammerItem extends Item implements IForgeItem {

    public SledgehammerItem(Properties pProperties) {

        super(pProperties);

    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack pStack) {

        /*

            The methods hasCraftingRemainingItem() and getCraftingRemainingItem() in the Item class have been deprecated, their new versions are not in the Item class.

            Their new versions are in the interface class IForgeItem, with a parameter of the class ItemStack.

        */

        ItemStack result = ItemStack.EMPTY;

        /*

            The pStack passed in seems to be a reference.

            After the synthesis is completed, this ItemStack will be destroyed and it can't be used again.

            Therefore, pStack can't be directly returned here, a new copy is necessary.

        */

        if( pStack.hasTag() && pStack.getTag().contains("Damage") ) {

            int thisDamage = pStack.getTag().getInt("Damage");

            /*

                // Messages of traces for debugging.

                Component messageOfTraces;

                messageOfTraces = Component.literal("thisDamage = " + thisDamage);

                Minecraft.getInstance().player.sendSystemMessage(messageOfTraces);

                messageOfTraces = Component.literal("this.getMaxDamage(pStack) = " + this.getMaxDamage(pStack) + "\n");

                Minecraft.getInstance().player.sendSystemMessage(messageOfTraces);

            */

            ++thisDamage;

            /*

                Actually, Items in Minecraft never have a tag of the durability.

                Instead, there is a tag, Damage, which indicates how much damage has been applied to the item.

                When the Damage tag is 0, the item is fully intact.

                Conversely, when the tag reaches its maximum, the item is completely damaged.

            */

            if( thisDamage < this.getMaxDamage(pStack) ) {

                result = new ItemStack(ModItems.SLEDGEHAMMER.get());

                result.getTag().putInt("Damage", thisDamage);

            }

        }

        return result;

    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack pStack) {

        return true;

    }

    @Override
    public boolean isEnchantable(ItemStack pStack) {

        return false;

        /*

            If enchantments are not disabled, the enchantments "Unbreaking" and "Mending" can be applied to the sledgehammer.

            This may be not what I hoped, as it would be difficult to balance the durability of the sledgehammer with the experience gain of players.

        */

    }

    @Override
    public boolean isRepairable(ItemStack stack) {

        return false;

        /*

          Since the sledgehammer will only reduce 1 durability after a synthesis instead of consuming itself, the mechanism of repairs can be used to achieve infinite synthesis of sledgehammers.

          The mechanism of repairs is that two identical damaged items can be synthesized into one more intact item, it has to be disabled in this case.

        */

    }

}