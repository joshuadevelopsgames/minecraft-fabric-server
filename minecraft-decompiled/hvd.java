public abstract class hvd extends huz {
   private static final float o = 0.0F;
   private static final float p = 1.2F;
   private static final float q = 0.0F;
   protected final cme n;
   private boolean r;

   public hvd(cme $$0, ayy $$1, aza $$2) {
      super($$1, $$2, hvr.t());
      this.n = $$0;
      this.f = (float)$$0.dC();
      this.g = (float)$$0.dE();
      this.h = (float)$$0.dI();
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public void q() {
      boolean $$0 = this.p();
      if ($$0 && !this.m()) {
         fue.R().al().a((hvs)this.o());
         this.r = true;
      }

      if (!this.n.dU() && !this.r) {
         this.f = (float)this.n.dC();
         this.g = (float)this.n.dE();
         this.h = (float)this.n.dI();
         float $$1 = (float)this.n.dA().i();
         if ($$1 >= 0.01F) {
            this.e = bcb.h(bcb.a($$1, this.u(), this.v()), this.u(), this.v());
            this.d = bcb.h(bcb.a($$1, 0.0F, 0.5F), 0.0F, 1.2F);
         } else {
            this.e = 0.0F;
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }

   private float u() {
      return this.n.g_() ? 1.1F : 0.7F;
   }

   private float v() {
      return this.n.g_() ? 1.5F : 1.1F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public boolean s() {
      return !this.n.be();
   }

   protected abstract huz o();

   protected abstract boolean p();
}
