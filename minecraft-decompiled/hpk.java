import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hpk(boolean b) implements hpq {
   public static final MapCodec<hpk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hpk::b)).apply($$0, hpk::new)
   );

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      float $$4 = $$0.M();
      float $$5 = $$0.k();
      return this.b ? bcb.a($$4 / $$5, 0.0F, 1.0F) : bcb.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hpk> a() {
      return a;
   }
}
