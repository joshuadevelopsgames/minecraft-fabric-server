import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqj(int b, int c, int d) implements epm {
   public static final Codec<eqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.p.fieldOf("spread_width").forGetter(eqj::a), bbi.p.fieldOf("spread_height").forGetter(eqj::b), bbi.p.fieldOf("max_height").forGetter(eqj::c)
         )
         .apply($$0, eqj::new)
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
}
