public class hia extends hit<hki, gna> {
   public hia(hgc<hki, gna> $$0) {
      super($$0);
   }

   public void a(fod $$0, gxn $$1, int $$2, hki $$3, float $$4, float $$5) {
      hoh $$6 = $$3.i;
      if (!$$6.e()) {
         $$0.a();
         float $$7 = 1.0F;
         float $$8 = -1.0F;
         float $$9 = bcb.e($$3.ae) / 60.0F;
         if ($$3.ae < 0.0F) {
            $$0.a(0.0F, 1.0F - $$9 * 0.5F, -1.0F + $$9 * 0.5F);
         } else {
            $$0.a(0.0F, 1.0F + $$9 * 0.8F, -1.0F + $$9 * 0.2F);
         }

         $$6.a($$0, $$1, $$2, hri.d);
         $$0.b();
      }
   }
}
