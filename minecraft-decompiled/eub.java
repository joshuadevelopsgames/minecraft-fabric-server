import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eub extends euj {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.DOUBLE.fieldOf("noise_level").forGetter($$0x -> $$0x.c),
            Codec.INT.fieldOf("below_noise").forGetter($$0x -> $$0x.d),
            Codec.INT.fieldOf("above_noise").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, eub::new)
   );
   private final double c;
   private final int d;
   private final int e;

   private eub(double $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static eub a(double $$0, int $$1, int $$2) {
      return new eub($$0, $$1, $$2);
   }

   @Override
   protected int a(bck $$0, jb $$1) {
      double $$2 = dnx.e.a($$1.u() / 200.0, $$1.w() / 200.0, false);
      return $$2 < this.c ? this.d : this.e;
   }

   @Override
   public eug<?> b() {
      return eug.h;
   }
}
