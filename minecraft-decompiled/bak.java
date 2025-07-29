import java.util.function.Consumer;

@FunctionalInterface
public interface bak<T> {
   bak.a accept(T var1);

   static <T> bak<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return bak.a.a;
      };
   }

   public static enum a {
      a,
      b;

      public boolean a() {
         return this == b;
      }
   }
}
