import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class hwt {
   private final axr a;
   private final Map<ame, CompletableFuture<flm>> b = Maps.newHashMap();

   public hwt(axr $$0) {
      this.a = $$0;
   }

   public CompletableFuture<flm> a(ame $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> CompletableFuture.supplyAsync(() -> {
         try {
            flm var5;
            try (
               InputStream $$1 = this.a.open($$0x);
               hwn $$2 = new hwp($$1);
            ) {
               ByteBuffer $$3 = $$2.b();
               var5 = new flm($$3, $$2.a());
            }

            return var5;
         } catch (IOException var10) {
            throw new CompletionException(var10);
         }
      }, ag.j()));
   }

   public CompletableFuture<hwk> a(ame $$0, boolean $$1) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            InputStream $$2 = this.a.open($$0);
            return (hwk)($$1 ? new hwq(hwp::new, $$2) : new hwp($$2));
         } catch (IOException var4) {
            throw new CompletionException(var4);
         }
      }, ag.j());
   }

   public void a() {
      this.b.values().forEach($$0 -> $$0.thenAccept(flm::b));
      this.b.clear();
   }

   public CompletableFuture<?> a(Collection<hvo> $$0) {
      return CompletableFuture.allOf($$0.stream().map($$0x -> this.a($$0x.b())).toArray(CompletableFuture[]::new));
   }
}
