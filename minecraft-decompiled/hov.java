import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hov() implements hot {
   public static final MapCodec<hov> a = MapCodec.unit(new hov());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hov> a() {
      return a;
   }
}
