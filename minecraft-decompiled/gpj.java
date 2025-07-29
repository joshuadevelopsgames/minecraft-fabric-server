public class gpj extends gnh<hmo> {
   public static final gqw a = gqw.scaling(0.5F);
   private static final float b = 9.0F;
   private static final float c = 100.0F;
   private final gqn d;
   private final fuu e;
   private final fuu f;
   private final fuu g;
   private final fuu i;
   private final fuu j;
   private final fuu k;
   private final fuu l;
   private final fuu m;

   public gpj(gqn $$0) {
      super($$0);
      this.d = $$0.b("bone").b("body").b("head");
      this.e = fvc.e.a($$0);
      this.f = fvc.d.a($$0);
      this.g = fvc.f.a($$0);
      this.i = fvc.c.a($$0);
      this.j = fvc.g.a($$0);
      this.k = fvc.i.a($$0);
      this.l = fvc.b.a($$0);
      this.m = fvc.a.a($$0);
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("bone", gqs.c(), gqp.a(0.0F, 5.0F, 0.0F));
      gqx $$3 = $$2.a(
         "body",
         gqs.c()
            .a(62, 68)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new gqr(0.0F))
            .a(62, 0)
            .a(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new gqr(0.5F))
            .a(87, 68)
            .a(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new gqr(0.0F)),
         gqp.a(0.0F, 0.0F, 0.0F)
      );
      $$2.a("right_front_leg", gqs.c().a(32, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(-7.5F, 10.0F, -15.0F));
      $$2.a("right_mid_leg", gqs.c().a(32, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(-7.5F, 10.0F, 0.0F));
      $$2.a("right_hind_leg", gqs.c().a(32, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(-7.5F, 10.0F, 15.0F));
      $$2.a("left_front_leg", gqs.c().a(0, 87).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(7.5F, 10.0F, -15.0F));
      $$2.a("left_mid_leg", gqs.c().a(0, 105).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(7.5F, 10.0F, 0.0F));
      $$2.a("left_hind_leg", gqs.c().a(0, 123).a(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new gqr(0.0F)), gqp.a(7.5F, 10.0F, 15.0F));
      gqx $$4 = $$3.a(
         "head",
         gqs.c().a(8, 15).a(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new gqr(0.0F)).a(8, 4).a(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new gqr(0.0F)),
         gqp.a(0.0F, 6.5F, -19.48F)
      );
      $$4.a("left_ear", gqs.c().a(2, 0).a(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gqr(0.0F)), gqp.a(6.51F, -7.5F, -4.51F));
      $$4.a("right_ear", gqs.c().a(48, 0).a(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new gqr(0.0F)), gqp.a(-6.51F, -7.5F, -4.51F));
      $$4.a("nose", gqs.c().a(10, 45).a(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new gqr(0.0F)), gqp.a(0.0F, -4.5F, -11.5F));
      $$4.a("lower_beak", gqs.c().a(10, 57).a(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new gqr(0.0F)), gqp.a(0.0F, 2.5F, -12.5F));
      return gqt.a($$0, 192, 192);
   }

   public void a(hmo $$0) {
      super.a($$0);
      this.d.e = $$0.ae * (float) (Math.PI / 180.0);
      this.d.f = $$0.ad * (float) (Math.PI / 180.0);
      if ($$0.a) {
         this.e.a($$0.ag, $$0.ah, 9.0F, 100.0F);
      } else {
         this.f.a($$0.ag, $$0.ah, 9.0F, 100.0F);
      }

      this.g.a($$0.b, $$0.v);
      this.i.a($$0.c, $$0.v);
      this.j.a($$0.d, $$0.v);
      this.k.a($$0.e, $$0.v);
      this.l.a($$0.f, $$0.v);
      if ($$0.am) {
         this.m.a();
      }
   }
}
