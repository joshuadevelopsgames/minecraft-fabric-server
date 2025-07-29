import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dks(jp<dji> c, bwo d) implements dkq {
   public static final MapCodec<dks> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.a(mn.aW).fieldOf("enchantments").forGetter(dks::b), bwo.c.fieldOf("cost").forGetter(dks::c)).apply($$0, dks::new)
   );

   @Override
   public void a(dcv $$0, djo.a $$1, bck $$2, bxh $$3) {
      for (djl $$5 : djk.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dks> a() {
      return b;
   }

   public jp<dji> b() {
      return this.c;
   }

   public bwo c() {
      return this.d;
   }
}
