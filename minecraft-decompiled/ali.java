public interface ali<T> {
   zm<? super wx, T> codec();

   default alh<T> a(int $$0) {
      return new alh<>($$0, this);
   }

   T copy(T var1);

   static <T> ali<T> a(zm<? super wx, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ali<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
