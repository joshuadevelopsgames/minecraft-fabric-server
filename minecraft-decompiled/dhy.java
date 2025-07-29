import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class dhy extends dhc {
   public dhy(dgz $$0) {
      super($$0);
   }

   @Nullable
   private static Pair<dcv, dcv> c(dha $$0) {
      if ($$0.e() != 2) {
         return null;
      } else {
         dcv $$1 = null;

         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            dcv $$3 = $$0.a($$2);
            if (!$$3.f()) {
               if ($$1 != null) {
                  return a($$1, $$3) ? Pair.of($$1, $$3) : null;
               }

               $$1 = $$3;
            }
         }

         return null;
      }
   }

   private static boolean a(dcv $$0, dcv $$1) {
      return $$1.a($$0.h()) && $$0.M() == 1 && $$1.M() == 1 && $$0.c(kq.d) && $$1.c(kq.d) && $$0.c(kq.e) && $$1.c(kq.e);
   }

   public boolean a(dha $$0, dmu $$1) {
      return c($$0) != null;
   }

   public dcv a(dha $$0, jn.a $$1) {
      Pair<dcv, dcv> $$2 = c($$0);
      if ($$2 == null) {
         return dcv.l;
      } else {
         dcv $$3 = (dcv)$$2.getFirst();
         dcv $$4 = (dcv)$$2.getSecond();
         int $$5 = Math.max($$3.p(), $$4.p());
         int $$6 = $$3.p() - $$3.o();
         int $$7 = $$4.p() - $$4.o();
         int $$8 = $$6 + $$7 + $$5 * 5 / 100;
         dcv $$9 = new dcv($$3.h());
         $$9.b(kq.d, $$5);
         $$9.b(Math.max($$5 - $$8, 0));
         djo $$10 = djk.b($$3);
         djo $$11 = djk.b($$4);
         djk.a($$9, $$3x -> $$1.e(mn.aW).c().filter($$0xx -> $$0xx.a(azr.o)).forEach($$3xx -> {
            int $$4x = Math.max($$10.a($$3xx), $$11.a($$3xx));
            if ($$4x > 0) {
               $$3x.b($$3xx, $$4x);
            }
         }));
         return $$9;
      }
   }

   @Override
   public dhw<dhy> a() {
      return dhw.n;
   }
}
