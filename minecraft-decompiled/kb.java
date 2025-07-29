import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;

public class kb {
   private final List<kb.k<?>> a = new ArrayList<>();

   static <T> jm<T> a(final jn.b<T> $$0) {
      return new kb.c<T>($$0) {
         @Override
         public Optional<jl.c<T>> a(amd<T> $$0x) {
            return $$0.a($$0);
         }
      };
   }

   static <T> jn.b<T> a(final amd<? extends jy<? extends T>> $$0, final Lifecycle $$1, jo<T> $$2, final Map<amd<T>, jl.c<T>> $$3) {
      return new kb.e<T>($$2) {
         @Override
         public amd<? extends jy<? extends T>> g() {
            return $$0;
         }

         @Override
         public Lifecycle h() {
            return $$1;
         }

         @Override
         public Optional<jl.c<T>> a(amd<T> $$0x) {
            return Optional.ofNullable($$3.get($$0));
         }

         @Override
         public Stream<jl.c<T>> c() {
            return $$3.values().stream();
         }
      };
   }

   public <T> kb a(amd<? extends jy<T>> $$0, Lifecycle $$1, kb.i<T> $$2) {
      this.a.add(new kb.k<>($$0, $$1, $$2));
      return this;
   }

   public <T> kb a(amd<? extends jy<T>> $$0, kb.i<T> $$1) {
      return this.a($$0, Lifecycle.stable(), $$1);
   }

   private kb.b b(jz $$0) {
      kb.b $$1 = kb.b.a($$0, this.a.stream().map(kb.k::a));
      this.a.forEach($$1x -> $$1x.b($$1));
      return $$1;
   }

   private static jn.a a(kb.m $$0, jz $$1, Stream<jn.b<?>> $$2) {
      record a<T>(jn.b<T> a, amc.b<T> b) {
         public static <T> a<T> a(jn.b<T> $$0) {
            return new a<>(new kb.d<>($$0, $$0), amc.b.a($$0));
         }

         public static <T> a<T> a(kb.m $$0, jn.b<T> $$1) {
            return new a<>(new kb.d<>($$0.a(), $$1), new amc.b<>($$0.a(), $$1, $$1.h()));
         }
      }

      final Map<amd<? extends jy<?>>, a<?>> $$3 = new HashMap<>();
      $$1.a().forEach($$1x -> $$3.put($$1x.a(), kb$a.a($$1x.b())));
      $$2.forEach($$2x -> $$3.put($$2x.g(), kb$a.a($$0, $$2x)));
      return new jn.a() {
         @Override
         public Stream<amd<? extends jy<?>>> b() {
            return $$3.keySet().stream();
         }

         <T> Optional<a<T>> f(amd<? extends jy<? extends T>> $$0) {
            return Optional.ofNullable((a<T>)$$3.get($$0));
         }

         @Override
         public <T> Optional<jn.b<T>> a(amd<? extends jy<? extends T>> $$0) {
            return this.f($$0).map(a::a);
         }

         @Override
         public <V> amc<V> a(DynamicOps<V> $$0) {
            return amc.a($$0, new amc.c() {
               @Override
               public <T> Optional<amc.b<T>> a(amd<? extends jy<? extends T>> $$0) {
                  return f($$0).map(a::b);
               }
            });
         }
      };
   }

   public jn.a a(jz $$0) {
      kb.b $$1 = this.b($$0);
      Stream<jn.b<?>> $$2 = this.a.stream().map($$1x -> $$1x.a($$1).a($$1.a));
      jn.a $$3 = a($$1.a, $$0, $$2);
      $$1.c();
      $$1.b();
      $$1.d();
      return $$3;
   }

   private jn.a a(jz $$0, jn.a $$1, jd.a $$2, Map<amd<? extends jy<?>>, kb.j<?>> $$3, jn.a $$4) {
      kb.m $$5 = new kb.m();
      MutableObject<jn.a> $$6 = new MutableObject();
      List<jn.b<?>> $$7 = $$3.keySet().stream().map($$5x -> this.a($$5, $$2, $$5x, $$4, $$1, $$6)).collect(Collectors.toUnmodifiableList());
      jn.a $$8 = a($$5, $$0, $$7.stream());
      $$6.setValue($$8);
      return $$8;
   }

   private <T> jn.b<T> a(jo<T> $$0, jd.a $$1, amd<? extends jy<? extends T>> $$2, jn.a $$3, jn.a $$4, MutableObject<jn.a> $$5) {
      jd<T> $$6 = $$1.a($$2);
      if ($$6 == null) {
         throw new NullPointerException("No cloner for " + $$2.a());
      } else {
         Map<amd<T>, jl.c<T>> $$7 = new HashMap<>();
         jn.b<T> $$8 = $$3.e($$2);
         $$8.c().forEach($$5x -> {
            amd<T> $$6x = $$5x.h();
            kb.f<T> $$7x = new kb.f<>($$0, $$6x);
            $$7x.a = () -> $$6.a((T)$$5x.a(), $$3, (jn.a)$$5.getValue());
            $$7.put($$6x, $$7x);
         });
         jn.b<T> $$9 = $$4.e($$2);
         $$9.c().forEach($$5x -> {
            amd<T> $$6x = $$5x.h();
            $$7.computeIfAbsent($$6x, $$6xx -> {
               kb.f<T> $$7x = new kb.f<>($$0, $$6x);
               $$7x.a = () -> $$6.a((T)$$5x.a(), $$4, (jn.a)$$5.getValue());
               return $$7x;
            });
         });
         Lifecycle $$10 = $$8.h().add($$9.h());
         return a($$2, $$10, $$0, $$7);
      }
   }

   public kb.g a(jz $$0, jn.a $$1, jd.a $$2) {
      kb.b $$3 = this.b($$0);
      Map<amd<? extends jy<?>>, kb.j<?>> $$4 = new HashMap<>();
      this.a.stream().map($$1x -> $$1x.a($$3)).forEach($$1x -> $$4.put($$1x.a, $$1x));
      Set<amd<? extends jy<?>>> $$5 = $$0.b().collect(Collectors.toUnmodifiableSet());
      $$1.b().filter($$1x -> !$$5.contains($$1x)).forEach($$1x -> $$4.putIfAbsent($$1x, new kb.j($$1x, Lifecycle.stable(), Map.of())));
      Stream<jn.b<?>> $$6 = $$4.values().stream().map($$1x -> $$1x.a($$3.a));
      jn.a $$7 = a($$3.a, $$0, $$6);
      $$3.b();
      $$3.d();
      jn.a $$8 = this.a($$0, $$1, $$2, $$4, $$7);
      return new kb.g($$8, $$7);
   }

   record b(kb.m a, kb.l b, Map<ame, jm<?>> c, Map<amd<?>, kb.h<?>> d, List<RuntimeException> e) {

      public static kb.b a(jz $$0, Stream<amd<? extends jy<?>>> $$1) {
         kb.m $$2 = new kb.m();
         List<RuntimeException> $$3 = new ArrayList<>();
         kb.l $$4 = new kb.l($$2);
         Builder<ame, jm<?>> $$5 = ImmutableMap.builder();
         $$0.a().forEach($$1x -> $$5.put($$1x.a().a(), kb.a($$1x.b())));
         $$1.forEach($$2x -> $$5.put($$2x.a(), $$4));
         return new kb.b($$2, $$4, $$5.build(), new HashMap<>(), $$3);
      }

      public <T> qq<T> a() {
         return new qq<T>() {
            @Override
            public jl.c<T> a(amd<T> $$0, T $$1, Lifecycle $$2) {
               kb.h<?> $$3 = b.this.d.put($$0, new kb.h($$1, $$2));
               if ($$3 != null) {
                  b.this.e.add(new IllegalStateException("Duplicate registration for " + $$0 + ", new=" + $$1 + ", old=" + $$3.a));
               }

               return b.this.b.c($$0);
            }

            @Override
            public <S> jm<S> a(amd<? extends jy<? extends S>> $$0) {
               return (jm<S>)b.this.c.getOrDefault($$0.a(), b.this.b);
            }
         };
      }

      public void b() {
         this.d.forEach(($$0, $$1) -> this.e.add(new IllegalStateException("Orpaned value " + $$1.a + " for key " + $$0)));
      }

      public void c() {
         for (amd<Object> $$0 : this.b.a.keySet()) {
            this.e.add(new IllegalStateException("Unreferenced key: " + $$0));
         }
      }

      public void d() {
         if (!this.e.isEmpty()) {
            IllegalStateException $$0 = new IllegalStateException("Errors during registry creation");

            for (RuntimeException $$1 : this.e) {
               $$0.addSuppressed($$1);
            }

            throw $$0;
         }
      }

      public kb.m e() {
         return this.a;
      }

      public kb.l f() {
         return this.b;
      }

      public Map<ame, jm<?>> g() {
         return this.c;
      }

      public Map<amd<?>, kb.h<?>> h() {
         return this.d;
      }

      public List<RuntimeException> i() {
         return this.e;
      }
   }

   abstract static class c<T> implements jm<T> {
      protected final jo<T> d;

      protected c(jo<T> $$0) {
         this.d = $$0;
      }

      @Override
      public Optional<jp.c<T>> a(bae<T> $$0) {
         return Optional.of(jp.a(this.d, $$0));
      }
   }

   static class d<T> extends kb.e<T> implements jn.b.a<T> {
      private final jn.b<T> a;

      d(jo<T> $$0, jn.b<T> $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      public jn.b<T> a() {
         return this.a;
      }
   }

   abstract static class e<T> extends kb.c<T> implements jn.b<T> {
      protected e(jo<T> $$0) {
         super($$0);
      }

      @Override
      public Stream<jp.c<T>> e() {
         throw new UnsupportedOperationException("Tags are not available in datagen");
      }
   }

   static class f<T> extends jl.c<T> {
      @Nullable
      Supplier<T> a;

      protected f(jo<T> $$0, @Nullable amd<T> $$1) {
         super(jl.c.a.a, $$0, $$1, null);
      }

      @Override
      protected void b(T $$0) {
         super.b($$0);
         this.a = null;
      }

      @Override
      public T a() {
         if (this.a != null) {
            this.b(this.a.get());
         }

         return super.a();
      }
   }

   public record g(jn.a a, jn.a b) {
   }

   record h<T>(T a, Lifecycle b) {
   }

   @FunctionalInterface
   public interface i<T> {
      void run(qq<T> var1);
   }

   record j<T>(amd<? extends jy<? extends T>> a, Lifecycle b, Map<amd<T>, kb.n<T>> c) {

      public jn.b<T> a(kb.m $$0) {
         Map<amd<T>, jl.c<T>> $$1 = this.c.entrySet().stream().collect(Collectors.toUnmodifiableMap(Entry::getKey, $$1x -> {
            kb.n<T> $$2 = (kb.n<T>)$$1x.getValue();
            jl.c<T> $$3 = $$2.b().orElseGet(() -> jl.c.a($$0.a(), (amd<T>)$$1x.getKey()));
            $$3.b($$2.a().a());
            return $$3;
         }));
         return kb.a(this.a, this.b, $$0.a(), $$1);
      }
   }

   record k<T>(amd<? extends jy<T>> a, Lifecycle b, kb.i<T> c) {
      void b(kb.b $$0) {
         this.c.run($$0.a());
      }

      public kb.j<T> a(kb.b $$0) {
         Map<amd<T>, kb.n<T>> $$1 = new HashMap<>();
         Iterator<Entry<amd<?>, kb.h<?>>> $$2 = $$0.d.entrySet().iterator();

         while ($$2.hasNext()) {
            Entry<amd<?>, kb.h<?>> $$3 = $$2.next();
            amd<?> $$4 = $$3.getKey();
            if ($$4.c(this.a)) {
               kb.h<T> $$6 = (kb.h<T>)$$3.getValue();
               jl.c<T> $$7 = (jl.c<T>)$$0.b.a.remove($$4);
               $$1.put((amd<T>)$$4, new kb.n<>($$6, Optional.ofNullable($$7)));
               $$2.remove();
            }
         }

         return new kb.j<>(this.a, this.b, $$1);
      }
   }

   static class l extends kb.c<Object> {
      final Map<amd<Object>, jl.c<Object>> a = new HashMap<>();

      public l(jo<Object> $$0) {
         super($$0);
      }

      @Override
      public Optional<jl.c<Object>> a(amd<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      <T> jl.c<T> c(amd<T> $$0) {
         return (jl.c<T>)this.a.computeIfAbsent($$0, $$0x -> jl.c.a(this.d, $$0x));
      }
   }

   static class m implements jo<Object> {
      public <T> jo<T> a() {
         return this;
      }
   }

   record n<T>(kb.h<T> a, Optional<jl.c<T>> b) {
   }
}
