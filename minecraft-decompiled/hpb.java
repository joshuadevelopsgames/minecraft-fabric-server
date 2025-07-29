import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpb() implements hot {
   public static final MapCodec<hpb> a = MapCodec.unit(new hpb());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$2 instanceof gwi $$5 && $$5.gs().g() == $$0;
   }

   @Override
   public MapCodec<hpb> a() {
      return a;
   }
}
