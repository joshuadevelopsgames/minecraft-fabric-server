import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class euk extends eue {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            eka.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c),
            Codec.INT.optionalFieldOf("min_inclusive", Integer.MIN_VALUE).forGetter($$0x -> $$0x.d),
            Codec.INT.optionalFieldOf("max_inclusive", Integer.MAX_VALUE).forGetter($$0x -> $$0x.e)
         )
         .apply($$0, euk::new)
   );
   private final eka.a c;
   private final int d;
   private final int e;

   private euk(eka.a $$0, int $$1, int $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static euk a(eka.a $$0, int $$1, int $$2) {
      return new euk($$0, $$1, $$2);
   }

   @Override
   protected boolean a(eud $$0, bck $$1, jb $$2) {
      long $$3 = $$0.a(this.c, $$2.u(), $$2.w());
      long $$4 = $$3 + this.d;
      long $$5 = $$3 + this.e;
      return $$4 <= $$2.v() && $$2.v() <= $$5;
   }

   @Override
   public eug<?> b() {
      return eug.c;
   }
}
