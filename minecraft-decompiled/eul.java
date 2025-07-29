import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eul extends eue {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eul::new)
   );
   private final int c;

   private eul(int $$0) {
      this.c = $$0;
   }

   public static eul a(int $$0) {
      return new eul($$0);
   }

   @Override
   protected boolean a(eud $$0, bck $$1, jb $$2) {
      int $$3 = $$0.a(eka.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(eka.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eug<?> b() {
      return eug.d;
   }
}
