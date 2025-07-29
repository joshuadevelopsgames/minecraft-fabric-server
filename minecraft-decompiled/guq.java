public class guq extends gut {
   private final gof a;
   private final gxz b = gxz.j(hdx.a);

   guq(grk $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new gnq(fue.R().aT().a(gqm.aO));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public gux b() {
      return gux.d;
   }

   @Override
   public void a(fod $$0, gxn $$1, ftm $$2, float $$3) {
      float $$4 = (this.s + $$3) / this.t;
      float $$5 = 0.05F + 0.5F * bcb.a($$4 * (float) Math.PI);
      int $$6 = baj.a($$5, 1.0F, 1.0F, 1.0F);
      $$0.a();
      $$0.a($$2.h());
      $$0.a(a.b.rotationDegrees(60.0F - 150.0F * $$4));
      float $$7 = 0.42553192F;
      $$0.b(0.42553192F, -0.42553192F, -0.42553192F);
      $$0.a(0.0F, -0.56F, 3.5F);
      fog $$8 = $$1.getBuffer(this.b);
      this.a.a($$0, $$8, 15728880, hri.d, $$6);
      $$0.b();
   }

   @Override
   public void a(fog $$0, ftm $$1, float $$2) {
   }

   public static class a implements guw<mi> {
      public gut a(mi $$0, grk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new guq($$1, $$2, $$3, $$4);
      }
   }
}
