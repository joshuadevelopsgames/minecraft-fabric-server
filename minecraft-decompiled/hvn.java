public class hvn extends huz {
   private static final float n = 1.0F;
   private static final float o = 1.0F;
   private final cpg p;

   public hvn(cpg $$0) {
      super(ayz.zX, aza.g, hvr.t());
      this.p = $$0;
      this.k = hvr.a.b;
      this.i = false;
      this.j = 0;
   }

   @Override
   public boolean s() {
      return !this.p.be();
   }

   @Override
   public void q() {
      if (!this.p.dU() && this.p.e() == null && this.p.gI()) {
         this.f = (float)this.p.dC();
         this.g = (float)this.p.dE();
         this.h = (float)this.p.dI();
         this.d = 1.0F;
         this.e = 1.0F;
      } else {
         this.n();
      }
   }
}
