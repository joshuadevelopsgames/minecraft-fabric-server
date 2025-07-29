public class hdy extends hed<cpr, hkk> {
   private static final ame a = ame.b("textures/entity/end_crystal/end_crystal.png");
   private static final gxz h = gxz.g(a);
   private final gne i;

   public hdy(hee.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.i = new gne($$0.a(gqm.aU));
   }

   public void a(hkk $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(0.0F, -0.5F, 0.0F);
      this.i.a($$0);
      this.i.a($$1, $$2.getBuffer(h), $$3, hri.d);
      $$1.b();
      fis $$4 = $$0.b;
      if ($$4 != null) {
         float $$5 = a($$0.v);
         float $$6 = (float)$$4.d;
         float $$7 = (float)$$4.e;
         float $$8 = (float)$$4.f;
         $$1.a($$4);
         hdz.a(-$$6, -$$7 + $$5, -$$8, $$0.v, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static float a(float $$0) {
      float $$1 = bcb.a($$0 * 0.2F) / 2.0F + 0.5F;
      $$1 = ($$1 * $$1 + $$1) * 0.4F;
      return $$1 - 1.4F;
   }

   public hkk a() {
      return new hkk();
   }

   public void a(cpr $$0, hkk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.v = $$0.a + $$2;
      $$1.a = $$0.f();
      jb $$3 = $$0.e();
      if ($$3 != null) {
         $$1.b = fis.b($$3).d($$0.p($$2));
      } else {
         $$1.b = null;
      }
   }

   public boolean a(cpr $$0, hbq $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.e() != null;
   }
}
