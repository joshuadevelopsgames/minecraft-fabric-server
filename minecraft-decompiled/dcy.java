public class dcy {
   public static bxj a(dmu $$0, cut $$1, bxi $$2) {
      $$1.c($$2);
      return bxj.c;
   }

   public static dcv a(dcv $$0, cut $$1, dcv $$2, boolean $$3) {
      boolean $$4 = $$1.gc();
      if ($$3 && $$4) {
         if (!$$1.gs().j($$2)) {
            $$1.gs().g($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.f()) {
            return $$2;
         } else {
            if (!$$1.gs().g($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static dcv a(dcv $$0, cut $$1, dcv $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cqz $$0, Iterable<dcv> $$1) {
      dmu $$2 = $$0.ai();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cqz($$2, $$0.dC(), $$0.dE(), $$0.dI(), $$2x)));
      }
   }
}
