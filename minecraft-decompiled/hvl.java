public class hvl extends huz {
   private static final float n = 0.0F;
   private static final float o = 0.75F;
   private final cut p;
   private final cxg q;
   private final boolean r;

   public hvl(cut $$0, cxg $$1, boolean $$2) {
      super($$2 ? ayz.pV : ayz.pW, aza.g, hvr.t());
      this.p = $$0;
      this.q = $$1;
      this.r = $$2;
      this.k = hvr.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean s() {
      return !this.q.be();
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (this.q.dU() || !this.p.cc() || this.p.dm() != this.q) {
         this.n();
      } else if (this.r != this.p.bq()) {
         this.d = 0.0F;
      } else {
         float $$0 = (float)this.q.dA().i();
         boolean $$1 = !this.q.ct() && this.q.f() instanceof cxv;
         if ($$0 >= 0.01F && !$$1) {
            this.d = bcb.b(0.0F, 0.75F, $$0);
         } else {
            this.d = 0.0F;
         }
      }
   }
}
