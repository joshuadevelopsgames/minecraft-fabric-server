public class gni extends glq<hko> {
   private static final String e = "saddle";
   private static final String f = "left_saddle_mouth";
   private static final String g = "left_saddle_line";
   private static final String i = "right_saddle_mouth";
   private static final String j = "right_saddle_line";
   private static final String k = "head_saddle";
   private static final String l = "mouth_saddle_wrap";
   private final gqn[] m;

   public gni(gqn $$0) {
      super($$0);
      gqn $$1 = this.d.b("left_saddle_line");
      gqn $$2 = this.d.b("right_saddle_line");
      this.m = new gqn[]{$$1, $$2};
   }

   public static gqt a(boolean $$0) {
      return b($$0).a($$0 ? b : gqw.a);
   }

   public static gqt b(boolean $$0) {
      gqv $$1 = $$0 ? c(gqr.a) : a(gqr.a);
      gqx $$2 = $$1.a();
      gqx $$3 = $$2.b("body");
      gqx $$4 = $$2.b("head_parts");
      $$3.a("saddle", gqs.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gqr(0.5F)), gqp.a);
      $$4.a("left_saddle_mouth", gqs.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gqp.a);
      $$4.a("right_saddle_mouth", gqs.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F), gqp.a);
      $$4.a("left_saddle_line", gqs.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gqp.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gqs.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gqp.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gqs.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gqr(0.22F)), gqp.a);
      $$4.a("mouth_saddle_wrap", gqs.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gqr(0.2F)), gqp.a);
      return gqt.a($$1, 64, 64);
   }

   @Override
   public void a(hko $$0) {
      super.a($$0);

      for (gqn $$1 : this.m) {
         $$1.k = $$0.c;
      }
   }
}
