@FunctionalInterface
public interface alw<T, V> {
   V get(amd<T> var1);

   static <T, V> alw<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
