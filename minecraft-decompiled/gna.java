public class gna extends gnh<hki> {
   public static final gqw a = gqw.scaling(0.5F);
   private final gqn b;
   private final gqn c;
   private final gqn d;

   public gna(gqn $$0) {
      super($$0);
      this.b = $$0.b("body");
      this.c = this.b.b("tail");
      this.d = this.c.b("tail_fin");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      float $$2 = 18.0F;
      float $$3 = -8.0F;
      gqx $$4 = $$1.a("body", gqs.c().a(22, 0).a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F), gqp.a(0.0F, 22.0F, -5.0F));
      $$4.a("back_fin", gqs.c().a(51, 0).a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F), gqp.b((float) (Math.PI / 3), 0.0F, 0.0F));
      $$4.a(
         "left_fin",
         gqs.c().a(48, 20).a().a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gqp.a(2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (Math.PI * 2.0 / 3.0))
      );
      $$4.a(
         "right_fin",
         gqs.c().a(48, 20).a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F),
         gqp.a(-2.0F, -2.0F, 4.0F, (float) (Math.PI / 3), 0.0F, (float) (-Math.PI * 2.0 / 3.0))
      );
      gqx $$5 = $$4.a("tail", gqs.c().a(0, 19).a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F), gqp.a(0.0F, -2.5F, 11.0F, -0.10471976F, 0.0F, 0.0F));
      $$5.a("tail_fin", gqs.c().a(19, 20).a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F), gqp.a(0.0F, 0.0F, 9.0F));
      gqx $$6 = $$4.a("head", gqs.c().a(0, 0).a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F), gqp.a(0.0F, -4.0F, -3.0F));
      $$6.a("nose", gqs.c().a(0, 13).a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F), gqp.a);
      return gqt.a($$0, 64, 64);
   }

   public void a(hki $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.e = this.b.e + (-0.05F - 0.05F * bcb.b($$0.v * 0.3F));
         this.c.e = -0.1F * bcb.b($$0.v * 0.3F);
         this.d.e = -0.2F * bcb.b($$0.v * 0.3F);
      }
   }
}
