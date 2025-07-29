import java.util.Set;

public class gms extends gnh<hkd> {
   public static final String a = "red_thing";
   public static final float b = 16.0F;
   public static final gqw c = new gmc(false, 5.0F, 2.0F, 2.0F, 1.99F, 24.0F, Set.of("head", "beak", "red_thing"));
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;
   private final gqn i;

   public gms(gqn $$0) {
      super($$0);
      this.d = $$0.b("head");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("right_wing");
      this.i = $$0.b("left_wing");
   }

   public static gqt a() {
      gqv $$0 = b();
      return gqt.a($$0, 64, 32);
   }

   protected static gqv b() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("head", gqs.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), gqp.a(0.0F, 15.0F, -4.0F));
      $$2.a("beak", gqs.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), gqp.a);
      $$2.a("red_thing", gqs.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), gqp.a);
      $$1.a("body", gqs.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), gqp.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      gqs $$3 = gqs.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, gqp.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, gqp.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", gqs.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gqp.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", gqs.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), gqp.a(4.0F, 13.0F, 0.0F));
      return $$0;
   }

   public void a(hkd $$0) {
      super.a($$0);
      float $$1 = (bcb.a($$0.a) + 1.0F) * $$0.b;
      this.d.e = $$0.ae * (float) (Math.PI / 180.0);
      this.d.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$2 = $$0.ah;
      float $$3 = $$0.ag;
      this.e.e = bcb.b($$3 * 0.6662F) * 1.4F * $$2;
      this.f.e = bcb.b($$3 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.g.g = $$1;
      this.i.g = -$$1;
   }
}
