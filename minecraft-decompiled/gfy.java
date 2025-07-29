public abstract class gfy extends get {
   private static final xo f = xo.c("advMode.setCommand");
   private static final xo u = xo.c("advMode.command");
   private static final xo v = xo.c("advMode.previousOutput");
   protected fxx a;
   protected fxx b;
   protected fxo c;
   protected fxo d;
   protected fxv<Boolean> e;
   fxr w;

   public gfy() {
      super(ftv.a);
   }

   @Override
   public void e() {
      if (!this.l().j()) {
         this.aP_();
      }
   }

   abstract dlt l();

   abstract int m();

   @Override
   protected void aV_() {
      this.c = this.c(fxo.a(xn.d, $$0x -> this.n()).a(this.o / 2 - 4 - 150, this.p / 4 + 120 + 12, 150, 20).a());
      this.d = this.c(fxo.a(xn.e, $$0x -> this.aP_()).a(this.o / 2 + 4, this.p / 4 + 120 + 12, 150, 20).a());
      boolean $$0 = this.l().p();
      this.e = this.c(
         fxv.a(xo.b("O"), xo.b("X")).a(Boolean.valueOf($$0)).a().a(this.o / 2 + 150 - 20, this.m(), 20, 20, xo.c("advMode.trackOutput"), ($$0x, $$1) -> {
            dlt $$2 = this.l();
            $$2.a($$1);
            this.c($$1);
         })
      );
      this.a = new fxx(this.q, this.o / 2 - 150, 50, 300, 20, xo.c("advMode.command")) {
         @Override
         protected yc d() {
            return super.d().b(gfy.this.w.e());
         }
      };
      this.a.f(32500);
      this.a.b(this::a);
      this.d(this.a);
      this.b = new fxx(this.q, this.o / 2 - 150, this.m(), 276, 20, xo.c("advMode.previousOutput"));
      this.b.f(32500);
      this.b.e(false);
      this.b.a("-");
      this.d(this.b);
      this.w = new fxr(this.n, this, this.a, this.q, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.w.a(true);
      this.w.d();
      this.c($$0);
   }

   @Override
   protected void aF_() {
      this.b(this.a);
   }

   @Override
   protected xo A() {
      return this.w.a() ? this.w.b() : super.A();
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.a.a();
      this.b($$0, $$1, $$2);
      this.a.a($$3);
      this.w.d();
   }

   @Override
   protected void c(boolean $$0) {
      this.b.a($$0 ? this.l().l().getString() : "-");
   }

   protected void n() {
      dlt $$0 = this.l();
      this.a($$0);
      if (!$$0.p()) {
         $$0.c(null);
      }

      this.n.a(null);
   }

   protected abstract void a(dlt var1);

   private void a(String $$0) {
      this.w.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.w.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.n();
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.w.a($$3) ? true : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return this.w.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, f, this.o / 2, 20, -1);
      $$0.b(this.q, u, this.o / 2 - 150 + 1, 40, -6250336);
      this.a.a($$0, $$1, $$2, $$3);
      int $$4 = 75;
      if (!this.b.a().isEmpty()) {
         $$4 += 5 * 9 + 1 + this.m() - 135;
         $$0.b(this.q, v, this.o / 2 - 150 + 1, $$4 + 4, -6250336);
         this.b.a($$0, $$1, $$2, $$3);
      }

      this.w.a($$0, $$1, $$2);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
   }
}
