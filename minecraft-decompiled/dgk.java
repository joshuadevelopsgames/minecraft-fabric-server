import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgk(jl<ayy> c) implements dgj {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.b.fieldOf("sound").forGetter(dgk::b)).apply($$0, dgk::new));
   public static final zm<wx, dgk> b = zm.a(ayy.d, dgk::b, dgk::new);

   @Override
   public dgj.a<dgk> a() {
      return dgj.a.e;
   }

   @Override
   public boolean a(dmu $$0, dcv $$1, cam $$2) {
      $$0.a(null, $$2.dx(), this.c.a(), $$2.do(), 1.0F, 1.0F);
      return true;
   }

   public jl<ayy> b() {
      return this.c;
   }
}
