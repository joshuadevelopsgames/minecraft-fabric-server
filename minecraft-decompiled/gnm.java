public class gnm extends gnh<hkx> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float c = 2.5F;
   private final gqn d = this.v.b("body");
   private final gqn e = this.d.b("head");
   private final gqn f = this.e.b("eyes");
   private final gqn g = this.d.b("tongue");
   private final gqn i = this.d.b("left_arm");
   private final gqn j = this.d.b("right_arm");
   private final gqn k = this.v.b("left_leg");
   private final gqn l = this.v.b("right_leg");
   private final gqn m = this.d.b("croaking_body");
   private final fuu n;
   private final fuu o;
   private final fuu p;
   private final fuu q;
   private final fuu r;
   private final fuu s;

   public gnm(gqn $$0) {
      super($$0.b("root"));
      this.n = fvb.c.a($$0);
      this.o = fvb.a.a($$0);
      this.p = fvb.d.a($$0);
      this.q = fvb.e.a($$0);
      this.r = fvb.b.a($$0);
      this.s = fvb.f.a($$0);
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("root", gqs.c(), gqp.a(0.0F, 24.0F, 0.0F));
      gqx $$3 = $$2.a(
         "body", gqs.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), gqp.a(0.0F, -2.0F, 4.0F)
      );
      gqx $$4 = $$3.a(
         "head", gqs.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), gqp.a(0.0F, -2.0F, -1.0F)
      );
      gqx $$5 = $$4.a("eyes", gqs.c(), gqp.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", gqs.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gqp.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", gqs.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), gqp.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", gqs.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new gqr(-0.1F)), gqp.a(0.0F, -1.0F, -5.0F));
      gqx $$6 = $$3.a("tongue", gqs.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), gqp.a(0.0F, -1.01F, 1.0F));
      gqx $$7 = $$3.a("left_arm", gqs.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gqp.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", gqs.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gqp.a(0.0F, 3.0F, -1.0F));
      gqx $$8 = $$3.a("right_arm", gqs.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), gqp.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", gqs.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), gqp.a(0.0F, 3.0F, 0.0F));
      gqx $$9 = $$2.a("left_leg", gqs.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gqp.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", gqs.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gqp.a(2.0F, 3.0F, 0.0F));
      gqx $$10 = $$2.a("right_leg", gqs.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), gqp.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", gqs.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), gqp.a(-2.0F, 3.0F, 0.0F));
      return gqt.a($$0, 48, 48);
   }

   public void a(hkx $$0) {
      super.a($$0);
      this.n.a($$0.b, $$0.v);
      this.o.a($$0.c, $$0.v);
      this.p.a($$0.d, $$0.v);
      if ($$0.a) {
         this.q.a($$0.ag, $$0.ah, 1.0F, 2.5F);
      } else {
         this.r.a($$0.ag, $$0.ah, 1.5F, 2.5F);
      }

      this.s.a($$0.e, $$0.v);
      this.m.k = $$0.c.b();
   }
}
