import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hop() implements hot {
   public static final MapCodec<hop> a = MapCodec.unit(new hop());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hop> a() {
      return a;
   }
}
