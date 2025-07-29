import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class hsw implements axi, AutoCloseable {
   private final hrr a;
   private final ame b;
   private final Set<awo<?>> c;

   public hsw(hru $$0, ame $$1, ame $$2) {
      this($$0, $$1, $$2, hrn.a);
   }

   public hsw(hru $$0, ame $$1, ame $$2, Set<awo<?>> $$3) {
      this.b = $$2;
      this.a = new hrr($$1);
      $$0.a(this.a.f(), this.a);
      this.c = $$3;
   }

   protected hrs a(ame $$0) {
      return this.a.a($$0);
   }

   @Override
   public final CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      return hrn.a(this.a).a($$1, this.b, 0, $$2, this.c).thenCompose(hrn.a::a).thenCompose($$0::wait).thenAcceptAsync(this::a, $$3);
   }

   private void a(hrn.a $$0) {
      try (bty $$1 = bts.a().d("upload")) {
         this.a.a($$0);
      }
   }

   @Override
   public void close() {
      this.a.e();
   }
}
