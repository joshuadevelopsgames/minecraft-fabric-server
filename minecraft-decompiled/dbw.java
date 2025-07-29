import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Function;

public record dbw<T>(Either<jl<T>, amd<T>> a) {
   public dbw(jl<T> $$0) {
      this(Either.left($$0));
   }

   public dbw(amd<T> $$0) {
      this(Either.right($$0));
   }

   public static <T> Codec<dbw<T>> a(amd<jy<T>> $$0, Codec<jl<T>> $$1) {
      return Codec.either($$1, amd.a($$0).comapFlatMap($$0x -> DataResult.error(() -> "Cannot parse as key without registry"), Function.identity()))
         .xmap(dbw::new, dbw::b);
   }

   public static <T> zm<wx, dbw<T>> a(amd<jy<T>> $$0, zm<wx, jl<T>> $$1) {
      return zm.a(zk.a($$1, amd.b($$0)), dbw::b, dbw::new);
   }

   public Optional<T> a(jy<T> $$0) {
      return (Optional<T>)this.a.map($$0x -> Optional.of($$0x.a()), $$0::f);
   }

   public Optional<jl<T>> a(jn.a $$0) {
      return (Optional<jl<T>>)this.a.map(Optional::of, $$1 -> $$0.c($$1).map($$0xx -> $$0xx));
   }

   public Optional<amd<T>> a() {
      return (Optional<amd<T>>)this.a.map(jl::e, Optional::of);
   }

   public Either<jl<T>, amd<T>> b() {
      return this.a;
   }
}
