public class gnr extends gnh<hlb> {
   private static final float a = 14.0F;
   private final gqn b;

   public gnr(gqn $$0) {
      super($$0);
      this.b = $$0.b("goggles");
   }

   public static gqt a(boolean $$0) {
      gqv $$1 = new gqv();
      gqx $$2 = $$1.a();
      $$2.a("harness", gqs.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F), gqp.a(0.0F, 24.0F, 0.0F));
      $$2.a("goggles", gqs.c().a(0, 32).a(-8.0F, -2.5F, -2.5F, 16.0F, 5.0F, 5.0F, new gqr(0.15F)), gqp.a(0.0F, 14.0F, -5.5F));
      return gqt.a($$1, 64, 64).a(gqw.scaling(4.0F)).a($$0 ? gns.a : gqw.a);
   }

   public void a(hlb $$0) {
      super.a($$0);
      if ($$0.b) {
         this.b.e = 0.0F;
         this.b.c = 14.0F;
      } else {
         this.b.e = -0.7854F;
         this.b.c = 9.0F;
      }
   }
}
