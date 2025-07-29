import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class huh implements axi, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alx b = alx.a("models");
   private static final Map<ame, ame> c = Map.of(
      gyi.c, hts.b, gyi.b, hts.c, gyi.f, hts.e, gyi.d, hts.k, gyi.e, hts.m, gyi.a, hts.l, gyi.g, hts.a, gyi.h, hts.f, hrr.c, hts.d
   );
   private Map<ame, hoe> d = Map.of();
   private Map<ame, hoa.a> e = Map.of();
   private final htt f;
   private final gyr g;
   private final fvi h;
   private gqj i = gqj.a;
   private gyk j = gyk.a;
   private int k;
   private hud.b l;
   private Object2IntMap<eeb> m = Object2IntMaps.emptyMap();

   public huh(hru $$0, fvi $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gyr(this);
      this.f = new htt(c, $$0);
   }

   public gzc a() {
      return this.l.a();
   }

   public hoe a(ame $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hoa.a b(ame $$0) {
      return this.e.getOrDefault($$0, hoa.a.a);
   }

   public gyr b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      CompletableFuture<gqj> $$4 = CompletableFuture.supplyAsync(gqj::a, $$2);
      CompletableFuture<gyk> $$5 = $$4.thenApplyAsync(gyk::a, $$2);
      CompletableFuture<Map<ame, huo>> $$6 = a($$1, $$2);
      CompletableFuture<htw.b> $$7 = htw.a($$1, $$2);
      CompletableFuture<htx.a> $$8 = htx.a($$1, $$2);
      CompletableFuture<huh.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<eeb>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<ame, CompletableFuture<htt.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<ame, htt.b> $$10x = ag.a($$11, CompletableFuture::join);
            huh.b $$11x = $$9.join();
            Object2IntMap<eeb> $$12 = $$10.join();
            Set<ame> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hud $$14 = new hud($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, bts.a()), $$3);
   }

   private static CompletableFuture<Map<ame, huo>> a(axo $$0, Executor $$1) {
      return CompletableFuture.<Map<ame, axm>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ame, gyz>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ame, axm> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ame $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gyz.a($$2x));
                  }

                  return var3;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return ag.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static huh.b a(Map<ame, huo> $$0, htw.b $$1, htx.a $$2) {
      huh.b var5;
      try (bty $$3 = bts.a().d("dependencies")) {
         huf $$4 = new huf($$0, hub.a());
         $$4.a(gze.a, new gze());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new huh.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<huh.a> a(final Map<ame, htt.b> $$0, hud $$1, Object2IntMap<eeb> $$2, gqj $$3, gyk $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(htt.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hua> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hum() {
            private final hrs d = $$0.get(hrr.c).a();

            @Override
            public hrs a(hua $$0x, hue $$1x) {
               htt.b $$2x = $$0.get($$0.a());
               hrs $$3x = $$2x.a($$0.b());
               if ($$3x != null) {
                  return $$3x;
               } else {
                  $$7.put($$1x.debugName(), $$0);
                  return $$2x.a();
               }
            }

            @Override
            public hrs a(String $$0x, hue $$1x) {
               $$8.put($$1x.debugName(), $$0);
               return this.d;
            }
         }, $$5)
         .thenApply(
            $$7x -> {
               $$7.asMap()
                  .forEach(
                     ($$0xx, $$1xx) -> a.warn(
                        "Missing textures in model {}:\n{}",
                        $$0xx,
                        $$1xx.stream().sorted(hua.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
                     )
                  );
               $$8.asMap()
                  .forEach(
                     ($$0xx, $$1xx) -> a.warn(
                        "Missing texture references in model {}:\n{}",
                        $$0xx,
                        $$1xx.stream().sorted().map($$0xxx -> "    " + $$0xxx).collect(Collectors.joining("\n"))
                     )
                  );
               Map<eeb, gzc> $$8x = a($$7x.b(), $$7x.a().a());
               return new huh.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<eeb, gzc> a(Map<eeb, gzc> $$0, gzc $$1) {
      Object var8;
      try (bty $$2 = bts.a().d("block state dispatch")) {
         Map<eeb, gzc> $$3 = new IdentityHashMap<>($$0);

         for (dpz $$4 : mm.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<eeb, gzc>)var8;
   }

   private static Object2IntMap<eeb> a(fvi $$0, htw.b $$1) {
      Object2IntMap var3;
      try (bty $$2 = bts.a().d("block groups")) {
         var3 = hug.a($$0, $$1);
      }

      return var3;
   }

   private void a(huh.a $$0, btt $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(htt.b::c);
      hud.a $$2 = $$0.a;
      this.d = $$2.c();
      this.e = $$2.d();
      this.m = $$0.b;
      this.l = $$2.a();
      $$1.b("cache");
      this.g.a($$0.c);
      this.j = $$0.f;
      this.i = $$0.e;
      $$1.c();
   }

   public boolean a(eeb $$0, eeb $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               fal $$4 = $$0.y();
               fal $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hrr c(ame $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gyk> c() {
      return () -> this.j;
   }

   public Supplier<gqj> d() {
      return () -> this.i;
   }

   record a(hud.a a, Object2IntMap<eeb> b, Map<eeb, gzc> c, Map<ame, htt.b> d, gqj e, gyk f, CompletableFuture<Void> g) {
   }

   record b(hul a, Map<ame, hul> b) {
   }
}
