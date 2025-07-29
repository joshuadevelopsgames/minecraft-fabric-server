public class gmn extends gnh<hka> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float c = 1.0F;
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;
   private final gqn i;
   private final gqn j;
   private final gqn k;
   private final fuu l;
   private final fuu m;
   private final fuu n;
   private final fuu o;
   private final fuu p;
   private final fuu q;

   public gmn(gqn $$0) {
      super($$0, gxz::j);
      this.f = $$0.b("wind_body");
      this.j = this.f.b("wind_bottom");
      this.i = this.j.b("wind_mid");
      this.g = this.i.b("wind_top");
      this.d = $$0.b("body").b("head");
      this.e = this.d.b("eyes");
      this.k = $$0.b("body").b("rods");
      this.l = fuy.a.a($$0);
      this.m = fuy.b.a($$0);
      this.n = fuy.e.a($$0);
      this.o = fuy.f.a($$0);
      this.p = fuy.d.a($$0);
      this.q = fuy.c.a($$0);
   }

   public static gqt a(int $$0, int $$1) {
      gqv $$2 = new gqv();
      gqx $$3 = $$2.a();
      gqx $$4 = $$3.a("body", gqs.c(), gqp.a(0.0F, 0.0F, 0.0F));
      gqx $$5 = $$4.a("rods", gqs.c(), gqp.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", gqs.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gqr(0.0F)), gqp.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", gqs.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gqr(0.0F)), gqp.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", gqs.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new gqr(0.0F)), gqp.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      gqx $$6 = $$4.a(
         "head",
         gqs.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gqr(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gqr(0.0F)),
         gqp.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         gqs.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new gqr(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gqr(0.0F)),
         gqp.a(0.0F, 0.0F, 0.0F)
      );
      gqx $$7 = $$3.a("wind_body", gqs.c(), gqp.a(0.0F, 0.0F, 0.0F));
      gqx $$8 = $$7.a("wind_bottom", gqs.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new gqr(0.0F)), gqp.a(0.0F, 24.0F, 0.0F));
      gqx $$9 = $$8.a(
         "wind_mid",
         gqs.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new gqr(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new gqr(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new gqr(0.0F)),
         gqp.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         gqs.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new gqr(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new gqr(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new gqr(0.0F)),
         gqp.a(0.0F, -6.0F, 0.0F)
      );
      return gqt.a($$2, $$0, $$1);
   }

   public void a(hka $$0) {
      super.a($$0);
      this.l.a($$0.a, $$0.v);
      this.m.a($$0.b, $$0.v);
      this.n.a($$0.c, $$0.v);
      this.o.a($$0.d, $$0.v);
      this.p.a($$0.e, $$0.v);
      this.q.a($$0.f, $$0.v);
   }

   public gqn a() {
      return this.d;
   }

   public gqn b() {
      return this.e;
   }

   public gqn c() {
      return this.k;
   }

   public gqn d() {
      return this.f;
   }
}
