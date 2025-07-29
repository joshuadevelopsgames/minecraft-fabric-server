public class gqa extends gnh<hnd> implements gnt, gpv {
   protected final gqn a;
   private final gqn b;
   private final gqn c;
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;

   public gqa(gqn $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
      this.g = $$0.b("arms");
   }

   public static gqt a() {
      gqv $$0 = gpw.a();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("head", gqs.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gqp.a);
      gqx $$3 = $$2.a("hat", gqs.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gqp.a(-5.0F, -10.03125F, -5.0F));
      gqx $$4 = $$3.a("hat2", gqs.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gqp.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      gqx $$5 = $$4.a("hat3", gqs.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gqp.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gqs.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gqr(0.25F)), gqp.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      gqx $$6 = $$2.b("nose");
      $$6.a("mole", gqs.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gqr(-0.25F)), gqp.a(0.0F, -2.0F, 0.0F));
      return gqt.a($$0, 64, 128);
   }

   public void a(hnd $$0) {
      super.a($$0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.e.e = bcb.b($$0.ag * 0.6662F) * 1.4F * $$0.ah * 0.5F;
      this.f.e = bcb.b($$0.ag * 0.6662F + (float) Math.PI) * 1.4F * $$0.ah * 0.5F;
      float $$1 = 0.01F * ($$0.a % 10);
      this.a.e = bcb.a($$0.v * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = bcb.b($$0.v * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public gqn c() {
      return this.a;
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
