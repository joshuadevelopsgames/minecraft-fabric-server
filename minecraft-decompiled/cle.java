import javax.annotation.Nullable;

public class cle {
   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = clh.a($$0, $$1);
      return clk.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jb a(cau $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jb $$8 = clk.a($$0.ec(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jb $$9 = clk.a($$0, $$1, $$0.ec(), $$8);
         if (!clh.a($$9, $$0) && !clh.a($$7, $$0, $$9)) {
            $$9 = clk.a($$9, $$0.ai().ao(), $$1x -> clh.c($$0, $$1x));
            return clh.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
