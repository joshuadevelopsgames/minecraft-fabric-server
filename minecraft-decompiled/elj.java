import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class elj implements elh {
   protected final List<elh> e;

   protected elj(List<elh> $$0) {
      this.e = $$0;
   }

   public static <T extends elj> MapCodec<T> a(Function<List<elh>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(elh.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
