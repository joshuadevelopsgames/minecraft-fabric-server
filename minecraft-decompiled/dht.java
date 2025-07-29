import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dht extends axt<dhu> implements dhn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<amd<dhv>, dht.c> b = Map.of(
      dhv.d,
      $$0 -> $$0 instanceof dih $$1 ? $$1.k() : Optional.empty(),
      dhv.b,
      $$0 -> $$0 instanceof dih $$1 ? Optional.of($$1.f()) : Optional.empty(),
      dhv.c,
      $$0 -> $$0 instanceof dih $$1 ? $$1.c() : Optional.empty(),
      dhv.e,
      b(dhx.b),
      dhv.f,
      b(dhx.c),
      dhv.g,
      b(dhx.d),
      dhv.h,
      b(dhx.e)
   );
   private static final alx c = alx.a(mn.bA);
   private final jn.a d;
   private dhu e = dhu.a;
   private Map<amd<dhv>, dhv> f = Map.of();
   private dhz.b<dim> g = dhz.b.a();
   private List<dht.d> h = List.of();
   private Map<amd<dhm<?>>, List<dht.d>> i = Map.of();

   public dht(jn.a $$0) {
      this.d = $$0;
   }

   protected dhu a(axo $$0, btt $$1) {
      SortedMap<ame, dhm<?>> $$2 = new TreeMap<>();
      axs.a($$0, c, this.d.a(JsonOps.INSTANCE), dhm.a, $$2);
      List<dhr<?>> $$3 = new ArrayList<>($$2.size());
      $$2.forEach(($$1x, $$2x) -> {
         amd<dhm<?>> $$3x = amd.a(mn.bA, $$1x);
         dhr<?> $$4 = new dhr($$3x, $$2x);
         $$3.add($$4);
      });
      return dhu.a($$3);
   }

   protected void a(dhu $$0, axo $$1, btt $$2) {
      this.e = $$0;
      a.info("Loaded {} recipes", $$0.a().size());
   }

   public void a(cyd $$0) {
      List<dhz.a<dim>> $$1 = new ArrayList<>();
      List<dht.b> $$2 = b.entrySet().stream().map($$0x -> new dht.b((amd<dhv>)$$0x.getKey(), (dht.c)$$0x.getValue())).toList();
      this.e.a().forEach($$3 -> {
         dhm<?> $$4 = $$3.b();
         if (!$$4.ap_() && $$4.ao_().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$3.a().a());
         } else {
            $$2.forEach($$1xx -> $$1xx.a($$4));
            if ($$4 instanceof dim $$5 && a($$0, $$5.k()) && $$5.c().a($$0)) {
               $$1.add(new dhz.a<>($$5.k(), new dhz<>($$5.c(), Optional.of((dhr<dim>)$$3))));
            }
         }
      });
      this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0x -> $$0x.a, $$1x -> $$1x.a($$0)));
      this.g = new dhz.b<>($$1);
      this.h = a(this.e.a(), $$0);
      this.i = this.h.stream().collect(Collectors.groupingBy($$0x -> $$0x.b.a(), IdentityHashMap::new, Collectors.toList()));
   }

   static List<dhi> a(cyd $$0, List<dhi> $$1) {
      $$1.removeIf($$1x -> !a($$0, $$1x));
      return $$1;
   }

   private static boolean a(cyd $$0, dhi $$1) {
      return $$1.a().allMatch($$1x -> ((dcr)$$1x.a()).a($$0));
   }

   public <I extends dhs, T extends dhm<I>> Optional<dhr<T>> a(dhx<T> $$0, I $$1, dmu $$2, @Nullable amd<dhm<?>> $$3) {
      dhr<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dhs, T extends dhm<I>> Optional<dhr<T>> a(dhx<T> $$0, I $$1, dmu $$2, @Nullable dhr<T> $$3) {
      return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.a($$0, $$1, $$2);
   }

   public <I extends dhs, T extends dhm<I>> Optional<dhr<T>> a(dhx<T> $$0, I $$1, dmu $$2) {
      return this.e.a($$0, $$1, $$2).findFirst();
   }

   public Optional<dhr<?>> b(amd<dhm<?>> $$0) {
      return Optional.ofNullable(this.e.a($$0));
   }

   @Nullable
   private <T extends dhm<?>> dhr<T> a(dhx<T> $$0, amd<dhm<?>> $$1) {
      dhr<?> $$2 = this.e.a($$1);
      return (dhr<T>)($$2 != null && $$2.b().b().equals($$0) ? $$2 : null);
   }

   public Map<amd<dhv>, dhv> b() {
      return this.f;
   }

   public dhz.b<dim> c() {
      return this.g;
   }

   @Override
   public dhv a(amd<dhv> $$0) {
      return this.f.getOrDefault($$0, dhv.j);
   }

   @Override
   public dhz.b<dim> a() {
      return this.g;
   }

   public Collection<dhr<?>> d() {
      return this.e.a();
   }

   @Nullable
   public dht.d a(diu $$0) {
      int $$1 = $$0.a();
      return $$1 >= 0 && $$1 < this.h.size() ? this.h.get($$1) : null;
   }

   public void a(amd<dhm<?>> $$0, Consumer<dit> $$1) {
      List<dht.d> $$2 = this.i.get($$0);
      if ($$2 != null) {
         $$2.forEach($$1x -> $$1.accept($$1x.a));
      }
   }

   @VisibleForTesting
   protected static dhr<?> a(amd<dhm<?>> $$0, JsonObject $$1, jn.a $$2) {
      dhm<?> $$3 = (dhm<?>)dhm.a.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dhr<>($$0, $$3);
   }

   public static <I extends dhs, T extends dhm<I>> dht.a<I, T> a(final dhx<T> $$0) {
      return new dht.a<I, T>() {
         @Nullable
         private amd<dhm<?>> b;

         @Override
         public Optional<dhr<T>> a(I $$0x, aub $$1) {
            dht $$2 = $$1.u();
            Optional<dhr<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dhr<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   private static List<dht.d> a(Iterable<dhr<?>> $$0, cyd $$1) {
      List<dht.d> $$2 = new ArrayList<>();
      Object2IntMap<String> $$3 = new Object2IntOpenHashMap();

      for (dhr<?> $$4 : $$0) {
         dhm<?> $$5 = $$4.b();
         OptionalInt $$6;
         if ($$5.j().isEmpty()) {
            $$6 = OptionalInt.empty();
         } else {
            $$6 = OptionalInt.of($$3.computeIfAbsent($$5.j(), $$1x -> $$3.size()));
         }

         Optional<List<dhi>> $$8;
         if ($$5.ap_()) {
            $$8 = Optional.empty();
         } else {
            $$8 = Optional.of($$5.ao_().b());
         }

         for (dis $$10 : $$5.g()) {
            if ($$10.a($$1)) {
               int $$11 = $$2.size();
               diu $$12 = new diu($$11);
               dit $$13 = new dit($$12, $$10, $$6, $$5.h(), $$8);
               $$2.add(new dht.d($$13, $$4));
            }
         }
      }

      return $$2;
   }

   private static dht.c b(dhx<? extends die> $$0) {
      return $$1 -> $$1.b() == $$0 && $$1 instanceof die $$2 ? Optional.of($$2.k()) : Optional.empty();
   }

   public interface a<I extends dhs, T extends dhm<I>> {
      Optional<dhr<T>> a(I var1, aub var2);
   }

   public static class b implements Consumer<dhm<?>> {
      final amd<dhv> a;
      private final dht.c b;
      private final List<dhi> c = new ArrayList<>();

      protected b(amd<dhv> $$0, dht.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dhm<?> $$0) {
         this.b.apply($$0).ifPresent(this.c::add);
      }

      public dhv a(cyd $$0) {
         return dhv.a(dht.a($$0, this.c));
      }
   }

   @FunctionalInterface
   public interface c {
      Optional<dhi> apply(dhm<?> var1);
   }

   public record d(dit a, dhr<?> b) {
   }
}
