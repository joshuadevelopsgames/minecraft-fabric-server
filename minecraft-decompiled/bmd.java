import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class bmd extends bkj {
   private static final List<String> c = List.of("Text1", "Text2", "Text3", "Text4");

   public bmd(Schema $$0) {
      super($$0, false, "SignTextStrictJsonFix", blp.t, "Sign");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      for (String $$1 : c) {
         OpticFinder<?> $$2 = $$0.getType().findField($$1);
         OpticFinder<Pair<String, String>> $$3 = DSL.typeFinder(this.getInputSchema().getType(blp.A));
         $$0 = $$0.updateTyped($$2, $$1x -> $$1x.update($$3, $$0xx -> $$0xx.mapSecond(bdu::c)));
      }

      return $$0;
   }
}
