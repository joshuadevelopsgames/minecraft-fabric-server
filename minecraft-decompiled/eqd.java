import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqd(int b, int c, int d, int e, int f, bwo g, float h) implements epm {
   public static final Codec<eqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.intRange(1, 32).fieldOf("charge_count").forGetter(eqd::a),
            Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(eqd::b),
            Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(eqd::c),
            Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(eqd::d),
            Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(eqd::f),
            bwo.c.fieldOf("extra_rare_growths").forGetter(eqd::g),
            Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(eqd::h)
         )
         .apply($$0, eqd::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
