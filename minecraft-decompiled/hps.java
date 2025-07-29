import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hps(float b) implements hpq {
   public static final MapCodec<hps> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.r.optionalFieldOf("period", 1.0F).forGetter(hps::b)).apply($$0, hps::new)
   );

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      return $$2 != null && $$2.fI() == $$0 ? $$2.fJ() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hps> a() {
      return a;
   }
}
