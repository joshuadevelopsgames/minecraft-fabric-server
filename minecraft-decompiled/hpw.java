import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpw() implements hqg<dbo.a> {
   public static final Codec<dbo.a> a = dbo.a.d;
   public static final hqg.a<hpw, dbo.a> b = hqg.a.a(MapCodec.unit(new hpw()), a);

   public dbo.a a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      dez $$5 = $$0.a(kq.P);
      if ($$5 == null || $$5.b()) {
         return dbo.a.a;
      } else {
         return $$5.a(dcz.vW) ? dbo.a.c : dbo.a.b;
      }
   }

   @Override
   public hqg.a<hpw, dbo.a> a() {
      return b;
   }

   @Override
   public Codec<dbo.a> b() {
      return a;
   }
}
