public interface fnr<T> {
   fnr<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fnr<T> a() {
      return (fnr<T>)a;
   }

   T get();
}
