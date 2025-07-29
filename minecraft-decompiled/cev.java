import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableLong;

public class cev {
   public static cce<cau> a(cjo<jk> $$0, float $$1, int $$2, int $$3) {
      MutableLong $$4 = new MutableLong(0L);
      return cfq.a(
         (Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$5 -> $$5.group($$5.a(cjo.n), $$5.b($$0)).apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
            jk $$10 = $$5.b($$6);
            if ($$7.aj() != $$10.a() || !$$10.b().a($$8.dv(), $$3)) {
               return false;
            } else if ($$9 <= $$4.getValue()) {
               return true;
            } else {
               $$5x.a(new cjr($$10.b(), $$1, $$2));
               $$4.setValue($$9 + 80L);
               return true;
            }
         }))
      );
   }
}
