import javax.annotation.Nullable;

public class cli {
   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = clh.a($$0, $$1);
      return clk.a($$0, () -> {
         jb $$9 = clk.a($$0.ec(), $$1, $$2, 0, $$3, $$4, $$5);
         if ($$9 == null) {
            return null;
         } else {
            jb $$10 = clj.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = clk.a($$10, $$0.ec().a($$6 - $$7 + 1) + $$7, $$0.ai().ao(), $$1xx -> clh.c($$0, $$1xx));
               return !clh.a($$0, $$10) && !clh.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}
