public class ggl extends gfy {
   private final ebk f;
   private fxv<ebk.a> u;
   private fxv<Boolean> v;
   private fxv<Boolean> w;
   private ebk.a x = ebk.a.c;
   private boolean y;
   private boolean z;

   public ggl(ebk $$0) {
      this.f = $$0;
   }

   @Override
   dlt l() {
      return this.f.a();
   }

   @Override
   int m() {
      return 135;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.u = this.c(fxv.<ebk.a>a($$0 -> {
         return switch ($$0) {
            case a -> xo.c("advMode.mode.sequence");
            case b -> xo.c("advMode.mode.auto");
            case c -> xo.c("advMode.mode.redstone");
         };
      }).a(ebk.a.values()).a().a(this.x).a(this.o / 2 - 50 - 100 - 4, 165, 100, 20, xo.c("advMode.mode"), ($$0, $$1) -> this.x = $$1));
      this.v = this.c(
         fxv.a(xo.c("advMode.mode.conditional"), xo.c("advMode.mode.unconditional"))
            .a()
            .a(Boolean.valueOf(this.y))
            .a(this.o / 2 - 50, 165, 100, 20, xo.c("advMode.type"), ($$0, $$1) -> this.y = $$1)
      );
      this.w = this.c(
         fxv.a(xo.c("advMode.mode.autoexec.bat"), xo.c("advMode.mode.redstoneTriggered"))
            .a()
            .a(Boolean.valueOf(this.z))
            .a(this.o / 2 + 50 + 4, 165, 100, 20, xo.c("advMode.triggering"), ($$0, $$1) -> this.z = $$1)
      );
      this.f(false);
   }

   private void f(boolean $$0) {
      this.c.j = $$0;
      this.e.j = $$0;
      this.u.j = $$0;
      this.v.j = $$0;
      this.w.j = $$0;
   }

   public void E() {
      dlt $$0 = this.f.a();
      this.a.a($$0.m());
      boolean $$1 = $$0.p();
      this.x = this.f.u();
      this.y = this.f.v();
      this.z = this.f.d();
      this.e.a($$1);
      this.u.a(this.x);
      this.v.a(this.y);
      this.w.a(this.z);
      this.c($$1);
      this.f(true);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f(true);
   }

   @Override
   protected void a(dlt $$0) {
      this.n.M().b(new ajf(jb.a((jv)$$0.g()), this.a.a(), this.x, $$0.p(), this.y, this.z));
   }
}
