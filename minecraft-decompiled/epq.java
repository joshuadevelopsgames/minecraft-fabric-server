import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epq implements epm {
   public static final Codec<epq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ehy.c).fieldOf("height").forGetter($$0x -> $$0x.b), eeb.a.fieldOf("state").forGetter($$0x -> $$0x.c))
         .apply($$0, epq::new)
   );
   public final int b;
   public final eeb c;

   public epq(int $$0, eeb $$1) {
      this.b = $$0;
      this.c = $$1;
   }
}
