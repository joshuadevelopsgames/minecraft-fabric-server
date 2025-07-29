import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dqx {
   fjm z_ = dpz.b(14.0, 0.0, 16.0);
   ees A_ = eer.b;

   static bxj a(@Nullable bzm $$0, eeb $$1, dmu $$2, jb $$3) {
      if ($$1.c(A_)) {
         dpz.a($$2, $$3, new dcv(dcz.yb, 1));
         float $$4 = bcb.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, ayz.ei, aza.e, 1.0F, $$4);
         eeb $$5 = $$1.b(A_, false);
         $$2.a($$3, $$5, 2);
         $$2.a(ejb.c, $$3, ejb.a.a($$0, $$5));
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   static boolean j_(eeb $$0) {
      return $$0.b(A_) && $$0.c(A_);
   }

   static ToIntFunction<eeb> i_(int $$0) {
      return $$1 -> $$1.c(eer.b) ? $$0 : 0;
   }
}
