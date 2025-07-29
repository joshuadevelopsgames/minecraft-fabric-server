import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface gzp {
   Codec<gzp> a = Codec.recursive("condition", $$0 -> {
      Codec<gzo> $$1 = Codec.simpleMap(gzo.a.c, $$0.listOf(), bda.a(gzo.a.values())).codec().comapFlatMap($$0x -> {
         if ($$0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry<gzo.a, List<gzp>> $$1x = (Entry<gzo.a, List<gzp>>)$$0x.entrySet().iterator().next();
            return DataResult.success(new gzo($$1x.getKey(), $$1x.getValue()));
         }
      }, $$0x -> Map.of($$0x.a(), $$0x.b()));
      return Codec.either($$1, gzq.b).flatComapMap($$0x -> (gzp)$$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), $$0x -> {
         return switch ($$0x) {
            case gzo $$3 -> DataResult.success(Either.left($$3));
            case gzq $$4 -> DataResult.success(Either.right($$4));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      });
   });

   <O, S extends eed<O, S>> Predicate<S> instantiate(eec<O, S> var1);
}
