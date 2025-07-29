import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpg() implements hpq {
   public static final MapCodec<hpg> a = MapCodec.unit(new hpg());

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      return dbk.c($$0);
   }

   @Override
   public MapCodec<hpg> a() {
      return a;
   }
}
