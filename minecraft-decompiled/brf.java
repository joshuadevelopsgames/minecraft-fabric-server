import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class brf extends bnm {
   public brf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         blp.c,
         () -> DSL.and(
            blp.B.in($$0),
            DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", blp.D.in($$0))),
                  Pair.of("ender_pearls", DSL.list(blp.D.in($$0))),
                  Pair.of("Inventory", DSL.list(blp.u.in($$0))),
                  Pair.of("EnderItems", DSL.list(blp.u.in($$0))),
                  Pair.of("ShoulderEntityLeft", blp.D.in($$0)),
                  Pair.of("ShoulderEntityRight", blp.D.in($$0)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(blp.M.in($$0)), "toBeDisplayed", DSL.list(blp.M.in($$0))))
               }
            )
         )
      );
   }
}
