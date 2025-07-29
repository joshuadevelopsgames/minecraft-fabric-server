import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum gba implements bda {
   a("bitmap", gax.a.a),
   b("ttf", gbc.a),
   c("space", fls.a.a),
   d("unihex", gbd.b.a),
   e("reference", gbb.a);

   public static final Codec<gba> f = bda.a(gba::values);
   private final String g;
   private final MapCodec<? extends gaz> h;

   private gba(final String $$0, final MapCodec<? extends gaz> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends gaz> a() {
      return this.h;
   }
}
