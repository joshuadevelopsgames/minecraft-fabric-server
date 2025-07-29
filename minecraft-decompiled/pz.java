import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

public interface pz<E, T> {
   pz<E, T> a(E var1);

   default pz<E, T> a(E... $$0) {
      return this.a(Arrays.stream($$0));
   }

   default pz<E, T> a(Collection<E> $$0) {
      $$0.forEach(this::a);
      return this;
   }

   default pz<E, T> a(Stream<E> $$0) {
      $$0.forEach(this::a);
      return this;
   }

   pz<E, T> b(E var1);

   pz<E, T> a(bae<T> var1);

   pz<E, T> b(bae<T> var1);

   static <T> pz<amd<T>, T> a(final bab $$0) {
      return new pz<amd<T>, T>() {
         public pz<amd<T>, T> a(amd<T> $$0x) {
            $$0.a($$0.a());
            return this;
         }

         public pz<amd<T>, T> b(amd<T> $$0x) {
            $$0.b($$0.a());
            return this;
         }

         @Override
         public pz<amd<T>, T> a(bae<T> $$0x) {
            $$0.c($$0.b());
            return this;
         }

         @Override
         public pz<amd<T>, T> b(bae<T> $$0x) {
            $$0.d($$0.b());
            return this;
         }
      };
   }

   default <U> pz<U, T> a(final Function<U, E> $$0) {
      final pz<E, T> $$1 = this;
      return new pz<U, T>() {
         @Override
         public pz<U, T> a(U $$0x) {
            $$1.a($$0.apply($$0));
            return this;
         }

         @Override
         public pz<U, T> b(U $$0x) {
            $$1.a($$0.apply($$0));
            return this;
         }

         @Override
         public pz<U, T> a(bae<T> $$0x) {
            $$1.a($$0);
            return this;
         }

         @Override
         public pz<U, T> b(bae<T> $$0x) {
            $$1.b($$0);
            return this;
         }
      };
   }
}
