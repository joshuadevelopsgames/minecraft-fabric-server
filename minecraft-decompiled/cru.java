public class cru extends cse {
   public cru(bzv<? extends cru> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.w, 0.2F);
   }

   public static boolean b(bzv<cru> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.an() != bxg.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.h(cbs.a).a($$0 * 3);
   }

   @Override
   public float bB() {
      return 1.0F;
   }

   @Override
   protected mc m() {
      return me.F;
   }

   @Override
   public boolean cb() {
      return false;
   }

   @Override
   protected int n() {
      return super.n() * 4;
   }

   @Override
   protected void t() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      fis $$0 = this.dA();
      float $$1 = this.gH() * 0.1F;
      this.n($$0.d, this.fn() + $$1, $$0.f);
      this.aE = true;
   }

   @Override
   protected void c(bae<fak> $$0) {
      if ($$0 == azu.b) {
         fis $$1 = this.dA();
         this.n($$1.d, 0.22F + this.gH() * 0.05F, $$1.f);
         this.aE = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gD() {
      return this.dl();
   }

   @Override
   protected float gE() {
      return super.gE() + 2.0F;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.gI() ? ayz.pD : ayz.pC;
   }

   @Override
   protected ayy f_() {
      return this.gI() ? ayz.pr : ayz.pB;
   }

   @Override
   protected ayy gF() {
      return this.gI() ? ayz.pG : ayz.pF;
   }

   @Override
   protected ayy gG() {
      return ayz.pE;
   }
}
