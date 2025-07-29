import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hoz() implements hot {
   public static final MapCodec<hoz> a = MapCodec.unit(new hoz());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$2 instanceof gwi $$5 && $$5.cn.g() == $$0;
   }

   @Override
   public MapCodec<hoz> a() {
      return a;
   }
}
