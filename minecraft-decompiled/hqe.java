import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hqe() implements hqg<cad> {
   public static final Codec<cad> a = cad.c;
   public static final hqg.a<hqe, cad> b = hqg.a.a(MapCodec.unit(new hqe()), a);

   @Nullable
   public cad a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$2 == null ? null : $$2.fF();
   }

   @Override
   public hqg.a<hqe, cad> a() {
      return b;
   }

   @Override
   public Codec<cad> b() {
      return a;
   }
}
