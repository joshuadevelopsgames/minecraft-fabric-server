public class hll extends hkn {
   public final hoh a = new hoh();
   public int b;
   public int c;

   public void a(bzm $$0, dcv $$1, hof $$2) {
      $$2.a(this.a, $$1, dct.h, $$0);
      this.b = a($$1.M());
      this.c = a($$1);
   }

   public static int a(dcv $$0) {
      return $$0.f() ? 187 : dcr.a($$0.h()) + $$0.o();
   }

   public static int a(int $$0) {
      if ($$0 <= 1) {
         return 1;
      } else if ($$0 <= 16) {
         return 2;
      } else if ($$0 <= 32) {
         return 3;
      } else {
         return $$0 <= 48 ? 4 : 5;
      }
   }
}
