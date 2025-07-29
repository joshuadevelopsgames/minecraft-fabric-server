import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hqh() implements hqg<amd<dli>> {
   public static final Codec<amd<dli>> a = amd.a(mn.bp);
   public static final hqg.a<hqh, amd<dli>> b = hqg.a.a(MapCodec.unit(new hqh()), a);

   @Nullable
   public amd<dli> a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      dlg $$5 = $$0.a(kq.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hqg.a<hqh, amd<dli>> a() {
      return b;
   }

   @Override
   public Codec<amd<dli>> b() {
      return a;
   }
}
