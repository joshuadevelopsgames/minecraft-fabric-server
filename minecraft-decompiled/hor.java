import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hor(kz.a<?> b) implements hot {
   public static final MapCodec<hor> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kz.a("predicate").forGetter(hor::b)).apply($$0, hor::new));

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hor> a() {
      return a;
   }
}
