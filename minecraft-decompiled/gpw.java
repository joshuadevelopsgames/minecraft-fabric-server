public class gpw extends gnh<hnb> implements gnt, gpv {
   public static final gqw a = gqw.scaling(0.5F);
   private final gqn b;
   private final gqn c;
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;

   public gpw(gqn $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gqv a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      float $$2 = 0.5F;
      gqx $$3 = $$1.a("head", gqs.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gqp.a);
      gqx $$4 = $$3.a("hat", gqs.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new gqr(0.51F)), gqp.a);
      $$4.a("hat_rim", gqs.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), gqp.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", gqs.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gqp.a(0.0F, -2.0F, 0.0F));
      gqx $$5 = $$1.a("body", gqs.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), gqp.a);
      $$5.a("jacket", gqs.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gqr(0.5F)), gqp.a);
      $$1.a(
         "arms",
         gqs.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gqp.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", gqs.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gqs.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   public void a(hnb $$0) {
      super.a($$0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.b.g = 0.3F * bcb.a(0.45F * $$0.v);
         this.b.e = 0.4F;
      } else {
         this.b.g = 0.0F;
      }

      this.e.e = bcb.b($$0.ag * 0.6662F) * 1.4F * $$0.ah * 0.5F;
      this.f.e = bcb.b($$0.ag * 0.6662F + (float) Math.PI) * 1.4F * $$0.ah * 0.5F;
      this.e.f = 0.0F;
      this.f.f = 0.0F;
   }

   @Override
   public gqn b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }

   @Override
   public void a(fod $$0) {
      this.v.a($$0);
      this.g.a($$0);
   }
}
