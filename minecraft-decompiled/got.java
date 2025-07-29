public class got extends gnh<hkn> {
   private final gqn a;
   private final gqn b;

   public got(gqn $$0) {
      super($$0);
      this.a = $$0.b("left_fin");
      this.b = $$0.b("right_fin");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      int $$2 = 23;
      $$1.a("body", gqs.c().a(0, 27).a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F), gqp.a(0.0F, 23.0F, 0.0F));
      $$1.a("right_eye", gqs.c().a(24, 6).a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gqp.a(0.0F, 20.0F, 0.0F));
      $$1.a("left_eye", gqs.c().a(28, 6).a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F), gqp.a(0.0F, 20.0F, 0.0F));
      $$1.a("back_fin", gqs.c().a(-3, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F), gqp.a(0.0F, 22.0F, 1.5F));
      $$1.a("right_fin", gqs.c().a(25, 0).a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gqp.a(-1.5F, 22.0F, -1.5F));
      $$1.a("left_fin", gqs.c().a(25, 0).a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F), gqp.a(1.5F, 22.0F, -1.5F));
      return gqt.a($$0, 32, 32);
   }

   @Override
   public void a(hkn $$0) {
      super.a($$0);
      this.b.g = -0.2F + 0.4F * bcb.a($$0.v * 0.2F);
      this.a.g = 0.2F - 0.4F * bcb.a($$0.v * 0.2F);
   }
}
