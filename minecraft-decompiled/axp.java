import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface axp extends axi {
   @Override
   default CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      return $$0.wait(bdk.a).thenRunAsync(() -> {
         btt $$1x = bts.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(axo var1);
}
