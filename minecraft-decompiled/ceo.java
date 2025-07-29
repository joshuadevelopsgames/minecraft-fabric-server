import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ceo {
   private static final float a = 0.3F;

   public static cdo<cam> a() {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$0 -> $$0.group($$0.a(cjo.n), $$0.a(cjo.o), $$0.b(cjo.e), $$0.b(cjo.h), $$0.c(cjo.r))
            .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
               jk $$9 = $$0.b($$3);
               cjq $$10 = $$0.b($$4);
               if ($$6.H_().a(100) == 0 && $$6.aj() == $$9.a() && $$9.b().a($$7.dv(), 4.0) && $$10.d($$0xxx -> bzv.bF.equals($$0xxx.ap()))) {
                  $$10.a($$1xx -> bzv.bF.equals($$1xx.ap()) && $$1xx.g($$7) <= 32.0).ifPresent($$3xx -> {
                     $$5.a($$3xx);
                     $$2.a(new cco($$3xx, true));
                     $$1.a(new cjr(new cco($$3xx, false), 0.3F, 1));
                  });
                  return true;
               } else {
                  return false;
               }
            }))
      );
   }
}
