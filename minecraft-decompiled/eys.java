import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eys extends eyu {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeb.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
         .apply($$0, eys::new)
   );
   private final eeb b;
   private final float d;

   public eys(eeb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eyv<?> a() {
      return eyv.f;
   }
}
