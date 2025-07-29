import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpj() implements hpq {
   public static final MapCodec<hpj> a = MapCodec.unit(new hpj());

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      return $$2 instanceof cut $$4 ? $$4.gP().a($$0, 0.0F) : 0.0F;
   }

   @Override
   public MapCodec<hpj> a() {
      return a;
   }
}
