import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class geb extends get {
   private static final xo a = xo.c("addServer.enterName");
   private static final xo b = xo.c("addServer.enterIp");
   private fxo c;
   private final BooleanConsumer d;
   private final grz e;
   private fxx f;
   private fxx u;
   private final get v;

   public geb(get $$0, BooleanConsumer $$1, grz $$2) {
      super(xo.c("addServer.title"));
      this.v = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   protected void aV_() {
      this.u = new fxx(this.q, this.o / 2 - 100, 66, 200, 20, xo.c("addServer.enterName"));
      this.u.a(this.e.a);
      this.u.b($$0 -> this.m());
      this.d(this.u);
      this.f = new fxx(this.q, this.o / 2 - 100, 106, 200, 20, xo.c("addServer.enterIp"));
      this.f.f(128);
      this.f.a(this.e.b);
      this.f.b($$0 -> this.m());
      this.d(this.f);
      this.c(
         fxv.<grz.a>a(grz.a::a)
            .a(grz.a.values())
            .a(this.e.b())
            .a(this.o / 2 - 100, this.p / 4 + 72, 200, 20, xo.c("addServer.resourcePack"), ($$0, $$1) -> this.e.a($$1))
      );
      this.c = this.c(fxo.a(xo.c("addServer.add"), $$0 -> this.l()).a(this.o / 2 - 100, this.p / 4 + 96 + 18, 200, 20).a());
      this.c(fxo.a(xn.e, $$0 -> this.d.accept(false)).a(this.o / 2 - 100, this.p / 4 + 120 + 18, 200, 20).a());
      this.m();
   }

   @Override
   protected void aF_() {
      this.b(this.u);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.f.a();
      String $$4 = this.u.a();
      this.b($$0, $$1, $$2);
      this.f.a($$3);
      this.u.a($$4);
   }

   private void l() {
      this.e.a = this.u.a();
      this.e.b = this.f.a();
      this.d.accept(true);
   }

   @Override
   public void aP_() {
      this.n.a(this.v);
   }

   private void m() {
      this.c.j = gtc.b(this.f.a()) && !this.u.a().isEmpty();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 17, -1);
      $$0.b(this.q, a, this.o / 2 - 100 + 1, 53, -6250336);
      $$0.b(this.q, b, this.o / 2 - 100 + 1, 94, -6250336);
      this.u.a($$0, $$1, $$2, $$3);
      this.f.a($$0, $$1, $$2, $$3);
   }
}
