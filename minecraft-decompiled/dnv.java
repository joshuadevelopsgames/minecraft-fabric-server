import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv {
   public static final Codec<dnv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ayy.b.fieldOf("sound").forGetter($$0x -> $$0x.c),
            Codec.INT.fieldOf("tick_delay").forGetter($$0x -> $$0x.d),
            Codec.INT.fieldOf("block_search_extent").forGetter($$0x -> $$0x.e),
            Codec.DOUBLE.fieldOf("offset").forGetter($$0x -> $$0x.f)
         )
         .apply($$0, dnv::new)
   );
   public static final dnv b = new dnv(ayz.h, 6000, 8, 2.0);
   private final jl<ayy> c;
   private final int d;
   private final int e;
   private final double f;

   public dnv(jl<ayy> $$0, int $$1, int $$2, double $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public jl<ayy> a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }
}
