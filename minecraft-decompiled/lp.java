public class lp extends lm {
   private final lm c = new lm();
   private final bzv<? extends cxg> d;

   public lp(bzv<? extends cxg> $$0) {
      this.d = $$0;
   }

   @Override
   public dcv a(lk $$0, dcv $$1) {
      jh $$2 = $$0.d().c(dsf.b);
      aub $$3 = $$0.b();
      fis $$4 = $$0.a();
      double $$5 = $$4.a() + $$2.j() * 1.125;
      double $$6 = Math.floor($$4.b()) + $$2.k();
      double $$7 = $$4.c() + $$2.l() * 1.125;
      jb $$8 = $$0.c().a($$2);
      eeb $$9 = $$3.a_($$8);
      double $$10;
      if ($$9.a(azo.K)) {
         if (a($$9).b()) {
            $$10 = 0.6;
         } else {
            $$10 = 0.1;
         }
      } else {
         if (!$$9.l()) {
            return this.c.dispense($$0, $$1);
         }

         eeb $$12 = $$3.a_($$8.e());
         if (!$$12.a(azo.K)) {
            return this.c.dispense($$0, $$1);
         }

         if ($$2 != jh.a && a($$12).b()) {
            $$10 = -0.4;
         } else {
            $$10 = -0.9;
         }
      }

      fis $$17 = new fis($$5, $$6 + $$10, $$7);
      cxg $$18 = cxg.a($$3, $$17.d, $$17.e, $$17.f, this.d, bzu.o, $$1, null);
      if ($$18 != null) {
         $$3.b($$18);
         $$1.h(1);
      }

      return $$1;
   }

   private static eff a(eeb $$0) {
      return $$0.b() instanceof dpo $$1 ? $$0.c($$1.c()) : eff.a;
   }

   @Override
   protected void a(lk $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }
}
