public class gou<T extends hlq> extends gnh<T> {
   protected final gqn b;
   protected final gqn c;
   protected final gqn d;
   protected final gqn e;
   protected final gqn f;
   protected final gqn g;

   protected gou(gqn $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = $$0.b("body");
      this.d = $$0.b("right_hind_leg");
      this.e = $$0.b("left_hind_leg");
      this.f = $$0.b("right_front_leg");
      this.g = $$0.b("left_front_leg");
   }

   public static gqv a(int $$0, boolean $$1, boolean $$2, gqr $$3) {
      gqv $$4 = new gqv();
      gqx $$5 = $$4.a();
      $$5.a("head", gqs.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$3), gqp.a(0.0F, 18 - $$0, -6.0F));
      $$5.a("body", gqs.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$3), gqp.a(0.0F, 17 - $$0, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      a($$5, $$1, $$2, $$0, $$3);
      return $$4;
   }

   static void a(gqx $$0, boolean $$1, boolean $$2, int $$3, gqr $$4) {
      gqs $$5 = gqs.c().a($$2).a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$3, 4.0F, $$4);
      gqs $$6 = gqs.c().a($$1).a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$3, 4.0F, $$4);
      $$0.a("right_hind_leg", $$5, gqp.a(-3.0F, 24 - $$3, 7.0F));
      $$0.a("left_hind_leg", $$6, gqp.a(3.0F, 24 - $$3, 7.0F));
      $$0.a("right_front_leg", $$5, gqp.a(-3.0F, 24 - $$3, -5.0F));
      $$0.a("left_front_leg", $$6, gqp.a(3.0F, 24 - $$3, -5.0F));
   }

   public void a(T $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$1 = $$0.ag;
      float $$2 = $$0.ah;
      this.d.e = bcb.b($$1 * 0.6662F) * 1.4F * $$2;
      this.e.e = bcb.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.f.e = bcb.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.e = bcb.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
