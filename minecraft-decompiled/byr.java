import java.util.List;
import javax.annotation.Nullable;

public final class byr {
   public static xo a(byq $$0, float $$1, float $$2) {
      if ($$0.b()) {
         return xo.c("effect.duration.infinite");
      } else {
         int $$3 = bcb.d($$0.d() * $$1);
         return xo.b(bdb.a($$3, $$2));
      }
   }

   public static boolean a(cam $$0) {
      return $$0.d(bys.c) || $$0.d(bys.C);
   }

   public static int b(cam $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.d(bys.c)) {
         $$1 = $$0.e(bys.c).e();
      }

      if ($$0.d(bys.C)) {
         $$2 = $$0.e(bys.C).e();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(cam $$0) {
      return $$0.d(bys.m) || $$0.d(bys.C);
   }

   public static List<auc> a(aub $$0, @Nullable bzm $$1, fis $$2, double $$3, byq $$4, int $$5) {
      jl<byo> $$6 = $$4.c();
      List<auc> $$7 = $$0.a(
         $$6x -> $$6x.h.d()
            && ($$1 == null || !$$1.t($$6x))
            && $$2.a((jv)$$6x.dv(), $$3)
            && (!$$6x.d($$6) || $$6x.e($$6).e() < $$4.e() || $$6x.e($$6).a($$5 - 1))
      );
      $$7.forEach($$2x -> $$2x.b(new byq($$4), $$1));
      return $$7;
   }
}
