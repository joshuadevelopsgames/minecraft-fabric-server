import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdd {
   public static cdo<cam> a(int $$0, float $$1, int $$2) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$3 -> $$3.group(
               $$3.c(cjo.n), $$3.a(cjo.b), $$3.a(cjo.D), $$3.a(cjo.u), $$3.a(cjo.o), $$3.a(cjo.s), $$3.a(cjo.r)
            )
            .apply(
               $$3,
               ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                  $$11.B()
                     .d($$0xxxx -> $$0xxxx.a(clt.n), $$0xxxx -> true, $$12.dx(), $$2 + 1, clp.b.c)
                     .filter($$2xxxx -> $$2xxxx.a($$12.dv(), $$2))
                     .or(() -> $$11.B().a($$0xxxxx -> $$0xxxxx.a(clt.n), $$0xxxxx -> true, clp.b.c, $$12.dx(), $$0, $$12.ec()))
                     .or(() -> $$3.<jk>a($$5).map(jk::b))
                     .ifPresent($$10xx -> {
                        $$7.b();
                        $$8.b();
                        $$9.b();
                        $$10.b();
                        $$6.a(jk.a($$11.aj(), $$10xx));
                        if (!$$10xx.a($$12.dv(), $$2)) {
                           $$4.a(new cjr($$10xx, $$1, $$2));
                        }
                     });
                  return true;
               }
            ))
      );
   }
}
