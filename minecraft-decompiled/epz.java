import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record epz(int b, int c, int d, jl<euc> e) implements epm {
   public static final Codec<epz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.p.fieldOf("tries").orElse(128).forGetter(epz::a),
            bbi.o.fieldOf("xz_spread").orElse(7).forGetter(epz::b),
            bbi.o.fieldOf("y_spread").orElse(3).forGetter(epz::c),
            euc.b.fieldOf("feature").forGetter(epz::d)
         )
         .apply($$0, epz::new)
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

   public jl<euc> d() {
      return this.e;
   }
}
