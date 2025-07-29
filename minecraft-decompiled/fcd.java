import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcd(jb b, int c, int d) {
   public static final Codec<fcd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.a.fieldOf("pos").forGetter(fcd::b), Codec.INT.fieldOf("rotation").forGetter(fcd::c), Codec.INT.fieldOf("entity_id").forGetter(fcd::d))
         .apply($$0, fcd::new)
   );

   public String a() {
      return a(this.b);
   }

   public static String a(jb $$0) {
      return "frame-" + $$0.u() + "," + $$0.v() + "," + $$0.w();
   }
}
