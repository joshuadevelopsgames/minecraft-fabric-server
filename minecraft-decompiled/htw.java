import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.slf4j.Logger;

public class htw {
   private static final Logger a = LogUtils.getLogger();
   private static final alx b = alx.a("blockstates");

   public static CompletableFuture<htw.b> a(axo $$0, Executor $$1) {
      Function<ame, eec<dpz, eeb>> $$2 = htv.a();
      return CompletableFuture.<Map<ame, List<axm>>>supplyAsync(() -> b.b($$0), $$1).thenCompose($$2x -> {
         List<CompletableFuture<htw.b>> $$3 = new ArrayList<>($$2x.size());

         for (Entry<ame, List<axm>> $$4 : $$2x.entrySet()) {
            $$3.add(CompletableFuture.supplyAsync(() -> {
               ame $$2xx = b.b($$4.getKey());
               eec<dpz, eeb> $$3x = $$2.apply($$2xx);
               if ($$3x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$2xx);
                  return null;
               } else {
                  List<axm> $$4x = $$4.getValue();
                  List<htw.a> $$5 = new ArrayList<>($$4x.size());

                  for (axm $$6 : $$4x) {
                     try (Reader $$7 = $$6.e()) {
                        JsonElement $$8 = bcy.a($$7);
                        gza $$9 = (gza)gza.a.parse(JsonOps.INSTANCE, $$8).getOrThrow(JsonParseException::new);
                        $$5.add(new htw.a($$6.b(), $$9));
                     } catch (Exception var14) {
                        a.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$2xx, $$6.b(), var14});
                     }
                  }

                  try {
                     return a($$2xx, $$3x, $$5);
                  } catch (Exception var11) {
                     a.error("Failed to load blockstate definition {}", $$2xx, var11);
                     return null;
                  }
               }
            }, $$1));
         }

         return ag.d($$3).thenApply($$0xx -> {
            Map<eeb, gzc.c> $$1xx = new IdentityHashMap<>();

            for (htw.b $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new htw.b($$1xx);
         });
      });
   }

   private static htw.b a(ame $$0, eec<dpz, eeb> $$1, List<htw.a> $$2) {
      Map<eeb, gzc.c> $$3 = new IdentityHashMap<>();

      for (htw.a $$4 : $$2) {
         $$3.putAll($$4.b.a($$1, () -> $$0 + "/" + $$4.a));
      }

      return new htw.b($$3);
   }

   record a(String a, gza b) {
   }

   public record b(Map<eeb, gzc.c> a) {
   }
}
