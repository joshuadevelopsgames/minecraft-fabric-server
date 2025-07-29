import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esz(jl<dcr> c, etb d) {
   public static final Codec<esz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcr.e.fieldOf("display").forGetter($$0x -> $$0x.c), etb.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, esz::new)
   );
   public static final Codec<jl<esz>> b = ama.a(mn.aX, a);

   public jl<dcr> a() {
      return this.c;
   }

   public etb b() {
      return this.d;
   }
}
