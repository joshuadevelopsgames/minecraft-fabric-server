import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dku(jl<dji> c, bwo d) implements dkq {
   public static final MapCodec<dku> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dji.c.fieldOf("enchantment").forGetter(dku::b), bwo.c.fieldOf("level").forGetter(dku::c)).apply($$0, dku::new)
   );

   @Override
   public void a(dcv $$0, djo.a $$1, bck $$2, bxh $$3) {
      $$1.b(this.c, bcb.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dku> a() {
      return b;
   }

   public jl<dji> b() {
      return this.c;
   }

   public bwo c() {
      return this.d;
   }
}
