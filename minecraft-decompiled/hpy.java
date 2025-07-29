import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpy() implements hqg<amd<dmu>> {
   public static final Codec<amd<dmu>> a = amd.a(mn.bu);
   public static final hqg.a<hpy, amd<dmu>> b = hqg.a.a(MapCodec.unit(new hpy()), a);

   @Nullable
   public amd<dmu> a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hqg.a<hpy, amd<dmu>> a() {
      return b;
   }

   @Override
   public Codec<amd<dmu>> b() {
      return a;
   }
}
