public class cxs extends cxh implements ecb {
   private static final boolean c = true;
   private boolean d = true;
   private boolean h = false;

   public cxs(bzv<? extends cxs> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public eeb u() {
      return dqb.hD.m();
   }

   @Override
   public int w() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.z()) {
         this.r($$4);
      }
   }

   public boolean z() {
      return this.d;
   }

   public void r(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double A() {
      return this.dC();
   }

   @Override
   public double B() {
      return this.dE() + 0.5;
   }

   @Override
   public double C() {
      return this.dI();
   }

   @Override
   public boolean D() {
      return false;
   }

   @Override
   public void g() {
      this.h = false;
      super.g();
      this.F();
   }

   @Override
   protected double a(jb $$0, eff $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.F();
      return $$3;
   }

   private void F() {
      if (!this.ai().C && this.bO() && this.z() && !this.h && this.E()) {
         this.h = true;
         this.e();
      }
   }

   public boolean E() {
      if (ecc.a(this.ai(), this)) {
         return true;
      } else {
         for (cqz $$1 : this.ai().a(cqz.class, this.cV().c(0.25, 0.0, 0.25), bzt.a)) {
            if (ecc.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dcr p() {
      return dcz.oQ;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.oQ);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d = $$0.a("Enabled", true);
   }

   @Override
   public cym a(int $$0, cus $$1) {
      return new czn($$0, $$1, this);
   }
}
