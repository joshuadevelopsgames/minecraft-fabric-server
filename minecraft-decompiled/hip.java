public class hip extends hit<hlx, goh> {
   public hip(hgc<hlx, goh> $$0) {
      super($$0);
   }

   public void a(fod $$0, gxn $$1, int $$2, hlx $$3, float $$4, float $$5) {
      hoh $$6 = $$3.i;
      if (!$$6.e() && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * bcb.a($$3.v * 0.6F) + 0.2F;
            $$8 -= 0.09F * bcb.a($$3.v * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         $$6.a($$0, $$1, $$2, hri.d);
         $$0.b();
      }
   }
}
