import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkl(djp c) implements dkb {
   public static final MapCodec<dkl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("value").forGetter(dkl::b)).apply($$0, dkl::new));

   @Override
   public float a(int $$0, bck $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public djp b() {
      return this.c;
   }
}
