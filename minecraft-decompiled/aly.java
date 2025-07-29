import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class aly<E> implements Codec<jp<E>> {
   private final amd<? extends jy<E>> a;
   private final Codec<jl<E>> b;
   private final Codec<List<jl<E>>> c;
   private final Codec<Either<bae<E>, List<jl<E>>>> d;

   private static <E> Codec<List<jl<E>>> a(Codec<jl<E>> $$0, boolean $$1) {
      Codec<List<jl<E>>> $$2 = $$0.listOf().validate(bbi.b(jl::f));
      return $$1 ? $$2 : bbi.c($$0, $$2);
   }

   public static <E> Codec<jp<E>> a(amd<? extends jy<E>> $$0, Codec<jl<E>> $$1, boolean $$2) {
      return new aly<>($$0, $$1, $$2);
   }

   private aly(amd<? extends jy<E>> $$0, Codec<jl<E>> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = a($$1, $$2);
      this.d = Codec.either(bae.b($$0), this.c);
   }

   public <T> DataResult<Pair<jp<E>, T>> decode(DynamicOps<T> $$0, T $$1) {
      if ($$0 instanceof amc<T> $$2) {
         Optional<jm<E>> $$3 = $$2.b(this.a);
         if ($$3.isPresent()) {
            jm<E> $$4 = $$3.get();
            return this.d.decode($$0, $$1).flatMap($$1x -> {
               DataResult<jp<E>> $$2x = (DataResult<jp<E>>)((Either)$$1x.getFirst()).map($$1xx -> a($$4, $$1xx), $$0xx -> DataResult.success(jp.a($$0xx)));
               return $$2x.map($$1xx -> Pair.of($$1xx, $$1x.getSecond()));
            });
         }
      }

      return this.a($$0, $$1);
   }

   private static <E> DataResult<jp<E>> a(jm<E> $$0, bae<E> $$1) {
      return $$0.a($$1)
         .<DataResult<jp<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error(() -> "Missing tag: '" + $$1.b() + "' in '" + $$1.a().a() + "'"));
   }

   public <T> DataResult<T> a(jp<E> $$0, DynamicOps<T> $$1, T $$2) {
      if ($$1 instanceof amc<T> $$3) {
         Optional<jo<E>> $$4 = $$3.a(this.a);
         if ($$4.isPresent()) {
            if (!$$0.a($$4.get())) {
               return DataResult.error(() -> "HolderSet " + $$0 + " is not valid in current registry set");
            }

            return this.d.encode($$0.d().mapRight(List::copyOf), $$1, $$2);
         }
      }

      return this.b($$0, $$1, $$2);
   }

   private <T> DataResult<Pair<jp<E>, T>> a(DynamicOps<T> $$0, T $$1) {
      return this.b.listOf().decode($$0, $$1).flatMap($$0x -> {
         List<jl.a<E>> $$1x = new ArrayList<>();

         for (jl<E> $$2 : (List)$$0x.getFirst()) {
            if (!($$2 instanceof jl.a<E> $$3)) {
               return DataResult.error(() -> "Can't decode element " + $$2 + " without registry");
            }

            $$1x.add($$3);
         }

         return DataResult.success(new Pair(jp.a($$1x), $$0x.getSecond()));
      });
   }

   private <T> DataResult<T> b(jp<E> $$0, DynamicOps<T> $$1, T $$2) {
      return this.c.encode($$0.a().toList(), $$1, $$2);
   }
}
