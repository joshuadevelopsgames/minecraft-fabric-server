import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bqy extends bnm {
   public bqy(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         blp.A,
         () -> DSL.or(
            DSL.or(DSL.constType(DSL.string()), DSL.list(blp.A.in($$0))),
            DSL.optionalFields(
               "extra",
               DSL.list(blp.A.in($$0)),
               "separator",
               blp.A.in($$0),
               "hoverEvent",
               DSL.taggedChoice(
                  "action",
                  DSL.string(),
                  Map.of(
                     "show_text",
                     DSL.optionalFields("contents", blp.A.in($$0)),
                     "show_item",
                     DSL.optionalFields("contents", DSL.or(blp.u.in($$0), blp.G.in($$0))),
                     "show_entity",
                     DSL.optionalFields("type", blp.C.in($$0), "name", blp.A.in($$0))
                  )
               )
            )
         )
      );
   }
}
