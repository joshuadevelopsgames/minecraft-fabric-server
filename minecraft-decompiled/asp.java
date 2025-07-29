import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asp(xo c, boolean d, String e, String f) implements asq {
   public static final MapCodec<asp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            xq.a.fieldOf("label").forGetter(asp::b),
            Codec.BOOL.optionalFieldOf("initial", false).forGetter(asp::c),
            Codec.STRING.optionalFieldOf("on_true", "true").forGetter(asp::d),
            Codec.STRING.optionalFieldOf("on_false", "false").forGetter(asp::e)
         )
         .apply($$0, asp::new)
   );

   @Override
   public MapCodec<asp> a() {
      return a;
   }

   public xo b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public String e() {
      return this.f;
   }
}
