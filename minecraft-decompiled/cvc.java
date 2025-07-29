import javax.annotation.Nullable;

public abstract class cvc extends cvo {
   public static final double a = 0.1;
   public static final double b = 0.5;
   public double c = 0.1;

   protected cvc(bzv<? extends cvc> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected cvc(bzv<? extends cvc> $$0, double $$1, double $$2, double $$3, dmu $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   public cvc(bzv<? extends cvc> $$0, double $$1, double $$2, double $$3, fis $$4, dmu $$5) {
      this($$0, $$5);
      this.b($$1, $$2, $$3, this.dP(), this.dR());
      this.ay();
      this.a($$4, this.c);
   }

   public cvc(bzv<? extends cvc> $$0, cam $$1, fis $$2, dmu $$3) {
      this($$0, $$1.dC(), $$1.dE(), $$1.dI(), $$2, $$3);
      this.c($$1);
      this.b($$1.dP(), $$1.dR());
   }

   @Override
   protected void a(all.a $$0) {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cV().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   protected dmb.a ai_() {
      return dmb.a.a;
   }

   @Override
   public void g() {
      bzm $$0 = this.ah_();
      this.n();
      if (this.ai().C || ($$0 == null || !$$0.dU()) && this.ai().D(this.dx())) {
         fiq $$1 = cvq.a(this, this::b, this.ai_());
         fis $$2;
         if ($$1.d() != fiq.a.a) {
            $$2 = $$1.g();
         } else {
            $$2 = this.dv().e(this.dA());
         }

         cvq.a(this, 0.2F);
         this.b($$2);
         this.aL();
         super.g();
         if (this.f()) {
            this.e(1.0F);
         }

         if ($$1.d() != fiq.a.a && this.bO()) {
            this.b($$1);
         }

         this.q();
      } else {
         this.at();
      }
   }

   private void n() {
      fis $$0 = this.dA();
      fis $$1 = this.dv();
      float $$4;
      if (this.bm()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.ai().a(me.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = this.m();
      } else {
         $$4 = this.l();
      }

      this.i($$0.e($$0.d().c(this.c)).c((double)$$4));
   }

   private void q() {
      mc $$0 = this.i();
      fis $$1 = this.dv();
      if ($$0 != null) {
         this.ai().a($$0, $$1.d, $$1.e + 0.5, $$1.f, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }

   @Override
   protected boolean b(bzm $$0) {
      return super.b($$0) && !$$0.aq;
   }

   @Override
   protected boolean f() {
      return true;
   }

   @Nullable
   protected mc i() {
      return me.ah;
   }

   protected float l() {
      return 0.95F;
   }

   protected float m() {
      return 0.8F;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("acceleration_power", this.c);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c = $$0.a("acceleration_power", 0.1);
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   private void a(fis $$0, double $$1) {
      this.i($$0.d().c($$1));
      this.aE = true;
   }

   @Override
   protected void c(@Nullable bzm $$0, boolean $$1) {
      super.c($$0, $$1);
      if ($$1) {
         this.c = 0.1;
      } else {
         this.c *= 0.5;
      }
   }
}
