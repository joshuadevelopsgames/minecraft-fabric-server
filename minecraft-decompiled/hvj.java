public class hvj extends huz {
   private static final float n = 0.0F;
   private static final float o = 0.7F;
   private static final float p = 0.0F;
   private static final float q = 1.0F;
   private static final float r = 0.0025F;
   private final cxg s;
   private float t = 0.0F;

   public hvj(cxg $$0) {
      super(ayz.pX, aza.g, hvr.t());
      this.s = $$0;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
      this.f = (float)$$0.dC();
      this.g = (float)$$0.dE();
      this.h = (float)$$0.dI();
   }

   @Override
   public boolean s() {
      return !this.s.be();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.s.dU()) {
         this.n();
      } else {
         this.f = (float)this.s.dC();
         this.g = (float)this.s.dE();
         this.h = (float)this.s.dI();
         float $$0 = (float)this.s.dA().i();
         boolean $$1 = !this.s.ct() && this.s.f() instanceof cxv;
         if ($$0 >= 0.01F && this.s.ai().v().i() && !$$1) {
            this.t = bcb.a(this.t + 0.0025F, 0.0F, 1.0F);
            this.d = bcb.h(bcb.a($$0, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.t = 0.0F;
            this.d = 0.0F;
         }
      }
   }
}
