import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class axt<T> implements axi {
   @Override
   public final CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bts.a()), $$2)
         .thenCompose($$0::wait)
         .thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bts.a()), $$3);
   }

   protected abstract T b(axo var1, btt var2);

   protected abstract void a(T var1, axo var2, btt var3);
}
