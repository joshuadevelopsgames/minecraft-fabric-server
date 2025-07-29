import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record avx(cyd b) {
   private static final Codec<avx> c = RecordCodecBuilder.create($$0 -> $$0.group(cyf.f.fieldOf("enabled").forGetter(avx::a)).apply($$0, avx::new));
   public static final awo<avx> a = new awo<>("features", c);

   public cyd a() {
      return this.b;
   }
}
