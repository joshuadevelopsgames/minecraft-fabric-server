import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvs(int b) implements fvq {
   public static final MapCodec<fvs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("default").forGetter(fvs::b)).apply($$0, fvs::new));

   public fvs() {
      this(dfr.c.a());
   }

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      dfr $$3 = $$0.a(kq.L);
      return $$3 != null ? baj.f($$3.a()) : baj.f(this.b);
   }

   @Override
   public MapCodec<fvs> a() {
      return a;
   }
}
