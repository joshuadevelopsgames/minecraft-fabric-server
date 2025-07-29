import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ams implements axi {
   private static final Logger b = LogUtils.getLogger();
   public static final amd<jy<ib<ek>>> a = amd.a(ame.b("function"));
   private static final alx c = new alx(mn.c(a), ".mcfunction");
   private volatile Map<ame, ib<ek>> d = ImmutableMap.of();
   private final baf<ib<ek>> e = new baf<>(($$0x, $$1x) -> this.a($$0x), mn.d(a));
   private volatile Map<ame, List<ib<ek>>> f = Map.of();
   private final int g;
   private final CommandDispatcher<ek> h;

   public Optional<ib<ek>> a(ame $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Map<ame, ib<ek>> a() {
      return this.d;
   }

   public List<ib<ek>> b(ame $$0) {
      return this.f.getOrDefault($$0, List.of());
   }

   public Iterable<ame> b() {
      return this.f.keySet();
   }

   public ams(int $$0, CommandDispatcher<ek> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      CompletableFuture<Map<ame, List<baf.b>>> $$4 = CompletableFuture.supplyAsync(() -> this.e.a($$1), $$2);
      CompletableFuture<Map<ame, CompletableFuture<ib<ek>>>> $$5 = CompletableFuture.<Map<ame, axm>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         Map<ame, CompletableFuture<ib<ek>>> $$2x = Maps.newHashMap();
         ek $$3x = new ek(ej.a, fis.c, fir.a, null, this.g, "", xn.a, null, null);

         for (Entry<ame, axm> $$4x : $$1x.entrySet()) {
            ame $$5x = $$4x.getKey();
            ame $$6 = c.b($$5x);
            $$2x.put($$6, CompletableFuture.supplyAsync(() -> {
               List<String> $$3xx = a($$4x.getValue());
               return ib.a($$6, this.h, $$3x, $$3xx);
            }, $$2));
         }

         CompletableFuture<?>[] $$7 = $$2x.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf($$7).handle(($$1xx, $$2xx) -> $$2x);
      });
      return $$4.thenCombine($$5, Pair::of).thenCompose($$0::wait).thenAcceptAsync($$0x -> {
         Map<ame, CompletableFuture<ib<ek>>> $$1x = (Map<ame, CompletableFuture<ib<ek>>>)$$0x.getSecond();
         Builder<ame, ib<ek>> $$2x = ImmutableMap.builder();
         $$1x.forEach(($$1xx, $$2xx) -> $$2xx.handle(($$2xxx, $$3x) -> {
            if ($$3x != null) {
               b.error("Failed to load function {}", $$1xx, $$3x);
            } else {
               $$2x.put($$1xx, $$2xxx);
            }

            return null;
         }).join());
         this.d = $$2x.build();
         this.f = this.e.a((Map<ame, List<baf.b>>)$$0x.getFirst());
      }, $$3);
   }

   private static List<String> a(axm $$0) {
      try {
         List var2;
         try (BufferedReader $$1 = $$0.e()) {
            var2 = $$1.lines().toList();
         }

         return var2;
      } catch (IOException var6) {
         throw new CompletionException(var6);
      }
   }
}
