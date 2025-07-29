public abstract class cmc extends bzc {
   protected cmc(bzv<? extends cmc> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.j, 0.0F);
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this);
   }

   @Override
   public int W() {
      return 120;
   }

   @Override
   public int e(aub $$0) {
      return 1 + this.ar.a(3);
   }

   protected void r(int $$0) {
      if (this.bO() && !this.bm()) {
         this.j($$0 - 1);
         if (this.cw() == -20) {
            this.j(0);
            this.a(this.ea().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.cw();
      super.az();
      this.r($$0);
   }

   @Override
   public boolean cN() {
      return false;
   }

   @Override
   public boolean v() {
      return false;
   }

   public static boolean b(bzv<? extends cmc> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      int $$5 = $$1.Q();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(azu.a) && $$1.a_($$3.d()).a(dqb.J);
   }
}
