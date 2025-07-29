public class hhe extends hfl<ctw, hnc, gpx> {
   private static final ame a = ame.b("textures/entity/warden/warden.png");
   private static final ame k = ame.b("textures/entity/warden/warden_bioluminescent_layer.png");
   private static final ame l = ame.b("textures/entity/warden/warden_heart.png");
   private static final ame m = ame.b("textures/entity/warden/warden_pulsating_spots_1.png");
   private static final ame n = ame.b("textures/entity/warden/warden_pulsating_spots_2.png");

   public hhe(hee.a $$0) {
      super($$0, new gpx($$0.a(gqm.dV)), 0.9F);
      this.a(new him<>(this, k, ($$0x, $$1) -> 1.0F, gpx::d, gxz::k, false));
      this.a(new him<>(this, m, ($$0x, $$1) -> Math.max(0.0F, bcb.b($$1 * 0.045F) * 0.25F), gpx::e, gxz::k, false));
      this.a(new him<>(this, n, ($$0x, $$1) -> Math.max(0.0F, bcb.b($$1 * 0.045F + (float) Math.PI) * 0.25F), gpx::e, gxz::k, false));
      this.a(new him<>(this, a, ($$0x, $$1) -> $$0x.a, gpx::b, gxz::k, false));
      this.a(new him<>(this, l, ($$0x, $$1) -> $$0x.b, gpx::c, gxz::k, false));
   }

   public ame a(hnc $$0) {
      return a;
   }

   public hnc b() {
      return new hnc();
   }

   public void a(ctw $$0, hnc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = $$0.K($$2);
      $$1.c.a($$0.a);
      $$1.d.a($$0.b);
      $$1.e.a($$0.c);
      $$1.f.a($$0.d);
      $$1.g.a($$0.e);
      $$1.h.a($$0.f);
   }
}
