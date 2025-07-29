import java.util.Optional;
import java.util.stream.Stream;

public interface eg extends jn.a {
   static eg a(final jn.a $$0, final cyd $$1) {
      return new eg() {
         @Override
         public Stream<amd<? extends jy<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jn.b<T>> a(amd<? extends jy<? extends T>> $$0x) {
            return $$0.a($$0).map($$1xx -> $$1xx.a($$1));
         }

         @Override
         public cyd a() {
            return $$1;
         }
      };
   }

   cyd a();
}
