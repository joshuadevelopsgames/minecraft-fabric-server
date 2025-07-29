public class hfp extends hed<cas, hll> {
   private static final float a = 40.0F;
   private static final int h = 50;
   private final hof i;
   private final bck j = bck.a();

   protected hfp(hee.a $$0) {
      super($$0);
      this.i = $$0.b();
   }

   public hll a() {
      return new hll();
   }

   public void a(cas $$0, hll $$1, float $$2) {
      super.a($$0, $$1, $$2);
      dcv $$3 = $$0.f();
      $$1.a($$0, $$3, this.i);
   }

   public void a(hll $$0, fod $$1, gxn $$2, int $$3) {
      if (!$$0.a.e()) {
         $$1.a();
         if ($$0.v <= 50.0F) {
            float $$4 = Math.min($$0.v, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = bcb.h($$0.v * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         hfb.a($$1, $$2, 15728880, $$0, this.j);
         $$1.b();
      }
   }
}
