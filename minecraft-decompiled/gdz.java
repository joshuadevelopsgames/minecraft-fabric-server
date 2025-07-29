import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class gdz extends get {
   private static final xo a = xo.c("addServer.enterIp");
   private fxo b;
   private final grz c;
   private fxx d;
   private final BooleanConsumer e;
   private final get f;

   public gdz(get $$0, BooleanConsumer $$1, grz $$2) {
      super(xo.c("selectServer.direct"));
      this.f = $$0;
      this.c = $$2;
      this.e = $$1;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.b.j || this.aL_() != this.d || $$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.l();
         return true;
      }
   }

   @Override
   protected void aV_() {
      this.d = new fxx(this.q, this.o / 2 - 100, 116, 200, 20, xo.c("addServer.enterIp"));
      this.d.f(128);
      this.d.a(this.n.n.Z);
      this.d.b($$0 -> this.m());
      this.d(this.d);
      this.b = this.c(fxo.a(xo.c("selectServer.select"), $$0 -> this.l()).a(this.o / 2 - 100, this.p / 4 + 96 + 12, 200, 20).a());
      this.c(fxo.a(xn.e, $$0 -> this.e.accept(false)).a(this.o / 2 - 100, this.p / 4 + 120 + 12, 200, 20).a());
      this.m();
   }

   @Override
   protected void aF_() {
      this.b(this.d);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.d.a();
      this.b($$0, $$1, $$2);
      this.d.a($$3);
   }

   private void l() {
      this.c.b = this.d.a();
      this.e.accept(true);
   }

   @Override
   public void aP_() {
      this.n.a(this.f);
   }

   @Override
   public void aI_() {
      this.n.n.Z = this.d.a();
      this.n.n.aC();
   }

   private void m() {
      this.b.j = gtc.b(this.d.a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 20, -1);
      $$0.b(this.q, a, this.o / 2 - 100 + 1, 100, -6250336);
      this.d.a($$0, $$1, $$2, $$3);
   }
}
