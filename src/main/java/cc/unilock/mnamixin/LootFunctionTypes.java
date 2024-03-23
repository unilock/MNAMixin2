package cc.unilock.mnamixin;

import com.mna.ManaAndArtifice;
import com.mna.api.tools.RLoc;
import com.mna.loot.RandomArtifactSpell;
import com.mna.loot.RandomConstructPart;
import com.mna.loot.RandomHat;
import com.mna.loot.RandomJokeSpell;
import com.mna.loot.RandomJournalPage;
import com.mna.loot.RandomManaweaveRecipe;
import com.mna.loot.RandomRunescribeRecipe;
import com.mna.loot.RandomSilverSpell;
import com.mna.loot.RandomSpellStaff;
import com.mna.loot.RandomThaumaturgicLink;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;

public class LootFunctionTypes {
    public static final LootItemFunctionType RANDOM_SPELL_STAFF = register("random_spell_staff", new RandomSpellStaff.Serializer());
    public static final LootItemFunctionType RANDOM_JOURNAL_PAGE = register("random_journal_page", new RandomJournalPage.Serializer());
    public static final LootItemFunctionType RANDOM_MANAWEAVE_RECIPE = register("random_manaweave_recipe", new RandomManaweaveRecipe.Serializer());
    public static final LootItemFunctionType RANDOM_RUNESCRIBE_RECIPE = register("random_runescribe_recipe", new RandomRunescribeRecipe.Serializer());
    public static final LootItemFunctionType RANDOM_CONSTRUCT_PART = register("random_construct_part", new RandomConstructPart.Serializer());
    public static final LootItemFunctionType RANDOM_THAUMATURGIC_LINK = register("random_thaumaturgic_link", new RandomThaumaturgicLink.Serializer());
    public static final LootItemFunctionType RANDOM_JOKE_SPELL = register("random_joke_spell", new RandomJokeSpell.Serializer());
    public static final LootItemFunctionType RANDOM_ARTIFACT_SPELL = register("random_artifact_spell", new RandomArtifactSpell.Serializer());
    public static final LootItemFunctionType RANDOM_SILVER_SPELL = register("random_silver_spell", new RandomSilverSpell.Serializer());
    public static final LootItemFunctionType RANDOM_HAT = register("random_hat", new RandomHat.Serializer());

    public static void init() {
        ManaAndArtifice.LOGGER.info("Mana And Artifice >> Registered loot functions");
    }

    private static <T extends LootItemConditionalFunction> LootItemFunctionType register(String path, LootItemConditionalFunction.Serializer<T> serializer) {
        return Registry.register(BuiltInRegistries.LOOT_FUNCTION_TYPE, RLoc.create(path), new LootItemFunctionType(serializer));
    }
}
