public class gqe<S extends hni> extends gnx<S> implements gpv {
   private final gqn a = this.p.b("hat_rim");

   public gqe(gqn $$0) {
      super($$0);
   }

   public static gqt a() {
      gqv $$0 = gnx.a(gqr.a, 0.0F);
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("head", new gqs().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F).a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F), gqp.a);
      gqx $$3 = $$2.a("hat", gqs.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gqr(0.5F)), gqp.a);
      $$3.a("hat_rim", gqs.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gqp.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$1.a("body", gqs.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gqr(0.05F)), gqp.a);
      $$1.a("right_arm", gqs.c().a(44, 22).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gqs.c().a(44, 22).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", gqs.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gqs.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(2.0F, 12.0F, 0.0F));
      return gqt.a($$0, 64, 64);
   }

   public static gqt a(gqr $$0) {
      gqv $$1 = gnx.a($$0, 0.0F);
      gqx $$2 = $$1.a();
      gqx $$3 = $$2.a("head", gqs.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gqp.a);
      $$2.a("body", gqs.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.1F)), gqp.a);
      $$2.a("right_leg", gqs.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gqp.a(-2.0F, 12.0F, 0.0F));
      $$2.a("left_leg", gqs.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.1F)), gqp.a(2.0F, 12.0F, 0.0F));
      $$3.b("hat").a("hat_rim", gqs.c(), gqp.a);
      return gqt.a($$1, 64, 32);
   }

   public void a(S $$0) {
      super.a($$0);
      float $$1 = $$0.K;
      glv.a(this.s, this.r, $$0.a, $$1, $$0.v);
   }

   @Override
   public void a(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.a.k = $$0;
   }

   @Override
   public void a(fod $$0) {
      this.a(cad.b, $$0);
   }
}
