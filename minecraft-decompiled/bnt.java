import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bnt extends Schema {
   public bnt(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         blp.c,
         () -> DSL.optionalFields(
            "RootVehicle",
            DSL.optionalFields("Entity", blp.D.in($$0)),
            "ender_pearls",
            DSL.list(blp.D.in($$0)),
            "Inventory",
            DSL.list(blp.u.in($$0)),
            "EnderItems",
            DSL.list(blp.u.in($$0))
         )
      );
      $$0.registerType(true, blp.D, () -> DSL.optionalFields("Passengers", DSL.list(blp.D.in($$0)), blp.E.in($$0)));
   }
}
