import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvn(int b) implements fvq {
   public static final MapCodec<fvn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("default").forGetter(fvn::b)).apply($$0, fvn::new));

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      return dfi.a($$0, this.b);
   }

   @Override
   public MapCodec<fvn> a() {
      return a;
   }
}
