public class cst {
   private static final double a = 50.0;

   public static fis a(cam $$0, bck $$1) {
      int $$2 = 90;
      float $$3 = $$0.bt + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = bcb.h($$1.i(), 4.0F, 8.0F);
      fis $$5 = fis.a(0.0F, $$3).c((double)$$4);
      return $$0.dv().e($$5);
   }

   public static boolean a(csr $$0, fis $$1) {
      fis $$2 = new fis($$0.dC(), $$0.dE(), $$0.dI());
      return $$1.f($$2) > a($$0) ? false : $$0.ai().a(new dmb($$2, $$1, dmb.a.a, dmb.b.a, $$0)).d() == fiq.a.a;
   }

   private static double a(csr $$0) {
      return Math.max(50.0, $$0.i(cbs.n));
   }
}
