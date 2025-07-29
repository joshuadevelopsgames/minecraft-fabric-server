import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class brb extends bnm {
   public brb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         blp.B,
         () -> DSL.optional(
            DSL.field(
               "equipment",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("mainhand", blp.u.in($$0)),
                     Pair.of("offhand", blp.u.in($$0)),
                     Pair.of("feet", blp.u.in($$0)),
                     Pair.of("legs", blp.u.in($$0)),
                     Pair.of("chest", blp.u.in($$0)),
                     Pair.of("head", blp.u.in($$0)),
                     Pair.of("body", blp.u.in($$0)),
                     Pair.of("saddle", blp.u.in($$0))
                  }
               )
            )
         )
      );
   }
}
