public class gpz extends gnh<hkn> {
   private static final int a = 16;
   private final gqn b;
   private final gqn c;
   private final gqn d;

   public gpz(gqn $$0) {
      super($$0, gxz::j);
      this.b = $$0.b("bone");
      this.d = this.b.b("wind");
      this.c = this.b.b("wind_charge");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("bone", gqs.c(), gqp.a(0.0F, 0.0F, 0.0F));
      $$2.a(
         "wind",
         gqs.c().a(15, 20).a(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, new gqr(0.0F)).a(0, 9).a(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new gqr(0.0F)),
         gqp.a(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      $$2.a("wind_charge", gqs.c().a(0, 0).a(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new gqr(0.0F)), gqp.a(0.0F, 0.0F, 0.0F));
      return gqt.a($$0, 64, 32);
   }

   @Override
   public void a(hkn $$0) {
      super.a($$0);
      this.c.f = -$$0.v * 16.0F * (float) (Math.PI / 180.0);
      this.d.f = $$0.v * 16.0F * (float) (Math.PI / 180.0);
   }
}
