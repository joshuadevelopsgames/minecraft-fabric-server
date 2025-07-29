import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface jy<T> extends Keyable, jn.b<T>, jq<T> {
   @Override
   amd<? extends jy<T>> g();

   default Codec<T> q() {
      return this.b().flatComapMap(jl.c::a, $$0 -> this.a(this.e((T)$$0)));
   }

   default Codec<jl<T>> r() {
      return this.b().flatComapMap($$0 -> $$0, this::a);
   }

   private Codec<jl.c<T>> b() {
      Codec<jl.c<T>> $$0 = ame.a
         .comapFlatMap(
            $$0x -> this.c($$0x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + this.g() + ": " + $$0x)),
            $$0x -> $$0x.h().a()
         );
      return bbi.a($$0, (Function<jl.c<T>, Lifecycle>)($$0x -> this.d($$0x.h()).map(jx::b).orElse(Lifecycle.experimental())));
   }

   private DataResult<jl.c<T>> a(jl<T> $$0) {
      return $$0 instanceof jl.c<T> $$1 ? DataResult.success($$1) : DataResult.error(() -> "Unregistered holder in " + this.g() + ": " + $$0);
   }

   default <U> Stream<U> keys(DynamicOps<U> $$0) {
      return this.i().stream().map($$1 -> (U)$$0.createString($$1.toString()));
   }

   @Nullable
   ame b(T var1);

   Optional<amd<T>> d(T var1);

   @Override
   int a(@Nullable T var1);

   @Nullable
   T c(@Nullable amd<T> var1);

   @Nullable
   T a(@Nullable ame var1);

   Optional<jx> d(amd<T> var1);

   default Optional<T> b(@Nullable ame $$0) {
      return Optional.ofNullable(this.a($$0));
   }

   default Optional<T> f(@Nullable amd<T> $$0) {
      return Optional.ofNullable(this.c($$0));
   }

   Optional<jl.c<T>> a();

   default T g(amd<T> $$0) {
      T $$1 = this.c($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Missing key in " + this.g() + ": " + $$0);
      } else {
         return $$1;
      }
   }

   Set<ame> i();

   Set<Entry<amd<T>, T>> k();

   Set<amd<T>> j();

   Optional<jl.c<T>> a(bck var1);

   default Stream<T> s() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   boolean d(ame var1);

   boolean e(amd<T> var1);

   static <T> T a(jy<? super T> $$0, String $$1, T $$2) {
      return a($$0, ame.a($$1), $$2);
   }

   static <V, T extends V> T a(jy<V> $$0, ame $$1, T $$2) {
      return a($$0, amd.a($$0.g(), $$1), $$2);
   }

   static <V, T extends V> T a(jy<V> $$0, amd<V> $$1, T $$2) {
      ((kh)$$0).a($$1, (V)$$2, jx.a);
      return $$2;
   }

   static <T> jl.c<T> b(jy<T> $$0, amd<T> $$1, T $$2) {
      return ((kh)$$0).a($$1, $$2, jx.a);
   }

   static <T> jl.c<T> b(jy<T> $$0, ame $$1, T $$2) {
      return b($$0, amd.a($$0.g(), $$1), $$2);
   }

   jy<T> n();

   jl.c<T> f(T var1);

   Optional<jl.c<T>> c(int var1);

   Optional<jl.c<T>> c(ame var1);

   jl<T> e(T var1);

   default Iterable<jl<T>> c(bae<T> $$0) {
      return (Iterable<jl<T>>)DataFixUtils.orElse(this.a($$0), List.of());
   }

   default Optional<jl<T>> a(bae<T> $$0, bck $$1) {
      return this.a($$0).flatMap($$1x -> $$1x.a($$1));
   }

   Stream<jp.c<T>> l();

   default jq<jl<T>> t() {
      return new jq<jl<T>>() {
         public int a(jl<T> $$0) {
            return jy.this.a($$0.a());
         }

         @Nullable
         public jl<T> c(int $$0) {
            return (jl<T>)jy.this.c($$0).orElse(null);
         }

         @Override
         public int d() {
            return jy.this.d();
         }

         @Override
         public Iterator<jl<T>> iterator() {
            return jy.this.c().map($$0 -> (jl<T>)$$0).iterator();
         }
      };
   }

   jy.a<T> a(baf.c<T> var1);

   public interface a<T> {
      amd<? extends jy<? extends T>> a();

      jn.b<T> c();

      void d();

      int b();
   }
}
