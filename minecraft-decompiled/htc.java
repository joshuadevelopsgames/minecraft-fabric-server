import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record htc(String b, String c, boolean d) {
   public static final Codec<htc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.D.fieldOf("region").forGetter(htc::b),
            bbi.D.fieldOf("name").forGetter(htc::c),
            Codec.BOOL.optionalFieldOf("bidirectional", false).forGetter(htc::d)
         )
         .apply($$0, htc::new)
   );

   public xo a() {
      return xo.b(this.c + " (" + this.b + ")");
   }
}
