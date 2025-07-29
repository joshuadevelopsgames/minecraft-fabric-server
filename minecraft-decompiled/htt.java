import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class htt implements AutoCloseable {
   private final Map<ame, htt.a> a;

   public htt(Map<ame, ame> $$0, hru $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hrr $$2 = new hrr((ame)$$1x.getKey());
         $$1.a((ame)$$1x.getKey(), $$2);
         return new htt.a($$2, (ame)$$1x.getValue());
      }));
   }

   public hrr a(ame $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(htt.a::close);
      this.a.clear();
   }

   public Map<ame, CompletableFuture<htt.b>> a(axo $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super htt.a, CompletableFuture<htt.b>>)($$3 -> hrn.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new htt.b($$3.a, $$1xx)))
      );
   }

   record a(hrr a, ame b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.e();
      }
   }

   public static class b {
      private final hrr a;
      private final hrn.a b;

      public b(hrr $$0, hrn.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hrs a(ame $$0) {
         return this.b.f().get($$0);
      }

      public hrs a() {
         return this.b.e();
      }

      public CompletableFuture<Void> b() {
         return this.b.g();
      }

      public void c() {
         this.a.a(this.b);
      }
   }
}
