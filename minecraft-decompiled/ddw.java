import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class ddw extends dcr {
   protected static final Map<dpz, eeb> a = Maps.newHashMap(
      new Builder()
         .put(dqb.i, dqb.lk.m())
         .put(dqb.j, dqb.lk.m())
         .put(dqb.l, dqb.lk.m())
         .put(dqb.k, dqb.lk.m())
         .put(dqb.fE, dqb.lk.m())
         .put(dqb.ts, dqb.lk.m())
         .build()
   );

   public ddw(dej $$0, float $$1, float $$2, dcr.a $$3) {
      super($$3.d($$0, $$1, $$2));
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if ($$0.k() == jh.a) {
         return bxj.e;
      } else {
         cut $$4 = $$0.o();
         eeb $$5 = a.get($$3.b());
         eeb $$6 = null;
         if ($$5 != null && $$1.a_($$2.d()).l()) {
            $$1.a($$4, $$2, ayz.xZ, aza.e, 1.0F, 1.0F);
            $$6 = $$5;
         } else if ($$3.b() instanceof dqp && $$3.c(dqp.b)) {
            if (!$$1.B_()) {
               $$1.a(null, 1009, $$2, 0);
            }

            dqp.a($$0.o(), $$1, $$2, $$3);
            $$6 = $$3.b(dqp.b, false);
         }

         if ($$6 != null) {
            if (!$$1.C) {
               $$1.a($$2, $$6, 11);
               $$1.a(ejb.c, $$2, ejb.a.a($$4, $$6));
               if ($$4 != null) {
                  $$0.n().a(1, $$4, cam.d($$0.p()));
               }
            }

            return bxj.a;
         } else {
            return bxj.e;
         }
      }
   }
}
