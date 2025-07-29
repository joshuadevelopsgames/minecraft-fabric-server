public class gma extends gnh<hjt> {
   public gma(gqn $$0) {
      super($$0, gxz::f);
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("back", gqs.c().a(0, 0).a(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), gqp.a(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).a(0.8F));
      gqs $$2 = gqs.c().a(0, 0).a(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, gqr.a, 1.0F, 0.8F);
      $$1.a("cross_1", $$2, gqp.b((float) (Math.PI / 4), 0.0F, 0.0F));
      $$1.a("cross_2", $$2, gqp.b((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return gqt.a($$0.a($$0x -> $$0x.b(0.9F)), 32, 32);
   }

   public void a(hjt $$0) {
      super.a($$0);
      if ($$0.c > 0.0F) {
         float $$1 = -bcb.a($$0.c * 3.0F) * $$0.c;
         this.v.g += $$1 * (float) (Math.PI / 180.0);
      }
   }
}
