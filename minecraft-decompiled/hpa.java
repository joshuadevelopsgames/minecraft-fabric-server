import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hpa(fuc b) implements hot {
   private static final Codec<fuc> c = Codec.STRING.comapFlatMap($$0 -> {
      fuc $$1 = fuc.b($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "Invalid keybind: " + $$0);
   }, fuc::h);
   public static final MapCodec<hpa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.fieldOf("keybind").forGetter(hpa::b)).apply($$0, hpa::new));

   @Override
   public boolean get(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return this.b.e();
   }

   @Override
   public MapCodec<hpa> a() {
      return a;
   }
}
