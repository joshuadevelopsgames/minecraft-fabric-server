public class hgv extends hcv<cxu, hlu> {
   private final gys h;

   public hgv(hee.a $$0) {
      super($$0, gqm.dG);
      this.h = $$0.d();
   }

   protected void a(hlu $$0, eeb $$1, fod $$2, gxn $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = bcb.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.h, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gys $$0, eeb $$1, fod $$2, gxn $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hri.a(hri.a(1.0F), 10);
      } else {
         $$6 = hri.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hlu a() {
      return new hlu();
   }

   public void a(cxu $$0, hlu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.e() > -1 ? $$0.e() - $$2 + 1.0F : -1.0F;
   }
}
