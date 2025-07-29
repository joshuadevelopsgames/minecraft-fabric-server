import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public abstract class pu<T> extends qa<T> {
   private final Function<T, amd<T>> d;

   public pu(mv $$0, amd<? extends jy<T>> $$1, CompletableFuture<jn.a> $$2, Function<T, amd<T>> $$3) {
      super($$0, $$1, $$2);
      this.d = $$3;
   }

   public pu(mv $$0, amd<? extends jy<T>> $$1, CompletableFuture<jn.a> $$2, CompletableFuture<qa.b<T>> $$3, Function<T, amd<T>> $$4) {
      super($$0, $$1, $$2, $$3);
      this.d = $$4;
   }

   protected pz<T, T> a(bae<T> $$0) {
      bab $$1 = this.b($$0);
      return pz.<T>a($$1).a(this.d);
   }
}
