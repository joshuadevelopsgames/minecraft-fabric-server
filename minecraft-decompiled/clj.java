import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class clj {
   @Nullable
   public static fis a(cau $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, ToDoubleFunction<jb> $$3) {
      boolean $$4 = clh.a($$0, $$1);
      return clk.a(() -> {
         jb $$4x = clk.a($$0.ec(), $$1, $$2);
         jb $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, fis $$3) {
      fis $$4 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$5 = clh.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fis b(cau $$0, int $$1, int $$2, fis $$3) {
      fis $$4 = $$0.dv().d($$3);
      boolean $$5 = clh.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fis a(cau $$0, int $$1, int $$2, fis $$3, boolean $$4) {
      return clk.a($$0, () -> {
         jb $$5 = clk.a($$0.ec(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jb $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jb a(cau $$0, jb $$1) {
      $$1 = clk.a($$1, $$0.ai().ao(), $$1x -> clh.c($$0, $$1x));
      return !clh.a($$0, $$1) && !clh.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jb a(cau $$0, int $$1, boolean $$2, jb $$3) {
      jb $$4 = clk.a($$0, $$1, $$0.ec(), $$3);
      return !clh.a($$4, $$0) && !clh.a($$2, $$0, $$4) && !clh.a($$0.S(), $$4) ? $$4 : null;
   }
}
