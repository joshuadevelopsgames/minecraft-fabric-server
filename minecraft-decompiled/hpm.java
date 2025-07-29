import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hpm(int b) implements hpq {
   public static final MapCodec<hpm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.o.optionalFieldOf("index", 0).forGetter(hpm::b)).apply($$0, hpm::new));

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      dfe $$4 = $$0.a(kq.p);
      if ($$4 != null) {
         Float $$5 = $$4.a(this.b);
         if ($$5 != null) {
            return $$5;
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<hpm> a() {
      return a;
   }
}
