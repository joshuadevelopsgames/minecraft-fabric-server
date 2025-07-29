import java.util.function.IntFunction;

public enum cou {
   a(0),
   b(1),
   c(2),
   d(3),
   e(4);

   private static final IntFunction<cou> f = baq.a(cou::a, values(), baq.a.b);
   private final int g;

   private cou(final int $$0) {
      this.g = $$0;
   }

   public int a() {
      return this.g;
   }

   public static cou a(int $$0) {
      return f.apply($$0);
   }
}
