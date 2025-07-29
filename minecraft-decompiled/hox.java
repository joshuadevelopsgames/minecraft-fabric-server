import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hox() implements hot {
   public static final MapCodec<hox> a = MapCodec.unit(new hox());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      if ($$2 instanceof cut $$5 && $$5.cG != null) {
         cad $$6 = hel.a($$5);
         return $$2.a($$6) == $$0;
      } else {
         return false;
      }
   }

   @Override
   public MapCodec<hox> a() {
      return a;
   }
}
