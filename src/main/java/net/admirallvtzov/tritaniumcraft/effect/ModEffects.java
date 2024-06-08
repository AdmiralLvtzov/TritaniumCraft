package net.admirallvtzov.tritaniumcraft.effect;

import net.admirallvtzov.tritaniumcraft.TritaniumCraft;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TritaniumCraft.MOD_ID);

    /*

        It's necessary to extend then override the class "MobEffect" here for new mob effects.

        Overriding via an anonymous class is also viable, but it will clutter the typography and reduce the readability.

    */

    public static final RegistryObject<MobEffect> POISONED_BY_COVALENT_BOND_STABILIZER = MOB_EFFECTS.register("poisoned_by_covalent_bond_stabilizer", () -> new PoisonedByCovalentBondStabilizerEffect(
            MobEffectCategory.HARMFUL,
            11401983));

    public static final RegistryObject<MobEffect> POISONED_BY_VIRTUAL_SINGLE_BOND_STABILIZER = MOB_EFFECTS.register("poisoned_by_virtual_single_bond_stabilizer", () -> new PoisonedByVirtualSingleBondStabilizerEffect(
            MobEffectCategory.HARMFUL,
            5536462));

    public static void register(IEventBus eventBus) {

        MOB_EFFECTS.register(eventBus);

    }

}