import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hpz() implements hqg<amd<bzv<?>>> {
   public static final Codec<amd<bzv<?>>> a = amd.a(mn.D);
   public static final hqg.a<hpz, amd<bzv<?>>> b = hqg.a.a(MapCodec.unit(new hpz()), a);

   @Nullable
   public amd<bzv<?>> a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      return $$2 == null ? null : $$2.ap().r().h();
   }

   @Override
   public hqg.a<hpz, amd<bzv<?>>> a() {
      return b;
   }

   @Override
   public Codec<amd<bzv<?>>> b() {
      return a;
   }
}
