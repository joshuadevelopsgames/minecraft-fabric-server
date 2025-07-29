import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elz extends epw {
   public static final MapCodec<elz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
            etf.c.fieldOf("y").forGetter($$0x -> $$0x.e),
            bwm.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
            eku.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
            ema.b.optionalFieldOf("debug_settings", ema.a).forGetter($$0x -> $$0x.h),
            ka.a(mn.i).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
         )
         .apply($$0, elz::new)
   );
   public final etf e;
   public final bwm f;
   public final eku g;
   public final ema h;
   public final jp<dpz> i;

   public elz(float $$0, etf $$1, bwm $$2, eku $$3, ema $$4, jp<dpz> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
