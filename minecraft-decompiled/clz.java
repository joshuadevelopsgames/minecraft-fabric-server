public abstract class clz extends cnn implements cmf {
   private static final alh<Boolean> a = all.a(clz.class, alj.k);
   private static final boolean b = false;

   public clz(bzv<? extends clz> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new clz.a(this);
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 3.0);
   }

   @Override
   public boolean af() {
      return super.af() || this.m();
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.i_();
   }

   @Override
   public int gk() {
      return 8;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean m() {
      return this.ay.a(a);
   }

   @Override
   public void x(boolean $$0) {
      this.ay.a(a, $$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("FromBucket", this.m());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("FromBucket", false));
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new cib(this, 1.25));
      this.ch.a(2, new cgp<>(this, cut.class, 8.0F, 1.6, 1.4, bzt.f::test));
      this.ch.a(4, new clz.b(this));
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjy(this, $$0);
   }

   @Override
   public void k(fis $$0) {
      if (this.bm()) {
         this.a(0.01F, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
         if (this.e() == null) {
            this.i(this.dA().b(0.0, -0.005, 0.0));
         }
      } else {
         super.k($$0);
      }
   }

   @Override
   public void e_() {
      if (!this.bm() && this.aK() && this.ad) {
         this.i(this.dA().b((this.ar.i() * 2.0F - 1.0F) * 0.05F, 0.4F, (this.ar.i() * 2.0F - 1.0F) * 0.05F));
         this.e(false);
         this.aE = true;
         this.b(this.gH());
      }

      super.e_();
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      return cmf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(dcv $$0) {
      cmf.a(this, $$0);
   }

   @Override
   public void a(ui $$0) {
      cmf.a(this, $$0);
   }

   @Override
   public ayy n() {
      return ayz.dl;
   }

   protected boolean t() {
      return true;
   }

   protected abstract ayy gH();

   @Override
   protected ayy aY() {
      return ayz.jI;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
   }

   static class a extends cgl {
      private final clz l;

      a(clz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(azu.a)) {
            this.l.i(this.l.dA().b(0.0, 0.005, 0.0));
         }

         if (this.k == cgl.a.b && !this.l.S().l()) {
            float $$0 = (float)(this.h * this.l.i(cbs.w));
            this.l.B(bcb.h(0.125F, this.l.fu(), $$0));
            double $$1 = this.e - this.l.dC();
            double $$2 = this.f - this.l.dE();
            double $$3 = this.g - this.l.dI();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.i(this.l.dA().b(0.0, this.l.fu() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(bcb.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dP(), $$5, 90.0F));
               this.l.br = this.l.dP();
            }
         } else {
            this.l.B(0.0F);
         }
      }
   }

   static class b extends cig {
      private final clz i;

      public b(clz $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.t() && super.b();
      }
   }
}
