import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class cbm<E extends cam> {
   static final Logger a = LogUtils.getLogger();
   private final Supplier<Codec<cbm<E>>> b;
   private static final int c = 20;
   private final Map<cjo<?>, Optional<? extends cjn<?>>> d = Maps.newHashMap();
   private final Map<ckw<? extends ckv<? super E>>, ckv<? super E>> e = Maps.newLinkedHashMap();
   private final Map<Integer, Map<cwn, Set<cce<? super E>>>> f = Maps.newTreeMap();
   private cwp g = cwp.c;
   private final Map<cwn, Set<Pair<cjo<?>, cjp>>> h = Maps.newHashMap();
   private final Map<cwn, Set<cjo<?>>> i = Maps.newHashMap();
   private Set<cwn> j = Sets.newHashSet();
   private final Set<cwn> k = Sets.newHashSet();
   private cwn l = cwn.b;
   private long m = -9999L;

   public static <E extends cam> cbm.b<E> a(Collection<? extends cjo<?>> $$0, Collection<? extends ckw<? extends ckv<? super E>>> $$1) {
      return new cbm.b<>($$0, $$1);
   }

   public static <E extends cam> Codec<cbm<E>> b(final Collection<? extends cjo<?>> $$0, final Collection<? extends ckw<? extends ckv<? super E>>> $$1) {
      final MutableObject<Codec<cbm<E>>> $$2 = new MutableObject();
      $$2.setValue(
         (new MapCodec<cbm<E>>() {
               public <T> Stream<T> keys(DynamicOps<T> $$0x) {
                  return $$0.stream().flatMap($$0xx -> $$0xx.a().map($$1xxx -> mm.z.b($$0xx)).stream()).map($$1xx -> (T)$$0.createString($$1xx.toString()));
               }

               public <T> DataResult<cbm<E>> decode(DynamicOps<T> $$0x, MapLike<T> $$1x) {
                  MutableObject<DataResult<Builder<cbm.a<?>>>> $$2x = new MutableObject(DataResult.success(ImmutableList.builder()));
                  $$1.entries().forEach($$2xxx -> {
                     DataResult<cjo<?>> $$3x = mm.z.q().parse($$0, $$2xxx.getFirst());
                     DataResult<? extends cbm.a<?>> $$4 = $$3x.flatMap($$2xxxxx -> this.a($$2xxxxx, $$0, (T)$$2xxx.getSecond()));
                     $$2.setValue(((DataResult)$$2.getValue()).apply2(Builder::add, $$4));
                  });
                  ImmutableList<cbm.a<?>> $$3 = ((DataResult)$$2x.getValue())
                     .resultOrPartial(cbm.a::error)
                     .<ImmutableList<cbm.a<?>>>map(Builder::build)
                     .orElseGet(ImmutableList::of);
                  return DataResult.success(new cbm<>($$0, $$1, $$3, $$2::getValue));
               }

               private <T, U> DataResult<cbm.a<U>> a(cjo<U> $$0x, DynamicOps<T> $$1x, T $$2x) {
                  return $$0.a()
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "No codec for memory: " + $$0))
                     .flatMap($$2xxx -> $$2xxx.parse($$1, $$2))
                     .map($$1xxx -> new cbm.a<>($$0, Optional.of($$1xxx)));
               }

               public <T> RecordBuilder<T> a(cbm<E> $$0x, DynamicOps<T> $$1x, RecordBuilder<T> $$2x) {
                  $$0.j().forEach($$2xxx -> $$2xxx.a($$1, $$2));
                  return $$2;
               }
            })
            .fieldOf("memories")
            .codec()
      );
      return (Codec<cbm<E>>)$$2.getValue();
   }

   public cbm(
      Collection<? extends cjo<?>> $$0, Collection<? extends ckw<? extends ckv<? super E>>> $$1, ImmutableList<cbm.a<?>> $$2, Supplier<Codec<cbm<E>>> $$3
   ) {
      this.b = $$3;

      for (cjo<?> $$4 : $$0) {
         this.d.put($$4, Optional.empty());
      }

      for (ckw<? extends ckv<? super E>> $$5 : $$1) {
         this.e.put($$5, (ckv<? super E>)$$5.a());
      }

      for (ckv<? super E> $$6 : this.e.values()) {
         for (cjo<?> $$7 : $$6.a()) {
            this.d.put($$7, Optional.empty());
         }
      }

      UnmodifiableIterator var11 = $$2.iterator();

      while (var11.hasNext()) {
         cbm.a<?> $$8 = (cbm.a<?>)var11.next();
         $$8.a(this);
      }
   }

   public <T> DataResult<T> a(DynamicOps<T> $$0) {
      return this.b.get().encodeStart($$0, this);
   }

   Stream<cbm.a<?>> j() {
      return this.d.entrySet().stream().map($$0 -> cbm.a.a($$0.getKey(), $$0.getValue()));
   }

   public boolean a(cjo<?> $$0) {
      return this.a($$0, cjp.a);
   }

   public void a() {
      this.d.keySet().forEach($$0 -> this.d.put((cjo<?>)$$0, Optional.empty()));
   }

   public <U> void b(cjo<U> $$0) {
      this.a($$0, Optional.empty());
   }

   public <U> void a(cjo<U> $$0, @Nullable U $$1) {
      this.a($$0, Optional.ofNullable($$1));
   }

   public <U> void a(cjo<U> $$0, U $$1, long $$2) {
      this.b($$0, Optional.of(cjn.a($$1, $$2)));
   }

   public <U> void a(cjo<U> $$0, Optional<? extends U> $$1) {
      this.b($$0, $$1.map(cjn::a));
   }

   <U> void b(cjo<U> $$0, Optional<? extends cjn<?>> $$1) {
      if (this.d.containsKey($$0)) {
         if ($$1.isPresent() && this.a($$1.get().c())) {
            this.b($$0);
         } else {
            this.d.put($$0, $$1);
         }
      }
   }

   public <U> Optional<U> c(cjo<U> $$0) {
      Optional<? extends cjn<?>> $$1 = this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + $$0);
      } else {
         return $$1.map(cjn::c);
      }
   }

   @Nullable
   public <U> Optional<U> d(cjo<U> $$0) {
      Optional<? extends cjn<?>> $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.map(cjn::c);
   }

   public <U> long e(cjo<U> $$0) {
      Optional<? extends cjn<?>> $$1 = this.d.get($$0);
      return $$1.<Long>map(cjn::b).orElse(0L);
   }

   @Deprecated
   @bdl
   public Map<cjo<?>, Optional<? extends cjn<?>>> b() {
      return this.d;
   }

   public <U> boolean b(cjo<U> $$0, U $$1) {
      return !this.a($$0) ? false : this.c($$0).filter($$1x -> $$1x.equals($$1)).isPresent();
   }

   public boolean a(cjo<?> $$0, cjp $$1) {
      Optional<? extends cjn<?>> $$2 = this.d.get($$0);
      return $$2 == null ? false : $$1 == cjp.c || $$1 == cjp.a && $$2.isPresent() || $$1 == cjp.b && $$2.isEmpty();
   }

   public cwp c() {
      return this.g;
   }

   public void a(cwp $$0) {
      this.g = $$0;
   }

   public void a(Set<cwn> $$0) {
      this.j = $$0;
   }

   @Deprecated
   @bdl
   public Set<cwn> d() {
      return this.k;
   }

   @Deprecated
   @bdl
   public List<cce<? super E>> e() {
      List<cce<? super E>> $$0 = new ObjectArrayList();

      for (Map<cwn, Set<cce<? super E>>> $$1 : this.f.values()) {
         for (Set<cce<? super E>> $$2 : $$1.values()) {
            for (cce<? super E> $$3 : $$2) {
               if ($$3.a() == ccd.a.b) {
                  $$0.add($$3);
               }
            }
         }
      }

      return $$0;
   }

   public void f() {
      this.d(this.l);
   }

   public Optional<cwn> g() {
      for (cwn $$0 : this.k) {
         if (!this.j.contains($$0)) {
            return Optional.of($$0);
         }
      }

      return Optional.empty();
   }

   public void a(cwn $$0) {
      if (this.f($$0)) {
         this.d($$0);
      } else {
         this.f();
      }
   }

   private void d(cwn $$0) {
      if (!this.c($$0)) {
         this.e($$0);
         this.k.clear();
         this.k.addAll(this.j);
         this.k.add($$0);
      }
   }

   private void e(cwn $$0) {
      for (cwn $$1 : this.k) {
         if ($$1 != $$0) {
            Set<cjo<?>> $$2 = this.i.get($$1);
            if ($$2 != null) {
               for (cjo<?> $$3 : $$2) {
                  this.b($$3);
               }
            }
         }
      }
   }

   public void a(long $$0, long $$1) {
      if ($$1 - this.m > 20L) {
         this.m = $$1;
         cwn $$2 = this.c().a((int)($$0 % 24000L));
         if (!this.k.contains($$2)) {
            this.a($$2);
         }
      }
   }

   public void a(List<cwn> $$0) {
      for (cwn $$1 : $$0) {
         if (this.f($$1)) {
            this.d($$1);
            break;
         }
      }
   }

   public void b(cwn $$0) {
      this.l = $$0;
   }

   public void a(cwn $$0, int $$1, ImmutableList<? extends cce<? super E>> $$2) {
      this.a($$0, this.a($$1, $$2));
   }

   public void a(cwn $$0, int $$1, ImmutableList<? extends cce<? super E>> $$2, cjo<?> $$3) {
      Set<Pair<cjo<?>, cjp>> $$4 = ImmutableSet.of(Pair.of($$3, cjp.a));
      Set<cjo<?>> $$5 = ImmutableSet.of($$3);
      this.a($$0, this.a($$1, $$2), $$4, $$5);
   }

   public void a(cwn $$0, ImmutableList<? extends Pair<Integer, ? extends cce<? super E>>> $$1) {
      this.a($$0, $$1, ImmutableSet.of(), Sets.newHashSet());
   }

   public void a(cwn $$0, int $$1, ImmutableList<? extends cce<? super E>> $$2, Set<Pair<cjo<?>, cjp>> $$3) {
      this.a($$0, this.a($$1, $$2), $$3);
   }

   public void a(cwn $$0, ImmutableList<? extends Pair<Integer, ? extends cce<? super E>>> $$1, Set<Pair<cjo<?>, cjp>> $$2) {
      this.a($$0, $$1, $$2, Sets.newHashSet());
   }

   public void a(cwn $$0, ImmutableList<? extends Pair<Integer, ? extends cce<? super E>>> $$1, Set<Pair<cjo<?>, cjp>> $$2, Set<cjo<?>> $$3) {
      this.h.put($$0, $$2);
      if (!$$3.isEmpty()) {
         this.i.put($$0, $$3);
      }

      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         Pair<Integer, ? extends cce<? super E>> $$4 = (Pair<Integer, ? extends cce<? super E>>)var5.next();
         this.f
            .computeIfAbsent((Integer)$$4.getFirst(), $$0x -> Maps.newHashMap())
            .computeIfAbsent($$0, $$0x -> Sets.newLinkedHashSet())
            .add((cce<? super E>)$$4.getSecond());
      }
   }

   @VisibleForTesting
   public void h() {
      this.f.clear();
   }

   public boolean c(cwn $$0) {
      return this.k.contains($$0);
   }

   public cbm<E> i() {
      cbm<E> $$0 = new cbm<>(this.d.keySet(), this.e.keySet(), ImmutableList.of(), this.b);

      for (Entry<cjo<?>, Optional<? extends cjn<?>>> $$1 : this.d.entrySet()) {
         cjo<?> $$2 = $$1.getKey();
         if ($$1.getValue().isPresent()) {
            $$0.d.put($$2, $$1.getValue());
         }
      }

      return $$0;
   }

   public void a(aub $$0, E $$1) {
      this.k();
      this.c($$0, $$1);
      this.d($$0, $$1);
      this.e($$0, $$1);
   }

   private void c(aub $$0, E $$1) {
      for (ckv<? super E> $$2 : this.e.values()) {
         $$2.b($$0, $$1);
      }
   }

   private void k() {
      for (Entry<cjo<?>, Optional<? extends cjn<?>>> $$0 : this.d.entrySet()) {
         if ($$0.getValue().isPresent()) {
            cjn<?> $$1 = (cjn<?>)$$0.getValue().get();
            if ($$1.d()) {
               this.b($$0.getKey());
            }

            $$1.a();
         }
      }
   }

   public void b(aub $$0, E $$1) {
      long $$2 = $$1.ai().ae();

      for (cce<? super E> $$3 : this.e()) {
         $$3.g($$0, $$1, $$2);
      }
   }

   private void d(aub $$0, E $$1) {
      long $$2 = $$0.ae();

      for (Map<cwn, Set<cce<? super E>>> $$3 : this.f.values()) {
         for (Entry<cwn, Set<cce<? super E>>> $$4 : $$3.entrySet()) {
            cwn $$5 = $$4.getKey();
            if (this.k.contains($$5)) {
               for (cce<? super E> $$7 : $$4.getValue()) {
                  if ($$7.a() == ccd.a.a) {
                     $$7.e($$0, $$1, $$2);
                  }
               }
            }
         }
      }
   }

   private void e(aub $$0, E $$1) {
      long $$2 = $$0.ae();

      for (cce<? super E> $$3 : this.e()) {
         $$3.f($$0, $$1, $$2);
      }
   }

   private boolean f(cwn $$0) {
      if (!this.h.containsKey($$0)) {
         return false;
      } else {
         for (Pair<cjo<?>, cjp> $$1 : this.h.get($$0)) {
            cjo<?> $$2 = (cjo<?>)$$1.getFirst();
            cjp $$3 = (cjp)$$1.getSecond();
            if (!this.a($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(Object $$0) {
      return $$0 instanceof Collection && ((Collection)$$0).isEmpty();
   }

   ImmutableList<? extends Pair<Integer, ? extends cce<? super E>>> a(int $$0, ImmutableList<? extends cce<? super E>> $$1) {
      int $$2 = $$0;
      Builder<Pair<Integer, ? extends cce<? super E>>> $$3 = ImmutableList.builder();
      UnmodifiableIterator var5 = $$1.iterator();

      while (var5.hasNext()) {
         cce<? super E> $$4 = (cce<? super E>)var5.next();
         $$3.add(Pair.of($$2++, $$4));
      }

      return $$3.build();
   }

   static final class a<U> {
      private final cjo<U> a;
      private final Optional<? extends cjn<U>> b;

      static <U> cbm.a<U> a(cjo<U> $$0, Optional<? extends cjn<?>> $$1) {
         return new cbm.a<>($$0, (Optional<? extends cjn<U>>)$$1);
      }

      a(cjo<U> $$0, Optional<? extends cjn<U>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void a(cbm<?> $$0) {
         $$0.b(this.a, this.b);
      }

      public <T> void a(DynamicOps<T> $$0, RecordBuilder<T> $$1) {
         this.a.a().ifPresent($$2 -> this.b.ifPresent($$3 -> $$1.add(mm.z.q().encodeStart($$0, this.a), $$2.encodeStart($$0, $$3))));
      }
   }

   public static final class b<E extends cam> {
      private final Collection<? extends cjo<?>> a;
      private final Collection<? extends ckw<? extends ckv<? super E>>> b;
      private final Codec<cbm<E>> c;

      b(Collection<? extends cjo<?>> $$0, Collection<? extends ckw<? extends ckv<? super E>>> $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = cbm.b($$0, $$1);
      }

      public cbm<E> a(Dynamic<?> $$0) {
         return this.c.parse($$0).resultOrPartial(cbm.a::error).orElseGet(() -> new cbm<>(this.a, this.b, ImmutableList.of(), () -> this.c));
      }
   }
}
