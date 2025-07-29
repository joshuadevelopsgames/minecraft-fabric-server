import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djs(djp c) implements dkb {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("value").forGetter(djs::b)).apply($$0, djs::new));

   @Override
   public float a(int $$0, bck $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djp b() {
      return this.c;
   }
}
