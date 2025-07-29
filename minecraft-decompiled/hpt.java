import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hpt(boolean b) implements hpq {
   public static final MapCodec<hpt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hpt::b)).apply($$0, hpt::new)
   );

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      if ($$2 != null && $$2.fI() == $$0) {
         return this.b ? $$2.fJ() : a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hpt> a() {
      return a;
   }

   public static int a(dcv $$0, cam $$1) {
      return $$0.a($$1) - $$1.fJ();
   }
}
