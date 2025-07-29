import javax.annotation.Nullable;

public class crf extends crd implements cbc {
   private static final int a = 50;
   private static final int b = 70;
   private static final alh<Boolean> c = all.a(crf.class, alj.k);
   private static final String d = "sheared";
   private static final boolean e = false;

   public static cbr.a gJ() {
      return crd.l().a(cbs.t, 16.0);
   }

   public crf(bzv<? extends crf> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("sheared", this.gK());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("sheared", false));
   }

   public boolean gK() {
      return this.ay.a(c);
   }

   public void x(boolean $$0) {
      this.ay.a(c, $$0);
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.tu) && this.a()) {
         if (this.ai() instanceof aub $$3) {
            this.a($$3, aza.h, $$2);
            this.a(ejb.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ayy p() {
      return ayz.cn;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.cp;
   }

   @Override
   protected ayy f_() {
      return ayz.co;
   }

   @Override
   protected ayy m() {
      return ayz.cr;
   }

   @Override
   protected cvb a(dcv $$0, float $$1, @Nullable dcv $$2) {
      cvb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cve $$4) {
         $$4.a(new byq(bys.s, 100));
      }

      return $$3;
   }

   @Override
   protected int t() {
      return 50;
   }

   @Override
   protected int gH() {
      return 70;
   }

   @Override
   public void a(aub $$0, aza $$1, dcv $$2) {
      $$0.a(null, this, ayz.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(aub $$0, dcv $$1) {
      this.a($$0, fdf.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dt()));
   }

   @Override
   public boolean a() {
      return !this.gK() && this.bO();
   }
}
