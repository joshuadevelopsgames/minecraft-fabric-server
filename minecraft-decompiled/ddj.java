public class ddj extends dcr {
   private final bzv<? extends cxg> a;

   public ddj(bzv<? extends cxg> $$0, dcr.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      if (!$$3.a(azo.K)) {
         return bxj.d;
      } else {
         dcv $$4 = $$0.n();
         eff $$5 = $$3.b() instanceof dpo ? $$3.c(((dpo)$$3.b()).c()) : eff.a;
         double $$6 = 0.0;
         if ($$5.b()) {
            $$6 = 0.5;
         }

         fis $$7 = new fis($$2.u() + 0.5, $$2.v() + 0.0625 + $$6, $$2.w() + 0.5);
         cxg $$8 = cxg.a($$1, $$7.d, $$7.e, $$7.f, this.a, bzu.o, $$4, $$0.o());
         if ($$8 == null) {
            return bxj.d;
         } else {
            if (cxg.b($$1)) {
               for (bzm $$10 : $$1.a_(null, $$8.cV())) {
                  if ($$10 instanceof cxg) {
                     return bxj.d;
                  }
               }
            }

            if ($$1 instanceof aub $$11) {
               $$11.b($$8);
               $$11.a(ejb.t, $$2, ejb.a.a($$0.o(), $$11.a_($$2.e())));
            }

            $$4.h(1);
            return bxj.a;
         }
      }
   }
}
