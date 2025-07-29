import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asn(xo f, int g) implements ask {
   public static final int c = 200;
   public static final MapCodec<asn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(xq.a.fieldOf("contents").forGetter(asn::b), art.b.optionalFieldOf("width", 200).forGetter(asn::c)).apply($$0, asn::new)
   );
   public static final Codec<asn> e = Codec.withAlternative(d.codec(), xq.a, $$0 -> new asn($$0, 200));

   @Override
   public MapCodec<asn> a() {
      return d;
   }

   public xo b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
