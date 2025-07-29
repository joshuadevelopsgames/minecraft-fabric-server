public class frn extends fro {
   private final ftc b;
   private final fpt c;
   private final gbo G = gbo.d();

   public frn(get $$0, fpt $$1, ftc $$2) {
      super($$0, $$2);
      this.b = $$2;
      this.c = $$1;
   }

   @Override
   public void aV_() {
      super.aV_();
      if (this.c.d() != null && this.c.d().a() != null) {
         gbo $$0 = gbo.e().a(10);
         fyx $$1 = new fyx(xo.a("mco.connect.region", xo.c(this.c.d().a().z)), this.q);
         $$0.a($$1);
         ame $$2 = this.c.d().b() != null ? this.c.d().b().b() : fqn.e.b();
         $$0.a(fyb.a(10, 8, $$2), gbn::d);
         this.G.a($$0, $$0x -> $$0x.c(40));
         this.G.a($$1x -> {
            fxm var10000 = this.c($$1x);
         });
         this.c();
      }
   }

   @Override
   protected void c() {
      super.c();
      int $$0 = this.a.F() + this.a.y();
      gcd $$1 = new gcd(0, $$0, this.o, this.p - $$0);
      this.G.a();
      gbi.a(this.G, $$1, 0.5F, 0.0F);
   }

   @Override
   public void e() {
      super.e();
      this.b.c();
   }

   @Override
   protected void f() {
      this.b.b();
      super.f();
   }
}
