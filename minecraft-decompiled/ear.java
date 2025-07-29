public class ear extends eci {
   private ju<dcv> d = ju.a(27, dcv.l);
   private final ebn e = new ebn() {
      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2) {
         ear.this.a($$2, ayz.bz);
         ear.this.a($$2, true);
      }

      @Override
      protected void b(dmu $$0, jb $$1, eeb $$2) {
         ear.this.a($$2, ayz.by);
         ear.this.a($$2, false);
      }

      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2, int $$3, int $$4) {
      }

      @Override
      protected boolean a(cut $$0) {
         if ($$0.cn instanceof cyv) {
            bxc $$1 = ((cyv)$$0.cn).l();
            return $$1 == ear.this;
         } else {
            return false;
         }
      }
   };

   public ear(jb $$0, eeb $$1) {
      super(ebb.B, $$0, $$1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.d_($$0)) {
         bxd.a($$0, this.d);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.d);
      }
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected ju<dcv> f() {
      return this.d;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.d = $$0;
   }

   @Override
   protected xo j() {
      return xo.c("container.barrel");
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return cyv.a($$0, $$1, this);
   }

   @Override
   public void e_(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.e.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.e.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void k() {
      if (!this.p) {
         this.e.c(this.i(), this.aA_(), this.m());
      }
   }

   void a(eeb $$0, boolean $$1) {
      this.n.a(this.aA_(), $$0.b(dpf.c, $$1), 3);
   }

   void a(eeb $$0, ayy $$1) {
      kg $$2 = $$0.c(dpf.b).q();
      double $$3 = this.o.u() + 0.5 + $$2.u() / 2.0;
      double $$4 = this.o.v() + 0.5 + $$2.v() / 2.0;
      double $$5 = this.o.w() + 0.5 + $$2.w() / 2.0;
      this.n.a(null, $$3, $$4, $$5, $$1, aza.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
   }
}
