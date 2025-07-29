public class cxr extends cxg {
   private static final alh<Boolean> c = all.a(cxr.class, alj.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private static final short i = 0;
   private static final fis j = fis.c;
   private int k = 0;
   public fis b = j;

   public cxr(bzv<? extends cxr> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void g() {
      super.g();
      if (!this.ai().B_()) {
         if (this.k > 0) {
            this.k--;
         }

         if (this.k <= 0) {
            this.b = fis.c;
         }

         this.r(this.k > 0);
      }

      if (this.e() && this.ar.a(4) == 0) {
         this.ai().a(me.aa, this.dC(), this.dE() + 0.8, this.dI(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(aub $$0) {
      return this.bm() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected dcr p() {
      return dcz.oO;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.oO);
   }

   @Override
   protected fis a(fis $$0) {
      fis $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.k($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bm()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private fis k(fis $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(azx.bU) && this.k + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.k += 3600;
      }

      if (this.k > 0) {
         this.b = this.dv().d($$0.dv()).f();
      }

      return bxj.a;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.k);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      double $$1 = $$0.a("PushX", j.d);
      double $$2 = $$0.a("PushZ", j.f);
      this.b = new fis($$1, 0.0, $$2);
      this.k = $$0.a("Fuel", (short)0);
   }

   protected boolean e() {
      return this.ay.a(c);
   }

   protected void r(boolean $$0) {
      this.ay.a(c, $$0);
   }

   @Override
   public eeb u() {
      return dqb.cO.m().b(dtl.a, jh.c).b(dtl.b, this.e());
   }
}
