import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fhl(float c) implements fho {
   public static final MapCodec<fhl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter(fhl::c)).apply($$0, fhl::new));
   public static final Codec<fhl> b = Codec.FLOAT.xmap(fhl::new, fhl::c);

   @Override
   public fhn b() {
      return fhp.b;
   }

   @Override
   public float b(fdj $$0) {
      return this.c;
   }

   public static fhl a(float $$0) {
      return new fhl($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Float.compare(((fhl)$$0).c, this.c) == 0 : false;
      }
   }

   @Override
   public int hashCode() {
      return this.c != 0.0F ? Float.floatToIntBits(this.c) : 0;
   }
}
