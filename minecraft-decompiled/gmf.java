public class gmf extends gnh<hjv> {
   private final gqn a;
   private final gqn b;
   private final gqn c;
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;
   private final fuu i;
   private final fuu j;

   public gmf(gqn $$0) {
      super($$0, gxz::f);
      this.b = $$0.b("body");
      this.a = $$0.b("head");
      this.c = this.b.b("right_wing");
      this.e = this.c.b("right_wing_tip");
      this.d = this.b.b("left_wing");
      this.f = this.d.b("left_wing_tip");
      this.g = this.b.b("feet");
      this.i = fux.b.a($$0);
      this.j = fux.a.a($$0);
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("body", gqs.c().a(0, 0).a(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), gqp.a(0.0F, 17.0F, 0.0F));
      gqx $$3 = $$1.a("head", gqs.c().a(0, 7).a(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), gqp.a(0.0F, 17.0F, 0.0F));
      $$3.a("right_ear", gqs.c().a(1, 15).a(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), gqp.a(-1.5F, -2.0F, 0.0F));
      $$3.a("left_ear", gqs.c().a(8, 15).a(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), gqp.a(1.1F, -3.0F, 0.0F));
      gqx $$4 = $$2.a("right_wing", gqs.c().a(12, 0).a(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gqp.a(-1.5F, 0.0F, 0.0F));
      $$4.a("right_wing_tip", gqs.c().a(16, 0).a(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gqp.a(-2.0F, 0.0F, 0.0F));
      gqx $$5 = $$2.a("left_wing", gqs.c().a(12, 7).a(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), gqp.a(1.5F, 0.0F, 0.0F));
      $$5.a("left_wing_tip", gqs.c().a(16, 8).a(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), gqp.a(2.0F, 0.0F, 0.0F));
      $$2.a("feet", gqs.c().a(16, 16).a(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), gqp.a(0.0F, 5.0F, 0.0F));
      return gqt.a($$0, 32, 32);
   }

   public void a(hjv $$0) {
      super.a($$0);
      if ($$0.a) {
         this.a($$0.ad);
      }

      this.i.a($$0.b, $$0.v);
      this.j.a($$0.c, $$0.v);
   }

   private void a(float $$0) {
      this.a.f = $$0 * (float) (Math.PI / 180.0);
   }
}
