public class gpd extends gnh<hml> {
   public static final String a = "lid";
   private static final String b = "base";
   private final gqn c;
   private final gqn d;

   public gpd(gqn $$0) {
      super($$0, gxz::h);
      this.c = $$0.b("lid");
      this.d = $$0.b("head");
   }

   private static gqv c() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("lid", gqs.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F), gqp.a(0.0F, 24.0F, 0.0F));
      $$1.a("base", gqs.c().a(0, 28).a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F), gqp.a(0.0F, 24.0F, 0.0F));
      return $$0;
   }

   public static gqt a() {
      gqv $$0 = c();
      $$0.a().a("head", gqs.c().a(0, 52).a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F), gqp.a(0.0F, 12.0F, 0.0F));
      return gqt.a($$0, 64, 64);
   }

   public static gqt b() {
      gqv $$0 = c();
      return gqt.a($$0, 64, 64);
   }

   public void a(hml $$0) {
      super.a($$0);
      float $$1 = (0.5F + $$0.c) * (float) Math.PI;
      float $$2 = -1.0F + bcb.a($$1);
      float $$3 = 0.0F;
      if ($$1 > (float) Math.PI) {
         $$3 = bcb.a($$0.v * 0.1F) * 0.7F;
      }

      this.c.a(0.0F, 16.0F + bcb.a($$1) * 8.0F + $$3, 0.0F);
      if ($$0.c > 0.3F) {
         this.c.f = $$2 * $$2 * $$2 * $$2 * (float) Math.PI * 0.125F;
      } else {
         this.c.f = 0.0F;
      }

      this.d.e = $$0.ae * (float) (Math.PI / 180.0);
      this.d.f = ($$0.d - 180.0F - $$0.e) * (float) (Math.PI / 180.0);
   }
}
