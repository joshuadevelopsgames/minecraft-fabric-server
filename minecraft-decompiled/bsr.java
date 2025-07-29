import java.util.Optional;
import javax.annotation.Nullable;

public interface bsr<S> {
   bst a();

   bso<S> b();

   default <T> Optional<T> b(bsq<S, T> $$0) {
      T $$1 = this.a($$0);
      if ($$1 != null) {
         this.b().a(this.g());
      }

      if (!this.a().g()) {
         throw new IllegalStateException("Malformed scope: " + this.a());
      } else {
         return Optional.ofNullable($$1);
      }
   }

   @Nullable
   <T> T a(bsq<S, T> var1);

   S f();

   int g();

   void a(int var1);

   bsl c();

   void d();

   bsr<S> e();
}
