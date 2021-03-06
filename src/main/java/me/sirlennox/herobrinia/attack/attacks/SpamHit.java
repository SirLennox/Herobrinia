package me.sirlennox.herobrinia.attack.attacks;

import me.sirlennox.herobrinia.attack.Attack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class SpamHit extends Attack {
    public SpamHit() {
        super("SpamHit", "Spam hit someone");
    }

    @Override
    public void attack(LivingEntity target, LivingEntity herobrine) {
        for(int i = 0; i < 15; i++) {
            target.damage(DamageSource.mob(herobrine), 5);
        }
    }
}
