import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkt(jp<dji> d, int e, int f) implements dkq {
   public static final int b = 10000;
   public static final MapCodec<dkt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ka.a(mn.aW).fieldOf("enchantments").forGetter(dkt::b),
            bbi.a(1, 10000).fieldOf("min_cost").forGetter(dkt::c),
            bbi.a(0, 10000).fieldOf("max_cost_span").forGetter(dkt::d)
         )
         .apply($$0, dkt::new)
   );

   @Override
   public void a(dcv $$0, djo.a $$1, bck $$2, bxh $$3) {
      float $$4 = $$3.d();
      int $$5 = bcb.b($$2, this.e, this.e + (int)($$4 * this.f));

      for (djl $$7 : djk.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dkt> a() {
      return c;
   }

   public jp<dji> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
