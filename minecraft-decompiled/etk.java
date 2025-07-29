import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class etk extends etf {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvt.b(etf.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, etk::new)
   );
   private final bvt<etf> b;

   public etk(bvt<etf> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(bck $$0, ekx $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public etg<?> a() {
      return etg.f;
   }
}
