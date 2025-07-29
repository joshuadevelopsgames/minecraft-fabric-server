import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class bcg implements jm.a {
   final jn.a a;
   final bcg.a b = new bcg.a();
   final Map<amd<Object>, jl.c<Object>> c = new HashMap<>();
   final Map<bae<Object>, jp.c<Object>> d = new HashMap<>();

   public bcg(jn.a $$0) {
      this.a = $$0;
   }

   @Override
   public <T> Optional<? extends jm<T>> a(amd<? extends jy<? extends T>> $$0) {
      return Optional.of(this.b.a());
   }

   public <V> amc<V> a(DynamicOps<V> $$0) {
      return amc.a($$0, new amc.c() {
         @Override
         public <T> Optional<amc.b<T>> a(amd<? extends jy<? extends T>> $$0) {
            return bcg.this.a.a($$0).map(amc.b::a).or(() -> Optional.of(new amc.b<>(bcg.this.b.b(), bcg.this.b.a(), Lifecycle.experimental())));
         }
      });
   }

   public bcl a() {
      return new bcl() {
         @Override
         public <T> DataResult<T> a(Codec<T> $$0, T $$1, jn.a $$2) {
            return $$0.encodeStart(bcg.this.a(JavaOps.INSTANCE), $$1).flatMap($$2x -> $$0.parse($$2.a(JavaOps.INSTANCE), $$2x));
         }
      };
   }

   public boolean b() {
      return !this.c.isEmpty() || !this.d.isEmpty();
   }

   class a implements jm<Object>, jo<Object> {
      @Override
      public Optional<jl.c<Object>> a(amd<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jl.c<Object> b(amd<Object> $$0) {
         return this.c($$0);
      }

      private jl.c<Object> c(amd<Object> $$0) {
         return bcg.this.c.computeIfAbsent($$0, $$0x -> jl.c.a(this, $$0x));
      }

      @Override
      public Optional<jp.c<Object>> a(bae<Object> $$0) {
         return Optional.of(this.c($$0));
      }

      @Override
      public jp.c<Object> b(bae<Object> $$0) {
         return this.c($$0);
      }

      private jp.c<Object> c(bae<Object> $$0) {
         return bcg.this.d.computeIfAbsent($$0, $$0x -> jp.a(this, $$0x));
      }

      public <T> jm<T> a() {
         return this;
      }

      public <T> jo<T> b() {
         return this;
      }
   }
}
