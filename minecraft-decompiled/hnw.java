import javax.annotation.Nullable;

public class hnw extends hns {
   private static final int a = 96;
   private static final float b = 5000.0F;
   private static int c = -1;
   private static int d = -1;
   private static long e = -1L;

   @Override
   public void a(hnl $$0, bzm $$1, jb $$2, grk $$3, float $$4, ftu $$5) {
      $$0.a = -8.0F;
      $$0.c = 96.0F;
      if ($$1 instanceof gwi $$6) {
         $$0.c = $$0.c * Math.max(0.25F, $$6.E());
         if ($$3.v($$2).a(azn.aa)) {
            $$0.c *= 0.85F;
         }
      }

      $$0.e = $$0.c;
      $$0.f = $$0.c;
   }

   @Override
   public boolean a(@Nullable fan $$0, bzm $$1) {
      return $$0 == fan.b;
   }

   @Override
   public int a(grk $$0, ftm $$1, int $$2, float $$3) {
      long $$4 = ag.c();
      int $$5 = $$0.v($$1.e()).a().k();
      if (e < 0L) {
         c = $$5;
         d = $$5;
         e = $$4;
      }

      float $$6 = bcb.a((float)($$4 - e) / 5000.0F, 0.0F, 1.0F);
      int $$7 = baj.a($$6, d, c);
      if (c != $$5) {
         c = $$5;
         d = $$7;
         e = $$4;
      }

      return $$7;
   }

   @Override
   public void d() {
      e = -1L;
   }
}
