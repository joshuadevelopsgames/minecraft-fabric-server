import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djw(djp d, djp e, jl<byd> f) implements djz {
   public static final MapCodec<djw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            djp.b.fieldOf("min_damage").forGetter(djw::b), djp.b.fieldOf("max_damage").forGetter(djw::c), byd.b.fieldOf("damage_type").forGetter(djw::d)
         )
         .apply($$0, djw::new)
   );

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      float $$5 = bcb.b($$3.ec(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new byb(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djp b() {
      return this.d;
   }

   public djp c() {
      return this.e;
   }

   public jl<byd> d() {
      return this.f;
   }
}
