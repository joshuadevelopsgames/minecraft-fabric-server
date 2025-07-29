public abstract class cau extends cao {
   protected static final float cj = 0.0F;

   protected cau(bzv<? extends cau> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public float c(jb $$0) {
      return this.a($$0, this.ai());
   }

   public float a(jb $$0, dmx $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dmv $$0, bzu $$1) {
      return this.a(this.dx(), $$0) >= 0.0F;
   }

   public boolean gD() {
      return !this.S().l();
   }

   public boolean gE() {
      if (this.bO.a(cjo.aa)) {
         return this.bO.c(cjo.aa).isPresent();
      } else {
         for (ciw $$0 : this.ch.b()) {
            if ($$0.h() && $$0.k() instanceof cib) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gF() {
      return true;
   }

   @Override
   public void e(bzm $$0) {
      super.e($$0);
      if (this.gF() && !this.gE()) {
         this.ch.b(chi.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fis $$3 = new fis($$0.dC() - this.dC(), $$0.dE() - this.dE(), $$0.dI() - this.dI()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.S().a(this.dC() + $$3.d, this.dE() + $$3.e, this.dI() + $$3.f, this.gG());
      }
   }

   @Override
   public void d(bzm $$0) {
      this.a($$0.dx(), (int)this.B() - 1);
      super.d($$0);
   }

   protected double gG() {
      return 1.0;
   }
}
