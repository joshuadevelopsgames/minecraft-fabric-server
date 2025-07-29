import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hpn(boolean b) implements hpq {
   public static final MapCodec<hpn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hpn::b)).apply($$0, hpn::new)
   );

   @Override
   public float a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3) {
      float $$4 = $$0.o();
      float $$5 = $$0.p();
      return this.b ? bcb.a($$4 / $$5, 0.0F, 1.0F) : bcb.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hpn> a() {
      return a;
   }
}
