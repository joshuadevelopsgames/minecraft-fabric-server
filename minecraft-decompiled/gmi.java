public class gmi extends gof {
   private static final String a = "bell_body";
   private final gqn b;

   public gmi(gqn $$0) {
      super($$0, gxz::d);
      this.b = $$0.b("bell_body");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("bell_body", gqs.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), gqp.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", gqs.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), gqp.a(-8.0F, -12.0F, -8.0F));
      return gqt.a($$0, 32, 32);
   }

   public void a(eax $$0, float $$1) {
      float $$2 = $$0.a + $$1;
      float $$3 = 0.0F;
      float $$4 = 0.0F;
      if ($$0.b) {
         float $$5 = bcb.a($$2 / (float) Math.PI) / (4.0F + $$2 / 3.0F);
         if ($$0.c == jh.c) {
            $$3 = -$$5;
         } else if ($$0.c == jh.d) {
            $$3 = $$5;
         } else if ($$0.c == jh.f) {
            $$4 = -$$5;
         } else if ($$0.c == jh.e) {
            $$4 = $$5;
         }
      }

      this.b.e = $$3;
      this.b.g = $$4;
   }
}
