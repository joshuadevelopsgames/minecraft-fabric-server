public class cgw extends chv {
   private final cmg g;

   public cgw(cmg $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.m() && !this.g.gH() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dmx $$0, jb $$1) {
      if (!$$0.w($$1.d())) {
         return false;
      } else {
         eeb $$2 = $$0.a_($$1);
         if ($$2.a(dqb.cG)) {
            return ebh.a($$0, $$1) < 1;
         } else {
            return $$2.a(dqb.cO) && $$2.c(dtl.b) ? true : $$2.a(azo.Q, $$0x -> $$0x.d(dps.b).map($$0xx -> $$0xx != eeo.a).orElse(true));
         }
      }
   }
}
