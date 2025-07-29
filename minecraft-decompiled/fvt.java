import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvt(int b) implements fvq {
   public static final MapCodec<fvt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("default").forGetter(fvt::b)).apply($$0, fvt::new));

   public fvt() {
      this(-13083194);
   }

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      der $$3 = $$0.a(kq.R);
      return $$3 != null ? baj.f($$3.a(this.b)) : baj.f(this.b);
   }

   @Override
   public MapCodec<fvt> a() {
      return a;
   }
}
