import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eyr extends eyu {
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eyr::new)
   );
   private final dpz b;
   private final float d;

   public eyr(dpz $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eeb $$0, bck $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eyv<?> a() {
      return eyv.e;
   }
}
