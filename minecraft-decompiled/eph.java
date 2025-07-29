import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eph implements epm {
   public static final Codec<eph> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            eeb.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
            eeb.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
            bwo.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
            bwo.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, eph::new)
   );
   private final eeb b;
   private final eeb c;
   private final bwo d;
   private final bwo e;

   public eph(eeb $$0, eeb $$1, bwo $$2, bwo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public eeb a() {
      return this.b;
   }

   public eeb b() {
      return this.c;
   }

   public bwo c() {
      return this.d;
   }

   public bwo d() {
      return this.e;
   }
}
