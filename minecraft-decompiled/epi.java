import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epi(erv b, elh c, bwo d, int e) implements epm {
   public static final Codec<epi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            erv.a.fieldOf("state_provider").forGetter(epi::a),
            elh.b.fieldOf("target").forGetter(epi::b),
            bwo.b(0, 8).fieldOf("radius").forGetter(epi::c),
            Codec.intRange(0, 4).fieldOf("half_height").forGetter(epi::d)
         )
         .apply($$0, epi::new)
   );

   public erv a() {
      return this.b;
   }

   public elh b() {
      return this.c;
   }

   public bwo c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
