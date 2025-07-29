import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hsb(String c, String d) implements hrx {
   public static final MapCodec<hsb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hsb::b), Codec.STRING.fieldOf("prefix").forGetter(hsb::c)).apply($$0, hsb::new)
   );

   @Override
   public void a(axo $$0, hrx.a $$1) {
      alx $$2 = new alx("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ame $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hsb> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
