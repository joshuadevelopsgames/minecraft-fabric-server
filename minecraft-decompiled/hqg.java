import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface hqg<T> {
   @Nullable
   T b(dcv var1, @Nullable grk var2, @Nullable cam var3, int var4, dct var5);

   Codec<T> b();

   hqg.a<? extends hqg<T>, T> a();

   public record a<P extends hqg<T>, T>(MapCodec<hol.d<P, T>> a) {
      public static <P extends hqg<T>, T> hqg.a<P, T> a(MapCodec<P> $$0, Codec<T> $$1) {
         MapCodec<hol.d<P, T>> $$2 = RecordCodecBuilder.mapCodec(
            $$2x -> $$2x.group($$0.forGetter(hol.d::a), a($$1).forGetter(hol.d::b)).apply($$2x, hol.d::new)
         );
         return new hqg.a<>($$2);
      }

      public static <T> MapCodec<List<hol.b<T>>> a(Codec<T> $$0) {
         return hol.b.a($$0).listOf().validate(hqg.a::a).fieldOf("cases");
      }

      private static <T> DataResult<List<hol.b<T>>> a(List<hol.b<T>> $$0) {
         if ($$0.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
         } else {
            Multiset<T> $$1 = HashMultiset.create();

            for (hol.b<T> $$2 : $$0) {
               $$1.addAll($$2.a());
            }

            return $$1.size() != $$1.entrySet().size()
               ? DataResult.error(
                  () -> "Duplicate case conditions: "
                     + $$1.entrySet()
                        .stream()
                        .filter($$0xx -> $$0xx.getCount() > 1)
                        .map($$0xx -> $$0xx.getElement().toString())
                        .collect(Collectors.joining(", "))
               )
               : DataResult.success($$0);
         }
      }
   }
}
