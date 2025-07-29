import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class jt<T> implements kh<T> {
   private final amd<? extends jy<T>> b;
   private final ObjectList<jl.c<T>> c = new ObjectArrayList(256);
   private final Reference2IntMap<T> d = ag.a(new Reference2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final Map<ame, jl.c<T>> e = new HashMap<>();
   private final Map<amd<T>, jl.c<T>> f = new HashMap<>();
   private final Map<T, jl.c<T>> g = new IdentityHashMap<>();
   private final Map<amd<T>, jx> h = new IdentityHashMap<>();
   private Lifecycle i;
   private final Map<bae<T>, jp.c<T>> j = new IdentityHashMap<>();
   jt.a<T> k = jt.a.a();
   private boolean l;
   @Nullable
   private Map<T, jl.c<T>> m;

   @Override
   public Stream<jp.c<T>> e() {
      return this.l();
   }

   public jt(amd<? extends jy<T>> $$0, Lifecycle $$1) {
      this($$0, $$1, false);
   }

   public jt(amd<? extends jy<T>> $$0, Lifecycle $$1, boolean $$2) {
      this.b = $$0;
      this.i = $$1;
      if ($$2) {
         this.m = new IdentityHashMap<>();
      }
   }

   @Override
   public amd<? extends jy<T>> g() {
      return this.b;
   }

   @Override
   public String toString() {
      return "Registry[" + this.b + " (" + this.i + ")]";
   }

   private void b() {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   private void h(amd<T> $$0) {
      if (this.l) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + $$0 + ")");
      }
   }

   @Override
   public jl.c<T> a(amd<T> $$0, T $$1, jx $$2) {
      this.h($$0);
      Objects.requireNonNull($$0);
      Objects.requireNonNull($$1);
      if (this.e.containsKey($$0.a())) {
         throw (IllegalStateException)ag.b(new IllegalStateException("Adding duplicate key '" + $$0 + "' to registry"));
      } else if (this.g.containsKey($$1)) {
         throw (IllegalStateException)ag.b(new IllegalStateException("Adding duplicate value '" + $$1 + "' to registry"));
      } else {
         jl.c<T> $$3;
         if (this.m != null) {
            $$3 = this.m.remove($$1);
            if ($$3 == null) {
               throw new AssertionError("Missing intrusive holder for " + $$0 + ":" + $$1);
            }

            $$3.b($$0);
         } else {
            $$3 = this.f.computeIfAbsent($$0, $$0x -> jl.c.a(this, $$0x));
         }

         this.f.put($$0, $$3);
         this.e.put($$0.a(), $$3);
         this.g.put($$1, $$3);
         int $$5 = this.c.size();
         this.c.add($$3);
         this.d.put($$1, $$5);
         this.h.put($$0, $$2);
         this.i = this.i.add($$2.b());
         return $$3;
      }
   }

   @Nullable
   @Override
   public ame b(T $$0) {
      jl.c<T> $$1 = this.g.get($$0);
      return $$1 != null ? $$1.h().a() : null;
   }

   @Override
   public Optional<amd<T>> d(T $$0) {
      return Optional.ofNullable(this.g.get($$0)).map(jl.c::h);
   }

   @Override
   public int a(@Nullable T $$0) {
      return this.d.getInt($$0);
   }

   @Nullable
   @Override
   public T c(@Nullable amd<T> $$0) {
      return a(this.f.get($$0));
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return (T)($$0 >= 0 && $$0 < this.c.size() ? ((jl.c)this.c.get($$0)).a() : null);
   }

   @Override
   public Optional<jl.c<T>> c(int $$0) {
      return $$0 >= 0 && $$0 < this.c.size() ? Optional.ofNullable((jl.c<T>)this.c.get($$0)) : Optional.empty();
   }

   @Override
   public Optional<jl.c<T>> c(ame $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Override
   public Optional<jl.c<T>> a(amd<T> $$0) {
      return Optional.ofNullable(this.f.get($$0));
   }

   @Override
   public Optional<jl.c<T>> a() {
      return this.c.isEmpty() ? Optional.empty() : Optional.of((jl.c<T>)this.c.getFirst());
   }

   @Override
   public jl<T> e(T $$0) {
      jl.c<T> $$1 = this.g.get($$0);
      return (jl<T>)($$1 != null ? $$1 : jl.a($$0));
   }

   jl.c<T> i(amd<T> $$0) {
      return this.f.computeIfAbsent($$0, $$0x -> {
         if (this.m != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.h($$0x);
            return jl.c.a(this, $$0x);
         }
      });
   }

   @Override
   public int d() {
      return this.f.size();
   }

   @Override
   public Optional<jx> d(amd<T> $$0) {
      return Optional.ofNullable(this.h.get($$0));
   }

   @Override
   public Lifecycle h() {
      return this.i;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.c.iterator(), jl::a);
   }

   @Nullable
   @Override
   public T a(@Nullable ame $$0) {
      jl.c<T> $$1 = this.e.get($$0);
      return a($$1);
   }

   @Nullable
   private static <T> T a(@Nullable jl.c<T> $$0) {
      return $$0 != null ? $$0.a() : null;
   }

   @Override
   public Set<ame> i() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   @Override
   public Set<amd<T>> j() {
      return Collections.unmodifiableSet(this.f.keySet());
   }

   @Override
   public Set<Entry<amd<T>, T>> k() {
      return Collections.unmodifiableSet(ag.<amd<T>, jl.c<T>, T>a(this.f, jl::a).entrySet());
   }

   @Override
   public Stream<jl.c<T>> c() {
      return this.c.stream();
   }

   @Override
   public Stream<jp.c<T>> l() {
      return this.k.c();
   }

   jp.c<T> d(bae<T> $$0) {
      return this.j.computeIfAbsent($$0, this::e);
   }

   private jp.c<T> e(bae<T> $$0) {
      return new jp.c<>(this, $$0);
   }

   @Override
   public boolean m() {
      return this.f.isEmpty();
   }

   @Override
   public Optional<jl.c<T>> a(bck $$0) {
      return ag.b(this.c, $$0);
   }

   @Override
   public boolean d(ame $$0) {
      return this.e.containsKey($$0);
   }

   @Override
   public boolean e(amd<T> $$0) {
      return this.f.containsKey($$0);
   }

   @Override
   public jy<T> n() {
      if (this.l) {
         return this;
      } else {
         this.l = true;
         this.g.forEach(($$0x, $$1x) -> $$1x.b($$0x));
         List<ame> $$0 = this.f.entrySet().stream().filter($$0x -> !((jl.c)$$0x.getValue()).b()).map($$0x -> ((amd)$$0x.getKey()).a()).sorted().toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.g() + ": " + $$0);
         } else {
            if (this.m != null) {
               if (!this.m.isEmpty()) {
                  throw new IllegalStateException("Some intrusive holders were not registered: " + this.m.values());
               }

               this.m = null;
            }

            if (this.k.b()) {
               throw new IllegalStateException("Tags already present before freezing");
            } else {
               List<ame> $$1 = this.j.entrySet().stream().filter($$0x -> !((jp.c)$$0x.getValue()).c()).map($$0x -> ((bae)$$0x.getKey()).b()).sorted().toList();
               if (!$$1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.g() + ": " + $$1);
               } else {
                  this.k = jt.a.a(this.j);
                  this.u();
                  return this;
               }
            }
         }
      }
   }

   @Override
   public jl.c<T> f(T $$0) {
      if (this.m == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.b();
         return this.m.computeIfAbsent($$0, $$0x -> jl.c.a(this, (T)$$0x));
      }
   }

   @Override
   public Optional<jp.c<T>> a(bae<T> $$0) {
      return this.k.a($$0);
   }

   private jl.c<T> a(bae<T> $$0, jl<T> $$1) {
      if (!$$1.a(this)) {
         throw new IllegalStateException("Can't create named set " + $$0 + " containing value " + $$1 + " from outside registry " + this);
      } else if ($$1 instanceof jl.c<T> $$2) {
         return $$2;
      } else {
         throw new IllegalStateException("Found direct holder " + $$1 + " value in tag " + $$0);
      }
   }

   @Override
   public void a(bae<T> $$0, List<jl<T>> $$1) {
      this.b();
      this.d($$0).b($$1);
   }

   void u() {
      Map<jl.c<T>, List<bae<T>>> $$0 = new IdentityHashMap<>();
      this.f.values().forEach($$1 -> $$0.put((jl.c<T>)$$1, new ArrayList<>()));
      this.k.a(($$1, $$2) -> {
         for (jl<T> $$3 : $$2) {
            jl.c<T> $$4 = this.a((bae<T>)$$1, $$3);
            $$0.get($$4).add((bae<T>)$$1);
         }
      });
      $$0.forEach(jl.c::a);
   }

   public void o() {
      this.b();
      this.j.values().forEach($$0 -> $$0.b(List.of()));
   }

   @Override
   public jm<T> p() {
      this.b();
      return new jm<T>() {
         @Override
         public Optional<jl.c<T>> a(amd<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jl.c<T> b(amd<T> $$0) {
            return jt.this.i($$0);
         }

         @Override
         public Optional<jp.c<T>> a(bae<T> $$0) {
            return Optional.of(this.b($$0));
         }

         @Override
         public jp.c<T> b(bae<T> $$0) {
            return jt.this.d($$0);
         }
      };
   }

   @Override
   public jy.a<T> a(baf.c<T> $$0) {
      if (!this.l) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder<bae<T>, jp.c<T>> $$1 = ImmutableMap.builder();
         final Map<bae<T>, List<jl<T>>> $$2 = new HashMap<>();
         $$0.b().forEach(($$2x, $$3x) -> {
            jp.c<T> $$4x = this.j.get($$2x);
            if ($$4x == null) {
               $$4x = this.e($$2x);
            }

            $$1.put($$2x, $$4x);
            $$2.put($$2x, List.copyOf($$3x));
         });
         final ImmutableMap<bae<T>, jp.c<T>> $$3 = $$1.build();
         final jn.b<T> $$4 = new jn.b.a<T>() {
            @Override
            public jn.b<T> a() {
               return jt.this;
            }

            @Override
            public Optional<jp.c<T>> a(bae<T> $$0) {
               return Optional.ofNullable((jp.c<T>)$$3.get($$0));
            }

            @Override
            public Stream<jp.c<T>> e() {
               return $$3.values().stream();
            }
         };
         return new jy.a<T>() {
            @Override
            public amd<? extends jy<? extends T>> a() {
               return jt.this.g();
            }

            @Override
            public int b() {
               return $$2.size();
            }

            @Override
            public jn.b<T> c() {
               return $$4;
            }

            @Override
            public void d() {
               $$3.forEach(($$1x, $$2xx) -> {
                  List<jl<T>> $$3xx = $$2.getOrDefault($$1x, List.of());
                  $$2xx.b($$3xx);
               });
               jt.this.k = jt.a.a($$3);
               jt.this.u();
            }
         };
      }
   }

   interface a<T> {
      static <T> jt.a<T> a() {
         return new jt.a<T>() {
            @Override
            public boolean b() {
               return false;
            }

            @Override
            public Optional<jp.c<T>> a(bae<T> $$0) {
               throw new IllegalStateException("Tags not bound, trying to access " + $$0);
            }

            @Override
            public void a(BiConsumer<? super bae<T>, ? super jp.c<T>> $$0) {
               throw new IllegalStateException("Tags not bound");
            }

            @Override
            public Stream<jp.c<T>> c() {
               throw new IllegalStateException("Tags not bound");
            }
         };
      }

      static <T> jt.a<T> a(final Map<bae<T>, jp.c<T>> $$0) {
         return new jt.a<T>() {
            @Override
            public boolean b() {
               return true;
            }

            @Override
            public Optional<jp.c<T>> a(bae<T> $$0x) {
               return Optional.ofNullable($$0.get($$0));
            }

            @Override
            public void a(BiConsumer<? super bae<T>, ? super jp.c<T>> $$0x) {
               $$0.forEach($$0);
            }

            @Override
            public Stream<jp.c<T>> c() {
               return $$0.values().stream();
            }
         };
      }

      boolean b();

      Optional<jp.c<T>> a(bae<T> var1);

      void a(BiConsumer<? super bae<T>, ? super jp.c<T>> var1);

      Stream<jp.c<T>> c();
   }
}
