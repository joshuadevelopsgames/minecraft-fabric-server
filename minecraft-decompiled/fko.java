import com.mojang.serialization.Codec;

public enum fko {
   a(-3),
   b(-2),
   c(-1),
   d(0),
   e(1),
   f(2),
   g(3);

   public static final Codec<fko> h = Codec.INT.xmap(fko::a, fko::a);
   private final int i;

   private fko(final int $$0) {
      this.i = $$0;
   }

   public static fko a(int $$0) {
      for (fko $$1 : values()) {
         if ($$1.i == $$0) {
            return $$1;
         }
      }

      return $$0 < a.i ? a : g;
   }

   public int a() {
      return this.i;
   }
}
