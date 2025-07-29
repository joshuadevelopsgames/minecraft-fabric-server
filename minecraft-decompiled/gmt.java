public class gmt extends gnh<hlq> {
   private final gqn a;

   public gmt(gqn $$0) {
      super($$0);
      this.a = $$0.b("tail_fin");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", gqs.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), gqp.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", gqs.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), gqp.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", gqs.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), gqp.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", gqs.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gqp.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", gqs.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), gqp.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", gqs.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), gqp.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", gqs.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), gqp.a(0.0F, 20.0F, 0.0F));
      return gqt.a($$0, 32, 32);
   }

   public void a(hlq $$0) {
      super.a($$0);
      float $$1 = $$0.an ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.45F * bcb.a(0.6F * $$0.v);
   }
}
