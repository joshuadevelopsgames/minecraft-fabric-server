import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvl(int b) implements fvq {
   public static final MapCodec<fvl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("value").forGetter(fvl::b)).apply($$0, fvl::new));

   public fvl(int b) {
      b = baj.f(b);
      this.b = b;
   }

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fvl> a() {
      return a;
   }
}
