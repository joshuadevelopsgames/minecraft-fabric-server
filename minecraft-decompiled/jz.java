import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface jz extends jn.a {
   Logger a = LogUtils.getLogger();
   jz.b b = new jz.c(Map.of()).e();

   @Override
   <E> Optional<jy<E>> a(amd<? extends jy<? extends E>> var1);

   default <E> jy<E> f(amd<? extends jy<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<jz.d<?>> a();

   @Override
   default Stream<amd<? extends jy<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static jz.b a(final jy<? extends jy<?>> $$0) {
      return new jz.b() {
         @Override
         public <T> Optional<jy<T>> a(amd<? extends jy<? extends T>> $$0x) {
            jy<jy<T>> $$1 = (jy<jy<T>>)$$0;
            return $$1.f((amd<jy<T>>)$$0);
         }

         @Override
         public Stream<jz.d<?>> a() {
            return $$0.k().stream().map(jz.d::a);
         }

         @Override
         public jz.b e() {
            return this;
         }
      };
   }

   default jz.b e() {
      class a extends jz.c implements jz.b {
         protected a(final Stream<jz.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(jz.d::c));
   }

   public interface b extends jz {
   }

   public static class c implements jz {
      private final Map<? extends amd<? extends jy<?>>, ? extends jy<?>> c;

      public c(List<? extends jy<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(jy::g, $$0x -> $$0x));
      }

      public c(Map<? extends amd<? extends jy<?>>, ? extends jy<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<jz.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(jz.d::a, jz.d::b));
      }

      @Override
      public <E> Optional<jy<E>> a(amd<? extends jy<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<jz.d<?>> a() {
         return this.c.entrySet().stream().map(jz.d::a);
      }
   }

   public record d<T>(amd<? extends jy<T>> a, jy<T> b) {

      private static <T, R extends jy<? extends T>> jz.d<T> a(Entry<? extends amd<? extends jy<?>>, R> $$0) {
         return a((amd<? extends jy<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> jz.d<T> a(amd<? extends jy<?>> $$0, jy<?> $$1) {
         return new jz.d<>((amd<? extends jy<T>>)$$0, (jy<T>)$$1);
      }

      private jz.d<T> c() {
         return new jz.d<>(this.a, this.b.n());
      }
   }
}
