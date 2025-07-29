public class cvm extends cvi {
   private static final byte d = 1;
   private int f = 1;

   public cvm(bzv<? extends cvm> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvm(dmu $$0, cam $$1, fis $$2, int $$3) {
      super(bzv.Z, $$1, $$2, $$0);
      this.f = $$3;
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         boolean $$2 = $$1.P().c(dmq.d);
         this.ai().a(this, this.dC(), this.dE(), this.dI(), this.f, $$2, dmu.a.c);
         this.at();
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (this.ai() instanceof aub $$1) {
         bzm var6 = $$0.a();
         bzm $$4 = this.ah_();
         byb $$5 = this.ea().a((cvi)this, $$4);
         var6.a($$1, $$5, 6.0F);
         djk.a($$1, var6, $$5);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("ExplosionPower", (byte)this.f);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.a("ExplosionPower", (byte)1);
   }
}
