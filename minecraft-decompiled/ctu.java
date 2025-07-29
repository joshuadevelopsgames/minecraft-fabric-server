import java.util.Arrays;

public enum ctu {
   a(0, ayz.Dk, ayz.Ds),
   b(40, ayz.Dj, ayz.Dt),
   c(80, ayz.Dl, ayz.Dt);

   private static final ctu[] d = ag.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final ayy f;
   private final ayy g;

   private ctu(final int $$0, final ayy $$1, final ayy $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public ayy b() {
      return this.f;
   }

   public ayy c() {
      return this.g;
   }

   public static ctu a(int $$0) {
      for (ctu $$1 : d) {
         if ($$0 >= $$1.e) {
            return $$1;
         }
      }

      return a;
   }

   public boolean d() {
      return this == c;
   }
}
