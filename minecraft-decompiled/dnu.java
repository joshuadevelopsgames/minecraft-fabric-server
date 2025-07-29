import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnu {
   public static final Codec<dnu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, dnu::new)
   );
   private final jl<ayy> b;
   private final double c;

   public dnu(jl<ayy> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public jl<ayy> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
