public class hnp extends hnu {
   @Override
   public jl<byo> a() {
      return bys.o;
   }

   @Override
   public void a(hnl $$0, bzm $$1, jb $$2, grk $$3, float $$4, ftu $$5) {
      if ($$1 instanceof cam $$6) {
         byq $$7 = $$6.e(this.a());
         if ($$7 != null) {
            float $$8 = $$7.b() ? 5.0F : bcb.h(Math.min(1.0F, $$7.d() / 20.0F), $$4, 5.0F);
            $$0.a = $$8 * 0.25F;
            $$0.c = $$8;
            $$0.e = $$8 * 0.8F;
            $$0.f = $$8 * 0.8F;
         }
      }
   }

   @Override
   public float a(cam $$0, float $$1, float $$2) {
      byq $$3 = $$0.e(this.a());
      if ($$3 != null) {
         if ($$3.a(19)) {
            $$1 = Math.max($$3.d() / 20.0F, $$1);
         } else {
            $$1 = 1.0F;
         }
      }

      return $$1;
   }
}
