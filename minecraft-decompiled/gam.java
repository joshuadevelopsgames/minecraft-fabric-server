import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gam implements axi, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ame a = ame.b("missing");
   private static final alx d = alx.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final gao f;
   private final List<flq> g = new ArrayList<>();
   private final Map<ame, gao> h = new HashMap<>();
   private final hru i;
   @Nullable
   private volatile gao j;

   public gam(hru $$0) {
      this.i = $$0;
      this.f = ag.a(new gao($$0, a), $$0x -> $$0x.a(List.of(c()), Set.of()));
   }

   private static flq.a c() {
      return new flq.a(new gak(), gan.a.b);
   }

   @Override
   public CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::wait).thenAcceptAsync($$0x -> this.a($$0x, bts.a()), $$3);
   }

   private CompletableFuture<gam.d> a(axo $$0, Executor $$1) {
      List<CompletableFuture<gam.e>> $$2 = new ArrayList<>();

      for (Entry<ame, List<axm>> $$3 : d.b($$0).entrySet()) {
         ame $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<gam.a, gaz.a>> $$4x = a($$3.getValue(), $$4);
            gam.e $$5 = new gam.e($$4);

            for (Pair<gam.a, gaz.a> $$6 : $$4x) {
               gam.a $$7 = (gam.a)$$6.getFirst();
               gan.a $$8 = ((gaz.a)$$6.getSecond()).b();
               ((gaz.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<flq>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ag.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<flq>>> $$2x = $$1x.stream().flatMap(gam.e::d).collect(ag.b());
               flq.a $$3x = c();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ag.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ame, List<flq.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<flq> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new gam.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<flq>> a(gam.a $$0, gaz.b $$1, axo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ame, List<flq.a>> a(List<gam.e> $$0) {
      Map<ame, List<flq.a>> $$1 = new HashMap<>();
      bbe<ame, gam.e> $$2 = new bbe<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<flq.a> $$0, flq.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (flq.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (flq.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<gan> b(fui $$0) {
      Set<gan> $$1 = EnumSet.noneOf(gan.class);
      if ($$0.T().c()) {
         $$1.add(gan.a);
      }

      if ($$0.U().c()) {
         $$1.add(gan.b);
      }

      return $$1;
   }

   private void a(gam.d $$0, btt $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(gao::close);
      this.h.clear();
      this.g.forEach(flq::close);
      this.g.clear();
      Set<gan> $$2 = b(fue.R().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         gao $$3 = new gao(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fue.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fui $$0) {
      Set<gan> $$1 = b($$0);

      for (gao $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<gam.a, gaz.a>> a(List<axm> $$0, ame $$1) {
      List<Pair<gam.a, gaz.a>> $$2 = new ArrayList<>();

      for (axm $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            gam.c $$6 = (gam.c)gam.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<gaz.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               gam.a $$9 = new gam.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fwz a() {
      return new fwz(this::b, false);
   }

   public fwz b() {
      return new fwz(this::b, true);
   }

   private gao a(ame $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private gao b(ame $$0) {
      gao $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         gao $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(gao::close);
      this.g.forEach(flq::close);
      this.f.close();
   }

   record a(ame a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   record b(gam.a a, gan.a b, Either<CompletableFuture<Optional<flq>>, ame> c) {

      public Optional<List<flq.a>> a(Function<ame, List<flq.a>> $$0) {
         return (Optional<List<flq.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new flq.a($$0xx, this.b))), $$1 -> {
            List<flq.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               gam.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private flq.a a(flq.a $$0) {
         return new flq.a($$0.a(), this.b.a($$0.b()));
      }
   }

   record c(List<gaz.a> b) {
      public static final Codec<gam.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gaz.a.a.listOf().fieldOf("providers").forGetter(gam.c::a)).apply($$0, gam.c::new)
      );

      public List<gaz.a> a() {
         return this.b;
      }
   }

   record d(Map<ame, List<flq.a>> a, List<flq> b) {
   }

   record e(ame a, List<gam.b> b, Set<ame> c) implements bbe.a<ame> {

      public e(ame $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(gam.a $$0, gan.a $$1, gaz.c $$2) {
         this.b.add(new gam.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(gam.a $$0, gan.a $$1, CompletableFuture<Optional<flq>> $$2) {
         this.b.add(new gam.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<flq>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<flq.a>> a(Function<ame, List<flq.a>> $$0) {
         List<flq.a> $$1 = new ArrayList<>();

         for (gam.b $$2 : this.b) {
            Optional<List<flq.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ame> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ame> $$0) {
      }
   }
}
