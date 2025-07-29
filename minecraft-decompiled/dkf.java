import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkf(jl<ayy> d, bwm e, bwm f) implements djz {
   public static final MapCodec<dkf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ayy.b.fieldOf("sound").forGetter(dkf::b),
            bwm.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dkf::c),
            bwm.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dkf::d)
         )
         .apply($$0, dkf::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      bck $$5 = $$3.ec();
      if (!$$3.be()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.do(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public jl<ayy> b() {
      return this.d;
   }

   public bwm c() {
      return this.e;
   }

   public bwm d() {
      return this.f;
   }
}
