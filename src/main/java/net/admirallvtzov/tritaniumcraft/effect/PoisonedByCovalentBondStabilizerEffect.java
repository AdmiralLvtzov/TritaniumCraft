package net.admirallvtzov.tritaniumcraft.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class PoisonedByCovalentBondStabilizerEffect extends MobEffect {

    public PoisonedByCovalentBondStabilizerEffect(MobEffectCategory pCategory, int pColor) {

        super(pCategory, pColor);

    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

        pLivingEntity.hurt(DamageSource.WITHER, 1.0f);

    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {

        final int period = 40 >> pAmplifier;

        if (period > 0) {

            return pDuration % period == 0;

        }

        else {

            return true;

        }

    }

}