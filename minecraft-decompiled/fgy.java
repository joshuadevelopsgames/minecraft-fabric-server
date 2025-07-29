import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fgy(float b, djp c, jl<dji> g) implements fgs {
   public static final MapCodec<fgy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fgy::c),
            djp.b.fieldOf("enchanted_chance").forGetter(fgy::d),
            dji.c.fieldOf("enchantment").forGetter(fgy::e)
         )
         .apply($$0, fgy::new)
   );

   @Override
   public fgt b() {
      return fgu.e;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.d);
   }

   public boolean a(fdj $$0) {
      bzm $$1 = $$0.c(fgd.d);
      int $$3 = $$1 instanceof cam $$2 ? djk.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fgs.a a(jn.a $$0, float $$1, float $$2) {
      jn.b<dji> $$3 = $$0.e(mn.aW);
      return () -> new fgy($$1, new djp.e($$1 + $$2, $$2), $$3.b(djn.s));
   }

   public float c() {
      return this.b;
   }

   public djp d() {
      return this.c;
   }

   public jl<dji> e() {
      return this.g;
   }
}
