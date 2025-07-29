public class cvt extends cvv {
   public cvt(bzv<? extends cvt> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvt(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.bm, $$1, $$0, $$2);
   }

   public cvt(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.bm, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected dcr f() {
      return dcz.rJ;
   }

   private mc i() {
      dcv $$0 = this.e();
      return (mc)($$0.f() ? me.Z : new ma(me.U, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         mc $$1 = this.i();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.ai().a($$1, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      bzm $$1 = $$0.a();
      int $$2 = $$1 instanceof cre ? 3 : 0;
      $$1.a(this.ea().b(this, this.ah_()), (float)$$2);
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.ai().a(this, (byte)3);
         this.at();
      }
   }
}
