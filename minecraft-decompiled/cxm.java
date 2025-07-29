import java.util.function.Function;
import javax.annotation.Nullable;

public class cxm {
   public static int[][] a(jh $$0) {
      jh $$1 = $$0.h();
      jh $$2 = $$1.g();
      jh $$3 = $$0.g();
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$2.j(), $$2.l()},
         {$$3.j() + $$1.j(), $$3.l() + $$1.l()},
         {$$3.j() + $$2.j(), $$3.l() + $$2.l()},
         {$$0.j() + $$1.j(), $$0.l() + $$1.l()},
         {$$0.j() + $$2.j(), $$0.l() + $$2.l()},
         {$$3.j(), $$3.l()},
         {$$0.j(), $$0.l()}
      };
   }

   public static boolean a(double $$0) {
      return !Double.isInfinite($$0) && $$0 < 1.0;
   }

   public static boolean a(dmc $$0, cam $$1, fin $$2) {
      for (fjm $$4 : $$0.e($$1, $$2)) {
         if (!$$4.c()) {
            return false;
         }
      }

      return $$0.F_().a($$2);
   }

   public static boolean a(dmc $$0, fis $$1, cam $$2, cay $$3) {
      return a($$0, $$2, $$2.f($$3).c($$1));
   }

   public static fjm a(dly $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return !$$2.a(azo.aV) && (!($$2.b() instanceof dzb) || !$$2.c(dzb.b)) ? $$2.g($$0, $$1) : fjj.a();
   }

   public static double a(jb $$0, int $$1, Function<jb, fjm> $$2) {
      jb.a $$3 = $$0.k();
      int $$4 = 0;

      while ($$4 < $$1) {
         fjm $$5 = $$2.apply($$3);
         if (!$$5.c()) {
            return $$0.v() + $$4 + $$5.b(jh.a.b);
         }

         $$4++;
         $$3.c(jh.b);
      }

      return Double.POSITIVE_INFINITY;
   }

   @Nullable
   public static fis a(bzv<?> $$0, dmc $$1, jb $$2, boolean $$3) {
      if ($$3 && $$0.a($$1.a_($$2))) {
         return null;
      } else {
         double $$4 = $$1.a(a((dly)$$1, $$2), () -> a((dly)$$1, $$2.e()));
         if (!a($$4)) {
            return null;
         } else if ($$3 && $$4 <= 0.0 && $$0.a($$1.a_($$2.e()))) {
            return null;
         } else {
            fis $$5 = fis.a($$2, $$4);
            fin $$6 = $$0.n().a($$5);

            for (fjm $$8 : $$1.e(null, $$6)) {
               if (!$$8.c()) {
                  return null;
               }
            }

            if ($$0 != bzv.bU || !$$1.a_($$2).a(azo.cy) && !$$1.a_($$2.d()).a(azo.cy)) {
               return !$$1.F_().a($$6) ? null : $$5;
            } else {
               return null;
            }
         }
      }
   }
}
