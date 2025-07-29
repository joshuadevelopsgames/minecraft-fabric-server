import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record htk(htl d) {
   public static final htk a = new htk(htl.b);
   public static final Codec<htk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(htl.a.optionalFieldOf("scaling", htl.b).forGetter(htk::a)).apply($$0, htk::new)
   );
   public static final awo<htk> c = new awo<>("gui", b);

   public htl a() {
      return this.d;
   }
}
