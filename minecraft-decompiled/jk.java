import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jk(amd<dmu> d, jb e) {
   public static final MapCodec<jk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmu.h.fieldOf("dimension").forGetter(jk::a), jb.a.fieldOf("pos").forGetter(jk::b)).apply($$0, jk::a)
   );
   public static final Codec<jk> b = a.codec();
   public static final zm<ByteBuf, jk> c = zm.a(amd.b(mn.bu), jk::a, jb.b, jk::b, jk::a);

   public static jk a(amd<dmu> $$0, jb $$1) {
      return new jk($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(amd<dmu> $$0, jb $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public amd<dmu> a() {
      return this.d;
   }

   public jb b() {
      return this.e;
   }
}
