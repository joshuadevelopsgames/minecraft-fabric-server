public abstract class cvw extends cvo {
   private static final float a = 12.25F;

   protected cvw(bzv<? extends cvw> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected cvw(bzv<? extends cvw> $$0, double $$1, double $$2, double $$3, dmu $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.as < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cV().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return true;
   }

   @Override
   public void g() {
      this.i();
      this.bi();
      this.f();
      fiq $$0 = cvq.a(this, this::b);
      fis $$1;
      if ($$0.d() != fiq.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dv().e(this.dA());
      }

      this.b($$1);
      this.z();
      this.aL();
      super.g();
      if ($$0.d() != fiq.a.a && this.bO()) {
         this.b($$0);
      }
   }

   private void f() {
      fis $$0 = this.dA();
      fis $$1 = this.dv();
      float $$4;
      if (this.bm()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.ai().a(me.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.i($$0.c((double)$$4));
   }

   private void i() {
      if (this.ax) {
         for (jb $$0 : jb.a(this.cV())) {
            eeb $$1 = this.ai().a_($$0);
            if ($$1.a(dqb.nK)) {
               $$1.a(this.ai(), $$0, this, cae.a);
            }
         }
      }
   }

   @Override
   protected double bg() {
      return 0.03;
   }
}
