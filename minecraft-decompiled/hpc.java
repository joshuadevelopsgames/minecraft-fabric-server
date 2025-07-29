import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpc() implements hot {
   public static final MapCodec<hpc> a = MapCodec.unit(new hpc());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$2 == null ? false : $$2.fG() && $$2.fI() == $$0;
   }

   @Override
   public MapCodec<hpc> a() {
      return a;
   }
}
