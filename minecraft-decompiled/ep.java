public interface ep {
   boolean c(int var1);

   default boolean c_() {
      return this.c(2);
   }

   public record a<T extends ep>(int a) implements aph<T> {
      public boolean a(T $$0) {
         return $$0.c(this.a);
      }
   }
}
