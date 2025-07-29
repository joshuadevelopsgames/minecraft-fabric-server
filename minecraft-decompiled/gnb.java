public class gnb extends glq<hkj> {
   public static final float e = 0.87F;
   public static final float f = 0.92F;
   private static final gqw g = $$0 -> {
      a($$0.a());
      return $$0;
   };
   private final gqn i = this.c.b("left_chest");
   private final gqn j = this.c.b("right_chest");

   public gnb(gqn $$0) {
      super($$0);
   }

   public static gqt a(float $$0) {
      return gqt.a(glq.a(gqr.a), 64, 64).a(g).a(gqw.scaling($$0));
   }

   public static gqt b(float $$0) {
      return gqt.a(glq.c(gqr.a), 64, 64).a(g).a(b).a(gqw.scaling($$0));
   }

   public static gqt a(float $$0, boolean $$1) {
      return gni.b($$1).a(g).a($$1 ? glq.b : gqw.a).a(gqw.scaling($$0));
   }

   private static void a(gqx $$0) {
      gqx $$1 = $$0.b("body");
      gqs $$2 = gqs.c().a(26, 21).a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      $$1.a("left_chest", $$2, gqp.a(6.0F, -8.0F, 0.0F, 0.0F, (float) (-Math.PI / 2), 0.0F));
      $$1.a("right_chest", $$2, gqp.a(-6.0F, -8.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      gqx $$3 = $$0.b("head_parts").b("head");
      gqs $$4 = gqs.c().a(0, 12).a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      $$3.a("left_ear", $$4, gqp.a(1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12)));
      $$3.a("right_ear", $$4, gqp.a(-1.25F, -10.0F, 4.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12)));
   }

   public void a(hkj $$0) {
      super.a($$0);
      this.i.k = $$0.a;
      this.j.k = $$0.a;
   }
}
