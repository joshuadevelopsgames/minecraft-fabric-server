import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ceq {
   public static cce<cam> a(int $$0, BiPredicate<cam, cam> $$1) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2 -> $$2.group($$2.b(cjo.p), $$2.a(cjo.ac), $$2.c(cjo.aj), $$2.a(cjo.ak))
            .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
               cam $$10 = $$2.b($$3);
               if (!$$10.eM()) {
                  return false;
               } else {
                  if ($$1.test($$8, $$10)) {
                     $$6.a(true, $$0);
                  }

                  $$5.a($$10.dx(), $$0);
                  if ($$10.ap() != bzv.bU || $$7.P().c(dmq.P)) {
                     $$3.b();
                     $$4.b();
                  }

                  return true;
               }
            }))
      );
   }
}
