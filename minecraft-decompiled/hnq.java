public class hnq extends hnu {
   @Override
   public jl<byo> a() {
      return bys.G;
   }

   @Override
   public void a(hnl $$0, bzm $$1, jb $$2, grk $$3, float $$4, ftu $$5) {
      if ($$1 instanceof cam $$6) {
         byq $$7 = $$6.e(this.a());
         if ($$7 != null) {
            float $$8 = bcb.h($$7.a($$6, $$5.a(false)), $$4, 15.0F);
            $$0.a = $$8 * 0.75F;
            $$0.c = $$8;
            $$0.e = $$8;
            $$0.f = $$8;
         }
      }
   }

   @Override
   public float a(cam $$0, float $$1, float $$2) {
      byq $$3 = $$0.e(this.a());
      return $$3 != null ? Math.max($$3.a($$0, $$2), $$1) : $$1;
   }
}
