import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hoy(kp<?> b, boolean c) implements hot {
   public static final MapCodec<hoy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.am.q().fieldOf("component").forGetter(hoy::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hoy::c))
         .apply($$0, hoy::new)
   );

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return this.c ? $$0.d(this.b) : $$0.c(this.b);
   }

   @Override
   public MapCodec<hoy> a() {
      return a;
   }
}
