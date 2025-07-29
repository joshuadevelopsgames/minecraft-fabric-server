public class cju extends cjw {
   public cju(cao $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected fbb a(int $$0) {
      this.o = new faw();
      return new fbb(this.o, $$0);
   }

   @Override
   protected boolean a(fis $$0, fis $$1) {
      return a(this.a, $$0, $$1, true);
   }

   @Override
   protected boolean a() {
      return this.p() && this.a.bp() || !this.a.cc();
   }

   @Override
   protected fis b() {
      return this.a.dv();
   }

   @Override
   public faz a(bzm $$0, int $$1) {
      return this.a($$0.dx(), $$1);
   }

   @Override
   public void d() {
      this.e++;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            fis $$0 = this.c.a(this.a);
            if (this.a.dB() == bcb.a($$0.d) && this.a.dD() == bcb.a($$0.e) && this.a.dH() == bcb.a($$0.f)) {
               this.c.a();
            }
         }

         ahj.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            fis $$1 = this.c.a(this.a);
            this.a.Q().a($$1.d, $$1.e, $$1.f, this.d);
         }
      }
   }

   @Override
   public boolean a(jb $$0) {
      return this.b.a_($$0).b(this.b, $$0, this.a);
   }

   @Override
   public boolean c() {
      return false;
   }
}
