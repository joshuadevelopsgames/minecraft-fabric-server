import java.util.Optional;

public interface jm<T> {
   Optional<jl.c<T>> a(amd<T> var1);

   default jl.c<T> b(amd<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
   }

   Optional<jp.c<T>> a(bae<T> var1);

   default jp.c<T> b(bae<T> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + $$0));
   }

   public interface a {
      <T> Optional<? extends jm<T>> a(amd<? extends jy<? extends T>> var1);

      default <T> jm<T> b(amd<? extends jy<? extends T>> $$0) {
         return (jm<T>)this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <T> Optional<jl.c<T>> c(amd<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
      }

      default <T> jl.c<T> d(amd<T> $$0) {
         return this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + $$0));
      }
   }
}
