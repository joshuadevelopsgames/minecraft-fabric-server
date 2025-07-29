import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface cyz {
   cyz a = new cyz() {
      @Override
      public <T> Optional<T> a(BiFunction<dmu, jb, T> $$0) {
         return Optional.empty();
      }
   };

   static cyz a(final dmu $$0, final jb $$1) {
      return new cyz() {
         @Override
         public <T> Optional<T> a(BiFunction<dmu, jb, T> $$0x) {
            return Optional.of($$0.apply($$0, $$1));
         }
      };
   }

   <T> Optional<T> a(BiFunction<dmu, jb, T> var1);

   default <T> T a(BiFunction<dmu, jb, T> $$0, T $$1) {
      return this.a($$0).orElse($$1);
   }

   default void a(BiConsumer<dmu, jb> $$0) {
      this.a(($$1, $$2) -> {
         $$0.accept($$1, $$2);
         return Optional.empty();
      });
   }
}
