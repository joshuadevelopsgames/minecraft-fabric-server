import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aro(arq b, Optional<asd> c) {
   public static final Codec<aro> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arq.b.forGetter(aro::a), asd.a.optionalFieldOf("action").forGetter(aro::b)).apply($$0, aro::new)
   );

   public arq a() {
      return this.b;
   }

   public Optional<asd> b() {
      return this.c;
   }
}
