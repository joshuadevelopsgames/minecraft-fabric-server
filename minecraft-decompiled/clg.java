import javax.annotation.Nullable;

public class clg {
   @Nullable
   public static fis a(cau $$0, int $$1, int $$2) {
      boolean $$3 = clh.a($$0, $$1);
      return clk.a($$0, () -> {
         jb $$4 = clk.a($$0.ec(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, fis $$3, double $$4) {
      fis $$5 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$6 = clh.a($$0, $$1);
      return clk.a($$0, () -> {
         jb $$6x = clk.a($$0.ec(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fis a(cau $$0, int $$1, int $$2, fis $$3) {
      fis $$4 = $$0.dv().d($$3);
      boolean $$5 = clh.a($$0, $$1);
      return clk.a($$0, () -> {
         jb $$5x = clk.a($$0.ec(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jb a(cau $$0, int $$1, boolean $$2, jb $$3) {
      jb $$4 = clk.a($$0, $$1, $$0.ec(), $$3);
      return !clh.a($$4, $$0) && !clh.a($$2, $$0, $$4) && !clh.a($$0.S(), $$4) && !clh.b($$0, $$4) ? $$4 : null;
   }
}
