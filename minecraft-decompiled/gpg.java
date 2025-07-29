public class gpg extends gph {
   protected final gqn a;

   public gpg(gqn $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gqv a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("head", gqs.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gqp.a);
      return $$0;
   }

   public static gqt b() {
      gqv $$0 = a();
      gqx $$1 = $$0.a();
      $$1.b("head").a("hat", gqs.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gqr(0.25F)), gqp.a);
      return gqt.a($$0, 64, 64);
   }

   public static gqt c() {
      gqv $$0 = a();
      return gqt.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
