import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@FunctionalInterface
public interface axi {
   CompletableFuture<Void> reload(axi.a var1, axo var2, Executor var3, Executor var4);

   default String getName() {
      return this.getClass().getSimpleName();
   }

   @FunctionalInterface
   public interface a {
      <T> CompletableFuture<T> wait(T var1);
   }
}
