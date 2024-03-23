package cc.unilock.mnamixin.mixin;

import cc.unilock.mnamixin.LootFunctionTypes;
import com.mna.loot.RandomSilverSpell;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RandomSilverSpell.class)
public class RandomSilverSpellMixin {
    @Inject(method = "getType", at = @At("RETURN"), cancellable = true)
    private void getType(CallbackInfoReturnable<LootItemFunctionType> cir) {
        cir.setReturnValue(LootFunctionTypes.RANDOM_SILVER_SPELL);
    }
}
