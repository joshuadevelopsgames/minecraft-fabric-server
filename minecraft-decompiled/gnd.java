public class gnd extends gnh<hlh> {
   public static final gqw a = gqw.scaling(0.5F);
   private final gqn b;
   private final gqn c;

   public gnd(gqn $$0) {
      super($$0);
      this.c = $$0.b("left_wing");
      this.b = $$0.b("right_wing");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqr $$2 = new gqr(1.0F);
      $$1.a(
         "left_wing",
         gqs.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gqp.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         gqs.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         gqp.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return gqt.a($$0, 64, 32);
   }

   public void a(hlh $$0) {
      super.a($$0);
      this.c.c = $$0.Q ? 3.0F : 0.0F;
      this.c.e = $$0.V;
      this.c.g = $$0.X;
      this.c.f = $$0.W;
      this.b.f = -this.c.f;
      this.b.c = this.c.c;
      this.b.e = this.c.e;
      this.b.g = -this.c.g;
   }
}
