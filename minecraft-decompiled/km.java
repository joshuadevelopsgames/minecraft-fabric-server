import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface km extends kl {
   kn a();

   @Nullable
   @Override
   default <T> T a(kp<? extends T> $$0) {
      return this.a().a($$0);
   }

   default <T> Stream<T> a(Class<? extends T> $$0) {
      return this.a().c().map(ks::b).filter($$1 -> $$0.isAssignableFrom($$1.getClass())).map($$0x -> (T)$$0x);
   }

   @Override
   default <T> T a(kp<? extends T> $$0, T $$1) {
      return this.a().a($$0, $$1);
   }

   default boolean c(kp<?> $$0) {
      return this.a().c($$0);
   }
}
