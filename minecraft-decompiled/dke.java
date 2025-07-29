import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dke(djp c) implements dkb {
   public static final MapCodec<dke> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("factor").forGetter(dke::b)).apply($$0, dke::new));

   @Override
   public float a(int $$0, bck $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public djp b() {
      return this.c;
   }
}
