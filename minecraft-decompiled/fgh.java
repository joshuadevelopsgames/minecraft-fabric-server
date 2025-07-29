import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fgh(jl<dji> b, List<Float> c) implements fgs {
   public static final MapCodec<fgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dji.c.fieldOf("enchantment").forGetter(fgh::c), bbi.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fgh::d)).apply($$0, fgh::new)
   );

   @Override
   public fgt b() {
      return fgu.k;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.i);
   }

   public boolean a(fdj $$0) {
      dcv $$1 = $$0.c(fgd.i);
      int $$2 = $$1 != null ? djk.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fgs.a a(jl<dji> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fgh($$0, $$2);
   }

   public jl<dji> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
