import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface jn<T> extends jm<T> {
   Stream<jl.c<T>> c();

   default Stream<amd<T>> d_() {
      return this.c().map(jl.c::h);
   }

   Stream<jp.c<T>> e();

   default Stream<bae<T>> f() {
      return this.e().map(jp.c::h);
   }

   public interface a extends jm.a {
      Stream<amd<? extends jy<?>>> b();

      default Stream<jn.b<?>> c() {
         return this.b().map(this::e);
      }

      @Override
      <T> Optional<? extends jn.b<T>> a(amd<? extends jy<? extends T>> var1);

      default <T> jn.b<T> e(amd<? extends jy<? extends T>> $$0) {
         return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + $$0.a() + " not found"));
      }

      default <V> amc<V> a(DynamicOps<V> $$0) {
         return amc.a((DynamicOps<T>)$$0, this);
      }

      static jn.a a(Stream<jn.b<?>> $$0) {
         final Map<amd<? extends jy<?>>, jn.b<?>> $$1 = $$0.collect(Collectors.toUnmodifiableMap(jn.b::g, $$0x -> $$0x));
         return new jn.a() {
            @Override
            public Stream<amd<? extends jy<?>>> b() {
               return $$1.keySet().stream();
            }

            @Override
            public <T> Optional<jn.b<T>> a(amd<? extends jy<? extends T>> $$0) {
               return Optional.ofNullable((jn.b<T>)$$1.get($$0));
            }
         };
      }

      default Lifecycle d() {
         return this.c().map(jn.b::h).reduce(Lifecycle.stable(), Lifecycle::add);
      }
   }

   public interface b<T> extends jn<T>, jo<T> {
      amd<? extends jy<? extends T>> g();

      Lifecycle h();

      default jn.b<T> a(cyd $$0) {
         return cya.bW.contains(this.g()) ? this.a($$1 -> ((cya)$$1).a($$0)) : this;
      }

      default jn.b<T> a(final Predicate<T> $$0) {
         return new jn.b.a<T>() {
            @Override
            public jn.b<T> a() {
               return b.this;
            }

            @Override
            public Optional<jl.c<T>> a(amd<T> $$0x) {
               return this.a().a($$0).filter($$1 -> $$0.test($$1.a()));
            }

            @Override
            public Stream<jl.c<T>> c() {
               return this.a().c().filter($$1 -> $$0.test($$1.a()));
            }
         };
      }

      public interface a<T> extends jn.b<T> {
         jn.b<T> a();

         @Override
         default amd<? extends jy<? extends T>> g() {
            return this.a().g();
         }

         @Override
         default Lifecycle h() {
            return this.a().h();
         }

         @Override
         default Optional<jl.c<T>> a(amd<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jl.c<T>> c() {
            return this.a().c();
         }

         @Override
         default Optional<jp.c<T>> a(bae<T> $$0) {
            return this.a().a($$0);
         }

         @Override
         default Stream<jp.c<T>> e() {
            return this.a().e();
         }
      }
   }
}
