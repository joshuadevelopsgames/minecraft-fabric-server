public class gmz extends gnh<hkg> {
   private final gqn a;
   private final gqn b;
   private final gqn c;
   private final gqn d;
   private final gqn e;
   private static final int f = 6;

   public gmz(gqn $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.c = $$0.b("right_hind_leg");
      this.b = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.d = $$0.b("left_front_leg");
   }

   public static gqt a(gqr $$0) {
      gqv $$1 = new gqv();
      gqx $$2 = $$1.a();
      $$2.a("head", gqs.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gqp.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", gqs.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gqp.a(0.0F, 6.0F, 0.0F));
      gqs $$3 = gqs.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, gqp.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, gqp.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, gqp.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, gqp.a(2.0F, 18.0F, -4.0F));
      return gqt.a($$1, 64, 32);
   }

   public void a(hkg $$0) {
      super.a($$0);
      this.a.f = $$0.ad * (float) (Math.PI / 180.0);
      this.a.e = $$0.ae * (float) (Math.PI / 180.0);
      float $$1 = $$0.ah;
      float $$2 = $$0.ag;
      this.b.e = bcb.b($$2 * 0.6662F) * 1.4F * $$1;
      this.c.e = bcb.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.d.e = bcb.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = bcb.b($$2 * 0.6662F) * 1.4F * $$1;
   }
}
