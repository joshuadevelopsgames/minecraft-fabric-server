import java.util.Optional;

public class efh {
   private static final bcn a = new bcn(4);
   private static final int b = a.a();
   private static final int c = 0;
   private static final int d = 4;
   private static final int e = 8;
   private static final int f = 12;

   public static int a() {
      return b;
   }

   public static int a(jh $$0) {
      return a.a($$0);
   }

   public static int a(float $$0) {
      return a.b($$0);
   }

   public static Optional<jh> a(int $$0) {
      jh $$1 = switch ($$0) {
         case 0 -> jh.c;
         case 4 -> jh.f;
         case 8 -> jh.d;
         case 12 -> jh.e;
         default -> null;
      };
      return Optional.ofNullable($$1);
   }

   public static float b(int $$0) {
      return a.b($$0);
   }
}
