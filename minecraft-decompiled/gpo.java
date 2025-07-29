public class gpo extends gnh<hmr> {
   public static final gqw a = gqw.scaling(0.5F);
   private static final String b = "right_bottom_bristle";
   private static final String c = "right_middle_bristle";
   private static final String d = "right_top_bristle";
   private static final String e = "left_top_bristle";
   private static final String f = "left_middle_bristle";
   private static final String g = "left_bottom_bristle";
   private final gqn i;
   private final gqn j;
   private final gqn k;
   private final gqn l;
   private final gqn m;
   private final gqn n;
   private final gqn o;
   private final gqn p;
   private final gqn q;

   public gpo(gqn $$0) {
      super($$0);
      this.i = $$0.b("right_leg");
      this.j = $$0.b("left_leg");
      this.k = $$0.b("body");
      this.l = this.k.b("right_bottom_bristle");
      this.m = this.k.b("right_middle_bristle");
      this.n = this.k.b("right_top_bristle");
      this.o = this.k.b("left_top_bristle");
      this.p = this.k.b("left_middle_bristle");
      this.q = this.k.b("left_bottom_bristle");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("right_leg", gqs.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gqp.a(-4.0F, 8.0F, 0.0F));
      $$1.a("left_leg", gqs.c().a(0, 55).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), gqp.a(4.0F, 8.0F, 0.0F));
      gqx $$2 = $$1.a("body", gqs.c().a(0, 0).a(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F), gqp.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_bottom_bristle", gqs.c().a(16, 65).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gqp.a(-8.0F, 4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F));
      $$2.a("right_middle_bristle", gqs.c().a(16, 49).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gqp.a(-8.0F, -1.0F, -8.0F, 0.0F, 0.0F, -1.134464F));
      $$2.a("right_top_bristle", gqs.c().a(16, 33).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), gqp.a(-8.0F, -5.0F, -8.0F, 0.0F, 0.0F, -0.87266463F));
      $$2.a("left_top_bristle", gqs.c().a(16, 33).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gqp.a(8.0F, -6.0F, -8.0F, 0.0F, 0.0F, 0.87266463F));
      $$2.a("left_middle_bristle", gqs.c().a(16, 49).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gqp.a(8.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.134464F));
      $$2.a("left_bottom_bristle", gqs.c().a(16, 65).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), gqp.a(8.0F, 3.0F, -8.0F, 0.0F, 0.0F, 1.2217305F));
      return gqt.a($$0, 64, 128);
   }

   public void a(hmr $$0) {
      super.a($$0);
      float $$1 = $$0.ag;
      float $$2 = Math.min($$0.ah, 0.25F);
      if (!$$0.c) {
         this.k.e = $$0.ae * (float) (Math.PI / 180.0);
         this.k.f = $$0.ad * (float) (Math.PI / 180.0);
      } else {
         this.k.e = 0.0F;
         this.k.f = 0.0F;
      }

      float $$3 = 1.5F;
      this.k.g = 0.1F * bcb.a($$1 * 1.5F) * 4.0F * $$2;
      this.k.c = 2.0F;
      this.k.c = this.k.c - 2.0F * bcb.b($$1 * 1.5F) * 2.0F * $$2;
      this.j.e = bcb.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.i.e = bcb.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.j.g = (float) (Math.PI / 18) * bcb.b($$1 * 1.5F * 0.5F) * $$2;
      this.i.g = (float) (Math.PI / 18) * bcb.b($$1 * 1.5F * 0.5F + (float) Math.PI) * $$2;
      this.j.c = 8.0F + 2.0F * bcb.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.i.c = 8.0F + 2.0F * bcb.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.l.g = -1.2217305F;
      this.m.g = -1.134464F;
      this.n.g = -0.87266463F;
      this.o.g = 0.87266463F;
      this.p.g = 1.134464F;
      this.q.g = 1.2217305F;
      float $$4 = bcb.b($$1 * 1.5F + (float) Math.PI) * $$2;
      this.l.g += $$4 * 1.3F;
      this.m.g += $$4 * 1.2F;
      this.n.g += $$4 * 0.6F;
      this.o.g += $$4 * 0.6F;
      this.p.g += $$4 * 1.2F;
      this.q.g += $$4 * 1.3F;
      float $$5 = 1.0F;
      float $$6 = 1.0F;
      this.l.g = this.l.g + 0.05F * bcb.a($$0.v * 1.0F * -0.4F);
      this.m.g = this.m.g + 0.1F * bcb.a($$0.v * 1.0F * 0.2F);
      this.n.g = this.n.g + 0.1F * bcb.a($$0.v * 1.0F * 0.4F);
      this.o.g = this.o.g + 0.1F * bcb.a($$0.v * 1.0F * 0.4F);
      this.p.g = this.p.g + 0.1F * bcb.a($$0.v * 1.0F * 0.2F);
      this.q.g = this.q.g + 0.05F * bcb.a($$0.v * 1.0F * -0.4F);
   }
}
