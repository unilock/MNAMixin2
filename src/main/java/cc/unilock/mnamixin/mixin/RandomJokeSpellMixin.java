package cc.unilock.mnamixin.mixin;

import cc.unilock.mnamixin.LootFunctionTypes;
import com.mna.loot.RandomJokeSpell;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RandomJokeSpell.class)
public class RandomJokeSpellMixin {
    @Inject(method = "getType", at = @At("RETURN"), cancellable = true)
    private void getType(CallbackInfoReturnable<LootItemFunctionType> cir) {
        cir.setReturnValue(LootFunctionTypes.RANDOM_JOKE_SPELL);
    }
}
