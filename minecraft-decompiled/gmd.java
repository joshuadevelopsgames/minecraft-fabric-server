public class gmd extends gof {
   private final gqn a;

   public gmd(gqn $$0) {
      super($$0, gxz::d);
      this.a = $$0.b("flag");
   }

   public static gqt a(boolean $$0) {
      gqv $$1 = new gqv();
      gqx $$2 = $$1.a();
      $$2.a("flag", gqs.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gqp.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gqt.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * bcb.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
