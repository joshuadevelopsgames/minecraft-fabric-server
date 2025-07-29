import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class htx {
   private static final Logger a = LogUtils.getLogger();
   private static final alx b = alx.a("items");

   public static CompletableFuture<htx.a> a(axo $$0, Executor $$1) {
      jz.b $$2 = grn.a().a();
      return CompletableFuture.<Map<ame, axm>>supplyAsync(() -> b.a($$0), $$1)
         .thenCompose(
            $$2x -> {
               List<CompletableFuture<htx.b>> $$3 = new ArrayList<>($$2x.size());
               $$2x.forEach(
                  ($$3x, $$4) -> $$3.add(
                     CompletableFuture.supplyAsync(
                        () -> {
                           ame $$3xx = b.b($$3x);

                           try {
                              htx.b var8;
                              try (Reader $$4x = $$4.e()) {
                                 bcg $$5 = new bcg($$2);
                                 DynamicOps<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
                                 hoa $$7 = hoa.a
                                    .parse($$6, bcy.a($$4x))
                                    .ifError(
                                       $$2xxxx -> a.error("Couldn't parse item model '{}' from pack '{}': {}", new Object[]{$$3xx, $$4.b(), $$2xxxx.message()})
                                    )
                                    .result()
                                    .map($$1xxxx -> $$5.b() ? $$1xxxx.a($$5.a()) : $$1xxxx)
                                    .orElse(null);
                                 var8 = new htx.b($$3xx, $$7);
                              }

                              return var8;
                           } catch (Exception var11) {
                              a.error("Failed to open item model {} from pack '{}'", new Object[]{$$3x, $$4.b(), var11});
                              return new htx.b($$3xx, null);
                           }
                        },
                        $$1
                     )
                  )
               );
               return ag.d($$3).thenApply($$0xx -> {
                  Map<ame, hoa> $$1xx = new HashMap<>();

                  for (htx.b $$2xx : $$0xx) {
                     if ($$2xx.b != null) {
                        $$1xx.put($$2xx.a, $$2xx.b);
                     }
                  }

                  return new htx.a($$1xx);
               });
            }
         );
   }

   public record a(Map<ame, hoa> a) {
   }

   record b(ame a, @Nullable hoa b) {
   }
}
