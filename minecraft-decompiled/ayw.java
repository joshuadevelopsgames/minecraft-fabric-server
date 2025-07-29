import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ayw(jl<ayy> b, int c, int d, boolean e) {
   public static final Codec<ayw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ayy.b.fieldOf("sound").forGetter($$0x -> $$0x.b),
            Codec.INT.fieldOf("min_delay").forGetter($$0x -> $$0x.c),
            Codec.INT.fieldOf("max_delay").forGetter($$0x -> $$0x.d),
            Codec.BOOL.fieldOf("replace_current_music").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, ayw::new)
   );

   public jl<ayy> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }
}
