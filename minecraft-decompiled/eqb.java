import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqb implements epm {
   public static final Codec<eqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            eeb.a.fieldOf("target").forGetter($$0x -> $$0x.b),
            eeb.a.fieldOf("state").forGetter($$0x -> $$0x.c),
            bwo.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
         )
         .apply($$0, eqb::new)
   );
   public final eeb b;
   public final eeb c;
   private final bwo d;

   public eqb(eeb $$0, eeb $$1, bwo $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bwo a() {
      return this.d;
   }
}
