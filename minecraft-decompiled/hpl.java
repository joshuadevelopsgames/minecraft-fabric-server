import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hpl implements hpq {
   public static final MapCodec<hpl> a = MapCodec.unit(new hpl());

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      if ($$2 == null) {
         return 0.0F;
      } else if (dbo.g($$0)) {
         return 0.0F;
      } else {
         int $$4 = dbo.b($$0, $$2);
         return (float)hpt.a($$0, $$2) / $$4;
      }
   }

   @Override
   public MapCodec<hpl> a() {
      return a;
   }
}
