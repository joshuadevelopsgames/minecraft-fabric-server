import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record arq(xo c, Optional<xo> d, int e) {
   public static final int a = 150;
   public static final MapCodec<arq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            xq.a.fieldOf("label").forGetter(arq::a), xq.a.optionalFieldOf("tooltip").forGetter(arq::b), art.b.optionalFieldOf("width", 150).forGetter(arq::c)
         )
         .apply($$0, arq::new)
   );

   public arq(xo $$0, int $$1) {
      this($$0, Optional.empty(), $$1);
   }

   public xo a() {
      return this.c;
   }

   public Optional<xo> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
