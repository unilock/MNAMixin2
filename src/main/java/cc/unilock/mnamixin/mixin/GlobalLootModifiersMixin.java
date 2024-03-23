package cc.unilock.mnamixin.mixin;

import cc.unilock.mnamixin.LootFunctionTypes;
import com.mna.loot.GlobalLootModifiers;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GlobalLootModifiers.class)
public class GlobalLootModifiersMixin {
    @Inject(method = "init", at = @At("HEAD"), remap = false, cancellable = true)
    private static void init(FMLCommonSetupEvent event, CallbackInfo ci) {
        LootFunctionTypes.init();
        ci.cancel();
    }
}
