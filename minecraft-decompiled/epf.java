import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epf implements epm {
   public static final Codec<epf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bwo.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bwo.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, epf::new)
   );
   private final bwo b;
   private final bwo c;

   public epf(bwo $$0, bwo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bwo a() {
      return this.b;
   }

   public bwo b() {
      return this.c;
   }
}
