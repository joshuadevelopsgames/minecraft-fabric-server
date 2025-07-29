import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cfd {
   public static cce<cam> a(dpz $$0) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$1 -> $$1.group($$1.c(cjo.p), $$1.b(cjo.n), $$1.b(cjo.Z))
            .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
               if (!$$3x.bm() && $$3x.aK()) {
                  jb $$5 = $$3x.dx().e();

                  for (jh $$6 : jh.c.a) {
                     jb $$7 = $$5.a($$6);
                     if ($$2x.a_($$7).g($$2x, $$7).a(jh.b).c() && $$2x.b_($$7).b(fam.c)) {
                        jb $$8 = $$7.d();
                        if ($$2x.a_($$8).l()) {
                           eeb $$9 = $$0.m();
                           $$2x.a($$8, $$9, 3);
                           $$2x.a(ejb.i, $$8, ejb.a.a($$3x, $$9));
                           $$2x.a(null, $$3x, ayz.kC, aza.e, 1.0F, 1.0F);
                           $$3.b();
                           return true;
                        }
                     }
                  }

                  return true;
               } else {
                  return false;
               }
            }))
      );
   }
}
