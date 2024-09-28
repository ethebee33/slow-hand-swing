package net.ethebee3.slowhandswing.mixins;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


import java.util.Collection;
import java.util.Map;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

    @Shadow
    @Final
    private Map<StatusEffect, StatusEffectInstance> activeStatusEffects;

    @Inject(method = "getHandSwingDuration", at = @At("RETURN"), cancellable = true)
    public void getHandSwingDuration(CallbackInfoReturnable<Integer> cir) {
        int value = cir.getReturnValue();
        if (true)/* add check for enabled */ {
            value = 12;
        }
        cir.setReturnValue(value);
    }


}
