import com.google.common.annotations.VisibleForTesting;

public class csd extends crd {
   private static final int b = 300;
   private static final alh<Boolean> c = all.a(csd.class, alj.k);
   public static final String a = "StrayConversionTime";
   private static final int d = -1;
   private int e;
   private int f;

   public csd(bzv<? extends csd> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gJ() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.ay.a(c, $$0);
   }

   @Override
   public boolean gI() {
      return this.gJ();
   }

   @Override
   public void g() {
      if (!this.ai().C && this.bO() && !this.gw()) {
         if (this.aI) {
            if (this.gJ()) {
               this.f--;
               if (this.f < 0) {
                  this.gK();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.x(false);
         }
      }

      super.g();
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("StrayConversionTime", this.gJ() ? this.f : -1);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      int $$1 = $$0.a("StrayConversionTime", -1);
      if ($$1 != -1) {
         this.b($$1);
      } else {
         this.x(false);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.f = $$0;
      this.x(true);
   }

   protected void gK() {
      this.a(bzv.bu, bzg.a(this, true, true), $$0 -> {
         if (!this.be()) {
            this.ai().a(null, 1048, this.dx(), 0);
         }
      });
   }

   @Override
   public boolean dN() {
      return false;
   }

   @Override
   protected ayy p() {
      return ayz.yq;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.yB;
   }

   @Override
   protected ayy f_() {
      return ayz.ys;
   }

   @Override
   ayy m() {
      return ayz.yD;
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof crh $$4 && $$4.gI()) {
         $$4.gJ();
         this.a($$0, dcz.vN);
      }
   }
}
