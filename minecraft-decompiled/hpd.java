import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpd() implements hot {
   public static final MapCodec<hpd> a = MapCodec.unit(new hpd());

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      fue $$5 = fue.R();
      bzm $$6 = $$5.ap();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hpd> a() {
      return a;
   }
}
