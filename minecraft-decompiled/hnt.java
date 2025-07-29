import javax.annotation.Nullable;

public class hnt extends hns {
   private static final int a = -6743808;

   @Override
   public int a(grk $$0, ftm $$1, int $$2, float $$3) {
      return -6743808;
   }

   @Override
   public void a(hnl $$0, bzm $$1, jb $$2, grk $$3, float $$4, ftu $$5) {
      if ($$1.am()) {
         $$0.a = -8.0F;
         $$0.c = $$4 * 0.5F;
      } else if ($$1 instanceof cam $$6 && $$6.d(bys.l)) {
         $$0.a = 0.0F;
         $$0.c = 5.0F;
      } else {
         $$0.a = 0.25F;
         $$0.c = 1.0F;
      }

      $$0.e = $$0.c;
      $$0.f = $$0.c;
   }

   @Override
   public boolean a(@Nullable fan $$0, bzm $$1) {
      return $$0 == fan.a;
   }
}
