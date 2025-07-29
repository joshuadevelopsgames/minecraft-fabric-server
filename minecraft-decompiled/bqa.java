import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bqa extends bnm {
   public bqa(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      this.register($$1, "minecraft:sign", () -> a($$0));
      return $$1;
   }

   public static TypeTemplate a(Schema $$0) {
      return DSL.optionalFields(
         "front_text",
         DSL.optionalFields("messages", DSL.list(blp.A.in($$0)), "filtered_messages", DSL.list(blp.A.in($$0))),
         "back_text",
         DSL.optionalFields("messages", DSL.list(blp.A.in($$0)), "filtered_messages", DSL.list(blp.A.in($$0)))
      );
   }
}
