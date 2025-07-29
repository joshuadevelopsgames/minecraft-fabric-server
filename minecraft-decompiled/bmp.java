import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.function.Supplier;

public class bmp extends bhn {
   private final Supplier<bmp.a> b = Suppliers.memoize(() -> {
      Type<?> $$0x = this.getInputSchema().getChoiceType(blp.E, "minecraft:potion");
      Type<?> $$1 = bdt.a($$0x, this.getInputSchema().getType(blp.E), this.getOutputSchema().getType(blp.E));
      OpticFinder<?> $$2 = $$1.findField("Item");
      OpticFinder<Pair<String, String>> $$3 = DSL.fieldFinder("id", DSL.named(blp.G.typeName(), bnm.a()));
      return new bmp.a($$2, $$3);
   });

   public bmp(Schema $$0) {
      super("ThrownPotionSplitFix", $$0, true);
   }

   @Override
   protected Pair<String, Typed<?>> a(String $$0, Typed<?> $$1) {
      if (!$$0.equals("minecraft:potion")) {
         return Pair.of($$0, $$1);
      } else {
         String $$2 = this.b.get().a($$1);
         return "minecraft:lingering_potion".equals($$2) ? Pair.of("minecraft:lingering_potion", $$1) : Pair.of("minecraft:splash_potion", $$1);
      }
   }

   record a(OpticFinder<?> a, OpticFinder<Pair<String, String>> b) {
      public String a(Typed<?> $$0) {
         return $$0.getOptionalTyped(this.a).flatMap($$0x -> $$0x.getOptional(this.b)).<String>map(Pair::getSecond).map(bnm::a).orElse("");
      }
   }
}
