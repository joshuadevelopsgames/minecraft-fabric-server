public class hvi extends huz {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private static final float p = 0.7F;
   private static final float q = 0.5F;
   private final crr r;

   public hvi(crr $$0) {
      super(ayz.mh, aza.f, hvr.t());
      this.r = $$0;
      this.k = hvr.a.a;
      this.i = true;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.r.be();
   }

   @Override
   public void q() {
      if (!this.r.dU() && this.r.e() == null) {
         this.f = (float)this.r.dC();
         this.g = (float)this.r.dE();
         this.h = (float)this.r.dI();
         float $$0 = this.r.L(0.0F);
         this.d = 0.0F + 1.0F * $$0 * $$0;
         this.e = 0.7F + 0.5F * $$0;
      } else {
         this.n();
      }
   }
}
