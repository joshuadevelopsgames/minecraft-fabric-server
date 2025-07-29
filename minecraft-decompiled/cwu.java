import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwu<T>(T a, jc b) {
   public cwu(T $$0, ame $$1) {
      this($$0, new jc($$1));
   }

   public static <T> MapCodec<cwu<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(cwu::a), jc.b.forGetter(cwu::b)).apply($$2, cwu::new));
   }

   public static <T> zm<wx, cwu<T>> a(zm<? super wx, T> $$0) {
      return zm.a($$0, cwu::a, jc.c, cwu::b, cwu::new);
   }
}
