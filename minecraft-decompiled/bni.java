import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class bni extends bjk {
   public bni(Schema $$0) {
      super($$0, "WrittenBookPagesStrictJsonFix", $$0x -> $$0x.equals("minecraft:written_book"));
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      Type<Pair<String, String>> $$1 = this.getInputSchema().getType(blp.A);
      Type<?> $$2 = this.getInputSchema().getType(blp.u);
      OpticFinder<?> $$3 = $$2.findField("tag");
      OpticFinder<?> $$4 = $$3.type().findField("pages");
      OpticFinder<Pair<String, String>> $$5 = DSL.typeFinder($$1);
      return $$0.updateTyped($$4, $$1x -> $$1x.update($$5, $$0xx -> $$0xx.mapSecond(bdu::c)));
   }
}
