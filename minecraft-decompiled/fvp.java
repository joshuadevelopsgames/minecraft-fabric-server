import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fvp(float b, float c) implements fvq {
   public static final MapCodec<fvp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fvp::b), bbi.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fvp::c))
         .apply($$0, fvp::new)
   );

   public fvp() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      return dms.a(this.b, this.c);
   }

   @Override
   public MapCodec<fvp> a() {
      return a;
   }
}
