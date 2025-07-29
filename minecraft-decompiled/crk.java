import java.util.List;

public class crk extends crr {
   public static final float a = bzv.N.l() / bzv.ak.l();
   private static final int d = 1200;
   private static final int e = 50;
   private static final int f = 6000;
   private static final int ck = 2;
   private static final int cl = 1200;

   public crk(bzv<? extends crk> $$0, dmu $$1) {
      super($$0, $$1);
      this.gp();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static cbr.a l() {
      return crr.t().a(cbs.w, 0.3F).a(cbs.c, 8.0).a(cbs.t, 80.0);
   }

   @Override
   public int m() {
      return 60;
   }

   @Override
   protected ayy p() {
      return this.bm() ? ayz.iv : ayz.iw;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.bm() ? ayz.iB : ayz.iC;
   }

   @Override
   protected ayy f_() {
      return this.bm() ? ayz.iy : ayz.iz;
   }

   @Override
   protected ayy n() {
      return ayz.iA;
   }

   @Override
   protected void a(aub $$0) {
      super.a($$0);
      if ((this.as + this.ar()) % 1200 == 0) {
         byq $$1 = new byq(bys.d, 6000, 2);
         List<auc> $$2 = byr.a($$0, this, this.dv(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.g.b(new adx(adx.l, this.be() ? 0.0F : 1.0F)));
      }

      if (!this.gv()) {
         this.a(this.dx(), 16);
      }
   }
}
