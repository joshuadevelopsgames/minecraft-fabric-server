public class gnc extends gqd<hnh> {
   public gnc(gqn $$0) {
      super($$0);
   }

   public static gqt a(gqr $$0) {
      gqv $$1 = gnx.a($$0, 0.0F);
      gqx $$2 = $$1.a();
      $$2.a("left_arm", gqs.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gqp.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gqs.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gqp.a(1.9F, 12.0F, 0.0F));
      return gqt.a($$1, 64, 64);
   }

   @Override
   public void a(hnh $$0) {
      super.a($$0);
      if ($$0.h == gnx.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if ($$0.f == gnx.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.J;
      if ($$1 > 0.0F) {
         this.r.e = bcb.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * bcb.a(0.1F * $$0.v);
         this.s.e = bcb.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * bcb.a(0.1F * $$0.v);
         this.r.g = bcb.j($$1, this.r.g, -0.15F);
         this.s.g = bcb.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * bcb.a(0.1F * $$0.v);
         this.t.e = this.t.e + $$1 * 0.55F * bcb.a(0.1F * $$0.v);
         this.o.e = 0.0F;
      }
   }
}
