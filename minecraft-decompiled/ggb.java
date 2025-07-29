public abstract class ggb<T extends dab> extends gfz<T> implements gjo {
   private final gjj<?> E;
   private boolean F;

   public ggb(T $$0, gjj<?> $$1, cus $$2, xo $$3) {
      super($$0, $$2, $$3);
      this.E = $$1;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.F = this.o < 379;
      this.E.a(this.o, this.p, this.n, this.F);
      this.A = this.E.a(this.o, this.d);
      this.K();
   }

   protected abstract gcc E();

   private void K() {
      gcc $$0 = this.E();
      this.c(new fya($$0.a(), $$0.b(), 20, 18, gjj.a, $$0x -> {
         this.E.d();
         this.A = this.E.a(this.o, this.d);
         gcc $$1 = this.E();
         $$0x.c($$1.a(), $$1.b());
         this.F();
      }));
      this.d(this.E);
   }

   protected void F() {
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.E.e() && this.F) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         super.d($$0, $$1, $$2, $$3);
      }

      $$0.c();
      this.E.a($$0, $$1, $$2, $$3);
      $$0.c();
      this.a($$0, $$1, $$2);
      this.d($$0);
      this.b($$0, $$1, $$2);
      this.E.a($$0, $$1, $$2, this.z);
   }

   @Override
   protected void e(fxb $$0) {
      super.e($$0);
      this.E.a($$0, this.G());
   }

   protected boolean G() {
      return true;
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.E.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.E.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.E.a($$0, $$1, $$2)) {
         this.a(this.E);
         return true;
      } else {
         return this.F && this.E.e() ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.F || !this.E.e()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < $$2 || $$1 < $$3 || $$0 >= $$2 + this.d || $$1 >= $$3 + this.e;
      return this.E.a($$0, $$1, this.A, this.B, this.d, this.e, $$4) && $$5;
   }

   @Override
   protected void a(dak $$0, int $$1, int $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.E.b($$0);
   }

   @Override
   public void m() {
      super.m();
      this.E.g();
   }

   @Override
   public void H() {
      this.E.h();
   }

   @Override
   public void a(dis $$0) {
      this.E.a($$0);
   }
}
