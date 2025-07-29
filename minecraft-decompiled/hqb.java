import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hqb() implements hqg<dct> {
   public static final Codec<dct> a = dct.j;
   public static final hqg.a<hqb, dct> b = hqg.a.a(MapCodec.unit(new hqb()), a);

   public dct a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$4;
   }

   @Override
   public hqg.a<hqb, dct> a() {
      return b;
   }

   @Override
   public Codec<dct> b() {
      return a;
   }
}
