public class gpp extends gnh<hlq> {
   private final gqn a;

   public gpp(gqn $$0) {
      super($$0, gxz::g);
      this.a = $$0.b("tail");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      float $$2 = 0.0F;
      float $$3 = 22.0F;
      float $$4 = -3.0F;
      $$1.a("body", gqs.c().a(0, 0).a(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 3.0F), gqp.a(0.0F, 22.0F, -3.0F));
      $$1.a("tail", gqs.c().a(0, 0).a(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F), gqp.a(0.0F, 22.0F, 0.0F));
      return gqt.a($$0, 16, 16);
   }

   public void a(hlq $$0) {
      super.a($$0);
      float $$1 = $$0.an ? 1.0F : 1.5F;
      this.a.f = -$$1 * 0.25F * bcb.a(0.3F * $$0.v);
   }
}
