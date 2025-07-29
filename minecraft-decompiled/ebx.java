public class ebx extends eaz implements ecg {
   private final ebi a = new ebi();
   private final ebn b = new ebn() {
      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2) {
         $$0.a(null, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, ayz.iG, aza.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void b(dmu $$0, jb $$1, eeb $$2) {
         $$0.a(null, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, ayz.iF, aza.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }

      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2, int $$3, int $$4) {
         $$0.a(ebx.this.o, dqb.gf, 1, $$4);
      }

      @Override
      protected boolean a(cut $$0) {
         return $$0.gG().b(ebx.this);
      }
   };

   public ebx(jb $$0, eeb $$1) {
      super(ebb.d, $$0, $$1);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebx $$3) {
      $$3.a.a();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.a.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public void a(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.b.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   public void b(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.b.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   public boolean c(cut $$0) {
      return bxc.a(this, $$0);
   }

   public void a() {
      if (!this.p) {
         this.b.c(this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public float a(float $$0) {
      return this.a.a($$0);
   }
}
