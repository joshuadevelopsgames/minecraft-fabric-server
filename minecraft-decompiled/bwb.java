import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bwb extends bvw<bwd.c> {
   public bwb(int $$0, Executor $$1, String $$2) {
      super(new bwd.a($$0), $$1, $$2);
      bve.a.a(this);
   }

   public bwd.c b(Runnable $$0) {
      return new bwd.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bwd.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
