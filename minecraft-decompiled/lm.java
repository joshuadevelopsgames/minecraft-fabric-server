public class lm implements ln {
   private static final int c = 6;

   @Override
   public final dcv dispense(lk $$0, dcv $$1) {
      dcv $$2 = this.a($$0, $$1);
      this.a($$0);
      this.a($$0, $$0.d().c(dsf.b));
      return $$2;
   }

   protected dcv a(lk $$0, dcv $$1) {
      jh $$2 = $$0.d().c(dsf.b);
      jv $$3 = dsf.a($$0);
      dcv $$4 = $$1.a(1);
      a($$0.b(), $$4, 6, $$2, $$3);
      return $$1;
   }

   public static void a(dmu $$0, dcv $$1, int $$2, jh $$3, jv $$4) {
      double $$5 = $$4.a();
      double $$6 = $$4.b();
      double $$7 = $$4.c();
      if ($$3.o() == jh.a.b) {
         $$6 -= 0.125;
      } else {
         $$6 -= 0.15625;
      }

      cqz $$8 = new cqz($$0, $$5, $$6, $$7, $$1);
      double $$9 = $$0.A.j() * 0.1 + 0.2;
      $$8.n($$0.A.a($$3.j() * $$9, 0.0172275 * $$2), $$0.A.a(0.2, 0.0172275 * $$2), $$0.A.a($$3.l() * $$9, 0.0172275 * $$2));
      $$0.b($$8);
   }

   protected void a(lk $$0) {
      b($$0);
   }

   protected void a(lk $$0, jh $$1) {
      b($$0, $$1);
   }

   private static void b(lk $$0) {
      $$0.b().c(1000, $$0.c(), 0);
   }

   private static void b(lk $$0, jh $$1) {
      $$0.b().c(2000, $$0.c(), $$1.d());
   }

   protected dcv a(lk $$0, dcv $$1, dcv $$2) {
      $$1.h(1);
      if ($$1.f()) {
         return $$2;
      } else {
         this.b($$0, $$2);
         return $$1;
      }
   }

   private void b(lk $$0, dcv $$1) {
      dcv $$2 = $$0.e().b($$1);
      if (!$$2.f()) {
         jh $$3 = $$0.d().c(dsf.b);
         a($$0.b(), $$2, 6, $$3, dsf.a($$0));
         b($$0);
         b($$0, $$3);
      }
   }
}
