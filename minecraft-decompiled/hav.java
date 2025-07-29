public class hav extends haw<ecv> {
   private static final ame c = ame.b("textures/entity/end_gateway_beam.png");

   public hav(had.a $$0) {
      super($$0);
   }

   public void a(ecv $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      if ($$0.a() || $$0.c()) {
         float $$7 = $$0.a() ? $$0.a($$1) : $$0.b($$1);
         double $$8 = $$0.a() ? $$0.i().ao() : 50.0;
         $$7 = bcb.a($$7 * (float) Math.PI);
         int $$9 = bcb.a($$7 * $$8);
         int $$10 = $$0.a() ? dbt.c.d() : dbt.k.d();
         long $$11 = $$0.i().ae();
         gzy.a($$2, $$3, c, $$1, $$7, $$11, -$$9, $$9 * 2, $$10, 0.15F, 0.175F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected float c() {
      return 1.0F;
   }

   @Override
   protected float d() {
      return 0.0F;
   }

   @Override
   protected gxz e() {
      return gxz.u();
   }

   @Override
   public int aZ_() {
      return 256;
   }
}
